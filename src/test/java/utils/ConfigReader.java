package utils;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	Properties prop=new Properties();
	public ConfigReader() throws IOException
	{
		FileInputStream file=new FileInputStream("src/test/resources/Config.Properties");
		prop.load(file);
	}

	public String getValues(String values)
	
	{
		
		return prop.getProperty(values);
		
		
	}
}
