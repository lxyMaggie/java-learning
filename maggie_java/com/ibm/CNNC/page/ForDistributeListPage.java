package com.ibm.CNNC.page;

import java.util.List;

import org.openqa.selenium.By;

import com.selenium.utils.WebDriver;
import com.selenium.utils.WebElement;

public class ForDistributeListPage {
	private WebDriver driver;
	private static final String documentDistributionManageButton_XPath="//descendant::div[contains(@id,'ForDistributeList')]/descendant::span[contains(@id, 'DocumentDistributionManage')]";
	private static final String launchDistributeWorkflowButton_XPath="//descendant::div[contains(@id,'ForDistributeList')]/descendant::span[contains(@id, 'LaunchDistributeWorkflow')]";
	private static final String notificationButton_XPath="//descendant::div[contains(@id,'ForDistributeList')]/descendant::span[contains(@id, 'Notification')]";
	private static final String showDocumentPropertyButton_XPath="//descendant::div[contains(@id,'ForDistributeList')]/descendant::span[contains(@id, 'ShowDocumentProperty')]";
	private static final String toggleSearchPaneBtnButton_XPath="//descendant::div[contains(@id,'ForDistributeList')]/descendant::span[contains(@id, 'ToggleSearchPaneBtn')]";
	private static final String fileChineseName_XPath="//descendant::div[contains(@id,'ForDistributeList')]/descendant::span[normalize-space(text())='文件中文题名']/../../descendant::input[contains(@id,'ValidationTextBox')]";
	private static final String searchButton_XPath="//descendant::div[contains(@id,'ForDistributeList')]/descendant::span[contains(@id,'Button')][normalize-space(text())='搜索']";
	private static final String selectAllButton_XPath="//descendant::div[contains(@id,'ForDistributeList')]/descendant::span[contains(@id, 'selectAll')]";
	private static final String forDistributeListGrid_XPath="//descendant::div[contains(@id,'ForDistributeList')]/descendant::div[contains(@id,'EnhancedGrid')]";

	//----Constructor Methods Begin----
	public ForDistributeListPage(WebDriver driver){
		this.driver=driver;
	}

	/*ForDistributeListPage->documentDistributionManageButton*/
	public void documentDistributionManageButton_click(){
		WebElement documentDistributionManageButton = driver.findElement(By.xpath(documentDistributionManageButton_XPath)).findVisibleElement(By.xpath(documentDistributionManageButton_XPath));
		documentDistributionManageButton.click();
	}

	/*ForDistributeListPage->documentDistributionManageButton*/
	public WebElement get_documentDistributionManageButton_Self(){
		return driver.findElement(By.xpath(documentDistributionManageButton_XPath)).findVisibleElement(By.xpath(documentDistributionManageButton_XPath));
	}

	/*ForDistributeListPage->launchDistributeWorkflowButton*/
	public void launchDistributeWorkflowButton_click(){
		WebElement launchDistributeWorkflowButton = driver.findElement(By.xpath(launchDistributeWorkflowButton_XPath)).findVisibleElement(By.xpath(launchDistributeWorkflowButton_XPath));
		launchDistributeWorkflowButton.click();
	}

	/*ForDistributeListPage->launchDistributeWorkflowButton*/
	public WebElement get_launchDistributeWorkflowButton_Self(){
		return driver.findElement(By.xpath(launchDistributeWorkflowButton_XPath)).findVisibleElement(By.xpath(launchDistributeWorkflowButton_XPath));
	}

	/*ForDistributeListPage->notificationButton*/
	public void notificationButton_click(){
		WebElement notificationButton = driver.findElement(By.xpath(notificationButton_XPath)).findVisibleElement(By.xpath(notificationButton_XPath));
		notificationButton.click();
	}

	/*ForDistributeListPage->notificationButton*/
	public WebElement get_notificationButton_Self(){
		return driver.findElement(By.xpath(notificationButton_XPath)).findVisibleElement(By.xpath(notificationButton_XPath));
	}

	/*ForDistributeListPage->showDocumentPropertyButton*/
	public void showDocumentPropertyButton_click(){
		WebElement showDocumentPropertyButton = driver.findElement(By.xpath(showDocumentPropertyButton_XPath)).findVisibleElement(By.xpath(showDocumentPropertyButton_XPath));
		showDocumentPropertyButton.click();
	}

	/*ForDistributeListPage->showDocumentPropertyButton*/
	public WebElement get_showDocumentPropertyButton_Self(){
		return driver.findElement(By.xpath(showDocumentPropertyButton_XPath)).findVisibleElement(By.xpath(showDocumentPropertyButton_XPath));
	}

