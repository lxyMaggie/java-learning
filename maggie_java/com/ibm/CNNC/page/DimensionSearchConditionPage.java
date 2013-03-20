package com.ibm.CNNC.page;

import org.openqa.selenium.By;

import com.selenium.utils.WebDriver;
import com.selenium.utils.WebElement;

public class DimensionSearchConditionPage extends CheckBoxTreeView{

	private static final String searchButton_XPath="//descendant::div[contains(@class,'multCondition')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"À—À˜"+"']";
	private static final String resetButton_XPath="//descendant::div[contains(@class,'multCondition')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"÷ÿ÷√"+"']";


	public DimensionSearchConditionPage (WebDriver driver){
		super(driver);
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
