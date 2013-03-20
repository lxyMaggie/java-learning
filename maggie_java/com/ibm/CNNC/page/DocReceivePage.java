package com.ibm.CNNC.page;

import java.util.List;

import org.openqa.selenium.By;

import com.selenium.utils.WebDriver;
import com.selenium.utils.WebElement;

public class DocReceivePage {
	private WebDriver driver;
	private static final String documentReceiveVerifyConfirmButton_XPath="//descendant::div[contains(@id,'DocReceive')]/descendant::span[contains(@id, 'DocumentReceiveVerifyConfirm')]";
	private static final String documentReceiveBatchConfirmButton_XPath="//descendant::div[contains(@id,'DocReceive')]/descendant::span[contains(@id, 'DocumentReceiveBatchConfirm')]";
	private static final String documentReceiveDeleteButton_XPath="//descendant::div[contains(@id,'DocReceive')]/descendant::span[contains(@id, 'DocumentReceiveDelete')]";
	private static final String technologyReviewButton_XPath="//descendant::div[contains(@id,'DocReceive')]/descendant::span[contains(@id, 'TechnologyReview')]";
	private static final String documentDocPropertyButton_XPath="//descendant::div[contains(@id,'DocReceive')]/descendant::span[contains(@id, 'DocumentDocProperty')]";
	private static final String toggleSearchPaneBtnButton_XPath="//descendant::div[contains(@id,'DocReceive')]/descendant::span[contains(@id, 'ToggleSearchPaneBtn')]";
	private static final String fileChineseName_XPath="//descendant::div[contains(@id,'DocReceive')]/descendant::span[normalize-space(text())='文件中文题名']/../../descendant::input[contains(@id,'ValidationTextBox')]";
	private static final String searchButton_XPath="//descendant::div[contains(@id,'DocReceive')]/descendant::span[contains(@id,'Button')][normalize-space(text())='搜索']";
	private static final String selectAllButton_XPath="//descendant::div[contains(@id,'DocReceive')]/descendant::span[contains(@id, 'selectAll')]";
	private static final String docReceiveGrid_XPath="//descendant::div[contains(@id,'DocReceive')]/descendant::div[contains(@id,'EnhancedGrid')]";
	private static final String dialog_Yes_XPath="//descendant::div[contains(@class,'ecm ecmMessageDialog dijitDialog')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='是']";
	private static final String dialog_No_XPath="//descendant::div[contains(@class,'ecm ecmMessageDialog dijitDialog')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='否']";
	private static final String dialog_Ok_XPath="//descendant::div[contains(@class,'ecm ecmMessageDialog dijitDialog')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='确定']";
	private static final String dialog_Message_XPath="//descendant::div[contains(@class,'ecm ecmMessageDialog dijitDialog')]/descendant::div[contains(@class, 'ecmMessageDialogMessageNode')]";

	//----Constructor Methods Begin----
	public DocReceivePage(WebDriver driver){
		this.driver=driver;
	}

	/*DocReceivePage->documentReceiveVerifyConfirmButton*/
	public void documentReceiveVerifyConfirmButton_click(){
		WebElement documentReceiveVerifyConfirmButton = driver.findElement(By.xpath(documentReceiveVerifyConfirmButton_XPath)).findVisibleElement(By.xpath(documentReceiveVerifyConfirmButton_XPath));
		documentReceiveVerifyConfirmButton.click();
	}

	/*DocReceivePage->documentReceiveVerifyConfirmButton*/
	public WebElement get_documentReceiveVerifyConfirmButton_Self(){
		return driver.findElement(By.xpath(documentReceiveVerifyConfirmButton_XPath)).findVisibleElement(By.xpath(documentReceiveVerifyConfirmButton_XPath));
	}

	/*DocReceivePage->documentReceiveBatchConfirmButton*/
	public void documentReceiveBatchConfirmButton_click(){
		WebElement documentReceiveBatchConfirmButton = driver.findElement(By.xpath(documentReceiveBatchConfirmButton_XPath)).findVisibleElement(By.xpath(documentReceiveBatchConfirmButton_XPath));
		documentReceiveBatchConfirmButton.click();
	}

