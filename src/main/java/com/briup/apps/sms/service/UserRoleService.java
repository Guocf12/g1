package com.briup.apps.sms.service;

import com.briup.apps.sms.bean.UserRole;

import java.util.List;

public interface UserRoleService {

	List<UserRole> selectAll();

	void saveOrUpdate(UserRole userRole) throws Exception;
	void deleteById(long id) throws Exception;

	
	
}