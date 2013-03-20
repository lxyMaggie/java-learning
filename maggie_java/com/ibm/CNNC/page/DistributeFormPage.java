package com.ibm.CNNC.page;

import java.util.List;

import org.openqa.selenium.By;

import com.ibm.CNNC.elements.CommonClass;
import com.selenium.utils.WebDriver;
import com.selenium.utils.WebElement;

public class DistributeFormPage {
	private WebDriver driver;
	private static final String addDocumentButton_XPath="//descendant::div[contains(@id,'DistributeForm')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='添加文件']";
	private static final String deleteDocumentButton_XPath="//descendant::div[contains(@id,'DistributeForm')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='删除选中文件']";
	private static final String deleteDepartmentButton_XPath="//descendant::div[contains(@id,'DistributeForm')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='删除选中对象']";
	private static final String standardDistributionRadio_XPath="//descendant::div[contains(@id,'DistributeForm')]/descendant::div[contains(@id, 'standard')]";
	private static final String standardDistributionSelect_XPath="//descendant::div[contains(@id,'DistributeForm')]/descendant::div[contains(@id,'FilteringSelect')]";
	private static final String orderDistributionRadio_XPath="//descendant::div[contains(@id,'DistributeForm')]/descendant::div[contains(@id, 'order')]";
	private static final String orderDistribution_XPath="//descendant::div[contains(@id,'DistributeForm')]/descendant::label[contains(@class,'radioButton')][normalize-space(text())='指令分发']";
	private static final String orderDistributionSelectButton_XPath="//descendant::div[contains(@id,'DistributeForm')]/descendant::span[contains(@id,'Button')][normalize-space(text())='选择分发对象']";
	private static final String upArrowButton_XPath="//descendant::div[contains(@id,'DistributeForm')]/descendant::span[contains(@class, 'upArrow')]/../../..";
	private static final String downArrowButton_XPath="//descendant::div[contains(@id,'DistributeForm')]/descendant::span[contains(@class, 'downArrow')]/../../..";
	private static final String distributeButton_XPath="//descendant::div[contains(@id,'DistributeForm')]/descendant::span[contains(@id,'Button')][normalize-space(text())='分发']";
	private static final String saveAsButton_XPath="//descendant::div[contains(@id,'DistributeForm')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='保存为草稿']";
	private static final String distributeAndPrintButton_XPath="//descendant::div[contains(@id,'DistributeForm')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='分发并打印']";
	private static final String documentListGrid_XPath="//descendant::div[contains(@id,'DistributeForm')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='添加文件']/../../../descendant::div[contains(@id,'DataGrid')]";
	private static final String departmentListGrid_XPath="//descendant::div[contains(@id,'DistributeForm')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='分发']/../../preceding-sibling::div[contains(@id,'ContentPane')]/descendant::div[contains(@id,'DataGrid')]";
	private static final String dialog_Ok_XPath="//descendant::div[contains(@class,'ecm ecmMessageDialog dijitDialog')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='确定']";
	private static final String dialog_Message_XPath="//descendant::div[contains(@class,'ecm ecmMessageDialog dijitDialog')]/descendant::div[contains(@class, 'ecmMessageDialogMessageNode')]";
	private static final String DepartmentSelectImg_XPath="//descendant::div[contains(@id,'DepartmentTree')]/descendant::span[normalize-space(text())='中核核电运行管理有限公司']/../../descendant::img[contains(@class,'dijitTree')]";
	private static final String DepartmentRowSelect_XPath="//descendant::div[contains(@class,'Dialog')]/descendant::div[contains(@id,'dijit_layout_ContentPane')]/descendant::div[contains(@id,'TreeNode')]";
	private static final String DepartmentRowSelectButton_XPath="//descendant::div[contains(@class,'Dialog')]/descendant::div[contains(@id,'dijit_layout_ContentPane')]/descendant::span[contains(@id,'dijit_form_Button')]/descendant::span[normalize-space(text())='>']";
	private static final String DepartmentRowSelectConfirm_XPath="//descendant::div[contains(@id,'DialogButton')]/descendant::span[contains(@id,'dijit_form_Button')]/descendant::span[normalize-space(text())='是']";
	private static final String DistributeRowNum_XPath="//descendant::div[contains(@id,'DistributeForm')]/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@id,'grid_View')]/descendant::div[contains(@class,'GridRow')]";
	//----Constructor Methods Begin----
	public DistributeFormPage(WebDriver driver){
		this.driver=driver;
	}
	public int get_documentListGrid_RowCount(){
		List<WebElement> Gridrows = driver.findAll(By.xpath(DistributeRowNum_XPath));
		return Gridrows.size();
	}
	public int get_documentListGrid_RowContent(){
		List<WebElement> Gridrows = driver.findAll(By.xpath(DistributeRowNum_XPath));
		for(WebElement w: Gridrows){
			System.out.println( w.getText().trim());
		}
		return Gridrows.size();
	}
	public void DialogDepartmentSelect_click(String selectStr){
		WebElement DepartmentSelect = driver.findElement(By.xpath(DepartmentSelectImg_XPath)).findVisibleElement(By.xpath(DepartmentSelectImg_XPath));
		DepartmentSelect.click();
		WebElement DepartmentRowSelect = driver.findElement(By.xpath(DepartmentRowSelect_XPath+"/descendant::span[normalize-space(text())='"+selectStr+"']")).findVisibleElement(By.xpath(DepartmentRowSelect_XPath+"/descendant::span[normalize-space(text())='"+selectStr+"']"));
		DepartmentRowSelect.click();
		CommonClass.implicitWait(driver);
		WebElement DepartmentRowSelectButton = driver.findElement(By.xpath(DepartmentRowSelectButton_XPath)).findVisibleElement(By.xpath(DepartmentRowSelectButton_XPath));
		DepartmentRowSelectButton.click();
		WebElement DepartmentRowSelectConfirm = driver.findElement(By.xpath(DepartmentRowSelectConfirm_XPath)).findVisibleElement(By.xpath(DepartmentRowSelectConfirm_XPath));
		DepartmentRowSelectConfirm.click();
	}
	public void orderDistribution_click(){
		WebElement orderDistributionRadio = driver.findElement(By.xpath(orderDistribution_XPath)).findVisibleElement(By.xpath(orderDistribution_XPath));
		orderDistributionRadio.click();
	}

