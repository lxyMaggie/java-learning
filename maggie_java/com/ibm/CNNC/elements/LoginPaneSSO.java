package com.ibm.CNNC.elements;

import org.openqa.selenium.*;
import com.selenium.utils.WebDriver;
import com.selenium.utils.WebElement;

/*catalog\widget\common\loginpane\templates\LoginPane.html*/
public class LoginPaneSSO {
	protected WebDriver driver;
	private static final String userId_XPath="//descendant::input[contains(@id,'username')]";
	private static final String password_XPath="//descendant::input[contains(@id,'password')]";
	private static final String loginButton_XPath="//descendant::img[contains(@id,'login')]";

	//----Constructor Methods Begin----
	public LoginPaneSSO(WebDriver driver){
		this.driver=driver;
	}

	/*LoginPane->userId*/
	public void userId_input(String inputStr){
		WebElement userId=driver.findElement(By.xpath(userId_XPath)).findVisibleElement(By.xpath(userId_XPath));
		userId.click();
		userId.clear();
		userId.sendKeys(inputStr);
	}

	/*LoginPane->userId*/
	public WebElement get_userId_Self(){
		return driver.findElement(By.xpath(userId_XPath)).findVisibleElement(By.xpath(userId_XPath));
	}

	/*LoginPane->password*/
	public void password_input(String inputStr){
		WebElement password=driver.findElement(By.xpath(password_XPath)).findVisibleElement(By.xpath(password_XPath));
		password.click();
		password.clear();
		password.sendKeys(inputStr);
	}

	/*LoginPane->password*/
	public WebElement get_password_Self(){
		return driver.findElement(By.xpath(password_XPath)).findVisibleElement(By.xpath(password_XPath));
	}

	/*LoginPane->loginButton*/
	public void loginButton_click(){
		WebElement loginButton = driver.findElement(By.xpath(loginButton_XPath)).findVisibleElement(By.xpath(loginButton_XPath));
		loginButton.click();
	}

	/*LoginPane->loginButton*/
	public WebElement get_loginButton_Self(){
		return driver.findElement(By.xpath(loginButton_XPath)).findVisibleElement(By.xpath(loginButton_XPath));
	}

}
