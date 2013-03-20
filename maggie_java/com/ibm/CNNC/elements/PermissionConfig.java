package com.ibm.CNNC.elements;

import java.util.*;
import org.openqa.selenium.*;
import com.selenium.utils.WebDriver;
import com.selenium.utils.WebElement;

/*catalog\widget\dm\common\permissionconfig\templates\PermissionConfig.html*/
public class PermissionConfig {
	protected WebDriver driver;
	private static final String DocumentClassAuthorize_DocumentPermissionSetting_selectDocGrantee_XPath="//descendant::div[contains(@id,'PermissionConfig')]/descendant::*[contains(@id,'DocumentClassAuthorize')]/descendant::*[contains(@id,'DocumentPermissionSetting')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"${resourceBundle.selectGrantee}"+"']";
	private static final String DocumentClassAuthorize_DocumentPermissionSetting_deleteButton_XPath="//descendant::div[contains(@id,'PermissionConfig')]/descendant::*[contains(@id,'DocumentClassAuthorize')]/descendant::*[contains(@id,'DocumentPermissionSetting')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"${resourceBundle.delete}"+"']";
	private static final String DocumentClassAuthorize_DocumentPermissionSetting_dDefaultGrid_XPath="//descendant::div[contains(@id,'PermissionConfig')]/descendant::*[contains(@id,'DocumentClassAuthorize')]/descendant::*[contains(@id,'DocumentPermissionSetting')]/descendant::div[contains(@id,'DataGrid')]";
	private static final String DocumentClassAuthorize_DocumentPermissionSetting_saveButton_XPath="//descendant::div[contains(@id,'PermissionConfig')]/descendant::*[contains(@id,'DocumentClassAuthorize')]/descendant::*[contains(@id,'DocumentPermissionSetting')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"${resourceBundle.save}"+"']";
	private static final String DocumentClassAuthorize_DocumentPermissionSetting_cancelButton_XPath="//descendant::div[contains(@id,'PermissionConfig')]/descendant::*[contains(@id,'DocumentClassAuthorize')]/descendant::*[contains(@id,'DocumentPermissionSetting')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"${resourceBundle.cancel}"+"']";
	private static final String DocumentClassAuthorize_saveButton_XPath="//descendant::div[contains(@id,'PermissionConfig')]/descendant::*[contains(@id,'DocumentClassAuthorize')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"${resourceBundle.save}"+"']";
	private static final String DocumentClassAuthorize_cancelButton_XPath="//descendant::div[contains(@id,'PermissionConfig')]/descendant::*[contains(@id,'DocumentClassAuthorize')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"${resourceBundle.cancel}"+"']";

	//----Constructor Methods Begin----
	public PermissionConfig(WebDriver driver){
		this.driver=driver;
	}

	/*PermissionConfig->DocumentClassAuthorize->DocumentPermissionSetting->selectDocGrantee*/
	public void DocumentClassAuthorize_DocumentPermissionSetting_selectDocGrantee_click(){
		WebElement DocumentClassAuthorize_DocumentPermissionSetting_selectDocGrantee = driver.findElement(By.xpath(DocumentClassAuthorize_DocumentPermissionSetting_selectDocGrantee_XPath)).findVisibleElement(By.xpath(DocumentClassAuthorize_DocumentPermissionSetting_selectDocGrantee_XPath));
		DocumentClassAuthorize_DocumentPermissionSetting_selectDocGrantee.click();
	}

	/*PermissionConfig->DocumentClassAuthorize->DocumentPermissionSetting->selectDocGrantee*/
	public WebElement get_DocumentClassAuthorize_DocumentPermissionSetting_selectDocGrantee_Self(){
		return driver.findElement(By.xpath(DocumentClassAuthorize_DocumentPermissionSetting_selectDocGrantee_XPath)).findVisibleElement(By.xpath(DocumentClassAuthorize_DocumentPermissionSetting_selectDocGrantee_XPath));
	}

	/*PermissionConfig->DocumentClassAuthorize->DocumentPermissionSetting->deleteButton*/
	public void DocumentClassAuthorize_DocumentPermissionSetting_deleteButton_click(){
		WebElement DocumentClassAuthorize_DocumentPermissionSetting_deleteButton = driver.findElement(By.xpath(DocumentClassAuthorize_DocumentPermissionSetting_deleteButton_XPath)).findVisibleElement(By.xpath(DocumentClassAuthorize_DocumentPermissionSetting_deleteButton_XPath));
		DocumentClassAuthorize_DocumentPermissionSetting_deleteButton.click();
	}

	/*PermissionConfig->DocumentClassAuthorize->DocumentPermissionSetting->deleteButton*/
	public WebElement get_DocumentClassAuthorize_DocumentPermissionSetting_deleteButton_Self(){
		return driver.findElement(By.xpath(DocumentClassAuthorize_DocumentPermissionSetting_deleteButton_XPath)).findVisibleElement(By.xpath(DocumentClassAuthorize_DocumentPermissionSetting_deleteButton_XPath));
	}

