package com.ibm.CNNC.elements;

import org.openqa.selenium.*;
import com.selenium.utils.WebDriver;
import com.selenium.utils.WebElement;

/*catalog\widget\layout\templates\LendManageView.html*/
public class LendManageView {
	protected WebDriver driver;
	private static final String Tabs_XPath="//descendant::div[contains(@id,'LendManageView')]/descendant::*[contains(@id,'MainPane')]/descendant::div[contains(@id,'dijit_layout_TabContainer')]";

	//----Constructor Methods Begin----
	public LendManageView(WebDriver driver){
		this.driver=driver;
	}

	/*LendManageView->MainPane->stackContainer*/
	public void Tabs_click(String tabName){
		WebElement Tabs = driver.findElement(By.xpath(Tabs_XPath+"/descendant::div[contains(@id,'tablist')]/descendant::div[contains(@class,'TabListWrapper')]/descendant::span[normalize-space(text())='"+tabName+"']")).findVisibleElement(By.xpath(Tabs_XPath+"/descendant::div[contains(@id,'tablist')]/descendant::div[contains(@class,'TabListWrapper')]/descendant::span[normalize-space(text())='"+tabName+"']"));
		Tabs.click();
	}

	/*LendManageView->MainPane->stackContainer*/
	public void Tabs_close(String tabName){
		WebElement Tabs = driver.findElement(By.xpath(Tabs_XPath+"/descendant::div[contains(@id,'tablist')]/descendant::div[contains(@class,'TabListWrapper')]/descendant::span[normalize-space(text())='"+tabName+"']/following-sibling::span[contains(@class,'TabCloseButton')]")).findVisibleElement(By.xpath(Tabs_XPath+"/descendant::div[contains(@id,'tablist')]/descendant::div[contains(@class,'TabListWrapper')]/descendant::span[normalize-space(text())='"+tabName+"']/following-sibling::span[contains(@class,'TabCloseButton')]"));
		Tabs.click();
	}

	/*LendManageView->MainPane->stackContainer*/
	public WebElement get_Tabs_Self(String tabName){
		return driver.findElement(By.xpath(Tabs_XPath+"/descendant::div[contains(@id,'tablist')]/descendant::div[contains(@class,'TabListWrapper')]/descendant::span[normalize-space(text())='"+tabName+"']")).findVisibleElement(By.xpath(Tabs_XPath+"/descendant::div[contains(@id,'tablist')]/descendant::div[contains(@class,'TabListWrapper')]/descendant::span[normalize-space(text())='"+tabName+"']"));
	}

	/*LendManageView->MainPane->stackContainer*/
	public WebElement get_Tabsclose_Self(String tabName){
		return driver.findElement(By.xpath(Tabs_XPath+"/descendant::div[contains(@id,'tablist')]/descendant::div[contains(@class,'TabListWrapper')]/descendant::span[normalize-space(text())='"+tabName+"']/following-sibling::span[contains(@class,'TabCloseButton')]")).findVisibleElement(By.xpath(Tabs_XPath+"/descendant::div[contains(@id,'tablist')]/descendant::div[contains(@class,'TabListWrapper')]/descendant::span[normalize-space(text())='"+tabName+"']/following-sibling::span[contains(@class,'TabCloseButton')]"));
	}

}
