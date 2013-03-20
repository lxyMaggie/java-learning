package com.ibm.CNNC.elements;

import java.util.*;
import org.openqa.selenium.*;
import com.selenium.utils.WebDriver;
import com.selenium.utils.WebElement;

/*catalog\widget\dm\sysmanage\metadataconfig\dijit\syncstandardmetadata\templates\SyncStandardMetaData.html*/
public class SyncStandardMetaData {
	protected WebDriver driver;
	private static final String standardMetaDataGrid_XPath="//descendant::div[contains(@id,'SyncStandardMetaData')]/descendant::div[contains(@id,'DataGrid')]";
	private static final String syncStandardMetaDataBtn_XPath="//descendant::div[contains(@id,'SyncStandardMetaData')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"同步"+"']";
	private static final String cancelBtn_XPath="//descendant::div[contains(@id,'SyncStandardMetaData')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"取消"+"']";

	//----Constructor Methods Begin----
	public SyncStandardMetaData(WebDriver driver){
		this.driver=driver;
	}

	/*SyncStandardMetaData->standardMetaDataGrid*/
	public void standardMetaDataGrid_colCaptionClick(String captionName){
		WebElement standardMetaDataGrid = driver.findElement(By.xpath(standardMetaDataGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']")).findVisibleElement(By.xpath(standardMetaDataGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']"));
		standardMetaDataGrid.click();
	}

	/*SyncStandardMetaData->standardMetaDataGrid*/
	public void standardMetaDataGrid_selectCellbyRowColNumber(int rowNum,int colNum){
		WebElement standardMetaDataGrid = driver.findElement(By.xpath(standardMetaDataGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]")).findVisibleElement(By.xpath(standardMetaDataGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]"));
		standardMetaDataGrid.click();
	}

	/*SyncStandardMetaData->standardMetaDataGrid*/
	public void standardMetaDataGrid_selectRowbyRowColNumber(int rowNum,int colNum){
		WebElement standardMetaDataGrid = driver.findElement(By.xpath(standardMetaDataGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/..")).findVisibleElement(By.xpath(standardMetaDataGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/.."));
		standardMetaDataGrid.click();
	}

	/*SyncStandardMetaData->standardMetaDataGrid*/
	public void standardMetaDataGrid_selectRowbyRowNumber(int rowNum){
		WebElement standardMetaDataGrid = driver.findElement(By.xpath(standardMetaDataGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr")).findVisibleElement(By.xpath(standardMetaDataGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr"));
		standardMetaDataGrid.click();
	}

