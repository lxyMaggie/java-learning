package com.ibm.CNNC.elements;

import java.util.*;
import org.openqa.selenium.*;
import com.selenium.utils.WebDriver;
import com.selenium.utils.WebElement;

/*catalog\widget\layout\templates\HeadquarterManageView.html*/
public class HeadquarterManageView {
	protected WebDriver driver;
	private static final String StackContainer_Tabs_XPath="//descendant::div[contains(@id,'HeadquarterManageView')]/descendant::*[contains(@id,'MainPane')]/descendant::div[contains(@id,'dijit_layout_TabContainer')]";
	private static final String updateClassNavTreeOrderButton_XPath="//descendant::div[contains(@id,'HeadquarterManageView')]/descendant::*[contains(@id,'MainPane')]/descendant::*[contains(@id,'DocClassPane')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"保存文件分类排序"+"']";
	private static final String inheritGrid_XPath="//descendant::div[contains(@id,'HeadquarterManageView')]/descendant::*[contains(@id,'MainPane')]/descendant::*[contains(@id,'DocClassPane')]/descendant::div[contains(@id,'EnhancedGrid')]";
	private static final String managePropButton_XPath="//descendant::div[contains(@id,'HeadquarterManageView')]/descendant::*[contains(@id,'MainPane')]/descendant::*[contains(@id,'DocClassPane')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"${resourceBundle.manageProperty}"+"']";
	private static final String dDefaultGrid_XPath="//descendant::div[contains(@id,'HeadquarterManageView')]/descendant::*[contains(@id,'MainPane')]/descendant::*[contains(@id,'DocClassPane')]/descendant::div[contains(@id,'DataGrid')]";
	private static final String DocumentTagConfig_saveBtn_XPath="//descendant::div[contains(@id,'HeadquarterManageView')]/descendant::*[contains(@id,'MainPane')]/descendant::*[contains(@id,'DocumentTagConfig')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"${resourceBundle.save}"+"']";
	private static final String allPropGrid_XPath="//descendant::div[contains(@id,'HeadquarterManageView')]/descendant::*[contains(@id,'MainPane')]/descendant::*[contains(@id,'MetaDataConfig')]/descendant::div[contains(@id,'EnhancedGrid')]";
	private static final String createButton_XPath="//descendant::div[contains(@id,'HeadquarterManageView')]/descendant::*[contains(@id,'MainPane')]/descendant::*[contains(@id,'MetaDataConfig')]/descendant::span[contains(@id,'_createPropButton')][contains(@id, 'Button')][normalize-space(text())='"+"${resourceBundle.add}"+"']";
	private static final String updateButton_XPath="//descendant::div[contains(@id,'HeadquarterManageView')]/descendant::*[contains(@id,'MainPane')]/descendant::*[contains(@id,'MetaDataConfig')]/descendant::span[contains(@id,'_OKButton')][contains(@id, 'Button')][normalize-space(text())='"+"${resourceBundle.update}"+"']";
	private static final String deleteButton_XPath="//descendant::div[contains(@id,'HeadquarterManageView')]/descendant::*[contains(@id,'MainPane')]/descendant::*[contains(@id,'MetaDataConfig')]/descendant::span[contains(@id,'_CancelButton')][contains(@id, 'Button')][normalize-space(text())='"+"${resourceBundle.delete}"+"']";
	private static final String syncStandardMetaDataBtn_XPath="//descendant::div[contains(@id,'HeadquarterManageView')]/descendant::*[contains(@id,'MainPane')]/descendant::*[contains(@id,'MetaDataConfig')]/descendant::span[contains(@id,'_SyncButton')][contains(@id, 'Button')][normalize-space(text())='"+"${resourceBundle.syncStandardMetaData}"+"']";
	private static final String viewSyncStandardMetaDataRecordBtn_XPath="//descendant::div[contains(@id,'HeadquarterManageView')]/descendant::*[contains(@id,'MainPane')]/descendant::*[contains(@id,'MetaDataConfig')]/descendant::span[contains(@id,'_ViewSyncStandardMetaDataRecord')][contains(@id, 'Button')][normalize-space(text())='"+"${resourceBundle.viewSyncStandardMetaDataRecord}"+"']";
	private static final String addFile_XPath="//descendant::div[contains(@id,'HeadquarterManageView')]/descendant::*[contains(@id,'MainPane')]/descendant::*[contains(@id,'StandardRuleDistribution')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"${resourceBundle.addfile}"+"']";
	private static final String removeFile_XPath="//descendant::div[contains(@id,'HeadquarterManageView')]/descendant::*[contains(@id,'MainPane')]/descendant::*[contains(@id,'StandardRuleDistribution')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"${resourceBundle.removeFile}"+"']";
	private static final String docDistributionGrid_XPath="//descendant::div[contains(@id,'HeadquarterManageView')]/descendant::*[contains(@id,'MainPane')]/descendant::*[contains(@id,'StandardRuleDistribution')]/descendant::div[contains(@id,'DataGrid')]";
	private static final String selectDocDistributeToBtn_XPath="//descendant::div[contains(@id,'HeadquarterManageView')]/descendant::*[contains(@id,'MainPane')]/descendant::*[contains(@id,'StandardRuleDistribution')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"${resourceBundle.selectDocDistributeTo}"+"']";
	private static final String DeleteDistributeItemBtn_XPath="//descendant::div[contains(@id,'HeadquarterManageView')]/descendant::*[contains(@id,'MainPane')]/descendant::*[contains(@id,'StandardRuleDistribution')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"${resourceBundle.removeDepart}"+"']";
	private static final String docDistributionToGrid_XPath="//descendant::div[contains(@id,'HeadquarterManageView')]/descendant::*[contains(@id,'MainPane')]/descendant::*[contains(@id,'StandardRuleDistribution')]/descendant::div[contains(@id,'DataGrid')]";
	private static final String dDefaultOk_XPath="//descendant::div[contains(@id,'HeadquarterManageView')]/descendant::*[contains(@id,'MainPane')]/descendant::*[contains(@id,'StandardRuleDistribution')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"${resourceBundle.ok}"+"']";
	private static final String modifyBtn_XPath="//descendant::div[contains(@id,'HeadquarterManageView')]/descendant::*[contains(@id,'MainPane')]/descendant::*[contains(@id,'StandardRuleDistribution')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"${resourceBundle.modify}"+"']";
	private static final String approvalBtn_XPath="//descendant::div[contains(@id,'HeadquarterManageView')]/descendant::*[contains(@id,'MainPane')]/descendant::*[contains(@id,'StandardRuleDistribution')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"${resourceBundle.approval}"+"']";
	private static final String returnBackBtn_XPath="//descendant::div[contains(@id,'HeadquarterManageView')]/descendant::*[contains(@id,'MainPane')]/descendant::*[contains(@id,'StandardRuleDistribution')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"${resourceBundle.returnBack}"+"']";
	private static final String cancleBtn_XPath="//descendant::div[contains(@id,'HeadquarterManageView')]/descendant::*[contains(@id,'MainPane')]/descendant::*[contains(@id,'StandardRuleDistribution')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"${resourceBundle.cancle}"+"']";
	private static final String addselectPowerPlant_XPath="//descendant::div[contains(@id,'HeadquarterManageView')]/descendant::*[contains(@id,'MainPane')]/descendant::*[contains(@id,'SynchronousData')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"${resourceBundle.selectPowerPlant}"+"']";
	private static final String delselectPowerPlant_XPath="//descendant::div[contains(@id,'HeadquarterManageView')]/descendant::*[contains(@id,'MainPane')]/descendant::*[contains(@id,'SynchronousData')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"${resourceBundle.deleteselectPowerPlant}"+"']";
	private static final String sysDataType_XPath="//descendant::div[contains(@id,'HeadquarterManageView')]/descendant::*[contains(@id,'MainPane')]/descendant::*[contains(@id,'SynchronousData')]/descendant::span[normalize-space(text())='${resourceBundle.synchronousType}']/../../descendant::div[contains(@id,'widget_dijit_form_FilteringSelect')]";
	private static final String selectPlantGrid_XPath="//descendant::div[contains(@id,'HeadquarterManageView')]/descendant::*[contains(@id,'MainPane')]/descendant::*[contains(@id,'SynchronousData')]/descendant::div[contains(@id,'DataGrid')]";
	private static final String onSysData_XPath="//descendant::div[contains(@id,'HeadquarterManageView')]/descendant::*[contains(@id,'MainPane')]/descendant::*[contains(@id,'SynchronousData')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"${resourceBundle.ok}"+"']";
	private static final String onCancel_XPath="//descendant::div[contains(@id,'HeadquarterManageView')]/descendant::*[contains(@id,'MainPane')]/descendant::*[contains(@id,'SynchronousData')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"${resourceBundle.cancel}"+"']";
	private static final String MainPane_TagTreeConfig_saveBtn_XPath="//descendant::div[contains(@id,'HeadquarterManageView')]/descendant::*[contains(@id,'MainPane')]/descendant::*[contains(@id,'TagTreeConfig')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"${resourceBundle.save}"+"']";
	private static final String MainPane_TagTreeConfig_createBtn_XPath="//descendant::div[contains(@id,'HeadquarterManageView')]/descendant::*[contains(@id,'MainPane')]/descendant::*[contains(@id,'TagTreeConfig')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"${resourceBundle.createTag}"+"']";
	private static final String MainPane_TagTreeConfig_editBtn_XPath="//descendant::div[contains(@id,'HeadquarterManageView')]/descendant::*[contains(@id,'MainPane')]/descendant::*[contains(@id,'TagTreeConfig')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"${resourceBundle.edit}"+"']";
	private static final String MainPane_TagTreeConfig_deleteBtn_XPath="//descendant::div[contains(@id,'HeadquarterManageView')]/descendant::*[contains(@id,'MainPane')]/descendant::*[contains(@id,'TagTreeConfig')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"${resourceBundle.delete}"+"']";
	private static final String NuclearPlantStageStandard_saveBtn_XPath="//descendant::div[contains(@id,'HeadquarterManageView')]/descendant::*[contains(@id,'MainPane')]/descendant::*[contains(@id,'NuclearPlantStageStandard')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"${resourceBundle.save}"+"']";
	private static final String NuclearPlantStageStandard_createBtn_XPath="//descendant::div[contains(@id,'HeadquarterManageView')]/descendant::*[contains(@id,'MainPane')]/descendant::*[contains(@id,'NuclearPlantStageStandard')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"${resourceBundle.create}"+"']";
	private static final String NuclearPlantStageStandard_editBtn_XPath="//descendant::div[contains(@id,'HeadquarterManageView')]/descendant::*[contains(@id,'MainPane')]/descendant::*[contains(@id,'NuclearPlantStageStandard')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"${resourceBundle.edit}"+"']";
	private static final String NuclearPlantStageStandard_deleteBtn_XPath="//descendant::div[contains(@id,'HeadquarterManageView')]/descendant::*[contains(@id,'MainPane')]/descendant::*[contains(@id,'NuclearPlantStageStandard')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"${resourceBundle.delete}"+"']";
	private static final String domain_XPath="//descendant::div[contains(@id,'HeadquarterManageView')]/descendant::*[contains(@id,'MainPane')]/descendant::*[contains(@id,'StandardRuleStructureManage')]/descendant::div";

