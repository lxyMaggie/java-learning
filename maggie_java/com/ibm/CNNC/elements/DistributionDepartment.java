package com.ibm.CNNC.elements;

import java.util.*;
import org.openqa.selenium.*;
import com.selenium.utils.WebDriver;
import com.selenium.utils.WebElement;

/*catalog\widget\dm\distribute\docdistribution\dijit\templates\DistributionDepartment.html*/
public class DistributionDepartment {
	protected WebDriver driver;
	private static final String onAddToList_XPath="//descendant::div[contains(@id,'DistributionDepartment')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"添加文件"+"']";
	private static final String onRemoveFromList_XPath="//descendant::div[contains(@id,'DistributionDepartment')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"删除选中文件"+"']";
	private static final String docDistributionGrid_XPath="//descendant::div[contains(@id,'DistributionDepartment')]/descendant::div[contains(@id,'DataGrid')]";
	private static final String onRemoveDepart_XPath="//descendant::div[contains(@id,'DistributionDepartment')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"删除选中对象"+"']";
	private static final String standard_XPath="//descendant::div[contains(@id,'DistributionDepartment')]/descendant::input[contains(@id,'DistributionDepartment')][contains(@id,'_standard')]";
	private static final String order_XPath="//descendant::div[contains(@id,'DistributionDepartment')]/descendant::input[contains(@id,'DistributionDepartment')][contains(@id,'_order')]";
	private static final String disBtn_XPath="//descendant::div[contains(@id,'DistributionDepartment')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"选择分发部门"+"']";
	private static final String disSel_XPath="//descendant::div[contains(@id,'DistributionDepartment')]/descendant::div";
	private static final String deptDisBtn_XPath="//descendant::div[contains(@id,'DistributionDepartment')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"选择分发部门"+"']";
	private static final String docDistributionToGrid_XPath="//descendant::div[contains(@id,'DistributionDepartment')]/descendant::div[contains(@id,'DataGrid')]";
	private static final String noticeBtn_XPath="//descendant::div[contains(@id,'DistributionDepartment')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"通知"+"']";
	private static final String dDefaultOk_XPath="//descendant::div[contains(@id,'DistributionDepartment')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"分发"+"']";
	private static final String saveAsDraft_XPath="//descendant::div[contains(@id,'DistributionDepartment')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"保存为草稿"+"']";
	private static final String deptDistributeRecord_XPath="//descendant::div[contains(@id,'DistributionDepartment')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"下发"+"']";
	private static final String onCancel_XPath="//descendant::div[contains(@id,'DistributionDepartment')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"重置"+"']";

	//----Constructor Methods Begin----
	public DistributionDepartment(WebDriver driver){
		this.driver=driver;
	}

	/*DistributionDepartment->onClick: onAddToList*/
	public void onAddToList_click(){
		WebElement onAddToList = driver.findElement(By.xpath(onAddToList_XPath)).findVisibleElement(By.xpath(onAddToList_XPath));
		onAddToList.click();
	}

	/*DistributionDepartment->onClick: onAddToList*/
	public WebElement get_onAddToList_Self(){
		return driver.findElement(By.xpath(onAddToList_XPath)).findVisibleElement(By.xpath(onAddToList_XPath));
	}

	/*DistributionDepartment->onClick: onRemoveFromList*/
	public void onRemoveFromList_click(){
		WebElement onRemoveFromList = driver.findElement(By.xpath(onRemoveFromList_XPath)).findVisibleElement(By.xpath(onRemoveFromList_XPath));
		onRemoveFromList.click();
	}

	/*DistributionDepartment->onClick: onRemoveFromList*/
	public WebElement get_onRemoveFromList_Self(){
		return driver.findElement(By.xpath(onRemoveFromList_XPath)).findVisibleElement(By.xpath(onRemoveFromList_XPath));
	}

