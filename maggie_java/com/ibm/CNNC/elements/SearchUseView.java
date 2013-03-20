package com.ibm.CNNC.elements;

import org.openqa.selenium.*;
import com.selenium.utils.WebDriver;
import com.selenium.utils.WebElement;

/*catalog\widget\layout\templates\SearchUseView.html*/
public class SearchUseView {
	protected WebDriver driver;
	private static final String Tabs_XPath="//descendant::div[contains(@id,'SearchUseView')]/descendant::*[contains(@id,'MainPane')]/descendant::div[contains(@id,'dijit_layout_TabContainer')]";
	private static final String searchText_XPath="//descendant::div[contains(@id,'SearchUseView')]/descendant::*[contains(@id,'MainPane')]/descendant::input";
	private static final String searchAllContextOption_XPath="//descendant::div[contains(@id,'SearchUseView')]/descendant::*[contains(@id,'MainPane')]/descendant::input[contains(@id,'MainPane')][contains(@id,'_searchAllContextOption')]";
	private static final String onNewSearch_XPath="//descendant::div[contains(@id,'SearchUseView')]/descendant::*[contains(@id,'MainPane')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"ÎÄµµËÑË÷"+"']";

	//----Constructor Methods Begin----
	public SearchUseView(WebDriver driver){
		this.driver=driver;
	}

	/*SearchUseView->MainPane->stackContainer*/
	public void Tabs_click(String tabName){
		WebElement Tabs = driver.findElement(By.xpath(Tabs_XPath+"/descendant::div[contains(@id,'tablist')]/descendant::div[contains(@class,'TabListWrapper')]/descendant::span[normalize-space(text())='"+tabName+"']")).findVisibleElement(By.xpath(Tabs_XPath+"/descendant::div[contains(@id,'tablist')]/descendant::div[contains(@class,'TabListWrapper')]/descendant::span[normalize-space(text())='"+tabName+"']"));
		Tabs.click();
	}

	/*SearchUseView->MainPane->stackContainer*/
	public void Tabs_close(String tabName){
		WebElement Tabs = driver.findElement(By.xpath(Tabs_XPath+"/descendant::div[contains(@id,'tablist')]/descendant::div[contains(@class,'TabListWrapper')]/descendant::span[normalize-space(text())='"+tabName+"']/following-sibling::span[contains(@class,'TabCloseButton')]")).findVisibleElement(By.xpath(Tabs_XPath+"/descendant::div[contains(@id,'tablist')]/descendant::div[contains(@class,'TabListWrapper')]/descendant::span[normalize-space(text())='"+tabName+"']/following-sibling::span[contains(@class,'TabCloseButton')]"));
		Tabs.click();
	}

	/*SearchUseView->MainPane->stackContainer*/
	public WebElement get_Tabs_Self(String tabName){
		return driver.findElement(By.xpath(Tabs_XPath+"/descendant::div[contains(@id,'tablist')]/descendant::div[contains(@class,'TabListWrapper')]/descendant::span[normalize-space(text())='"+tabName+"']")).findVisibleElement(By.xpath(Tabs_XPath+"/descendant::div[contains(@id,'tablist')]/descendant::div[contains(@class,'TabListWrapper')]/descendant::span[normalize-space(text())='"+tabName+"']"));
	}

	/*SearchUseView->MainPane->stackContainer*/
	public WebElement get_Tabsclose_Self(String tabName){
		return driver.findElement(By.xpath(Tabs_XPath+"/descendant::div[contains(@id,'tablist')]/descendant::div[contains(@class,'TabListWrapper')]/descendant::span[normalize-space(text())='"+tabName+"']/following-sibling::span[contains(@class,'TabCloseButton')]")).findVisibleElement(By.xpath(Tabs_XPath+"/descendant::div[contains(@id,'tablist')]/descendant::div[contains(@class,'TabListWrapper')]/descendant::span[normalize-space(text())='"+tabName+"']/following-sibling::span[contains(@class,'TabCloseButton')]"));
	}

	/*SearchUseView->MainPane->searchText*/
	public void searchText_input(String inputStr){
		WebElement searchText=driver.findElement(By.xpath(searchText_XPath)).findVisibleElement(By.xpath(searchText_XPath));
		searchText.click();
		searchText.clear();
		searchText.sendKeys(inputStr);
	}

	/*SearchUseView->MainPane->searchText*/
	public WebElement get_searchText_Self(){
		return driver.findElement(By.xpath(searchText_XPath)).findVisibleElement(By.xpath(searchText_XPath));
	}

	/*SearchUseView->MainPane->searchAllContextOption*/
	public void searchAllContextOption_check(){
		WebElement searchAllContextOption = driver.findElement(By.xpath(searchAllContextOption_XPath)).findVisibleElement(By.xpath(searchAllContextOption_XPath));
		if(!searchAllContextOption.isSelected())
			searchAllContextOption.click();
	}

	/*SearchUseView->MainPane->searchAllContextOption*/
	public void searchAllContextOption_uncheck(){
		WebElement searchAllContextOption = driver.findElement(By.xpath(searchAllContextOption_XPath)).findVisibleElement(By.xpath(searchAllContextOption_XPath));
		if(searchAllContextOption.isSelected())
			searchAllContextOption.click();
	}

	/*SearchUseView->MainPane->searchAllContextOption*/
	public WebElement get_searchAllContextOption_Self(){
		return driver.findElement(By.xpath(searchAllContextOption_XPath)).findVisibleElement(By.xpath(searchAllContextOption_XPath));
	}

	/*SearchUseView->MainPane->onClick:->onNewSearch*/
	public void onNewSearch_click(){
		WebElement onNewSearch = driver.findElement(By.xpath(onNewSearch_XPath)).findVisibleElement(By.xpath(onNewSearch_XPath));
		onNewSearch.click();
	}

	/*SearchUseView->MainPane->onClick:->onNewSearch*/
	public WebElement get_onNewSearch_Self(){
		return driver.findElement(By.xpath(onNewSearch_XPath)).findVisibleElement(By.xpath(onNewSearch_XPath));
	}

}
