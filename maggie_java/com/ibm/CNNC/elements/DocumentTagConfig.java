package com.ibm.CNNC.elements;

import org.openqa.selenium.*;
import com.selenium.utils.WebDriver;
import com.selenium.utils.WebElement;

/*catalog\widget\dm\sysmanage\documenttagconfig\templates\DocumentTagConfig.html*/
public class DocumentTagConfig {
	protected WebDriver driver;
	private static final String saveBtn_XPath="//descendant::div[contains(@id,'DocumentTagConfig')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"±£´æÅÅÁÐË³Ðò"+"']";

	//----Constructor Methods Begin----
	public DocumentTagConfig(WebDriver driver){
		this.driver=driver;
	}

	/*DocumentTagConfig->saveBtn*/
	public void saveBtn_click(){
		WebElement saveBtn = driver.findElement(By.xpath(saveBtn_XPath)).findVisibleElement(By.xpath(saveBtn_XPath));
		saveBtn.click();
	}

	/*DocumentTagConfig->saveBtn*/
	public WebElement get_saveBtn_Self(){
		return driver.findElement(By.xpath(saveBtn_XPath)).findVisibleElement(By.xpath(saveBtn_XPath));
	}

}
