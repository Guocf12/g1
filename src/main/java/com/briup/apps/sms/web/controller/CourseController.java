package com.briup.apps.sms.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.apps.sms.bean.Course;
import com.briup.apps.sms.service.CourseService;

@RestController
@RequestMapping("/course")

public class CourseController {


	@Autowired
	private CourseService courseService;
	//http://localhost:8080/course/selectAll
@GetMapping("selectAll")
public List<Course> selectAll(){
	return courseService.selectAll();
	
}

}
