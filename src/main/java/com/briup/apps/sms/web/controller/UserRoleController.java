package com.briup.apps.sms.web.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
}
