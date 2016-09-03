package com.ligo.user.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ligo.common.service.user.UserService;
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
	

}
