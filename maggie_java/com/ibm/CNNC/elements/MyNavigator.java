package com.ibm.CNNC.elements;

import org.openqa.selenium.*;
import com.selenium.utils.WebDriver;
import com.selenium.utils.WebElement;

/*catalog\widget\dm\searchuse\mynavigator\templates\MyNavigator.html*/
public class MyNavigator {
	protected WebDriver driver;
	private static final String firstLevelSelect_XPath="//descendant::div[contains(@id,'MyNavigator')]/descendant::span[normalize-space(text())='一级分类']/../../descendant::div[contains(@id,'widget_dijit_form_FilteringSelect')]";
	private static final String secondLevelSelect_XPath="//descendant::div[contains(@id,'MyNavigator')]/descendant::span[normalize-space(text())='二级分类']/../../descendant::div[contains(@id,'widget_dijit_form_FilteringSelect')]";
	private static final String thirdLevelSelect_XPath="//descendant::div[contains(@id,'MyNavigator')]/descendant::span[normalize-space(text())='三级分类']/../../descendant::div[contains(@id,'widget_dijit_form_FilteringSelect')]";
	private static final String fourthLevelSelect_XPath="//descendant::div[contains(@id,'MyNavigator')]/descendant::span[normalize-space(text())='四级分类']/../../descendant::div[contains(@id,'widget_dijit_form_FilteringSelect')]";
	private static final String submitMyNavigatorBtn_XPath="//descendant::div[contains(@id,'MyNavigator')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"保存"+"']";

	//----Constructor Methods Begin----
	public MyNavigator(WebDriver driver){
		this.driver=driver;
	}

	/*MyNavigator->firstLevelSelect*/
	public void firstLevelSelect_input(String inputStr){
		WebElement firstLevelSelect=driver.findElement(By.xpath(firstLevelSelect_XPath+"/descendant::input[contains(@role,'textbox')]")).findVisibleElement(By.xpath(firstLevelSelect_XPath+"/descendant::input[contains(@role,'textbox')]"));
		firstLevelSelect.click();
		firstLevelSelect.clear();
		firstLevelSelect.sendKeys(inputStr);
	}

