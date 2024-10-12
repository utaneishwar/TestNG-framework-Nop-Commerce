package utillity;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot
{

	public static File TakeScreenshot(WebDriver driver, String filename) throws IOException
	{
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File file =new File("C:\\Users\\intel\\eclipse-workspace\\RohanTestNgProject\\src\\ScreenShot\\"+filename+".jpg");
		org.openqa.selenium.io.FileHandler.copy(source, file);
		return file;
	}

}
