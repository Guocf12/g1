package com.briup.apps.sms.web.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.apps.sms.bean.UserRole;
import com.briup.apps.sms.service.UserRoleService;

@RestController
@RequestMapping("/userRole")

public class UserRoleController {
	
	@Autowired
	private UserRoleService userRoleService;
	
	
	//http://localhost:8080/userRole/selectAll
	
@GetMapping("selectAll")

public List<UserRole> selectAll(){
	return userRoleService.selectAll();
	
	}
@PostMapping("saveOrUpdate")
public String saveOrUpdate( UserRole  userRole) {
	try {
		 userRoleService.saveOrUpdate( userRole);
		return "保存或更新成功";
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		return e.getMessage();
	}
}
//http://localhost:8080/school/deleteById?id=3
	@GetMapping("deleteById")
	public String deleteById(long id) {
		try {
			userRoleService.deleteById(id);
			return "删除成功";
		} catch (Exception e) {
			// 打印异常信息，返回异常信息
			e.printStackTrace();
			return e.getMessage();
		}
	}


}
