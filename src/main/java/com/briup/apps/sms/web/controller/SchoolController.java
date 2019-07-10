package com.briup.apps.sms.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.apps.sms.bean.School;
import com.briup.apps.sms.service.SchoolService;

@RestController
@RequestMapping("/school")

public class SchoolController {
	
	@Autowired
	private SchoolService schoolService;
	
	//http://localhost:8080?school/selectAll	
	@GetMapping("selectAll")
	public List<School> selectAll(){
		return schoolService.selectAll();
	}
}
	