	/*ForDistributeListPage->toggleSearchPaneBtnButton*/
	public void toggleSearchPaneBtnButton_click(){
		WebElement toggleSearchPaneBtnButton = driver.findElement(By.xpath(toggleSearchPaneBtnButton_XPath)).findVisibleElement(By.xpath(toggleSearchPaneBtnButton_XPath));
		toggleSearchPaneBtnButton.click();
	}

	/*ForDistributeListPage->toggleSearchPaneBtnButton*/
	public WebElement get_toggleSearchPaneBtnButton_Self(){
		return driver.findElement(By.xpath(toggleSearchPaneBtnButton_XPath)).findVisibleElement(By.xpath(toggleSearchPaneBtnButton_XPath));
	}

	/*ForDistributeListPage->fileChineseName*/
	public void fileChineseName_input(String inputStr){
		WebElement fileChineseName=driver.findElement(By.xpath(fileChineseName_XPath)).findVisibleElement(By.xpath(fileChineseName_XPath));
		fileChineseName.click();
		fileChineseName.clear();
		fileChineseName.sendKeys(inputStr);
	}

	/*ForDistributeListPage->fileChineseName*/
	public WebElement get_fileChineseName_Self(){
		return driver.findElement(By.xpath(fileChineseName_XPath)).findVisibleElement(By.xpath(fileChineseName_XPath));
	}

	/*ForDistributeListPage->searchButton*/
	public void searchButton_click(){
		WebElement searchButton = driver.findElement(By.xpath(searchButton_XPath)).findVisibleElement(By.xpath(searchButton_XPath));
		searchButton.click();
	}

	/*ForDistributeListPage->searchButton*/
	public WebElement get_searchButton_Self(){
		return driver.findElement(By.xpath(searchButton_XPath)).findVisibleElement(By.xpath(searchButton_XPath));
	}

	/*ForDistributeListPage->selectAllButton*/
	public void selectAllButton_click(){
		WebElement selectAllButton = driver.findElement(By.xpath(selectAllButton_XPath)).findVisibleElement(By.xpath(selectAllButton_XPath));
		selectAllButton.click();
	}

	/*ForDistributeListPage->selectAllButton*/
	public WebElement get_selectAllButton_Self(){
		return driver.findElement(By.xpath(selectAllButton_XPath)).findVisibleElement(By.xpath(selectAllButton_XPath));
	}

	/*ForDistributeListPage->forDistributeListGrid*/
	public void forDistributeListGrid_colCaptionClick(String captionName){
		WebElement forDistributeListGrid = driver.findElement(By.xpath(forDistributeListGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']")).findVisibleElement(By.xpath(forDistributeListGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']"));
		forDistributeListGrid.click();
	}

	/*ForDistributeListPage->forDistributeListGrid*/
	public void forDistributeListGrid_selectCellbyRowColNumber(int rowNum,int colNum){
		WebElement forDistributeListGrid = driver.findElement(By.xpath(forDistributeListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]")).findVisibleElement(By.xpath(forDistributeListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]"));
		forDistributeListGrid.click();
	}

	/*ForDistributeListPage->forDistributeListGrid*/
	public void forDistributeListGrid_selectRowbyRowColNumber(int rowNum,int colNum){
		WebElement forDistributeListGrid = driver.findElement(By.xpath(forDistributeListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/..")).findVisibleElement(By.xpath(forDistributeListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/.."));
		forDistributeListGrid.click();
	}

	/*ForDistributeListPage->forDistributeListGrid*/
	public void forDistributeListGrid_selectRowbyRowNumber(int rowNum){
		WebElement forDistributeListGrid = driver.findElement(By.xpath(forDistributeListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr")).findVisibleElement(By.xpath(forDistributeListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr"));
		forDistributeListGrid.click();
	}

