package com.tmall.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tmall.dao.UserDao;
import com.tmall.entity.User;
import com.tmall.service.IUserService;
@Service
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
		this.userDao.add(user);
	}

	@Override
	public void delete(int id) {
		this.userDao.delete(id);
	}

	@Override
	public User getById(int id) {
		return this.userDao.getById(id);
	}

	@Override
	public List<User> getByName(String name) {
		List<User> users = userDao.getByName(name);
		return users;
	}

	@Override
	public User get(String name, String password) {
		User user = userDao.get(name, password);
		
		return user;
	}

	@Override
	public void update(User user) {
		this.userDao.update(user);
	}

	@Override
	public int getCount() {
		return this.userDao.getCount();
	}

	@Override
	public List<User> listAll() {
		return this.userDao.listAll();
	}

	@Override
	public List<User> list(int start, int count) {
		return this.userDao.list(start, count);
	}

	@Override
	public boolean isExist(String name) {
		List<User> users = this.getByName(name);
		return !(0 == users.size());
	}

}