	/*SyncStandardMetaData->standardMetaDataGrid*/
	public void standardMetaDataGrid_selectCellbyCellText(String cellText){
		WebElement standardMetaDataGrid = driver.findElement(By.xpath(standardMetaDataGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']")).findVisibleElement(By.xpath(standardMetaDataGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']"));
		standardMetaDataGrid.click();
	}

	/*SyncStandardMetaData->standardMetaDataGrid*/
	public void standardMetaDataGrid_selectRowbyCellText(String cellText){
		WebElement standardMetaDataGrid = driver.findElement(By.xpath(standardMetaDataGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/..")).findVisibleElement(By.xpath(standardMetaDataGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/.."));
		standardMetaDataGrid.click();
	}

	/*SyncStandardMetaData->standardMetaDataGrid*/
	public void standardMetaDataGrid_selectCellbyOtherInlineCellText(String otherInlineCellText,String targetCellText){
		WebElement standardMetaDataGrid = driver.findElement(By.xpath(standardMetaDataGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']")).findVisibleElement(By.xpath(standardMetaDataGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']"));
		standardMetaDataGrid.click();
	}

	/*SyncStandardMetaData->standardMetaDataGrid*/
	public void standardMetaDataGrid_selectCellbyColNameCellText(String colName,String cellText){
		WebElement standardMetaDataGrid = driver.findElement(By.xpath(standardMetaDataGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../..")).findVisibleElement(By.xpath(standardMetaDataGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../.."));
		String idx=standardMetaDataGrid.getAttribute("idx");
		List<WebElement> Gridrows = driver.findAll(By.xpath(standardMetaDataGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]"));
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

	/*SyncStandardMetaData->standardMetaDataGrid*/
	public WebElement get_standardMetaDataGrid_colCaption_Self(String captionName){
		return driver.findElement(By.xpath(standardMetaDataGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']")).findVisibleElement(By.xpath(standardMetaDataGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']"));
	}

	/*SyncStandardMetaData->standardMetaDataGrid*/
	public WebElement get_standardMetaDataGrid_CellbyRowColNumber_Self(int rowNum,int colNum){
		return driver.findElement(By.xpath(standardMetaDataGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]")).findVisibleElement(By.xpath(standardMetaDataGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]"));
	}

	/*SyncStandardMetaData->standardMetaDataGrid*/
	public WebElement get_standardMetaDataGrid_RowbyRowColNumber_Self(int rowNum,int colNum){
		return driver.findElement(By.xpath(standardMetaDataGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/..")).findVisibleElement(By.xpath(standardMetaDataGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/.."));
	}

	/*SyncStandardMetaData->standardMetaDataGrid*/
	public WebElement get_standardMetaDataGrid_RowbyRowNumber_Self(int rowNum){
		return driver.findElement(By.xpath(standardMetaDataGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr")).findVisibleElement(By.xpath(standardMetaDataGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr"));
	}

	/*SyncStandardMetaData->standardMetaDataGrid*/
	public WebElement get_standardMetaDataGrid_CellbyCellText_Self(String cellText){
		return driver.findElement(By.xpath(standardMetaDataGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']")).findVisibleElement(By.xpath(standardMetaDataGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']"));
	}

	/*SyncStandardMetaData->standardMetaDataGrid*/
	public WebElement get_standardMetaDataGrid_RowbyCellText_Self(String cellText){
		return driver.findElement(By.xpath(standardMetaDataGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/..")).findVisibleElement(By.xpath(standardMetaDataGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/.."));
	}

	/*SyncStandardMetaData->standardMetaDataGrid*/
	public WebElement get_standardMetaDataGrid_CellbyOtherInlineCellText_Self(String otherInlineCellText,String targetCellText){
		return driver.findElement(By.xpath(standardMetaDataGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']")).findVisibleElement(By.xpath(standardMetaDataGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']"));
	}

	/*SyncStandardMetaData->standardMetaDataGrid*/
	public WebElement get_standardMetaDataGrid_CellbyColNameCellText_Self(String colName,String cellText){
		WebElement standardMetaDataGrid = driver.findElement(By.xpath(standardMetaDataGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../..")).findVisibleElement(By.xpath(standardMetaDataGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../.."));
		String idx=standardMetaDataGrid.getAttribute("idx");
		List<WebElement> Gridrows = driver.findAll(By.xpath(standardMetaDataGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]"));
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

	/*SyncStandardMetaData->syncStandardMetaDataBtn*/
	public void syncStandardMetaDataBtn_click(){
		WebElement syncStandardMetaDataBtn = driver.findElement(By.xpath(syncStandardMetaDataBtn_XPath)).findVisibleElement(By.xpath(syncStandardMetaDataBtn_XPath));
		syncStandardMetaDataBtn.click();
	}

	/*SyncStandardMetaData->syncStandardMetaDataBtn*/
	public WebElement get_syncStandardMetaDataBtn_Self(){
		return driver.findElement(By.xpath(syncStandardMetaDataBtn_XPath)).findVisibleElement(By.xpath(syncStandardMetaDataBtn_XPath));
	}

	/*SyncStandardMetaData->cancelBtn*/
	public void cancelBtn_click(){
		WebElement cancelBtn = driver.findElement(By.xpath(cancelBtn_XPath)).findVisibleElement(By.xpath(cancelBtn_XPath));
		cancelBtn.click();
	}

	/*SyncStandardMetaData->cancelBtn*/
	public WebElement get_cancelBtn_Self(){
		return driver.findElement(By.xpath(cancelBtn_XPath)).findVisibleElement(By.xpath(cancelBtn_XPath));
	}

}
