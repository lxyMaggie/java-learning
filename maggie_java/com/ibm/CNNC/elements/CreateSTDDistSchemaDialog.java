package com.ibm.CNNC.elements;

import org.openqa.selenium.*;
import com.selenium.utils.WebDriver;
import com.selenium.utils.WebElement;

/*catalog\widget\dm\sysmanage\distributionconfig\dijit\templates\CreateSTDDistSchemaDialog.html*/
public class CreateSTDDistSchemaDialog {
	protected WebDriver driver;
	private static final String Actionbar_XPath="//div[contains(@id,'CreateSTDDistSchemaDialog')]";

	//----Constructor Methods Begin----
	public CreateSTDDistSchemaDialog(WebDriver driver){
		this.driver=driver;
	}

	/*CreateSTDDistSchemaDialog->Actionbar*/
	public void Actionbar_clickButtonbyLabel(String labelName){
		WebElement Actionbar = driver.findElement(By.xpath(Actionbar_XPath+"/descendant::div[contains(@class,'DialogPaneActionBar')]/descendant::span[contains(@id,'Button')][normalize-space(text())='"+labelName+"']")).findVisibleElement(By.xpath(Actionbar_XPath+"/descendant::div[contains(@class,'DialogPaneActionBar')]/descendant::span[contains(@id,'Button')][normalize-space(text())='"+labelName+"']"));
		Actionbar.click();
	}

	/*CreateSTDDistSchemaDialog->Actionbar*/
	public WebElement get_Actionbar_Button_Self(String labelName){
		return driver.findElement(By.xpath(Actionbar_XPath+"/descendant::div[contains(@class,'DialogPaneActionBar')]/descendant::span[contains(@id,'Button')][normalize-space(text())='"+labelName+"']")).findVisibleElement(By.xpath(Actionbar_XPath+"/descendant::div[contains(@class,'DialogPaneActionBar')]/descendant::span[contains(@id,'Button')][normalize-space(text())='"+labelName+"']"));
	}

}
