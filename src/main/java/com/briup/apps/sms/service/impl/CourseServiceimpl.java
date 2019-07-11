package com.briup.apps.sms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.briup.apps.sms.bean.Course;
import com.briup.apps.sms.bean.CourseExtend;
import com.briup.apps.sms.dao.CourseDao;
import com.briup.apps.sms.service.CourseService;

/**
*课程逻辑逻辑处理的实现类
**/

@Service
public class CourseServiceimpl implements CourseService{
  //依赖注入，实例化CourseDao并且赋值给courseDao这个变量
	@Resource
	private CourseDao courseDao;//调用Dao层

	@Override
	public List<Course> selectAll() {
		// TODO Auto-generated method stub
		return courseDao.selectAll();
	}

	public void saveOrUpdate(Course course) throws Exception {
	 		if(course.getId()==null) {
			courseDao.insert(course);
		} else {
			courseDao.update(course);
		}
	 	}
	
			@Override
			public void deleteById(long id) throws Exception {
		    courseDao.deleteById(id);
			}

			@Override
			public List<CourseExtend> selectAllWithTeacher() {
				// TODO Auto-generated method stub
				return courseDao.selectAllWithTeacher();
			}
			
			
}
