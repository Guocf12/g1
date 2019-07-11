package com.briup.apps.sms.dao;

import java.util.List;

import com.briup.apps.sms.bean.Course;

public  interface CourseDao {
	//查询所有
   List<Course>selectAll();
   //插入
   void insert(Course course);
   //更新
   void update(Course course);
	//通过ID删除
   void deleteById(long id);
}
