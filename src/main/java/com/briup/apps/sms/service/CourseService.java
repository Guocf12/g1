package com.briup.apps.sms.service;

import java.util.List;

import com.briup.apps.sms.bean.Course;
import com.briup.apps.sms.bean.CourseExtend;

public interface CourseService {
	List<Course> selectAll();
	
	
	List<CourseExtend> selectAllWithTeacher();
	
	void saveOrUpdate(Course course) throws Exception;
	void deleteById(long id) throws Exception;
}
