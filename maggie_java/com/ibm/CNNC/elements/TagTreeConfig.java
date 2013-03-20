package com.ibm.CNNC.elements;

import org.openqa.selenium.*;
import com.selenium.utils.WebDriver;
import com.selenium.utils.WebElement;

/*catalog\widget\dm\headquartermanage\tagtreeconfig\templates\TagTreeConfig.html*/
public class TagTreeConfig {
	protected WebDriver driver;
	private static final String saveBtn_XPath="//descendant::div[contains(@id,'TagTreeConfig')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"±£´æË³Ðò"+"']";
	private static final String createBtn_XPath="//descendant::div[contains(@id,'TagTreeConfig')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"Ìí¼Ó"+"']";
	private static final String editBtn_XPath="//descendant::div[contains(@id,'TagTreeConfig')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"ÐÞ¸Ä"+"']";
	private static final String deleteBtn_XPath="//descendant::div[contains(@id,'TagTreeConfig')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"É¾³ý"+"']";

	//----Constructor Methods Begin----
	public TagTreeConfig(WebDriver driver){
		this.driver=driver;
	}

	/*TagTreeConfig->saveBtn*/
	public void saveBtn_click(){
		WebElement saveBtn = driver.findElement(By.xpath(saveBtn_XPath)).findVisibleElement(By.xpath(saveBtn_XPath));
		saveBtn.click();
	}

	/*TagTreeConfig->saveBtn*/
	public WebElement get_saveBtn_Self(){
		return driver.findElement(By.xpath(saveBtn_XPath)).findVisibleElement(By.xpath(saveBtn_XPath));
	}

	/*TagTreeConfig->createBtn*/
	public void createBtn_click(){
		WebElement createBtn = driver.findElement(By.xpath(createBtn_XPath)).findVisibleElement(By.xpath(createBtn_XPath));
		createBtn.click();
	}

	/*TagTreeConfig->createBtn*/
	public WebElement get_createBtn_Self(){
		return driver.findElement(By.xpath(createBtn_XPath)).findVisibleElement(By.xpath(createBtn_XPath));
	}

	/*TagTreeConfig->editBtn*/
	public void editBtn_click(){
		WebElement editBtn = driver.findElement(By.xpath(editBtn_XPath)).findVisibleElement(By.xpath(editBtn_XPath));
		editBtn.click();
	}

	/*TagTreeConfig->editBtn*/
	public WebElement get_editBtn_Self(){
		return driver.findElement(By.xpath(editBtn_XPath)).findVisibleElement(By.xpath(editBtn_XPath));
	}

	/*TagTreeConfig->deleteBtn*/
	public void deleteBtn_click(){
		WebElement deleteBtn = driver.findElement(By.xpath(deleteBtn_XPath)).findVisibleElement(By.xpath(deleteBtn_XPath));
		deleteBtn.click();
	}

	/*TagTreeConfig->deleteBtn*/
	public WebElement get_deleteBtn_Self(){
		return driver.findElement(By.xpath(deleteBtn_XPath)).findVisibleElement(By.xpath(deleteBtn_XPath));
	}

}
