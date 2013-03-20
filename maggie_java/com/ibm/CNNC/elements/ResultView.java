package com.ibm.CNNC.elements;

import org.openqa.selenium.*;
import com.selenium.utils.WebDriver;
import com.selenium.utils.WebElement;

/*catalog\widget\dm\searchuse\searchplatform\dijit\templates\ResultView.html*/
public class ResultView {
	protected WebDriver driver;
	private static final String rate1_XPath="//descendant::a";
	private static final String rate2_XPath="//descendant::a";
	private static final String rate3_XPath="//descendant::a";
	private static final String rate4_XPath="//descendant::a";
	private static final String rate5_XPath="//descendant::a";
	private static final String Tabs_XPath="//descendant::div[contains(@id,'ResultView')]/descendant::div[contains(@id,'dijit_layout_TabContainer')]";
	private static final String onAdd_XPath="//descendant::div[contains(@id,'ResultView')]/descendant::*[contains(@id,'Evaluation')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"提交"+"']";
	private static final String onCancel_XPath="//descendant::div[contains(@id,'ResultView')]/descendant::*[contains(@id,'Evaluation')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"取消"+"']";

	//----Constructor Methods Begin----
	public ResultView(WebDriver driver){
		this.driver=driver;
	}

	/**/
	public void rate1_click(){
		WebElement rate1 = driver.findElement(By.xpath(rate1_XPath)).findVisibleElement(By.xpath(rate1_XPath));
		rate1.click();
	}

	/**/
	public WebElement get_rate1_Self(){
		return driver.findElement(By.xpath(rate1_XPath)).findVisibleElement(By.xpath(rate1_XPath));
	}

	/**/
	public void rate2_click(){
		WebElement rate2 = driver.findElement(By.xpath(rate2_XPath)).findVisibleElement(By.xpath(rate2_XPath));
		rate2.click();
	}

	/**/
	public WebElement get_rate2_Self(){
		return driver.findElement(By.xpath(rate2_XPath)).findVisibleElement(By.xpath(rate2_XPath));
	}

	/**/
	public void rate3_click(){
		WebElement rate3 = driver.findElement(By.xpath(rate3_XPath)).findVisibleElement(By.xpath(rate3_XPath));
		rate3.click();
	}

	/**/
	public WebElement get_rate3_Self(){
		return driver.findElement(By.xpath(rate3_XPath)).findVisibleElement(By.xpath(rate3_XPath));
	}

	/**/
	public void rate4_click(){
		WebElement rate4 = driver.findElement(By.xpath(rate4_XPath)).findVisibleElement(By.xpath(rate4_XPath));
		rate4.click();
	}

	/**/
	public WebElement get_rate4_Self(){
		return driver.findElement(By.xpath(rate4_XPath)).findVisibleElement(By.xpath(rate4_XPath));
	}

	/**/
	public void rate5_click(){
		WebElement rate5 = driver.findElement(By.xpath(rate5_XPath)).findVisibleElement(By.xpath(rate5_XPath));
		rate5.click();
	}

	/**/
	public WebElement get_rate5_Self(){
		return driver.findElement(By.xpath(rate5_XPath)).findVisibleElement(By.xpath(rate5_XPath));
	}

	/*ResultView->stackContainer*/
	public void Tabs_click(String tabName){
		WebElement Tabs = driver.findElement(By.xpath(Tabs_XPath+"/descendant::div[contains(@id,'tablist')]/descendant::div[contains(@class,'TabListWrapper')]/descendant::span[normalize-space(text())='"+tabName+"']")).findVisibleElement(By.xpath(Tabs_XPath+"/descendant::div[contains(@id,'tablist')]/descendant::div[contains(@class,'TabListWrapper')]/descendant::span[normalize-space(text())='"+tabName+"']"));
		Tabs.click();
	}

	/*ResultView->stackContainer*/
	public void Tabs_close(String tabName){
		WebElement Tabs = driver.findElement(By.xpath(Tabs_XPath+"/descendant::div[contains(@id,'tablist')]/descendant::div[contains(@class,'TabListWrapper')]/descendant::span[normalize-space(text())='"+tabName+"']/following-sibling::span[contains(@class,'TabCloseButton')]")).findVisibleElement(By.xpath(Tabs_XPath+"/descendant::div[contains(@id,'tablist')]/descendant::div[contains(@class,'TabListWrapper')]/descendant::span[normalize-space(text())='"+tabName+"']/following-sibling::span[contains(@class,'TabCloseButton')]"));
		Tabs.click();
	}

	/*ResultView->stackContainer*/
	public WebElement get_Tabs_Self(String tabName){
		return driver.findElement(By.xpath(Tabs_XPath+"/descendant::div[contains(@id,'tablist')]/descendant::div[contains(@class,'TabListWrapper')]/descendant::span[normalize-space(text())='"+tabName+"']")).findVisibleElement(By.xpath(Tabs_XPath+"/descendant::div[contains(@id,'tablist')]/descendant::div[contains(@class,'TabListWrapper')]/descendant::span[normalize-space(text())='"+tabName+"']"));
	}

	/*ResultView->stackContainer*/
	public WebElement get_Tabsclose_Self(String tabName){
		return driver.findElement(By.xpath(Tabs_XPath+"/descendant::div[contains(@id,'tablist')]/descendant::div[contains(@class,'TabListWrapper')]/descendant::span[normalize-space(text())='"+tabName+"']/following-sibling::span[contains(@class,'TabCloseButton')]")).findVisibleElement(By.xpath(Tabs_XPath+"/descendant::div[contains(@id,'tablist')]/descendant::div[contains(@class,'TabListWrapper')]/descendant::span[normalize-space(text())='"+tabName+"']/following-sibling::span[contains(@class,'TabCloseButton')]"));
	}

	/*ResultView->Evaluation->onClick:->onAdd*/
	public void onAdd_click(){
		WebElement onAdd = driver.findElement(By.xpath(onAdd_XPath)).findVisibleElement(By.xpath(onAdd_XPath));
		onAdd.click();
	}

	/*ResultView->Evaluation->onClick:->onAdd*/
	public WebElement get_onAdd_Self(){
		return driver.findElement(By.xpath(onAdd_XPath)).findVisibleElement(By.xpath(onAdd_XPath));
	}

	/*ResultView->Evaluation->onClick:->onCancel*/
	public void onCancel_click(){
		WebElement onCancel = driver.findElement(By.xpath(onCancel_XPath)).findVisibleElement(By.xpath(onCancel_XPath));
		onCancel.click();
	}

	/*ResultView->Evaluation->onClick:->onCancel*/
	public WebElement get_onCancel_Self(){
		return driver.findElement(By.xpath(onCancel_XPath)).findVisibleElement(By.xpath(onCancel_XPath));
	}

}
