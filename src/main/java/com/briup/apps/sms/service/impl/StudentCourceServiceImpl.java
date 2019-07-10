package com.briup.apps.sms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.briup.apps.sms.bean.StudentCource;
import com.briup.apps.sms.dao.StudentCourceDao;
import com.briup.apps.sms.service.StudentCourceService;
    @Service
public class StudentCourceServiceImpl implements StudentCourceService {
    	
	@Resource
	private StudentCourceDao studentCourceDao;

	@Override
	public List<StudentCource> selectAll() {
		// TODO Auto-generated method stub
		return studentCourceDao.selectAll();
	}

	@Override
	public void saveOrUpdate(StudentCource studentCource) throws Exception {
		if(StudentCource.getId()==null) {
			studentCourceDao.insert(studentCource);
		}else {
			studentCourceDao.update(studentCource);
		}
		
	}

}
