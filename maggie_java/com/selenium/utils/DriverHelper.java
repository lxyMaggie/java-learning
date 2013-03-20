package com.selenium.utils;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import com.selenium.utils.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class DriverHelper
{
	public int defaultPort=4444;
	public WebDriver driver;
	
	public static WebElement findElement(WebDriver driver, By by) throws InterruptedException
	{
		for (int i = 0; i < 30; i++)
		{
			WebElement web = driver.findElement(by);
			if (web.isDisplayed())
				return web;
			else
				Thread.sleep(1000);
		}
		return null;
	}

	public synchronized static WebDriver setUpDriver(WebDriver driver, String browser)
	{
		if(browser.equals("firefox"))
		{
			driver = new com.selenium.utils.WebDriver(new FirefoxDriver());
		}
		/*else if(browser.equalsIgnoreCase("ie") || browser.equalsIgnoreCase("internetexplorer"))
			driver = new InternetExplorerDriver();
		else
			driver = new FirefoxDriver();*/
		//driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

		return driver;
	}

	public static WebElement findDescendant(WebDriver driver, String elementType, String attribute, String value) {



		return null;
	}

}
