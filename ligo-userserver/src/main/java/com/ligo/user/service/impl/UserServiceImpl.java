package com.ligo.user.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.dubbo.common.utils.CollectionUtils;
import com.ligo.common.db.UserDB;
import com.ligo.common.encrypt.IrreversibEncrypt;
import com.ligo.common.enums.ErrorCode;
import com.ligo.common.exception.ErrorCodeException;
import com.ligo.common.service.user.UserService;
import com.ligo.common.util.GUIDGenerator;
import com.ligo.common.vo.UserVo;
import com.ligo.user.service.datasupport.UserDataSupport;

/**
 * 用户服务
 * @author zhiya.chai
 * 2016年9月3日 下午6:33:44
 */
@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDataSupport userDataSupport;

	/**
	 * 根据条件查询用户
	 */
	@Override
	public List<UserVo> getUserList(Map<String, Object> map) {
		return userDataSupport.getUserList(map);
	}

	@Override
	public UserVo loginByPwd(UserVo vo) {
		if(StringUtils.isBlank(vo.getLoginName()) && StringUtils.isBlank(vo.getPhoneNo())) {
			throw new ErrorCodeException(ErrorCode.SYS_EMPTY_PARAMETER);
		}
		if(StringUtils.isBlank(vo.getPassword())) {
			throw new ErrorCodeException(ErrorCode.SYS_EMPTY_PARAMETER);
		}
		//获取登录用户
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("loginName", vo.getLoginName());
		map.put("phoneNo", vo.getPhoneNo());
		List<UserVo> list = userDataSupport.getUserList(map);
		if(CollectionUtils.isEmpty(list)) {
			throw new ErrorCodeException(ErrorCode.USER_NOT_EXIST);
		}
		UserVo loginVo = list.get(0);
		//验证用户
		String loginPwd = IrreversibEncrypt.MD5Encrypt(loginVo.getSalt() + vo.getPassword());
		if(!loginVo.getPassword().equals(loginPwd)){
			throw new ErrorCodeException(ErrorCode.USER_LOGIN_FAIL);
		}
		return loginVo;
	}

	@Override
	public UserVo register(UserDB user) {
		//验证用户信息
		validUser(user);
		user.setUserGuid(GUIDGenerator.getGUID());
		//设置用户密码
		String salt = GUIDGenerator.getGUID();
		String password = salt + user.getPassword();
		user.setPassword(IrreversibEncrypt.MD5Encrypt(password));
		//插入数据库
		Integer id = userDataSupport.insertUser(user);
		if(id <= 0) {
			throw new ErrorCodeException(ErrorCode.USER_REGISTER_FAIL);
		}
		return userDataSupport.getUserById(id.intValue());
	}

	private void validUser(UserDB user) {
		
	}

	@Override
	public UserVo loginByVerifyCode(String phoneNo, String verifyCode) {
		return null;
	}
	
}
