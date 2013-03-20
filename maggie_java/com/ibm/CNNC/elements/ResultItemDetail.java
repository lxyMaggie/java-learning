package com.ibm.CNNC.elements;

import org.openqa.selenium.*;
import com.selenium.utils.WebDriver;
import com.selenium.utils.WebElement;

/*catalog\widget\dm\searchuse\searchplatform\dijit\templates\ResultItemDetail.html*/
public class ResultItemDetail {
	protected WebDriver driver;
	private static final String rate1_XPath="//descendant::a";
	private static final String rate2_XPath="//descendant::a";
	private static final String rate3_XPath="//descendant::a";
	private static final String rate4_XPath="//descendant::a";
	private static final String rate5_XPath="//descendant::a";
	private static final String onAddDocSubscription_XPath="//descendant::div[contains(@id,'ResultItemDetail')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"¶©ÔÄ"+"']";
	private static final String onAddFavouriteFile_XPath="//descendant::div[contains(@id,'ResultItemDetail')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"ÊÕ²Ø"+"']";
	private static final String downloadBtn_XPath="//descendant::div[contains(@id,'ResultItemDetail')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"ÏÂÔØ"+"']";
	private static final String onAddBorrowCart_XPath="//descendant::div[contains(@id,'ResultItemDetail')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"·ÅÈëÔÝ´æ¼Ü"+"']";

	//----Constructor Methods Begin----
	public ResultItemDetail(WebDriver driver){
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

	/*ResultItemDetail->onClick: ->onAddDocSubscription*/
	public void onAddDocSubscription_click(){
		WebElement onAddDocSubscription = driver.findElement(By.xpath(onAddDocSubscription_XPath)).findVisibleElement(By.xpath(onAddDocSubscription_XPath));
		onAddDocSubscription.click();
	}

	/*ResultItemDetail->onClick: ->onAddDocSubscription*/
	public WebElement get_onAddDocSubscription_Self(){
		return driver.findElement(By.xpath(onAddDocSubscription_XPath)).findVisibleElement(By.xpath(onAddDocSubscription_XPath));
	}

	/*ResultItemDetail->onClick: ->onAddFavouriteFile*/
	public void onAddFavouriteFile_click(){
		WebElement onAddFavouriteFile = driver.findElement(By.xpath(onAddFavouriteFile_XPath)).findVisibleElement(By.xpath(onAddFavouriteFile_XPath));
		onAddFavouriteFile.click();
	}

	/*ResultItemDetail->onClick: ->onAddFavouriteFile*/
	public WebElement get_onAddFavouriteFile_Self(){
		return driver.findElement(By.xpath(onAddFavouriteFile_XPath)).findVisibleElement(By.xpath(onAddFavouriteFile_XPath));
	}

	/*ResultItemDetail->downloadBtn*/
	public void downloadBtn_click(){
		WebElement downloadBtn = driver.findElement(By.xpath(downloadBtn_XPath)).findVisibleElement(By.xpath(downloadBtn_XPath));
		downloadBtn.click();
	}

	/*ResultItemDetail->downloadBtn*/
	public WebElement get_downloadBtn_Self(){
		return driver.findElement(By.xpath(downloadBtn_XPath)).findVisibleElement(By.xpath(downloadBtn_XPath));
	}

	/*ResultItemDetail->onClick: ->onAddBorrowCart*/
	public void onAddBorrowCart_click(){
		WebElement onAddBorrowCart = driver.findElement(By.xpath(onAddBorrowCart_XPath)).findVisibleElement(By.xpath(onAddBorrowCart_XPath));
		onAddBorrowCart.click();
	}

	/*ResultItemDetail->onClick: ->onAddBorrowCart*/
	public WebElement get_onAddBorrowCart_Self(){
		return driver.findElement(By.xpath(onAddBorrowCart_XPath)).findVisibleElement(By.xpath(onAddBorrowCart_XPath));
	}

}
