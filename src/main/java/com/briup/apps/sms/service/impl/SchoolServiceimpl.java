package com.briup.apps.sms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.briup.apps.sms.bean.School;
import com.briup.apps.sms.dao.SchoolDao;
import com.briup.apps.sms.service.SchoolService;

/**
*校园逻辑逻辑处理的实现类
**/

@Service
public class SchoolServiceimpl implements SchoolService{
  //依赖注入，实例化UseDao并且赋值给UserDao这个变量
	@Resource
	private SchoolDao schoolDao;

	@Override
	public List<School> selectAll() {
		// TODO Auto-generated method stub
		return schoolDao.selectAll();
	}

	@Override
	public void saveOrUpdate(School school) throws Exception {
		if(school.getId()==null) {
			schoolDao.insert(school);
			}else {
				schoolDao.update(school);
			}
		}
		
   
   
	}
