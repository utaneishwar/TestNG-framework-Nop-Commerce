package pageclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import helpers.WebElementExtension;
import manager.DriverManager;

public class LoginPage 
{
	WebDriver driver;	
	public LoginPage (WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElementExtension Email() throws Exception 
	{
	    return new WebElementExtension (DriverManager.getdriver().findElement(By.xpath("//*[@id='Email']")));

	}
	
	public WebElementExtension Password() throws Exception 
	{
	    return new WebElementExtension (DriverManager.getdriver().findElement(By.xpath("//*[@id='Password']")));

	}		
	
	public WebElementExtension Login() throws Exception 
	{
	    return new WebElementExtension (DriverManager.getdriver().findElement(By.xpath("(//*[text()='Log in'])[2]")));

	}	
	
	public  WebElementExtension VallidationMSG() throws Exception 
	{
	    return new WebElementExtension (DriverManager.getdriver().findElement(By.xpath("//*[@class='message-error validation-summary-errors']")));

	}	
}
