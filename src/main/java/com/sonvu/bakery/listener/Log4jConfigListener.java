package com.sonvu.bakery.listener;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;

//import org.apache.logging.log4j.core.config.Configurator;

public class Log4jConfigListener implements ServletContextListener {

		@Override
		public void contextInitialized(ServletContextEvent event)
		{
			ServletContext context = event.getServletContext();
			
			String log4jFile = context.getInitParameter("Log4j2_FilePath");
			
			//Configurator.initialize(null, fullPath);
			System.out.println("Log4j2 Listener has been initialized with configuration file: " + log4jFile);
		}
		
		@Override
		public void contextDestroyed(ServletContextEvent event)
		{
			// Do nothing
		}
}
