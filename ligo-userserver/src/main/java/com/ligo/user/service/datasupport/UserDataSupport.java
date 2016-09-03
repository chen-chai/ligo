package com.ligo.user.service.datasupport;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ligo.common.vo.UserVo;
import com.ligo.user.dao.UserDao;

/**
 * 用户数据支持服务
 * @author zhiya.chai
 * 2016年9月3日 下午6:34:38
 */
@Service
public class UserDataSupport {

	@Autowired
	private UserDao userDao;
	/**
	 * 根据条件查询用户集合
	 * @param map
	 * @return
	 * @return List<UserVo>
	 * @author zhiya.chai
	 * 2016年9月3日 下午6:41:47
	 */
	public List<UserVo> getUserList(Map<String,Object> map) {
		return userDao.select(map);
	}
}
