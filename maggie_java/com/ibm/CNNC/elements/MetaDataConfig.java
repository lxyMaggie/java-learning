package com.ibm.CNNC.elements;

import java.util.*;
import org.openqa.selenium.*;
import com.selenium.utils.WebDriver;
import com.selenium.utils.WebElement;

/*catalog\widget\dm\sysmanage\metadataconfig\templates\MetaDataConfig.html*/
public class MetaDataConfig {
	protected WebDriver driver;
	private static final String allPropGrid_XPath="//descendant::div[contains(@id,'MetaDataConfig')]/descendant::div[contains(@id,'EnhancedGrid')]";
	private static final String createButton_XPath="//descendant::div[contains(@id,'MetaDataConfig')]/descendant::span[contains(@id,'MetaDataConfig')][contains(@id,'_createPropButton')][contains(@id, 'Button')][normalize-space(text())='"+"添加元数据"+"']";
	private static final String updateButton_XPath="//descendant::div[contains(@id,'MetaDataConfig')]/descendant::span[contains(@id,'MetaDataConfig')][contains(@id,'_OKButton')][contains(@id, 'Button')][normalize-space(text())='"+"更新元数据"+"']";
	private static final String deleteButton_XPath="//descendant::div[contains(@id,'MetaDataConfig')]/descendant::span[contains(@id,'MetaDataConfig')][contains(@id,'_CancelButton')][contains(@id, 'Button')][normalize-space(text())='"+"删除元数据"+"']";
	private static final String syncStandardMetaDataBtn_XPath="//descendant::div[contains(@id,'MetaDataConfig')]/descendant::span[contains(@id,'MetaDataConfig')][contains(@id,'_SyncButton')][contains(@id, 'Button')][normalize-space(text())='"+"同步标准化元数据"+"']";
	private static final String viewSyncStandardMetaDataRecordBtn_XPath="//descendant::div[contains(@id,'MetaDataConfig')]/descendant::span[contains(@id,'MetaDataConfig')][contains(@id,'_ViewSyncStandardMetaDataRecord')][contains(@id, 'Button')][normalize-space(text())='"+"查看元数据同步记录"+"']";

	//----Constructor Methods Begin----
	public MetaDataConfig(WebDriver driver){
		this.driver=driver;
	}

	/*MetaDataConfig->allPropGrid*/
	public void allPropGrid_colCaptionClick(String captionName){
		WebElement allPropGrid = driver.findElement(By.xpath(allPropGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']")).findVisibleElement(By.xpath(allPropGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']"));
		allPropGrid.click();
	}

	/*MetaDataConfig->allPropGrid*/
	public void allPropGrid_selectCellbyRowColNumber(int rowNum,int colNum){
		WebElement allPropGrid = driver.findElement(By.xpath(allPropGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]")).findVisibleElement(By.xpath(allPropGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]"));
		allPropGrid.click();
	}

	/*MetaDataConfig->allPropGrid*/
	public void allPropGrid_selectRowbyRowColNumber(int rowNum,int colNum){
		WebElement allPropGrid = driver.findElement(By.xpath(allPropGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/..")).findVisibleElement(By.xpath(allPropGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/.."));
		allPropGrid.click();
	}

	/*MetaDataConfig->allPropGrid*/
	public void allPropGrid_selectRowbyRowNumber(int rowNum){
		WebElement allPropGrid = driver.findElement(By.xpath(allPropGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr")).findVisibleElement(By.xpath(allPropGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr"));
		allPropGrid.click();
	}