	/*ForDistributeListPage->forDistributeListGrid*/
	public void forDistributeListGrid_selectCellbyCellText(String cellText){
		WebElement forDistributeListGrid = driver.findElement(By.xpath(forDistributeListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']")).findVisibleElement(By.xpath(forDistributeListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']"));
		forDistributeListGrid.click();
	}

	/*ForDistributeListPage->forDistributeListGrid*/
	public void forDistributeListGrid_selectRowbyCellText(String cellText){
		WebElement forDistributeListGrid = driver.findElement(By.xpath(forDistributeListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/..")).findVisibleElement(By.xpath(forDistributeListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/.."));
		forDistributeListGrid.click();
	}

	/*ForDistributeListPage->forDistributeListGrid*/
	public void forDistributeListGrid_selectCellbyOtherInlineCellText(String otherInlineCellText,String targetCellText){
		WebElement forDistributeListGrid = driver.findElement(By.xpath(forDistributeListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']")).findVisibleElement(By.xpath(forDistributeListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']"));
		forDistributeListGrid.click();
	}

	/*ForDistributeListPage->forDistributeListGrid*/
	public void forDistributeListGrid_selectCellbyColNameCellText(String colName,String cellText){
		WebElement forDistributeListGrid = driver.findElement(By.xpath(forDistributeListGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../..")).findVisibleElement(By.xpath(forDistributeListGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../.."));
		String idx=forDistributeListGrid.getAttribute("idx");
		List<WebElement> Gridrows = driver.findAll(By.xpath(forDistributeListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]"));
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
	
	/*ForDistributeListPage->forDistributeListGrid*/
	public int forDistributeListGrid_getRow( ){

		List<WebElement> Gridrows = driver.findAll(By.xpath(forDistributeListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]"));
		
		return Gridrows.size();

	}

	/*ForDistributeListPage->forDistributeListGrid*/
	public WebElement get_forDistributeListGrid_colCaption_Self(String captionName){
		return driver.findElement(By.xpath(forDistributeListGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']")).findVisibleElement(By.xpath(forDistributeListGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']"));
	}

	/*ForDistributeListPage->forDistributeListGrid*/
	public WebElement get_forDistributeListGrid_CellbyRowColNumber_Self(int rowNum,int colNum){
		return driver.findElement(By.xpath(forDistributeListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]")).findVisibleElement(By.xpath(forDistributeListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]"));
	}

	/*ForDistributeListPage->forDistributeListGrid*/
	public WebElement get_forDistributeListGrid_RowbyRowColNumber_Self(int rowNum,int colNum){
		return driver.findElement(By.xpath(forDistributeListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/..")).findVisibleElement(By.xpath(forDistributeListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/.."));
	}

	/*ForDistributeListPage->forDistributeListGrid*/
	public WebElement get_forDistributeListGrid_RowbyRowNumber_Self(int rowNum){
		return driver.findElement(By.xpath(forDistributeListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr")).findVisibleElement(By.xpath(forDistributeListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr"));
	}

	/*ForDistributeListPage->forDistributeListGrid*/
	public WebElement get_forDistributeListGrid_CellbyCellText_Self(String cellText){
		return driver.findElement(By.xpath(forDistributeListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']")).findVisibleElement(By.xpath(forDistributeListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']"));
	}

	/*ForDistributeListPage->forDistributeListGrid*/
	public WebElement get_forDistributeListGrid_RowbyCellText_Self(String cellText){
		return driver.findElement(By.xpath(forDistributeListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/..")).findVisibleElement(By.xpath(forDistributeListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/.."));
	}

	/*ForDistributeListPage->forDistributeListGrid*/
	public WebElement get_forDistributeListGrid_CellbyOtherInlineCellText_Self(String otherInlineCellText,String targetCellText){
		return driver.findElement(By.xpath(forDistributeListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']")).findVisibleElement(By.xpath(forDistributeListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']"));
	}

	/*ForDistributeListPage->forDistributeListGrid*/
	public WebElement get_forDistributeListGrid_CellbyColNameCellText_Self(String colName,String cellText){
		WebElement forDistributeListGrid = driver.findElement(By.xpath(forDistributeListGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../..")).findVisibleElement(By.xpath(forDistributeListGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../.."));
		String idx=forDistributeListGrid.getAttribute("idx");
		List<WebElement> Gridrows = driver.findAll(By.xpath(forDistributeListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]"));
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

	/*ForDistributeListPage->forDistributeListGrid*/
	public void forDistributeListGrid_selectRowbyCellTitle(String cellTitle){
		WebElement forDistributeListGrid = driver.findElement(By.xpath(forDistributeListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')]/descendant::div[contains(@title,'"+cellTitle+"')]/../..")).findVisibleElement(By.xpath(forDistributeListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')]/descendant::div[contains(@title,'"+cellTitle+"')]/../.."));
		forDistributeListGrid.click();
	}

	/*ForDistributeListPage->forDistributeListGrid*/
	public int get_forDistributeListGrid_RowCount(){
		List<WebElement> Gridrows = driver.findAll(By.xpath(forDistributeListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]"));
		return Gridrows.size();
	}

}
