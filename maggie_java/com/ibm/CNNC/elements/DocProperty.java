package com.ibm.CNNC.elements;

import org.openqa.selenium.*;
import com.selenium.utils.WebDriver;
import com.selenium.utils.WebElement;

/*catalog\widget\dm\docmanage\docproperty\templates\DocProperty.html*/
public class DocProperty {
	protected WebDriver driver;
	private static final String Tabs_XPath="//descendant::div[contains(@id,'DocProperty')]/descendant::div[contains(@id,'dijit_layout_TabContainer')]";

	//----Constructor Methods Begin----
	public DocProperty(WebDriver driver){
		this.driver=driver;
	}

	/*DocProperty->propertyContainer*/
	public void Tabs_click(String tabName){
		WebElement Tabs = driver.findElement(By.xpath(Tabs_XPath+"/descendant::div[contains(@id,'tablist')]/descendant::div[contains(@class,'TabListWrapper')]/descendant::span[normalize-space(text())='"+tabName+"']")).findVisibleElement(By.xpath(Tabs_XPath+"/descendant::div[contains(@id,'tablist')]/descendant::div[contains(@class,'TabListWrapper')]/descendant::span[normalize-space(text())='"+tabName+"']"));
		Tabs.click();
	}

	/*DocProperty->propertyContainer*/
	public void Tabs_close(String tabName){
		WebElement Tabs = driver.findElement(By.xpath(Tabs_XPath+"/descendant::div[contains(@id,'tablist')]/descendant::div[contains(@class,'TabListWrapper')]/descendant::span[normalize-space(text())='"+tabName+"']/following-sibling::span[contains(@class,'TabCloseButton')]")).findVisibleElement(By.xpath(Tabs_XPath+"/descendant::div[contains(@id,'tablist')]/descendant::div[contains(@class,'TabListWrapper')]/descendant::span[normalize-space(text())='"+tabName+"']/following-sibling::span[contains(@class,'TabCloseButton')]"));
		Tabs.click();
	}

	/*DocProperty->propertyContainer*/
	public WebElement get_Tabs_Self(String tabName){
		return driver.findElement(By.xpath(Tabs_XPath+"/descendant::div[contains(@id,'tablist')]/descendant::div[contains(@class,'TabListWrapper')]/descendant::span[normalize-space(text())='"+tabName+"']")).findVisibleElement(By.xpath(Tabs_XPath+"/descendant::div[contains(@id,'tablist')]/descendant::div[contains(@class,'TabListWrapper')]/descendant::span[normalize-space(text())='"+tabName+"']"));
	}

	/*DocProperty->propertyContainer*/
	public WebElement get_Tabsclose_Self(String tabName){
		return driver.findElement(By.xpath(Tabs_XPath+"/descendant::div[contains(@id,'tablist')]/descendant::div[contains(@class,'TabListWrapper')]/descendant::span[normalize-space(text())='"+tabName+"']/following-sibling::span[contains(@class,'TabCloseButton')]")).findVisibleElement(By.xpath(Tabs_XPath+"/descendant::div[contains(@id,'tablist')]/descendant::div[contains(@class,'TabListWrapper')]/descendant::span[normalize-space(text())='"+tabName+"']/following-sibling::span[contains(@class,'TabCloseButton')]"));
	}

}
