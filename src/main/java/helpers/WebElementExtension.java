package helpers;
import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import dev.failsafe.internal.util.Assert;
import manager.DriverManager;

public class WebElementExtension   // reusable methods for element
{
	private WebElement element;

	// Constructor to initialize with WebElement
	public WebElementExtension(WebElement element)
	{
		this.element = element;
	}

	public WebElementExtension ClickOnElement()throws Exception
	{
		if(!element.isDisplayed() || !element.isEnabled())
		{
			throw new Exception("element is not clickable");   // parent 
		}
		try
		{
			element.click();
		} 
		catch (Exception e) 
		{
			JavascriptExecutor js =(JavascriptExecutor)(DriverManager.getdriver());
			js.executeScript("arguments[0].click();", element);
		}
		return this;
	}

	public WebElementExtension EnterText(String text) throws Exception
	{
		if(element==null) throw new IllegalArgumentException();
		element.clear();
		element.sendKeys(text);
		return this;
	}
	public WebElementExtension ElementContainsText(String expectedText)
	{
		String actualText=element.getText();
		Assert.isTrue(actualText.contains(expectedText)," element does not contains " +expectedText+" it contains "+actualText);
		return this;
	}
	public WebElementExtension WaitUntilELementVisible(WebDriver driver, int TimoutinSeconds)
	{
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(TimoutinSeconds));
		wait.until(ExpectedConditions.visibilityOf(element));
		return this;
	}

	public WebElementExtension SelectValueFromDropDown(String DropdownValue)
	{
		Select select=new Select(element);

		try 
		{
			select.selectByValue(DropdownValue);	
		}
		catch (NoSuchElementException e) 
		{
			select.selectByVisibleText(DropdownValue);
		}
		catch (Exception e) 
		{
			select.selectByVisibleText(DropdownValue);
		}
		return this;
	}

}
