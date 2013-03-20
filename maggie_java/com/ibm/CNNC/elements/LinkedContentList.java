package com.ibm.CNNC.elements;

import java.util.*;
import org.openqa.selenium.*;
import com.selenium.utils.WebDriver;
import com.selenium.utils.WebElement;

/*catalog\widget\dm\docmanage\documentdata\dijit\templates\LinkedContentList.html*/
public class LinkedContentList {
	protected WebDriver driver;
	private static final String addLinkFiles_XPath="//descendant::div[contains(@id,'LinkedContentList')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"添加关联文件"+"']";
	private static final String delSelectedFiles_XPath="//descendant::div[contains(@id,'LinkedContentList')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"删除关联文件"+"']";
	private static final String linkedContentListGrid_XPath="//descendant::div[contains(@id,'LinkedContentList')]/descendant::div[contains(@id,'DataGrid')]";

	//----Constructor Methods Begin----
	public LinkedContentList(WebDriver driver){
		this.driver=driver;
	}

	/*LinkedContentList->addLinkFiles*/
	public void addLinkFiles_click(){
		WebElement addLinkFiles = driver.findElement(By.xpath(addLinkFiles_XPath)).findVisibleElement(By.xpath(addLinkFiles_XPath));
		addLinkFiles.click();
	}

	/*LinkedContentList->addLinkFiles*/
	public WebElement get_addLinkFiles_Self(){
		return driver.findElement(By.xpath(addLinkFiles_XPath)).findVisibleElement(By.xpath(addLinkFiles_XPath));
	}

	/*LinkedContentList->delSelectedFiles*/
	public void delSelectedFiles_click(){
		WebElement delSelectedFiles = driver.findElement(By.xpath(delSelectedFiles_XPath)).findVisibleElement(By.xpath(delSelectedFiles_XPath));
		delSelectedFiles.click();
	}

	/*LinkedContentList->delSelectedFiles*/
	public WebElement get_delSelectedFiles_Self(){
		return driver.findElement(By.xpath(delSelectedFiles_XPath)).findVisibleElement(By.xpath(delSelectedFiles_XPath));
	}

	/*LinkedContentList->linkedContentListGrid*/
	public void linkedContentListGrid_colCaptionClick(String captionName){
		WebElement linkedContentListGrid = driver.findElement(By.xpath(linkedContentListGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']")).findVisibleElement(By.xpath(linkedContentListGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']"));
		linkedContentListGrid.click();
	}

	/*LinkedContentList->linkedContentListGrid*/
	public void linkedContentListGrid_selectCellbyRowColNumber(int rowNum,int colNum){
		WebElement linkedContentListGrid = driver.findElement(By.xpath(linkedContentListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]")).findVisibleElement(By.xpath(linkedContentListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]"));
		linkedContentListGrid.click();
	}

	/*LinkedContentList->linkedContentListGrid*/
	public void linkedContentListGrid_selectRowbyRowColNumber(int rowNum,int colNum){
		WebElement linkedContentListGrid = driver.findElement(By.xpath(linkedContentListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/..")).findVisibleElement(By.xpath(linkedContentListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/.."));
		linkedContentListGrid.click();
	}

	/*LinkedContentList->linkedContentListGrid*/
	public void linkedContentListGrid_selectRowbyRowNumber(int rowNum){
		WebElement linkedContentListGrid = driver.findElement(By.xpath(linkedContentListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr")).findVisibleElement(By.xpath(linkedContentListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr"));
		linkedContentListGrid.click();
	}

	/*LinkedContentList->linkedContentListGrid*/
	public void linkedContentListGrid_selectCellbyCellText(String cellText){
		WebElement linkedContentListGrid = driver.findElement(By.xpath(linkedContentListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']")).findVisibleElement(By.xpath(linkedContentListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']"));
		linkedContentListGrid.click();
	}

	/*LinkedContentList->linkedContentListGrid*/
	public void linkedContentListGrid_selectRowbyCellText(String cellText){
		WebElement linkedContentListGrid = driver.findElement(By.xpath(linkedContentListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/..")).findVisibleElement(By.xpath(linkedContentListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/.."));
		linkedContentListGrid.click();
	}

	/*LinkedContentList->linkedContentListGrid*/
	public void linkedContentListGrid_selectCellbyOtherInlineCellText(String otherInlineCellText,String targetCellText){
		WebElement linkedContentListGrid = driver.findElement(By.xpath(linkedContentListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']")).findVisibleElement(By.xpath(linkedContentListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']"));
		linkedContentListGrid.click();
	}

	/*LinkedContentList->linkedContentListGrid*/
	public void linkedContentListGrid_selectCellbyColNameCellText(String colName,String cellText){
		WebElement linkedContentListGrid = driver.findElement(By.xpath(linkedContentListGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../..")).findVisibleElement(By.xpath(linkedContentListGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../.."));
		String idx=linkedContentListGrid.getAttribute("idx");
		List<WebElement> Gridrows = driver.findAll(By.xpath(linkedContentListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]"));
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

	/*LinkedContentList->linkedContentListGrid*/
	public WebElement get_linkedContentListGrid_colCaption_Self(String captionName){
		return driver.findElement(By.xpath(linkedContentListGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']")).findVisibleElement(By.xpath(linkedContentListGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']"));
	}

	/*LinkedContentList->linkedContentListGrid*/
	public WebElement get_linkedContentListGrid_CellbyRowColNumber_Self(int rowNum,int colNum){
		return driver.findElement(By.xpath(linkedContentListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]")).findVisibleElement(By.xpath(linkedContentListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]"));
	}

	/*LinkedContentList->linkedContentListGrid*/
	public WebElement get_linkedContentListGrid_RowbyRowColNumber_Self(int rowNum,int colNum){
		return driver.findElement(By.xpath(linkedContentListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/..")).findVisibleElement(By.xpath(linkedContentListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/.."));
	}

	/*LinkedContentList->linkedContentListGrid*/
	public WebElement get_linkedContentListGrid_RowbyRowNumber_Self(int rowNum){
		return driver.findElement(By.xpath(linkedContentListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr")).findVisibleElement(By.xpath(linkedContentListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr"));
	}

	/*LinkedContentList->linkedContentListGrid*/
	public WebElement get_linkedContentListGrid_CellbyCellText_Self(String cellText){
		return driver.findElement(By.xpath(linkedContentListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']")).findVisibleElement(By.xpath(linkedContentListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']"));
	}

	/*LinkedContentList->linkedContentListGrid*/
	public WebElement get_linkedContentListGrid_RowbyCellText_Self(String cellText){
		return driver.findElement(By.xpath(linkedContentListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/..")).findVisibleElement(By.xpath(linkedContentListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/.."));
	}

	/*LinkedContentList->linkedContentListGrid*/
	public WebElement get_linkedContentListGrid_CellbyOtherInlineCellText_Self(String otherInlineCellText,String targetCellText){
		return driver.findElement(By.xpath(linkedContentListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']")).findVisibleElement(By.xpath(linkedContentListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']"));
	}

	/*LinkedContentList->linkedContentListGrid*/
	public WebElement get_linkedContentListGrid_CellbyColNameCellText_Self(String colName,String cellText){
		WebElement linkedContentListGrid = driver.findElement(By.xpath(linkedContentListGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../..")).findVisibleElement(By.xpath(linkedContentListGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../.."));
		String idx=linkedContentListGrid.getAttribute("idx");
		List<WebElement> Gridrows = driver.findAll(By.xpath(linkedContentListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]"));
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
