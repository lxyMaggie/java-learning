package com.ibm.CNNC.elements;

import java.util.*;
import org.openqa.selenium.*;
import com.selenium.utils.WebDriver;
import com.selenium.utils.WebElement;

/*catalog\widget\dm\lendmanage\borrowstatistics\templates\BorrowStatistics.html*/
public class BorrowStatistics {
	protected WebDriver driver;
	private static final String docType_XPath="//descendant::div[contains(@id,'BorrowStatistics')]/descendant::span[normalize-space(text())='资料类别']/../../descendant::div[contains(@id,'widget_dijit_form_FilteringSelect')]";
	private static final String userDept5_XPath="//descendant::div[contains(@id,'BorrowStatistics')]/descendant::span[normalize-space(text())='借阅类型']/../../descendant::div[contains(@id,'widget_dijit_form_FilteringSelect')]";
	private static final String 查询_XPath="//descendant::div[contains(@id,'BorrowStatistics')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"查询"+"']";
	private static final String 统计_XPath="//descendant::div[contains(@id,'BorrowStatistics')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"统计"+"']";
	private static final String exportGrid_XPath="//descendant::div[contains(@id,'BorrowStatistics')]/descendant::div[contains(@id,'DataGrid')]";
	private static final String 提交_XPath="//descendant::div[contains(@id,'BorrowStatistics')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"提交"+"']";
	private static final String 取消_XPath="//descendant::div[contains(@id,'BorrowStatistics')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"取消"+"']";

	//----Constructor Methods Begin----
	public BorrowStatistics(WebDriver driver){
		this.driver=driver;
	}

	/*BorrowStatistics->docType*/
	public void docType_input(String inputStr){
		WebElement docType=driver.findElement(By.xpath(docType_XPath+"/descendant::input[contains(@role,'textbox')]")).findVisibleElement(By.xpath(docType_XPath+"/descendant::input[contains(@role,'textbox')]"));
		docType.click();
		docType.clear();
		docType.sendKeys(inputStr);
	}

