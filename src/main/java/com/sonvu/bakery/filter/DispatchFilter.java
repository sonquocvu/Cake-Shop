package com.sonvu.bakery.filter;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.RequestDispatcher;

import java.io.IOException;
import java.util.Properties;

//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;

public class DispatchFilter implements Filter
{
	//private static final Logger logger = LogManager.getLogger(DispatchFilter.class);
	private FilterConfig filterConfig = null;
	
	public DispatchFilter()
	{
		//logger.trace("Construct the Dispatcher object");
	}
	
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain)
	{
		HttpServletRequest request = (HttpServletRequest) servletRequest;
		String uri = request.getRequestURI();
		String url = null;
		//logger.info("The URI from the request: " + uri.toString());
		System.out.println("The request URI: " + uri);
		
		try
		{
			ServletContext context = request.getServletContext();
			Properties viewMap = (Properties) context.getAttribute("ViewMap");
			
			// Get view name
			int lastIndex = uri.lastIndexOf("/"); 			// Example: https://localhost.com:8080/home
			String viewName = uri.substring(lastIndex + 1); // --> gain "home"
			url = viewMap.getProperty(viewName);
			System.out.println("The request URL: " + url);
			
			if (url != null)
			{
				RequestDispatcher dispatcher = request.getRequestDispatcher(url);
				dispatcher.forward(servletRequest, servletResponse);
			}
			else
			{
				chain.doFilter(servletRequest, servletResponse);
			}
		}
		catch (ServletException ex)
		{
			//logger.info("Unable to trigger the filter for dispatcher due to ServletExeption - " + ex.getMessage());
		}
		catch (IOException ex)
		{
			//logger.info("Unable to trigger the filter for dispatcher due to IOException - " + ex.getMessage());
		}
	}
	
	public void init(FilterConfig filterConfig)
	{
		this.filterConfig = filterConfig;
		if (this.filterConfig != null)
		{
			//logger.info("Initialize DispatchFilter successfully");
		}
	}
	
	public void destroy()
	{
		// Do nothing
	}

}
