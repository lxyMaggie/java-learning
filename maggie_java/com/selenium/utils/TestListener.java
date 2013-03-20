package com.selenium.utils;

import java.io.File;
import java.io.PrintStream;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.TestListenerAdapter;

public class TestListener extends TestListenerAdapter {

	@Override
	public void onTestFailure(ITestResult result) {
		takeScreenshot(result);
	}
	
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub

		super.onTestStart(result);
	}
	
	@Override
	public void onConfigurationFailure(ITestResult result) {
		takeScreenshot(result);
	}
	
	public void takeScreenshot(ITestResult result)
	{
		System.out.println("- FAIL - " + result.getTestClass().toString() + " " + result.getName());
		Reporter.setCurrentTestResult(result);
		File file = new File("");
		
		try 
		{
			String dateTime = String.valueOf(new Date().getTime());
			WebDriver driver;
			driver = (WebDriver)result.getInstance().getClass().getField("driver").get(result.getInstance());
			
			try { // If your test class has a testFailed field, you can use this field to check if last test failed.
				result.getInstance().getClass().getField("testFailed").set(result.getInstance(), true); }
			catch(Exception ex) {}
			
			String fileName = "screenshots\\" + driver.getClass().getSimpleName() + result.getName() + dateTime;
			Reporter.log("<br /><a href='" + fileName + ".png'> <img src='" + fileName + ".png' hight='100' width='100'/> </a><br />");
			File scrFile = ((TakesScreenshot)(driver)).getScreenshotAs(OutputType.FILE);
			
			FileUtils.copyFile(scrFile, new File(file.getAbsolutePath() + "\\test-output\\html\\" + fileName + ".png"));
			result.getThrowable().printStackTrace(new PrintStream(file.getAbsolutePath() + "\\test-output\\html\\" + fileName + ".txt"));
			System.out.println(fileName);
		} catch (Exception e)
		{
			Reporter.log("<br />Error generating a screenshot: " + e, true);
			for (StackTraceElement ste: e.getStackTrace())
				Reporter.log("&nbsp;&nbsp;&nbsp;&nbsp;" + ste.toString());
		}
		Reporter.setCurrentTestResult(null);
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("- PASS - " + result.getTestClass().toString() + " " + result.getName());
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("- SKIPPED - " + result.getTestClass().toString() + " " + result.getName());
	}


} 
