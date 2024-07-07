package com.sonvu.bakery.model.category;

import java.io.Serializable;

public class CategoryDTO implements Serializable {
	
	private static final long serialVersionUID = 200319952;	
	
	private int categoryId;
	private int numOfCategory;
	private String name;
	
	public CategoryDTO()
	{
	}
	
	public CategoryDTO(int categoryId, String name)
	{
		this.categoryId = categoryId;
		this.name = name;
	}
	
	public CategoryDTO(int categoryId, int numOfCategory, String name)
	{
		this.categoryId = categoryId;
		this.numOfCategory = numOfCategory;
		this.name = name;
	}
	
	public int getCategoryId()
	{
		return this.categoryId;
	}
	
	public void setCategoryId(int categoryId)
	{
		this.categoryId = categoryId;
	}
	
	public int getNumOfCategory()
	{
		return this.numOfCategory;
	}
	
	public void setNumofCategory(int numOfCategory)
	{
		this.numOfCategory = numOfCategory;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
}
