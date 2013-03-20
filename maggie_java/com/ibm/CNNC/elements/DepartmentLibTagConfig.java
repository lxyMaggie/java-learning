package com.ibm.CNNC.elements;

import org.openqa.selenium.*;
import com.selenium.utils.WebDriver;
import com.selenium.utils.WebElement;

/*catalog\widget\dm\sysmanage\departmentlibtagconfig\templates\DepartmentLibTagConfig.html*/
public class DepartmentLibTagConfig {
	protected WebDriver driver;
	private static final String saveBtn_XPath="//descendant::div[contains(@id,'DepartmentLibTagConfig')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"±£´æÅÅÁÐË³Ðò"+"']";

	//----Constructor Methods Begin----
	public DepartmentLibTagConfig(WebDriver driver){
		this.driver=driver;
	}

	/*DepartmentLibTagConfig->saveBtn*/
	public void saveBtn_click(){
		WebElement saveBtn = driver.findElement(By.xpath(saveBtn_XPath)).findVisibleElement(By.xpath(saveBtn_XPath));
		saveBtn.click();
	}

	/*DepartmentLibTagConfig->saveBtn*/
	public WebElement get_saveBtn_Self(){
		return driver.findElement(By.xpath(saveBtn_XPath)).findVisibleElement(By.xpath(saveBtn_XPath));
	}

}
