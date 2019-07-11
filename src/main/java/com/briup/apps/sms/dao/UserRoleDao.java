package com.briup.apps.sms.dao;

import java.util.List;


import com.briup.apps.sms.bean.UserRole;

public interface UserRoleDao {
	//查询所有
	List<UserRole> selectAll();
	
	
	//插入
	void insert(UserRole userRole);
	
		
	 //更新
	void update(UserRole userRole);
   
	
	// 通过ID删除
	void deleteById(long id);
	
	
}
