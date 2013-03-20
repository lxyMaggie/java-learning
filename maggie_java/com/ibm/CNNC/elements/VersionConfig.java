package com.ibm.CNNC.elements;

import org.openqa.selenium.*;
import com.selenium.utils.WebDriver;
import com.selenium.utils.WebElement;

/*catalog\widget\dm\sysmanage\versionconfig\templates\VersionConfig.html*/
public class VersionConfig {
	protected WebDriver driver;
	private static final String Tabs_XPath="//descendant::div[contains(@id,'VersionConfig')]/descendant::*[contains(@id,'VersionRule')]/descendant::div[contains(@id,'dijit_layout_TabContainer')]";
	private static final String createRuleBtn_XPath="//descendant::div[contains(@id,'VersionConfig')]/descendant::*[contains(@id,'VersionRule')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"${resourceBundle.createRule}"+"']";
	private static final String majorVersion_XPath="//descendant::div[contains(@id,'VersionConfig')]/descendant::*[contains(@id,'VersionRule')]/descendant::span[normalize-space(text())='${resourceBundle.majorVersion}']/../../descendant::div[contains(@id,'widget_dijit_form_FilteringSelect')]";
	private static final String separator_XPath="//descendant::div[contains(@id,'VersionConfig')]/descendant::*[contains(@id,'VersionRule')]/descendant::span[normalize-space(text())='${resourceBundle.separator}']/../../descendant::div[contains(@id,'widget_dijit_form_FilteringSelect')]";
	private static final String minorVersion_XPath="//descendant::div[contains(@id,'VersionConfig')]/descendant::*[contains(@id,'VersionRule')]/descendant::span[normalize-space(text())='${resourceBundle.minorVersion}']/../../descendant::div[contains(@id,'widget_dijit_form_FilteringSelect')]";
	private static final String okBtn_XPath="//descendant::div[contains(@id,'VersionConfig')]/descendant::*[contains(@id,'VersionRule')]/descendant::span[contains(@id,'_OKButton')][contains(@id, 'Button')][normalize-space(text())='"+"${resourceBundle.ok}"+"']";
	private static final String deleteBtn_XPath="//descendant::div[contains(@id,'VersionConfig')]/descendant::*[contains(@id,'VersionRule')]/descendant::span[contains(@id,'_DeleteButton')][contains(@id, 'Button')][normalize-space(text())='"+"${resourceBundle.delete}"+"']";

	//----Constructor Methods Begin----
	public VersionConfig(WebDriver driver){
		this.driver=driver;
	}

	/*VersionConfig->VersionRule->stackContainer*/
	public void Tabs_click(String tabName){
		WebElement Tabs = driver.findElement(By.xpath(Tabs_XPath+"/descendant::div[contains(@id,'tablist')]/descendant::div[contains(@class,'TabListWrapper')]/descendant::span[normalize-space(text())='"+tabName+"']")).findVisibleElement(By.xpath(Tabs_XPath+"/descendant::div[contains(@id,'tablist')]/descendant::div[contains(@class,'TabListWrapper')]/descendant::span[normalize-space(text())='"+tabName+"']"));
		Tabs.click();
	}

	/*VersionConfig->VersionRule->stackContainer*/
	public void Tabs_close(String tabName){
		WebElement Tabs = driver.findElement(By.xpath(Tabs_XPath+"/descendant::div[contains(@id,'tablist')]/descendant::div[contains(@class,'TabListWrapper')]/descendant::span[normalize-space(text())='"+tabName+"']/following-sibling::span[contains(@class,'TabCloseButton')]")).findVisibleElement(By.xpath(Tabs_XPath+"/descendant::div[contains(@id,'tablist')]/descendant::div[contains(@class,'TabListWrapper')]/descendant::span[normalize-space(text())='"+tabName+"']/following-sibling::span[contains(@class,'TabCloseButton')]"));
		Tabs.click();
	}

	/*VersionConfig->VersionRule->stackContainer*/
	public WebElement get_Tabs_Self(String tabName){
		return driver.findElement(By.xpath(Tabs_XPath+"/descendant::div[contains(@id,'tablist')]/descendant::div[contains(@class,'TabListWrapper')]/descendant::span[normalize-space(text())='"+tabName+"']")).findVisibleElement(By.xpath(Tabs_XPath+"/descendant::div[contains(@id,'tablist')]/descendant::div[contains(@class,'TabListWrapper')]/descendant::span[normalize-space(text())='"+tabName+"']"));
	}

