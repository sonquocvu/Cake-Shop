package com.sonvu.bakery.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class Helper {
	
	public static Properties getProperties (String filePath) throws IOException
	{
		Properties properties = new Properties();
		
		try (InputStream input = Helper.class.getClassLoader().getResourceAsStream(filePath))
		{
			if (input == null)
			{
				throw new IOException("Unable to find " + filePath);
			}
			
			properties.load(input);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
		return properties;
	}
}
