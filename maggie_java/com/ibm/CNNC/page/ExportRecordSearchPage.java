package com.ibm.CNNC.page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import com.selenium.utils.WebDriver;
import com.selenium.utils.WebElement;

public class ExportRecordSearchPage {
	private WebDriver driver;
	private static final String fileName_XPath="//descendant::div[contains(@id,'ExportRecordSearch')]/descendant::input[contains(@id,'ValidationTextBox')]";
	private static final String searchButton_XPath="//descendant::div[contains(@id,'ExportRecordSearch')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='查询']";
	private static final String downloadResultButton_XPath="//descendant::div[contains(@id,'ExportRecordSearch')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='下载结果集']";
	private static final String exportRecordGrid_XPath="//descendant::div[contains(@id,'ExportRecordSearch')]/descendant::div[contains(@id,'EnhancedGrid')]";

	//----Constructor Methods Begin----
	public ExportRecordSearchPage(WebDriver driver){
		this.driver=driver;
	}

	/*ExportRecordSearch->fileName*/
	public void fileName_input(String inputStr){
		WebElement fileName=driver.findElement(By.xpath(fileName_XPath)).findVisibleElement(By.xpath(fileName_XPath));
		fileName.click();
		fileName.clear();
		fileName.sendKeys(inputStr);
	}

	/*ExportRecordSearch->fileName*/
	public WebElement get_fileName_Self(){
		return driver.findElement(By.xpath(fileName_XPath)).findVisibleElement(By.xpath(fileName_XPath));
	}

	/*ExportRecordSearch->searchButton*/
	public void searchButton_click(){
		WebElement searchButton = driver.findElement(By.xpath(searchButton_XPath)).findVisibleElement(By.xpath(searchButton_XPath));
		searchButton.click();
	}

	/*ExportRecordSearch->searchButton*/
	public WebElement get_searchButton_Self(){
		return driver.findElement(By.xpath(searchButton_XPath)).findVisibleElement(By.xpath(searchButton_XPath));
	}

	/*ExportRecordSearch->downloadResultButton*/
	public void downloadResultButton_click(){
		WebElement downloadResultButton = driver.findElement(By.xpath(downloadResultButton_XPath)).findVisibleElement(By.xpath(downloadResultButton_XPath));
		downloadResultButton.click();
	}

	/*ExportRecordSearch->downloadResultButton*/
	public WebElement get_downloadResultButton_Self(){
		return driver.findElement(By.xpath(downloadResultButton_XPath)).findVisibleElement(By.xpath(downloadResultButton_XPath));
	}

	/*ExportRecordSearch->exportRecordGrid*/
	public void exportRecordGrid_colCaptionClick(String captionName){
		WebElement exportRecordGrid = driver.findElement(By.xpath(exportRecordGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']")).findVisibleElement(By.xpath(exportRecordGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']"));
		exportRecordGrid.click();
	}

	/*ExportRecordSearch->exportRecordGrid*/
	public void exportRecordGrid_selectCellbyRowColNumber(int rowNum,int colNum){
		WebElement exportRecordGrid = driver.findElement(By.xpath(exportRecordGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]")).findVisibleElement(By.xpath(exportRecordGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]"));
		exportRecordGrid.click();
	}

	/*ExportRecordSearch->exportRecordGrid*/
	public void exportRecordGrid_selectRowbyRowColNumber(int rowNum,int colNum){
		WebElement exportRecordGrid = driver.findElement(By.xpath(exportRecordGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/..")).findVisibleElement(By.xpath(exportRecordGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/.."));
		exportRecordGrid.click();
	}

	/*ExportRecordSearch->exportRecordGrid*/
	public void exportRecordGrid_selectRowbyRowNumber(int rowNum){
		WebElement exportRecordGrid = driver.findElement(By.xpath(exportRecordGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr")).findVisibleElement(By.xpath(exportRecordGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr"));
		exportRecordGrid.click();
	}

