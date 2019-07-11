package com.briup.apps.sms.dao;

import java.util.List;

import com.briup.apps.sms.bean.User;

public  interface UserDao {
	//查询所有
   List<User>selectAll();
   //插入
   void insert(User user);
   //更新
   void update(User user);
	//通过ID删除
   void deleteById(long id);
}
