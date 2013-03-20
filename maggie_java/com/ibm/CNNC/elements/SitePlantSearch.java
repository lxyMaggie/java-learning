package com.ibm.CNNC.elements;

import org.openqa.selenium.*;
import com.selenium.utils.WebDriver;
import com.selenium.utils.WebElement;

/*catalog\widget\dm\common\permissionconfig\dijit\templates\SitePlantSearch.html*/
public class SitePlantSearch {
	protected WebDriver driver;
	private static final String siteName_XPath="//descendant::div[contains(@id,'SitePlantSearch')]/descendant::span[normalize-space(text())='站名']/../../descendant::div[contains(@id,'widget_dijit_form_FilteringSelect')]";
	private static final String plantName_XPath="//descendant::div[contains(@id,'SitePlantSearch')]/descendant::span[normalize-space(text())='电厂名']/../../descendant::div[contains(@id,'widget_dijit_form_FilteringSelect')]";

	//----Constructor Methods Begin----
	public SitePlantSearch(WebDriver driver){
		this.driver=driver;
	}

	/*SitePlantSearch->siteName*/
	public void siteName_input(String inputStr){
		WebElement siteName=driver.findElement(By.xpath(siteName_XPath+"/descendant::input[contains(@role,'textbox')]")).findVisibleElement(By.xpath(siteName_XPath+"/descendant::input[contains(@role,'textbox')]"));
		siteName.click();
		siteName.clear();
		siteName.sendKeys(inputStr);
	}

	/*SitePlantSearch->siteName*/
	public void siteName_select(String selectStr){
		WebElement siteName=driver.findElement(By.xpath(siteName_XPath)).findVisibleElement(By.xpath(siteName_XPath));
		siteName.click();
		WebElement comboboxNameArrow =driver.findElement(By.xpath(siteName_XPath+"/descendant::input[contains(@class,'ArrowButton')]")).findVisibleElement(By.xpath(siteName_XPath+"/descendant::input[contains(@class,'ArrowButton')]"));
		comboboxNameArrow.click();
		CommonClass.implicitWait(driver);
		WebElement mySelectItem=driver.findElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']")).findVisibleElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']"));
		mySelectItem.click();
	}

	/*SitePlantSearch->siteName*/
	public WebElement get_siteName_input_Self(){
		return driver.findElement(By.xpath(siteName_XPath+"/descendant::input[contains(@role,'textbox')]")).findVisibleElement(By.xpath(siteName_XPath+"/descendant::input[contains(@role,'textbox')]"));
	}

	/*SitePlantSearch->siteName*/
	public WebElement get_siteName_selectItem_Self(String selectStr){
		WebElement siteName=driver.findElement(By.xpath(siteName_XPath)).findVisibleElement(By.xpath(siteName_XPath));
		siteName.click();
		WebElement comboboxNameArrow =driver.findElement(By.xpath(siteName_XPath+"/descendant::input[contains(@class,'ArrowButton')]")).findVisibleElement(By.xpath(siteName_XPath+"/descendant::input[contains(@class,'ArrowButton')]"));
		comboboxNameArrow.click();
		CommonClass.implicitWait(driver);
		return driver.findElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']")).findVisibleElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']"));
	}

	/*SitePlantSearch->plantName*/
	public void plantName_input(String inputStr){
		WebElement plantName=driver.findElement(By.xpath(plantName_XPath+"/descendant::input[contains(@role,'textbox')]")).findVisibleElement(By.xpath(plantName_XPath+"/descendant::input[contains(@role,'textbox')]"));
		plantName.click();
		plantName.clear();
		plantName.sendKeys(inputStr);
	}

	/*SitePlantSearch->plantName*/
	public void plantName_select(String selectStr){
		WebElement plantName=driver.findElement(By.xpath(plantName_XPath)).findVisibleElement(By.xpath(plantName_XPath));
		plantName.click();
		WebElement comboboxNameArrow =driver.findElement(By.xpath(plantName_XPath+"/descendant::input[contains(@class,'ArrowButton')]")).findVisibleElement(By.xpath(plantName_XPath+"/descendant::input[contains(@class,'ArrowButton')]"));
		comboboxNameArrow.click();
		CommonClass.implicitWait(driver);
		WebElement mySelectItem=driver.findElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']")).findVisibleElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']"));
		mySelectItem.click();
	}

	/*SitePlantSearch->plantName*/
	public WebElement get_plantName_input_Self(){
		return driver.findElement(By.xpath(plantName_XPath+"/descendant::input[contains(@role,'textbox')]")).findVisibleElement(By.xpath(plantName_XPath+"/descendant::input[contains(@role,'textbox')]"));
	}

	/*SitePlantSearch->plantName*/
	public WebElement get_plantName_selectItem_Self(String selectStr){
		WebElement plantName=driver.findElement(By.xpath(plantName_XPath)).findVisibleElement(By.xpath(plantName_XPath));
		plantName.click();
		WebElement comboboxNameArrow =driver.findElement(By.xpath(plantName_XPath+"/descendant::input[contains(@class,'ArrowButton')]")).findVisibleElement(By.xpath(plantName_XPath+"/descendant::input[contains(@class,'ArrowButton')]"));
		comboboxNameArrow.click();
		CommonClass.implicitWait(driver);
		return driver.findElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']")).findVisibleElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']"));
	}

}
