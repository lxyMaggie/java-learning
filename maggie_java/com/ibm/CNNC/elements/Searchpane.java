package com.ibm.CNNC.elements;

import org.openqa.selenium.*;
import com.selenium.utils.WebDriver;
import com.selenium.utils.WebElement;

/*catalog\widget\common\searchpane\templates\Searchpane.html*/
public class Searchpane {
	protected WebDriver driver;
	private static final String searchAllContextOption_XPath="//descendant::div[contains(@id,'Searchpane')]/descendant::input[contains(@id,'CheckBox')]";
	private static final String onQuickSearch_XPath="//descendant::div[contains(@id,'Searchpane')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"¿ìËÙËÑË÷"+"']";
	private static final String commonSearch_XPath="//descendant::div[contains(@id,'Searchpane')]/descendant::span[normalize-space(text())='"+"ÆÕÍ¨ËÑË÷"+"']";
	private static final String dimensionSearch_XPath="//descendant::div[contains(@id,'Searchpane')]/descendant::span[normalize-space(text())='"+"¶àÎ¬ËÑË÷"+"']";
	private static final String advancedSearchBtn_XPath="//descendant::div[contains(@id,'Searchpane')]/descendant::span[normalize-space(text())='"+"¸ß¼¶ËÑË÷"+"']";
	private static final String documentType_XPath="//descendant::div[contains(@id,'Searchpane')]/descendant::div";
	private static final String searchText_XPath="//descendant::div[contains(@id,'Searchpane')]/descendant::input";
	private static final String saveSearchTemplateBtn_XPath="//descendant::div[contains(@id,'Searchpane')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"±£´æËÑË÷Ìõ¼þ"+"']";
	private static final String secondSearchText_XPath="//descendant::div[contains(@id,'Searchpane')]/descendant::input";
	private static final String onSecondSearch_XPath="//descendant::div[contains(@id,'Searchpane')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"ËÑË÷"+"']";

	//----Constructor Methods Begin----
	public Searchpane(WebDriver driver){
		this.driver=driver;
	}

	/*Searchpane->searchAllContextOption*/
	public void searchAllContextOption_check(){
		WebElement searchAllContextOption = driver.findElement(By.xpath(searchAllContextOption_XPath)).findVisibleElement(By.xpath(searchAllContextOption_XPath));
		if(!searchAllContextOption.isSelected())
			searchAllContextOption.click();
	}

	/*Searchpane->searchAllContextOption*/
	public void searchAllContextOption_uncheck(){
		WebElement searchAllContextOption = driver.findElement(By.xpath(searchAllContextOption_XPath)).findVisibleElement(By.xpath(searchAllContextOption_XPath));
		if(searchAllContextOption.isSelected())
			searchAllContextOption.click();
	}

	/*Searchpane->searchAllContextOption*/
	public WebElement get_searchAllContextOption_Self(){
		return driver.findElement(By.xpath(searchAllContextOption_XPath)).findVisibleElement(By.xpath(searchAllContextOption_XPath));
	}

	/*Searchpane->onClick: ->onQuickSearch*/
	public void onQuickSearch_click(){
		WebElement onQuickSearch = driver.findElement(By.xpath(onQuickSearch_XPath)).findVisibleElement(By.xpath(onQuickSearch_XPath));
		onQuickSearch.click();
	}

	/*Searchpane->onClick: ->onQuickSearch*/
	public WebElement get_onQuickSearch_Self(){
		return driver.findElement(By.xpath(onQuickSearch_XPath)).findVisibleElement(By.xpath(onQuickSearch_XPath));
	}

