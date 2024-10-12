package manager;

import org.openqa.selenium.WebDriver;

import pageclasses.LoginPage;
import pageclasses.RegisterPage;


public class PageManager        // object creation needed
{
	public static WebDriver driver=DriverManager.getdriver();
	public static LoginPage login=new LoginPage (driver);
	public static RegisterPage register=new RegisterPage (driver);
	
}