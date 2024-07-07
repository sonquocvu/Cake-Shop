package com.sonvu.bakery.controller;

import com.sonvu.bakery.model.category.CategoryDTO;
import com.sonvu.bakery.model.category.CategoryDAO;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



@WebServlet(name = "LoadHomePageController", urlPatterns = {"/LoadHomePageController"})
public class LoadHomePageController extends HttpServlet {
	
	private static final long serialVersionUID = 200319951;	
	private static final Logger logger = LogManager.getLogger(LoadHomePageController.class);

	protected void handleRequest(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException
	{
		response.setContentType("text/html;charset=UTF-8");
		HttpSession session = request.getSession();
		
		try
		{
			logger.info("Handle request for LoadHomePageController");
			CategoryDAO categoryModel = new CategoryDAO();
			categoryModel.loadAllCategories();
			List<CategoryDTO> categories = categoryModel.getListOfCategories();
			session.setAttribute("ALL_CATEGORY", categories);
		}
		catch (SQLException e)
		{
			logger.info(e.getMessage());
		}
		finally
		{
			logger.info("Handle request for LoadHomePageController successfully");
		}
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException
	{
		handleRequest(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException
	{
		handleRequest(request, response);
	}
	
	@Override
	public String getServletInfo()
	{
		return "The LoadHomePageController is to provide the essential parts for home page";
	}
}
