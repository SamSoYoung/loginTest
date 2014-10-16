package com.logintest.user.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.*;

import com.logintest.user.bean.User;
import com.logintest.user.dao.UserDao;

public class UserDaoImpl implements UserDao {

	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void insert(User u) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Transaction tran = session.beginTransaction();
		session.persist(u);
		tran.commit();
		session.close();
	}

	@Override
	public void delete(User u) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Transaction tran = session.beginTransaction();
		session.delete(u);
		tran.commit();
		session.close();
	}
	
	@Override
	public void update(User u) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Transaction tran = session.beginTransaction();
		session.update(u);
		tran.commit();
		session.close();
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		List<User> list = new ArrayList<User>();
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from User");
		list=query.list();
		session.close();
		return list;
	}

	@Override
	public List findByName(String name) {
		// TODO Auto-generated method stub
		String hql = "from User where username =: name";
		Session session = sessionFactory.openSession();
		List<User> list = new ArrayList<User>();
		Query query = session.createQuery(hql);
		query.setString("username", name);
		list = query.list();
		session.close();
		return list;
	}

	//为完成，待修改
	@Override
	public boolean passwordcheck(String name,String pwd) {
		// TODO Auto-generated method stub
		String hql="select password from User where username =: name";
		Session session = sessionFactory.openSession();
		List<User> list = new ArrayList<User>()	;
		Query query = session.createQuery(hql);
		list = query.setString("username",name).list();
		
		return false;
	}

	

}
