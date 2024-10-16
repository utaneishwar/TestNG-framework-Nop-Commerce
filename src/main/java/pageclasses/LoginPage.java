package pageclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import helpers.Pages;
import helpers.WebElementExtension;


public class LoginPage extends Pages
{
	WebDriver driver;	
	public LoginPage (WebDriver driver)
	{
		this.driver=driver;
	}

	public WebElementExtension Email() throws Exception 
	{
	    return new WebElementExtension(FindElement(By.xpath("//*[@id='Email']")));

	}
	


//	WebElementExtension email = WebElementExtension.of(FindElement(By.xpath("//*[@id='Email']")));
	
	public WebElementExtension Password() throws Exception 
	{
	    return new WebElementExtension (FindElement(By.xpath("//*[@id='Password']")));

	}		
	
	public WebElementExtension Login() throws Exception 
	{
	    return new WebElementExtension (FindElement(By.xpath("(//*[text()='Log in'])[2]")));

	}	
	
	public  WebElementExtension VallidationMSG() throws Exception 
	{
	    return new WebElementExtension (FindElement(By.xpath("//*[@class='message-error validation-summary-errors']")));

	}	
}
