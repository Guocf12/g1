package com.briup.apps.sms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.briup.apps.sms.bean.StudentCourse;
import com.briup.apps.sms.dao.StudentCourseDao;
import com.briup.apps.sms.service.StudentCourseService;
    @Service
public class StudentCourseServiceImpl implements StudentCourseService {
    	
	@Resource
	private StudentCourseDao studentCourseDao;

	@Override
	public List<StudentCourse> selectAll() {
		// TODO Auto-generated method stub
		return studentCourseDao.selectAll();
	}

	@Override
	public void saveOrUpdate(StudentCourse studentCourse) throws Exception {
		if(studentCourse.getId()==null) {
			studentCourseDao.insert(studentCourse);
		}else {
			studentCourseDao.update(studentCourse);
		}
		
	}

	@Override
	public void deleteById(long id) throws Exception {
		
		// TODO Auto-generated method stub
		studentCourseDao.deleteById(id);
	}

}
