package com.ibm.CNNC.elements;

import java.util.*;
import org.openqa.selenium.*;
import com.selenium.utils.WebDriver;
import com.selenium.utils.WebElement;

/*catalog\widget\dm\common\batchimport\templates\BatchImport.html*/
public class BatchImport {
	protected WebDriver driver;
	private static final String typeselect_XPath="//descendant::div[contains(@id,'BatchImport')]/descendant::span[normalize-space(text())='选择导入类型']/../../descendant::div[contains(@id,'widget_dijit_form_FilteringSelect')]";
	private static final String documentTemplate_XPath="//descendant::div[contains(@id,'BatchImport')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"下载模版"+"']";
	private static final String deptselect_XPath="//descendant::div[contains(@id,'BatchImport')]/descendant::span[normalize-space(text())='选择导入库']/../../descendant::div[contains(@id,'widget_dijit_form_FilteringSelect')]";
	private static final String importButton_XPath="//descendant::div[contains(@id,'BatchImport')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"导入"+"']";
	private static final String downloadResult_XPath="//descendant::div[contains(@id,'BatchImport')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"导入结果下载"+"']";
	private static final String resultGrid_XPath="//descendant::div[contains(@id,'BatchImport')]/descendant::div[contains(@id,'DataGrid')]";
	private static final String tip_XPath="//descendant::div[contains(@id,'BatchImport')]/descendant::input";

	//----Constructor Methods Begin----
	public BatchImport(WebDriver driver){
		this.driver=driver;
	}

	/*BatchImport->typeselect*/
	public void typeselect_input(String inputStr){
		WebElement typeselect=driver.findElement(By.xpath(typeselect_XPath+"/descendant::input[contains(@role,'textbox')]")).findVisibleElement(By.xpath(typeselect_XPath+"/descendant::input[contains(@role,'textbox')]"));
		typeselect.click();
		typeselect.clear();
		typeselect.sendKeys(inputStr);
	}

