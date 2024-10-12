package manager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class WebDriverFactory 
{
	//static WebDriver driver;
	public static WebDriver driver;
	public static WebDriver CreateWebDriver(String BrowserType) throws Exception
	{
		switch (BrowserType) 
		{
		case "Chrome":
			driver=CreateChromeDriver();
			break;
		default:
			throw new Exception("driver is not created");
		}
		return driver;
	}
	// maximized the browser
	public static WebDriver CreateChromeDriver()
	{
		ChromeOptions Options = new ChromeOptions();
		Options.addArguments("--start-maximized");
		 driver = new ChromeDriver(Options);     // remove chromedriver
		return driver;
	}
//	public static WebDriver CreateEdgeDriver()
//	{
//		EdgeOptions Options = new EdgeOptions();
//		Options.addArguments("--start-maximized");
//		driver =new EdgeDriver(Options);
//		return driver;
//	}
//	public static WebDriver CreateFirefoxDriver()
//	{
//		FirefoxOptions Options = new FirefoxOptions();
//		Options.addArguments("--start-maximized");
//		driver =new FirefoxDriver(Options);
//		return driver;
//	}
//case "Edge":
//	driver=CreateEdgeDriver();
//	break;
//	
//case "Firefox":
//	driver=CreateFirefoxDriver();
//	break;
//	
}
