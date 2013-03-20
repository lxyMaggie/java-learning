package com.ibm.CNNC.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.selenium.utils.WebDriver;

public class SearchDialog {
  private WebDriver driver;
  private static final String SearchDialog_XPath="//descendant::div[contains(@id,'SearchDialog')]/descendant::div[contains(@id,'TextField')]/descendant::input[contains(@id,'ValidationTextBox')]";
  private static final String SearchDialogConfirm_XPath="//descendant::div[contains(@id,'SearchDialog')]/descendant::div[contains(@id,'DialogButtonBar')]/descendant::span[normalize-space(text())='È·¶¨']";
  
  public SearchDialog(WebDriver driver){
	  this.driver=driver;
  }
  public void SearchDialogInput(String InputStr){
	  WebElement dialogInput=driver.findElement(By.xpath(SearchDialog_XPath)).findVisibleElement(By.xpath(SearchDialog_XPath));
	  dialogInput.click();
	  dialogInput.clear();
	  dialogInput.sendKeys(InputStr);
  }
  public void SearchDialogConfirm(){
	  WebElement confirmbutton=driver.findElement(By.xpath(SearchDialogConfirm_XPath)).findVisibleElement(By.xpath(SearchDialogConfirm_XPath));
	  confirmbutton.click();
  }

}
