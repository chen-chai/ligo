package com.ligo.user.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.ligo.common.db.UserDB;
import com.ligo.common.vo.UserVo;

/**
 * 
 * User
 * @author auto-generator
 * 2016-09-03 47:17:49
 */
@Repository
public interface UserDao {
	
	public int insert(UserDB o);
	
	public int update(UserDB o);
	
	public void delete(Map<String, Object> map);
	
	public UserVo getById(Map<String, Object> map);
	
	public List<UserVo> select(Map<String, Object> map);
}
