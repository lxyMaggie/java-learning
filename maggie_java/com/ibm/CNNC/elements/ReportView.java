package com.ibm.CNNC.elements;

import org.openqa.selenium.*;
import com.selenium.utils.WebDriver;
import com.selenium.utils.WebElement;

/*catalog\widget\layout\templates\ReportView.html*/
public class ReportView {
	protected WebDriver driver;
	private static final String StackContainer_Tabs_XPath="//descendant::div[contains(@id,'ReportView')]/descendant::*[contains(@id,'MainPane')]/descendant::div[contains(@id,'dijit_layout_TabContainer')]";
	private static final String deptselect_XPath="//descendant::div[contains(@id,'ReportView')]/descendant::*[contains(@id,'MainPane')]/descendant::*[contains(@id,'DataReport')]/descendant::span[normalize-space(text())='业务处室']/../../descendant::div[contains(@id,'widget_dijit_form_FilteringSelect')]";
	private static final String unitselect_XPath="//descendant::div[contains(@id,'ReportView')]/descendant::*[contains(@id,'MainPane')]/descendant::*[contains(@id,'DataReport')]/descendant::span[normalize-space(text())='业务单位']/../../descendant::div[contains(@id,'widget_dijit_form_FilteringSelect')]";
	private static final String searchBtn_XPath="//descendant::div[contains(@id,'ReportView')]/descendant::*[contains(@id,'MainPane')]/descendant::*[contains(@id,'DataReport')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"GO"+"']";

	//----Constructor Methods Begin----
	public ReportView(WebDriver driver){
		this.driver=driver;
	}

	/*ReportView->MainPane->stackContainer*/
	public void StackContainer_Tabs_click(String tabName){
		WebElement StackContainer_Tabs = driver.findElement(By.xpath(StackContainer_Tabs_XPath+"/descendant::div[contains(@id,'tablist')]/descendant::div[contains(@class,'TabListWrapper')]/descendant::span[normalize-space(text())='"+tabName+"']")).findVisibleElement(By.xpath(StackContainer_Tabs_XPath+"/descendant::div[contains(@id,'tablist')]/descendant::div[contains(@class,'TabListWrapper')]/descendant::span[normalize-space(text())='"+tabName+"']"));
		StackContainer_Tabs.click();
	}

	/*ReportView->MainPane->stackContainer*/
	public void StackContainer_Tabs_close(String tabName){
		WebElement StackContainer_Tabs = driver.findElement(By.xpath(StackContainer_Tabs_XPath+"/descendant::div[contains(@id,'tablist')]/descendant::div[contains(@class,'TabListWrapper')]/descendant::span[normalize-space(text())='"+tabName+"']/following-sibling::span[contains(@class,'TabCloseButton')]")).findVisibleElement(By.xpath(StackContainer_Tabs_XPath+"/descendant::div[contains(@id,'tablist')]/descendant::div[contains(@class,'TabListWrapper')]/descendant::span[normalize-space(text())='"+tabName+"']/following-sibling::span[contains(@class,'TabCloseButton')]"));
		StackContainer_Tabs.click();
	}

	/*ReportView->MainPane->stackContainer*/
	public WebElement get_StackContainer_Tabs_Self(String tabName){
		return driver.findElement(By.xpath(StackContainer_Tabs_XPath+"/descendant::div[contains(@id,'tablist')]/descendant::div[contains(@class,'TabListWrapper')]/descendant::span[normalize-space(text())='"+tabName+"']")).findVisibleElement(By.xpath(StackContainer_Tabs_XPath+"/descendant::div[contains(@id,'tablist')]/descendant::div[contains(@class,'TabListWrapper')]/descendant::span[normalize-space(text())='"+tabName+"']"));
	}

	/*ReportView->MainPane->stackContainer*/
	public WebElement get_StackContainer_Tabsclose_Self(String tabName){
		return driver.findElement(By.xpath(StackContainer_Tabs_XPath+"/descendant::div[contains(@id,'tablist')]/descendant::div[contains(@class,'TabListWrapper')]/descendant::span[normalize-space(text())='"+tabName+"']/following-sibling::span[contains(@class,'TabCloseButton')]")).findVisibleElement(By.xpath(StackContainer_Tabs_XPath+"/descendant::div[contains(@id,'tablist')]/descendant::div[contains(@class,'TabListWrapper')]/descendant::span[normalize-space(text())='"+tabName+"']/following-sibling::span[contains(@class,'TabCloseButton')]"));
	}

	/*ReportView->MainPane->DataReport->deptselect*/
	public void deptselect_input(String inputStr){
		WebElement deptselect=driver.findElement(By.xpath(deptselect_XPath+"/descendant::input[contains(@role,'textbox')]")).findVisibleElement(By.xpath(deptselect_XPath+"/descendant::input[contains(@role,'textbox')]"));
		deptselect.click();
		deptselect.clear();
		deptselect.sendKeys(inputStr);
	}

