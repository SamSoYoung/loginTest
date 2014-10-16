package com.logintest.user.service;

import java.util.List;

import com.logintest.user.bean.User;

public interface UserService {
	public void register(User u);
	public boolean checkuser(User u);
	public List<User> findAll();
} 
