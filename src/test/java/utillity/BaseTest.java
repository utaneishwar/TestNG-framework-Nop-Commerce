package utillity;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import manager.DriverManager;
import utillity.ReadProperty;



public class BaseTest 
{
	// hooks class
	public static WebDriver driver;
	@BeforeTest
	public static void Initialize() throws Exception
	{
		DriverManager.launchBrowser(ReadProperty.getproperrty("BrowserType"), ReadProperty.getproperrty("TestEnvUrl"));
	
	}

	@AfterTest
	public static void cleanup()
	{
	//	DriverManager.Closedriver();
	}
}
