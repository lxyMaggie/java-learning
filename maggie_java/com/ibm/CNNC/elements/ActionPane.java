package com.ibm.CNNC.elements;

import org.openqa.selenium.*;
import com.selenium.utils.WebDriver;
import com.selenium.utils.WebElement;

/*catalog\widget\dm/unifyreceive\actionpane\templates\ActionPane.html*/
public class ActionPane {
	protected WebDriver driver;
	private static final String systemReceive_UnifyReceiveView_XPath="//descendant::a[contains(@id,'systemReceive UnifyReceiveView')]";
	private static final String eamInvalidDocSearch_UnifyReceiveView_XPath="//descendant::a[contains(@id,'eamInvalidDocSearch UnifyReceiveView')]";
	private static final String importReceive_UnifyReceiveView_XPath="//descendant::a[contains(@id,'importReceive UnifyReceiveView')]";
	private static final String receiveRecordSearch_UnifyReceiveView_XPath="//descendant::a[contains(@id,'receiveRecordSearch UnifyReceiveView')]";
	private static final String documentReceiveProcess_UnifyReceiveView_XPath="//descendant::a[contains(@id,'documentReceiveProcess UnifyReceiveView')]";
	private static final String archiveReceiveProcess_UnifyReceiveView_XPath="//descendant::a[contains(@id,'archiveReceiveProcess UnifyReceiveView')]";

	//----Constructor Methods Begin----
	public ActionPane(WebDriver driver){
		this.driver=driver;
	}

	/**/
	public void systemReceive_UnifyReceiveView_click(){
		WebElement systemReceive_UnifyReceiveView = driver.findElement(By.xpath(systemReceive_UnifyReceiveView_XPath)).findVisibleElement(By.xpath(systemReceive_UnifyReceiveView_XPath));
		systemReceive_UnifyReceiveView.click();
	}

	/**/
	public WebElement get_systemReceive_UnifyReceiveView_Self(){
		return driver.findElement(By.xpath(systemReceive_UnifyReceiveView_XPath)).findVisibleElement(By.xpath(systemReceive_UnifyReceiveView_XPath));
	}

	/**/
	public void eamInvalidDocSearch_UnifyReceiveView_click(){
		WebElement eamInvalidDocSearch_UnifyReceiveView = driver.findElement(By.xpath(eamInvalidDocSearch_UnifyReceiveView_XPath)).findVisibleElement(By.xpath(eamInvalidDocSearch_UnifyReceiveView_XPath));
		eamInvalidDocSearch_UnifyReceiveView.click();
	}

	/**/
	public WebElement get_eamInvalidDocSearch_UnifyReceiveView_Self(){
		return driver.findElement(By.xpath(eamInvalidDocSearch_UnifyReceiveView_XPath)).findVisibleElement(By.xpath(eamInvalidDocSearch_UnifyReceiveView_XPath));
	}

	/**/
	public void importReceive_UnifyReceiveView_click(){
		WebElement importReceive_UnifyReceiveView = driver.findElement(By.xpath(importReceive_UnifyReceiveView_XPath)).findVisibleElement(By.xpath(importReceive_UnifyReceiveView_XPath));
		importReceive_UnifyReceiveView.click();
	}

	/**/
	public WebElement get_importReceive_UnifyReceiveView_Self(){
		return driver.findElement(By.xpath(importReceive_UnifyReceiveView_XPath)).findVisibleElement(By.xpath(importReceive_UnifyReceiveView_XPath));
	}

	/**/
	public void receiveRecordSearch_UnifyReceiveView_click(){
		WebElement receiveRecordSearch_UnifyReceiveView = driver.findElement(By.xpath(receiveRecordSearch_UnifyReceiveView_XPath)).findVisibleElement(By.xpath(receiveRecordSearch_UnifyReceiveView_XPath));
		receiveRecordSearch_UnifyReceiveView.click();
	}

	/**/
	public WebElement get_receiveRecordSearch_UnifyReceiveView_Self(){
		return driver.findElement(By.xpath(receiveRecordSearch_UnifyReceiveView_XPath)).findVisibleElement(By.xpath(receiveRecordSearch_UnifyReceiveView_XPath));
	}

	/**/
	public void documentReceiveProcess_UnifyReceiveView_click(){
		WebElement documentReceiveProcess_UnifyReceiveView = driver.findElement(By.xpath(documentReceiveProcess_UnifyReceiveView_XPath)).findVisibleElement(By.xpath(documentReceiveProcess_UnifyReceiveView_XPath));
		documentReceiveProcess_UnifyReceiveView.click();
	}

	/**/
	public WebElement get_documentReceiveProcess_UnifyReceiveView_Self(){
		return driver.findElement(By.xpath(documentReceiveProcess_UnifyReceiveView_XPath)).findVisibleElement(By.xpath(documentReceiveProcess_UnifyReceiveView_XPath));
	}

	/**/
	public void archiveReceiveProcess_UnifyReceiveView_click(){
		WebElement archiveReceiveProcess_UnifyReceiveView = driver.findElement(By.xpath(archiveReceiveProcess_UnifyReceiveView_XPath)).findVisibleElement(By.xpath(archiveReceiveProcess_UnifyReceiveView_XPath));
		archiveReceiveProcess_UnifyReceiveView.click();
	}

	/**/
	public WebElement get_archiveReceiveProcess_UnifyReceiveView_Self(){
		return driver.findElement(By.xpath(archiveReceiveProcess_UnifyReceiveView_XPath)).findVisibleElement(By.xpath(archiveReceiveProcess_UnifyReceiveView_XPath));
	}

}
