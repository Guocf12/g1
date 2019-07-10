package com.briup.apps.sms.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.apps.sms.bean.User;
import com.briup.apps.sms.service.UserService;

@RestController
@RequestMapping("/user")

public class UserController {


	@Autowired
	private UserService userService;
	//http://localhost:8080/user/selectAll
@GetMapping("selectAll")
public List<User> selectAll(){
	return userService.selectAll();
	
}

}
