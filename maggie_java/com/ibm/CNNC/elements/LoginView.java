package com.ibm.CNNC.elements;

import org.openqa.selenium.*;
import com.selenium.utils.WebDriver;
import com.selenium.utils.WebElement;

/*catalog\widget\layout\templates\LoginView.html*/
public class LoginView {
	protected WebDriver driver;
	private static final String userId_XPath="//descendant::div[contains(@id,'LoginView')]/descendant::*[contains(@id,'LoginPane')]/descendant::input[contains(@id,'_userId')]";
	private static final String password_XPath="//descendant::div[contains(@id,'LoginView')]/descendant::*[contains(@id,'LoginPane')]/descendant::input[contains(@id,'_password')]";
	private static final String loginButton_XPath="//descendant::div[contains(@id,'LoginView')]/descendant::*[contains(@id,'LoginPane')]/descendant::span[contains(@id,'_LoginButton')][contains(@id, 'Button')][normalize-space(text())='"+"${bundle.login}"+"']";

	//----Constructor Methods Begin----
	public LoginView(WebDriver driver){
		this.driver=driver;
	}

	/*LoginView->LoginPane->userId*/
	public void userId_input(String inputStr){
		WebElement userId=driver.findElement(By.xpath(userId_XPath)).findVisibleElement(By.xpath(userId_XPath));
		userId.click();
		userId.clear();
		userId.sendKeys(inputStr);
	}

	/*LoginView->LoginPane->userId*/
	public WebElement get_userId_Self(){
		return driver.findElement(By.xpath(userId_XPath)).findVisibleElement(By.xpath(userId_XPath));
	}

	/*LoginView->LoginPane->password*/
	public void password_input(String inputStr){
		WebElement password=driver.findElement(By.xpath(password_XPath)).findVisibleElement(By.xpath(password_XPath));
		password.click();
		password.clear();
		password.sendKeys(inputStr);
	}

	/*LoginView->LoginPane->password*/
	public WebElement get_password_Self(){
		return driver.findElement(By.xpath(password_XPath)).findVisibleElement(By.xpath(password_XPath));
	}

	/*LoginView->LoginPane->loginButton*/
	public void loginButton_click(){
		WebElement loginButton = driver.findElement(By.xpath(loginButton_XPath)).findVisibleElement(By.xpath(loginButton_XPath));
		loginButton.click();
	}

	/*LoginView->LoginPane->loginButton*/
	public WebElement get_loginButton_Self(){
		return driver.findElement(By.xpath(loginButton_XPath)).findVisibleElement(By.xpath(loginButton_XPath));
	}

}
