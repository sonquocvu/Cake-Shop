package com.sonvu.bakery.listener;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;

import org.apache.logging.log4j.core.config.Configurator;
import org.apache.logging.log4j.LogManager;

public class Log4jConfigListener implements ServletContextListener {

		@Override
		public void contextInitialized(ServletContextEvent event)
		{
			ServletContext context = event.getServletContext();
			
			String log4jFile = context.getInitParameter("Log4j2_FilePath");
			
			Configurator.initialize(null, log4jFile);
			LogManager.getLogger(Log4jConfigListener.class).info("Initialize the Log4j Listener successfully");
		}
		
		@Override
		public void contextDestroyed(ServletContextEvent event)
		{
			// Do nothing
		}
}
