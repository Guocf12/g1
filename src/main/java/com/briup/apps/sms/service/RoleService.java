package com.briup.apps.sms.service;
import java.util.List;

import com.briup.apps.sms.bean.Role;


public interface RoleService {

	List<Role> selectAll();

	void saveOrUpdate(Role role) throws Exception;
	void deleteByID(long id) throws Exception;
}

