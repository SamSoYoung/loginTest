package com.logintest.user.dao;

import java.util.List;

import com.logintest.user.bean.User;

public interface UserDao {
	public void  insert(User u);
	
	public void delete(User u);
	
	public void update(User u);
	
	public boolean passwordcheck(String name,String pwd);
	
	public List<User> findAll();
	
	public List findByName(String name);
}
