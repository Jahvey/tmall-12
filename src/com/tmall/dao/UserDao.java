package com.tmall.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.tmall.entity.User;

public interface UserDao {
	public void add(User user);
	public void delete(int id);
	public User getById(int id);
	public List<User> getByName(String name);
	public User get(@Param("name")String name,@Param("password")String password);
	public void update(User user);
	public int getCount();
	public List<User> listAll();
	public List<User> list(@Param("start")int start,@Param("count")int count);
}
