package com.ibm.CNNC.elements;

import org.openqa.selenium.*;
import com.selenium.utils.WebDriver;
import com.selenium.utils.WebElement;

/*catalog\widget\common\header\templates\Header.html*/
public class Header {
	protected WebDriver driver;
	private static final String messageNode_XPath="//descendant::a[normalize-space(text())='"+ "..."+"']";
	private static final String NoName1_XPath="//descendant::a[normalize-space(text())='"+ "${resourceBundle.changePassword}"+"']";
	private static final String userLogout_XPath="//descendant::a[normalize-space(text())='"+ "${resourceBundle.logout}"+"']";
	private static final String tempDocCarts_XPath="//descendant::div[contains(@id,'Header')]/descendant::span[normalize-space(text())='"+CommonClass.getMessageValue(CommonClass.local,"暂存架")+"']";
	private static final String authorizedPlantsSelect_XPath="//descendant::div[contains(@id,'Header')]/descendant::span[normalize-space(text())='成员公司']/../../descendant::div[contains(@id,'widget_dijit_form_FilteringSelect')]";
	private static final String printButton_XPath="//descendant::div[contains(@id,'Header')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"无水印打印"+"']";
	private static final String printWaterMarkButton_XPath="//descendant::div[contains(@id,'Header')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"带水印打印"+"']";
	private static final String downloadButton_XPath="//descendant::div[contains(@id,'Header')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"无水印下载"+"']";
	private static final String downloadWaterMarkButton_XPath="//descendant::div[contains(@id,'Header')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"带水印下载"+"']";
	private static final String btnApplySearch_XPath="//descendant::div[contains(@id,'Header')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"借阅"+"']";
	private static final String cleanTempleCart_XPath="//descendant::div[contains(@id,'Header')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"清空"+"']";

	//----Constructor Methods Begin----
	public Header(WebDriver driver){
		this.driver=driver;
	}

	/**/
	public void messageNode_click(){
		WebElement messageNode = driver.findElement(By.xpath(messageNode_XPath)).findVisibleElement(By.xpath(messageNode_XPath));
		messageNode.click();
	}

	/**/
	public WebElement get_messageNode_Self(){
		return driver.findElement(By.xpath(messageNode_XPath)).findVisibleElement(By.xpath(messageNode_XPath));
	}

	/**/
	public void NoName1_click(){
		WebElement NoName1 = driver.findElement(By.xpath(NoName1_XPath)).findVisibleElement(By.xpath(NoName1_XPath));
		NoName1.click();
	}

	/**/
	public WebElement get_NoName1_Self(){
		return driver.findElement(By.xpath(NoName1_XPath)).findVisibleElement(By.xpath(NoName1_XPath));
	}

	/**/
	public void userLogout_click(){
		WebElement userLogout = driver.findElement(By.xpath(userLogout_XPath)).findVisibleElement(By.xpath(userLogout_XPath));
		userLogout.click();
	}

	/**/
	public WebElement get_userLogout_Self(){
		return driver.findElement(By.xpath(userLogout_XPath)).findVisibleElement(By.xpath(userLogout_XPath));
	}

