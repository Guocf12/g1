package com.briup.apps.sms.web.controller;

public class UserController {private long id;
private String realname;
private String telephone;
private String student_no;
private String gender ;
private long clazz_id;
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getRealname() {
	return realname;
}
public void setRealname(String realname) {
	this.realname = realname;
}
public String getTelephone() {
	return telephone;
}
public void setTelephone(String telephone) {
	this.telephone = telephone;
}
public String getStudent_no() {
	return student_no;
}
public void setStudent_no(String student_no) {
	this.student_no = student_no;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public long getClazz_id() {
	return clazz_id;
}
public void setClazz_id(long clazz_id) {
	this.clazz_id = clazz_id;
}


}
