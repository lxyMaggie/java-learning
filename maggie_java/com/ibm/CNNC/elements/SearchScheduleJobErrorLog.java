package com.ibm.CNNC.elements;

import org.openqa.selenium.*;
import com.selenium.utils.WebDriver;
import com.selenium.utils.WebElement;

/*catalog\widget\dm\sysmanage\schedulejob\templates\SearchScheduleJobErrorLog.html*/
public class SearchScheduleJobErrorLog {
	protected WebDriver driver;
	private static final String searchButton_XPath="//descendant::div[contains(@id,'SearchScheduleJobErrorLog')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"ËÑË÷"+"']";

	//----Constructor Methods Begin----
	public SearchScheduleJobErrorLog(WebDriver driver){
		this.driver=driver;
	}

	/*SearchScheduleJobErrorLog->searchButton*/
	public void searchButton_click(){
		WebElement searchButton = driver.findElement(By.xpath(searchButton_XPath)).findVisibleElement(By.xpath(searchButton_XPath));
		searchButton.click();
	}

	/*SearchScheduleJobErrorLog->searchButton*/
	public WebElement get_searchButton_Self(){
		return driver.findElement(By.xpath(searchButton_XPath)).findVisibleElement(By.xpath(searchButton_XPath));
	}

}
