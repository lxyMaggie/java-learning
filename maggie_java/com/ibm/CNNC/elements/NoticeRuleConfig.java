package com.ibm.CNNC.elements;

import org.openqa.selenium.*;
import com.selenium.utils.WebDriver;
import com.selenium.utils.WebElement;

/*catalog\widget\dm\sysmanage\noticeruleconfig\templates\NoticeRuleConfig.html*/
public class NoticeRuleConfig {
	protected WebDriver driver;
	private static final String widget_dijit_form_FilteringSelect_XPath="//descendant::div[contains(@id,'NoticeRuleConfig')]/descendant::span[normalize-space(text())='对应模块 ']/../../descendant::div[contains(@id,'widget_dijit_form_FilteringSelect')]";
	private static final String cd1_XPath="//descendant::div[contains(@id,'NoticeRuleConfig')]/descendant::input[contains(@id,'NoticeRuleConfig')][contains(@id,'cd1')]";
	private static final String cb2_XPath="//descendant::div[contains(@id,'NoticeRuleConfig')]/descendant::input[contains(@id,'NoticeRuleConfig')][contains(@id,'cb2')]";
	private static final String cb3_XPath="//descendant::div[contains(@id,'NoticeRuleConfig')]/descendant::input[contains(@id,'NoticeRuleConfig')][contains(@id,'cb3')]";
	private static final String cb4_XPath="//descendant::div[contains(@id,'NoticeRuleConfig')]/descendant::input[contains(@id,'NoticeRuleConfig')][contains(@id,'cb4')]";
	private static final String saveBtn_XPath="//descendant::div[contains(@id,'NoticeRuleConfig')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"保存" +"']";
	private static final String cancelBtn_XPath="//descendant::div[contains(@id,'NoticeRuleConfig')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"取消"+"']";

	//----Constructor Methods Begin----
	public NoticeRuleConfig(WebDriver driver){
		this.driver=driver;
	}

	/*NoticeRuleConfig->configToModel*/
	public void widget_dijit_form_FilteringSelect_input(String inputStr){
		WebElement widget_dijit_form_FilteringSelect=driver.findElement(By.xpath(widget_dijit_form_FilteringSelect_XPath+"/descendant::input[contains(@role,'textbox')]")).findVisibleElement(By.xpath(widget_dijit_form_FilteringSelect_XPath+"/descendant::input[contains(@role,'textbox')]"));
		widget_dijit_form_FilteringSelect.click();
		widget_dijit_form_FilteringSelect.clear();
		widget_dijit_form_FilteringSelect.sendKeys(inputStr);
	}

