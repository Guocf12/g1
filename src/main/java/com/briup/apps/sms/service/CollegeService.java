package com.briup.apps.sms.service;

import java.util.List;

import com.briup.apps.sms.bean.College;

public interface CollegeService {
  List<College> selectAll();
  void savaOrUpdate(College college) throws Exception;
  void deleteById(long id)throws Exception;
}
