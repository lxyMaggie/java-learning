package com.ibm.CNNC.elements;

import java.util.*;
import org.openqa.selenium.*;
import com.selenium.utils.WebDriver;
import com.selenium.utils.WebElement;

/*catalog\widget\dm\recordprocess\nuclearrecordtransferprocess\templates\NuclearRecordTransferProcess.html*/
public class NuclearRecordTransferProcess {
	protected WebDriver driver;
	private static final String onStartProcess_XPath="//descendant::div[contains(@id,'NuclearRecordTransferProcess')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"发起流程"+"']";
	private static final String onCancel_XPath="//descendant::div[contains(@id,'NuclearRecordTransferProcess')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"取消"+"']";
	private static final String processGrid_XPath="//descendant::div[contains(@id,'NuclearRecordTransferProcess')]/descendant::div[contains(@id,'DataGrid')]";

	//----Constructor Methods Begin----
	public NuclearRecordTransferProcess(WebDriver driver){
		this.driver=driver;
	}

	/*NuclearRecordTransferProcess->onClick:->onStartProcess*/
	public void onStartProcess_click(){
		WebElement onStartProcess = driver.findElement(By.xpath(onStartProcess_XPath)).findVisibleElement(By.xpath(onStartProcess_XPath));
		onStartProcess.click();
	}

	/*NuclearRecordTransferProcess->onClick:->onStartProcess*/
	public WebElement get_onStartProcess_Self(){
		return driver.findElement(By.xpath(onStartProcess_XPath)).findVisibleElement(By.xpath(onStartProcess_XPath));
	}

	/*NuclearRecordTransferProcess->onClick:->onCancel*/
	public void onCancel_click(){
		WebElement onCancel = driver.findElement(By.xpath(onCancel_XPath)).findVisibleElement(By.xpath(onCancel_XPath));
		onCancel.click();
	}

	/*NuclearRecordTransferProcess->onClick:->onCancel*/
	public WebElement get_onCancel_Self(){
		return driver.findElement(By.xpath(onCancel_XPath)).findVisibleElement(By.xpath(onCancel_XPath));
	}

	/*NuclearRecordTransferProcess->processGrid*/
	public void processGrid_colCaptionClick(String captionName){
		WebElement processGrid = driver.findElement(By.xpath(processGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']")).findVisibleElement(By.xpath(processGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']"));
		processGrid.click();
	}

	/*NuclearRecordTransferProcess->processGrid*/
	public void processGrid_selectCellbyRowColNumber(int rowNum,int colNum){
		WebElement processGrid = driver.findElement(By.xpath(processGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]")).findVisibleElement(By.xpath(processGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]"));
		processGrid.click();
	}

	/*NuclearRecordTransferProcess->processGrid*/
	public void processGrid_selectRowbyRowColNumber(int rowNum,int colNum){
		WebElement processGrid = driver.findElement(By.xpath(processGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/..")).findVisibleElement(By.xpath(processGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/.."));
		processGrid.click();
	}

	/*NuclearRecordTransferProcess->processGrid*/
	public void processGrid_selectRowbyRowNumber(int rowNum){
		WebElement processGrid = driver.findElement(By.xpath(processGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr")).findVisibleElement(By.xpath(processGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr"));
		processGrid.click();
	}

	/*NuclearRecordTransferProcess->processGrid*/
	public void processGrid_selectCellbyCellText(String cellText){
		WebElement processGrid = driver.findElement(By.xpath(processGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']")).findVisibleElement(By.xpath(processGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']"));
		processGrid.click();
	}

	/*NuclearRecordTransferProcess->processGrid*/
	public void processGrid_selectRowbyCellText(String cellText){
		WebElement processGrid = driver.findElement(By.xpath(processGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/..")).findVisibleElement(By.xpath(processGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/.."));
		processGrid.click();
	}

	/*NuclearRecordTransferProcess->processGrid*/
	public void processGrid_selectCellbyOtherInlineCellText(String otherInlineCellText,String targetCellText){
		WebElement processGrid = driver.findElement(By.xpath(processGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']")).findVisibleElement(By.xpath(processGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']"));
		processGrid.click();
	}

	/*NuclearRecordTransferProcess->processGrid*/
	public void processGrid_selectCellbyColNameCellText(String colName,String cellText){
		WebElement processGrid = driver.findElement(By.xpath(processGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../..")).findVisibleElement(By.xpath(processGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../.."));
		String idx=processGrid.getAttribute("idx");
		List<WebElement> Gridrows = driver.findAll(By.xpath(processGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]"));
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

	/*NuclearRecordTransferProcess->processGrid*/
	public WebElement get_processGrid_colCaption_Self(String captionName){
		return driver.findElement(By.xpath(processGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']")).findVisibleElement(By.xpath(processGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']"));
	}

	/*NuclearRecordTransferProcess->processGrid*/
	public WebElement get_processGrid_CellbyRowColNumber_Self(int rowNum,int colNum){
		return driver.findElement(By.xpath(processGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]")).findVisibleElement(By.xpath(processGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]"));
	}

	/*NuclearRecordTransferProcess->processGrid*/
	public WebElement get_processGrid_RowbyRowColNumber_Self(int rowNum,int colNum){
		return driver.findElement(By.xpath(processGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/..")).findVisibleElement(By.xpath(processGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/.."));
	}

	/*NuclearRecordTransferProcess->processGrid*/
	public WebElement get_processGrid_RowbyRowNumber_Self(int rowNum){
		return driver.findElement(By.xpath(processGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr")).findVisibleElement(By.xpath(processGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr"));
	}

	/*NuclearRecordTransferProcess->processGrid*/
	public WebElement get_processGrid_CellbyCellText_Self(String cellText){
		return driver.findElement(By.xpath(processGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']")).findVisibleElement(By.xpath(processGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']"));
	}

	/*NuclearRecordTransferProcess->processGrid*/
	public WebElement get_processGrid_RowbyCellText_Self(String cellText){
		return driver.findElement(By.xpath(processGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/..")).findVisibleElement(By.xpath(processGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/.."));
	}

	/*NuclearRecordTransferProcess->processGrid*/
	public WebElement get_processGrid_CellbyOtherInlineCellText_Self(String otherInlineCellText,String targetCellText){
		return driver.findElement(By.xpath(processGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']")).findVisibleElement(By.xpath(processGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']"));
	}

	/*NuclearRecordTransferProcess->processGrid*/
	public WebElement get_processGrid_CellbyColNameCellText_Self(String colName,String cellText){
		WebElement processGrid = driver.findElement(By.xpath(processGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../..")).findVisibleElement(By.xpath(processGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../.."));
		String idx=processGrid.getAttribute("idx");
		List<WebElement> Gridrows = driver.findAll(By.xpath(processGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]"));
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

}
