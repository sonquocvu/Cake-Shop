package bakery.listener;

import bakery.utils.Helper;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Logger;
import java.util.logging.Level;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class BakeryShopListener
 *
 */
@WebListener
public class BakeryShopListener implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent sce)
	{
		try
		{
			ServletContext context = sce.getServletContext();
			String viewMapPath = context.getInitParameter("VIEW_FILE_PATH");
			String servletMapPath = context.getInitParameter("SERVLET_FILE_PATH");
			String authenMapPath = context.getInitParameter("AUTHENTICATION_FILE_PATH");
			
			Properties viewMapProperties = Helper.getProperties(viewMapPath);
			Properties servletMapProperties = Helper.getProperties(servletMapPath);			
			Properties authenMapProperties = Helper.getProperties(authenMapPath);
			
			context.setAttribute("VIEW_MAP", viewMapProperties);
			context.setAttribute("SERVLET_MAP", servletMapProperties);
			context.setAttribute("AUTHEN_MAP", authenMapProperties);
		}
		catch (IOException e)
		{
			Logger.getLogger(BakeryShopListener.class.getName()).log(Level.SEVERE, "Unable to initialize Listener", e);
		}
	}
	
}
