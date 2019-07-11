package com.briup.apps.sms.dao;

import java.util.List;

import com.briup.apps.sms.bean.Role;

public interface RoleDao {
	//查询所有
    List<Role>  selectAll();
    //插入
    void insert (Role role);
    //更新
    void update (Role role);
    //通过ID删除
    void deleteById(long id);
}
