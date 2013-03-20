package com.ibm.CNNC.page;

import org.openqa.selenium.By;

import com.ibm.CNNC.elements.CommonClass;
import com.selenium.utils.WebDriver;
import com.selenium.utils.WebElement;

public class AdvancedSearchPage extends CheckBoxTreeView {

	private static final String repositorySelect_XPath="//descendant::div[contains(@id,'AdvancedSearch')]/descendant::span[normalize-space(text())='库选择']/../../descendant::div[contains(@id,'widget_dijit_form_FilteringSelect')]";
	private static final String typeSelect_XPath= "//descendant::div[contains(@id,'AdvancedSearch')]/descendant::span[normalize-space(text())='文件类型']/../../descendant::div[contains(@id,'widget_com_ibm_ecm_nuclear_common_core_dijit_form_SearchTextBox')]";
	private static final String typeSelect_OKButton_XPath="//descendant::div[contains(@id,'widget_com_ibm_ecm_nuclear_common_core_dijit_form_SearchTextBox')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"确定"+"']";
	private static final String dataItemSelect_Xpath ="//descendant::div[contains(@id,'AdvancedSearch')]/descendant::span[normalize-space(text())='数据项']/../../descendant::div[contains(@id,'widget_dijit_form_FilteringSelect')]";
	private static final String dataConditionSelect_Xpath ="//descendant::div[contains(@id,'AdvancedSearch')]/descendant::span[normalize-space(text())='条件']/../../descendant::div[contains(@id,'widget_dijit_form_FilteringSelect')]";

	// private static final String   dataItemSelect_Xpath ="//descendant::div[contains(@id,'AdvancedSearch')]/descendant::input[@value='']/../../../descendant::div[contains(@id,'widget_dijit_form_FilteringSelect')]";

	// private static final String   dataItemSelect_Xpath ="(//descendant::div[contains(@id,'AdvancedSearch')]/descendant::div[contains(@id,'widget_dijit_form_FilteringSelect')])[last()]";
	//private static final String   dataItemSelect_Xpath ="//descendant::div[contains(@id,'AdvancedSearch')]/descendant::div[contains(@id,'widget_dijit_form_FilteringSelect')]";
	//返回为一个值，如何得到一个集合

	//----Constructor Methods Begin----
	public AdvancedSearchPage(WebDriver driver){
		super(driver);
	}