	/*VersionConfig->VersionRule->stackContainer*/
	public WebElement get_Tabsclose_Self(String tabName){
		return driver.findElement(By.xpath(Tabs_XPath+"/descendant::div[contains(@id,'tablist')]/descendant::div[contains(@class,'TabListWrapper')]/descendant::span[normalize-space(text())='"+tabName+"']/following-sibling::span[contains(@class,'TabCloseButton')]")).findVisibleElement(By.xpath(Tabs_XPath+"/descendant::div[contains(@id,'tablist')]/descendant::div[contains(@class,'TabListWrapper')]/descendant::span[normalize-space(text())='"+tabName+"']/following-sibling::span[contains(@class,'TabCloseButton')]"));
	}

	/*VersionConfig->VersionRule->createRuleBtn*/
	public void createRuleBtn_click(){
		WebElement createRuleBtn = driver.findElement(By.xpath(createRuleBtn_XPath)).findVisibleElement(By.xpath(createRuleBtn_XPath));
		createRuleBtn.click();
	}

	/*VersionConfig->VersionRule->createRuleBtn*/
	public WebElement get_createRuleBtn_Self(){
		return driver.findElement(By.xpath(createRuleBtn_XPath)).findVisibleElement(By.xpath(createRuleBtn_XPath));
	}

	/*VersionConfig->VersionRule->majorVersion*/
	public void majorVersion_input(String inputStr){
		WebElement majorVersion=driver.findElement(By.xpath(majorVersion_XPath+"/descendant::input[contains(@role,'textbox')]")).findVisibleElement(By.xpath(majorVersion_XPath+"/descendant::input[contains(@role,'textbox')]"));
		majorVersion.click();
		majorVersion.clear();
		majorVersion.sendKeys(inputStr);
	}

