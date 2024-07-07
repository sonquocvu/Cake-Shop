package com.sonvu.bakery.listener;

import java.io.IOException;
import java.util.Properties;

import com.sonvu.bakery.utils.Helper;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Application Lifecycle Listener implementation class BakeryShopListener
 *
 */
@WebListener
public class PropertiesConfigListener implements ServletContextListener {
	
	private final static Logger logger = LogManager.getLogger(PropertiesConfigListener.class);
	
	@Override
	public void contextInitialized(ServletContextEvent event)
	{
		try
		{
			ServletContext context = event.getServletContext();
			
			// Get initialized parameters from web.xml
			String viewMapPath = context.getInitParameter("ViewFilePath");
			String authenMapPath = context.getInitParameter("AuthenticationFilePath");
			
			Properties viewMapProperties = Helper.getProperties(viewMapPath);		
			Properties authenMapProperties = Helper.getProperties(authenMapPath);
			
			// Set attribute to context to serve user
			context.setAttribute("ViewMap", viewMapProperties);
			context.setAttribute("AuthenMap", authenMapProperties);
			
			logger.info("Initialize PropertiesConfigListener successuflly");
		}
		catch (IOException e)
		{
			logger.info("Properties Configuration Listener hasn't been initialized " + e.getMessage());
		}
	}
	
	@Override
	public void contextDestroyed(ServletContextEvent event)
	{
		// Do nothing
	}
	
}
