package com.ibm.CNNC.elements;

import org.openqa.selenium.*;
import com.selenium.utils.WebDriver;
import com.selenium.utils.WebElement;

/*catalog\widget\dm/unifyreceive\selectarchivepath\templates\SelectArchivePath.html*/
public class SelectArchivePath {
	protected WebDriver driver;
	private static final String onOK_XPath="//descendant::div[contains(@id,'SelectArchivePath')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"确定"+"']";
	private static final String onCancel_XPath="//descendant::div[contains(@id,'SelectArchivePath')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"取消"+"']";

	//----Constructor Methods Begin----
	public SelectArchivePath(WebDriver driver){
		this.driver=driver;
	}

	/*SelectArchivePath->onClick: onOK*/
	public void onOK_click(){
		WebElement onOK = driver.findElement(By.xpath(onOK_XPath)).findVisibleElement(By.xpath(onOK_XPath));
		onOK.click();
	}

	/*SelectArchivePath->onClick: onOK*/
	public WebElement get_onOK_Self(){
		return driver.findElement(By.xpath(onOK_XPath)).findVisibleElement(By.xpath(onOK_XPath));
	}

	/*SelectArchivePath->onClick: onCancel*/
	public void onCancel_click(){
		WebElement onCancel = driver.findElement(By.xpath(onCancel_XPath)).findVisibleElement(By.xpath(onCancel_XPath));
		onCancel.click();
	}

	/*SelectArchivePath->onClick: onCancel*/
	public WebElement get_onCancel_Self(){
		return driver.findElement(By.xpath(onCancel_XPath)).findVisibleElement(By.xpath(onCancel_XPath));
	}

}