	/*Header->tempDocCarts*/
	public void tempDocCarts_select(String selectStr){
		WebElement tempDocCarts=driver.findElement(By.xpath(tempDocCarts_XPath)).findVisibleElement(By.xpath(tempDocCarts_XPath));
		tempDocCarts.click();
		WebElement mySelectItem=driver.findElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']")).findVisibleElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']"));
		mySelectItem.click();
	}

	/*Header->tempDocCarts*/
	public void tempDocCarts_click(){
		WebElement tempDocCarts = driver.findElement(By.xpath(tempDocCarts_XPath)).findVisibleElement(By.xpath(tempDocCarts_XPath));
		tempDocCarts.click();
	}

	/*Header->tempDocCarts*/
	public WebElement get_tempDocCarts_Self(){
		return driver.findElement(By.xpath(tempDocCarts_XPath)).findVisibleElement(By.xpath(tempDocCarts_XPath));
	}

	/*Header->tempDocCarts*/
	public WebElement get_tempDocCarts_selectItem_Self(String selectStr){
		WebElement tempDocCarts=driver.findElement(By.xpath(tempDocCarts_XPath)).findVisibleElement(By.xpath(tempDocCarts_XPath));
		tempDocCarts.click();
		return driver.findElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']")).findVisibleElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']"));
	}

	/*Header->authorizedPlantsSelect*/
	public void authorizedPlantsSelect_input(String inputStr){
		WebElement authorizedPlantsSelect=driver.findElement(By.xpath(authorizedPlantsSelect_XPath+"/descendant::input[contains(@role,'textbox')]")).findVisibleElement(By.xpath(authorizedPlantsSelect_XPath+"/descendant::input[contains(@role,'textbox')]"));
		authorizedPlantsSelect.click();
		authorizedPlantsSelect.clear();
		authorizedPlantsSelect.sendKeys(inputStr);
	}

	/*Header->authorizedPlantsSelect*/
	public void authorizedPlantsSelect_select(String selectStr){
		WebElement authorizedPlantsSelect=driver.findElement(By.xpath(authorizedPlantsSelect_XPath)).findVisibleElement(By.xpath(authorizedPlantsSelect_XPath));
		authorizedPlantsSelect.click();
		WebElement comboboxNameArrow =driver.findElement(By.xpath(authorizedPlantsSelect_XPath+"/descendant::input[contains(@class,'ArrowButton')]")).findVisibleElement(By.xpath(authorizedPlantsSelect_XPath+"/descendant::input[contains(@class,'ArrowButton')]"));
		comboboxNameArrow.click();
		//CommonClass.implicitWait(driver);
		WebElement mySelectItem=driver.findElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']")).findVisibleElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']"));
		mySelectItem.click();
	}

	/*Header->authorizedPlantsSelect*/
	public WebElement get_authorizedPlantsSelect_input_Self(){
		return driver.findElement(By.xpath(authorizedPlantsSelect_XPath+"/descendant::input[contains(@role,'textbox')]")).findVisibleElement(By.xpath(authorizedPlantsSelect_XPath+"/descendant::input[contains(@role,'textbox')]"));
	}

	/*Header->authorizedPlantsSelect*/
	public WebElement get_authorizedPlantsSelect_selectItem_Self(String selectStr){
		WebElement authorizedPlantsSelect=driver.findElement(By.xpath(authorizedPlantsSelect_XPath)).findVisibleElement(By.xpath(authorizedPlantsSelect_XPath));
		authorizedPlantsSelect.click();
		WebElement comboboxNameArrow =driver.findElement(By.xpath(authorizedPlantsSelect_XPath+"/descendant::input[contains(@class,'ArrowButton')]")).findVisibleElement(By.xpath(authorizedPlantsSelect_XPath+"/descendant::input[contains(@class,'ArrowButton')]"));
		comboboxNameArrow.click();
		CommonClass.implicitWait(driver);
		return driver.findElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']")).findVisibleElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']"));
	}

	/*Header->printButton*/
	public void printButton_click(){
		WebElement printButton = driver.findElement(By.xpath(printButton_XPath)).findVisibleElement(By.xpath(printButton_XPath));
		printButton.click();
	}

	/*Header->printButton*/
	public WebElement get_printButton_Self(){
		return driver.findElement(By.xpath(printButton_XPath)).findVisibleElement(By.xpath(printButton_XPath));
	}

	/*Header->printWaterMarkButton*/
	public void printWaterMarkButton_click(){
		WebElement printWaterMarkButton = driver.findElement(By.xpath(printWaterMarkButton_XPath)).findVisibleElement(By.xpath(printWaterMarkButton_XPath));
		printWaterMarkButton.click();
	}

	/*Header->printWaterMarkButton*/
	public WebElement get_printWaterMarkButton_Self(){
		return driver.findElement(By.xpath(printWaterMarkButton_XPath)).findVisibleElement(By.xpath(printWaterMarkButton_XPath));
	}

	/*Header->downloadButton*/
	public void downloadButton_click(){
		WebElement downloadButton = driver.findElement(By.xpath(downloadButton_XPath)).findVisibleElement(By.xpath(downloadButton_XPath));
		downloadButton.click();
	}

	/*Header->downloadButton*/
	public WebElement get_downloadButton_Self(){
		return driver.findElement(By.xpath(downloadButton_XPath)).findVisibleElement(By.xpath(downloadButton_XPath));
	}

	/*Header->downloadWaterMarkButton*/
	public void downloadWaterMarkButton_click(){
		WebElement downloadWaterMarkButton = driver.findElement(By.xpath(downloadWaterMarkButton_XPath)).findVisibleElement(By.xpath(downloadWaterMarkButton_XPath));
		downloadWaterMarkButton.click();
	}

	/*Header->downloadWaterMarkButton*/
	public WebElement get_downloadWaterMarkButton_Self(){
		return driver.findElement(By.xpath(downloadWaterMarkButton_XPath)).findVisibleElement(By.xpath(downloadWaterMarkButton_XPath));
	}

	/*Header->btnApplySearch*/
	public void btnApplySearch_click(){
		WebElement btnApplySearch = driver.findElement(By.xpath(btnApplySearch_XPath)).findVisibleElement(By.xpath(btnApplySearch_XPath));
		btnApplySearch.click();
	}

	/*Header->btnApplySearch*/
	public WebElement get_btnApplySearch_Self(){
		return driver.findElement(By.xpath(btnApplySearch_XPath)).findVisibleElement(By.xpath(btnApplySearch_XPath));
	}

	/*Header->cleanTempleCart*/
	public void cleanTempleCart_click(){
		WebElement cleanTempleCart = driver.findElement(By.xpath(cleanTempleCart_XPath)).findVisibleElement(By.xpath(cleanTempleCart_XPath));
		cleanTempleCart.click();
	}

	/*Header->cleanTempleCart*/
	public WebElement get_cleanTempleCart_Self(){
		return driver.findElement(By.xpath(cleanTempleCart_XPath)).findVisibleElement(By.xpath(cleanTempleCart_XPath));
	}

}
