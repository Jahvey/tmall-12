/**
 * 
 */
package com.tmall.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.tmall.entity.Category;

/**
 * @author cai
 *
 */
public interface CategoryDao {
	public int getCount();
	public void add(Category category);
	public void update(Category category);
	public void delete(int id);
	public Category get(int id);
	public List<Category> list(@Param("start")int start , @Param("count")int count);
}
