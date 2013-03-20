package com.ibm.CNNC.elements;

import org.openqa.selenium.*;
import com.selenium.utils.WebDriver;
import com.selenium.utils.WebElement;

/*catalog\widget\dm\searchuse\searchplatform\templates\SearchPlatform.html*/
public class SearchPlatform {
	protected WebDriver driver;
	private static final String timeSort_XPath="//descendant::div[contains(@id,'SearchPlatform')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"时间"+"']";
	private static final String downloadSort_XPath="//descendant::div[contains(@id,'SearchPlatform')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"下载量"+"']";
	private static final String codeSort_XPath="//descendant::div[contains(@id,'SearchPlatform')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"文件代码"+"']";

	//----Constructor Methods Begin----
	public SearchPlatform(WebDriver driver){
		this.driver=driver;
	}

	/*SearchPlatform->timeSort*/
	public void timeSort_click(){
		WebElement timeSort = driver.findElement(By.xpath(timeSort_XPath)).findVisibleElement(By.xpath(timeSort_XPath));
		timeSort.click();
	}

	/*SearchPlatform->timeSort*/
	public WebElement get_timeSort_Self(){
		return driver.findElement(By.xpath(timeSort_XPath)).findVisibleElement(By.xpath(timeSort_XPath));
	}

	/*SearchPlatform->downloadSort*/
	public void downloadSort_click(){
		WebElement downloadSort = driver.findElement(By.xpath(downloadSort_XPath)).findVisibleElement(By.xpath(downloadSort_XPath));
		downloadSort.click();
	}

	/*SearchPlatform->downloadSort*/
	public WebElement get_downloadSort_Self(){
		return driver.findElement(By.xpath(downloadSort_XPath)).findVisibleElement(By.xpath(downloadSort_XPath));
	}

	/*SearchPlatform->codeSort*/
	public void codeSort_click(){
		WebElement codeSort = driver.findElement(By.xpath(codeSort_XPath)).findVisibleElement(By.xpath(codeSort_XPath));
		codeSort.click();
	}

	/*SearchPlatform->codeSort*/
	public WebElement get_codeSort_Self(){
		return driver.findElement(By.xpath(codeSort_XPath)).findVisibleElement(By.xpath(codeSort_XPath));
	}

}