	/*PermissionConfig->DocumentClassAuthorize->DocumentPermissionSetting->defaultGrid*/
	public void DocumentClassAuthorize_DocumentPermissionSetting_dDefaultGrid_colCaptionClick(String captionName){
		WebElement DocumentClassAuthorize_DocumentPermissionSetting_dDefaultGrid = driver.findElement(By.xpath(DocumentClassAuthorize_DocumentPermissionSetting_dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']")).findVisibleElement(By.xpath(DocumentClassAuthorize_DocumentPermissionSetting_dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']"));
		DocumentClassAuthorize_DocumentPermissionSetting_dDefaultGrid.click();
	}

	/*PermissionConfig->DocumentClassAuthorize->DocumentPermissionSetting->defaultGrid*/
	public void DocumentClassAuthorize_DocumentPermissionSetting_dDefaultGrid_selectCellbyRowColNumber(int rowNum,int colNum){
		WebElement DocumentClassAuthorize_DocumentPermissionSetting_dDefaultGrid = driver.findElement(By.xpath(DocumentClassAuthorize_DocumentPermissionSetting_dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]")).findVisibleElement(By.xpath(DocumentClassAuthorize_DocumentPermissionSetting_dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]"));
		DocumentClassAuthorize_DocumentPermissionSetting_dDefaultGrid.click();
	}

	/*PermissionConfig->DocumentClassAuthorize->DocumentPermissionSetting->defaultGrid*/
	public void DocumentClassAuthorize_DocumentPermissionSetting_dDefaultGrid_selectRowbyRowColNumber(int rowNum,int colNum){
		WebElement DocumentClassAuthorize_DocumentPermissionSetting_dDefaultGrid = driver.findElement(By.xpath(DocumentClassAuthorize_DocumentPermissionSetting_dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/..")).findVisibleElement(By.xpath(DocumentClassAuthorize_DocumentPermissionSetting_dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/.."));
		DocumentClassAuthorize_DocumentPermissionSetting_dDefaultGrid.click();
	}

	/*PermissionConfig->DocumentClassAuthorize->DocumentPermissionSetting->defaultGrid*/
	public void DocumentClassAuthorize_DocumentPermissionSetting_dDefaultGrid_selectRowbyRowNumber(int rowNum){
		WebElement DocumentClassAuthorize_DocumentPermissionSetting_dDefaultGrid = driver.findElement(By.xpath(DocumentClassAuthorize_DocumentPermissionSetting_dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr")).findVisibleElement(By.xpath(DocumentClassAuthorize_DocumentPermissionSetting_dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr"));
		DocumentClassAuthorize_DocumentPermissionSetting_dDefaultGrid.click();
	}

