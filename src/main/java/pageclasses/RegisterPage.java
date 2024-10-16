package pageclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import helpers.Pages;
import helpers.WebElementExtension;


public class RegisterPage extends Pages
{
	
	WebDriver driver;	
	public RegisterPage (WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElementExtension RegisterTab() throws Exception 
	{
	    return new WebElementExtension (FindElement(By.xpath("//*[@class='header-links']/child::ul/child::li[1]")));
	}
	
	
	public WebElementExtension GenderMale() throws Exception 
	{
	    return new WebElementExtension (FindElement(By.xpath("//*[@id='gender-male']")));

	}		
	
	public WebElementExtension FirstName() throws Exception 
	{
	    return new WebElementExtension (FindElement(By.xpath("//*[@id='FirstName']")));

	}	
	
	public  WebElementExtension LastName() throws Exception 
	{
	    return new WebElementExtension (FindElement(By.xpath("//*[@id='LastName']")));

	}	
	 
	public WebElementExtension DateOfBirthDay() throws Exception 
	{
	    return new WebElementExtension (FindElement(By.xpath("//*[@name='DateOfBirthDay']")));
	}
	
	public WebElementExtension DateOfBirthMonth() throws Exception 
	{
	    return new WebElementExtension (FindElement(By.xpath("//*[@name='DateOfBirthMonth']")));

	}		
	
	public WebElementExtension DateOfBirthYear() throws Exception 
	{
	    return new WebElementExtension (FindElement(By.xpath("//*[@name='DateOfBirthYear']")));

	}	
	
	public  WebElementExtension Email() throws Exception 
	{
	    return new WebElementExtension (FindElement(By.xpath("//*[@id='Email']")));

	}	
	
	public  WebElementExtension Password() throws Exception 
	{
	    return new WebElementExtension (FindElement(By.xpath("//*[@id='Password']")));

	}
	public  WebElementExtension ConfirmPassword() throws Exception 
	{
	    return new WebElementExtension (FindElement(By.xpath("//*[@id='ConfirmPassword']")));

	}
	public  WebElementExtension Register() throws Exception 
	{
	    return new WebElementExtension (FindElement(By.xpath("//*[@id='register-button']")));

	}
}
