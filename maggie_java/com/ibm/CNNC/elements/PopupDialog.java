package com.ibm.CNNC.elements;

import org.openqa.selenium.By;

import com.selenium.utils.WebDriver;
import com.selenium.utils.WebElement;

public class PopupDialog {
	protected WebDriver driver;
	private static final String ConfirmButton_XPath="//descendant::div[contains(@id,'dijit_DialogButtonBar')]/descendant::span[contains(@id,'dijit_form_Button')]/descendant::span[normalize-space(text())='ȷ��']";
	private static final String ConfirmYesButton_XPath="//descendant::div[contains(@id,'dijit_DialogButtonBar')]/descendant::span[contains(@id,'dijit_form_Button')]/descendant::span[normalize-space(text())='��']";
	private static final String ConfirmNoButton_XPath="//descendant::div[contains(@id,'dijit_DialogButtonBar')]/descendant::span[contains(@id,'dijit_form_Button')]/descendant::span[normalize-space(text())='��']";
	private static final String TitleSuccess_XPath="//descendant::div[contains(@id,'MessageDialog')]/descendant::span[contains(@id,'title')]";
	private static final String ContentSuccess_XPath="//descendant::div[contains(@id,'MessageDialog')]/descendant::div[contains(@id,'messageNodeID')]";
	public PopupDialog(WebDriver driver){
		this.driver=driver;
	}
	//�����Ի���ȷ��
	public void ConfirmButton_Click(){
		WebElement confirm=driver.findElement(By.xpath(ConfirmButton_XPath)).findVisibleElement(By.xpath(ConfirmButton_XPath));
		confirm.click();
	}
	public WebElement get_ConfirmButton_Self(){
		return driver.findElement(By.xpath(ConfirmButton_XPath)).findVisibleElement(By.xpath(ConfirmButton_XPath));
	}
	//�����Ի�����
	public void ConfirmYesButton_Click(){
		WebElement confirm=driver.findElement(By.xpath(ConfirmYesButton_XPath)).findVisibleElement(By.xpath(ConfirmYesButton_XPath));
		confirm.click();
	}
	public WebElement get_ConfirmYesButton_Self(){
		return driver.findElement(By.xpath(ConfirmYesButton_XPath)).findVisibleElement(By.xpath(ConfirmYesButton_XPath));
	}
	//�����Ի����
	public void ConfirmNoButton_Click(){
		WebElement confirmno=driver.findElement(By.xpath(ConfirmNoButton_XPath)).findVisibleElement(By.xpath(ConfirmNoButton_XPath));
		confirmno.click();
	}
	public WebElement get_ConfirmNoButton_Self(){
		return driver.findElement(By.xpath(ConfirmNoButton_XPath)).findVisibleElement(By.xpath(ConfirmNoButton_XPath));
	}
	//ȷ���Ƿ�ɹ�
	public WebElement get_TitleResult_self(){
		return	driver.findElement(By.xpath(TitleSuccess_XPath)).findVisibleElement(By.xpath(TitleSuccess_XPath));		 
	}
	//ȷ���Ƿ�ɹ�
		public WebElement get_ContentResult_self(){
			return	driver.findElement(By.xpath(ContentSuccess_XPath)).findVisibleElement(By.xpath(ContentSuccess_XPath));	 
		}
}