	/*BorrowStatistics->docType*/
	public void docType_select(String selectStr){
		WebElement docType=driver.findElement(By.xpath(docType_XPath)).findVisibleElement(By.xpath(docType_XPath));
		docType.click();
		WebElement comboboxNameArrow =driver.findElement(By.xpath(docType_XPath+"/descendant::input[contains(@class,'ArrowButton')]")).findVisibleElement(By.xpath(docType_XPath+"/descendant::input[contains(@class,'ArrowButton')]"));
		comboboxNameArrow.click();
		CommonClass.implicitWait(driver);
		WebElement mySelectItem=driver.findElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']")).findVisibleElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']"));
		mySelectItem.click();
	}

	/*BorrowStatistics->docType*/
	public WebElement get_docType_input_Self(){
		return driver.findElement(By.xpath(docType_XPath+"/descendant::input[contains(@role,'textbox')]")).findVisibleElement(By.xpath(docType_XPath+"/descendant::input[contains(@role,'textbox')]"));
	}

	/*BorrowStatistics->docType*/
	public WebElement get_docType_selectItem_Self(String selectStr){
		WebElement docType=driver.findElement(By.xpath(docType_XPath)).findVisibleElement(By.xpath(docType_XPath));
		docType.click();
		WebElement comboboxNameArrow =driver.findElement(By.xpath(docType_XPath+"/descendant::input[contains(@class,'ArrowButton')]")).findVisibleElement(By.xpath(docType_XPath+"/descendant::input[contains(@class,'ArrowButton')]"));
		comboboxNameArrow.click();
		CommonClass.implicitWait(driver);
		return driver.findElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']")).findVisibleElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']"));
	}

	/*BorrowStatistics->userDept5*/
	public void userDept5_input(String inputStr){
		WebElement userDept5=driver.findElement(By.xpath(userDept5_XPath+"/descendant::input[contains(@role,'textbox')]")).findVisibleElement(By.xpath(userDept5_XPath+"/descendant::input[contains(@role,'textbox')]"));
		userDept5.click();
		userDept5.clear();
		userDept5.sendKeys(inputStr);
	}

	/*BorrowStatistics->userDept5*/
	public void userDept5_select(String selectStr){
		WebElement userDept5=driver.findElement(By.xpath(userDept5_XPath)).findVisibleElement(By.xpath(userDept5_XPath));
		userDept5.click();
		WebElement comboboxNameArrow =driver.findElement(By.xpath(userDept5_XPath+"/descendant::input[contains(@class,'ArrowButton')]")).findVisibleElement(By.xpath(userDept5_XPath+"/descendant::input[contains(@class,'ArrowButton')]"));
		comboboxNameArrow.click();
		CommonClass.implicitWait(driver);
		WebElement mySelectItem=driver.findElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']")).findVisibleElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']"));
		mySelectItem.click();
	}

	/*BorrowStatistics->userDept5*/
	public WebElement get_userDept5_input_Self(){
		return driver.findElement(By.xpath(userDept5_XPath+"/descendant::input[contains(@role,'textbox')]")).findVisibleElement(By.xpath(userDept5_XPath+"/descendant::input[contains(@role,'textbox')]"));
	}

	/*BorrowStatistics->userDept5*/
	public WebElement get_userDept5_selectItem_Self(String selectStr){
		WebElement userDept5=driver.findElement(By.xpath(userDept5_XPath)).findVisibleElement(By.xpath(userDept5_XPath));
		userDept5.click();
		WebElement comboboxNameArrow =driver.findElement(By.xpath(userDept5_XPath+"/descendant::input[contains(@class,'ArrowButton')]")).findVisibleElement(By.xpath(userDept5_XPath+"/descendant::input[contains(@class,'ArrowButton')]"));
		comboboxNameArrow.click();
		CommonClass.implicitWait(driver);
		return driver.findElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']")).findVisibleElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']"));
	}

	/*BorrowStatistics->查询*/
	public void 查询_click(){
		WebElement 查询 = driver.findElement(By.xpath(查询_XPath)).findVisibleElement(By.xpath(查询_XPath));
		查询.click();
	}

	/*BorrowStatistics->查询*/
	public WebElement get_查询_Self(){
		return driver.findElement(By.xpath(查询_XPath)).findVisibleElement(By.xpath(查询_XPath));
	}

	/*BorrowStatistics->统计*/
	public void 统计_click(){
		WebElement 统计 = driver.findElement(By.xpath(统计_XPath)).findVisibleElement(By.xpath(统计_XPath));
		统计.click();
	}

	/*BorrowStatistics->统计*/
	public WebElement get_统计_Self(){
		return driver.findElement(By.xpath(统计_XPath)).findVisibleElement(By.xpath(统计_XPath));
	}

	/*BorrowStatistics->exportGrid*/
	public void exportGrid_colCaptionClick(String captionName){
		WebElement exportGrid = driver.findElement(By.xpath(exportGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']")).findVisibleElement(By.xpath(exportGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']"));
		exportGrid.click();
	}

	/*BorrowStatistics->exportGrid*/
	public void exportGrid_selectCellbyRowColNumber(int rowNum,int colNum){
		WebElement exportGrid = driver.findElement(By.xpath(exportGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]")).findVisibleElement(By.xpath(exportGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]"));
		exportGrid.click();
	}

	/*BorrowStatistics->exportGrid*/
	public void exportGrid_selectRowbyRowColNumber(int rowNum,int colNum){
		WebElement exportGrid = driver.findElement(By.xpath(exportGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/..")).findVisibleElement(By.xpath(exportGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/.."));
		exportGrid.click();
	}

	/*BorrowStatistics->exportGrid*/
	public void exportGrid_selectRowbyRowNumber(int rowNum){
		WebElement exportGrid = driver.findElement(By.xpath(exportGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr")).findVisibleElement(By.xpath(exportGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr"));
		exportGrid.click();
	}

	/*BorrowStatistics->exportGrid*/
	public void exportGrid_selectCellbyCellText(String cellText){
		WebElement exportGrid = driver.findElement(By.xpath(exportGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']")).findVisibleElement(By.xpath(exportGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']"));
		exportGrid.click();
	}

	/*BorrowStatistics->exportGrid*/
	public void exportGrid_selectRowbyCellText(String cellText){
		WebElement exportGrid = driver.findElement(By.xpath(exportGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/..")).findVisibleElement(By.xpath(exportGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/.."));
		exportGrid.click();
	}

	/*BorrowStatistics->exportGrid*/
	public void exportGrid_selectCellbyOtherInlineCellText(String otherInlineCellText,String targetCellText){
		WebElement exportGrid = driver.findElement(By.xpath(exportGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']")).findVisibleElement(By.xpath(exportGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']"));
		exportGrid.click();
	}

	/*BorrowStatistics->exportGrid*/
	public void exportGrid_selectCellbyColNameCellText(String colName,String cellText){
		WebElement exportGrid = driver.findElement(By.xpath(exportGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../..")).findVisibleElement(By.xpath(exportGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../.."));
		String idx=exportGrid.getAttribute("idx");
		List<WebElement> Gridrows = driver.findAll(By.xpath(exportGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]"));
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

	/*BorrowStatistics->exportGrid*/
	public WebElement get_exportGrid_colCaption_Self(String captionName){
		return driver.findElement(By.xpath(exportGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']")).findVisibleElement(By.xpath(exportGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']"));
	}

	/*BorrowStatistics->exportGrid*/
	public WebElement get_exportGrid_CellbyRowColNumber_Self(int rowNum,int colNum){
		return driver.findElement(By.xpath(exportGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]")).findVisibleElement(By.xpath(exportGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]"));
	}

	/*BorrowStatistics->exportGrid*/
	public WebElement get_exportGrid_RowbyRowColNumber_Self(int rowNum,int colNum){
		return driver.findElement(By.xpath(exportGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/..")).findVisibleElement(By.xpath(exportGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/.."));
	}

	/*BorrowStatistics->exportGrid*/
	public WebElement get_exportGrid_RowbyRowNumber_Self(int rowNum){
		return driver.findElement(By.xpath(exportGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr")).findVisibleElement(By.xpath(exportGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr"));
	}

	/*BorrowStatistics->exportGrid*/
	public WebElement get_exportGrid_CellbyCellText_Self(String cellText){
		return driver.findElement(By.xpath(exportGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']")).findVisibleElement(By.xpath(exportGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']"));
	}

	/*BorrowStatistics->exportGrid*/
	public WebElement get_exportGrid_RowbyCellText_Self(String cellText){
		return driver.findElement(By.xpath(exportGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/..")).findVisibleElement(By.xpath(exportGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/.."));
	}

	/*BorrowStatistics->exportGrid*/
	public WebElement get_exportGrid_CellbyOtherInlineCellText_Self(String otherInlineCellText,String targetCellText){
		return driver.findElement(By.xpath(exportGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']")).findVisibleElement(By.xpath(exportGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']"));
	}

	/*BorrowStatistics->exportGrid*/
	public WebElement get_exportGrid_CellbyColNameCellText_Self(String colName,String cellText){
		WebElement exportGrid = driver.findElement(By.xpath(exportGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../..")).findVisibleElement(By.xpath(exportGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../.."));
		String idx=exportGrid.getAttribute("idx");
		List<WebElement> Gridrows = driver.findAll(By.xpath(exportGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]"));
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

	/*BorrowStatistics->提交*/
	public void 提交_click(){
		WebElement 提交 = driver.findElement(By.xpath(提交_XPath)).findVisibleElement(By.xpath(提交_XPath));
		提交.click();
	}

	/*BorrowStatistics->提交*/
	public WebElement get_提交_Self(){
		return driver.findElement(By.xpath(提交_XPath)).findVisibleElement(By.xpath(提交_XPath));
	}

	/*BorrowStatistics->取消*/
	public void 取消_click(){
		WebElement 取消 = driver.findElement(By.xpath(取消_XPath)).findVisibleElement(By.xpath(取消_XPath));
		取消.click();
	}

	/*BorrowStatistics->取消*/
	public WebElement get_取消_Self(){
		return driver.findElement(By.xpath(取消_XPath)).findVisibleElement(By.xpath(取消_XPath));
	}

}