	/*DistributeFormPage->standardDistributionRadio*/
	public WebElement get_orderDistribution_Self(){
		return driver.findElement(By.xpath(orderDistribution_XPath)).findVisibleElement(By.xpath(orderDistribution_XPath));
	}
	/*DistributeFormPage->addDocumentButton*/
	public void addDocumentButton_click(){
		WebElement addDocumentButton = driver.findElement(By.xpath(addDocumentButton_XPath)).findVisibleElement(By.xpath(addDocumentButton_XPath));
		addDocumentButton.click();
	}

	/*DistributeFormPage->addDocumentButton*/
	public WebElement get_addDocumentButton_Self(){
		return driver.findElement(By.xpath(addDocumentButton_XPath)).findVisibleElement(By.xpath(addDocumentButton_XPath));
	}

	/*DistributeFormPage->deleteDocumentButton*/
	public void deleteDocumentButton_click(){
		WebElement deleteDocumentButton = driver.findElement(By.xpath(deleteDocumentButton_XPath)).findVisibleElement(By.xpath(deleteDocumentButton_XPath));
		deleteDocumentButton.click();
	}

	/*DistributeFormPage->deleteDocumentButton*/
	public WebElement get_deleteDocumentButton_Self(){
		return driver.findElement(By.xpath(deleteDocumentButton_XPath)).findVisibleElement(By.xpath(deleteDocumentButton_XPath));
	}

	/*DistributeFormPage->deleteDepartmentButton*/
	public void deleteDepartmentButton_click(){
		WebElement deleteDepartmentButton = driver.findElement(By.xpath(deleteDepartmentButton_XPath)).findVisibleElement(By.xpath(deleteDepartmentButton_XPath));
		deleteDepartmentButton.click();
	}

	/*DistributeFormPage->deleteDepartmentButton*/
	public WebElement get_deleteDepartmentButton_Self(){
		return driver.findElement(By.xpath(deleteDepartmentButton_XPath)).findVisibleElement(By.xpath(deleteDepartmentButton_XPath));
	}

	/*DistributeFormPage->standardDistributionRadio*/
	public void standardDistributionRadio_click(){
		WebElement standardDistributionRadio = driver.findElement(By.xpath(standardDistributionRadio_XPath)).findVisibleElement(By.xpath(standardDistributionRadio_XPath));
		standardDistributionRadio.click();
	}

	/*DistributeFormPage->standardDistributionRadio*/
	public WebElement get_standardDistributionRadio_Self(){
		return driver.findElement(By.xpath(standardDistributionRadio_XPath)).findVisibleElement(By.xpath(standardDistributionRadio_XPath));
	}

