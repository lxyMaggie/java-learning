package com.ibm.CNNC.elements;

import org.openqa.selenium.*;
import com.selenium.utils.WebDriver;
import com.selenium.utils.WebElement;

/*catalog\widget\dm\searchuse\pagination\dijit\templates\PageNumber.html*/
public class PageNumber {
	protected WebDriver driver;
	private static final String pageNumber_XPath="//descendant::a";

	//----Constructor Methods Begin----
	public PageNumber(WebDriver driver){
		this.driver=driver;
	}

	/**/
	public void pageNumber_click(){
		WebElement pageNumber = driver.findElement(By.xpath(pageNumber_XPath)).findVisibleElement(By.xpath(pageNumber_XPath));
		pageNumber.click();
	}

	/**/
	public WebElement get_pageNumber_Self(){
		return driver.findElement(By.xpath(pageNumber_XPath)).findVisibleElement(By.xpath(pageNumber_XPath));
	}

}
