package extentlistner;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import utillity.Test;

public class EcxtentReportGenerate
{
	public static  ExtentReports report;
	public static ExtentReports ExtentReport()
	{
		// Get project path and append to file path
//		String projectPath = System.getProperty("user.dir");
//		String file = projectPath + "//extentreport.html";
		// Set location of extents Report
		String file = "C:\\Users\\intel\\eclipse-workspace\\TddFrameworkProject\\extentreport\\"+Test.gettime()+".html";
		ExtentHtmlReporter extentReport=new ExtentHtmlReporter(file);
		extentReport.config().setTheme(Theme.STANDARD);
		extentReport.config().setReportName("NopCommerce");
		// set configuration of reports
	    report=new ExtentReports();
		report.attachReporter(extentReport);
		report.setSystemInfo("Executed by", "Nopcommerce");
		report.setSystemInfo("Environment", "SIT");		
		report.setSystemInfo("Browser", "chrome");	
		return report;
	}
}