	/*DocReceivePage->documentReceiveBatchConfirmButton*/
	public WebElement get_documentReceiveBatchConfirmButton_Self(){
		return driver.findElement(By.xpath(documentReceiveBatchConfirmButton_XPath)).findVisibleElement(By.xpath(documentReceiveBatchConfirmButton_XPath));
	}

	/*DocReceivePage->documentReceiveDeleteButton*/
	public void documentReceiveDeleteButton_click(){
		WebElement documentReceiveDeleteButton = driver.findElement(By.xpath(documentReceiveDeleteButton_XPath)).findVisibleElement(By.xpath(documentReceiveDeleteButton_XPath));
		documentReceiveDeleteButton.click();
	}

	/*DocReceivePage->documentReceiveDeleteButton*/
	public WebElement get_documentReceiveDeleteButton_Self(){
		return driver.findElement(By.xpath(documentReceiveDeleteButton_XPath)).findVisibleElement(By.xpath(documentReceiveDeleteButton_XPath));
	}

	/*DocReceivePage->technologyReviewButton*/
	public void technologyReviewButton_click(){
		WebElement technologyReviewButton = driver.findElement(By.xpath(technologyReviewButton_XPath)).findVisibleElement(By.xpath(technologyReviewButton_XPath));
		technologyReviewButton.click();
	}

	/*DocReceivePage->technologyReviewButton*/
	public WebElement get_technologyReviewButton_Self(){
		return driver.findElement(By.xpath(technologyReviewButton_XPath)).findVisibleElement(By.xpath(technologyReviewButton_XPath));
	}

	/*DocReceivePage->documentDocPropertyButton*/
	public void documentDocPropertyButton_click(){
		WebElement documentDocPropertyButton = driver.findElement(By.xpath(documentDocPropertyButton_XPath)).findVisibleElement(By.xpath(documentDocPropertyButton_XPath));
		documentDocPropertyButton.click();
	}

	/*DocReceivePage->documentDocPropertyButton*/
	public WebElement get_documentDocPropertyButton_Self(){
		return driver.findElement(By.xpath(documentDocPropertyButton_XPath)).findVisibleElement(By.xpath(documentDocPropertyButton_XPath));
	}

	/*DocReceivePage->toggleSearchPaneBtnButton*/
	public void toggleSearchPaneBtnButton_click(){
		WebElement toggleSearchPaneBtnButton = driver.findElement(By.xpath(toggleSearchPaneBtnButton_XPath)).findVisibleElement(By.xpath(toggleSearchPaneBtnButton_XPath));
		toggleSearchPaneBtnButton.click();
	}

	/*DocReceivePage->toggleSearchPaneBtnButton*/
	public WebElement get_toggleSearchPaneBtnButton_Self(){
		return driver.findElement(By.xpath(toggleSearchPaneBtnButton_XPath)).findVisibleElement(By.xpath(toggleSearchPaneBtnButton_XPath));
	}

	/*DocReceivePage->fileChineseName*/
	public void fileChineseName_input(String inputStr){
		WebElement fileChineseName=driver.findElement(By.xpath(fileChineseName_XPath)).findVisibleElement(By.xpath(fileChineseName_XPath));
		fileChineseName.click();
		fileChineseName.clear();
		fileChineseName.sendKeys(inputStr);
	}

	/*DocReceivePage->fileChineseName*/
	public WebElement get_fileChineseName_Self(){
		return driver.findElement(By.xpath(fileChineseName_XPath)).findVisibleElement(By.xpath(fileChineseName_XPath));
	}

	/*DocReceivePage->searchButton*/
	public void searchButton_click(){
		WebElement searchButton = driver.findElement(By.xpath(searchButton_XPath)).findVisibleElement(By.xpath(searchButton_XPath));
		searchButton.click();
	}

