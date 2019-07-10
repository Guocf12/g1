package com.briup.apps.sms.dao;

import java.util.List;

import com.briup.apps.sms.bean.StudentCource;

public interface StudentCourceDao {
	List<StudentCource> selectAll();
	//插入
	void insert(StudentCource studentCource);
	//更新
	void update(StudentCource studentCource);

}