	/*MetaDataConfig->allPropGrid*/
	public void allPropGrid_selectCellbyCellText(String cellText){
		WebElement allPropGrid = driver.findElement(By.xpath(allPropGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']")).findVisibleElement(By.xpath(allPropGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']"));
		allPropGrid.click();
	}

	/*MetaDataConfig->allPropGrid*/
	public void allPropGrid_selectRowbyCellText(String cellText){
		WebElement allPropGrid = driver.findElement(By.xpath(allPropGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/..")).findVisibleElement(By.xpath(allPropGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/.."));
		allPropGrid.click();
	}

	/*MetaDataConfig->allPropGrid*/
	public void allPropGrid_selectCellbyOtherInlineCellText(String otherInlineCellText,String targetCellText){
		WebElement allPropGrid = driver.findElement(By.xpath(allPropGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']")).findVisibleElement(By.xpath(allPropGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']"));
		allPropGrid.click();
	}

	/*MetaDataConfig->allPropGrid*/
	public void allPropGrid_selectCellbyColNameCellText(String colName,String cellText){
		WebElement allPropGrid = driver.findElement(By.xpath(allPropGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../..")).findVisibleElement(By.xpath(allPropGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../.."));
		String idx=allPropGrid.getAttribute("idx");
		List<WebElement> Gridrows = driver.findAll(By.xpath(allPropGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]"));
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

	/*MetaDataConfig->allPropGrid*/
	public WebElement get_allPropGrid_colCaption_Self(String captionName){
		return driver.findElement(By.xpath(allPropGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']")).findVisibleElement(By.xpath(allPropGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']"));
	}

	/*MetaDataConfig->allPropGrid*/
	public WebElement get_allPropGrid_CellbyRowColNumber_Self(int rowNum,int colNum){
		return driver.findElement(By.xpath(allPropGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]")).findVisibleElement(By.xpath(allPropGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]"));
	}

	/*MetaDataConfig->allPropGrid*/
	public WebElement get_allPropGrid_RowbyRowColNumber_Self(int rowNum,int colNum){
		return driver.findElement(By.xpath(allPropGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/..")).findVisibleElement(By.xpath(allPropGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/.."));
	}

	/*MetaDataConfig->allPropGrid*/
	public WebElement get_allPropGrid_RowbyRowNumber_Self(int rowNum){
		return driver.findElement(By.xpath(allPropGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr")).findVisibleElement(By.xpath(allPropGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr"));
	}

	/*MetaDataConfig->allPropGrid*/
	public WebElement get_allPropGrid_CellbyCellText_Self(String cellText){
		return driver.findElement(By.xpath(allPropGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']")).findVisibleElement(By.xpath(allPropGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']"));
	}

	/*MetaDataConfig->allPropGrid*/
	public WebElement get_allPropGrid_RowbyCellText_Self(String cellText){
		return driver.findElement(By.xpath(allPropGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/..")).findVisibleElement(By.xpath(allPropGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/.."));
	}

	/*MetaDataConfig->allPropGrid*/
	public WebElement get_allPropGrid_CellbyOtherInlineCellText_Self(String otherInlineCellText,String targetCellText){
		return driver.findElement(By.xpath(allPropGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']")).findVisibleElement(By.xpath(allPropGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']"));
	}

	/*MetaDataConfig->allPropGrid*/
	public WebElement get_allPropGrid_CellbyColNameCellText_Self(String colName,String cellText){
		WebElement allPropGrid = driver.findElement(By.xpath(allPropGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../..")).findVisibleElement(By.xpath(allPropGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../.."));
		String idx=allPropGrid.getAttribute("idx");
		List<WebElement> Gridrows = driver.findAll(By.xpath(allPropGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]"));
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

	/*MetaDataConfig->createButton*/
	public void createButton_click(){
		WebElement createButton = driver.findElement(By.xpath(createButton_XPath)).findVisibleElement(By.xpath(createButton_XPath));
		createButton.click();
	}

	/*MetaDataConfig->createButton*/
	public WebElement get_createButton_Self(){
		return driver.findElement(By.xpath(createButton_XPath)).findVisibleElement(By.xpath(createButton_XPath));
	}

	/*MetaDataConfig->updateButton*/
	public void updateButton_click(){
		WebElement updateButton = driver.findElement(By.xpath(updateButton_XPath)).findVisibleElement(By.xpath(updateButton_XPath));
		updateButton.click();
	}

	/*MetaDataConfig->updateButton*/
	public WebElement get_updateButton_Self(){
		return driver.findElement(By.xpath(updateButton_XPath)).findVisibleElement(By.xpath(updateButton_XPath));
	}

	/*MetaDataConfig->deleteButton*/
	public void deleteButton_click(){
		WebElement deleteButton = driver.findElement(By.xpath(deleteButton_XPath)).findVisibleElement(By.xpath(deleteButton_XPath));
		deleteButton.click();
	}

	/*MetaDataConfig->deleteButton*/
	public WebElement get_deleteButton_Self(){
		return driver.findElement(By.xpath(deleteButton_XPath)).findVisibleElement(By.xpath(deleteButton_XPath));
	}

	/*MetaDataConfig->syncStandardMetaDataBtn*/
	public void syncStandardMetaDataBtn_click(){
		WebElement syncStandardMetaDataBtn = driver.findElement(By.xpath(syncStandardMetaDataBtn_XPath)).findVisibleElement(By.xpath(syncStandardMetaDataBtn_XPath));
		syncStandardMetaDataBtn.click();
	}

	/*MetaDataConfig->syncStandardMetaDataBtn*/
	public WebElement get_syncStandardMetaDataBtn_Self(){
		return driver.findElement(By.xpath(syncStandardMetaDataBtn_XPath)).findVisibleElement(By.xpath(syncStandardMetaDataBtn_XPath));
	}

	/*MetaDataConfig->viewSyncStandardMetaDataRecordBtn*/
	public void viewSyncStandardMetaDataRecordBtn_click(){
		WebElement viewSyncStandardMetaDataRecordBtn = driver.findElement(By.xpath(viewSyncStandardMetaDataRecordBtn_XPath)).findVisibleElement(By.xpath(viewSyncStandardMetaDataRecordBtn_XPath));
		viewSyncStandardMetaDataRecordBtn.click();
	}

	/*MetaDataConfig->viewSyncStandardMetaDataRecordBtn*/
	public WebElement get_viewSyncStandardMetaDataRecordBtn_Self(){
		return driver.findElement(By.xpath(viewSyncStandardMetaDataRecordBtn_XPath)).findVisibleElement(By.xpath(viewSyncStandardMetaDataRecordBtn_XPath));
	}

}
