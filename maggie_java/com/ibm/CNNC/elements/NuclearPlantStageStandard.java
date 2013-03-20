package com.ibm.CNNC.elements;

import org.openqa.selenium.*;
import com.selenium.utils.WebDriver;
import com.selenium.utils.WebElement;

/*catalog\widget\dm\headquartermanage\nuclearplantstagestandard\templates\NuclearPlantStageStandard.html*/
public class NuclearPlantStageStandard {
	protected WebDriver driver;
	private static final String saveBtn_XPath="//descendant::div[contains(@id,'NuclearPlantStageStandard')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"保存顺序"+"']";
	private static final String createBtn_XPath="//descendant::div[contains(@id,'NuclearPlantStageStandard')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"创建"+"']";
	private static final String editBtn_XPath="//descendant::div[contains(@id,'NuclearPlantStageStandard')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"修改"+"']";
	private static final String deleteBtn_XPath="//descendant::div[contains(@id,'NuclearPlantStageStandard')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"删除"+"']";

	//----Constructor Methods Begin----
	public NuclearPlantStageStandard(WebDriver driver){
		this.driver=driver;
	}

	/*NuclearPlantStageStandard->saveBtn*/
	public void saveBtn_click(){
		WebElement saveBtn = driver.findElement(By.xpath(saveBtn_XPath)).findVisibleElement(By.xpath(saveBtn_XPath));
		saveBtn.click();
	}

	/*NuclearPlantStageStandard->saveBtn*/
	public WebElement get_saveBtn_Self(){
		return driver.findElement(By.xpath(saveBtn_XPath)).findVisibleElement(By.xpath(saveBtn_XPath));
	}

	/*NuclearPlantStageStandard->createBtn*/
	public void createBtn_click(){
		WebElement createBtn = driver.findElement(By.xpath(createBtn_XPath)).findVisibleElement(By.xpath(createBtn_XPath));
		createBtn.click();
	}

	/*NuclearPlantStageStandard->createBtn*/
	public WebElement get_createBtn_Self(){
		return driver.findElement(By.xpath(createBtn_XPath)).findVisibleElement(By.xpath(createBtn_XPath));
	}

	/*NuclearPlantStageStandard->editBtn*/
	public void editBtn_click(){
		WebElement editBtn = driver.findElement(By.xpath(editBtn_XPath)).findVisibleElement(By.xpath(editBtn_XPath));
		editBtn.click();
	}

	/*NuclearPlantStageStandard->editBtn*/
	public WebElement get_editBtn_Self(){
		return driver.findElement(By.xpath(editBtn_XPath)).findVisibleElement(By.xpath(editBtn_XPath));
	}

	/*NuclearPlantStageStandard->deleteBtn*/
	public void deleteBtn_click(){
		WebElement deleteBtn = driver.findElement(By.xpath(deleteBtn_XPath)).findVisibleElement(By.xpath(deleteBtn_XPath));
		deleteBtn.click();
	}

	/*NuclearPlantStageStandard->deleteBtn*/
	public WebElement get_deleteBtn_Self(){
		return driver.findElement(By.xpath(deleteBtn_XPath)).findVisibleElement(By.xpath(deleteBtn_XPath));
	}

}
