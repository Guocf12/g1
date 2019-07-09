package com.briup.apps.sms.web.controller;
/**
 * 
 * @author 蔡
 *
 */
public class SchoolController {
	private Long id;
	private String name;
	private String description;
	private Long tel;
	private String address;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Long getTel() {
		return tel;
	}
	public void setTel(Long tel) {
		this.tel = tel;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
