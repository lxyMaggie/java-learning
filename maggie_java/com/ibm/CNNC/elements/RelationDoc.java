package com.ibm.CNNC.elements;

import java.util.*;
import org.openqa.selenium.*;
import com.selenium.utils.WebDriver;
import com.selenium.utils.WebElement;

/*catalog\widget\dm\docmanage\relationdoc\templates\RelationDoc.html*/
public class RelationDoc {
	protected WebDriver driver;
	private static final String addLinkFiles_XPath="//descendant::div[contains(@id,'RelationDoc')]/descendant::*[contains(@id,'LinkedContentList')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"${resourceBundle.add}"+"']";
	private static final String delSelectedFiles_XPath="//descendant::div[contains(@id,'RelationDoc')]/descendant::*[contains(@id,'LinkedContentList')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"${resourceBundle.delete}"+"']";
	private static final String linkedContentListGrid_XPath="//descendant::div[contains(@id,'RelationDoc')]/descendant::*[contains(@id,'LinkedContentList')]/descendant::div[contains(@id,'DataGrid')]";

	//----Constructor Methods Begin----
	public RelationDoc(WebDriver driver){
		this.driver=driver;
	}

	/*RelationDoc->LinkedContentList->addLinkFiles*/
	public void addLinkFiles_click(){
		WebElement addLinkFiles = driver.findElement(By.xpath(addLinkFiles_XPath)).findVisibleElement(By.xpath(addLinkFiles_XPath));
		addLinkFiles.click();
	}

	/*RelationDoc->LinkedContentList->addLinkFiles*/
	public WebElement get_addLinkFiles_Self(){
		return driver.findElement(By.xpath(addLinkFiles_XPath)).findVisibleElement(By.xpath(addLinkFiles_XPath));
	}

	/*RelationDoc->LinkedContentList->delSelectedFiles*/
	public void delSelectedFiles_click(){
		WebElement delSelectedFiles = driver.findElement(By.xpath(delSelectedFiles_XPath)).findVisibleElement(By.xpath(delSelectedFiles_XPath));
		delSelectedFiles.click();
	}

	/*RelationDoc->LinkedContentList->delSelectedFiles*/
	public WebElement get_delSelectedFiles_Self(){
		return driver.findElement(By.xpath(delSelectedFiles_XPath)).findVisibleElement(By.xpath(delSelectedFiles_XPath));
	}

	/*RelationDoc->LinkedContentList->linkedContentListGrid*/
	public void linkedContentListGrid_colCaptionClick(String captionName){
		WebElement linkedContentListGrid = driver.findElement(By.xpath(linkedContentListGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']")).findVisibleElement(By.xpath(linkedContentListGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']"));
		linkedContentListGrid.click();
	}

	/*RelationDoc->LinkedContentList->linkedContentListGrid*/
	public void linkedContentListGrid_selectCellbyRowColNumber(int rowNum,int colNum){
		WebElement linkedContentListGrid = driver.findElement(By.xpath(linkedContentListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]")).findVisibleElement(By.xpath(linkedContentListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]"));
		linkedContentListGrid.click();
	}

	/*RelationDoc->LinkedContentList->linkedContentListGrid*/
	public void linkedContentListGrid_selectRowbyRowColNumber(int rowNum,int colNum){
		WebElement linkedContentListGrid = driver.findElement(By.xpath(linkedContentListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/..")).findVisibleElement(By.xpath(linkedContentListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/.."));
		linkedContentListGrid.click();
	}

	/*RelationDoc->LinkedContentList->linkedContentListGrid*/
	public void linkedContentListGrid_selectRowbyRowNumber(int rowNum){
		WebElement linkedContentListGrid = driver.findElement(By.xpath(linkedContentListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr")).findVisibleElement(By.xpath(linkedContentListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr"));
		linkedContentListGrid.click();
	}

	/*RelationDoc->LinkedContentList->linkedContentListGrid*/
	public void linkedContentListGrid_selectCellbyCellText(String cellText){
		WebElement linkedContentListGrid = driver.findElement(By.xpath(linkedContentListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']")).findVisibleElement(By.xpath(linkedContentListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']"));
		linkedContentListGrid.click();
	}

	/*RelationDoc->LinkedContentList->linkedContentListGrid*/
	public void linkedContentListGrid_selectRowbyCellText(String cellText){
		WebElement linkedContentListGrid = driver.findElement(By.xpath(linkedContentListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/..")).findVisibleElement(By.xpath(linkedContentListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/.."));
		linkedContentListGrid.click();
	}

	/*RelationDoc->LinkedContentList->linkedContentListGrid*/
	public void linkedContentListGrid_selectCellbyOtherInlineCellText(String otherInlineCellText,String targetCellText){
		WebElement linkedContentListGrid = driver.findElement(By.xpath(linkedContentListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']")).findVisibleElement(By.xpath(linkedContentListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']"));
		linkedContentListGrid.click();
	}

	/*RelationDoc->LinkedContentList->linkedContentListGrid*/
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

	/*RelationDoc->LinkedContentList->linkedContentListGrid*/
	public WebElement get_linkedContentListGrid_colCaption_Self(String captionName){
		return driver.findElement(By.xpath(linkedContentListGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']")).findVisibleElement(By.xpath(linkedContentListGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']"));
	}

	/*RelationDoc->LinkedContentList->linkedContentListGrid*/
	public WebElement get_linkedContentListGrid_CellbyRowColNumber_Self(int rowNum,int colNum){
		return driver.findElement(By.xpath(linkedContentListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]")).findVisibleElement(By.xpath(linkedContentListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]"));
	}

	/*RelationDoc->LinkedContentList->linkedContentListGrid*/
	public WebElement get_linkedContentListGrid_RowbyRowColNumber_Self(int rowNum,int colNum){
		return driver.findElement(By.xpath(linkedContentListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/..")).findVisibleElement(By.xpath(linkedContentListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/.."));
	}

	/*RelationDoc->LinkedContentList->linkedContentListGrid*/
	public WebElement get_linkedContentListGrid_RowbyRowNumber_Self(int rowNum){
		return driver.findElement(By.xpath(linkedContentListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr")).findVisibleElement(By.xpath(linkedContentListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr"));
	}

	/*RelationDoc->LinkedContentList->linkedContentListGrid*/
	public WebElement get_linkedContentListGrid_CellbyCellText_Self(String cellText){
		return driver.findElement(By.xpath(linkedContentListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']")).findVisibleElement(By.xpath(linkedContentListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']"));
	}

	/*RelationDoc->LinkedContentList->linkedContentListGrid*/
	public WebElement get_linkedContentListGrid_RowbyCellText_Self(String cellText){
		return driver.findElement(By.xpath(linkedContentListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/..")).findVisibleElement(By.xpath(linkedContentListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/.."));
	}

	/*RelationDoc->LinkedContentList->linkedContentListGrid*/
	public WebElement get_linkedContentListGrid_CellbyOtherInlineCellText_Self(String otherInlineCellText,String targetCellText){
		return driver.findElement(By.xpath(linkedContentListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']")).findVisibleElement(By.xpath(linkedContentListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']"));
	}

	/*RelationDoc->LinkedContentList->linkedContentListGrid*/
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