	/*ExportRecordSearch->exportRecordGrid*/
	public void exportRecordGrid_selectCellbyCellText(String cellText){
		WebElement exportRecordGrid = driver.findElement(By.xpath(exportRecordGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']")).findVisibleElement(By.xpath(exportRecordGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']"));
		exportRecordGrid.click();
	}

	/*ExportRecordSearch->exportRecordGrid*/
	public void exportRecordGrid_selectRowbyCellText(String cellText){
		WebElement exportRecordGrid = driver.findElement(By.xpath(exportRecordGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/..")).findVisibleElement(By.xpath(exportRecordGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/.."));
		exportRecordGrid.click();
	}

	/*ExportRecordSearch->exportRecordGrid*/
	public void exportRecordGrid_selectCellbyOtherInlineCellText(String otherInlineCellText,String targetCellText){
		WebElement exportRecordGrid = driver.findElement(By.xpath(exportRecordGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']")).findVisibleElement(By.xpath(exportRecordGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']"));
		exportRecordGrid.click();
	}

	/*ExportRecordSearch->exportRecordGrid*/
	public void exportRecordGrid_selectCellbyColNameCellText(String colName,String cellText){
		WebElement exportRecordGrid = driver.findElement(By.xpath(exportRecordGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../..")).findVisibleElement(By.xpath(exportRecordGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../.."));
		String idx=exportRecordGrid.getAttribute("idx");
		List<WebElement> Gridrows = driver.findAll(By.xpath(exportRecordGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]"));
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

	/*ExportRecordSearch->exportRecordGrid*/
	public WebElement get_exportRecordGrid_colCaption_Self(String captionName){
		return driver.findElement(By.xpath(exportRecordGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']")).findVisibleElement(By.xpath(exportRecordGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']"));
	}

	/*ExportRecordSearch->exportRecordGrid*/
	public WebElement get_exportRecordGrid_CellbyRowColNumber_Self(int rowNum,int colNum){
		return driver.findElement(By.xpath(exportRecordGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]")).findVisibleElement(By.xpath(exportRecordGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]"));
	}

	/*ExportRecordSearch->exportRecordGrid*/
	public WebElement get_exportRecordGrid_RowbyRowColNumber_Self(int rowNum,int colNum){
		return driver.findElement(By.xpath(exportRecordGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/..")).findVisibleElement(By.xpath(exportRecordGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/.."));
	}

	/*ExportRecordSearch->exportRecordGrid*/
	public WebElement get_exportRecordGrid_RowbyRowNumber_Self(int rowNum){
		return driver.findElement(By.xpath(exportRecordGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr")).findVisibleElement(By.xpath(exportRecordGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr"));
	}

	/*ExportRecordSearch->exportRecordGrid*/
	public WebElement get_exportRecordGrid_CellbyCellText_Self(String cellText){
		return driver.findElement(By.xpath(exportRecordGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']")).findVisibleElement(By.xpath(exportRecordGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']"));
	}

	/*ExportRecordSearch->exportRecordGrid*/
	public WebElement get_exportRecordGrid_RowbyCellText_Self(String cellText){
		return driver.findElement(By.xpath(exportRecordGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/..")).findVisibleElement(By.xpath(exportRecordGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/.."));
	}

	/*ExportRecordSearch->exportRecordGrid*/
	public WebElement get_exportRecordGrid_CellbyOtherInlineCellText_Self(String otherInlineCellText,String targetCellText){
		return driver.findElement(By.xpath(exportRecordGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']")).findVisibleElement(By.xpath(exportRecordGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']"));
	}

	/*ExportRecordSearch->exportRecordGrid*/
	public WebElement get_exportRecordGrid_CellbyColNameCellText_Self(String colName,String cellText){
		WebElement exportRecordGrid = driver.findElement(By.xpath(exportRecordGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../..")).findVisibleElement(By.xpath(exportRecordGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../.."));
		String idx=exportRecordGrid.getAttribute("idx");
		List<WebElement> Gridrows = driver.findAll(By.xpath(exportRecordGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]"));
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

	/*ExportRecordSearch->exportRecordGrid*/
	public void exportRecordGrid_doubleClickRowbyRowNumber(int rowNum){
		Actions actions = new Actions(driver.getDriver());
		actions.doubleClick(driver.findElement(By.xpath(exportRecordGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr")).findVisibleElement(By.xpath(exportRecordGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr")).getElement()).perform();
	}

}