	/*Searchpane->${resourceBundle.commonSearch}*/
	public void commonSearch_select(String selectStr){
		WebElement commonSearch=driver.findElement(By.xpath(commonSearch_XPath)).findVisibleElement(By.xpath(commonSearch_XPath));
		commonSearch.click();
		WebElement mySelectItem=driver.findElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']")).findVisibleElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']"));
		mySelectItem.click();
	}

	/*Searchpane->${resourceBundle.commonSearch}*/
	public void commonSearch_click(){
		WebElement commonSearch = driver.findElement(By.xpath(commonSearch_XPath)).findVisibleElement(By.xpath(commonSearch_XPath));
		commonSearch.click();
	}

	/*Searchpane->${resourceBundle.commonSearch}*/
	public WebElement get_commonSearch_Self(){
		return driver.findElement(By.xpath(commonSearch_XPath)).findVisibleElement(By.xpath(commonSearch_XPath));
	}

	/*Searchpane->${resourceBundle.commonSearch}*/
	public WebElement get_commonSearch_selectItem_Self(String selectStr){
		WebElement commonSearch=driver.findElement(By.xpath(commonSearch_XPath)).findVisibleElement(By.xpath(commonSearch_XPath));
		commonSearch.click();
		return driver.findElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']")).findVisibleElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']"));
	}

	/*Searchpane->${resourceBundle.dimensionSearch}*/
	public void dimensionSearch_select(String selectStr){
		WebElement dimensionSearch=driver.findElement(By.xpath(dimensionSearch_XPath)).findVisibleElement(By.xpath(dimensionSearch_XPath));
		dimensionSearch.click();
		WebElement mySelectItem=driver.findElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']")).findVisibleElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']"));
		mySelectItem.click();
	}

	/*Searchpane->${resourceBundle.dimensionSearch}*/
	public void dimensionSearch_click(){
		WebElement dimensionSearch = driver.findElement(By.xpath(dimensionSearch_XPath)).findVisibleElement(By.xpath(dimensionSearch_XPath));
		dimensionSearch.click();
	}

	/*Searchpane->${resourceBundle.dimensionSearch}*/
	public WebElement get_dimensionSearch_Self(){
		return driver.findElement(By.xpath(dimensionSearch_XPath)).findVisibleElement(By.xpath(dimensionSearch_XPath));
	}

	/*Searchpane->${resourceBundle.dimensionSearch}*/
	public WebElement get_dimensionSearch_selectItem_Self(String selectStr){
		WebElement dimensionSearch=driver.findElement(By.xpath(dimensionSearch_XPath)).findVisibleElement(By.xpath(dimensionSearch_XPath));
		dimensionSearch.click();
		return driver.findElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']")).findVisibleElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']"));
	}

	/*Searchpane->advancedSearchBtn*/
	public void advancedSearchBtn_select(String selectStr){
		WebElement advancedSearchBtn=driver.findElement(By.xpath(advancedSearchBtn_XPath)).findVisibleElement(By.xpath(advancedSearchBtn_XPath));
		advancedSearchBtn.click();
		WebElement mySelectItem=driver.findElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']")).findVisibleElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']"));
		mySelectItem.click();
	}

	/*Searchpane->advancedSearchBtn*/
	public void advancedSearchBtn_click(){
		WebElement advancedSearchBtn = driver.findElement(By.xpath(advancedSearchBtn_XPath)).findVisibleElement(By.xpath(advancedSearchBtn_XPath));
		advancedSearchBtn.click();
	}

	/*Searchpane->advancedSearchBtn*/
	public WebElement get_advancedSearchBtn_Self(){
		return driver.findElement(By.xpath(advancedSearchBtn_XPath)).findVisibleElement(By.xpath(advancedSearchBtn_XPath));
	}

	/*Searchpane->advancedSearchBtn*/
	public WebElement get_advancedSearchBtn_selectItem_Self(String selectStr){
		WebElement advancedSearchBtn=driver.findElement(By.xpath(advancedSearchBtn_XPath)).findVisibleElement(By.xpath(advancedSearchBtn_XPath));
		advancedSearchBtn.click();
		return driver.findElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']")).findVisibleElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']"));
	}

	/*Searchpane->documentType*/
	public void documentType_input(String inputStr){
		WebElement documentType=driver.findElement(By.xpath(documentType_XPath+"/descendant::input[contains(@role,'textbox')]")).findVisibleElement(By.xpath(documentType_XPath+"/descendant::input[contains(@role,'textbox')]"));
		documentType.click();
		documentType.clear();
		documentType.sendKeys(inputStr);
	}

	/*Searchpane->documentType*/
	public void documentType_select(String selectStr){
		WebElement documentType=driver.findElement(By.xpath(documentType_XPath)).findVisibleElement(By.xpath(documentType_XPath));
		documentType.click();
		WebElement comboboxNameArrow =driver.findElement(By.xpath(documentType_XPath+"/descendant::input[contains(@class,'ArrowButton')]")).findVisibleElement(By.xpath(documentType_XPath+"/descendant::input[contains(@class,'ArrowButton')]"));
		comboboxNameArrow.click();
		CommonClass.implicitWait(driver);
		WebElement mySelectItem=driver.findElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']")).findVisibleElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']"));
		mySelectItem.click();
	}

	/*Searchpane->documentType*/
	public WebElement get_documentType_input_Self(){
		return driver.findElement(By.xpath(documentType_XPath+"/descendant::input[contains(@role,'textbox')]")).findVisibleElement(By.xpath(documentType_XPath+"/descendant::input[contains(@role,'textbox')]"));
	}

	/*Searchpane->documentType*/
	public WebElement get_documentType_selectItem_Self(String selectStr){
		WebElement documentType=driver.findElement(By.xpath(documentType_XPath)).findVisibleElement(By.xpath(documentType_XPath));
		documentType.click();
		WebElement comboboxNameArrow =driver.findElement(By.xpath(documentType_XPath+"/descendant::input[contains(@class,'ArrowButton')]")).findVisibleElement(By.xpath(documentType_XPath+"/descendant::input[contains(@class,'ArrowButton')]"));
		comboboxNameArrow.click();
		CommonClass.implicitWait(driver);
		return driver.findElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']")).findVisibleElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']"));
	}

	/*Searchpane->searchText*/
	public void searchText_input(String inputStr){
		WebElement searchText=driver.findElement(By.xpath(searchText_XPath)).findVisibleElement(By.xpath(searchText_XPath));
		searchText.click();
		searchText.clear();
		searchText.sendKeys(inputStr);
	}

	/*Searchpane->searchText*/
	public WebElement get_searchText_Self(){
		return driver.findElement(By.xpath(searchText_XPath)).findVisibleElement(By.xpath(searchText_XPath));
	}

	/*Searchpane->saveSearchTemplateBtn*/
	public void saveSearchTemplateBtn_click(){
		WebElement saveSearchTemplateBtn = driver.findElement(By.xpath(saveSearchTemplateBtn_XPath)).findVisibleElement(By.xpath(saveSearchTemplateBtn_XPath));
		saveSearchTemplateBtn.click();
	}

	/*Searchpane->saveSearchTemplateBtn*/
	public WebElement get_saveSearchTemplateBtn_Self(){
		return driver.findElement(By.xpath(saveSearchTemplateBtn_XPath)).findVisibleElement(By.xpath(saveSearchTemplateBtn_XPath));
	}

	/*Searchpane->secondSearchText*/
	public void secondSearchText_input(String inputStr){
		WebElement secondSearchText=driver.findElement(By.xpath(secondSearchText_XPath)).findVisibleElement(By.xpath(secondSearchText_XPath));
		secondSearchText.click();
		secondSearchText.clear();
		secondSearchText.sendKeys(inputStr);
	}

	/*Searchpane->secondSearchText*/
	public WebElement get_secondSearchText_Self(){
		return driver.findElement(By.xpath(secondSearchText_XPath)).findVisibleElement(By.xpath(secondSearchText_XPath));
	}

	/*Searchpane->onClick: ->onSecondSearch*/
	public void onSecondSearch_click(){
		WebElement onSecondSearch = driver.findElement(By.xpath(onSecondSearch_XPath)).findVisibleElement(By.xpath(onSecondSearch_XPath));
		onSecondSearch.click();
	}

	/*Searchpane->onClick: ->onSecondSearch*/
	public WebElement get_onSecondSearch_Self(){
		return driver.findElement(By.xpath(onSecondSearch_XPath)).findVisibleElement(By.xpath(onSecondSearch_XPath));
	}

}
