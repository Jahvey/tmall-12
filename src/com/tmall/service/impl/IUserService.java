package com.tmall.service.impl;

import java.util.List;


import com.tmall.entity.User;

public interface IUserService {
	public void add(User user);
	public void delete(int id);
	public User getById(int id);
	public User getByName(String name);
	public User get(String name,String password);
	public void update(User user);
	public int getCount();
	public List<User> listAll();
	public List<User> list(int start,int count);
	public boolean isExist(String name);
}
