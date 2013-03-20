package com.ibm.CNNC.elements;

import org.openqa.selenium.*;
import com.selenium.utils.WebDriver;
import com.selenium.utils.WebElement;

/*catalog\widget\dm\sysmanage\documentcoderule\templates\DocumentCodeRule.html*/
public class DocumentCodeRule {
	protected WebDriver driver;
	private static final String checkAll_XPath="//descendant::div[contains(@id,'DocumentCodeRule')]/descendant::input";

	//----Constructor Methods Begin----
	public DocumentCodeRule(WebDriver driver){
		this.driver=driver;
	}

	/*DocumentCodeRule->checkAll*/
	public void checkAll_check(){
		WebElement checkAll = driver.findElement(By.xpath(checkAll_XPath)).findVisibleElement(By.xpath(checkAll_XPath));
		if(!checkAll.isSelected())
			checkAll.click();
	}

	/*DocumentCodeRule->checkAll*/
	public void checkAll_uncheck(){
		WebElement checkAll = driver.findElement(By.xpath(checkAll_XPath)).findVisibleElement(By.xpath(checkAll_XPath));
		if(checkAll.isSelected())
			checkAll.click();
	}

	/*DocumentCodeRule->checkAll*/
	public WebElement get_checkAll_Self(){
		return driver.findElement(By.xpath(checkAll_XPath)).findVisibleElement(By.xpath(checkAll_XPath));
	}

}
