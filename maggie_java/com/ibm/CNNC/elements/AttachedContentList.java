package com.ibm.CNNC.elements;

import java.util.*;
import org.openqa.selenium.*;
import com.selenium.utils.WebDriver;
import com.selenium.utils.WebElement;

/*catalog\widget\dm\docmanage\documentdata\dijit\templates\AttachedContentList.html*/
public class AttachedContentList {
	protected WebDriver driver;
	private static final String authorizeButton_XPath="//descendant::div[contains(@id,'AttachedContentList')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"附件授权"+"']";
	private static final String deleteButton_XPath="//descendant::div[contains(@id,'AttachedContentList')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"删除选中条目"+"']";
	private static final String primaryKeyButton_XPath="//descendant::div[contains(@id,'AttachedContentList')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"设为主件"+"']";
	private static final String downloadBtn_XPath="//descendant::div[contains(@id,'AttachedContentList')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"下载附件"+"']";
	private static final String upArrow_XPath="//descendant::div[contains(@id,'AttachedContentList')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+""+"']";
	private static final String downArrow_XPath="//descendant::div[contains(@id,'AttachedContentList')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+""+"']";
	private static final String dDefaultGrid_XPath="//descendant::div[contains(@id,'AttachedContentList')]/descendant::div[contains(@id,'EnhancedGrid')]";

	//----Constructor Methods Begin----
	public AttachedContentList(WebDriver driver){
		this.driver=driver;
	}

	/*AttachedContentList->authorizeButton*/
	public void authorizeButton_click(){
		WebElement authorizeButton = driver.findElement(By.xpath(authorizeButton_XPath)).findVisibleElement(By.xpath(authorizeButton_XPath));
		authorizeButton.click();
	}

	/*AttachedContentList->authorizeButton*/
	public WebElement get_authorizeButton_Self(){
		return driver.findElement(By.xpath(authorizeButton_XPath)).findVisibleElement(By.xpath(authorizeButton_XPath));
	}

	/*AttachedContentList->deleteButton*/
	public void deleteButton_click(){
		WebElement deleteButton = driver.findElement(By.xpath(deleteButton_XPath)).findVisibleElement(By.xpath(deleteButton_XPath));
		deleteButton.click();
	}

	/*AttachedContentList->deleteButton*/
	public WebElement get_deleteButton_Self(){
		return driver.findElement(By.xpath(deleteButton_XPath)).findVisibleElement(By.xpath(deleteButton_XPath));
	}

	/*AttachedContentList->primaryKeyButton*/
	public void primaryKeyButton_click(){
		WebElement primaryKeyButton = driver.findElement(By.xpath(primaryKeyButton_XPath)).findVisibleElement(By.xpath(primaryKeyButton_XPath));
		primaryKeyButton.click();
	}

	/*AttachedContentList->primaryKeyButton*/
	public WebElement get_primaryKeyButton_Self(){
		return driver.findElement(By.xpath(primaryKeyButton_XPath)).findVisibleElement(By.xpath(primaryKeyButton_XPath));
	}

	/*AttachedContentList->downloadBtn*/
	public void downloadBtn_click(){
		WebElement downloadBtn = driver.findElement(By.xpath(downloadBtn_XPath)).findVisibleElement(By.xpath(downloadBtn_XPath));
		downloadBtn.click();
	}

	/*AttachedContentList->downloadBtn*/
	public WebElement get_downloadBtn_Self(){
		return driver.findElement(By.xpath(downloadBtn_XPath)).findVisibleElement(By.xpath(downloadBtn_XPath));
	}

	/*AttachedContentList->upArrow*/
	public void upArrow_click(){
		WebElement upArrow = driver.findElement(By.xpath(upArrow_XPath)).findVisibleElement(By.xpath(upArrow_XPath));
		upArrow.click();
	}

	/*AttachedContentList->upArrow*/
	public WebElement get_upArrow_Self(){
		return driver.findElement(By.xpath(upArrow_XPath)).findVisibleElement(By.xpath(upArrow_XPath));
	}

	/*AttachedContentList->downArrow*/
	public void downArrow_click(){
		WebElement downArrow = driver.findElement(By.xpath(downArrow_XPath)).findVisibleElement(By.xpath(downArrow_XPath));
		downArrow.click();
	}

