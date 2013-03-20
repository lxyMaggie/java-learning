package com.ibm.CNNC.elements;

import org.openqa.selenium.*;
import com.selenium.utils.WebDriver;
import com.selenium.utils.WebElement;

/*catalog\widget\dm\sysmanage\distributionconfig\dijit\templates\ModifyStdItemDialog.html*/
public class ModifyStdItemDialog {
	protected WebDriver driver;
	private static final String DistType_XPath="//descendant::div[contains(@id,'ModifyStdItemDialog')]/descendant::span[normalize-space(text())='·¢ËÍÀàÐÍ']/../../descendant::div[contains(@id,'widget_dijit_form_FilteringSelect')]";
	private static final String Actionbar_XPath="//div[contains(@id,'ModifyStdItemDialog')]";

	//----Constructor Methods Begin----
	public ModifyStdItemDialog(WebDriver driver){
		this.driver=driver;
	}

	/*ModifyStdItemDialog->DistType*/
	public void DistType_input(String inputStr){
		WebElement DistType=driver.findElement(By.xpath(DistType_XPath+"/descendant::input[contains(@role,'textbox')]")).findVisibleElement(By.xpath(DistType_XPath+"/descendant::input[contains(@role,'textbox')]"));
		DistType.click();
		DistType.clear();
		DistType.sendKeys(inputStr);
	}

	/*ModifyStdItemDialog->DistType*/
	public void DistType_select(String selectStr){
		WebElement DistType=driver.findElement(By.xpath(DistType_XPath)).findVisibleElement(By.xpath(DistType_XPath));
		DistType.click();
		WebElement comboboxNameArrow =driver.findElement(By.xpath(DistType_XPath+"/descendant::input[contains(@class,'ArrowButton')]")).findVisibleElement(By.xpath(DistType_XPath+"/descendant::input[contains(@class,'ArrowButton')]"));
		comboboxNameArrow.click();
		CommonClass.implicitWait(driver);
		WebElement mySelectItem=driver.findElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']")).findVisibleElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']"));
		mySelectItem.click();
	}

	/*ModifyStdItemDialog->DistType*/
	public WebElement get_DistType_input_Self(){
		return driver.findElement(By.xpath(DistType_XPath+"/descendant::input[contains(@role,'textbox')]")).findVisibleElement(By.xpath(DistType_XPath+"/descendant::input[contains(@role,'textbox')]"));
	}

	/*ModifyStdItemDialog->DistType*/
	public WebElement get_DistType_selectItem_Self(String selectStr){
		WebElement DistType=driver.findElement(By.xpath(DistType_XPath)).findVisibleElement(By.xpath(DistType_XPath));
		DistType.click();
		WebElement comboboxNameArrow =driver.findElement(By.xpath(DistType_XPath+"/descendant::input[contains(@class,'ArrowButton')]")).findVisibleElement(By.xpath(DistType_XPath+"/descendant::input[contains(@class,'ArrowButton')]"));
		comboboxNameArrow.click();
		CommonClass.implicitWait(driver);
		return driver.findElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']")).findVisibleElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']"));
	}

	/*ModifyStdItemDialog->Actionbar*/
	public void Actionbar_clickButtonbyLabel(String labelName){
		WebElement Actionbar = driver.findElement(By.xpath(Actionbar_XPath+"/descendant::div[contains(@class,'DialogPaneActionBar')]/descendant::span[contains(@id,'Button')][normalize-space(text())='"+labelName+"']")).findVisibleElement(By.xpath(Actionbar_XPath+"/descendant::div[contains(@class,'DialogPaneActionBar')]/descendant::span[contains(@id,'Button')][normalize-space(text())='"+labelName+"']"));
		Actionbar.click();
	}

	/*ModifyStdItemDialog->Actionbar*/
	public WebElement get_Actionbar_Button_Self(String labelName){
		return driver.findElement(By.xpath(Actionbar_XPath+"/descendant::div[contains(@class,'DialogPaneActionBar')]/descendant::span[contains(@id,'Button')][normalize-space(text())='"+labelName+"']")).findVisibleElement(By.xpath(Actionbar_XPath+"/descendant::div[contains(@class,'DialogPaneActionBar')]/descendant::span[contains(@id,'Button')][normalize-space(text())='"+labelName+"']"));
	}

}