	/*DistributionDepartment->docDistributionGrid*/
	public void docDistributionGrid_colCaptionClick(String captionName){
		WebElement docDistributionGrid = driver.findElement(By.xpath(docDistributionGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']")).findVisibleElement(By.xpath(docDistributionGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']"));
		docDistributionGrid.click();
	}

	/*DistributionDepartment->docDistributionGrid*/
	public void docDistributionGrid_selectCellbyRowColNumber(int rowNum,int colNum){
		WebElement docDistributionGrid = driver.findElement(By.xpath(docDistributionGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]")).findVisibleElement(By.xpath(docDistributionGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]"));
		docDistributionGrid.click();
	}

	/*DistributionDepartment->docDistributionGrid*/
	public void docDistributionGrid_selectRowbyRowColNumber(int rowNum,int colNum){
		WebElement docDistributionGrid = driver.findElement(By.xpath(docDistributionGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/..")).findVisibleElement(By.xpath(docDistributionGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/.."));
		docDistributionGrid.click();
	}

	/*DistributionDepartment->docDistributionGrid*/
	public void docDistributionGrid_selectRowbyRowNumber(int rowNum){
		WebElement docDistributionGrid = driver.findElement(By.xpath(docDistributionGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr")).findVisibleElement(By.xpath(docDistributionGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr"));
		docDistributionGrid.click();
	}

