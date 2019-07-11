package com.briup.apps.sms.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.apps.sms.bean.StudentCourse;
import com.briup.apps.sms.service.StudentCourseService;

@RestController
@RequestMapping("/studentcourse")
public class StudentCourseController {
	@Autowired
	private StudentCourseService studentCourseService;
	

	@GetMapping("selectAll")
	public List<StudentCourse> selectAll(){
		return studentCourseService.selectAll();
	}
	@PostMapping("saveOrUpdate")
	public String saveOrUpdate(StudentCourse studentCourse) {
		try {
			studentCourseService.saveOrUpdate(studentCourse);
			return "保存或更新成功";
		}catch (Exception e){
			e.printStackTrace();
			return e.getMessage();
		}
		
	}
	@GetMapping("deleteById")
	public String deleteById(long id) {
		try {
			studentCourseService.deleteById(id);
			return "删除成功";
			
		}catch (Exception e) {
		e.printStackTrace();
		return e.getMessage();
		}
	}
	
}
