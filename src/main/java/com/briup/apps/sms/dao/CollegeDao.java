package com.briup.apps.sms.dao;

import java.util.List;

import com.briup.apps.sms.bean.College;

public interface CollegeDao {
    List<College>  selectAll();
    //插入
    void insert (College college);
    //更新
    void update (College college);
    
}
