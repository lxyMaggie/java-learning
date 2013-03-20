package com.ibm.CNNC.page;

import org.openqa.selenium.By;

import com.selenium.utils.WebDriver;
import com.selenium.utils.WebElement;

public class DocumentData {
	private WebDriver driver;
	private static final String confirmReceiveButton_XPath="//descendant::div[contains(@id,'DocumentData')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='确认接收']";
	private static final String cancleReceiveButton_XPath="//descendant::div[contains(@id,'DocumentData')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='取消']";

	//----Constructor Methods Begin----
	public DocumentData(WebDriver driver){
		this.driver=driver;
	}

	/*DocumentData->confirmReceiveButton*/
	public void confirmReceiveButton_click(){
		WebElement confirmReceiveButton = driver.findElement(By.xpath(confirmReceiveButton_XPath)).findVisibleElement(By.xpath(confirmReceiveButton_XPath));
		confirmReceiveButton.click();
	}

	/*DocumentData->confirmReceiveButton*/
	public WebElement get_confirmReceiveButton_Self(){
		return driver.findElement(By.xpath(confirmReceiveButton_XPath)).findVisibleElement(By.xpath(confirmReceiveButton_XPath));
	}

	/*DocumentData->cancleReceiveButton*/
	public void cancleReceiveButton_click(){
		WebElement cancleReceiveButton = driver.findElement(By.xpath(cancleReceiveButton_XPath)).findVisibleElement(By.xpath(cancleReceiveButton_XPath));
		cancleReceiveButton.click();
	}

	/*DocumentData->cancleReceiveButton*/
	public WebElement get_cancleReceiveButton_Self(){
		return driver.findElement(By.xpath(cancleReceiveButton_XPath)).findVisibleElement(By.xpath(cancleReceiveButton_XPath));
	}

}
