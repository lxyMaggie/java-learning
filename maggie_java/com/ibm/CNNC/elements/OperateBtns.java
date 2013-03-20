package com.ibm.CNNC.elements;

import org.openqa.selenium.*;
import com.selenium.utils.WebDriver;
import com.selenium.utils.WebElement;

/*catalog\widget\dm\distribute\docdistribution\dijit\templates\OperateBtns.html*/
public class OperateBtns {
	protected WebDriver driver;
	private static final String onAdd_XPath="//descendant::div[contains(@id,'OperateBtns')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"Ìí¼Ó"+"']";
	private static final String onDel_XPath="//descendant::div[contains(@id,'OperateBtns')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"ÒÆ³ý"+"']";

	//----Constructor Methods Begin----
	public OperateBtns(WebDriver driver){
		this.driver=driver;
	}

	/*OperateBtns->onClick: onAdd*/
	public void onAdd_click(){
		WebElement onAdd = driver.findElement(By.xpath(onAdd_XPath)).findVisibleElement(By.xpath(onAdd_XPath));
		onAdd.click();
	}

	/*OperateBtns->onClick: onAdd*/
	public WebElement get_onAdd_Self(){
		return driver.findElement(By.xpath(onAdd_XPath)).findVisibleElement(By.xpath(onAdd_XPath));
	}

	/*OperateBtns->onClick: onDel*/
	public void onDel_click(){
		WebElement onDel = driver.findElement(By.xpath(onDel_XPath)).findVisibleElement(By.xpath(onDel_XPath));
		onDel.click();
	}

	/*OperateBtns->onClick: onDel*/
	public WebElement get_onDel_Self(){
		return driver.findElement(By.xpath(onDel_XPath)).findVisibleElement(By.xpath(onDel_XPath));
	}

}