	//----Constructor Methods Begin----
	public HeadquarterManageView(WebDriver driver){
		this.driver=driver;
	}

	/*HeadquarterManageView->MainPane->stackContainer*/
	public void StackContainer_Tabs_click(String tabName){
		WebElement StackContainer_Tabs = driver.findElement(By.xpath(StackContainer_Tabs_XPath+"/descendant::div[contains(@id,'tablist')]/descendant::div[contains(@class,'TabListWrapper')]/descendant::span[normalize-space(text())='"+tabName+"']")).findVisibleElement(By.xpath(StackContainer_Tabs_XPath+"/descendant::div[contains(@id,'tablist')]/descendant::div[contains(@class,'TabListWrapper')]/descendant::span[normalize-space(text())='"+tabName+"']"));
		StackContainer_Tabs.click();
	}

	/*HeadquarterManageView->MainPane->stackContainer*/
	public void StackContainer_Tabs_close(String tabName){
		WebElement StackContainer_Tabs = driver.findElement(By.xpath(StackContainer_Tabs_XPath+"/descendant::div[contains(@id,'tablist')]/descendant::div[contains(@class,'TabListWrapper')]/descendant::span[normalize-space(text())='"+tabName+"']/following-sibling::span[contains(@class,'TabCloseButton')]")).findVisibleElement(By.xpath(StackContainer_Tabs_XPath+"/descendant::div[contains(@id,'tablist')]/descendant::div[contains(@class,'TabListWrapper')]/descendant::span[normalize-space(text())='"+tabName+"']/following-sibling::span[contains(@class,'TabCloseButton')]"));
		StackContainer_Tabs.click();
	}

	/*HeadquarterManageView->MainPane->stackContainer*/
	public WebElement get_StackContainer_Tabs_Self(String tabName){
		return driver.findElement(By.xpath(StackContainer_Tabs_XPath+"/descendant::div[contains(@id,'tablist')]/descendant::div[contains(@class,'TabListWrapper')]/descendant::span[normalize-space(text())='"+tabName+"']")).findVisibleElement(By.xpath(StackContainer_Tabs_XPath+"/descendant::div[contains(@id,'tablist')]/descendant::div[contains(@class,'TabListWrapper')]/descendant::span[normalize-space(text())='"+tabName+"']"));
	}

	/*HeadquarterManageView->MainPane->stackContainer*/
	public WebElement get_StackContainer_Tabsclose_Self(String tabName){
		return driver.findElement(By.xpath(StackContainer_Tabs_XPath+"/descendant::div[contains(@id,'tablist')]/descendant::div[contains(@class,'TabListWrapper')]/descendant::span[normalize-space(text())='"+tabName+"']/following-sibling::span[contains(@class,'TabCloseButton')]")).findVisibleElement(By.xpath(StackContainer_Tabs_XPath+"/descendant::div[contains(@id,'tablist')]/descendant::div[contains(@class,'TabListWrapper')]/descendant::span[normalize-space(text())='"+tabName+"']/following-sibling::span[contains(@class,'TabCloseButton')]"));
	}

	/*HeadquarterManageView->MainPane->DocClassPane->updateClassNavTreeOrderButton*/
	public void updateClassNavTreeOrderButton_click(){
		WebElement updateClassNavTreeOrderButton = driver.findElement(By.xpath(updateClassNavTreeOrderButton_XPath)).findVisibleElement(By.xpath(updateClassNavTreeOrderButton_XPath));
		updateClassNavTreeOrderButton.click();
	}

	/*HeadquarterManageView->MainPane->DocClassPane->updateClassNavTreeOrderButton*/
	public WebElement get_updateClassNavTreeOrderButton_Self(){
		return driver.findElement(By.xpath(updateClassNavTreeOrderButton_XPath)).findVisibleElement(By.xpath(updateClassNavTreeOrderButton_XPath));
	}

	/*HeadquarterManageView->MainPane->DocClassPane->inheritGrid*/
	public void inheritGrid_colCaptionClick(String captionName){
		WebElement inheritGrid = driver.findElement(By.xpath(inheritGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']")).findVisibleElement(By.xpath(inheritGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']"));
		inheritGrid.click();
	}

	/*HeadquarterManageView->MainPane->DocClassPane->inheritGrid*/
	public void inheritGrid_selectCellbyRowColNumber(int rowNum,int colNum){
		WebElement inheritGrid = driver.findElement(By.xpath(inheritGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]")).findVisibleElement(By.xpath(inheritGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]"));
		inheritGrid.click();
	}

	/*HeadquarterManageView->MainPane->DocClassPane->inheritGrid*/
	public void inheritGrid_selectRowbyRowColNumber(int rowNum,int colNum){
		WebElement inheritGrid = driver.findElement(By.xpath(inheritGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/..")).findVisibleElement(By.xpath(inheritGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/.."));
		inheritGrid.click();
	}

	/*HeadquarterManageView->MainPane->DocClassPane->inheritGrid*/
	public void inheritGrid_selectRowbyRowNumber(int rowNum){
		WebElement inheritGrid = driver.findElement(By.xpath(inheritGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr")).findVisibleElement(By.xpath(inheritGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr"));
		inheritGrid.click();
	}