	/*DocReceivePage->searchButton*/
	public WebElement get_searchButton_Self(){
		return driver.findElement(By.xpath(searchButton_XPath)).findVisibleElement(By.xpath(searchButton_XPath));
	}

	/*DocReceivePage->selectAllButton*/
	public void selectAllButton_click(){
		WebElement selectAllButton = driver.findElement(By.xpath(selectAllButton_XPath)).findVisibleElement(By.xpath(selectAllButton_XPath));
		selectAllButton.click();
	}

	/*DocReceivePage->selectAllButton*/
	public WebElement get_selectAllButton_Self(){
		return driver.findElement(By.xpath(selectAllButton_XPath)).findVisibleElement(By.xpath(selectAllButton_XPath));
	}

	/*DocReceivePage->docReceiveGrid*/
	public void docReceiveGrid_colCaptionClick(String captionName){
		WebElement docReceiveGrid = driver.findElement(By.xpath(docReceiveGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']")).findVisibleElement(By.xpath(docReceiveGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']"));
		docReceiveGrid.click();
	}

	/*DocReceivePage->docReceiveGrid*/
	public void docReceiveGrid_selectCellbyRowColNumber(int rowNum,int colNum){
		WebElement docReceiveGrid = driver.findElement(By.xpath(docReceiveGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]")).findVisibleElement(By.xpath(docReceiveGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]"));
		docReceiveGrid.click();
	}

	/*DocReceivePage->docReceiveGrid*/
	public void docReceiveGrid_selectRowbyRowColNumber(int rowNum,int colNum){
		WebElement docReceiveGrid = driver.findElement(By.xpath(docReceiveGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/..")).findVisibleElement(By.xpath(docReceiveGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/.."));
		docReceiveGrid.click();
	}

	/*DocReceivePage->docReceiveGrid*/
	public void docReceiveGrid_selectRowbyRowNumber(int rowNum){
		WebElement docReceiveGrid = driver.findElement(By.xpath(docReceiveGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr")).findVisibleElement(By.xpath(docReceiveGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr"));
		docReceiveGrid.click();
	}

