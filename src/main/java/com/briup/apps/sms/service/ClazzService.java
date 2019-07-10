package com.briup.apps.sms.service;

import java.util.List;

import com.briup.apps.sms.bean.Clazz;

public interface ClazzService {
	List<Clazz> selectAll();
	void saveOrUpdate(Clazz clazz) throws Exception;
}
