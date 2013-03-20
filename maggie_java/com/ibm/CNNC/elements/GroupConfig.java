package com.ibm.CNNC.elements;

import org.openqa.selenium.*;
import com.selenium.utils.WebDriver;
import com.selenium.utils.WebElement;

/*catalog\widget\dm\sysmanage\dynamicformconfig\dijit\templates\GroupConfig.html*/
public class GroupConfig {
	protected WebDriver driver;
	private static final String addGroupBtn_XPath="//descendant::div[contains(@id,'GroupConfig')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"创建分组"+"']";
	private static final String saveBtn_XPath="//descendant::div[contains(@id,'GroupConfig')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"保存"+"']";

	//----Constructor Methods Begin----
	public GroupConfig(WebDriver driver){
		this.driver=driver;
	}

	/*GroupConfig->addGroupBtn*/
	public void addGroupBtn_click(){
		WebElement addGroupBtn = driver.findElement(By.xpath(addGroupBtn_XPath)).findVisibleElement(By.xpath(addGroupBtn_XPath));
		addGroupBtn.click();
	}

	/*GroupConfig->addGroupBtn*/
	public WebElement get_addGroupBtn_Self(){
		return driver.findElement(By.xpath(addGroupBtn_XPath)).findVisibleElement(By.xpath(addGroupBtn_XPath));
	}

	/*GroupConfig->saveBtn*/
	public void saveBtn_click(){
		WebElement saveBtn = driver.findElement(By.xpath(saveBtn_XPath)).findVisibleElement(By.xpath(saveBtn_XPath));
		saveBtn.click();
	}

	/*GroupConfig->saveBtn*/
	public WebElement get_saveBtn_Self(){
		return driver.findElement(By.xpath(saveBtn_XPath)).findVisibleElement(By.xpath(saveBtn_XPath));
	}

}
