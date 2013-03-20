package com.ibm.CNNC.page;

import java.util.List;

import org.openqa.selenium.By;

import com.selenium.utils.WebDriver;
import com.selenium.utils.WebElement;

public class SearchDocumentDialogPage {
	private WebDriver driver;
	private static final String fileChineseName_XPath="//descendant::div[contains(@id,'SearchDocumentDialog')]/descendant::span[normalize-space(text())='文件中文题名']/../../descendant::input[contains(@id,'ValidationTextBox')]";
	private static final String searchButton_XPath="//descendant::div[contains(@id,'SearchDocumentDialog')]/descendant::span[contains(@id,'Button')][normalize-space(text())='搜索']";
	private static final String selectAllButton_XPath="//descendant::div[contains(@id,'SearchDocumentDialog')]/descendant::span[contains(@id, 'selectAll')]";
	private static final String searchDocumentGrid_XPath="//descendant::div[contains(@id,'SearchDocumentDialog')]/descendant::div[contains(@id,'EnhancedGrid')]";
	private static final String okButton_XPath="//descendant::div[contains(@id,'SearchDocumentDialog')]/descendant::span[contains(@id,'Button')][normalize-space(text())='确定']";
	private static final String cancelButton_XPath="//descendant::div[contains(@id,'SearchDocumentDialog')]/descendant::span[contains(@id,'Button')][normalize-space(text())='取消']";

	//----Constructor Methods Begin----
	public SearchDocumentDialogPage(WebDriver driver){
		this.driver=driver;
	}

	/*SearchDocumentDialogPage->fileChineseName*/
	public void fileChineseName_input(String inputStr){
		WebElement fileChineseName=driver.findElement(By.xpath(fileChineseName_XPath)).findVisibleElement(By.xpath(fileChineseName_XPath));
		fileChineseName.click();
		fileChineseName.clear();
		fileChineseName.sendKeys(inputStr);
	}

	/*SearchDocumentDialogPage->fileChineseName*/
	public WebElement get_fileChineseName_Self(){
		return driver.findElement(By.xpath(fileChineseName_XPath)).findVisibleElement(By.xpath(fileChineseName_XPath));
	}

	/*SearchDocumentDialogPage->searchButton*/
	public void searchButton_click(){
		WebElement searchButton = driver.findElement(By.xpath(searchButton_XPath)).findVisibleElement(By.xpath(searchButton_XPath));
		searchButton.click();
	}

	/*SearchDocumentDialogPage->searchButton*/
	public WebElement get_searchButton_Self(){
		return driver.findElement(By.xpath(searchButton_XPath)).findVisibleElement(By.xpath(searchButton_XPath));
	}

	/*SearchDocumentDialogPage->selectAllButton*/
	public void selectAllButton_click(){
		WebElement selectAllButton = driver.findElement(By.xpath(selectAllButton_XPath)).findVisibleElement(By.xpath(selectAllButton_XPath));
		selectAllButton.click();
	}

	/*SearchDocumentDialogPage->selectAllButton*/
	public WebElement get_selectAllButton_Self(){
		return driver.findElement(By.xpath(selectAllButton_XPath)).findVisibleElement(By.xpath(selectAllButton_XPath));
	}

	/*SearchDocumentDialogPage->searchDocumentGrid*/
	public void searchDocumentGrid_colCaptionClick(String captionName){
		WebElement searchDocumentGrid = driver.findElement(By.xpath(searchDocumentGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']")).findVisibleElement(By.xpath(searchDocumentGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']"));
		searchDocumentGrid.click();
	}

	/*SearchDocumentDialogPage->searchDocumentGrid*/
	public void searchDocumentGrid_selectCellbyRowColNumber(int rowNum,int colNum){
		WebElement searchDocumentGrid = driver.findElement(By.xpath(searchDocumentGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]")).findVisibleElement(By.xpath(searchDocumentGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]"));
		searchDocumentGrid.click();
	}

	/*SearchDocumentDialogPage->searchDocumentGrid*/
	public void searchDocumentGrid_selectRowbyRowColNumber(int rowNum,int colNum){
		WebElement searchDocumentGrid = driver.findElement(By.xpath(searchDocumentGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/..")).findVisibleElement(By.xpath(searchDocumentGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/.."));
		searchDocumentGrid.click();
	}

	/*SearchDocumentDialogPage->searchDocumentGrid*/
	public void searchDocumentGrid_selectRowbyRowNumber(int rowNum){
		WebElement searchDocumentGrid = driver.findElement(By.xpath(searchDocumentGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr")).findVisibleElement(By.xpath(searchDocumentGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr"));
		searchDocumentGrid.click();
	}

