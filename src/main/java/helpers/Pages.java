package helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import manager.DriverManager;

public class Pages
{
	public static  WebDriver driver = DriverManager.getdriver();
	public static WebElement findElement(By by) throws Exception
	{
		try 
		{
			return driver.findElement(by);
		}
		catch (Exception e) 
		{
			throw new NoSuchElementException(""+driver.findElement(by));
		}
	}
}