	/*AttachedContentList->downArrow*/
	public WebElement get_downArrow_Self(){
		return driver.findElement(By.xpath(downArrow_XPath)).findVisibleElement(By.xpath(downArrow_XPath));
	}

	/*AttachedContentList->defaultGrid*/
	public void dDefaultGrid_colCaptionClick(String captionName){
		WebElement dDefaultGrid = driver.findElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']")).findVisibleElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']"));
		dDefaultGrid.click();
	}

	/*AttachedContentList->defaultGrid*/
	public void dDefaultGrid_selectCellbyRowColNumber(int rowNum,int colNum){
		WebElement dDefaultGrid = driver.findElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]")).findVisibleElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]"));
		dDefaultGrid.click();
	}

	/*AttachedContentList->defaultGrid*/
	public void dDefaultGrid_selectRowbyRowColNumber(int rowNum,int colNum){
		WebElement dDefaultGrid = driver.findElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/..")).findVisibleElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/.."));
		dDefaultGrid.click();
	}

	/*AttachedContentList->defaultGrid*/
	public void dDefaultGrid_selectRowbyRowNumber(int rowNum){
		WebElement dDefaultGrid = driver.findElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr")).findVisibleElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr"));
		dDefaultGrid.click();
	}

	/*AttachedContentList->defaultGrid*/
	public void dDefaultGrid_selectCellbyCellText(String cellText){
		WebElement dDefaultGrid = driver.findElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']")).findVisibleElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']"));
		dDefaultGrid.click();
	}

	/*AttachedContentList->defaultGrid*/
	public void dDefaultGrid_selectRowbyCellText(String cellText){
		WebElement dDefaultGrid = driver.findElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/..")).findVisibleElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/.."));
		dDefaultGrid.click();
	}

	/*AttachedContentList->defaultGrid*/
	public void dDefaultGrid_selectCellbyOtherInlineCellText(String otherInlineCellText,String targetCellText){
		WebElement dDefaultGrid = driver.findElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']")).findVisibleElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']"));
		dDefaultGrid.click();
	}

	/*AttachedContentList->defaultGrid*/
	public void dDefaultGrid_selectCellbyColNameCellText(String colName,String cellText){
		WebElement dDefaultGrid = driver.findElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../..")).findVisibleElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../.."));
		String idx=dDefaultGrid.getAttribute("idx");
		List<WebElement> Gridrows = driver.findAll(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]"));
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

	/*AttachedContentList->defaultGrid*/
	public WebElement get_dDefaultGrid_colCaption_Self(String captionName){
		return driver.findElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']")).findVisibleElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']"));
	}

	/*AttachedContentList->defaultGrid*/
	public WebElement get_dDefaultGrid_CellbyRowColNumber_Self(int rowNum,int colNum){
		return driver.findElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]")).findVisibleElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]"));
	}

	/*AttachedContentList->defaultGrid*/
	public WebElement get_dDefaultGrid_RowbyRowColNumber_Self(int rowNum,int colNum){
		return driver.findElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/..")).findVisibleElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/.."));
	}

	/*AttachedContentList->defaultGrid*/
	public WebElement get_dDefaultGrid_RowbyRowNumber_Self(int rowNum){
		return driver.findElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr")).findVisibleElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr"));
	}

	/*AttachedContentList->defaultGrid*/
	public WebElement get_dDefaultGrid_CellbyCellText_Self(String cellText){
		return driver.findElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']")).findVisibleElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']"));
	}

	/*AttachedContentList->defaultGrid*/
	public WebElement get_dDefaultGrid_RowbyCellText_Self(String cellText){
		return driver.findElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/..")).findVisibleElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/.."));
	}

	/*AttachedContentList->defaultGrid*/
	public WebElement get_dDefaultGrid_CellbyOtherInlineCellText_Self(String otherInlineCellText,String targetCellText){
		return driver.findElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']")).findVisibleElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']"));
	}

	/*AttachedContentList->defaultGrid*/
	public WebElement get_dDefaultGrid_CellbyColNameCellText_Self(String colName,String cellText){
		WebElement dDefaultGrid = driver.findElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../..")).findVisibleElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../.."));
		String idx=dDefaultGrid.getAttribute("idx");
		List<WebElement> Gridrows = driver.findAll(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]"));
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

}