	/*MyNavigator->firstLevelSelect*/
	public void firstLevelSelect_select(String selectStr){
		WebElement firstLevelSelect=driver.findElement(By.xpath(firstLevelSelect_XPath)).findVisibleElement(By.xpath(firstLevelSelect_XPath));
		firstLevelSelect.click();
		WebElement comboboxNameArrow =driver.findElement(By.xpath(firstLevelSelect_XPath+"/descendant::input[contains(@class,'ArrowButton')]")).findVisibleElement(By.xpath(firstLevelSelect_XPath+"/descendant::input[contains(@class,'ArrowButton')]"));
		comboboxNameArrow.click();
		CommonClass.implicitWait(driver);
		WebElement mySelectItem=driver.findElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']")).findVisibleElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']"));
		mySelectItem.click();
	}

	/*MyNavigator->firstLevelSelect*/
	public WebElement get_firstLevelSelect_input_Self(){
		return driver.findElement(By.xpath(firstLevelSelect_XPath+"/descendant::input[contains(@role,'textbox')]")).findVisibleElement(By.xpath(firstLevelSelect_XPath+"/descendant::input[contains(@role,'textbox')]"));
	}

	/*MyNavigator->firstLevelSelect*/
	public WebElement get_firstLevelSelect_selectItem_Self(String selectStr){
		WebElement firstLevelSelect=driver.findElement(By.xpath(firstLevelSelect_XPath)).findVisibleElement(By.xpath(firstLevelSelect_XPath));
		firstLevelSelect.click();
		WebElement comboboxNameArrow =driver.findElement(By.xpath(firstLevelSelect_XPath+"/descendant::input[contains(@class,'ArrowButton')]")).findVisibleElement(By.xpath(firstLevelSelect_XPath+"/descendant::input[contains(@class,'ArrowButton')]"));
		comboboxNameArrow.click();
		CommonClass.implicitWait(driver);
		return driver.findElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']")).findVisibleElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']"));
	}

	/*MyNavigator->secondLevelSelect*/
	public void secondLevelSelect_input(String inputStr){
		WebElement secondLevelSelect=driver.findElement(By.xpath(secondLevelSelect_XPath+"/descendant::input[contains(@role,'textbox')]")).findVisibleElement(By.xpath(secondLevelSelect_XPath+"/descendant::input[contains(@role,'textbox')]"));
		secondLevelSelect.click();
		secondLevelSelect.clear();
		secondLevelSelect.sendKeys(inputStr);
	}

	/*MyNavigator->secondLevelSelect*/
	public void secondLevelSelect_select(String selectStr){
		WebElement secondLevelSelect=driver.findElement(By.xpath(secondLevelSelect_XPath)).findVisibleElement(By.xpath(secondLevelSelect_XPath));
		secondLevelSelect.click();
		WebElement comboboxNameArrow =driver.findElement(By.xpath(secondLevelSelect_XPath+"/descendant::input[contains(@class,'ArrowButton')]")).findVisibleElement(By.xpath(secondLevelSelect_XPath+"/descendant::input[contains(@class,'ArrowButton')]"));
		comboboxNameArrow.click();
		CommonClass.implicitWait(driver);
		WebElement mySelectItem=driver.findElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']")).findVisibleElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']"));
		mySelectItem.click();
	}

	/*MyNavigator->secondLevelSelect*/
	public WebElement get_secondLevelSelect_input_Self(){
		return driver.findElement(By.xpath(secondLevelSelect_XPath+"/descendant::input[contains(@role,'textbox')]")).findVisibleElement(By.xpath(secondLevelSelect_XPath+"/descendant::input[contains(@role,'textbox')]"));
	}

	/*MyNavigator->secondLevelSelect*/
	public WebElement get_secondLevelSelect_selectItem_Self(String selectStr){
		WebElement secondLevelSelect=driver.findElement(By.xpath(secondLevelSelect_XPath)).findVisibleElement(By.xpath(secondLevelSelect_XPath));
		secondLevelSelect.click();
		WebElement comboboxNameArrow =driver.findElement(By.xpath(secondLevelSelect_XPath+"/descendant::input[contains(@class,'ArrowButton')]")).findVisibleElement(By.xpath(secondLevelSelect_XPath+"/descendant::input[contains(@class,'ArrowButton')]"));
		comboboxNameArrow.click();
		CommonClass.implicitWait(driver);
		return driver.findElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']")).findVisibleElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']"));
	}

	/*MyNavigator->thirdLevelSelect*/
	public void thirdLevelSelect_input(String inputStr){
		WebElement thirdLevelSelect=driver.findElement(By.xpath(thirdLevelSelect_XPath+"/descendant::input[contains(@role,'textbox')]")).findVisibleElement(By.xpath(thirdLevelSelect_XPath+"/descendant::input[contains(@role,'textbox')]"));
		thirdLevelSelect.click();
		thirdLevelSelect.clear();
		thirdLevelSelect.sendKeys(inputStr);
	}

	/*MyNavigator->thirdLevelSelect*/
	public void thirdLevelSelect_select(String selectStr){
		WebElement thirdLevelSelect=driver.findElement(By.xpath(thirdLevelSelect_XPath)).findVisibleElement(By.xpath(thirdLevelSelect_XPath));
		thirdLevelSelect.click();
		WebElement comboboxNameArrow =driver.findElement(By.xpath(thirdLevelSelect_XPath+"/descendant::input[contains(@class,'ArrowButton')]")).findVisibleElement(By.xpath(thirdLevelSelect_XPath+"/descendant::input[contains(@class,'ArrowButton')]"));
		comboboxNameArrow.click();
		CommonClass.implicitWait(driver);
		WebElement mySelectItem=driver.findElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']")).findVisibleElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']"));
		mySelectItem.click();
	}

	/*MyNavigator->thirdLevelSelect*/
	public WebElement get_thirdLevelSelect_input_Self(){
		return driver.findElement(By.xpath(thirdLevelSelect_XPath+"/descendant::input[contains(@role,'textbox')]")).findVisibleElement(By.xpath(thirdLevelSelect_XPath+"/descendant::input[contains(@role,'textbox')]"));
	}

	/*MyNavigator->thirdLevelSelect*/
	public WebElement get_thirdLevelSelect_selectItem_Self(String selectStr){
		WebElement thirdLevelSelect=driver.findElement(By.xpath(thirdLevelSelect_XPath)).findVisibleElement(By.xpath(thirdLevelSelect_XPath));
		thirdLevelSelect.click();
		WebElement comboboxNameArrow =driver.findElement(By.xpath(thirdLevelSelect_XPath+"/descendant::input[contains(@class,'ArrowButton')]")).findVisibleElement(By.xpath(thirdLevelSelect_XPath+"/descendant::input[contains(@class,'ArrowButton')]"));
		comboboxNameArrow.click();
		CommonClass.implicitWait(driver);
		return driver.findElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']")).findVisibleElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']"));
	}

	/*MyNavigator->fourthLevelSelect*/
	public void fourthLevelSelect_input(String inputStr){
		WebElement fourthLevelSelect=driver.findElement(By.xpath(fourthLevelSelect_XPath+"/descendant::input[contains(@role,'textbox')]")).findVisibleElement(By.xpath(fourthLevelSelect_XPath+"/descendant::input[contains(@role,'textbox')]"));
		fourthLevelSelect.click();
		fourthLevelSelect.clear();
		fourthLevelSelect.sendKeys(inputStr);
	}

	/*MyNavigator->fourthLevelSelect*/
	public void fourthLevelSelect_select(String selectStr){
		WebElement fourthLevelSelect=driver.findElement(By.xpath(fourthLevelSelect_XPath)).findVisibleElement(By.xpath(fourthLevelSelect_XPath));
		fourthLevelSelect.click();
		WebElement comboboxNameArrow =driver.findElement(By.xpath(fourthLevelSelect_XPath+"/descendant::input[contains(@class,'ArrowButton')]")).findVisibleElement(By.xpath(fourthLevelSelect_XPath+"/descendant::input[contains(@class,'ArrowButton')]"));
		comboboxNameArrow.click();
		CommonClass.implicitWait(driver);
		WebElement mySelectItem=driver.findElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']")).findVisibleElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']"));
		mySelectItem.click();
	}

	/*MyNavigator->fourthLevelSelect*/
	public WebElement get_fourthLevelSelect_input_Self(){
		return driver.findElement(By.xpath(fourthLevelSelect_XPath+"/descendant::input[contains(@role,'textbox')]")).findVisibleElement(By.xpath(fourthLevelSelect_XPath+"/descendant::input[contains(@role,'textbox')]"));
	}

	/*MyNavigator->fourthLevelSelect*/
	public WebElement get_fourthLevelSelect_selectItem_Self(String selectStr){
		WebElement fourthLevelSelect=driver.findElement(By.xpath(fourthLevelSelect_XPath)).findVisibleElement(By.xpath(fourthLevelSelect_XPath));
		fourthLevelSelect.click();
		WebElement comboboxNameArrow =driver.findElement(By.xpath(fourthLevelSelect_XPath+"/descendant::input[contains(@class,'ArrowButton')]")).findVisibleElement(By.xpath(fourthLevelSelect_XPath+"/descendant::input[contains(@class,'ArrowButton')]"));
		comboboxNameArrow.click();
		CommonClass.implicitWait(driver);
		return driver.findElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']")).findVisibleElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']"));
	}

	/*MyNavigator->submitMyNavigatorBtn*/
	public void submitMyNavigatorBtn_click(){
		WebElement submitMyNavigatorBtn = driver.findElement(By.xpath(submitMyNavigatorBtn_XPath)).findVisibleElement(By.xpath(submitMyNavigatorBtn_XPath));
		submitMyNavigatorBtn.click();
	}

	/*MyNavigator->submitMyNavigatorBtn*/
	public WebElement get_submitMyNavigatorBtn_Self(){
		return driver.findElement(By.xpath(submitMyNavigatorBtn_XPath)).findVisibleElement(By.xpath(submitMyNavigatorBtn_XPath));
	}

}
