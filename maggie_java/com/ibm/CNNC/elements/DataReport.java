package com.ibm.CNNC.elements;

import org.openqa.selenium.*;
import com.selenium.utils.WebDriver;
import com.selenium.utils.WebElement;

/*catalog\widget\dm\report\datareport\templates\DataReport.html*/
public class DataReport {
	protected WebDriver driver;
	private static final String deptselect_XPath="//descendant::div[contains(@id,'DataReport')]/descendant::span[normalize-space(text())='业务处室']/../../descendant::div[contains(@id,'widget_dijit_form_FilteringSelect')]";
	private static final String unitselect_XPath="//descendant::div[contains(@id,'DataReport')]/descendant::span[normalize-space(text())='业务单位']/../../descendant::div[contains(@id,'widget_dijit_form_FilteringSelect')]";
	private static final String searchBtn_XPath="//descendant::div[contains(@id,'DataReport')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"GO"+"']";

	//----Constructor Methods Begin----
	public DataReport(WebDriver driver){
		this.driver=driver;
	}

	/*DataReport->deptselect*/
	public void deptselect_input(String inputStr){
		WebElement deptselect=driver.findElement(By.xpath(deptselect_XPath+"/descendant::input[contains(@role,'textbox')]")).findVisibleElement(By.xpath(deptselect_XPath+"/descendant::input[contains(@role,'textbox')]"));
		deptselect.click();
		deptselect.clear();
		deptselect.sendKeys(inputStr);
	}

	/*DataReport->deptselect*/
	public void deptselect_select(String selectStr){
		WebElement deptselect=driver.findElement(By.xpath(deptselect_XPath)).findVisibleElement(By.xpath(deptselect_XPath));
		deptselect.click();
		WebElement comboboxNameArrow =driver.findElement(By.xpath(deptselect_XPath+"/descendant::input[contains(@class,'ArrowButton')]")).findVisibleElement(By.xpath(deptselect_XPath+"/descendant::input[contains(@class,'ArrowButton')]"));
		comboboxNameArrow.click();
		CommonClass.implicitWait(driver);
		WebElement mySelectItem=driver.findElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']")).findVisibleElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']"));
		mySelectItem.click();
	}

	/*DataReport->deptselect*/
	public WebElement get_deptselect_input_Self(){
		return driver.findElement(By.xpath(deptselect_XPath+"/descendant::input[contains(@role,'textbox')]")).findVisibleElement(By.xpath(deptselect_XPath+"/descendant::input[contains(@role,'textbox')]"));
	}

	/*DataReport->deptselect*/
	public WebElement get_deptselect_selectItem_Self(String selectStr){
		WebElement deptselect=driver.findElement(By.xpath(deptselect_XPath)).findVisibleElement(By.xpath(deptselect_XPath));
		deptselect.click();
		WebElement comboboxNameArrow =driver.findElement(By.xpath(deptselect_XPath+"/descendant::input[contains(@class,'ArrowButton')]")).findVisibleElement(By.xpath(deptselect_XPath+"/descendant::input[contains(@class,'ArrowButton')]"));
		comboboxNameArrow.click();
		CommonClass.implicitWait(driver);
		return driver.findElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']")).findVisibleElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']"));
	}

	/*DataReport->unitselect*/
	public void unitselect_input(String inputStr){
		WebElement unitselect=driver.findElement(By.xpath(unitselect_XPath+"/descendant::input[contains(@role,'textbox')]")).findVisibleElement(By.xpath(unitselect_XPath+"/descendant::input[contains(@role,'textbox')]"));
		unitselect.click();
		unitselect.clear();
		unitselect.sendKeys(inputStr);
	}

	/*DataReport->unitselect*/
	public void unitselect_select(String selectStr){
		WebElement unitselect=driver.findElement(By.xpath(unitselect_XPath)).findVisibleElement(By.xpath(unitselect_XPath));
		unitselect.click();
		WebElement comboboxNameArrow =driver.findElement(By.xpath(unitselect_XPath+"/descendant::input[contains(@class,'ArrowButton')]")).findVisibleElement(By.xpath(unitselect_XPath+"/descendant::input[contains(@class,'ArrowButton')]"));
		comboboxNameArrow.click();
		CommonClass.implicitWait(driver);
		WebElement mySelectItem=driver.findElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']")).findVisibleElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']"));
		mySelectItem.click();
	}

	/*DataReport->unitselect*/
	public WebElement get_unitselect_input_Self(){
		return driver.findElement(By.xpath(unitselect_XPath+"/descendant::input[contains(@role,'textbox')]")).findVisibleElement(By.xpath(unitselect_XPath+"/descendant::input[contains(@role,'textbox')]"));
	}

	/*DataReport->unitselect*/
	public WebElement get_unitselect_selectItem_Self(String selectStr){
		WebElement unitselect=driver.findElement(By.xpath(unitselect_XPath)).findVisibleElement(By.xpath(unitselect_XPath));
		unitselect.click();
		WebElement comboboxNameArrow =driver.findElement(By.xpath(unitselect_XPath+"/descendant::input[contains(@class,'ArrowButton')]")).findVisibleElement(By.xpath(unitselect_XPath+"/descendant::input[contains(@class,'ArrowButton')]"));
		comboboxNameArrow.click();
		CommonClass.implicitWait(driver);
		return driver.findElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']")).findVisibleElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']"));
	}

	/*DataReport->searchBtn*/
	public void searchBtn_click(){
		WebElement searchBtn = driver.findElement(By.xpath(searchBtn_XPath)).findVisibleElement(By.xpath(searchBtn_XPath));
		searchBtn.click();
	}

	/*DataReport->searchBtn*/
	public WebElement get_searchBtn_Self(){
		return driver.findElement(By.xpath(searchBtn_XPath)).findVisibleElement(By.xpath(searchBtn_XPath));
	}

}
