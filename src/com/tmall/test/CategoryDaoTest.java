package com.tmall.test;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.tmall.dao.CategoryDao;
import com.tmall.entity.Category;

public class CategoryDaoTest extends JUnitBase{
	@Autowired
	private CategoryDao categoryDao;
	@Test
	public void getTest() {
		Category category = categoryDao.get(1);
		System.out.println(category.toString());
		//fail("Not yet implemented");
	}
	
	@Test
	public void getCountTest(){
		int count = categoryDao.getCount();
		System.out.println("count:" + count);
	}
	
	@Test
	public void addTest(){
		Category category = new Category();
		category.setName("马桶");
		categoryDao.add(category);
	}
	
	@Test
	public void updateTest(){
		Category category = categoryDao.get(1);
		category.setName("沙发");
		categoryDao.update(category);
	}
	
	@Test
	public void deleteTest(){
		categoryDao.delete(2);
	}
	
	@Test 
	public void listTest(){
		List<Category> categories = categoryDao.list(0, 2);
		for (Category category : categories) {
			System.out.println(category.getId() + ":" + category.getName());
		}
	}

}
