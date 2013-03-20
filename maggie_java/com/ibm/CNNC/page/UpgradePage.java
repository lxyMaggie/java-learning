package com.ibm.CNNC.page;
import org.openqa.selenium.By;

import com.ibm.CNNC.elements.CommonClass;
import com.selenium.utils.WebDriver;
import com.selenium.utils.WebElement;
public class UpgradePage {
	protected WebDriver driver;
	//����ҳ���xpath,���Ե�ͨ��character����ʾ����ͬ�Ŀ���ͨ����ͬ��select�ַ���ʾ
	//private static final String ContentLayout_XPath="descendant::div[contains(@id,dijit_layout_ContentPane)]";
	private static final String PropertyLable_XPath="//descendant::div[contains(@id,'dijit_layout_ContentPane')]//descendant::span[contains(@id,'DynamicForm')]";
	private static final String ContentLable_XPath="//descendant::div[contains(@id,'dijit_layout_ContentPane')]//descendant::span[contains(@id,'AttachedContentList')]";
	private static final String LinkedFileLable_XPath="//descendant::div[contains(@id,'dijit_layout_ContentPane')]//descendant::span[contains(@id,'LinkedContentList')]";
	private static final String VersionHistoryLable_XPath="//descendant::div[contains(@id,'dijit_layout_ContentPane')]//descendant::span[contains(@id,'VersionHistory')]";
	private static final String DocumentPermissionLable_XPath="//descendant::div[contains(@id,'dijit_layout_ContentPane')]//descendant::span[contains(@id,'DocumentPermissionSetting')]";
	private static final String ControlContentLable_XPath="//descendant::div[contains(@id,'dijit_layout_ContentPane')]//descendant::span[contains(@id,'ControlContentList')]";
	private static final String UpgradeButton_XPath="//descendant::div[contains(@id,'dijit_layout_ContentPane')]//descendant::span[contains(@id,'dijit_form_Button')][normalize-space(text())='"+"����"+"']";
	
	public UpgradePage(WebDriver driver){
		this.driver=driver;
	}
	//����
	public void Property_Click(){
		WebElement character=driver.findElement(By.xpath(PropertyLable_XPath)).findVisibleElement(By.xpath(PropertyLable_XPath));
		character.click();
	}
	public WebElement get_Property_Self(){
		return driver.findElement(By.xpath(PropertyLable_XPath)).findVisibleElement(By.xpath(PropertyLable_XPath));
	}
	//����
	public void Content_Click(){
		WebElement character=driver.findElement(By.xpath(ContentLable_XPath)).findVisibleElement(By.xpath(ContentLable_XPath));
		character.click();
	}
	public WebElement get_Content_Self(){
		return driver.findElement(By.xpath(PropertyLable_XPath)).findVisibleElement(By.xpath(ContentLable_XPath));
	}
	//�����ļ�
	public void LinkedFile_Click(){
		WebElement character=driver.findElement(By.xpath(LinkedFileLable_XPath)).findVisibleElement(By.xpath(LinkedFileLable_XPath));
		character.click();
	}
	public WebElement get_LinkedFile_Self(){
		return driver.findElement(By.xpath(LinkedFileLable_XPath)).findVisibleElement(By.xpath(LinkedFileLable_XPath));
	}
	//�汾��ʷ
	public void VersionHistory_Click(){
		WebElement character=driver.findElement(By.xpath(VersionHistoryLable_XPath)).findVisibleElement(By.xpath(VersionHistoryLable_XPath));
		character.click();
	}
	public WebElement get_VersionHistory_Self(){
		return driver.findElement(By.xpath(VersionHistoryLable_XPath)).findVisibleElement(By.xpath(VersionHistoryLable_XPath));
	}
	//Ȩ��
	public void DocumentPermission_Click(){
		WebElement character=driver.findElement(By.xpath(DocumentPermissionLable_XPath)).findVisibleElement(By.xpath(DocumentPermissionLable_XPath));
		character.click();
	}
	public WebElement get_DocumentPermission_Self(){
		return driver.findElement(By.xpath(DocumentPermissionLable_XPath)).findVisibleElement(By.xpath(DocumentPermissionLable_XPath));
	}
	//�ܿع���
	public void ControlContent_Click(){
		WebElement character=driver.findElement(By.xpath(ControlContentLable_XPath)).findVisibleElement(By.xpath(ControlContentLable_XPath));
		character.click();
	}
	public WebElement get_ControlContent_Self(String selectStr){
		return driver.findElement(By.xpath(ControlContentLable_XPath)).findVisibleElement(By.xpath(ControlContentLable_XPath));
	}
	//���水ť
	public void UpgradeButton_Click(){
		WebElement upgrade=driver.findElement(By.xpath(UpgradeButton_XPath)).findVisibleElement(By.xpath(UpgradeButton_XPath));
		upgrade.click();
	}
	public WebElement get_UpgradeButton_Self(){
		return driver.findElement(By.xpath(UpgradeButton_XPath)).findVisibleElement(By.xpath(UpgradeButton_XPath));
	}
	
}
