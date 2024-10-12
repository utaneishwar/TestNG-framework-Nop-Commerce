package utillity;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperty 
{

	public static String getproperrty(String key) throws IOException
	{
		String path ="C:\\Users\\intel\\eclipse-workspace\\TddFrameworkProject\\src\\test\\resources\\TestData\\configue.properties";
		File file =new File(path);
		FileInputStream fis =new FileInputStream(file);
		Properties prop =new Properties();
		prop.load(fis);
		String value = prop.getProperty(key);
		return value;
	}

}
