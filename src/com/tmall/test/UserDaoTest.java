package com.tmall.test;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.tmall.dao.UserDao;
import com.tmall.entity.User;

public class UserDaoTest extends JUnitBase{

	@Autowired
	private UserDao userDao;
	@Test
	public void getTest() {
		User user = userDao.getById(1);
		System.out.println(user.toString());
		//fail("Not yet implemented");
	}
	
	@Test
	public void getCountTest(){
		int count = userDao.getCount();
		System.out.println("count:" + count);
	}
	
	@Test
	public void addTest(){
		User user = new User();
		user.setName("cyh");
		user.setPassword("123456");
		userDao.add(user);
	}
	
	@Test
	public void updateTest(){
		User user = userDao.getById(1);
		user.setName("scy");
		user.setPassword("54321");
		userDao.update(user);
	}
	
	@Test
	public void deleteTest(){
		userDao.delete(2);
	}
	
	@Test 
	public void listTest(){
		List<User> users = userDao.list(0, 2);
		for (User user : users) {
			System.out.println(user.getId() + ":" + user.getName());
		}
	}
	
	@Test
	public void listAllTest(){
		List<User> users = userDao.listAll();
		for (User user : users) {
			System.out.println(user.getId() + ":" + user.getName());
		}
	}

}
