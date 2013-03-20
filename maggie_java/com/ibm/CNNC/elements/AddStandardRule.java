package com.ibm.CNNC.elements;

import org.openqa.selenium.*;
import com.selenium.utils.WebDriver;
import com.selenium.utils.WebElement;

/*catalog\widget\dm\headquartermanage\standardrulestructuremanage\templates\AddStandardRule.html*/
public class AddStandardRule {
	protected WebDriver driver;
	private static final String layer_XPath="//descendant::div[contains(@id,'AddStandardRule')]/descendant::span[normalize-space(text())='层级']/../../descendant::div[contains(@id,'widget_dijit_form_FilteringSelect')]";
	private static final String selectStandardRuleBtn_XPath="//descendant::div[contains(@id,'AddStandardRule')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"选择上级制度"+"']";
	private static final String saveBtn_XPath="//descendant::div[contains(@id,'AddStandardRule')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"保存"+"']";

	//----Constructor Methods Begin----
	public AddStandardRule(WebDriver driver){
		this.driver=driver;
	}

	/*AddStandardRule->layer*/
	public void layer_input(String inputStr){
		WebElement layer=driver.findElement(By.xpath(layer_XPath+"/descendant::input[contains(@role,'textbox')]")).findVisibleElement(By.xpath(layer_XPath+"/descendant::input[contains(@role,'textbox')]"));
		layer.click();
		layer.clear();
		layer.sendKeys(inputStr);
	}

	/*AddStandardRule->layer*/
	public void layer_select(String selectStr){
		WebElement layer=driver.findElement(By.xpath(layer_XPath)).findVisibleElement(By.xpath(layer_XPath));
		layer.click();
		WebElement comboboxNameArrow =driver.findElement(By.xpath(layer_XPath+"/descendant::input[contains(@class,'ArrowButton')]")).findVisibleElement(By.xpath(layer_XPath+"/descendant::input[contains(@class,'ArrowButton')]"));
		comboboxNameArrow.click();
		CommonClass.implicitWait(driver);
		WebElement mySelectItem=driver.findElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']")).findVisibleElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']"));
		mySelectItem.click();
	}

	/*AddStandardRule->layer*/
	public WebElement get_layer_input_Self(){
		return driver.findElement(By.xpath(layer_XPath+"/descendant::input[contains(@role,'textbox')]")).findVisibleElement(By.xpath(layer_XPath+"/descendant::input[contains(@role,'textbox')]"));
	}

	/*AddStandardRule->layer*/
	public WebElement get_layer_selectItem_Self(String selectStr){
		WebElement layer=driver.findElement(By.xpath(layer_XPath)).findVisibleElement(By.xpath(layer_XPath));
		layer.click();
		WebElement comboboxNameArrow =driver.findElement(By.xpath(layer_XPath+"/descendant::input[contains(@class,'ArrowButton')]")).findVisibleElement(By.xpath(layer_XPath+"/descendant::input[contains(@class,'ArrowButton')]"));
		comboboxNameArrow.click();
		CommonClass.implicitWait(driver);
		return driver.findElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']")).findVisibleElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']"));
	}

	/*AddStandardRule->selectStandardRuleBtn*/
	public void selectStandardRuleBtn_click(){
		WebElement selectStandardRuleBtn = driver.findElement(By.xpath(selectStandardRuleBtn_XPath)).findVisibleElement(By.xpath(selectStandardRuleBtn_XPath));
		selectStandardRuleBtn.click();
	}

	/*AddStandardRule->selectStandardRuleBtn*/
	public WebElement get_selectStandardRuleBtn_Self(){
		return driver.findElement(By.xpath(selectStandardRuleBtn_XPath)).findVisibleElement(By.xpath(selectStandardRuleBtn_XPath));
	}

	/*AddStandardRule->saveBtn*/
	public void saveBtn_click(){
		WebElement saveBtn = driver.findElement(By.xpath(saveBtn_XPath)).findVisibleElement(By.xpath(saveBtn_XPath));
		saveBtn.click();
	}

	/*AddStandardRule->saveBtn*/
	public WebElement get_saveBtn_Self(){
		return driver.findElement(By.xpath(saveBtn_XPath)).findVisibleElement(By.xpath(saveBtn_XPath));
	}

}
