package com.ibm.CNNC.elements;

import org.openqa.selenium.*;
import com.selenium.utils.WebDriver;
import com.selenium.utils.WebElement;

/*catalog\widget\dm\headquartermanage\standardrulestructuremanage\templates\StandardRuleStructureManage.html*/
public class StandardRuleStructureManage {
	protected WebDriver driver;
	private static final String domain_XPath="//descendant::div[contains(@id,'StandardRuleStructureManage')]/descendant::div";

	//----Constructor Methods Begin----
	public StandardRuleStructureManage(WebDriver driver){
		this.driver=driver;
	}

	/*StandardRuleStructureManage->domain*/
	public void domain_input(String inputStr){
		WebElement domain=driver.findElement(By.xpath(domain_XPath+"/descendant::input[contains(@role,'textbox')]")).findVisibleElement(By.xpath(domain_XPath+"/descendant::input[contains(@role,'textbox')]"));
		domain.click();
		domain.clear();
		domain.sendKeys(inputStr);
	}

	/*StandardRuleStructureManage->domain*/
	public void domain_select(String selectStr){
		WebElement domain=driver.findElement(By.xpath(domain_XPath)).findVisibleElement(By.xpath(domain_XPath));
		domain.click();
		WebElement comboboxNameArrow =driver.findElement(By.xpath(domain_XPath+"/descendant::input[contains(@class,'ArrowButton')]")).findVisibleElement(By.xpath(domain_XPath+"/descendant::input[contains(@class,'ArrowButton')]"));
		comboboxNameArrow.click();
		CommonClass.implicitWait(driver);
		WebElement mySelectItem=driver.findElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']")).findVisibleElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']"));
		mySelectItem.click();
	}

	/*StandardRuleStructureManage->domain*/
	public WebElement get_domain_input_Self(){
		return driver.findElement(By.xpath(domain_XPath+"/descendant::input[contains(@role,'textbox')]")).findVisibleElement(By.xpath(domain_XPath+"/descendant::input[contains(@role,'textbox')]"));
	}

	/*StandardRuleStructureManage->domain*/
	public WebElement get_domain_selectItem_Self(String selectStr){
		WebElement domain=driver.findElement(By.xpath(domain_XPath)).findVisibleElement(By.xpath(domain_XPath));
		domain.click();
		WebElement comboboxNameArrow =driver.findElement(By.xpath(domain_XPath+"/descendant::input[contains(@class,'ArrowButton')]")).findVisibleElement(By.xpath(domain_XPath+"/descendant::input[contains(@class,'ArrowButton')]"));
		comboboxNameArrow.click();
		CommonClass.implicitWait(driver);
		return driver.findElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']")).findVisibleElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']"));
	}

}
