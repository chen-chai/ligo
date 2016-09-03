package com.ligo.user.dao;

import com.ligo.user.po.User;
import com.huajin.baymax.db.CrudDao;
import com.huajin.baymax.db.annotation.MyBatisDao;
import java.util.Map;
import java.util.List;

/**
 * 
 * User
 * @author auto-generator
 * 2016-09-03 47:17:49
 */
@MyBatisDao
public interface UserDao extends CrudDao<User>{
	public int insert(User o);
	
	public int update(User o);
	
	public void delete(Map<String, Object> map);
	
	public User getById(Map<String, Object> map);
	
	public List<User> select(Map<String, Object> map);
}
