package com.logintest.user.service.impl;

import java.util.List;

import com.logintest.user.bean.User;
import com.logintest.user.dao.UserDao;
import com.logintest.user.service.UserService;

public class UserServiceImpl implements UserService {
	UserDao userDao;
	
	
	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void register(User u) {
		// TODO Auto-generated method stub
		userDao.insert(u);
	}

	@Override
	public boolean checkuser(User u) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