	/*HeadquarterManageView->MainPane->DocClassPane->inheritGrid*/
	public void inheritGrid_selectCellbyCellText(String cellText){
		WebElement inheritGrid = driver.findElement(By.xpath(inheritGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']")).findVisibleElement(By.xpath(inheritGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']"));
		inheritGrid.click();
	}

	/*HeadquarterManageView->MainPane->DocClassPane->inheritGrid*/
	public void inheritGrid_selectRowbyCellText(String cellText){
		WebElement inheritGrid = driver.findElement(By.xpath(inheritGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/..")).findVisibleElement(By.xpath(inheritGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/.."));
		inheritGrid.click();
	}

	/*HeadquarterManageView->MainPane->DocClassPane->inheritGrid*/
	public void inheritGrid_selectCellbyOtherInlineCellText(String otherInlineCellText,String targetCellText){
		WebElement inheritGrid = driver.findElement(By.xpath(inheritGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']")).findVisibleElement(By.xpath(inheritGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']"));
		inheritGrid.click();
	}

	/*HeadquarterManageView->MainPane->DocClassPane->inheritGrid*/
	public void inheritGrid_selectCellbyColNameCellText(String colName,String cellText){
		WebElement inheritGrid = driver.findElement(By.xpath(inheritGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../..")).findVisibleElement(By.xpath(inheritGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../.."));
		String idx=inheritGrid.getAttribute("idx");
		List<WebElement> Gridrows = driver.findAll(By.xpath(inheritGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]"));
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

	/*HeadquarterManageView->MainPane->DocClassPane->inheritGrid*/
	public WebElement get_inheritGrid_colCaption_Self(String captionName){
		return driver.findElement(By.xpath(inheritGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']")).findVisibleElement(By.xpath(inheritGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']"));
	}

	/*HeadquarterManageView->MainPane->DocClassPane->inheritGrid*/
	public WebElement get_inheritGrid_CellbyRowColNumber_Self(int rowNum,int colNum){
		return driver.findElement(By.xpath(inheritGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]")).findVisibleElement(By.xpath(inheritGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]"));
	}

	/*HeadquarterManageView->MainPane->DocClassPane->inheritGrid*/
	public WebElement get_inheritGrid_RowbyRowColNumber_Self(int rowNum,int colNum){
		return driver.findElement(By.xpath(inheritGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/..")).findVisibleElement(By.xpath(inheritGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/.."));
	}

	/*HeadquarterManageView->MainPane->DocClassPane->inheritGrid*/
	public WebElement get_inheritGrid_RowbyRowNumber_Self(int rowNum){
		return driver.findElement(By.xpath(inheritGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr")).findVisibleElement(By.xpath(inheritGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr"));
	}

	/*HeadquarterManageView->MainPane->DocClassPane->inheritGrid*/
	public WebElement get_inheritGrid_CellbyCellText_Self(String cellText){
		return driver.findElement(By.xpath(inheritGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']")).findVisibleElement(By.xpath(inheritGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']"));
	}

	/*HeadquarterManageView->MainPane->DocClassPane->inheritGrid*/
	public WebElement get_inheritGrid_RowbyCellText_Self(String cellText){
		return driver.findElement(By.xpath(inheritGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/..")).findVisibleElement(By.xpath(inheritGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/.."));
	}

	/*HeadquarterManageView->MainPane->DocClassPane->inheritGrid*/
	public WebElement get_inheritGrid_CellbyOtherInlineCellText_Self(String otherInlineCellText,String targetCellText){
		return driver.findElement(By.xpath(inheritGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']")).findVisibleElement(By.xpath(inheritGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']"));
	}

	/*HeadquarterManageView->MainPane->DocClassPane->inheritGrid*/
	public WebElement get_inheritGrid_CellbyColNameCellText_Self(String colName,String cellText){
		WebElement inheritGrid = driver.findElement(By.xpath(inheritGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../..")).findVisibleElement(By.xpath(inheritGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../.."));
		String idx=inheritGrid.getAttribute("idx");
		List<WebElement> Gridrows = driver.findAll(By.xpath(inheritGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]"));
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

	/*HeadquarterManageView->MainPane->DocClassPane->managePropButton*/
	public void managePropButton_click(){
		WebElement managePropButton = driver.findElement(By.xpath(managePropButton_XPath)).findVisibleElement(By.xpath(managePropButton_XPath));
		managePropButton.click();
	}

	/*HeadquarterManageView->MainPane->DocClassPane->managePropButton*/
	public WebElement get_managePropButton_Self(){
		return driver.findElement(By.xpath(managePropButton_XPath)).findVisibleElement(By.xpath(managePropButton_XPath));
	}

	/*HeadquarterManageView->MainPane->DocClassPane->defaultGrid*/
	public void dDefaultGrid_colCaptionClick(String captionName){
		WebElement dDefaultGrid = driver.findElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']")).findVisibleElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']"));
		dDefaultGrid.click();
	}

	/*HeadquarterManageView->MainPane->DocClassPane->defaultGrid*/
	public void dDefaultGrid_selectCellbyRowColNumber(int rowNum,int colNum){
		WebElement dDefaultGrid = driver.findElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]")).findVisibleElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]"));
		dDefaultGrid.click();
	}

	/*HeadquarterManageView->MainPane->DocClassPane->defaultGrid*/
	public void dDefaultGrid_selectRowbyRowColNumber(int rowNum,int colNum){
		WebElement dDefaultGrid = driver.findElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/..")).findVisibleElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/.."));
		dDefaultGrid.click();
	}

	/*HeadquarterManageView->MainPane->DocClassPane->defaultGrid*/
	public void dDefaultGrid_selectRowbyRowNumber(int rowNum){
		WebElement dDefaultGrid = driver.findElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr")).findVisibleElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr"));
		dDefaultGrid.click();
	}

