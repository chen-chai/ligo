package com.ligo.common.service.user;

import java.util.List;
import java.util.Map;

import com.ligo.common.vo.UserVo;

/**
 * 用户服务
 * @author zhiya.chai
 * 2016年9月3日 下午4:39:42
 */
public interface UserService {
	
	/**
	 * 根据条件查询用户信息
	 * @param map
	 * @return
	 * @return List<UserVo>
	 * @author zhiya.chai
	 * 2016年9月3日 下午6:40:05
	 */
	public List<UserVo> getUserList(Map<String,Object> map);
	
}
