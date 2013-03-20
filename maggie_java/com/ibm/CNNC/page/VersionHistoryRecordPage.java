package com.ibm.CNNC.page;

import java.util.List;

import org.openqa.selenium.By;

import com.selenium.utils.WebDriver;
import com.selenium.utils.WebElement;

public class VersionHistoryRecordPage {
	private WebDriver driver;
	private static final String VersionHistoryRecordGrid_XPath="//descendant::div[contains(@id,'VersionHistory')]/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]";

	public VersionHistoryRecordPage(WebDriver driver){
		this.driver=driver;
	}
	public void VersionHistoryRecordGrid_selectEditionCellbyStateCellText(String StateCellText){
		WebElement VersionHistoryRecordGrid = driver.findElement(By.xpath(VersionHistoryRecordGrid_XPath+"/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+StateCellText+"']/preceding-sibling::td[@idx='2']")).findVisibleElement(By.xpath(VersionHistoryRecordGrid_XPath+"/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+StateCellText+"']/preceding-sibling::td[@idx='2']"));	
		VersionHistoryRecordGrid.click();
	}
	public WebElement get_VersionHistoryRecordGrid_EditionCellbyStateCellText_Self(String StateCellText){
		return driver.findElement(By.xpath(VersionHistoryRecordGrid_XPath+"/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+StateCellText+"']/preceding-sibling::td[@idx='2']")).findVisibleElement(By.xpath(VersionHistoryRecordGrid_XPath+"/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+StateCellText+"']/preceding-sibling::td[@idx='2']"));	
		}


}
