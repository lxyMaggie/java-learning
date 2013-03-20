package com.ibm.CNNC.elements;

import org.openqa.selenium.*;
import java.util.List;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.selenium.utils.WebDriver;
import com.selenium.utils.WebElement;

import com.thoughtworks.selenium.Selenium;

/*catalog\widget\layout\templates\DocManageView.html*/
public class DocManageView {
	protected WebDriver driver;
	protected Selenium selenium;
	private static final String Tabs_XPath="//descendant::div[contains(@id,'DocManageView')]/descendant::*[contains(@id,'MainPane')]/descendant::div[contains(@id,'dijit_layout_TabContainer')]";
	private static final String RowSelect_XPath="//descendant::table[contains(@class, 'dojoxGridRowTable')]";
	private static final String RowTable_XPath="//descendant::div[contains(@id,'dijit_layout_ContentPane')]/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]";
	private static final String RowDistribute_XPath="//descendant::div[contains(@id,'ContentPane')]/descendant::div[contains(@id,'grid__View')]/descendant::div[contains(@class,'GridRow')]";

	//----Constructor Methods Begin----
	public DocManageView(WebDriver driver){
		this.driver=driver;
	}
	public DocManageView(Selenium selenium){
		this.selenium=selenium;
	}
	public void RowDistributeSelect_click(String tabName){
		WebElement RowSelect = driver.findElement(By.xpath(RowDistribute_XPath+"/descendant::td[normalize-space(text())='"+tabName+"']")).findVisibleElement(By.xpath(RowDistribute_XPath+"/descendant::td[normalize-space(text())='"+tabName+"']"));
		RowSelect.click();
	}
	public WebElement get_RowDistributeSelect_Self(String tabName){
		return driver.findElement(By.xpath(RowDistribute_XPath+"/descendant::td[normalize-space(text())='"+tabName+"']")).findVisibleElement(By.xpath(RowDistribute_XPath+"/descendant::td[normalize-space(text())='"+tabName+"']"));
	}
	/*DocManageView->MainPane->stackContainer*/
	public void Tabs_click(String tabName){
		WebElement Tabs = driver.findElement(By.xpath(Tabs_XPath+"/descendant::div[contains(@id,'tablist')]/descendant::div[contains(@class,'TabListWrapper')]/descendant::span[normalize-space(text())='"+tabName+"']")).findVisibleElement(By.xpath(Tabs_XPath+"/descendant::div[contains(@id,'tablist')]/descendant::div[contains(@class,'TabListWrapper')]/descendant::span[normalize-space(text())='"+tabName+"']"));
		Tabs.click();
	}

	/*DocManageView->MainPane->stackContainer*/
	public void Tabs_close(String tabName){
		WebElement Tabs = driver.findElement(By.xpath(Tabs_XPath+"/descendant::div[contains(@id,'tablist')]/descendant::div[contains(@class,'TabListWrapper')]/descendant::span[normalize-space(text())='"+tabName+"']/following-sibling::span[contains(@class,'TabCloseButton')]")).findVisibleElement(By.xpath(Tabs_XPath+"/descendant::div[contains(@id,'tablist')]/descendant::div[contains(@class,'TabListWrapper')]/descendant::span[normalize-space(text())='"+tabName+"']/following-sibling::span[contains(@class,'TabCloseButton')]"));
		Tabs.click();
	}

	/*DocManageView->MainPane->stackContainer*/
	public WebElement get_Tabs_Self(String tabName){
		return driver.findElement(By.xpath(Tabs_XPath+"/descendant::div[contains(@id,'tablist')]/descendant::div[contains(@class,'TabListWrapper')]/descendant::span[normalize-space(text())='"+tabName+"']")).findVisibleElement(By.xpath(Tabs_XPath+"/descendant::div[contains(@id,'tablist')]/descendant::div[contains(@class,'TabListWrapper')]/descendant::span[normalize-space(text())='"+tabName+"']"));
	}

	/*DocManageView->MainPane->stackContainer*/
	public WebElement get_Tabsclose_Self(String tabName){
		return driver.findElement(By.xpath(Tabs_XPath+"/descendant::div[contains(@id,'tablist')]/descendant::div[contains(@class,'TabListWrapper')]/descendant::span[normalize-space(text())='"+tabName+"']/following-sibling::span[contains(@class,'TabCloseButton')]")).findVisibleElement(By.xpath(Tabs_XPath+"/descendant::div[contains(@id,'tablist')]/descendant::div[contains(@class,'TabListWrapper')]/descendant::span[normalize-space(text())='"+tabName+"']/following-sibling::span[contains(@class,'TabCloseButton')]"));
	}
	public void RowSelect_click(String tabName){
		WebElement RowSelect = driver.findElement(By.xpath(RowSelect_XPath+"//descendant::div[contains(@title,'"+tabName+"')]")).findVisibleElement(By.xpath(RowSelect_XPath+"//descendant::div[contains(@title,'"+tabName+"')]"));
		RowSelect.click();
	}
	public WebElement get_RowSelect_Self(String tabName){
		return driver.findElement(By.xpath(RowSelect_XPath+"//descendant::div[contains(@title,'"+tabName+"')]")).findVisibleElement(By.xpath(RowSelect_XPath+"//descendant::div[contains(@title,'"+tabName+"')]"));
	}
	//row select "right-clicked"
	public void RowSelect_rightclick(String tabName){
		WebElement RowSelect = driver.findElement(By.xpath(RowSelect_XPath+"//descendant::div[contains(@title,'"+tabName+"')]")).findVisibleElement(By.xpath(RowSelect_XPath+"//descendant::div[contains(@title,'"+tabName+"')]"));
		Actions action=new Actions(driver.getDriver());
		action.contextClick(RowSelect).perform();
	}
	//select all rows
	public void AllRowSelect_select(){
		List<WebElement> Gridrows= driver.findAll(By.xpath(RowTable_XPath));
		for(WebElement w : Gridrows){
			w.click();
		}
		
	}
	public WebElement get_AllRowSelect_Self(String tabName2){
		return driver.findElement(By.xpath(RowSelect_XPath+"//descendant::div[contains(@title,'"+tabName2+"')]")).findVisibleElement(By.xpath(RowSelect_XPath+"//descendant::div[contains(@title,'"+tabName2+"')]"));	}

	

}
