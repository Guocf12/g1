package com.briup.apps.sms.service;

import java.util.List;

import com.briup.apps.sms.bean.Course;

public interface CourseService {
	List<Course> selectAll();
	void saveOrUpdate(Course course) throws Exception;
}
