package com.sonvu.bakery.model.category;

import com.sonvu.bakery.utils.DBConnection;
import com.sonvu.bakery.model.category.CategoryDTO;

import java.io.Serializable;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.List;
import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CategoryDAO implements Serializable {

	private static final long serialVersionUID = 200319953;
	private static final Logger logger = LogManager.getLogger(CategoryDAO.class);
	private List<CategoryDTO> listOfCategories;
	
	public CategoryDAO()
	{
		logger.info("Initialize the CategoryDAO");
		this.listOfCategories = null;
	}
	
	public List<CategoryDTO> getListOfCategories()
	{
		return this.listOfCategories;
	}
	
	public void loadAllCategories() throws SQLException
	{
		Connection connection = null;
		Statement statement = null;
		ResultSet results = null;
		
		try
		{
			connection = DBConnection.getConnection();
			if (connection != null)
			{
				String sql = "SELECT category_id, name, count_num\n"
						+ "FROM category_tbl";
				statement = connection.createStatement();
				results = statement.executeQuery(sql);
				
				while (results.next())
				{
					if (this.listOfCategories == null)
					{
						this.listOfCategories = new ArrayList<CategoryDTO>();
					}
					
					int id = results.getInt("category_id");
					int numOfCategory = results.getInt("count_num");
					String name = results.getString("name");
					
					CategoryDTO category = new CategoryDTO(id, numOfCategory, name);
					this.listOfCategories.add(category);						
				}
			}
		}
		finally
		{
			if (connection != null)
			{
				connection.close();
			}
			if (statement != null)
			{
				statement.close();
			}
			if (results != null)
			{
				results.close();
			}
		}
	}
}
