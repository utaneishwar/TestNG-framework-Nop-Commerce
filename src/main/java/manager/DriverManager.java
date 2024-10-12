package manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public  class DriverManager
{
	public static WebDriver driver;
	public static void launchBrowser(String BrowserType, String BaseUrl) throws Exception
	{
		if(driver!=null)
		{
			throw new IllegalArgumentException("browser is already launched");
		}
		driver=WebDriverFactory.CreateWebDriver(BrowserType);  // firefox  // edge 
		driver.get(BaseUrl); 
	}
	public static WebDriver getdriver()
	{
		System.out.println("driver value is: "+driver);
		if(driver!=null)
		{
			System.out.println("driver is not null during execution");
		}
		return driver;
	}
	public static void Closedriver()
	{
		driver.quit();
	}
}
