package com.briup.apps.sms.service;

import java.util.List;

import com.briup.apps.sms.bean.StudentCource;

public interface StudentCourceService {
	
	List<StudentCource> selectAll();
	
	void saveOrUpdate(StudentCource studentCource) throws Exception;
	
	
	

}