	/*PermissionConfig->DocumentClassAuthorize->DocumentPermissionSetting->defaultGrid*/
	public void DocumentClassAuthorize_DocumentPermissionSetting_dDefaultGrid_selectCellbyCellText(String cellText){
		WebElement DocumentClassAuthorize_DocumentPermissionSetting_dDefaultGrid = driver.findElement(By.xpath(DocumentClassAuthorize_DocumentPermissionSetting_dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']")).findVisibleElement(By.xpath(DocumentClassAuthorize_DocumentPermissionSetting_dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']"));
		DocumentClassAuthorize_DocumentPermissionSetting_dDefaultGrid.click();
	}

	/*PermissionConfig->DocumentClassAuthorize->DocumentPermissionSetting->defaultGrid*/
	public void DocumentClassAuthorize_DocumentPermissionSetting_dDefaultGrid_selectRowbyCellText(String cellText){
		WebElement DocumentClassAuthorize_DocumentPermissionSetting_dDefaultGrid = driver.findElement(By.xpath(DocumentClassAuthorize_DocumentPermissionSetting_dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/..")).findVisibleElement(By.xpath(DocumentClassAuthorize_DocumentPermissionSetting_dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/.."));
		DocumentClassAuthorize_DocumentPermissionSetting_dDefaultGrid.click();
	}

	/*PermissionConfig->DocumentClassAuthorize->DocumentPermissionSetting->defaultGrid*/
	public void DocumentClassAuthorize_DocumentPermissionSetting_dDefaultGrid_selectCellbyOtherInlineCellText(String otherInlineCellText,String targetCellText){
		WebElement DocumentClassAuthorize_DocumentPermissionSetting_dDefaultGrid = driver.findElement(By.xpath(DocumentClassAuthorize_DocumentPermissionSetting_dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']")).findVisibleElement(By.xpath(DocumentClassAuthorize_DocumentPermissionSetting_dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']"));
		DocumentClassAuthorize_DocumentPermissionSetting_dDefaultGrid.click();
	}

	/*PermissionConfig->DocumentClassAuthorize->DocumentPermissionSetting->defaultGrid*/
	public void DocumentClassAuthorize_DocumentPermissionSetting_dDefaultGrid_selectCellbyColNameCellText(String colName,String cellText){
		WebElement DocumentClassAuthorize_DocumentPermissionSetting_dDefaultGrid = driver.findElement(By.xpath(DocumentClassAuthorize_DocumentPermissionSetting_dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../..")).findVisibleElement(By.xpath(DocumentClassAuthorize_DocumentPermissionSetting_dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../.."));
		String idx=DocumentClassAuthorize_DocumentPermissionSetting_dDefaultGrid.getAttribute("idx");
		List<WebElement> Gridrows = driver.findAll(By.xpath(DocumentClassAuthorize_DocumentPermissionSetting_dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]"));
		for (WebElement w : Gridrows)
		{
			WebElement Gridrow = w.findElement(By.xpath("./descendant::td[@idx="+idx+"]"));
			if(Gridrow.getText().contains(cellText)) 
			{
				Gridrow.click();
				break;
			}
		}
	}

	/*PermissionConfig->DocumentClassAuthorize->DocumentPermissionSetting->defaultGrid*/
	public WebElement get_DocumentClassAuthorize_DocumentPermissionSetting_dDefaultGrid_colCaption_Self(String captionName){
		return driver.findElement(By.xpath(DocumentClassAuthorize_DocumentPermissionSetting_dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']")).findVisibleElement(By.xpath(DocumentClassAuthorize_DocumentPermissionSetting_dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']"));
	}

	/*PermissionConfig->DocumentClassAuthorize->DocumentPermissionSetting->defaultGrid*/
	public WebElement get_DocumentClassAuthorize_DocumentPermissionSetting_dDefaultGrid_CellbyRowColNumber_Self(int rowNum,int colNum){
		return driver.findElement(By.xpath(DocumentClassAuthorize_DocumentPermissionSetting_dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]")).findVisibleElement(By.xpath(DocumentClassAuthorize_DocumentPermissionSetting_dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]"));
	}

	/*PermissionConfig->DocumentClassAuthorize->DocumentPermissionSetting->defaultGrid*/
	public WebElement get_DocumentClassAuthorize_DocumentPermissionSetting_dDefaultGrid_RowbyRowColNumber_Self(int rowNum,int colNum){
		return driver.findElement(By.xpath(DocumentClassAuthorize_DocumentPermissionSetting_dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/..")).findVisibleElement(By.xpath(DocumentClassAuthorize_DocumentPermissionSetting_dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/.."));
	}

	/*PermissionConfig->DocumentClassAuthorize->DocumentPermissionSetting->defaultGrid*/
	public WebElement get_DocumentClassAuthorize_DocumentPermissionSetting_dDefaultGrid_RowbyRowNumber_Self(int rowNum){
		return driver.findElement(By.xpath(DocumentClassAuthorize_DocumentPermissionSetting_dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr")).findVisibleElement(By.xpath(DocumentClassAuthorize_DocumentPermissionSetting_dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr"));
	}

	/*PermissionConfig->DocumentClassAuthorize->DocumentPermissionSetting->defaultGrid*/
	public WebElement get_DocumentClassAuthorize_DocumentPermissionSetting_dDefaultGrid_CellbyCellText_Self(String cellText){
		return driver.findElement(By.xpath(DocumentClassAuthorize_DocumentPermissionSetting_dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']")).findVisibleElement(By.xpath(DocumentClassAuthorize_DocumentPermissionSetting_dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']"));
	}

	/*PermissionConfig->DocumentClassAuthorize->DocumentPermissionSetting->defaultGrid*/
	public WebElement get_DocumentClassAuthorize_DocumentPermissionSetting_dDefaultGrid_RowbyCellText_Self(String cellText){
		return driver.findElement(By.xpath(DocumentClassAuthorize_DocumentPermissionSetting_dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/..")).findVisibleElement(By.xpath(DocumentClassAuthorize_DocumentPermissionSetting_dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/.."));
	}

	/*PermissionConfig->DocumentClassAuthorize->DocumentPermissionSetting->defaultGrid*/
	public WebElement get_DocumentClassAuthorize_DocumentPermissionSetting_dDefaultGrid_CellbyOtherInlineCellText_Self(String otherInlineCellText,String targetCellText){
		return driver.findElement(By.xpath(DocumentClassAuthorize_DocumentPermissionSetting_dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']")).findVisibleElement(By.xpath(DocumentClassAuthorize_DocumentPermissionSetting_dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']"));
	}

	/*PermissionConfig->DocumentClassAuthorize->DocumentPermissionSetting->defaultGrid*/
	public WebElement get_DocumentClassAuthorize_DocumentPermissionSetting_dDefaultGrid_CellbyColNameCellText_Self(String colName,String cellText){
		WebElement DocumentClassAuthorize_DocumentPermissionSetting_dDefaultGrid = driver.findElement(By.xpath(DocumentClassAuthorize_DocumentPermissionSetting_dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../..")).findVisibleElement(By.xpath(DocumentClassAuthorize_DocumentPermissionSetting_dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../.."));
		String idx=DocumentClassAuthorize_DocumentPermissionSetting_dDefaultGrid.getAttribute("idx");
		List<WebElement> Gridrows = driver.findAll(By.xpath(DocumentClassAuthorize_DocumentPermissionSetting_dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]"));
		for (WebElement w : Gridrows)
		{
			WebElement Gridrow = w.findElement(By.xpath("./descendant::td[@idx="+idx+"]"));
			if(Gridrow.getText().contains(cellText)) 
			{
				return Gridrow;
			}
		}
		return null;
	}

	/*PermissionConfig->DocumentClassAuthorize->DocumentPermissionSetting->saveButton*/
	public void DocumentClassAuthorize_DocumentPermissionSetting_saveButton_click(){
		WebElement DocumentClassAuthorize_DocumentPermissionSetting_saveButton = driver.findElement(By.xpath(DocumentClassAuthorize_DocumentPermissionSetting_saveButton_XPath)).findVisibleElement(By.xpath(DocumentClassAuthorize_DocumentPermissionSetting_saveButton_XPath));
		DocumentClassAuthorize_DocumentPermissionSetting_saveButton.click();
	}

	/*PermissionConfig->DocumentClassAuthorize->DocumentPermissionSetting->saveButton*/
	public WebElement get_DocumentClassAuthorize_DocumentPermissionSetting_saveButton_Self(){
		return driver.findElement(By.xpath(DocumentClassAuthorize_DocumentPermissionSetting_saveButton_XPath)).findVisibleElement(By.xpath(DocumentClassAuthorize_DocumentPermissionSetting_saveButton_XPath));
	}

	/*PermissionConfig->DocumentClassAuthorize->DocumentPermissionSetting->cancelButton*/
	public void DocumentClassAuthorize_DocumentPermissionSetting_cancelButton_click(){
		WebElement DocumentClassAuthorize_DocumentPermissionSetting_cancelButton = driver.findElement(By.xpath(DocumentClassAuthorize_DocumentPermissionSetting_cancelButton_XPath)).findVisibleElement(By.xpath(DocumentClassAuthorize_DocumentPermissionSetting_cancelButton_XPath));
		DocumentClassAuthorize_DocumentPermissionSetting_cancelButton.click();
	}

	/*PermissionConfig->DocumentClassAuthorize->DocumentPermissionSetting->cancelButton*/
	public WebElement get_DocumentClassAuthorize_DocumentPermissionSetting_cancelButton_Self(){
		return driver.findElement(By.xpath(DocumentClassAuthorize_DocumentPermissionSetting_cancelButton_XPath)).findVisibleElement(By.xpath(DocumentClassAuthorize_DocumentPermissionSetting_cancelButton_XPath));
	}

	/*PermissionConfig->DocumentClassAuthorize->saveButton*/
	public void DocumentClassAuthorize_saveButton_click(){
		WebElement DocumentClassAuthorize_saveButton = driver.findElement(By.xpath(DocumentClassAuthorize_saveButton_XPath)).findVisibleElement(By.xpath(DocumentClassAuthorize_saveButton_XPath));
		DocumentClassAuthorize_saveButton.click();
	}

	/*PermissionConfig->DocumentClassAuthorize->saveButton*/
	public WebElement get_DocumentClassAuthorize_saveButton_Self(){
		return driver.findElement(By.xpath(DocumentClassAuthorize_saveButton_XPath)).findVisibleElement(By.xpath(DocumentClassAuthorize_saveButton_XPath));
	}

	/*PermissionConfig->DocumentClassAuthorize->cancelButton*/
	public void DocumentClassAuthorize_cancelButton_click(){
		WebElement DocumentClassAuthorize_cancelButton = driver.findElement(By.xpath(DocumentClassAuthorize_cancelButton_XPath)).findVisibleElement(By.xpath(DocumentClassAuthorize_cancelButton_XPath));
		DocumentClassAuthorize_cancelButton.click();
	}

	/*PermissionConfig->DocumentClassAuthorize->cancelButton*/
	public WebElement get_DocumentClassAuthorize_cancelButton_Self(){
		return driver.findElement(By.xpath(DocumentClassAuthorize_cancelButton_XPath)).findVisibleElement(By.xpath(DocumentClassAuthorize_cancelButton_XPath));
	}

}
