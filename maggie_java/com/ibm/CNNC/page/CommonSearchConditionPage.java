package com.ibm.CNNC.page;

import org.openqa.selenium.By;

import com.ibm.CNNC.elements.CommonClass;
import com.selenium.utils.WebDriver;
import com.selenium.utils.WebElement;

public class CommonSearchConditionPage {
	protected WebDriver driver;
	private static final String typeSelect_XPath="//descendant::div[contains(@class,'searchCondition')]/descendant::span[normalize-space(text())='文件类型']/../../descendant::div[contains(@id,'widget_dijit_form_FilteringSelect')]";
	private static final String documentCode_XPath="//descendant::div[contains(@class,'searchCondition')]/descendant::span[normalize-space(text())='文件代码']/../../descendant::input[contains(@id,'dijit_form_ValidationTextBox')]";
	private static final String documentTitle_XPath="//descendant::div[contains(@class,'searchCondition')]/descendant::span[normalize-space(text())='文件中文题名']/../../descendant::input[contains(@id,'dijit_form_ValidationTextBox')]";
	private static final String searchButton_XPath="//descendant::div[contains(@class,'searchCondition')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"搜索"+"']";
	private static final String resetButton_XPath="//descendant::div[contains(@class,'searchCondition')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"重置"+"']";

	
	public CommonSearchConditionPage (WebDriver driver){
		this.driver=driver;
	}
	
	public void typeselect_select(String selectStr){
		WebElement typeselect=driver.findElement(By.xpath(typeSelect_XPath)).findVisibleElement(By.xpath(typeSelect_XPath));
		typeselect.click();
		WebElement comboboxNameArrow =driver.findElement(By.xpath(typeSelect_XPath+"/descendant::input[contains(@class,'ArrowButton')]")).findVisibleElement(By.xpath(typeSelect_XPath+"/descendant::input[contains(@class,'ArrowButton')]"));
		comboboxNameArrow.click();
		CommonClass.implicitWait(driver);
		WebElement mySelectItem=driver.findElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']")).findVisibleElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']"));
		mySelectItem.click();
	}
	public void documentcode_input(String inputStr){
		WebElement searchText=driver.findElement(By.xpath(documentCode_XPath)).findVisibleElement(By.xpath(documentCode_XPath));
		searchText.click();
		searchText.clear();
		searchText.sendKeys(inputStr);
	}
	public void documenttitle_input(String inputStr){
		WebElement searchText=driver.findElement(By.xpath(documentTitle_XPath)).findVisibleElement(By.xpath(documentTitle_XPath));
		searchText.click();
		searchText.clear();
		searchText.sendKeys(inputStr);
	}
	public void searchButton_click(){
		WebElement searchButton = driver.findElement(By.xpath(searchButton_XPath)).findVisibleElement(By.xpath(searchButton_XPath));
		searchButton.click();
	}
	
	public void resetButton_click(){
		WebElement resetButton = driver.findElement(By.xpath(resetButton_XPath)).findVisibleElement(By.xpath(resetButton_XPath));
		resetButton.click();
	}

}
