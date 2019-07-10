package com.briup.apps.sms.service;

import java.util.List;

import com.briup.apps.sms.bean.User;

public interface UserService {
	List<User> selectAll();
	void saveOrUpdate(User user) throws Exception;
}
