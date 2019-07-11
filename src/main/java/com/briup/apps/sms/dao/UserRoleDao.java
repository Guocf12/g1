package com.briup.apps.sms.dao;

import java.util.List;


import com.briup.apps.sms.bean.UserRole;

public interface UserRoleDao {
	
	List<UserRole> selectAll();
	//查询所有
	void insert(UserRole userRole);
	//插入
	void update(UserRole userRole);
    //更新
	void deleteById(long id);
	// 通过ID删除
	
}