	/*ReportView->MainPane->DataReport->deptselect*/
	public void deptselect_select(String selectStr){
		WebElement deptselect=driver.findElement(By.xpath(deptselect_XPath)).findVisibleElement(By.xpath(deptselect_XPath));
		deptselect.click();
		WebElement comboboxNameArrow =driver.findElement(By.xpath(deptselect_XPath+"/descendant::input[contains(@class,'ArrowButton')]")).findVisibleElement(By.xpath(deptselect_XPath+"/descendant::input[contains(@class,'ArrowButton')]"));
		comboboxNameArrow.click();
		CommonClass.implicitWait(driver);
		WebElement mySelectItem=driver.findElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']")).findVisibleElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']"));
		mySelectItem.click();
	}

	/*ReportView->MainPane->DataReport->deptselect*/
	public WebElement get_deptselect_input_Self(){
		return driver.findElement(By.xpath(deptselect_XPath+"/descendant::input[contains(@role,'textbox')]")).findVisibleElement(By.xpath(deptselect_XPath+"/descendant::input[contains(@role,'textbox')]"));
	}

	/*ReportView->MainPane->DataReport->deptselect*/
	public WebElement get_deptselect_selectItem_Self(String selectStr){
		WebElement deptselect=driver.findElement(By.xpath(deptselect_XPath)).findVisibleElement(By.xpath(deptselect_XPath));
		deptselect.click();
		WebElement comboboxNameArrow =driver.findElement(By.xpath(deptselect_XPath+"/descendant::input[contains(@class,'ArrowButton')]")).findVisibleElement(By.xpath(deptselect_XPath+"/descendant::input[contains(@class,'ArrowButton')]"));
		comboboxNameArrow.click();
		CommonClass.implicitWait(driver);
		return driver.findElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']")).findVisibleElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']"));
	}

	/*ReportView->MainPane->DataReport->unitselect*/
	public void unitselect_input(String inputStr){
		WebElement unitselect=driver.findElement(By.xpath(unitselect_XPath+"/descendant::input[contains(@role,'textbox')]")).findVisibleElement(By.xpath(unitselect_XPath+"/descendant::input[contains(@role,'textbox')]"));
		unitselect.click();
		unitselect.clear();
		unitselect.sendKeys(inputStr);
	}

	/*ReportView->MainPane->DataReport->unitselect*/
	public void unitselect_select(String selectStr){
		WebElement unitselect=driver.findElement(By.xpath(unitselect_XPath)).findVisibleElement(By.xpath(unitselect_XPath));
		unitselect.click();
		WebElement comboboxNameArrow =driver.findElement(By.xpath(unitselect_XPath+"/descendant::input[contains(@class,'ArrowButton')]")).findVisibleElement(By.xpath(unitselect_XPath+"/descendant::input[contains(@class,'ArrowButton')]"));
		comboboxNameArrow.click();
		CommonClass.implicitWait(driver);
		WebElement mySelectItem=driver.findElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']")).findVisibleElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']"));
		mySelectItem.click();
	}

	/*ReportView->MainPane->DataReport->unitselect*/
	public WebElement get_unitselect_input_Self(){
		return driver.findElement(By.xpath(unitselect_XPath+"/descendant::input[contains(@role,'textbox')]")).findVisibleElement(By.xpath(unitselect_XPath+"/descendant::input[contains(@role,'textbox')]"));
	}

	/*ReportView->MainPane->DataReport->unitselect*/
	public WebElement get_unitselect_selectItem_Self(String selectStr){
		WebElement unitselect=driver.findElement(By.xpath(unitselect_XPath)).findVisibleElement(By.xpath(unitselect_XPath));
		unitselect.click();
		WebElement comboboxNameArrow =driver.findElement(By.xpath(unitselect_XPath+"/descendant::input[contains(@class,'ArrowButton')]")).findVisibleElement(By.xpath(unitselect_XPath+"/descendant::input[contains(@class,'ArrowButton')]"));
		comboboxNameArrow.click();
		CommonClass.implicitWait(driver);
		return driver.findElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']")).findVisibleElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']"));
	}

	/*ReportView->MainPane->DataReport->searchBtn*/
	public void searchBtn_click(){
		WebElement searchBtn = driver.findElement(By.xpath(searchBtn_XPath)).findVisibleElement(By.xpath(searchBtn_XPath));
		searchBtn.click();
	}

	/*ReportView->MainPane->DataReport->searchBtn*/
	public WebElement get_searchBtn_Self(){
		return driver.findElement(By.xpath(searchBtn_XPath)).findVisibleElement(By.xpath(searchBtn_XPath));
	}

}
