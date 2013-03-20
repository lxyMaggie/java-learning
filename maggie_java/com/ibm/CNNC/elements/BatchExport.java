package com.ibm.CNNC.elements;

import java.util.*;
import org.openqa.selenium.*;
import com.selenium.utils.WebDriver;
import com.selenium.utils.WebElement;

/*catalog\widget\dm\common\batchexport\templates\BatchExport.html*/
public class BatchExport {
	protected WebDriver driver;
	private static final String exportGrid_XPath="//descendant::div[contains(@id,'BatchExport')]/descendant::div[contains(@id,'DataGrid')]";
	private static final String BatchExport_BatchExport_XPath="//descendant::div[contains(@id,'BatchExport')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"'导出'"+"']";
	private static final String Cancel_XPath="//descendant::div[contains(@id,'BatchExport')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"'取消'"+"']";

	//----Constructor Methods Begin----
	public BatchExport(WebDriver driver){
		this.driver=driver;
	}

	/*BatchExport->exportGrid*/
	public void exportGrid_colCaptionClick(String captionName){
		WebElement exportGrid = driver.findElement(By.xpath(exportGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']")).findVisibleElement(By.xpath(exportGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']"));
		exportGrid.click();
	}

	/*BatchExport->exportGrid*/
	public void exportGrid_selectCellbyRowColNumber(int rowNum,int colNum){
		WebElement exportGrid = driver.findElement(By.xpath(exportGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]")).findVisibleElement(By.xpath(exportGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]"));
		exportGrid.click();
	}

	/*BatchExport->exportGrid*/
	public void exportGrid_selectRowbyRowColNumber(int rowNum,int colNum){
		WebElement exportGrid = driver.findElement(By.xpath(exportGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/..")).findVisibleElement(By.xpath(exportGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/.."));
		exportGrid.click();
	}

	/*BatchExport->exportGrid*/
	public void exportGrid_selectRowbyRowNumber(int rowNum){
		WebElement exportGrid = driver.findElement(By.xpath(exportGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr")).findVisibleElement(By.xpath(exportGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr"));
		exportGrid.click();
	}

	/*BatchExport->exportGrid*/
	public void exportGrid_selectCellbyCellText(String cellText){
		WebElement exportGrid = driver.findElement(By.xpath(exportGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']")).findVisibleElement(By.xpath(exportGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']"));
		exportGrid.click();
	}

	/*BatchExport->exportGrid*/
	public void exportGrid_selectRowbyCellText(String cellText){
		WebElement exportGrid = driver.findElement(By.xpath(exportGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/..")).findVisibleElement(By.xpath(exportGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/.."));
		exportGrid.click();
	}

	/*BatchExport->exportGrid*/
	public void exportGrid_selectCellbyOtherInlineCellText(String otherInlineCellText,String targetCellText){
		WebElement exportGrid = driver.findElement(By.xpath(exportGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']")).findVisibleElement(By.xpath(exportGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']"));
		exportGrid.click();
	}

	/*BatchExport->exportGrid*/
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

	/*BatchExport->exportGrid*/
	public WebElement get_exportGrid_colCaption_Self(String captionName){
		return driver.findElement(By.xpath(exportGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']")).findVisibleElement(By.xpath(exportGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']"));
	}

	/*BatchExport->exportGrid*/
	public WebElement get_exportGrid_CellbyRowColNumber_Self(int rowNum,int colNum){
		return driver.findElement(By.xpath(exportGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]")).findVisibleElement(By.xpath(exportGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]"));
	}

	/*BatchExport->exportGrid*/
	public WebElement get_exportGrid_RowbyRowColNumber_Self(int rowNum,int colNum){
		return driver.findElement(By.xpath(exportGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/..")).findVisibleElement(By.xpath(exportGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/.."));
	}

	/*BatchExport->exportGrid*/
	public WebElement get_exportGrid_RowbyRowNumber_Self(int rowNum){
		return driver.findElement(By.xpath(exportGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr")).findVisibleElement(By.xpath(exportGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr"));
	}

	/*BatchExport->exportGrid*/
	public WebElement get_exportGrid_CellbyCellText_Self(String cellText){
		return driver.findElement(By.xpath(exportGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']")).findVisibleElement(By.xpath(exportGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']"));
	}

	/*BatchExport->exportGrid*/
	public WebElement get_exportGrid_RowbyCellText_Self(String cellText){
		return driver.findElement(By.xpath(exportGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/..")).findVisibleElement(By.xpath(exportGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/.."));
	}

	/*BatchExport->exportGrid*/
	public WebElement get_exportGrid_CellbyOtherInlineCellText_Self(String otherInlineCellText,String targetCellText){
		return driver.findElement(By.xpath(exportGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']")).findVisibleElement(By.xpath(exportGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']"));
	}

	/*BatchExport->exportGrid*/
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

	/*BatchExport->onClick: ->onClickBatchExport*/
	public void BatchExport_BatchExport_click(){
		WebElement BatchExport_BatchExport = driver.findElement(By.xpath(BatchExport_BatchExport_XPath)).findVisibleElement(By.xpath(BatchExport_BatchExport_XPath));
		BatchExport_BatchExport.click();
	}

	/*BatchExport->onClick: ->onClickBatchExport*/
	public WebElement get_BatchExport_BatchExport_Self(){
		return driver.findElement(By.xpath(BatchExport_BatchExport_XPath)).findVisibleElement(By.xpath(BatchExport_BatchExport_XPath));
	}

	/*BatchExport->onClick: ->onClickCancel*/
	public void Cancel_click(){
		WebElement Cancel = driver.findElement(By.xpath(Cancel_XPath)).findVisibleElement(By.xpath(Cancel_XPath));
		Cancel.click();
	}

	/*BatchExport->onClick: ->onClickCancel*/
	public WebElement get_Cancel_Self(){
		return driver.findElement(By.xpath(Cancel_XPath)).findVisibleElement(By.xpath(Cancel_XPath));
	}

}