	/*NoticeRuleConfig->configToModel*/
	public void widget_dijit_form_FilteringSelect_select(String selectStr){
		WebElement widget_dijit_form_FilteringSelect=driver.findElement(By.xpath(widget_dijit_form_FilteringSelect_XPath)).findVisibleElement(By.xpath(widget_dijit_form_FilteringSelect_XPath));
		widget_dijit_form_FilteringSelect.click();
		WebElement comboboxNameArrow =driver.findElement(By.xpath(widget_dijit_form_FilteringSelect_XPath+"/descendant::input[contains(@class,'ArrowButton')]")).findVisibleElement(By.xpath(widget_dijit_form_FilteringSelect_XPath+"/descendant::input[contains(@class,'ArrowButton')]"));
		comboboxNameArrow.click();
		CommonClass.implicitWait(driver);
		WebElement mySelectItem=driver.findElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']")).findVisibleElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']"));
		mySelectItem.click();
	}

	/*NoticeRuleConfig->configToModel*/
	public WebElement get_widget_dijit_form_FilteringSelect_input_Self(){
		return driver.findElement(By.xpath(widget_dijit_form_FilteringSelect_XPath+"/descendant::input[contains(@role,'textbox')]")).findVisibleElement(By.xpath(widget_dijit_form_FilteringSelect_XPath+"/descendant::input[contains(@role,'textbox')]"));
	}

	/*NoticeRuleConfig->configToModel*/
	public WebElement get_widget_dijit_form_FilteringSelect_selectItem_Self(String selectStr){
		WebElement widget_dijit_form_FilteringSelect=driver.findElement(By.xpath(widget_dijit_form_FilteringSelect_XPath)).findVisibleElement(By.xpath(widget_dijit_form_FilteringSelect_XPath));
		widget_dijit_form_FilteringSelect.click();
		WebElement comboboxNameArrow =driver.findElement(By.xpath(widget_dijit_form_FilteringSelect_XPath+"/descendant::input[contains(@class,'ArrowButton')]")).findVisibleElement(By.xpath(widget_dijit_form_FilteringSelect_XPath+"/descendant::input[contains(@class,'ArrowButton')]"));
		comboboxNameArrow.click();
		CommonClass.implicitWait(driver);
		return driver.findElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']")).findVisibleElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']"));
	}

	/*NoticeRuleConfig->*/
	public void cd1_check(){
		WebElement cd1 = driver.findElement(By.xpath(cd1_XPath)).findVisibleElement(By.xpath(cd1_XPath));
		if(!cd1.isSelected())
			cd1.click();
	}

	/*NoticeRuleConfig->*/
	public void cd1_uncheck(){
		WebElement cd1 = driver.findElement(By.xpath(cd1_XPath)).findVisibleElement(By.xpath(cd1_XPath));
		if(cd1.isSelected())
			cd1.click();
	}

	/*NoticeRuleConfig->*/
	public WebElement get_cd1_Self(){
		return driver.findElement(By.xpath(cd1_XPath)).findVisibleElement(By.xpath(cd1_XPath));
	}

	/*NoticeRuleConfig->onChange:reportChecked*/
	public void cb2_check(){
		WebElement cb2 = driver.findElement(By.xpath(cb2_XPath)).findVisibleElement(By.xpath(cb2_XPath));
		if(!cb2.isSelected())
			cb2.click();
	}

	/*NoticeRuleConfig->onChange:reportChecked*/
	public void cb2_uncheck(){
		WebElement cb2 = driver.findElement(By.xpath(cb2_XPath)).findVisibleElement(By.xpath(cb2_XPath));
		if(cb2.isSelected())
			cb2.click();
	}

	/*NoticeRuleConfig->onChange:reportChecked*/
	public WebElement get_cb2_Self(){
		return driver.findElement(By.xpath(cb2_XPath)).findVisibleElement(By.xpath(cb2_XPath));
	}

	/*NoticeRuleConfig->onChange:reportChecked*/
	public void cb3_check(){
		WebElement cb3 = driver.findElement(By.xpath(cb3_XPath)).findVisibleElement(By.xpath(cb3_XPath));
		if(!cb3.isSelected())
			cb3.click();
	}

	/*NoticeRuleConfig->onChange:reportChecked*/
	public void cb3_uncheck(){
		WebElement cb3 = driver.findElement(By.xpath(cb3_XPath)).findVisibleElement(By.xpath(cb3_XPath));
		if(cb3.isSelected())
			cb3.click();
	}

	/*NoticeRuleConfig->onChange:reportChecked*/
	public WebElement get_cb3_Self(){
		return driver.findElement(By.xpath(cb3_XPath)).findVisibleElement(By.xpath(cb3_XPath));
	}

	/*NoticeRuleConfig->onChange:reportChecked*/
	public void cb4_check(){
		WebElement cb4 = driver.findElement(By.xpath(cb4_XPath)).findVisibleElement(By.xpath(cb4_XPath));
		if(!cb4.isSelected())
			cb4.click();
	}

	/*NoticeRuleConfig->onChange:reportChecked*/
	public void cb4_uncheck(){
		WebElement cb4 = driver.findElement(By.xpath(cb4_XPath)).findVisibleElement(By.xpath(cb4_XPath));
		if(cb4.isSelected())
			cb4.click();
	}

	/*NoticeRuleConfig->onChange:reportChecked*/
	public WebElement get_cb4_Self(){
		return driver.findElement(By.xpath(cb4_XPath)).findVisibleElement(By.xpath(cb4_XPath));
	}

	/*NoticeRuleConfig->saveBtn*/
	public void saveBtn_click(){
		WebElement saveBtn = driver.findElement(By.xpath(saveBtn_XPath)).findVisibleElement(By.xpath(saveBtn_XPath));
		saveBtn.click();
	}

	/*NoticeRuleConfig->saveBtn*/
	public WebElement get_saveBtn_Self(){
		return driver.findElement(By.xpath(saveBtn_XPath)).findVisibleElement(By.xpath(saveBtn_XPath));
	}

	/*NoticeRuleConfig->cancelBtn*/
	public void cancelBtn_click(){
		WebElement cancelBtn = driver.findElement(By.xpath(cancelBtn_XPath)).findVisibleElement(By.xpath(cancelBtn_XPath));
		cancelBtn.click();
	}

	/*NoticeRuleConfig->cancelBtn*/
	public WebElement get_cancelBtn_Self(){
		return driver.findElement(By.xpath(cancelBtn_XPath)).findVisibleElement(By.xpath(cancelBtn_XPath));
	}

}
