package com.briup.apps.sms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.briup.apps.sms.bean.User;
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
	

	@Override
	public List<User> selectAll() {
		// TODO Auto-generated method stub
		return userDao.selectAll();
		
	
	}

	public void saveOrUpdate(User user) throws Exception {
	 

		if(user.getId()==null) {
			userDao.insert(user);
		} else {
			userDao.update(user);
		}
		
		
	}
	
   
   
}