	/*VersionConfig->VersionRule->majorVersion*/
	public void majorVersion_select(String selectStr){
		WebElement majorVersion=driver.findElement(By.xpath(majorVersion_XPath)).findVisibleElement(By.xpath(majorVersion_XPath));
		majorVersion.click();
		WebElement comboboxNameArrow =driver.findElement(By.xpath(majorVersion_XPath+"/descendant::input[contains(@class,'ArrowButton')]")).findVisibleElement(By.xpath(majorVersion_XPath+"/descendant::input[contains(@class,'ArrowButton')]"));
		comboboxNameArrow.click();
		CommonClass.implicitWait(driver);
		WebElement mySelectItem=driver.findElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']")).findVisibleElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']"));
		mySelectItem.click();
	}

	/*VersionConfig->VersionRule->majorVersion*/
	public WebElement get_majorVersion_input_Self(){
		return driver.findElement(By.xpath(majorVersion_XPath+"/descendant::input[contains(@role,'textbox')]")).findVisibleElement(By.xpath(majorVersion_XPath+"/descendant::input[contains(@role,'textbox')]"));
	}

	/*VersionConfig->VersionRule->majorVersion*/
	public WebElement get_majorVersion_selectItem_Self(String selectStr){
		WebElement majorVersion=driver.findElement(By.xpath(majorVersion_XPath)).findVisibleElement(By.xpath(majorVersion_XPath));
		majorVersion.click();
		WebElement comboboxNameArrow =driver.findElement(By.xpath(majorVersion_XPath+"/descendant::input[contains(@class,'ArrowButton')]")).findVisibleElement(By.xpath(majorVersion_XPath+"/descendant::input[contains(@class,'ArrowButton')]"));
		comboboxNameArrow.click();
		CommonClass.implicitWait(driver);
		return driver.findElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']")).findVisibleElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']"));
	}

	/*VersionConfig->VersionRule->separator*/
	public void separator_input(String inputStr){
		WebElement separator=driver.findElement(By.xpath(separator_XPath+"/descendant::input[contains(@role,'textbox')]")).findVisibleElement(By.xpath(separator_XPath+"/descendant::input[contains(@role,'textbox')]"));
		separator.click();
		separator.clear();
		separator.sendKeys(inputStr);
	}

	/*VersionConfig->VersionRule->separator*/
	public void separator_select(String selectStr){
		WebElement separator=driver.findElement(By.xpath(separator_XPath)).findVisibleElement(By.xpath(separator_XPath));
		separator.click();
		WebElement comboboxNameArrow =driver.findElement(By.xpath(separator_XPath+"/descendant::input[contains(@class,'ArrowButton')]")).findVisibleElement(By.xpath(separator_XPath+"/descendant::input[contains(@class,'ArrowButton')]"));
		comboboxNameArrow.click();
		CommonClass.implicitWait(driver);
		WebElement mySelectItem=driver.findElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']")).findVisibleElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']"));
		mySelectItem.click();
	}

	/*VersionConfig->VersionRule->separator*/
	public WebElement get_separator_input_Self(){
		return driver.findElement(By.xpath(separator_XPath+"/descendant::input[contains(@role,'textbox')]")).findVisibleElement(By.xpath(separator_XPath+"/descendant::input[contains(@role,'textbox')]"));
	}

	/*VersionConfig->VersionRule->separator*/
	public WebElement get_separator_selectItem_Self(String selectStr){
		WebElement separator=driver.findElement(By.xpath(separator_XPath)).findVisibleElement(By.xpath(separator_XPath));
		separator.click();
		WebElement comboboxNameArrow =driver.findElement(By.xpath(separator_XPath+"/descendant::input[contains(@class,'ArrowButton')]")).findVisibleElement(By.xpath(separator_XPath+"/descendant::input[contains(@class,'ArrowButton')]"));
		comboboxNameArrow.click();
		CommonClass.implicitWait(driver);
		return driver.findElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']")).findVisibleElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']"));
	}

	/*VersionConfig->VersionRule->minorVersion*/
	public void minorVersion_input(String inputStr){
		WebElement minorVersion=driver.findElement(By.xpath(minorVersion_XPath+"/descendant::input[contains(@role,'textbox')]")).findVisibleElement(By.xpath(minorVersion_XPath+"/descendant::input[contains(@role,'textbox')]"));
		minorVersion.click();
		minorVersion.clear();
		minorVersion.sendKeys(inputStr);
	}

	/*VersionConfig->VersionRule->minorVersion*/
	public void minorVersion_select(String selectStr){
		WebElement minorVersion=driver.findElement(By.xpath(minorVersion_XPath)).findVisibleElement(By.xpath(minorVersion_XPath));
		minorVersion.click();
		WebElement comboboxNameArrow =driver.findElement(By.xpath(minorVersion_XPath+"/descendant::input[contains(@class,'ArrowButton')]")).findVisibleElement(By.xpath(minorVersion_XPath+"/descendant::input[contains(@class,'ArrowButton')]"));
		comboboxNameArrow.click();
		CommonClass.implicitWait(driver);
		WebElement mySelectItem=driver.findElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']")).findVisibleElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']"));
		mySelectItem.click();
	}

	/*VersionConfig->VersionRule->minorVersion*/
	public WebElement get_minorVersion_input_Self(){
		return driver.findElement(By.xpath(minorVersion_XPath+"/descendant::input[contains(@role,'textbox')]")).findVisibleElement(By.xpath(minorVersion_XPath+"/descendant::input[contains(@role,'textbox')]"));
	}

	/*VersionConfig->VersionRule->minorVersion*/
	public WebElement get_minorVersion_selectItem_Self(String selectStr){
		WebElement minorVersion=driver.findElement(By.xpath(minorVersion_XPath)).findVisibleElement(By.xpath(minorVersion_XPath));
		minorVersion.click();
		WebElement comboboxNameArrow =driver.findElement(By.xpath(minorVersion_XPath+"/descendant::input[contains(@class,'ArrowButton')]")).findVisibleElement(By.xpath(minorVersion_XPath+"/descendant::input[contains(@class,'ArrowButton')]"));
		comboboxNameArrow.click();
		CommonClass.implicitWait(driver);
		return driver.findElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']")).findVisibleElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']"));
	}

	/*VersionConfig->VersionRule->okBtn*/
	public void okBtn_click(){
		WebElement okBtn = driver.findElement(By.xpath(okBtn_XPath)).findVisibleElement(By.xpath(okBtn_XPath));
		okBtn.click();
	}

	/*VersionConfig->VersionRule->okBtn*/
	public WebElement get_okBtn_Self(){
		return driver.findElement(By.xpath(okBtn_XPath)).findVisibleElement(By.xpath(okBtn_XPath));
	}

	/*VersionConfig->VersionRule->deleteBtn*/
	public void deleteBtn_click(){
		WebElement deleteBtn = driver.findElement(By.xpath(deleteBtn_XPath)).findVisibleElement(By.xpath(deleteBtn_XPath));
		deleteBtn.click();
	}

	/*VersionConfig->VersionRule->deleteBtn*/
	public WebElement get_deleteBtn_Self(){
		return driver.findElement(By.xpath(deleteBtn_XPath)).findVisibleElement(By.xpath(deleteBtn_XPath));
	}

}
