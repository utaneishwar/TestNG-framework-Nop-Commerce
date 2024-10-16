package extentlistner;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import manager.DriverManager;
import utillity.BaseTest;

public class TestListner extends EcxtentReportGenerate implements ITestListener
{
	ExtentReports report=ExtentReport();
	ExtentTest test;
	@Override
	public void onTestStart(ITestResult result)
	{
		System.out.println("test case "+result.getName()+" Started");
		test=report.createTest(result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		System.out.println("test case "+result.getName()+" Has passed");
		test.log(Status.PASS,"Test Case Passed");
	}

	@Override
	public void onTestFailure(ITestResult result) 							// method Declaration
	{
		System.out.println("test case "+result.getName()+" has failed");   // method Defination	
		try 
		{
			utillity.Screenshot.TakeScreenshot(DriverManager.getdriver(), result.getName());
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	
	@Override
	public void onFinish(ITestContext context) 
	{
		System.out.println("test tag "+context.getName()+" has completed ");
		report.flush();
	}
}
