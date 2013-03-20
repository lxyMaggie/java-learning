package com.ibm.CNNC.elements;

import org.openqa.selenium.*;
import com.selenium.utils.WebDriver;
import com.selenium.utils.WebElement;

/*catalog\widget\dm\common\advancedsearch\templates\AdvancedSearch.html*/
public class AdvancedSearch {
	protected WebDriver driver;
	private static final String deptselect_XPath="//descendant::div[contains(@id,'AdvancedSearch')]/descendant::span[normalize-space(text())='¿âÑ¡Ôñ']/../../descendant::div[contains(@id,'widget_dijit_form_FilteringSelect')]";
	private static final String saveTemplate_XPath="//descendant::div[contains(@id,'AdvancedSearch')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"±£´æ"+"']";
	private static final String resetBtn_XPath="//descendant::div[contains(@id,'AdvancedSearch')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"ÖØÖÃ"+"']";
	private static final String searchBtn_XPath="//descendant::div[contains(@id,'AdvancedSearch')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"ËÑË÷"+"']";

	//----Constructor Methods Begin----
	public AdvancedSearch(WebDriver driver){
		this.driver=driver;
	}

	/*AdvancedSearch->deptselect*/
	public void deptselect_input(String inputStr){
		WebElement deptselect=driver.findElement(By.xpath(deptselect_XPath+"/descendant::input[contains(@role,'textbox')]")).findVisibleElement(By.xpath(deptselect_XPath+"/descendant::input[contains(@role,'textbox')]"));
		deptselect.click();
		deptselect.clear();
		deptselect.sendKeys(inputStr);
	}

	/*AdvancedSearch->deptselect*/
	public void deptselect_select(String selectStr){
		WebElement deptselect=driver.findElement(By.xpath(deptselect_XPath)).findVisibleElement(By.xpath(deptselect_XPath));
		deptselect.click();
		WebElement comboboxNameArrow =driver.findElement(By.xpath(deptselect_XPath+"/descendant::input[contains(@class,'ArrowButton')]")).findVisibleElement(By.xpath(deptselect_XPath+"/descendant::input[contains(@class,'ArrowButton')]"));
		comboboxNameArrow.click();
		CommonClass.implicitWait(driver);
		WebElement mySelectItem=driver.findElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']")).findVisibleElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']"));
		mySelectItem.click();
	}

	/*AdvancedSearch->deptselect*/
	public WebElement get_deptselect_input_Self(){
		return driver.findElement(By.xpath(deptselect_XPath+"/descendant::input[contains(@role,'textbox')]")).findVisibleElement(By.xpath(deptselect_XPath+"/descendant::input[contains(@role,'textbox')]"));
	}

	/*AdvancedSearch->deptselect*/
	public WebElement get_deptselect_selectItem_Self(String selectStr){
		WebElement deptselect=driver.findElement(By.xpath(deptselect_XPath)).findVisibleElement(By.xpath(deptselect_XPath));
		deptselect.click();
		WebElement comboboxNameArrow =driver.findElement(By.xpath(deptselect_XPath+"/descendant::input[contains(@class,'ArrowButton')]")).findVisibleElement(By.xpath(deptselect_XPath+"/descendant::input[contains(@class,'ArrowButton')]"));
		comboboxNameArrow.click();
		CommonClass.implicitWait(driver);
		return driver.findElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']")).findVisibleElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']"));
	}

	/*AdvancedSearch->saveTemplate*/
	public void saveTemplate_click(){
		WebElement saveTemplate = driver.findElement(By.xpath(saveTemplate_XPath)).findVisibleElement(By.xpath(saveTemplate_XPath));
		saveTemplate.click();
	}

	/*AdvancedSearch->saveTemplate*/
	public WebElement get_saveTemplate_Self(){
		return driver.findElement(By.xpath(saveTemplate_XPath)).findVisibleElement(By.xpath(saveTemplate_XPath));
	}

	/*AdvancedSearch->resetBtn*/
	public void resetBtn_click(){
		WebElement resetBtn = driver.findElement(By.xpath(resetBtn_XPath)).findVisibleElement(By.xpath(resetBtn_XPath));
		resetBtn.click();
	}

	/*AdvancedSearch->resetBtn*/
	public WebElement get_resetBtn_Self(){
		return driver.findElement(By.xpath(resetBtn_XPath)).findVisibleElement(By.xpath(resetBtn_XPath));
	}

	/*AdvancedSearch->searchBtn*/
	public void searchBtn_click(){
		WebElement searchBtn = driver.findElement(By.xpath(searchBtn_XPath)).findVisibleElement(By.xpath(searchBtn_XPath));
		searchBtn.click();
	}

	/*AdvancedSearch->searchBtn*/
	public WebElement get_searchBtn_Self(){
		return driver.findElement(By.xpath(searchBtn_XPath)).findVisibleElement(By.xpath(searchBtn_XPath));
	}

}
