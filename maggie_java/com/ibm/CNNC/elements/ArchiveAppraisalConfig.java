package com.ibm.CNNC.elements;

import java.util.*;
import org.openqa.selenium.*;
import com.selenium.utils.WebDriver;
import com.selenium.utils.WebElement;

/*catalog\widget\dm\sysmanage\archiveappraisalconfig\templates\ArchiveAppraisalConfig.html*/
public class ArchiveAppraisalConfig {
	protected WebDriver driver;
	private static final String dDefaultGrid_XPath="//descendant::div[contains(@id,'ArchiveAppraisalConfig')]/descendant::div[contains(@id,'DataGrid')]";
	private static final String syncBtn_XPath="//descendant::div[contains(@id,'ArchiveAppraisalConfig')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"立即同步"+"']";
	private static final String saveBtn_XPath="//descendant::div[contains(@id,'ArchiveAppraisalConfig')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"保存"+"']";

	//----Constructor Methods Begin----
	public ArchiveAppraisalConfig(WebDriver driver){
		this.driver=driver;
	}

	/*ArchiveAppraisalConfig->defaultGrid*/
	public void dDefaultGrid_colCaptionClick(String captionName){
		WebElement dDefaultGrid = driver.findElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']")).findVisibleElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']"));
		dDefaultGrid.click();
	}

	/*ArchiveAppraisalConfig->defaultGrid*/
	public void dDefaultGrid_selectCellbyRowColNumber(int rowNum,int colNum){
		WebElement dDefaultGrid = driver.findElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]")).findVisibleElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]"));
		dDefaultGrid.click();
	}

	/*ArchiveAppraisalConfig->defaultGrid*/
	public void dDefaultGrid_selectRowbyRowColNumber(int rowNum,int colNum){
		WebElement dDefaultGrid = driver.findElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/..")).findVisibleElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/.."));
		dDefaultGrid.click();
	}

	/*ArchiveAppraisalConfig->defaultGrid*/
	public void dDefaultGrid_selectRowbyRowNumber(int rowNum){
		WebElement dDefaultGrid = driver.findElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr")).findVisibleElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr"));
		dDefaultGrid.click();
	}

	/*ArchiveAppraisalConfig->defaultGrid*/
	public void dDefaultGrid_selectCellbyCellText(String cellText){
		WebElement dDefaultGrid = driver.findElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']")).findVisibleElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']"));
		dDefaultGrid.click();
	}

	/*ArchiveAppraisalConfig->defaultGrid*/
	public void dDefaultGrid_selectRowbyCellText(String cellText){
		WebElement dDefaultGrid = driver.findElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/..")).findVisibleElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/.."));
		dDefaultGrid.click();
	}

	/*ArchiveAppraisalConfig->defaultGrid*/
	public void dDefaultGrid_selectCellbyOtherInlineCellText(String otherInlineCellText,String targetCellText){
		WebElement dDefaultGrid = driver.findElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']")).findVisibleElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']"));
		dDefaultGrid.click();
	}

	/*ArchiveAppraisalConfig->defaultGrid*/
	public void dDefaultGrid_selectCellbyColNameCellText(String colName,String cellText){
		WebElement dDefaultGrid = driver.findElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../..")).findVisibleElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../.."));
		String idx=dDefaultGrid.getAttribute("idx");
		List<WebElement> Gridrows = driver.findAll(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]"));
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

	/*ArchiveAppraisalConfig->defaultGrid*/
	public WebElement get_dDefaultGrid_colCaption_Self(String captionName){
		return driver.findElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']")).findVisibleElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']"));
	}

	/*ArchiveAppraisalConfig->defaultGrid*/
	public WebElement get_dDefaultGrid_CellbyRowColNumber_Self(int rowNum,int colNum){
		return driver.findElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]")).findVisibleElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]"));
	}

	/*ArchiveAppraisalConfig->defaultGrid*/
	public WebElement get_dDefaultGrid_RowbyRowColNumber_Self(int rowNum,int colNum){
		return driver.findElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/..")).findVisibleElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/.."));
	}

	/*ArchiveAppraisalConfig->defaultGrid*/
	public WebElement get_dDefaultGrid_RowbyRowNumber_Self(int rowNum){
		return driver.findElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr")).findVisibleElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr"));
	}

	/*ArchiveAppraisalConfig->defaultGrid*/
	public WebElement get_dDefaultGrid_CellbyCellText_Self(String cellText){
		return driver.findElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']")).findVisibleElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']"));
	}

	/*ArchiveAppraisalConfig->defaultGrid*/
	public WebElement get_dDefaultGrid_RowbyCellText_Self(String cellText){
		return driver.findElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/..")).findVisibleElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/.."));
	}

	/*ArchiveAppraisalConfig->defaultGrid*/
	public WebElement get_dDefaultGrid_CellbyOtherInlineCellText_Self(String otherInlineCellText,String targetCellText){
		return driver.findElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']")).findVisibleElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']"));
	}

	/*ArchiveAppraisalConfig->defaultGrid*/
	public WebElement get_dDefaultGrid_CellbyColNameCellText_Self(String colName,String cellText){
		WebElement dDefaultGrid = driver.findElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../..")).findVisibleElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../.."));
		String idx=dDefaultGrid.getAttribute("idx");
		List<WebElement> Gridrows = driver.findAll(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]"));
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

	/*ArchiveAppraisalConfig->syncBtn*/
	public void syncBtn_click(){
		WebElement syncBtn = driver.findElement(By.xpath(syncBtn_XPath)).findVisibleElement(By.xpath(syncBtn_XPath));
		syncBtn.click();
	}

	/*ArchiveAppraisalConfig->syncBtn*/
	public WebElement get_syncBtn_Self(){
		return driver.findElement(By.xpath(syncBtn_XPath)).findVisibleElement(By.xpath(syncBtn_XPath));
	}

	/*ArchiveAppraisalConfig->saveBtn*/
	public void saveBtn_click(){
		WebElement saveBtn = driver.findElement(By.xpath(saveBtn_XPath)).findVisibleElement(By.xpath(saveBtn_XPath));
		saveBtn.click();
	}

	/*ArchiveAppraisalConfig->saveBtn*/
	public WebElement get_saveBtn_Self(){
		return driver.findElement(By.xpath(saveBtn_XPath)).findVisibleElement(By.xpath(saveBtn_XPath));
	}

}
