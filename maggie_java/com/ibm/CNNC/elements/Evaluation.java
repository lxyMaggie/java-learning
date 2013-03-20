package com.ibm.CNNC.elements;

import org.openqa.selenium.*;
import com.selenium.utils.WebDriver;
import com.selenium.utils.WebElement;

/*catalog\widget\dm\searchuse\searchplatform\dijit\templates\Evaluation.html*/
public class Evaluation {
	protected WebDriver driver;
	private static final String onAdd_XPath="//descendant::div[contains(@id,'Evaluation')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"提交"+"']";
	private static final String onCancel_XPath="//descendant::div[contains(@id,'Evaluation')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"取消"+"']";

	//----Constructor Methods Begin----
	public Evaluation(WebDriver driver){
		this.driver=driver;
	}

	/*Evaluation->onClick:->onAdd*/
	public void onAdd_click(){
		WebElement onAdd = driver.findElement(By.xpath(onAdd_XPath)).findVisibleElement(By.xpath(onAdd_XPath));
		onAdd.click();
	}

	/*Evaluation->onClick:->onAdd*/
	public WebElement get_onAdd_Self(){
		return driver.findElement(By.xpath(onAdd_XPath)).findVisibleElement(By.xpath(onAdd_XPath));
	}

	/*Evaluation->onClick:->onCancel*/
	public void onCancel_click(){
		WebElement onCancel = driver.findElement(By.xpath(onCancel_XPath)).findVisibleElement(By.xpath(onCancel_XPath));
		onCancel.click();
	}

	/*Evaluation->onClick:->onCancel*/
	public WebElement get_onCancel_Self(){
		return driver.findElement(By.xpath(onCancel_XPath)).findVisibleElement(By.xpath(onCancel_XPath));
	}

}
