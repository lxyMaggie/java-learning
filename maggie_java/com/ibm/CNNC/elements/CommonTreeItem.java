package com.ibm.CNNC.elements;

import org.openqa.selenium.*;
import com.selenium.utils.WebDriver;
import com.selenium.utils.WebElement;

/*catalog\widget\dm\docmanage\commontreeitem\templates\CommonTreeItem.html*/
public class CommonTreeItem {
	protected WebDriver driver;
	private static final String NoName0_XPath="//descendant::a";
	private static final String NoName1_XPath="//descendant::a";
	private static final String NoName2_XPath="//descendant::a";
	private static final String NoName3_XPath="//descendant::a";
	private static final String NoName4_XPath="//descendant::a";
	private static final String NoName5_XPath="//descendant::a";

	//----Constructor Methods Begin----
	public CommonTreeItem(WebDriver driver){
		this.driver=driver;
	}

	/**/
	public void NoName0_click(){
		WebElement NoName0 = driver.findElement(By.xpath(NoName0_XPath)).findVisibleElement(By.xpath(NoName0_XPath));
		NoName0.click();
	}

	/**/
	public WebElement get_NoName0_Self(){
		return driver.findElement(By.xpath(NoName0_XPath)).findVisibleElement(By.xpath(NoName0_XPath));
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
	public void NoName2_click(){
		WebElement NoName2 = driver.findElement(By.xpath(NoName2_XPath)).findVisibleElement(By.xpath(NoName2_XPath));
		NoName2.click();
	}

	/**/
	public WebElement get_NoName2_Self(){
		return driver.findElement(By.xpath(NoName2_XPath)).findVisibleElement(By.xpath(NoName2_XPath));
	}

	/**/
	public void NoName3_click(){
		WebElement NoName3 = driver.findElement(By.xpath(NoName3_XPath)).findVisibleElement(By.xpath(NoName3_XPath));
		NoName3.click();
	}

	/**/
	public WebElement get_NoName3_Self(){
		return driver.findElement(By.xpath(NoName3_XPath)).findVisibleElement(By.xpath(NoName3_XPath));
	}

	/**/
	public void NoName4_click(){
		WebElement NoName4 = driver.findElement(By.xpath(NoName4_XPath)).findVisibleElement(By.xpath(NoName4_XPath));
		NoName4.click();
	}

	/**/
	public WebElement get_NoName4_Self(){
		return driver.findElement(By.xpath(NoName4_XPath)).findVisibleElement(By.xpath(NoName4_XPath));
	}

	/**/
	public void NoName5_click(){
		WebElement NoName5 = driver.findElement(By.xpath(NoName5_XPath)).findVisibleElement(By.xpath(NoName5_XPath));
		NoName5.click();
	}

	/**/
	public WebElement get_NoName5_Self(){
		return driver.findElement(By.xpath(NoName5_XPath)).findVisibleElement(By.xpath(NoName5_XPath));
	}

}