	public void repositoryselect_select(String selectStr){
		WebElement typeselect=driver.findElement(By.xpath(repositorySelect_XPath)).findVisibleElement(By.xpath(repositorySelect_XPath));
		typeselect.click();
		WebElement comboboxNameArrow =driver.findElement(By.xpath(repositorySelect_XPath+"/descendant::input[contains(@class,'ArrowButton')]")).findVisibleElement(By.xpath(repositorySelect_XPath+"/descendant::input[contains(@class,'ArrowButton')]"));
		comboboxNameArrow.click();
		CommonClass.implicitWait(driver);
		WebElement mySelectItem=driver.findElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']")).findVisibleElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']"));
		mySelectItem.click();
	}

	public void typeselect_click(){
		WebElement typeselect=driver.findElement(By.xpath(typeSelect_XPath)).findVisibleElement(By.xpath(typeSelect_XPath));
		typeselect.click();
		WebElement comboboxNameArrow =driver.findElement(By.xpath(typeSelect_XPath+"/descendant::input[contains(@class,'ArrowButton')]")).findVisibleElement(By.xpath(typeSelect_XPath+"/descendant::input[contains(@class,'ArrowButton')]"));
		comboboxNameArrow.click();
		CommonClass.implicitWait(driver);
		//	WebElement mySelectItem=driver.findElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']")).findVisibleElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']"));
		//	mySelectItem.click();
	}  

	public void typeSelect_OKButton_click(){
		WebElement onSecondSearch = driver.findElement(By.xpath(typeSelect_OKButton_XPath)).findVisibleElement(By.xpath(typeSelect_OKButton_XPath));
		onSecondSearch.click();
	}

	public void dataItemSelect_select(String selectStr){
		WebElement typeselect=driver.findElement(By.xpath(dataItemSelect_Xpath)).findVisibleElement(By.xpath(dataItemSelect_Xpath));
		typeselect.click();
		WebElement comboboxNameArrow =driver.findElement(By.xpath(dataItemSelect_Xpath+"/descendant::input[contains(@class,'ArrowButton')]")).findVisibleElement(By.xpath(dataItemSelect_Xpath+"/descendant::input[contains(@class,'ArrowButton')]"));
		comboboxNameArrow.click();
		CommonClass.implicitWait(driver);
		WebElement mySelectItem=driver.findElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']")).findVisibleElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']"));
		mySelectItem.click();
	}
	public void dataConditionSelect_select(String selectStr){
		WebElement typeselect=driver.findElement(By.xpath(dataConditionSelect_Xpath)).findVisibleElement(By.xpath(dataConditionSelect_Xpath));
		typeselect.click();
		WebElement comboboxNameArrow =driver.findElement(By.xpath(dataConditionSelect_Xpath+"/descendant::input[contains(@class,'ArrowButton')]")).findVisibleElement(By.xpath(dataConditionSelect_Xpath+"/descendant::input[contains(@class,'ArrowButton')]"));
		comboboxNameArrow.click();
		CommonClass.implicitWait(driver);
		WebElement mySelectItem=driver.findElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']")).findVisibleElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']"));
		mySelectItem.click();
	}
	private static final String dataValueselect_Xpath="//descendant::div[contains(@id,'AdvancedSearch')]/descendant::span[normalize-space(text())='值']/../../descendant::div[contains(@id,'SearchTextBox')]";
	private static final String InstituteRowSelect_XPath="//descendant::div[contains(@id,'SelectOrganization')]//descendant::div[contains(@class,'MainPane')]//descendant::div[contains(@id,'dijit_layout_ContentPane')]//descendant::div[contains(@id,'TreeNode')]";
	private static final String InstituteSelectButton_XPath="//descendant::div[contains(@id,'SelectOrganization')]//descendant::div[contains(@class,'MainPane')]//descendant::span[contains(@class,'dijitButton')]//descendant::span[contains(@id,'dijit_form_Button')]//descendant::span[contains(@class,'toRightButton')]";
	private static final String InstituteConfirmButton_XPath="//descendant::div[contains(@id,'SelectOrganization')]//descendant::div[contains(@class,'MainPane')]//descendant::div[contains(@id,'dijit_layout_ContentPane')]//descendant::span[contains(@id,'Button')]//descendant::span[normalize-space(text())='确定']";
	public void dataValueSelect_select(String selectStr){
		WebElement typeselect=driver.findElement(By.xpath(dataValueselect_Xpath)).findVisibleElement(By.xpath(dataValueselect_Xpath));
		typeselect.click();
		WebElement comboboxNameArrow =driver.findElement(By.xpath(dataValueselect_Xpath+"/descendant::input[contains(@class,'ArrowButton')]")).findVisibleElement(By.xpath(dataValueselect_Xpath+"/descendant::input[contains(@class,'ArrowButton')]"));
		comboboxNameArrow.click();
		CommonClass.implicitWait(driver);
		WebElement mySelectItem=driver.findElement(By.xpath(InstituteRowSelect_XPath+"//descendant::span[normalize-space(text())='"+selectStr+"']")).findVisibleElement(By.xpath(InstituteRowSelect_XPath+"//descendant::span[normalize-space(text())='"+selectStr+"']"));
		mySelectItem.click();
		WebElement Selectbutton=driver.findElement(By.xpath(InstituteSelectButton_XPath)).findVisibleElement(By.xpath(InstituteSelectButton_XPath));
		Selectbutton.click();
		CommonClass.implicitWait(driver);
		WebElement OKbutton=driver.findElement(By.xpath(InstituteConfirmButton_XPath)).findVisibleElement(By.xpath(InstituteConfirmButton_XPath));//确认button
		OKbutton.click();
	}
	private static final String AdvancedSearchConfirm_XPath="//descendant::div[contains(@id,'AdvancedSearch')]/descendant::span[normalize-space(text())='"+"搜索"+"']";
	public void AdvancedSearchConfirmButton_click(){
		WebElement onSecondSearch = driver.findElement(By.xpath(AdvancedSearchConfirm_XPath)).findVisibleElement(By.xpath(AdvancedSearchConfirm_XPath));
		onSecondSearch.click();
	}
}
