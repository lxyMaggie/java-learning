package com.selenium.utils;

import com.selenium.utils.WebDriver;

public class AjaxMonitorThread extends Thread
{
	public WebDriver driver;
	public Thread threadToMonitor;
	
	public void run()
	{
		System.out.println("Ajax Monitor Started");
		AjaxHelper.ajaxMonitor(driver, threadToMonitor);
		System.out.println("Ajax Monitor Finished");
	}
	
	public AjaxMonitorThread(WebDriver driver, Thread threadToMonitor)
	{
		this.driver = driver;
		this.threadToMonitor = threadToMonitor;
	}
}
