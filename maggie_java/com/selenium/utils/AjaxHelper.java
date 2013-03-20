package com.selenium.utils;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import com.selenium.utils.WebElement;
import com.selenium.utils.WebDriver;

public class AjaxHelper {
	
	private static final String pageLoadedElementXPath = "html/body/div[@id='ECMWebUI']//div[contains(@class,'ecmLoginPane')]//div[@class='loginBorder']/table//td[@class='loginForm']/div[@class='title']";
	
	@SuppressWarnings("deprecation")
	public static void ajaxMonitor(WebDriver webDriver, Thread mainThread)
	{
		final int activeConnectionTimeout = 1000; //time to wait to ensure Ajax requests have stopped
		final int sleep = 250; //time to wait between request checks
		final int timeout = 10000;
		int timeElapsed = 0; //current time elapsed
		int timeElapsedWithoutActiveConnection = 0; //the amount of time that has elapsed since the last request 
		JavascriptExecutor executor = (JavascriptExecutor) webDriver.getDriver(); 
		String script = "return window.ajaxMonitor.getCounter()";
		try
		{
			while(mainThread.isAlive())
			{
				//Thread.sleep(50);
				int numRequestsOutstanding = Integer.parseInt(executor.executeScript(script).toString()); 
				if (numRequestsOutstanding != 0) {
					timeElapsedWithoutActiveConnection = 0; //reset the counter
					mainThread.suspend();
					System.out.print("|");
					while (timeElapsed < timeout) {
						numRequestsOutstanding = Integer.parseInt(executor.executeScript(script).toString()); 
						timeElapsed += sleep;
						try {
							Thread.sleep(sleep);
						} catch (InterruptedException e) {}
						
						if (numRequestsOutstanding != 0) {
							timeElapsedWithoutActiveConnection = 0; //reset the counter
							timeElapsed += sleep;
							try {
								Thread.sleep(sleep);
							} catch (InterruptedException e) {}
						}
						// if there is no current active connection but we found some the loop before
						// we still need to wait a bit and check again. The counter sometimes gets down to 0
						// before new connection gets kicked off.
						else {
							if (timeElapsedWithoutActiveConnection < activeConnectionTimeout) {
								timeElapsed += 100;
								timeElapsedWithoutActiveConnection += 100;
								try {
									Thread.sleep(100);
								} catch (InterruptedException e) {}
							}
							else break;
						}
					}
					mainThread.resume();
				}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			mainThread.stop(e);
		}
	}
	
	public static void setUpAjaxMonitor(org.openqa.selenium.WebDriver driver)
	{
		setUpAjaxMonitor(new WebDriver(driver));
	}
	
	public static void setUpAjaxMonitor(WebDriver webDriver) {
		List<WebElement> pageReadyElements = null;
		for(int i = 0; i< 5; i++) {
			pageReadyElements = webDriver.findAll(By.xpath(pageLoadedElementXPath));
			if (pageReadyElements.size() <= 0){
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {}
				continue;
			}
			else {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {}
				break;
			}
		}
		String javaScript = "window.ajaxMonitor = {" +
				"counter:0, " +
				"getCounter: function(){return this.counter;}," +
				"xhrStartEvent: function(){this.counter++;}," +
				"xhrEndEvent: function(){this.counter--;}" +
				"};" +
				"dojo.connect(ecm.model.desktop, \"onRequestCompleted\", window.ajaxMonitor, \"xhrEndEvent\");" +
				"dojo.connect(ecm.model.desktop, \"onRequestStarted\", window.ajaxMonitor, \"xhrStartEvent\");";
		JavascriptExecutor js = (JavascriptExecutor) webDriver.getDriver();
		js.executeScript(javaScript);
	}

	public static void waitForAjax(WebDriver webDriver, int timeout, int additionalSleep) {
		final int activeConnectionTimeout = 1000; //time to wait to ensure Ajax requests have stopped
		final int sleep = 250; //time to wait between request checks
		int timeElapsed = 0; //current time elapsed
		int timeElapsedWithoutActiveConnection = 0; //the amount of time that has elapsed since the last request 
		String script = "return window.ajaxMonitor.getCounter()";
		JavascriptExecutor executor = (JavascriptExecutor) webDriver.getDriver(); 
		while (timeElapsed < timeout) {
			int numRequestsOutstanding = Integer.parseInt(executor.executeScript(script).toString()); 
			// if there are active connections, wait a bit before checking again		
			if (numRequestsOutstanding < 0) {
				System.err.println("Requests outstanding = " + numRequestsOutstanding);
				numRequestsOutstanding = 0;
			}
			if (numRequestsOutstanding != 0) {
				timeElapsedWithoutActiveConnection = 0; //reset the counter
				timeElapsed += sleep;
				try {
					Thread.sleep(sleep);
				} catch (InterruptedException e) {}
			}
			// if there is no current active connection but we found some the loop before
			// we still need to wait a bit and check again. The counter sometimes gets down to 0
			// before new connection gets kicked off.
			else {
				if (timeElapsedWithoutActiveConnection < activeConnectionTimeout) {
					timeElapsed += 100;
					timeElapsedWithoutActiveConnection += 100;
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {}
				}
				else break;
			}
		}
		if (timeElapsed >= timeout) {
			//System.err.println("There are still active ajax connections running after " + ((float)timeElapsed)/1000 + " seconds");
		}
		else {
			try {
				Thread.sleep(additionalSleep);
			} catch (InterruptedException e) {}
		}
    }
	
	
}
