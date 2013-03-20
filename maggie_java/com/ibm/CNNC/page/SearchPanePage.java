package com.ibm.CNNC.page;

import org.openqa.selenium.By;

import com.ibm.CNNC.elements.CommonClass;
import com.ibm.CNNC.elements.Searchpane;
import com.selenium.utils.WebDriver;
import com.selenium.utils.WebElement;

public class SearchPanePage extends Searchpane {

	public SearchPanePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	private static final String documentType_XPath="//descendant::div[contains(@id,'Searchpane')]/descendant::div[contains(@id,'FilteringSelect')]";
	private static final String searchText_XPath="//descendant::div[contains(@id,'Searchpane')]/descendant::input[contains(@id,'TextBox')]";
	private static final String secondSearchText_XPath="//descendant::div[contains(@id,'Searchpane')]/descendant::span[normalize-space(text())='¶þ´ÎËÑË÷']/../descendant::input[contains(@id,'TextBox')]";
	private static final String secondSearchButton_XPath="//descendant::div[contains(@id,'Searchpane')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"ËÑË÷"+"']";

	
	
	public void documentType_select(String selectStr){
		WebElement documentType=driver.findElement(By.xpath(documentType_XPath)).findVisibleElement(By.xpath(documentType_XPath));
		documentType.click();
		WebElement comboboxNameArrow =driver.findElement(By.xpath(documentType_XPath+"/descendant::input[contains(@class,'ArrowButton')]")).findVisibleElement(By.xpath(documentType_XPath+"/descendant::input[contains(@class,'ArrowButton')]"));
		comboboxNameArrow.click();
		CommonClass.implicitWait(driver);
		WebElement mySelectItem=driver.findElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']")).findVisibleElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']"));
		mySelectItem.click();
	}
	
	public void searchText_input(String inputStr){
		WebElement searchText=driver.findElement(By.xpath(searchText_XPath)).findVisibleElement(By.xpath(searchText_XPath));
		searchText.click();
		searchText.clear();
		searchText.sendKeys(inputStr);		
	}
	
	public void secondSearchText_input(String inputStr){
		WebElement searchText=driver.findElement(By.xpath(secondSearchText_XPath)).findVisibleElement(By.xpath(secondSearchText_XPath));
		searchText.click();
		searchText.clear();
		searchText.sendKeys(inputStr);		
	}
	public void secondSearchButton_click(){
		WebElement onQuickSearch = driver.findElement(By.xpath(secondSearchButton_XPath)).findVisibleElement(By.xpath(secondSearchButton_XPath));
		onQuickSearch.click();
	}
	
}