	/*DistributionDepartment->docDistributionGrid*/
	public void docDistributionGrid_selectCellbyCellText(String cellText){
		WebElement docDistributionGrid = driver.findElement(By.xpath(docDistributionGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']")).findVisibleElement(By.xpath(docDistributionGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']"));
		docDistributionGrid.click();
	}

	/*DistributionDepartment->docDistributionGrid*/
	public void docDistributionGrid_selectRowbyCellText(String cellText){
		WebElement docDistributionGrid = driver.findElement(By.xpath(docDistributionGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/..")).findVisibleElement(By.xpath(docDistributionGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/.."));
		docDistributionGrid.click();
	}

	/*DistributionDepartment->docDistributionGrid*/
	public void docDistributionGrid_selectCellbyOtherInlineCellText(String otherInlineCellText,String targetCellText){
		WebElement docDistributionGrid = driver.findElement(By.xpath(docDistributionGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']")).findVisibleElement(By.xpath(docDistributionGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']"));
		docDistributionGrid.click();
	}

	/*DistributionDepartment->docDistributionGrid*/
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

	/*DistributionDepartment->docDistributionGrid*/
	public WebElement get_docDistributionGrid_colCaption_Self(String captionName){
		return driver.findElement(By.xpath(docDistributionGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']")).findVisibleElement(By.xpath(docDistributionGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']"));
	}

	/*DistributionDepartment->docDistributionGrid*/
	public WebElement get_docDistributionGrid_CellbyRowColNumber_Self(int rowNum,int colNum){
		return driver.findElement(By.xpath(docDistributionGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]")).findVisibleElement(By.xpath(docDistributionGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]"));
	}

	/*DistributionDepartment->docDistributionGrid*/
	public WebElement get_docDistributionGrid_RowbyRowColNumber_Self(int rowNum,int colNum){
		return driver.findElement(By.xpath(docDistributionGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/..")).findVisibleElement(By.xpath(docDistributionGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/.."));
	}

	/*DistributionDepartment->docDistributionGrid*/
	public WebElement get_docDistributionGrid_RowbyRowNumber_Self(int rowNum){
		return driver.findElement(By.xpath(docDistributionGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr")).findVisibleElement(By.xpath(docDistributionGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr"));
	}

	/*DistributionDepartment->docDistributionGrid*/
	public WebElement get_docDistributionGrid_CellbyCellText_Self(String cellText){
		return driver.findElement(By.xpath(docDistributionGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']")).findVisibleElement(By.xpath(docDistributionGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']"));
	}

	/*DistributionDepartment->docDistributionGrid*/
	public WebElement get_docDistributionGrid_RowbyCellText_Self(String cellText){
		return driver.findElement(By.xpath(docDistributionGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/..")).findVisibleElement(By.xpath(docDistributionGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/.."));
	}

	/*DistributionDepartment->docDistributionGrid*/
	public WebElement get_docDistributionGrid_CellbyOtherInlineCellText_Self(String otherInlineCellText,String targetCellText){
		return driver.findElement(By.xpath(docDistributionGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']")).findVisibleElement(By.xpath(docDistributionGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']"));
	}

	/*DistributionDepartment->docDistributionGrid*/
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

	/*DistributionDepartment->onClick: onRemoveDepart*/
	public void onRemoveDepart_click(){
		WebElement onRemoveDepart = driver.findElement(By.xpath(onRemoveDepart_XPath)).findVisibleElement(By.xpath(onRemoveDepart_XPath));
		onRemoveDepart.click();
	}

	/*DistributionDepartment->onClick: onRemoveDepart*/
	public WebElement get_onRemoveDepart_Self(){
		return driver.findElement(By.xpath(onRemoveDepart_XPath)).findVisibleElement(By.xpath(onRemoveDepart_XPath));
	}

	/*DistributionDepartment->standard*/
	public void standard_click(){
		WebElement standard = driver.findElement(By.xpath(standard_XPath)).findVisibleElement(By.xpath(standard_XPath));
			standard.click();
	}

	/*DistributionDepartment->standard*/
	public WebElement get_standard_Self(){
		return driver.findElement(By.xpath(standard_XPath)).findVisibleElement(By.xpath(standard_XPath));
	}

	/*DistributionDepartment->order*/
	public void order_click(){
		WebElement order = driver.findElement(By.xpath(order_XPath)).findVisibleElement(By.xpath(order_XPath));
			order.click();
	}

	/*DistributionDepartment->order*/
	public WebElement get_order_Self(){
		return driver.findElement(By.xpath(order_XPath)).findVisibleElement(By.xpath(order_XPath));
	}

	/*DistributionDepartment->disBtn*/
	public void disBtn_click(){
		WebElement disBtn = driver.findElement(By.xpath(disBtn_XPath)).findVisibleElement(By.xpath(disBtn_XPath));
		disBtn.click();
	}

	/*DistributionDepartment->disBtn*/
	public WebElement get_disBtn_Self(){
		return driver.findElement(By.xpath(disBtn_XPath)).findVisibleElement(By.xpath(disBtn_XPath));
	}

	/*DistributionDepartment->disSel*/
	public void disSel_input(String inputStr){
		WebElement disSel=driver.findElement(By.xpath(disSel_XPath+"/descendant::input[contains(@role,'textbox')]")).findVisibleElement(By.xpath(disSel_XPath+"/descendant::input[contains(@role,'textbox')]"));
		disSel.click();
		disSel.clear();
		disSel.sendKeys(inputStr);
	}

	/*DistributionDepartment->disSel*/
	public void disSel_select(String selectStr){
		WebElement disSel=driver.findElement(By.xpath(disSel_XPath)).findVisibleElement(By.xpath(disSel_XPath));
		disSel.click();
		WebElement comboboxNameArrow =driver.findElement(By.xpath(disSel_XPath+"/descendant::input[contains(@class,'ArrowButton')]")).findVisibleElement(By.xpath(disSel_XPath+"/descendant::input[contains(@class,'ArrowButton')]"));
		comboboxNameArrow.click();
		CommonClass.implicitWait(driver);
		WebElement mySelectItem=driver.findElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']")).findVisibleElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']"));
		mySelectItem.click();
	}

	/*DistributionDepartment->disSel*/
	public WebElement get_disSel_input_Self(){
		return driver.findElement(By.xpath(disSel_XPath+"/descendant::input[contains(@role,'textbox')]")).findVisibleElement(By.xpath(disSel_XPath+"/descendant::input[contains(@role,'textbox')]"));
	}

	/*DistributionDepartment->disSel*/
	public WebElement get_disSel_selectItem_Self(String selectStr){
		WebElement disSel=driver.findElement(By.xpath(disSel_XPath)).findVisibleElement(By.xpath(disSel_XPath));
		disSel.click();
		WebElement comboboxNameArrow =driver.findElement(By.xpath(disSel_XPath+"/descendant::input[contains(@class,'ArrowButton')]")).findVisibleElement(By.xpath(disSel_XPath+"/descendant::input[contains(@class,'ArrowButton')]"));
		comboboxNameArrow.click();
		CommonClass.implicitWait(driver);
		return driver.findElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']")).findVisibleElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']"));
	}

	/*DistributionDepartment->deptDisBtn*/
	public void deptDisBtn_click(){
		WebElement deptDisBtn = driver.findElement(By.xpath(deptDisBtn_XPath)).findVisibleElement(By.xpath(deptDisBtn_XPath));
		deptDisBtn.click();
	}

	/*DistributionDepartment->deptDisBtn*/
	public WebElement get_deptDisBtn_Self(){
		return driver.findElement(By.xpath(deptDisBtn_XPath)).findVisibleElement(By.xpath(deptDisBtn_XPath));
	}

	/*DistributionDepartment->docDistributionToGrid*/
	public void docDistributionToGrid_colCaptionClick(String captionName){
		WebElement docDistributionToGrid = driver.findElement(By.xpath(docDistributionToGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']")).findVisibleElement(By.xpath(docDistributionToGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']"));
		docDistributionToGrid.click();
	}

	/*DistributionDepartment->docDistributionToGrid*/
	public void docDistributionToGrid_selectCellbyRowColNumber(int rowNum,int colNum){
		WebElement docDistributionToGrid = driver.findElement(By.xpath(docDistributionToGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]")).findVisibleElement(By.xpath(docDistributionToGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]"));
		docDistributionToGrid.click();
	}

	/*DistributionDepartment->docDistributionToGrid*/
	public void docDistributionToGrid_selectRowbyRowColNumber(int rowNum,int colNum){
		WebElement docDistributionToGrid = driver.findElement(By.xpath(docDistributionToGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/..")).findVisibleElement(By.xpath(docDistributionToGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/.."));
		docDistributionToGrid.click();
	}

	/*DistributionDepartment->docDistributionToGrid*/
	public void docDistributionToGrid_selectRowbyRowNumber(int rowNum){
		WebElement docDistributionToGrid = driver.findElement(By.xpath(docDistributionToGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr")).findVisibleElement(By.xpath(docDistributionToGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr"));
		docDistributionToGrid.click();
	}

	/*DistributionDepartment->docDistributionToGrid*/
	public void docDistributionToGrid_selectCellbyCellText(String cellText){
		WebElement docDistributionToGrid = driver.findElement(By.xpath(docDistributionToGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']")).findVisibleElement(By.xpath(docDistributionToGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']"));
		docDistributionToGrid.click();
	}

	/*DistributionDepartment->docDistributionToGrid*/
	public void docDistributionToGrid_selectRowbyCellText(String cellText){
		WebElement docDistributionToGrid = driver.findElement(By.xpath(docDistributionToGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/..")).findVisibleElement(By.xpath(docDistributionToGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/.."));
		docDistributionToGrid.click();
	}

	/*DistributionDepartment->docDistributionToGrid*/
	public void docDistributionToGrid_selectCellbyOtherInlineCellText(String otherInlineCellText,String targetCellText){
		WebElement docDistributionToGrid = driver.findElement(By.xpath(docDistributionToGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']")).findVisibleElement(By.xpath(docDistributionToGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']"));
		docDistributionToGrid.click();
	}

	/*DistributionDepartment->docDistributionToGrid*/
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

	/*DistributionDepartment->docDistributionToGrid*/
	public WebElement get_docDistributionToGrid_colCaption_Self(String captionName){
		return driver.findElement(By.xpath(docDistributionToGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']")).findVisibleElement(By.xpath(docDistributionToGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']"));
	}

	/*DistributionDepartment->docDistributionToGrid*/
	public WebElement get_docDistributionToGrid_CellbyRowColNumber_Self(int rowNum,int colNum){
		return driver.findElement(By.xpath(docDistributionToGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]")).findVisibleElement(By.xpath(docDistributionToGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]"));
	}

	/*DistributionDepartment->docDistributionToGrid*/
	public WebElement get_docDistributionToGrid_RowbyRowColNumber_Self(int rowNum,int colNum){
		return driver.findElement(By.xpath(docDistributionToGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/..")).findVisibleElement(By.xpath(docDistributionToGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/.."));
	}

	/*DistributionDepartment->docDistributionToGrid*/
	public WebElement get_docDistributionToGrid_RowbyRowNumber_Self(int rowNum){
		return driver.findElement(By.xpath(docDistributionToGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr")).findVisibleElement(By.xpath(docDistributionToGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr"));
	}

	/*DistributionDepartment->docDistributionToGrid*/
	public WebElement get_docDistributionToGrid_CellbyCellText_Self(String cellText){
		return driver.findElement(By.xpath(docDistributionToGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']")).findVisibleElement(By.xpath(docDistributionToGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']"));
	}

	/*DistributionDepartment->docDistributionToGrid*/
	public WebElement get_docDistributionToGrid_RowbyCellText_Self(String cellText){
		return driver.findElement(By.xpath(docDistributionToGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/..")).findVisibleElement(By.xpath(docDistributionToGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/.."));
	}

	/*DistributionDepartment->docDistributionToGrid*/
	public WebElement get_docDistributionToGrid_CellbyOtherInlineCellText_Self(String otherInlineCellText,String targetCellText){
		return driver.findElement(By.xpath(docDistributionToGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']")).findVisibleElement(By.xpath(docDistributionToGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']"));
	}

	/*DistributionDepartment->docDistributionToGrid*/
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

	/*DistributionDepartment->noticeBtn*/
	public void noticeBtn_click(){
		WebElement noticeBtn = driver.findElement(By.xpath(noticeBtn_XPath)).findVisibleElement(By.xpath(noticeBtn_XPath));
		noticeBtn.click();
	}

	/*DistributionDepartment->noticeBtn*/
	public WebElement get_noticeBtn_Self(){
		return driver.findElement(By.xpath(noticeBtn_XPath)).findVisibleElement(By.xpath(noticeBtn_XPath));
	}

	/*DistributionDepartment->defaultOk*/
	public void dDefaultOk_click(){
		WebElement dDefaultOk = driver.findElement(By.xpath(dDefaultOk_XPath)).findVisibleElement(By.xpath(dDefaultOk_XPath));
		dDefaultOk.click();
	}

	/*DistributionDepartment->defaultOk*/
	public WebElement get_dDefaultOk_Self(){
		return driver.findElement(By.xpath(dDefaultOk_XPath)).findVisibleElement(By.xpath(dDefaultOk_XPath));
	}

	/*DistributionDepartment->saveAsDraft*/
	public void saveAsDraft_click(){
		WebElement saveAsDraft = driver.findElement(By.xpath(saveAsDraft_XPath)).findVisibleElement(By.xpath(saveAsDraft_XPath));
		saveAsDraft.click();
	}

	/*DistributionDepartment->saveAsDraft*/
	public WebElement get_saveAsDraft_Self(){
		return driver.findElement(By.xpath(saveAsDraft_XPath)).findVisibleElement(By.xpath(saveAsDraft_XPath));
	}

	/*DistributionDepartment->deptDistributeRecord*/
	public void deptDistributeRecord_click(){
		WebElement deptDistributeRecord = driver.findElement(By.xpath(deptDistributeRecord_XPath)).findVisibleElement(By.xpath(deptDistributeRecord_XPath));
		deptDistributeRecord.click();
	}

	/*DistributionDepartment->deptDistributeRecord*/
	public WebElement get_deptDistributeRecord_Self(){
		return driver.findElement(By.xpath(deptDistributeRecord_XPath)).findVisibleElement(By.xpath(deptDistributeRecord_XPath));
	}

	/*DistributionDepartment->onClick: onCancel*/
	public void onCancel_click(){
		WebElement onCancel = driver.findElement(By.xpath(onCancel_XPath)).findVisibleElement(By.xpath(onCancel_XPath));
		onCancel.click();
	}

	/*DistributionDepartment->onClick: onCancel*/
	public WebElement get_onCancel_Self(){
		return driver.findElement(By.xpath(onCancel_XPath)).findVisibleElement(By.xpath(onCancel_XPath));
	}

}
