package com.logintest.user.action;

import com.logintest.user.bean.User;
import com.logintest.user.service.UserService;
import com.logintest.user.service.impl.UserServiceImpl;
import com.opensymphony.xwork2.ActionSupport;


public class RegisterAction extends ActionSupport {
	private String name;
	private String psw;
	private String sex;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPsw() {
		return psw;
	}

	public void setPsw(String psw) {
		this.psw = psw;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String execute(){
	
		User user = new User();
		user.setUsername(name);
		user.setUserpassword(psw);
		user.setSex(sex);
		System.out.println("name="+user.getUsername()+" ------  password="+user.getUserpassword());
	
		UserService us = new UserServiceImpl();
		us.register(user);
		
		return SUCCESS;
	}

}
