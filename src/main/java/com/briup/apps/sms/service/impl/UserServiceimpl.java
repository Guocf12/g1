package com.briup.apps.sms.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.briup.apps.sms.dao.UserDao;
import com.briup.apps.sms.service.UserService;

/**
*校园逻辑逻辑处理的实现类
**/

@Service
public class UserServiceimpl implements UserService{
  //依赖注入，实例化UseDao并且赋值给UserDao这个变量
	@Resource
	private UserDao userDao;
	
   
   
}
