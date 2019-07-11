package com.briup.apps.sms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.briup.apps.sms.bean.Role;
import com.briup.apps.sms.dao.RoleDao;
import com.briup.apps.sms.service.RoleService;

/**
 * 校园逻辑逻辑处理的实现类
 * */
@Service
public class RoleServiceimpl implements RoleService {
	// 依赖注入，实例化RoleDao并且赋值给roleDao这个变量
	@Resource
	private RoleDao roleDao;

	@Override
	public List<Role> selectAll() {
		// TODO Auto-generated method stub
		return roleDao.selectAll();
	}

	@Override
	public void saveOrUpdate(Role role) throws Exception {
		if(role.getId()==null) {
			roleDao.insert(role);
		}else {
			roleDao.update(role);
		}
	}
	@Override
	public void deleteById(long id) throws Exception {
		roleDao.deleteById(id);
	}

	
}



	 
