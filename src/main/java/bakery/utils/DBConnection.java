package bakery.utils;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnection {
	
	private static String url;
	private static String userName;
	private static String password;
	private static String driver;
	
	static 
	{
		try (InputStream input = DBConnection.class.getClassLoader().getResourceAsStream("database.properties"))
		{
			if (input == null)
			{
				throw new IOException("Unable to find database.properties");
			}
			
			Properties properties = new Properties();
			properties.load(input);
			
			url = properties.getProperty("url");
			userName = properties.getProperty("username");
			password = properties.getProperty("password");
			driver = properties.getProperty("driver");
			
			// Register the database driver
			Class.forName(driver);			
		}
		catch (IOException | ClassNotFoundException e)
		{
			throw new ExceptionInInitializerError("Database initialization failed: " + e.getMessage());
		}
	}
	
	public static Connection getConnection() throws SQLException
	{
		return DriverManager.getConnection(url, userName, password);
	}

}