	/*DocReceivePage->docReceiveGrid*/
	public void docReceiveGrid_selectCellbyCellText(String cellText){
		WebElement docReceiveGrid = driver.findElement(By.xpath(docReceiveGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']")).findVisibleElement(By.xpath(docReceiveGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']"));
		docReceiveGrid.click();
	}

	/*DocReceivePage->docReceiveGrid*/
	public void docReceiveGrid_selectRowbyCellText(String cellText){
		WebElement docReceiveGrid = driver.findElement(By.xpath(docReceiveGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/..")).findVisibleElement(By.xpath(docReceiveGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/.."));
		docReceiveGrid.click();
	}

	/*DocReceivePage->docReceiveGrid*/
	public void docReceiveGrid_selectCellbyOtherInlineCellText(String otherInlineCellText,String targetCellText){
		WebElement docReceiveGrid = driver.findElement(By.xpath(docReceiveGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']")).findVisibleElement(By.xpath(docReceiveGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']"));
		docReceiveGrid.click();
	}

	/*DocReceivePage->docReceiveGrid*/
	public void docReceiveGrid_selectCellbyColNameCellText(String colName,String cellText){
		WebElement docReceiveGrid = driver.findElement(By.xpath(docReceiveGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../..")).findVisibleElement(By.xpath(docReceiveGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../.."));
		String idx=docReceiveGrid.getAttribute("idx");
		List<WebElement> Gridrows = driver.findAll(By.xpath(docReceiveGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]"));
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
	
	/*DocReceivePage->docReceiveGrid*/
	public int docReceiveGrid_getRow( ){

		List<WebElement> Gridrows = driver.findAll(By.xpath(docReceiveGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]"));
		
		return Gridrows.size();

	}

	/*DocReceivePage->docReceiveGrid*/
	public WebElement get_docReceiveGrid_colCaption_Self(String captionName){
		return driver.findElement(By.xpath(docReceiveGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']")).findVisibleElement(By.xpath(docReceiveGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']"));
	}

	/*DocReceivePage->docReceiveGrid*/
	public WebElement get_docReceiveGrid_CellbyRowColNumber_Self(int rowNum,int colNum){
		return driver.findElement(By.xpath(docReceiveGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]")).findVisibleElement(By.xpath(docReceiveGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]"));
	}

	/*DocReceivePage->docReceiveGrid*/
	public WebElement get_docReceiveGrid_RowbyRowColNumber_Self(int rowNum,int colNum){
		return driver.findElement(By.xpath(docReceiveGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/..")).findVisibleElement(By.xpath(docReceiveGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/.."));
	}

	/*DocReceivePage->docReceiveGrid*/
	public WebElement get_docReceiveGrid_RowbyRowNumber_Self(int rowNum){
		return driver.findElement(By.xpath(docReceiveGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr")).findVisibleElement(By.xpath(docReceiveGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr"));
	}

	/*DocReceivePage->docReceiveGrid*/
	public WebElement get_docReceiveGrid_CellbyCellText_Self(String cellText){
		return driver.findElement(By.xpath(docReceiveGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']")).findVisibleElement(By.xpath(docReceiveGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']"));
	}

	/*DocReceivePage->docReceiveGrid*/
	public WebElement get_docReceiveGrid_RowbyCellText_Self(String cellText){
		return driver.findElement(By.xpath(docReceiveGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/..")).findVisibleElement(By.xpath(docReceiveGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/.."));
	}

	/*DocReceivePage->docReceiveGrid*/
	public WebElement get_docReceiveGrid_CellbyOtherInlineCellText_Self(String otherInlineCellText,String targetCellText){
		return driver.findElement(By.xpath(docReceiveGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']")).findVisibleElement(By.xpath(docReceiveGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']"));
	}

	/*DocReceivePage->docReceiveGrid*/
	public WebElement get_docReceiveGrid_CellbyColNameCellText_Self(String colName,String cellText){
		WebElement docReceiveGrid = driver.findElement(By.xpath(docReceiveGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../..")).findVisibleElement(By.xpath(docReceiveGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../.."));
		String idx=docReceiveGrid.getAttribute("idx");
		List<WebElement> Gridrows = driver.findAll(By.xpath(docReceiveGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]"));
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

	/*DocReceivePage->docReceiveGrid*/
	public void docReceiveGrid_selectRowbyCellTitle(String cellTitle){
		WebElement docReceiveGrid = driver.findElement(By.xpath(docReceiveGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')]/descendant::div[contains(@title,'"+cellTitle+"')]/../..")).findVisibleElement(By.xpath(docReceiveGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')]/descendant::div[contains(@title,'"+cellTitle+"')]/../.."));
		docReceiveGrid.click();
	}

	/*DocReceivePage->docReceiveGrid*/
	public int get_docReceiveGrid_RowCount(){
		List<WebElement> Gridrows = driver.findAll(By.xpath(docReceiveGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]"));
		return Gridrows.size();
	}

	/*DocReceivePage->dialog_Yes*/
	public void dialog_Yes_Click() {
		WebElement dialog_Yes = driver.findElement(By.xpath(dialog_Yes_XPath)).findVisibleElement(By.xpath(dialog_Yes_XPath));
		dialog_Yes.click();
	}

	/*DocReceivePage->dialog_No*/
	public void dialog_No_Click() {
		WebElement dialog_No = driver.findElement(By.xpath(dialog_No_XPath)).findVisibleElement(By.xpath(dialog_No_XPath));
		dialog_No.click();
	}

	/*DocReceivePage->dialog_Ok*/
	public void dialog_Ok_Click() {
		WebElement dialog_Ok = driver.findElement(By.xpath(dialog_Ok_XPath)).findVisibleElement(By.xpath(dialog_Ok_XPath));
		dialog_Ok.click();
	}

	/*DocReceivePage->dialog_Message*/
	public String get_dialog_Message_Text() {
		return driver.findElement(By.xpath(dialog_Message_XPath)).findVisibleElement(By.xpath(dialog_Message_XPath)).getText();
	}

}
