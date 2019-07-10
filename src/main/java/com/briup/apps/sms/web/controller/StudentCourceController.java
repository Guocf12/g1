package com.briup.apps.sms.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.apps.sms.bean.StudentCource;
import com.briup.apps.sms.service.StudentCourceService;

@RestController
@RequestMapping("/studentcource")
public class StudentCourceController {
	@Autowired
	private StudentCourceService studentCourceService;
	

	@GetMapping("selectAll")
	public List<StudentCource> selectAll(){
		return studentCourceService.selectAll();
	}
}
