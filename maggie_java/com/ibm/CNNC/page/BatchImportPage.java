package com.ibm.CNNC.page;

import org.openqa.selenium.By;

import com.ibm.CNNC.elements.BatchImport;
import com.selenium.utils.WebDriver;
import com.selenium.utils.WebElement;

public class BatchImportPage extends BatchImport {
	private static final String packageSelect_Button_XPath="//descendant::div[contains(@id,'BatchImport')]/descendant::span[contains(@id,'uploader')][normalize-space(text())='Ñ¡Ôñ°ü']";
	private static final String dialog_Yes_XPath="//descendant::div[contains(@class,'ecm ecmMessageDialog dijitDialog')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='ÊÇ']";
	private static final String dialog_No_XPath="//descendant::div[contains(@class,'ecm ecmMessageDialog dijitDialog')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='·ñ']";

	//----Constructor Methods Begin----	
	public BatchImportPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	/*BatchImport->packageSelect*/
	public void packageSelectButton_click() {
		WebElement packageSelect_Button = driver.findElement(By.xpath(packageSelect_Button_XPath)).findVisibleElement(By.xpath(packageSelect_Button_XPath));
		packageSelect_Button.click();		
	}
	
	/*BatchImport->packageSelect*/
	public void packageSelect(String packageName) {
		driver.findElement(By.name("uploadedfile")).sendKeys(packageName);
	}
	
	/*BatchImport->dialog_Yes*/
	public void dialog_Yes_Click() {
		WebElement dialog_Yes = driver.findElement(By.xpath(dialog_Yes_XPath)).findVisibleElement(By.xpath(dialog_Yes_XPath));
		dialog_Yes.click();
	}

	/*BatchImport->dialog_No*/
	public void dialog_No_Click() {
		WebElement dialog_No = driver.findElement(By.xpath(dialog_No_XPath)).findVisibleElement(By.xpath(dialog_No_XPath));
		dialog_No.click();
	}
	
}
