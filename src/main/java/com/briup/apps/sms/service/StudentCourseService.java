package com.briup.apps.sms.service;

import java.util.List;

import com.briup.apps.sms.bean.StudentCourse;

public interface StudentCourseService {
	
	List<StudentCourse> selectAll();
	
	void saveOrUpdate(StudentCourse studentCourse) throws Exception;
	
	void deleteById(long id) throws Exception;
	
	
	

}
