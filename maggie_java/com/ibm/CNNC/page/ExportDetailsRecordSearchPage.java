package com.ibm.CNNC.page;

import java.util.List;

import org.openqa.selenium.By;

import com.selenium.utils.WebDriver;
import com.selenium.utils.WebElement;

public class ExportDetailsRecordSearchPage {
	private WebDriver driver;
	private static final String exportDetailsRecordGrid_XPath="//descendant::div[contains(@id,'ExportDetailsRecordSearch')]/descendant::div[contains(@id,'EnhancedGrid')]";

	//----Constructor Methods Begin----
	public ExportDetailsRecordSearchPage(WebDriver driver){
		this.driver=driver;
	}

	/*ExportDetailsRecordSearchPage->exportDetailsRecordGrid*/
	public void exportDetailsRecordGrid_colCaptionClick(String captionName){
		WebElement exportDetailsRecordGrid = driver.findElement(By.xpath(exportDetailsRecordGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']")).findVisibleElement(By.xpath(exportDetailsRecordGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']"));
		exportDetailsRecordGrid.click();
	}

	/*ExportDetailsRecordSearchPage->exportDetailsRecordGrid*/
	public void exportDetailsRecordGrid_selectCellbyRowColNumber(int rowNum,int colNum){
		WebElement exportDetailsRecordGrid = driver.findElement(By.xpath(exportDetailsRecordGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]")).findVisibleElement(By.xpath(exportDetailsRecordGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]"));
		exportDetailsRecordGrid.click();
	}

	/*ExportDetailsRecordSearchPage->exportDetailsRecordGrid*/
	public void exportDetailsRecordGrid_selectRowbyRowColNumber(int rowNum,int colNum){
		WebElement exportDetailsRecordGrid = driver.findElement(By.xpath(exportDetailsRecordGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/..")).findVisibleElement(By.xpath(exportDetailsRecordGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/.."));
		exportDetailsRecordGrid.click();
	}

	/*ExportDetailsRecordSearchPage->exportDetailsRecordGrid*/
	public void exportDetailsRecordGrid_selectRowbyRowNumber(int rowNum){
		WebElement exportDetailsRecordGrid = driver.findElement(By.xpath(exportDetailsRecordGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr")).findVisibleElement(By.xpath(exportDetailsRecordGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr"));
		exportDetailsRecordGrid.click();
	}

	/*ExportDetailsRecordSearchPage->exportDetailsRecordGrid*/
	public void exportDetailsRecordGrid_selectCellbyCellText(String cellText){
		WebElement exportDetailsRecordGrid = driver.findElement(By.xpath(exportDetailsRecordGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']")).findVisibleElement(By.xpath(exportDetailsRecordGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']"));
		exportDetailsRecordGrid.click();
	}

	/*ExportDetailsRecordSearchPage->exportDetailsRecordGrid*/
	public void exportDetailsRecordGrid_selectRowbyCellText(String cellText){
		WebElement exportDetailsRecordGrid = driver.findElement(By.xpath(exportDetailsRecordGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/..")).findVisibleElement(By.xpath(exportDetailsRecordGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/.."));
		exportDetailsRecordGrid.click();
	}

	/*ExportDetailsRecordSearchPage->exportDetailsRecordGrid*/
	public void exportDetailsRecordGrid_selectCellbyOtherInlineCellText(String otherInlineCellText,String targetCellText){
		WebElement exportDetailsRecordGrid = driver.findElement(By.xpath(exportDetailsRecordGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']")).findVisibleElement(By.xpath(exportDetailsRecordGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']"));
		exportDetailsRecordGrid.click();
	}

	/*ExportDetailsRecordSearchPage->exportDetailsRecordGrid*/
	public void exportDetailsRecordGrid_selectCellbyColNameCellText(String colName,String cellText){
		WebElement exportDetailsRecordGrid = driver.findElement(By.xpath(exportDetailsRecordGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../..")).findVisibleElement(By.xpath(exportDetailsRecordGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../.."));
		String idx=exportDetailsRecordGrid.getAttribute("idx");
		List<WebElement> Gridrows = driver.findAll(By.xpath(exportDetailsRecordGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]"));
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

	/*ExportDetailsRecordSearchPage->exportDetailsRecordGrid*/
	public WebElement get_exportDetailsRecordGrid_colCaption_Self(String captionName){
		return driver.findElement(By.xpath(exportDetailsRecordGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']")).findVisibleElement(By.xpath(exportDetailsRecordGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']"));
	}

	/*ExportDetailsRecordSearchPage->exportDetailsRecordGrid*/
	public WebElement get_exportDetailsRecordGrid_CellbyRowColNumber_Self(int rowNum,int colNum){
		return driver.findElement(By.xpath(exportDetailsRecordGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]")).findVisibleElement(By.xpath(exportDetailsRecordGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]"));
	}

	/*ExportDetailsRecordSearchPage->exportDetailsRecordGrid*/
	public WebElement get_exportDetailsRecordGrid_RowbyRowColNumber_Self(int rowNum,int colNum){
		return driver.findElement(By.xpath(exportDetailsRecordGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/..")).findVisibleElement(By.xpath(exportDetailsRecordGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/.."));
	}

	/*ExportDetailsRecordSearchPage->exportDetailsRecordGrid*/
	public WebElement get_exportDetailsRecordGrid_RowbyRowNumber_Self(int rowNum){
		return driver.findElement(By.xpath(exportDetailsRecordGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr")).findVisibleElement(By.xpath(exportDetailsRecordGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr"));
	}

	/*ExportDetailsRecordSearchPage->exportDetailsRecordGrid*/
	public WebElement get_exportDetailsRecordGrid_CellbyCellText_Self(String cellText){
		return driver.findElement(By.xpath(exportDetailsRecordGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']")).findVisibleElement(By.xpath(exportDetailsRecordGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']"));
	}

	/*ExportDetailsRecordSearchPage->exportDetailsRecordGrid*/
	public WebElement get_exportDetailsRecordGrid_RowbyCellText_Self(String cellText){
		return driver.findElement(By.xpath(exportDetailsRecordGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/..")).findVisibleElement(By.xpath(exportDetailsRecordGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/.."));
	}

	/*ExportDetailsRecordSearchPage->exportDetailsRecordGrid*/
	public WebElement get_exportDetailsRecordGrid_CellbyOtherInlineCellText_Self(String otherInlineCellText,String targetCellText){
		return driver.findElement(By.xpath(exportDetailsRecordGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']")).findVisibleElement(By.xpath(exportDetailsRecordGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']"));
	}

	/*ExportDetailsRecordSearchPage->exportDetailsRecordGrid*/
	public WebElement get_exportDetailsRecordGrid_CellbyColNameCellText_Self(String colName,String cellText){
		WebElement exportDetailsRecordGrid = driver.findElement(By.xpath(exportDetailsRecordGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../..")).findVisibleElement(By.xpath(exportDetailsRecordGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../.."));
		String idx=exportDetailsRecordGrid.getAttribute("idx");
		List<WebElement> Gridrows = driver.findAll(By.xpath(exportDetailsRecordGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]"));
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

	/*ExportDetailsRecordSearchPage->exportDetailsRecordGrid*/
	public WebElement get_exportDetailsRecordGrid_NextCellByCellTitle(String cellTitle){
		return driver.findElement(By.xpath(exportDetailsRecordGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellTitle+"']/following-sibling::td[contains(@class,'GridCell')]")).findVisibleElement(By.xpath(exportDetailsRecordGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellTitle+"']/following-sibling::td[contains(@class,'GridCell')]")); 
	}

}