	/*HeadquarterManageView->MainPane->DocClassPane->defaultGrid*/
	public void dDefaultGrid_selectCellbyCellText(String cellText){
		WebElement dDefaultGrid = driver.findElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']")).findVisibleElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']"));
		dDefaultGrid.click();
	}

	/*HeadquarterManageView->MainPane->DocClassPane->defaultGrid*/
	public void dDefaultGrid_selectRowbyCellText(String cellText){
		WebElement dDefaultGrid = driver.findElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/..")).findVisibleElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/.."));
		dDefaultGrid.click();
	}

	/*HeadquarterManageView->MainPane->DocClassPane->defaultGrid*/
	public void dDefaultGrid_selectCellbyOtherInlineCellText(String otherInlineCellText,String targetCellText){
		WebElement dDefaultGrid = driver.findElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']")).findVisibleElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']"));
		dDefaultGrid.click();
	}

	/*HeadquarterManageView->MainPane->DocClassPane->defaultGrid*/
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

	/*HeadquarterManageView->MainPane->DocClassPane->defaultGrid*/
	public WebElement get_dDefaultGrid_colCaption_Self(String captionName){
		return driver.findElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']")).findVisibleElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']"));
	}

	/*HeadquarterManageView->MainPane->DocClassPane->defaultGrid*/
	public WebElement get_dDefaultGrid_CellbyRowColNumber_Self(int rowNum,int colNum){
		return driver.findElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]")).findVisibleElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]"));
	}

	/*HeadquarterManageView->MainPane->DocClassPane->defaultGrid*/
	public WebElement get_dDefaultGrid_RowbyRowColNumber_Self(int rowNum,int colNum){
		return driver.findElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/..")).findVisibleElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/.."));
	}

	/*HeadquarterManageView->MainPane->DocClassPane->defaultGrid*/
	public WebElement get_dDefaultGrid_RowbyRowNumber_Self(int rowNum){
		return driver.findElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr")).findVisibleElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr"));
	}

	/*HeadquarterManageView->MainPane->DocClassPane->defaultGrid*/
	public WebElement get_dDefaultGrid_CellbyCellText_Self(String cellText){
		return driver.findElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']")).findVisibleElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']"));
	}

	/*HeadquarterManageView->MainPane->DocClassPane->defaultGrid*/
	public WebElement get_dDefaultGrid_RowbyCellText_Self(String cellText){
		return driver.findElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/..")).findVisibleElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/.."));
	}

	/*HeadquarterManageView->MainPane->DocClassPane->defaultGrid*/
	public WebElement get_dDefaultGrid_CellbyOtherInlineCellText_Self(String otherInlineCellText,String targetCellText){
		return driver.findElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']")).findVisibleElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']"));
	}

	/*HeadquarterManageView->MainPane->DocClassPane->defaultGrid*/
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

	/*HeadquarterManageView->MainPane->DocumentTagConfig->saveBtn*/
	public void DocumentTagConfig_saveBtn_click(){
		WebElement DocumentTagConfig_saveBtn = driver.findElement(By.xpath(DocumentTagConfig_saveBtn_XPath)).findVisibleElement(By.xpath(DocumentTagConfig_saveBtn_XPath));
		DocumentTagConfig_saveBtn.click();
	}

	/*HeadquarterManageView->MainPane->DocumentTagConfig->saveBtn*/
	public WebElement get_DocumentTagConfig_saveBtn_Self(){
		return driver.findElement(By.xpath(DocumentTagConfig_saveBtn_XPath)).findVisibleElement(By.xpath(DocumentTagConfig_saveBtn_XPath));
	}

	/*HeadquarterManageView->MainPane->MetaDataConfig->allPropGrid*/
	public void allPropGrid_colCaptionClick(String captionName){
		WebElement allPropGrid = driver.findElement(By.xpath(allPropGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']")).findVisibleElement(By.xpath(allPropGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']"));
		allPropGrid.click();
	}

	/*HeadquarterManageView->MainPane->MetaDataConfig->allPropGrid*/
	public void allPropGrid_selectCellbyRowColNumber(int rowNum,int colNum){
		WebElement allPropGrid = driver.findElement(By.xpath(allPropGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]")).findVisibleElement(By.xpath(allPropGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]"));
		allPropGrid.click();
	}

	/*HeadquarterManageView->MainPane->MetaDataConfig->allPropGrid*/
	public void allPropGrid_selectRowbyRowColNumber(int rowNum,int colNum){
		WebElement allPropGrid = driver.findElement(By.xpath(allPropGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/..")).findVisibleElement(By.xpath(allPropGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/.."));
		allPropGrid.click();
	}

	/*HeadquarterManageView->MainPane->MetaDataConfig->allPropGrid*/
	public void allPropGrid_selectRowbyRowNumber(int rowNum){
		WebElement allPropGrid = driver.findElement(By.xpath(allPropGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr")).findVisibleElement(By.xpath(allPropGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr"));
		allPropGrid.click();
	}

	/*HeadquarterManageView->MainPane->MetaDataConfig->allPropGrid*/
	public void allPropGrid_selectCellbyCellText(String cellText){
		WebElement allPropGrid = driver.findElement(By.xpath(allPropGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']")).findVisibleElement(By.xpath(allPropGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']"));
		allPropGrid.click();
	}

	/*HeadquarterManageView->MainPane->MetaDataConfig->allPropGrid*/
	public void allPropGrid_selectRowbyCellText(String cellText){
		WebElement allPropGrid = driver.findElement(By.xpath(allPropGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/..")).findVisibleElement(By.xpath(allPropGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/.."));
		allPropGrid.click();
	}

	/*HeadquarterManageView->MainPane->MetaDataConfig->allPropGrid*/
	public void allPropGrid_selectCellbyOtherInlineCellText(String otherInlineCellText,String targetCellText){
		WebElement allPropGrid = driver.findElement(By.xpath(allPropGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']")).findVisibleElement(By.xpath(allPropGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']"));
		allPropGrid.click();
	}

	/*HeadquarterManageView->MainPane->MetaDataConfig->allPropGrid*/
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

	/*HeadquarterManageView->MainPane->MetaDataConfig->allPropGrid*/
	public WebElement get_allPropGrid_colCaption_Self(String captionName){
		return driver.findElement(By.xpath(allPropGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']")).findVisibleElement(By.xpath(allPropGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']"));
	}

	/*HeadquarterManageView->MainPane->MetaDataConfig->allPropGrid*/
	public WebElement get_allPropGrid_CellbyRowColNumber_Self(int rowNum,int colNum){
		return driver.findElement(By.xpath(allPropGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]")).findVisibleElement(By.xpath(allPropGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]"));
	}

	/*HeadquarterManageView->MainPane->MetaDataConfig->allPropGrid*/
	public WebElement get_allPropGrid_RowbyRowColNumber_Self(int rowNum,int colNum){
		return driver.findElement(By.xpath(allPropGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/..")).findVisibleElement(By.xpath(allPropGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/.."));
	}

	/*HeadquarterManageView->MainPane->MetaDataConfig->allPropGrid*/
	public WebElement get_allPropGrid_RowbyRowNumber_Self(int rowNum){
		return driver.findElement(By.xpath(allPropGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr")).findVisibleElement(By.xpath(allPropGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr"));
	}

	/*HeadquarterManageView->MainPane->MetaDataConfig->allPropGrid*/
	public WebElement get_allPropGrid_CellbyCellText_Self(String cellText){
		return driver.findElement(By.xpath(allPropGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']")).findVisibleElement(By.xpath(allPropGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']"));
	}

	/*HeadquarterManageView->MainPane->MetaDataConfig->allPropGrid*/
	public WebElement get_allPropGrid_RowbyCellText_Self(String cellText){
		return driver.findElement(By.xpath(allPropGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/..")).findVisibleElement(By.xpath(allPropGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/.."));
	}

	/*HeadquarterManageView->MainPane->MetaDataConfig->allPropGrid*/
	public WebElement get_allPropGrid_CellbyOtherInlineCellText_Self(String otherInlineCellText,String targetCellText){
		return driver.findElement(By.xpath(allPropGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']")).findVisibleElement(By.xpath(allPropGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']"));
	}

	/*HeadquarterManageView->MainPane->MetaDataConfig->allPropGrid*/
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

	/*HeadquarterManageView->MainPane->MetaDataConfig->createButton*/
	public void createButton_click(){
		WebElement createButton = driver.findElement(By.xpath(createButton_XPath)).findVisibleElement(By.xpath(createButton_XPath));
		createButton.click();
	}

	/*HeadquarterManageView->MainPane->MetaDataConfig->createButton*/
	public WebElement get_createButton_Self(){
		return driver.findElement(By.xpath(createButton_XPath)).findVisibleElement(By.xpath(createButton_XPath));
	}

	/*HeadquarterManageView->MainPane->MetaDataConfig->updateButton*/
	public void updateButton_click(){
		WebElement updateButton = driver.findElement(By.xpath(updateButton_XPath)).findVisibleElement(By.xpath(updateButton_XPath));
		updateButton.click();
	}

	/*HeadquarterManageView->MainPane->MetaDataConfig->updateButton*/
	public WebElement get_updateButton_Self(){
		return driver.findElement(By.xpath(updateButton_XPath)).findVisibleElement(By.xpath(updateButton_XPath));
	}

	/*HeadquarterManageView->MainPane->MetaDataConfig->deleteButton*/
	public void deleteButton_click(){
		WebElement deleteButton = driver.findElement(By.xpath(deleteButton_XPath)).findVisibleElement(By.xpath(deleteButton_XPath));
		deleteButton.click();
	}

	/*HeadquarterManageView->MainPane->MetaDataConfig->deleteButton*/
	public WebElement get_deleteButton_Self(){
		return driver.findElement(By.xpath(deleteButton_XPath)).findVisibleElement(By.xpath(deleteButton_XPath));
	}

	/*HeadquarterManageView->MainPane->MetaDataConfig->syncStandardMetaDataBtn*/
	public void syncStandardMetaDataBtn_click(){
		WebElement syncStandardMetaDataBtn = driver.findElement(By.xpath(syncStandardMetaDataBtn_XPath)).findVisibleElement(By.xpath(syncStandardMetaDataBtn_XPath));
		syncStandardMetaDataBtn.click();
	}

	/*HeadquarterManageView->MainPane->MetaDataConfig->syncStandardMetaDataBtn*/
	public WebElement get_syncStandardMetaDataBtn_Self(){
		return driver.findElement(By.xpath(syncStandardMetaDataBtn_XPath)).findVisibleElement(By.xpath(syncStandardMetaDataBtn_XPath));
	}

	/*HeadquarterManageView->MainPane->MetaDataConfig->viewSyncStandardMetaDataRecordBtn*/
	public void viewSyncStandardMetaDataRecordBtn_click(){
		WebElement viewSyncStandardMetaDataRecordBtn = driver.findElement(By.xpath(viewSyncStandardMetaDataRecordBtn_XPath)).findVisibleElement(By.xpath(viewSyncStandardMetaDataRecordBtn_XPath));
		viewSyncStandardMetaDataRecordBtn.click();
	}

	/*HeadquarterManageView->MainPane->MetaDataConfig->viewSyncStandardMetaDataRecordBtn*/
	public WebElement get_viewSyncStandardMetaDataRecordBtn_Self(){
		return driver.findElement(By.xpath(viewSyncStandardMetaDataRecordBtn_XPath)).findVisibleElement(By.xpath(viewSyncStandardMetaDataRecordBtn_XPath));
	}

	/*HeadquarterManageView->MainPane->StandardRuleDistribution->addFile*/
	public void addFile_click(){
		WebElement addFile = driver.findElement(By.xpath(addFile_XPath)).findVisibleElement(By.xpath(addFile_XPath));
		addFile.click();
	}

	/*HeadquarterManageView->MainPane->StandardRuleDistribution->addFile*/
	public WebElement get_addFile_Self(){
		return driver.findElement(By.xpath(addFile_XPath)).findVisibleElement(By.xpath(addFile_XPath));
	}

	/*HeadquarterManageView->MainPane->StandardRuleDistribution->removeFile*/
	public void removeFile_click(){
		WebElement removeFile = driver.findElement(By.xpath(removeFile_XPath)).findVisibleElement(By.xpath(removeFile_XPath));
		removeFile.click();
	}

	/*HeadquarterManageView->MainPane->StandardRuleDistribution->removeFile*/
	public WebElement get_removeFile_Self(){
		return driver.findElement(By.xpath(removeFile_XPath)).findVisibleElement(By.xpath(removeFile_XPath));
	}

	/*HeadquarterManageView->MainPane->StandardRuleDistribution->docDistributionGrid*/
	public void docDistributionGrid_colCaptionClick(String captionName){
		WebElement docDistributionGrid = driver.findElement(By.xpath(docDistributionGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']")).findVisibleElement(By.xpath(docDistributionGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']"));
		docDistributionGrid.click();
	}

	/*HeadquarterManageView->MainPane->StandardRuleDistribution->docDistributionGrid*/
	public void docDistributionGrid_selectCellbyRowColNumber(int rowNum,int colNum){
		WebElement docDistributionGrid = driver.findElement(By.xpath(docDistributionGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]")).findVisibleElement(By.xpath(docDistributionGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]"));
		docDistributionGrid.click();
	}

	/*HeadquarterManageView->MainPane->StandardRuleDistribution->docDistributionGrid*/
	public void docDistributionGrid_selectRowbyRowColNumber(int rowNum,int colNum){
		WebElement docDistributionGrid = driver.findElement(By.xpath(docDistributionGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/..")).findVisibleElement(By.xpath(docDistributionGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/.."));
		docDistributionGrid.click();
	}

	/*HeadquarterManageView->MainPane->StandardRuleDistribution->docDistributionGrid*/
	public void docDistributionGrid_selectRowbyRowNumber(int rowNum){
		WebElement docDistributionGrid = driver.findElement(By.xpath(docDistributionGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr")).findVisibleElement(By.xpath(docDistributionGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr"));
		docDistributionGrid.click();
	}

	/*HeadquarterManageView->MainPane->StandardRuleDistribution->docDistributionGrid*/
	public void docDistributionGrid_selectCellbyCellText(String cellText){
		WebElement docDistributionGrid = driver.findElement(By.xpath(docDistributionGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']")).findVisibleElement(By.xpath(docDistributionGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']"));
		docDistributionGrid.click();
	}

	/*HeadquarterManageView->MainPane->StandardRuleDistribution->docDistributionGrid*/
	public void docDistributionGrid_selectRowbyCellText(String cellText){
		WebElement docDistributionGrid = driver.findElement(By.xpath(docDistributionGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/..")).findVisibleElement(By.xpath(docDistributionGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/.."));
		docDistributionGrid.click();
	}

	/*HeadquarterManageView->MainPane->StandardRuleDistribution->docDistributionGrid*/
	public void docDistributionGrid_selectCellbyOtherInlineCellText(String otherInlineCellText,String targetCellText){
		WebElement docDistributionGrid = driver.findElement(By.xpath(docDistributionGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']")).findVisibleElement(By.xpath(docDistributionGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']"));
		docDistributionGrid.click();
	}

	/*HeadquarterManageView->MainPane->StandardRuleDistribution->docDistributionGrid*/
	public void docDistributionGrid_selectCellbyColNameCellText(String colName,String cellText){
		WebElement docDistributionGrid = driver.findElement(By.xpath(docDistributionGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../..")).findVisibleElement(By.xpath(docDistributionGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../.."));
		String idx=docDistributionGrid.getAttribute("idx");
		List<WebElement> Gridrows = driver.findAll(By.xpath(docDistributionGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]"));
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

	/*HeadquarterManageView->MainPane->StandardRuleDistribution->docDistributionGrid*/
	public WebElement get_docDistributionGrid_colCaption_Self(String captionName){
		return driver.findElement(By.xpath(docDistributionGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']")).findVisibleElement(By.xpath(docDistributionGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']"));
	}

	/*HeadquarterManageView->MainPane->StandardRuleDistribution->docDistributionGrid*/
	public WebElement get_docDistributionGrid_CellbyRowColNumber_Self(int rowNum,int colNum){
		return driver.findElement(By.xpath(docDistributionGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]")).findVisibleElement(By.xpath(docDistributionGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]"));
	}

	/*HeadquarterManageView->MainPane->StandardRuleDistribution->docDistributionGrid*/
	public WebElement get_docDistributionGrid_RowbyRowColNumber_Self(int rowNum,int colNum){
		return driver.findElement(By.xpath(docDistributionGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/..")).findVisibleElement(By.xpath(docDistributionGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/.."));
	}

	/*HeadquarterManageView->MainPane->StandardRuleDistribution->docDistributionGrid*/
	public WebElement get_docDistributionGrid_RowbyRowNumber_Self(int rowNum){
		return driver.findElement(By.xpath(docDistributionGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr")).findVisibleElement(By.xpath(docDistributionGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr"));
	}

	/*HeadquarterManageView->MainPane->StandardRuleDistribution->docDistributionGrid*/
	public WebElement get_docDistributionGrid_CellbyCellText_Self(String cellText){
		return driver.findElement(By.xpath(docDistributionGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']")).findVisibleElement(By.xpath(docDistributionGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']"));
	}

	/*HeadquarterManageView->MainPane->StandardRuleDistribution->docDistributionGrid*/
	public WebElement get_docDistributionGrid_RowbyCellText_Self(String cellText){
		return driver.findElement(By.xpath(docDistributionGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/..")).findVisibleElement(By.xpath(docDistributionGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/.."));
	}

	/*HeadquarterManageView->MainPane->StandardRuleDistribution->docDistributionGrid*/
	public WebElement get_docDistributionGrid_CellbyOtherInlineCellText_Self(String otherInlineCellText,String targetCellText){
		return driver.findElement(By.xpath(docDistributionGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']")).findVisibleElement(By.xpath(docDistributionGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']"));
	}

	/*HeadquarterManageView->MainPane->StandardRuleDistribution->docDistributionGrid*/
	public WebElement get_docDistributionGrid_CellbyColNameCellText_Self(String colName,String cellText){
		WebElement docDistributionGrid = driver.findElement(By.xpath(docDistributionGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../..")).findVisibleElement(By.xpath(docDistributionGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../.."));
		String idx=docDistributionGrid.getAttribute("idx");
		List<WebElement> Gridrows = driver.findAll(By.xpath(docDistributionGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]"));
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

	/*HeadquarterManageView->MainPane->StandardRuleDistribution->selectDocDistributeToBtn*/
	public void selectDocDistributeToBtn_click(){
		WebElement selectDocDistributeToBtn = driver.findElement(By.xpath(selectDocDistributeToBtn_XPath)).findVisibleElement(By.xpath(selectDocDistributeToBtn_XPath));
		selectDocDistributeToBtn.click();
	}

	/*HeadquarterManageView->MainPane->StandardRuleDistribution->selectDocDistributeToBtn*/
	public WebElement get_selectDocDistributeToBtn_Self(){
		return driver.findElement(By.xpath(selectDocDistributeToBtn_XPath)).findVisibleElement(By.xpath(selectDocDistributeToBtn_XPath));
	}

	/*HeadquarterManageView->MainPane->StandardRuleDistribution->DeleteDistributeItemBtn*/
	public void DeleteDistributeItemBtn_click(){
		WebElement DeleteDistributeItemBtn = driver.findElement(By.xpath(DeleteDistributeItemBtn_XPath)).findVisibleElement(By.xpath(DeleteDistributeItemBtn_XPath));
		DeleteDistributeItemBtn.click();
	}

	/*HeadquarterManageView->MainPane->StandardRuleDistribution->DeleteDistributeItemBtn*/
	public WebElement get_DeleteDistributeItemBtn_Self(){
		return driver.findElement(By.xpath(DeleteDistributeItemBtn_XPath)).findVisibleElement(By.xpath(DeleteDistributeItemBtn_XPath));
	}

	/*HeadquarterManageView->MainPane->StandardRuleDistribution->docDistributionToGrid*/
	public void docDistributionToGrid_colCaptionClick(String captionName){
		WebElement docDistributionToGrid = driver.findElement(By.xpath(docDistributionToGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']")).findVisibleElement(By.xpath(docDistributionToGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']"));
		docDistributionToGrid.click();
	}

	/*HeadquarterManageView->MainPane->StandardRuleDistribution->docDistributionToGrid*/
	public void docDistributionToGrid_selectCellbyRowColNumber(int rowNum,int colNum){
		WebElement docDistributionToGrid = driver.findElement(By.xpath(docDistributionToGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]")).findVisibleElement(By.xpath(docDistributionToGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]"));
		docDistributionToGrid.click();
	}

	/*HeadquarterManageView->MainPane->StandardRuleDistribution->docDistributionToGrid*/
	public void docDistributionToGrid_selectRowbyRowColNumber(int rowNum,int colNum){
		WebElement docDistributionToGrid = driver.findElement(By.xpath(docDistributionToGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/..")).findVisibleElement(By.xpath(docDistributionToGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/.."));
		docDistributionToGrid.click();
	}

	/*HeadquarterManageView->MainPane->StandardRuleDistribution->docDistributionToGrid*/
	public void docDistributionToGrid_selectRowbyRowNumber(int rowNum){
		WebElement docDistributionToGrid = driver.findElement(By.xpath(docDistributionToGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr")).findVisibleElement(By.xpath(docDistributionToGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr"));
		docDistributionToGrid.click();
	}

	/*HeadquarterManageView->MainPane->StandardRuleDistribution->docDistributionToGrid*/
	public void docDistributionToGrid_selectCellbyCellText(String cellText){
		WebElement docDistributionToGrid = driver.findElement(By.xpath(docDistributionToGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']")).findVisibleElement(By.xpath(docDistributionToGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']"));
		docDistributionToGrid.click();
	}

	/*HeadquarterManageView->MainPane->StandardRuleDistribution->docDistributionToGrid*/
	public void docDistributionToGrid_selectRowbyCellText(String cellText){
		WebElement docDistributionToGrid = driver.findElement(By.xpath(docDistributionToGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/..")).findVisibleElement(By.xpath(docDistributionToGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/.."));
		docDistributionToGrid.click();
	}

	/*HeadquarterManageView->MainPane->StandardRuleDistribution->docDistributionToGrid*/
	public void docDistributionToGrid_selectCellbyOtherInlineCellText(String otherInlineCellText,String targetCellText){
		WebElement docDistributionToGrid = driver.findElement(By.xpath(docDistributionToGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']")).findVisibleElement(By.xpath(docDistributionToGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']"));
		docDistributionToGrid.click();
	}

	/*HeadquarterManageView->MainPane->StandardRuleDistribution->docDistributionToGrid*/
	public void docDistributionToGrid_selectCellbyColNameCellText(String colName,String cellText){
		WebElement docDistributionToGrid = driver.findElement(By.xpath(docDistributionToGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../..")).findVisibleElement(By.xpath(docDistributionToGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../.."));
		String idx=docDistributionToGrid.getAttribute("idx");
		List<WebElement> Gridrows = driver.findAll(By.xpath(docDistributionToGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]"));
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

	/*HeadquarterManageView->MainPane->StandardRuleDistribution->docDistributionToGrid*/
	public WebElement get_docDistributionToGrid_colCaption_Self(String captionName){
		return driver.findElement(By.xpath(docDistributionToGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']")).findVisibleElement(By.xpath(docDistributionToGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']"));
	}

	/*HeadquarterManageView->MainPane->StandardRuleDistribution->docDistributionToGrid*/
	public WebElement get_docDistributionToGrid_CellbyRowColNumber_Self(int rowNum,int colNum){
		return driver.findElement(By.xpath(docDistributionToGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]")).findVisibleElement(By.xpath(docDistributionToGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]"));
	}

	/*HeadquarterManageView->MainPane->StandardRuleDistribution->docDistributionToGrid*/
	public WebElement get_docDistributionToGrid_RowbyRowColNumber_Self(int rowNum,int colNum){
		return driver.findElement(By.xpath(docDistributionToGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/..")).findVisibleElement(By.xpath(docDistributionToGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/.."));
	}

	/*HeadquarterManageView->MainPane->StandardRuleDistribution->docDistributionToGrid*/
	public WebElement get_docDistributionToGrid_RowbyRowNumber_Self(int rowNum){
		return driver.findElement(By.xpath(docDistributionToGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr")).findVisibleElement(By.xpath(docDistributionToGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr"));
	}

	/*HeadquarterManageView->MainPane->StandardRuleDistribution->docDistributionToGrid*/
	public WebElement get_docDistributionToGrid_CellbyCellText_Self(String cellText){
		return driver.findElement(By.xpath(docDistributionToGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']")).findVisibleElement(By.xpath(docDistributionToGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']"));
	}

	/*HeadquarterManageView->MainPane->StandardRuleDistribution->docDistributionToGrid*/
	public WebElement get_docDistributionToGrid_RowbyCellText_Self(String cellText){
		return driver.findElement(By.xpath(docDistributionToGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/..")).findVisibleElement(By.xpath(docDistributionToGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/.."));
	}

	/*HeadquarterManageView->MainPane->StandardRuleDistribution->docDistributionToGrid*/
	public WebElement get_docDistributionToGrid_CellbyOtherInlineCellText_Self(String otherInlineCellText,String targetCellText){
		return driver.findElement(By.xpath(docDistributionToGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']")).findVisibleElement(By.xpath(docDistributionToGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']"));
	}

	/*HeadquarterManageView->MainPane->StandardRuleDistribution->docDistributionToGrid*/
	public WebElement get_docDistributionToGrid_CellbyColNameCellText_Self(String colName,String cellText){
		WebElement docDistributionToGrid = driver.findElement(By.xpath(docDistributionToGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../..")).findVisibleElement(By.xpath(docDistributionToGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../.."));
		String idx=docDistributionToGrid.getAttribute("idx");
		List<WebElement> Gridrows = driver.findAll(By.xpath(docDistributionToGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]"));
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

	/*HeadquarterManageView->MainPane->StandardRuleDistribution->defaultOk*/
	public void dDefaultOk_click(){
		WebElement dDefaultOk = driver.findElement(By.xpath(dDefaultOk_XPath)).findVisibleElement(By.xpath(dDefaultOk_XPath));
		dDefaultOk.click();
	}

	/*HeadquarterManageView->MainPane->StandardRuleDistribution->defaultOk*/
	public WebElement get_dDefaultOk_Self(){
		return driver.findElement(By.xpath(dDefaultOk_XPath)).findVisibleElement(By.xpath(dDefaultOk_XPath));
	}

	/*HeadquarterManageView->MainPane->StandardRuleDistribution->modifyBtn*/
	public void modifyBtn_click(){
		WebElement modifyBtn = driver.findElement(By.xpath(modifyBtn_XPath)).findVisibleElement(By.xpath(modifyBtn_XPath));
		modifyBtn.click();
	}

	/*HeadquarterManageView->MainPane->StandardRuleDistribution->modifyBtn*/
	public WebElement get_modifyBtn_Self(){
		return driver.findElement(By.xpath(modifyBtn_XPath)).findVisibleElement(By.xpath(modifyBtn_XPath));
	}

	/*HeadquarterManageView->MainPane->StandardRuleDistribution->approvalBtn*/
	public void approvalBtn_click(){
		WebElement approvalBtn = driver.findElement(By.xpath(approvalBtn_XPath)).findVisibleElement(By.xpath(approvalBtn_XPath));
		approvalBtn.click();
	}

	/*HeadquarterManageView->MainPane->StandardRuleDistribution->approvalBtn*/
	public WebElement get_approvalBtn_Self(){
		return driver.findElement(By.xpath(approvalBtn_XPath)).findVisibleElement(By.xpath(approvalBtn_XPath));
	}

	/*HeadquarterManageView->MainPane->StandardRuleDistribution->returnBackBtn*/
	public void returnBackBtn_click(){
		WebElement returnBackBtn = driver.findElement(By.xpath(returnBackBtn_XPath)).findVisibleElement(By.xpath(returnBackBtn_XPath));
		returnBackBtn.click();
	}

	/*HeadquarterManageView->MainPane->StandardRuleDistribution->returnBackBtn*/
	public WebElement get_returnBackBtn_Self(){
		return driver.findElement(By.xpath(returnBackBtn_XPath)).findVisibleElement(By.xpath(returnBackBtn_XPath));
	}

	/*HeadquarterManageView->MainPane->StandardRuleDistribution->cancleBtn*/
	public void cancleBtn_click(){
		WebElement cancleBtn = driver.findElement(By.xpath(cancleBtn_XPath)).findVisibleElement(By.xpath(cancleBtn_XPath));
		cancleBtn.click();
	}

	/*HeadquarterManageView->MainPane->StandardRuleDistribution->cancleBtn*/
	public WebElement get_cancleBtn_Self(){
		return driver.findElement(By.xpath(cancleBtn_XPath)).findVisibleElement(By.xpath(cancleBtn_XPath));
	}

	/*HeadquarterManageView->MainPane->SynchronousData->onClick: ->addselectPowerPlant*/
	public void addselectPowerPlant_click(){
		WebElement addselectPowerPlant = driver.findElement(By.xpath(addselectPowerPlant_XPath)).findVisibleElement(By.xpath(addselectPowerPlant_XPath));
		addselectPowerPlant.click();
	}

	/*HeadquarterManageView->MainPane->SynchronousData->onClick: ->addselectPowerPlant*/
	public WebElement get_addselectPowerPlant_Self(){
		return driver.findElement(By.xpath(addselectPowerPlant_XPath)).findVisibleElement(By.xpath(addselectPowerPlant_XPath));
	}

	/*HeadquarterManageView->MainPane->SynchronousData->onClick: ->delselectPowerPlant*/
	public void delselectPowerPlant_click(){
		WebElement delselectPowerPlant = driver.findElement(By.xpath(delselectPowerPlant_XPath)).findVisibleElement(By.xpath(delselectPowerPlant_XPath));
		delselectPowerPlant.click();
	}

	/*HeadquarterManageView->MainPane->SynchronousData->onClick: ->delselectPowerPlant*/
	public WebElement get_delselectPowerPlant_Self(){
		return driver.findElement(By.xpath(delselectPowerPlant_XPath)).findVisibleElement(By.xpath(delselectPowerPlant_XPath));
	}

	/*HeadquarterManageView->MainPane->SynchronousData->sysDataType*/
	public void sysDataType_input(String inputStr){
		WebElement sysDataType=driver.findElement(By.xpath(sysDataType_XPath+"/descendant::input[contains(@role,'textbox')]")).findVisibleElement(By.xpath(sysDataType_XPath+"/descendant::input[contains(@role,'textbox')]"));
		sysDataType.click();
		sysDataType.clear();
		sysDataType.sendKeys(inputStr);
	}

	/*HeadquarterManageView->MainPane->SynchronousData->sysDataType*/
	public void sysDataType_select(String selectStr){
		WebElement sysDataType=driver.findElement(By.xpath(sysDataType_XPath)).findVisibleElement(By.xpath(sysDataType_XPath));
		sysDataType.click();
		WebElement comboboxNameArrow =driver.findElement(By.xpath(sysDataType_XPath+"/descendant::input[contains(@class,'ArrowButton')]")).findVisibleElement(By.xpath(sysDataType_XPath+"/descendant::input[contains(@class,'ArrowButton')]"));
		comboboxNameArrow.click();
		CommonClass.implicitWait(driver);
		WebElement mySelectItem=driver.findElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']")).findVisibleElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']"));
		mySelectItem.click();
	}

	/*HeadquarterManageView->MainPane->SynchronousData->sysDataType*/
	public WebElement get_sysDataType_input_Self(){
		return driver.findElement(By.xpath(sysDataType_XPath+"/descendant::input[contains(@role,'textbox')]")).findVisibleElement(By.xpath(sysDataType_XPath+"/descendant::input[contains(@role,'textbox')]"));
	}

	/*HeadquarterManageView->MainPane->SynchronousData->sysDataType*/
	public WebElement get_sysDataType_selectItem_Self(String selectStr){
		WebElement sysDataType=driver.findElement(By.xpath(sysDataType_XPath)).findVisibleElement(By.xpath(sysDataType_XPath));
		sysDataType.click();
		WebElement comboboxNameArrow =driver.findElement(By.xpath(sysDataType_XPath+"/descendant::input[contains(@class,'ArrowButton')]")).findVisibleElement(By.xpath(sysDataType_XPath+"/descendant::input[contains(@class,'ArrowButton')]"));
		comboboxNameArrow.click();
		CommonClass.implicitWait(driver);
		return driver.findElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']")).findVisibleElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']"));
	}

	/*HeadquarterManageView->MainPane->SynchronousData->selectPlantGrid*/
	public void selectPlantGrid_colCaptionClick(String captionName){
		WebElement selectPlantGrid = driver.findElement(By.xpath(selectPlantGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']")).findVisibleElement(By.xpath(selectPlantGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']"));
		selectPlantGrid.click();
	}

	/*HeadquarterManageView->MainPane->SynchronousData->selectPlantGrid*/
	public void selectPlantGrid_selectCellbyRowColNumber(int rowNum,int colNum){
		WebElement selectPlantGrid = driver.findElement(By.xpath(selectPlantGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]")).findVisibleElement(By.xpath(selectPlantGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]"));
		selectPlantGrid.click();
	}

	/*HeadquarterManageView->MainPane->SynchronousData->selectPlantGrid*/
	public void selectPlantGrid_selectRowbyRowColNumber(int rowNum,int colNum){
		WebElement selectPlantGrid = driver.findElement(By.xpath(selectPlantGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/..")).findVisibleElement(By.xpath(selectPlantGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/.."));
		selectPlantGrid.click();
	}

	/*HeadquarterManageView->MainPane->SynchronousData->selectPlantGrid*/
	public void selectPlantGrid_selectRowbyRowNumber(int rowNum){
		WebElement selectPlantGrid = driver.findElement(By.xpath(selectPlantGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr")).findVisibleElement(By.xpath(selectPlantGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr"));
		selectPlantGrid.click();
	}

	/*HeadquarterManageView->MainPane->SynchronousData->selectPlantGrid*/
	public void selectPlantGrid_selectCellbyCellText(String cellText){
		WebElement selectPlantGrid = driver.findElement(By.xpath(selectPlantGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']")).findVisibleElement(By.xpath(selectPlantGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']"));
		selectPlantGrid.click();
	}

	/*HeadquarterManageView->MainPane->SynchronousData->selectPlantGrid*/
	public void selectPlantGrid_selectRowbyCellText(String cellText){
		WebElement selectPlantGrid = driver.findElement(By.xpath(selectPlantGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/..")).findVisibleElement(By.xpath(selectPlantGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/.."));
		selectPlantGrid.click();
	}

	/*HeadquarterManageView->MainPane->SynchronousData->selectPlantGrid*/
	public void selectPlantGrid_selectCellbyOtherInlineCellText(String otherInlineCellText,String targetCellText){
		WebElement selectPlantGrid = driver.findElement(By.xpath(selectPlantGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']")).findVisibleElement(By.xpath(selectPlantGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']"));
		selectPlantGrid.click();
	}

	/*HeadquarterManageView->MainPane->SynchronousData->selectPlantGrid*/
	public void selectPlantGrid_selectCellbyColNameCellText(String colName,String cellText){
		WebElement selectPlantGrid = driver.findElement(By.xpath(selectPlantGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../..")).findVisibleElement(By.xpath(selectPlantGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../.."));
		String idx=selectPlantGrid.getAttribute("idx");
		List<WebElement> Gridrows = driver.findAll(By.xpath(selectPlantGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]"));
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

	/*HeadquarterManageView->MainPane->SynchronousData->selectPlantGrid*/
	public WebElement get_selectPlantGrid_colCaption_Self(String captionName){
		return driver.findElement(By.xpath(selectPlantGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']")).findVisibleElement(By.xpath(selectPlantGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']"));
	}

	/*HeadquarterManageView->MainPane->SynchronousData->selectPlantGrid*/
	public WebElement get_selectPlantGrid_CellbyRowColNumber_Self(int rowNum,int colNum){
		return driver.findElement(By.xpath(selectPlantGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]")).findVisibleElement(By.xpath(selectPlantGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]"));
	}

	/*HeadquarterManageView->MainPane->SynchronousData->selectPlantGrid*/
	public WebElement get_selectPlantGrid_RowbyRowColNumber_Self(int rowNum,int colNum){
		return driver.findElement(By.xpath(selectPlantGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/..")).findVisibleElement(By.xpath(selectPlantGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/.."));
	}

	/*HeadquarterManageView->MainPane->SynchronousData->selectPlantGrid*/
	public WebElement get_selectPlantGrid_RowbyRowNumber_Self(int rowNum){
		return driver.findElement(By.xpath(selectPlantGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr")).findVisibleElement(By.xpath(selectPlantGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr"));
	}

	/*HeadquarterManageView->MainPane->SynchronousData->selectPlantGrid*/
	public WebElement get_selectPlantGrid_CellbyCellText_Self(String cellText){
		return driver.findElement(By.xpath(selectPlantGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']")).findVisibleElement(By.xpath(selectPlantGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']"));
	}

	/*HeadquarterManageView->MainPane->SynchronousData->selectPlantGrid*/
	public WebElement get_selectPlantGrid_RowbyCellText_Self(String cellText){
		return driver.findElement(By.xpath(selectPlantGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/..")).findVisibleElement(By.xpath(selectPlantGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/.."));
	}

	/*HeadquarterManageView->MainPane->SynchronousData->selectPlantGrid*/
	public WebElement get_selectPlantGrid_CellbyOtherInlineCellText_Self(String otherInlineCellText,String targetCellText){
		return driver.findElement(By.xpath(selectPlantGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']")).findVisibleElement(By.xpath(selectPlantGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']"));
	}

	/*HeadquarterManageView->MainPane->SynchronousData->selectPlantGrid*/
	public WebElement get_selectPlantGrid_CellbyColNameCellText_Self(String colName,String cellText){
		WebElement selectPlantGrid = driver.findElement(By.xpath(selectPlantGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../..")).findVisibleElement(By.xpath(selectPlantGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../.."));
		String idx=selectPlantGrid.getAttribute("idx");
		List<WebElement> Gridrows = driver.findAll(By.xpath(selectPlantGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]"));
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

	/*HeadquarterManageView->MainPane->SynchronousData->onClick: ->onSysData*/
	public void onSysData_click(){
		WebElement onSysData = driver.findElement(By.xpath(onSysData_XPath)).findVisibleElement(By.xpath(onSysData_XPath));
		onSysData.click();
	}

	/*HeadquarterManageView->MainPane->SynchronousData->onClick: ->onSysData*/
	public WebElement get_onSysData_Self(){
		return driver.findElement(By.xpath(onSysData_XPath)).findVisibleElement(By.xpath(onSysData_XPath));
	}

	/*HeadquarterManageView->MainPane->SynchronousData->onClick: ->onCancel*/
	public void onCancel_click(){
		WebElement onCancel = driver.findElement(By.xpath(onCancel_XPath)).findVisibleElement(By.xpath(onCancel_XPath));
		onCancel.click();
	}

	/*HeadquarterManageView->MainPane->SynchronousData->onClick: ->onCancel*/
	public WebElement get_onCancel_Self(){
		return driver.findElement(By.xpath(onCancel_XPath)).findVisibleElement(By.xpath(onCancel_XPath));
	}

	/*HeadquarterManageView->MainPane->TagTreeConfig->saveBtn*/
	public void MainPane_TagTreeConfig_saveBtn_click(){
		WebElement MainPane_TagTreeConfig_saveBtn = driver.findElement(By.xpath(MainPane_TagTreeConfig_saveBtn_XPath)).findVisibleElement(By.xpath(MainPane_TagTreeConfig_saveBtn_XPath));
		MainPane_TagTreeConfig_saveBtn.click();
	}

	/*HeadquarterManageView->MainPane->TagTreeConfig->saveBtn*/
	public WebElement get_MainPane_TagTreeConfig_saveBtn_Self(){
		return driver.findElement(By.xpath(MainPane_TagTreeConfig_saveBtn_XPath)).findVisibleElement(By.xpath(MainPane_TagTreeConfig_saveBtn_XPath));
	}

	/*HeadquarterManageView->MainPane->TagTreeConfig->createBtn*/
	public void MainPane_TagTreeConfig_createBtn_click(){
		WebElement MainPane_TagTreeConfig_createBtn = driver.findElement(By.xpath(MainPane_TagTreeConfig_createBtn_XPath)).findVisibleElement(By.xpath(MainPane_TagTreeConfig_createBtn_XPath));
		MainPane_TagTreeConfig_createBtn.click();
	}

	/*HeadquarterManageView->MainPane->TagTreeConfig->createBtn*/
	public WebElement get_MainPane_TagTreeConfig_createBtn_Self(){
		return driver.findElement(By.xpath(MainPane_TagTreeConfig_createBtn_XPath)).findVisibleElement(By.xpath(MainPane_TagTreeConfig_createBtn_XPath));
	}

	/*HeadquarterManageView->MainPane->TagTreeConfig->editBtn*/
	public void MainPane_TagTreeConfig_editBtn_click(){
		WebElement MainPane_TagTreeConfig_editBtn = driver.findElement(By.xpath(MainPane_TagTreeConfig_editBtn_XPath)).findVisibleElement(By.xpath(MainPane_TagTreeConfig_editBtn_XPath));
		MainPane_TagTreeConfig_editBtn.click();
	}

	/*HeadquarterManageView->MainPane->TagTreeConfig->editBtn*/
	public WebElement get_MainPane_TagTreeConfig_editBtn_Self(){
		return driver.findElement(By.xpath(MainPane_TagTreeConfig_editBtn_XPath)).findVisibleElement(By.xpath(MainPane_TagTreeConfig_editBtn_XPath));
	}

	/*HeadquarterManageView->MainPane->TagTreeConfig->deleteBtn*/
	public void MainPane_TagTreeConfig_deleteBtn_click(){
		WebElement MainPane_TagTreeConfig_deleteBtn = driver.findElement(By.xpath(MainPane_TagTreeConfig_deleteBtn_XPath)).findVisibleElement(By.xpath(MainPane_TagTreeConfig_deleteBtn_XPath));
		MainPane_TagTreeConfig_deleteBtn.click();
	}

	/*HeadquarterManageView->MainPane->TagTreeConfig->deleteBtn*/
	public WebElement get_MainPane_TagTreeConfig_deleteBtn_Self(){
		return driver.findElement(By.xpath(MainPane_TagTreeConfig_deleteBtn_XPath)).findVisibleElement(By.xpath(MainPane_TagTreeConfig_deleteBtn_XPath));
	}

	/*HeadquarterManageView->MainPane->NuclearPlantStageStandard->saveBtn*/
	public void NuclearPlantStageStandard_saveBtn_click(){
		WebElement NuclearPlantStageStandard_saveBtn = driver.findElement(By.xpath(NuclearPlantStageStandard_saveBtn_XPath)).findVisibleElement(By.xpath(NuclearPlantStageStandard_saveBtn_XPath));
		NuclearPlantStageStandard_saveBtn.click();
	}

	/*HeadquarterManageView->MainPane->NuclearPlantStageStandard->saveBtn*/
	public WebElement get_NuclearPlantStageStandard_saveBtn_Self(){
		return driver.findElement(By.xpath(NuclearPlantStageStandard_saveBtn_XPath)).findVisibleElement(By.xpath(NuclearPlantStageStandard_saveBtn_XPath));
	}

	/*HeadquarterManageView->MainPane->NuclearPlantStageStandard->createBtn*/
	public void NuclearPlantStageStandard_createBtn_click(){
		WebElement NuclearPlantStageStandard_createBtn = driver.findElement(By.xpath(NuclearPlantStageStandard_createBtn_XPath)).findVisibleElement(By.xpath(NuclearPlantStageStandard_createBtn_XPath));
		NuclearPlantStageStandard_createBtn.click();
	}

	/*HeadquarterManageView->MainPane->NuclearPlantStageStandard->createBtn*/
	public WebElement get_NuclearPlantStageStandard_createBtn_Self(){
		return driver.findElement(By.xpath(NuclearPlantStageStandard_createBtn_XPath)).findVisibleElement(By.xpath(NuclearPlantStageStandard_createBtn_XPath));
	}

	/*HeadquarterManageView->MainPane->NuclearPlantStageStandard->editBtn*/
	public void NuclearPlantStageStandard_editBtn_click(){
		WebElement NuclearPlantStageStandard_editBtn = driver.findElement(By.xpath(NuclearPlantStageStandard_editBtn_XPath)).findVisibleElement(By.xpath(NuclearPlantStageStandard_editBtn_XPath));
		NuclearPlantStageStandard_editBtn.click();
	}

	/*HeadquarterManageView->MainPane->NuclearPlantStageStandard->editBtn*/
	public WebElement get_NuclearPlantStageStandard_editBtn_Self(){
		return driver.findElement(By.xpath(NuclearPlantStageStandard_editBtn_XPath)).findVisibleElement(By.xpath(NuclearPlantStageStandard_editBtn_XPath));
	}

	/*HeadquarterManageView->MainPane->NuclearPlantStageStandard->deleteBtn*/
	public void NuclearPlantStageStandard_deleteBtn_click(){
		WebElement NuclearPlantStageStandard_deleteBtn = driver.findElement(By.xpath(NuclearPlantStageStandard_deleteBtn_XPath)).findVisibleElement(By.xpath(NuclearPlantStageStandard_deleteBtn_XPath));
		NuclearPlantStageStandard_deleteBtn.click();
	}

	/*HeadquarterManageView->MainPane->NuclearPlantStageStandard->deleteBtn*/
	public WebElement get_NuclearPlantStageStandard_deleteBtn_Self(){
		return driver.findElement(By.xpath(NuclearPlantStageStandard_deleteBtn_XPath)).findVisibleElement(By.xpath(NuclearPlantStageStandard_deleteBtn_XPath));
	}

	/*HeadquarterManageView->MainPane->StandardRuleStructureManage->domain*/
	public void domain_input(String inputStr){
		WebElement domain=driver.findElement(By.xpath(domain_XPath+"/descendant::input[contains(@role,'textbox')]")).findVisibleElement(By.xpath(domain_XPath+"/descendant::input[contains(@role,'textbox')]"));
		domain.click();
		domain.clear();
		domain.sendKeys(inputStr);
	}

	/*HeadquarterManageView->MainPane->StandardRuleStructureManage->domain*/
	public void domain_select(String selectStr){
		WebElement domain=driver.findElement(By.xpath(domain_XPath)).findVisibleElement(By.xpath(domain_XPath));
		domain.click();
		WebElement comboboxNameArrow =driver.findElement(By.xpath(domain_XPath+"/descendant::input[contains(@class,'ArrowButton')]")).findVisibleElement(By.xpath(domain_XPath+"/descendant::input[contains(@class,'ArrowButton')]"));
		comboboxNameArrow.click();
		CommonClass.implicitWait(driver);
		WebElement mySelectItem=driver.findElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']")).findVisibleElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']"));
		mySelectItem.click();
	}

	/*HeadquarterManageView->MainPane->StandardRuleStructureManage->domain*/
	public WebElement get_domain_input_Self(){
		return driver.findElement(By.xpath(domain_XPath+"/descendant::input[contains(@role,'textbox')]")).findVisibleElement(By.xpath(domain_XPath+"/descendant::input[contains(@role,'textbox')]"));
	}

	/*HeadquarterManageView->MainPane->StandardRuleStructureManage->domain*/
	public WebElement get_domain_selectItem_Self(String selectStr){
		WebElement domain=driver.findElement(By.xpath(domain_XPath)).findVisibleElement(By.xpath(domain_XPath));
		domain.click();
		WebElement comboboxNameArrow =driver.findElement(By.xpath(domain_XPath+"/descendant::input[contains(@class,'ArrowButton')]")).findVisibleElement(By.xpath(domain_XPath+"/descendant::input[contains(@class,'ArrowButton')]"));
		comboboxNameArrow.click();
		CommonClass.implicitWait(driver);
		return driver.findElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']")).findVisibleElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']"));
	}

}
