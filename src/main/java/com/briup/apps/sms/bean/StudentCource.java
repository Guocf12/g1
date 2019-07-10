package com.briup.apps.sms.bean;

public class StudentCource {
	private long id;
	private long user_id;
	private long course_id;
	private long xk_time;
	private long grade;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getUser_id() {
		return user_id;
	}
	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}
	public long getCourse_id() {
		return course_id;
	}
	public void setCourse_id(long course_id) {
		this.course_id = course_id;
	}
	public long getXk_time() {
		return xk_time;
	}
	public void setXk_time(long xk_time) {
		this.xk_time = xk_time;
	}
	public long getGrade() {
		return grade;
	}
	public void setGrade(long grade) {
		this.grade = grade;
	}
}
