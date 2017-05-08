package com.tmall.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.tmall.dao.UserDao;
import com.tmall.entity.User;

public class UserService implements IUserService{
	
	@Autowired
	private UserDao userDao;
	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getByName(String name) {
		User user = userDao.getByName(name);
		return user;
	}

	@Override
	public User get(String name, String password) {
		User user = userDao.get(name, password);
		
		return user;
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<User> listAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> list(int start, int count) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isExist(String name) {
		User user = this.getByName(name);
		return !(null == user);
	}

}