	/*BatchImport->typeselect*/
	public void typeselect_select(String selectStr){
		WebElement typeselect=driver.findElement(By.xpath(typeselect_XPath)).findVisibleElement(By.xpath(typeselect_XPath));
		typeselect.click();
		WebElement comboboxNameArrow =driver.findElement(By.xpath(typeselect_XPath+"/descendant::input[contains(@class,'ArrowButton')]")).findVisibleElement(By.xpath(typeselect_XPath+"/descendant::input[contains(@class,'ArrowButton')]"));
		comboboxNameArrow.click();
		CommonClass.implicitWait(driver);
		WebElement mySelectItem=driver.findElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']")).findVisibleElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']"));
		mySelectItem.click();
	}

	/*BatchImport->typeselect*/
	public WebElement get_typeselect_input_Self(){
		return driver.findElement(By.xpath(typeselect_XPath+"/descendant::input[contains(@role,'textbox')]")).findVisibleElement(By.xpath(typeselect_XPath+"/descendant::input[contains(@role,'textbox')]"));
	}

	/*BatchImport->typeselect*/
	public WebElement get_typeselect_selectItem_Self(String selectStr){
		WebElement typeselect=driver.findElement(By.xpath(typeselect_XPath)).findVisibleElement(By.xpath(typeselect_XPath));
		typeselect.click();
		WebElement comboboxNameArrow =driver.findElement(By.xpath(typeselect_XPath+"/descendant::input[contains(@class,'ArrowButton')]")).findVisibleElement(By.xpath(typeselect_XPath+"/descendant::input[contains(@class,'ArrowButton')]"));
		comboboxNameArrow.click();
		CommonClass.implicitWait(driver);
		return driver.findElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']")).findVisibleElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']"));
	}

	/*BatchImport->documentTemplate*/
	public void documentTemplate_click(){
		WebElement documentTemplate = driver.findElement(By.xpath(documentTemplate_XPath)).findVisibleElement(By.xpath(documentTemplate_XPath));
		documentTemplate.click();
	}

	/*BatchImport->documentTemplate*/
	public WebElement get_documentTemplate_Self(){
		return driver.findElement(By.xpath(documentTemplate_XPath)).findVisibleElement(By.xpath(documentTemplate_XPath));
	}

	/*BatchImport->deptselect*/
	public void deptselect_input(String inputStr){
		WebElement deptselect=driver.findElement(By.xpath(deptselect_XPath+"/descendant::input[contains(@role,'textbox')]")).findVisibleElement(By.xpath(deptselect_XPath+"/descendant::input[contains(@role,'textbox')]"));
		deptselect.click();
		deptselect.clear();
		deptselect.sendKeys(inputStr);
	}

	/*BatchImport->deptselect*/
	public void deptselect_select(String selectStr){
		WebElement deptselect=driver.findElement(By.xpath(deptselect_XPath)).findVisibleElement(By.xpath(deptselect_XPath));
		deptselect.click();
		WebElement comboboxNameArrow =driver.findElement(By.xpath(deptselect_XPath+"/descendant::input[contains(@class,'ArrowButton')]")).findVisibleElement(By.xpath(deptselect_XPath+"/descendant::input[contains(@class,'ArrowButton')]"));
		comboboxNameArrow.click();
		CommonClass.implicitWait(driver);
		WebElement mySelectItem=driver.findElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']")).findVisibleElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']"));
		mySelectItem.click();
	}

	/*BatchImport->deptselect*/
	public WebElement get_deptselect_input_Self(){
		return driver.findElement(By.xpath(deptselect_XPath+"/descendant::input[contains(@role,'textbox')]")).findVisibleElement(By.xpath(deptselect_XPath+"/descendant::input[contains(@role,'textbox')]"));
	}

	/*BatchImport->deptselect*/
	public WebElement get_deptselect_selectItem_Self(String selectStr){
		WebElement deptselect=driver.findElement(By.xpath(deptselect_XPath)).findVisibleElement(By.xpath(deptselect_XPath));
		deptselect.click();
		WebElement comboboxNameArrow =driver.findElement(By.xpath(deptselect_XPath+"/descendant::input[contains(@class,'ArrowButton')]")).findVisibleElement(By.xpath(deptselect_XPath+"/descendant::input[contains(@class,'ArrowButton')]"));
		comboboxNameArrow.click();
		CommonClass.implicitWait(driver);
		return driver.findElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']")).findVisibleElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']"));
	}

	/*BatchImport->importButton*/
	public void importButton_click(){
		WebElement importButton = driver.findElement(By.xpath(importButton_XPath)).findVisibleElement(By.xpath(importButton_XPath));
		importButton.click();
	}

	/*BatchImport->importButton*/
	public WebElement get_importButton_Self(){
		return driver.findElement(By.xpath(importButton_XPath)).findVisibleElement(By.xpath(importButton_XPath));
	}

	/*BatchImport->downloadResult*/
	public void downloadResult_click(){
		WebElement downloadResult = driver.findElement(By.xpath(downloadResult_XPath)).findVisibleElement(By.xpath(downloadResult_XPath));
		downloadResult.click();
	}

	/*BatchImport->downloadResult*/
	public WebElement get_downloadResult_Self(){
		return driver.findElement(By.xpath(downloadResult_XPath)).findVisibleElement(By.xpath(downloadResult_XPath));
	}

	/*BatchImport->resultGrid*/
	public void resultGrid_colCaptionClick(String captionName){
		WebElement resultGrid = driver.findElement(By.xpath(resultGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']")).findVisibleElement(By.xpath(resultGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']"));
		resultGrid.click();
	}

	/*BatchImport->resultGrid*/
	public void resultGrid_selectCellbyRowColNumber(int rowNum,int colNum){
		WebElement resultGrid = driver.findElement(By.xpath(resultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]")).findVisibleElement(By.xpath(resultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]"));
		resultGrid.click();
	}

	/*BatchImport->resultGrid*/
	public void resultGrid_selectRowbyRowColNumber(int rowNum,int colNum){
		WebElement resultGrid = driver.findElement(By.xpath(resultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/..")).findVisibleElement(By.xpath(resultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/.."));
		resultGrid.click();
	}

	/*BatchImport->resultGrid*/
	public void resultGrid_selectRowbyRowNumber(int rowNum){
		WebElement resultGrid = driver.findElement(By.xpath(resultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr")).findVisibleElement(By.xpath(resultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr"));
		resultGrid.click();
	}

	/*BatchImport->resultGrid*/
	public void resultGrid_selectCellbyCellText(String cellText){
		WebElement resultGrid = driver.findElement(By.xpath(resultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']")).findVisibleElement(By.xpath(resultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']"));
		resultGrid.click();
	}

	/*BatchImport->resultGrid*/
	public void resultGrid_selectRowbyCellText(String cellText){
		WebElement resultGrid = driver.findElement(By.xpath(resultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/..")).findVisibleElement(By.xpath(resultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/.."));
		resultGrid.click();
	}

	/*BatchImport->resultGrid*/
	public void resultGrid_selectCellbyOtherInlineCellText(String otherInlineCellText,String targetCellText){
		WebElement resultGrid = driver.findElement(By.xpath(resultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']")).findVisibleElement(By.xpath(resultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']"));
		resultGrid.click();
	}

	/*BatchImport->resultGrid*/
	public void resultGrid_selectCellbyColNameCellText(String colName,String cellText){
		WebElement resultGrid = driver.findElement(By.xpath(resultGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../..")).findVisibleElement(By.xpath(resultGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../.."));
		String idx=resultGrid.getAttribute("idx");
		List<WebElement> Gridrows = driver.findAll(By.xpath(resultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]"));
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

	/*BatchImport->resultGrid*/
	public WebElement get_resultGrid_colCaption_Self(String captionName){
		return driver.findElement(By.xpath(resultGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']")).findVisibleElement(By.xpath(resultGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']"));
	}

	/*BatchImport->resultGrid*/
	public WebElement get_resultGrid_CellbyRowColNumber_Self(int rowNum,int colNum){
		return driver.findElement(By.xpath(resultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]")).findVisibleElement(By.xpath(resultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]"));
	}

	/*BatchImport->resultGrid*/
	public WebElement get_resultGrid_RowbyRowColNumber_Self(int rowNum,int colNum){
		return driver.findElement(By.xpath(resultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/..")).findVisibleElement(By.xpath(resultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/.."));
	}

	/*BatchImport->resultGrid*/
	public WebElement get_resultGrid_RowbyRowNumber_Self(int rowNum){
		return driver.findElement(By.xpath(resultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr")).findVisibleElement(By.xpath(resultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr"));
	}

	/*BatchImport->resultGrid*/
	public WebElement get_resultGrid_CellbyCellText_Self(String cellText){
		return driver.findElement(By.xpath(resultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']")).findVisibleElement(By.xpath(resultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']"));
	}

	/*BatchImport->resultGrid*/
	public WebElement get_resultGrid_RowbyCellText_Self(String cellText){
		return driver.findElement(By.xpath(resultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/..")).findVisibleElement(By.xpath(resultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/.."));
	}

	/*BatchImport->resultGrid*/
	public WebElement get_resultGrid_CellbyOtherInlineCellText_Self(String otherInlineCellText,String targetCellText){
		return driver.findElement(By.xpath(resultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']")).findVisibleElement(By.xpath(resultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']"));
	}

	/*BatchImport->resultGrid*/
	public WebElement get_resultGrid_CellbyColNameCellText_Self(String colName,String cellText){
		WebElement resultGrid = driver.findElement(By.xpath(resultGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../..")).findVisibleElement(By.xpath(resultGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../.."));
		String idx=resultGrid.getAttribute("idx");
		List<WebElement> Gridrows = driver.findAll(By.xpath(resultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]"));
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

	/*BatchImport->tip*/
	public void tip_input(String inputStr){
		WebElement tip=driver.findElement(By.xpath(tip_XPath)).findVisibleElement(By.xpath(tip_XPath));
		tip.click();
		tip.clear();
		tip.sendKeys(inputStr);
	}

	/*BatchImport->tip*/
	public WebElement get_tip_Self(){
		return driver.findElement(By.xpath(tip_XPath)).findVisibleElement(By.xpath(tip_XPath));
	}

}
