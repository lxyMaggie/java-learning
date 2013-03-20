package com.ibm.CNNC.elements;

import org.openqa.selenium.*;
import com.selenium.utils.WebDriver;
import com.selenium.utils.WebElement;

/*catalog\widget\dm\searchuse\searchplatform\dijit\templates\ResultItem.html*/
public class ResultItem {
	protected WebDriver driver;
	private static final String rate1_XPath="//descendant::a";
	private static final String rate2_XPath="//descendant::a";
	private static final String rate3_XPath="//descendant::a";
	private static final String rate4_XPath="//descendant::a";
	private static final String rate5_XPath="//descendant::a";

	//----Constructor Methods Begin----
	public ResultItem(WebDriver driver){
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

}