	/*SearchDocumentDialogPage->searchDocumentGrid*/
	public void searchDocumentGrid_selectCellbyCellText(String cellText){
		WebElement searchDocumentGrid = driver.findElement(By.xpath(searchDocumentGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']")).findVisibleElement(By.xpath(searchDocumentGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']"));
		searchDocumentGrid.click();
	}

	/*SearchDocumentDialogPage->searchDocumentGrid*/
	public void searchDocumentGrid_selectRowbyCellText(String cellText){
		WebElement searchDocumentGrid = driver.findElement(By.xpath(searchDocumentGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/..")).findVisibleElement(By.xpath(searchDocumentGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/.."));
		searchDocumentGrid.click();
	}

	/*SearchDocumentDialogPage->searchDocumentGrid*/
	public void searchDocumentGrid_selectCellbyOtherInlineCellText(String otherInlineCellText,String targetCellText){
		WebElement searchDocumentGrid = driver.findElement(By.xpath(searchDocumentGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']")).findVisibleElement(By.xpath(searchDocumentGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']"));
		searchDocumentGrid.click();
	}

	/*SearchDocumentDialogPage->searchDocumentGrid*/
	public void searchDocumentGrid_selectCellbyColNameCellText(String colName,String cellText){
		WebElement searchDocumentGrid = driver.findElement(By.xpath(searchDocumentGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../..")).findVisibleElement(By.xpath(searchDocumentGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../.."));
		String idx=searchDocumentGrid.getAttribute("idx");
		List<WebElement> Gridrows = driver.findAll(By.xpath(searchDocumentGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]"));
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
	
	/*SearchDocumentDialogPage->searchDocumentGrid*/
	public int searchDocumentGrid_getRow( ){

		List<WebElement> Gridrows = driver.findAll(By.xpath(searchDocumentGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]"));
		
		return Gridrows.size();

	}

	/*SearchDocumentDialogPage->searchDocumentGrid*/
	public WebElement get_searchDocumentGrid_colCaption_Self(String captionName){
		return driver.findElement(By.xpath(searchDocumentGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']")).findVisibleElement(By.xpath(searchDocumentGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']"));
	}

	/*SearchDocumentDialogPage->searchDocumentGrid*/
	public WebElement get_searchDocumentGrid_CellbyRowColNumber_Self(int rowNum,int colNum){
		return driver.findElement(By.xpath(searchDocumentGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]")).findVisibleElement(By.xpath(searchDocumentGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]"));
	}

	/*SearchDocumentDialogPage->searchDocumentGrid*/
	public WebElement get_searchDocumentGrid_RowbyRowColNumber_Self(int rowNum,int colNum){
		return driver.findElement(By.xpath(searchDocumentGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/..")).findVisibleElement(By.xpath(searchDocumentGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/.."));
	}

	/*SearchDocumentDialogPage->searchDocumentGrid*/
	public WebElement get_searchDocumentGrid_RowbyRowNumber_Self(int rowNum){
		return driver.findElement(By.xpath(searchDocumentGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr")).findVisibleElement(By.xpath(searchDocumentGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr"));
	}

	/*SearchDocumentDialogPage->searchDocumentGrid*/
	public WebElement get_searchDocumentGrid_CellbyCellText_Self(String cellText){
		return driver.findElement(By.xpath(searchDocumentGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']")).findVisibleElement(By.xpath(searchDocumentGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']"));
	}

	/*SearchDocumentDialogPage->searchDocumentGrid*/
	public WebElement get_searchDocumentGrid_RowbyCellText_Self(String cellText){
		return driver.findElement(By.xpath(searchDocumentGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/..")).findVisibleElement(By.xpath(searchDocumentGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/.."));
	}

	/*SearchDocumentDialogPage->searchDocumentGrid*/
	public WebElement get_searchDocumentGrid_CellbyOtherInlineCellText_Self(String otherInlineCellText,String targetCellText){
		return driver.findElement(By.xpath(searchDocumentGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']")).findVisibleElement(By.xpath(searchDocumentGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']"));
	}

	/*SearchDocumentDialogPage->searchDocumentGrid*/
	public WebElement get_searchDocumentGrid_CellbyColNameCellText_Self(String colName,String cellText){
		WebElement searchDocumentGrid = driver.findElement(By.xpath(searchDocumentGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../..")).findVisibleElement(By.xpath(searchDocumentGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../.."));
		String idx=searchDocumentGrid.getAttribute("idx");
		List<WebElement> Gridrows = driver.findAll(By.xpath(searchDocumentGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]"));
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

	/*SearchDocumentDialogPage->searchDocumentGrid*/
	public void searchDocumentGrid_selectRowbyCellTitle(String cellTitle){
		WebElement searchDocumentGrid = driver.findElement(By.xpath(searchDocumentGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')]/descendant::div[contains(@title,'"+cellTitle+"')]/../..")).findVisibleElement(By.xpath(searchDocumentGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')]/descendant::div[contains(@title,'"+cellTitle+"')]/../.."));
		searchDocumentGrid.click();
	}

	/*SearchDocumentDialogPage->searchDocumentGrid*/
	public int get_searchDocumentGrid_RowCount(){
		List<WebElement> Gridrows = driver.findAll(By.xpath(searchDocumentGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]"));
		return Gridrows.size();
	}

	/*SearchDocumentDialogPage->okButton*/
	public void okButton_click(){
		WebElement okButton = driver.findElement(By.xpath(okButton_XPath)).findVisibleElement(By.xpath(okButton_XPath));
		okButton.click();
	}

	/*SearchDocumentDialogPage->okButton*/
	public WebElement get_okButton_Self(){
		return driver.findElement(By.xpath(okButton_XPath)).findVisibleElement(By.xpath(okButton_XPath));
	}

	/*SearchDocumentDialogPage->cancelButton*/
	public void cancelButton_click(){
		WebElement cancelButton = driver.findElement(By.xpath(cancelButton_XPath)).findVisibleElement(By.xpath(cancelButton_XPath));
		cancelButton.click();
	}

	/*SearchDocumentDialogPage->cancelButton*/
	public WebElement get_cancelButton_Self(){
		return driver.findElement(By.xpath(cancelButton_XPath)).findVisibleElement(By.xpath(cancelButton_XPath));
	}

}