	/*DistributeFormPage->standardDistributionSelect*/
	public void standardDistributionSelect_input(String inputStr){
		WebElement standardDistributionSelect=driver.findElement(By.xpath(standardDistributionSelect_XPath+"/descendant::input[contains(@role,'textbox')]")).findVisibleElement(By.xpath(standardDistributionSelect_XPath+"/descendant::input[contains(@role,'textbox')]"));
		standardDistributionSelect.click();
		standardDistributionSelect.clear();
		standardDistributionSelect.sendKeys(inputStr);
	}

	/*DistributeFormPage->standardDistributionSelect*/
	public void standardDistributionSelect_select(String selectStr){
		WebElement standardDistributionSelect=driver.findElement(By.xpath(standardDistributionSelect_XPath)).findVisibleElement(By.xpath(standardDistributionSelect_XPath));
		standardDistributionSelect.click();
		WebElement comboboxNameArrow =driver.findElement(By.xpath(standardDistributionSelect_XPath+"/descendant::input[contains(@class,'ArrowButton')]")).findVisibleElement(By.xpath(standardDistributionSelect_XPath+"/descendant::input[contains(@class,'ArrowButton')]"));
		comboboxNameArrow.click();
		CommonClass.implicitWait(driver);
		WebElement mySelectItem=driver.findElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']")).findVisibleElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']"));
		mySelectItem.click();
	}

	/*DistributeFormPage->standardDistributionSelect*/
	public WebElement get_standardDistributionSelect_input_Self(){
		return driver.findElement(By.xpath(standardDistributionSelect_XPath+"/descendant::input[contains(@role,'textbox')]")).findVisibleElement(By.xpath(standardDistributionSelect_XPath+"/descendant::input[contains(@role,'textbox')]"));
	}

	/*DistributeFormPage->orderDistributionRadio*/
	public void orderDistributionRadio_click(){
		WebElement orderDistributionRadio = driver.findElement(By.xpath(orderDistributionRadio_XPath)).findVisibleElement(By.xpath(orderDistributionRadio_XPath));
		orderDistributionRadio.click();
	}

	/*DistributeFormPage->orderDistributionRadio*/
	public WebElement get_orderDistributionRadio_Self(){
		return driver.findElement(By.xpath(orderDistributionRadio_XPath)).findVisibleElement(By.xpath(orderDistributionRadio_XPath));
	}

	/*DistributeFormPage->orderDistributionSelectButton*/
	public void orderDistributionSelectButton_click(){
		WebElement orderDistributionSelectButton = driver.findElement(By.xpath(orderDistributionSelectButton_XPath)).findVisibleElement(By.xpath(orderDistributionSelectButton_XPath));
		orderDistributionSelectButton.click();
	}

	/*DistributeFormPage->orderDistributionSelectButton*/
	public WebElement get_orderDistributionSelectButton_Self(){
		return driver.findElement(By.xpath(orderDistributionSelectButton_XPath)).findVisibleElement(By.xpath(orderDistributionSelectButton_XPath));
	}

	/*DistributeFormPage->upArrowButton*/
	public void upArrowButton_click(){
		WebElement upArrowButton = driver.findElement(By.xpath(upArrowButton_XPath)).findVisibleElement(By.xpath(upArrowButton_XPath));
		upArrowButton.click();
	}

	/*DistributeFormPage->upArrowButton*/
	public WebElement get_upArrowButton_Self(){
		return driver.findElement(By.xpath(upArrowButton_XPath)).findVisibleElement(By.xpath(upArrowButton_XPath));
	}

	/*DistributeFormPage->downArrowButton*/
	public void downArrowButton_click(){
		WebElement downArrowButton = driver.findElement(By.xpath(downArrowButton_XPath)).findVisibleElement(By.xpath(downArrowButton_XPath));
		downArrowButton.click();
	}

	/*DistributeFormPage->downArrowButton*/
	public WebElement get_downArrowButton_Self(){
		return driver.findElement(By.xpath(downArrowButton_XPath)).findVisibleElement(By.xpath(downArrowButton_XPath));
	}

	/*DistributeFormPage->distributeButton*/
	public void distributeButton_click(){
		WebElement distributeButton = driver.findElement(By.xpath(distributeButton_XPath)).findVisibleElement(By.xpath(distributeButton_XPath));
		distributeButton.click();
	}

	/*DistributeFormPage->distributeButton*/
	public WebElement get_distributeButton_Self(){
		return driver.findElement(By.xpath(distributeButton_XPath)).findVisibleElement(By.xpath(distributeButton_XPath));
	}

	/*DistributeFormPage->saveAsButton*/
	public void saveAsButton_click(){
		WebElement saveAsButton = driver.findElement(By.xpath(saveAsButton_XPath)).findVisibleElement(By.xpath(saveAsButton_XPath));
		saveAsButton.click();
	}

	/*DistributeFormPage->saveAsButton*/
	public WebElement get_saveAsButton_Self(){
		return driver.findElement(By.xpath(saveAsButton_XPath)).findVisibleElement(By.xpath(saveAsButton_XPath));
	}

	/*DistributeFormPage->distributeAndPrintButton*/
	public void distributeAndPrintButton_click(){
		WebElement distributeAndPrintButton = driver.findElement(By.xpath(distributeAndPrintButton_XPath)).findVisibleElement(By.xpath(distributeAndPrintButton_XPath));
		distributeAndPrintButton.click();
	}

	/*DistributeFormPage->distributeAndPrintButton*/
	public WebElement get_distributeAndPrintButton_Self(){
		return driver.findElement(By.xpath(distributeAndPrintButton_XPath)).findVisibleElement(By.xpath(distributeAndPrintButton_XPath));
	}

	/*DistributeFormPage->documentListGrid*/
	public void documentListGrid_colCaptionClick(String captionName){
		WebElement documentListGrid = driver.findElement(By.xpath(documentListGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']")).findVisibleElement(By.xpath(documentListGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']"));
		documentListGrid.click();
	}

	/*DistributeFormPage->documentListGrid*/
	public void documentListGrid_selectCellbyRowColNumber(int rowNum,int colNum){
		WebElement documentListGrid = driver.findElement(By.xpath(documentListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]")).findVisibleElement(By.xpath(documentListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]"));
		documentListGrid.click();
	}

	/*DistributeFormPage->documentListGrid*/
	public void documentListGrid_selectRowbyRowColNumber(int rowNum,int colNum){
		WebElement documentListGrid = driver.findElement(By.xpath(documentListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/..")).findVisibleElement(By.xpath(documentListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/.."));
		documentListGrid.click();
	}

	/*DistributeFormPage->documentListGrid*/
	public void documentListGrid_selectRowbyRowNumber(int rowNum){
		WebElement documentListGrid = driver.findElement(By.xpath(documentListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr")).findVisibleElement(By.xpath(documentListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr"));
		documentListGrid.click();
	}

	/*DistributeFormPage->documentListGrid*/
	public void documentListGrid_selectCellbyCellText(String cellText){
		WebElement documentListGrid = driver.findElement(By.xpath(documentListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']")).findVisibleElement(By.xpath(documentListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']"));
		documentListGrid.click();
	}

	/*DistributeFormPage->documentListGrid*/
	public void documentListGrid_selectRowbyCellText(String cellText){
		WebElement documentListGrid = driver.findElement(By.xpath(documentListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/..")).findVisibleElement(By.xpath(documentListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/.."));
		documentListGrid.click();
	}

	/*DistributeFormPage->documentListGrid*/
	public void documentListGrid_selectCellbyOtherInlineCellText(String otherInlineCellText,String targetCellText){
		WebElement documentListGrid = driver.findElement(By.xpath(documentListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']")).findVisibleElement(By.xpath(documentListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']"));
		documentListGrid.click();
	}

	/*DistributeFormPage->documentListGrid*/
	public void documentListGrid_selectCellbyColNameCellText(String colName,String cellText){
		WebElement documentListGrid = driver.findElement(By.xpath(documentListGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../..")).findVisibleElement(By.xpath(documentListGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../.."));
		String idx=documentListGrid.getAttribute("idx");
		List<WebElement> Gridrows = driver.findAll(By.xpath(documentListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]"));
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
	
	/*DistributeFormPage->documentListGrid*/
	public int documentListGrid_getRow( ){

		List<WebElement> Gridrows = driver.findAll(By.xpath(documentListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]"));
		
		return Gridrows.size();

	}

	/*DistributeFormPage->documentListGrid*/
	public WebElement get_documentListGrid_colCaption_Self(String captionName){
		return driver.findElement(By.xpath(documentListGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']")).findVisibleElement(By.xpath(documentListGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']"));
	}

	/*DistributeFormPage->documentListGrid*/
	public WebElement get_documentListGrid_CellbyRowColNumber_Self(int rowNum,int colNum){
		return driver.findElement(By.xpath(documentListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]")).findVisibleElement(By.xpath(documentListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]"));
	}

	/*DistributeFormPage->documentListGrid*/
	public WebElement get_documentListGrid_RowbyRowColNumber_Self(int rowNum,int colNum){
		return driver.findElement(By.xpath(documentListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/..")).findVisibleElement(By.xpath(documentListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/.."));
	}

	/*DistributeFormPage->documentListGrid*/
	public WebElement get_documentListGrid_RowbyRowNumber_Self(int rowNum){
		return driver.findElement(By.xpath(documentListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr")).findVisibleElement(By.xpath(documentListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr"));
	}

	/*DistributeFormPage->documentListGrid*/
	public WebElement get_documentListGrid_CellbyCellText_Self(String cellText){
		return driver.findElement(By.xpath(documentListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']")).findVisibleElement(By.xpath(documentListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']"));
	}

	/*DistributeFormPage->documentListGrid*/
	public WebElement get_documentListGrid_RowbyCellText_Self(String cellText){
		return driver.findElement(By.xpath(documentListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/..")).findVisibleElement(By.xpath(documentListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/.."));
	}

	/*DistributeFormPage->documentListGrid*/
	public WebElement get_documentListGrid_CellbyOtherInlineCellText_Self(String otherInlineCellText,String targetCellText){
		return driver.findElement(By.xpath(documentListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']")).findVisibleElement(By.xpath(documentListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']"));
	}

	/*DistributeFormPage->documentListGrid*/
	public WebElement get_documentListGrid_CellbyColNameCellText_Self(String colName,String cellText){
		WebElement documentListGrid = driver.findElement(By.xpath(documentListGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../..")).findVisibleElement(By.xpath(documentListGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../.."));
		String idx=documentListGrid.getAttribute("idx");
		List<WebElement> Gridrows = driver.findAll(By.xpath(documentListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]"));
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

	/*DistributeFormPage->documentListGrid*/
	public void documentListGrid_selectRowbyCellTitle(String cellTitle){
		WebElement documentListGrid = driver.findElement(By.xpath(documentListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')]/descendant::div[contains(@title,'"+cellTitle+"')]/../..")).findVisibleElement(By.xpath(documentListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')]/descendant::div[contains(@title,'"+cellTitle+"')]/../.."));
		documentListGrid.click();
	}

	/*DistributeFormPage->documentListGrid*/
	

	/*DistributeFormPage->departmentListGrid*/
	public void departmentListGrid_colCaptionClick(String captionName){
		WebElement departmentListGrid = driver.findElement(By.xpath(departmentListGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']")).findVisibleElement(By.xpath(departmentListGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']"));
		departmentListGrid.click();
	}

	/*DistributeFormPage->departmentListGrid*/
	public void departmentListGrid_selectCellbyRowColNumber(int rowNum,int colNum){
		WebElement departmentListGrid = driver.findElement(By.xpath(departmentListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]")).findVisibleElement(By.xpath(departmentListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]"));
		departmentListGrid.click();
	}

	/*DistributeFormPage->departmentListGrid*/
	public void departmentListGrid_selectRowbyRowColNumber(int rowNum,int colNum){
		WebElement departmentListGrid = driver.findElement(By.xpath(departmentListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/..")).findVisibleElement(By.xpath(departmentListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/.."));
		departmentListGrid.click();
	}

	/*DistributeFormPage->departmentListGrid*/
	public void departmentListGrid_selectRowbyRowNumber(int rowNum){
		WebElement departmentListGrid = driver.findElement(By.xpath(departmentListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr")).findVisibleElement(By.xpath(departmentListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr"));
		departmentListGrid.click();
	}

	/*DistributeFormPage->departmentListGrid*/
	public void departmentListGrid_selectCellbyCellText(String cellText){
		WebElement departmentListGrid = driver.findElement(By.xpath(departmentListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']")).findVisibleElement(By.xpath(departmentListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']"));
		departmentListGrid.click();
	}

	/*DistributeFormPage->departmentListGrid*/
	public void departmentListGrid_selectRowbyCellText(String cellText){
		WebElement departmentListGrid = driver.findElement(By.xpath(departmentListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/..")).findVisibleElement(By.xpath(departmentListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/.."));
		departmentListGrid.click();
	}

	/*DistributeFormPage->departmentListGrid*/
	public void departmentListGrid_selectCellbyOtherInlineCellText(String otherInlineCellText,String targetCellText){
		WebElement departmentListGrid = driver.findElement(By.xpath(departmentListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']")).findVisibleElement(By.xpath(departmentListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']"));
		departmentListGrid.click();
	}

	/*DistributeFormPage->departmentListGrid*/
	public void departmentListGrid_selectCellbyColNameCellText(String colName,String cellText){
		WebElement departmentListGrid = driver.findElement(By.xpath(departmentListGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../..")).findVisibleElement(By.xpath(departmentListGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../.."));
		String idx=departmentListGrid.getAttribute("idx");
		List<WebElement> Gridrows = driver.findAll(By.xpath(departmentListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]"));
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
	
	/*DistributeFormPage->departmentListGrid*/
	public int departmentListGrid_getRow( ){

		List<WebElement> Gridrows = driver.findAll(By.xpath(departmentListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]"));
		
		return Gridrows.size();

	}

	/*DistributeFormPage->departmentListGrid*/
	public WebElement get_departmentListGrid_colCaption_Self(String captionName){
		return driver.findElement(By.xpath(departmentListGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']")).findVisibleElement(By.xpath(departmentListGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']"));
	}

	/*DistributeFormPage->departmentListGrid*/
	public WebElement get_departmentListGrid_CellbyRowColNumber_Self(int rowNum,int colNum){
		return driver.findElement(By.xpath(departmentListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]")).findVisibleElement(By.xpath(departmentListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]"));
	}

	/*DistributeFormPage->departmentListGrid*/
	public WebElement get_departmentListGrid_RowbyRowColNumber_Self(int rowNum,int colNum){
		return driver.findElement(By.xpath(departmentListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/..")).findVisibleElement(By.xpath(departmentListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/.."));
	}

	/*DistributeFormPage->departmentListGrid*/
	public WebElement get_departmentListGrid_RowbyRowNumber_Self(int rowNum){
		return driver.findElement(By.xpath(departmentListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr")).findVisibleElement(By.xpath(departmentListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr"));
	}

	/*DistributeFormPage->departmentListGrid*/
	public WebElement get_departmentListGrid_CellbyCellText_Self(String cellText){
		return driver.findElement(By.xpath(departmentListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']")).findVisibleElement(By.xpath(departmentListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']"));
	}

	/*DistributeFormPage->departmentListGrid*/
	public WebElement get_departmentListGrid_RowbyCellText_Self(String cellText){
		return driver.findElement(By.xpath(departmentListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/..")).findVisibleElement(By.xpath(departmentListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/.."));
	}

	/*DistributeFormPage->departmentListGrid*/
	public WebElement get_departmentListGrid_CellbyOtherInlineCellText_Self(String otherInlineCellText,String targetCellText){
		return driver.findElement(By.xpath(departmentListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']")).findVisibleElement(By.xpath(departmentListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']"));
	}

	/*DistributeFormPage->departmentListGrid*/
	public WebElement get_departmentListGrid_CellbyColNameCellText_Self(String colName,String cellText){
		WebElement departmentListGrid = driver.findElement(By.xpath(departmentListGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../..")).findVisibleElement(By.xpath(departmentListGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../.."));
		String idx=departmentListGrid.getAttribute("idx");
		List<WebElement> Gridrows = driver.findAll(By.xpath(departmentListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]"));
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

	/*DistributeFormPage->departmentListGrid*/
	public void departmentListGrid_selectRowbyCellTitle(String cellTitle){
		WebElement departmentListGrid = driver.findElement(By.xpath(departmentListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')]/descendant::div[contains(@title,'"+cellTitle+"')]/../..")).findVisibleElement(By.xpath(departmentListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')]/descendant::div[contains(@title,'"+cellTitle+"')]/../.."));
		departmentListGrid.click();
	}

	/*DistributeFormPage->departmentListGrid*/
	public int get_departmentListGrid_RowCount(){
		List<WebElement> Gridrows = driver.findAll(By.xpath(departmentListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]"));
		return Gridrows.size();
	}

	/*DistributeFormPage->dialog_Ok*/
	public void dialog_Ok_Click() {
		WebElement dialog_Ok = driver.findElement(By.xpath(dialog_Ok_XPath)).findVisibleElement(By.xpath(dialog_Ok_XPath));
		dialog_Ok.click();
	}

	/*DistributeFormPage->dialog_Message*/
	public String get_dialog_Message_Text() {
		return driver.findElement(By.xpath(dialog_Message_XPath)).findVisibleElement(By.xpath(dialog_Message_XPath)).getText();
	}

}
