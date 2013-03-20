package com.ibm.CNNC.elements;

import java.util.*;
import org.openqa.selenium.*;
import com.selenium.utils.WebDriver;
import com.selenium.utils.WebElement;

/*catalog\widget\dm\sysmanage\schedulejob\templates\ScheduleJobConfig.html*/
public class ScheduleJobConfig {
	protected WebDriver driver;
	private static final String editBtn_XPath="//descendant::div[contains(@id,'ScheduleJobConfig')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"ÐÞ¸Ä"+"']";
	private static final String dDefaultGrid_XPath="//descendant::div[contains(@id,'ScheduleJobConfig')]/descendant::div[contains(@id,'DataGrid')]";

	//----Constructor Methods Begin----
	public ScheduleJobConfig(WebDriver driver){
		this.driver=driver;
	}

	/*ScheduleJobConfig->editBtn*/
	public void editBtn_click(){
		WebElement editBtn = driver.findElement(By.xpath(editBtn_XPath)).findVisibleElement(By.xpath(editBtn_XPath));
		editBtn.click();
	}

	/*ScheduleJobConfig->editBtn*/
	public WebElement get_editBtn_Self(){
		return driver.findElement(By.xpath(editBtn_XPath)).findVisibleElement(By.xpath(editBtn_XPath));
	}

	/*ScheduleJobConfig->defaultGrid*/
	public void dDefaultGrid_colCaptionClick(String captionName){
		WebElement dDefaultGrid = driver.findElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']")).findVisibleElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']"));
		dDefaultGrid.click();
	}

	/*ScheduleJobConfig->defaultGrid*/
	public void dDefaultGrid_selectCellbyRowColNumber(int rowNum,int colNum){
		WebElement dDefaultGrid = driver.findElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]")).findVisibleElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]"));
		dDefaultGrid.click();
	}

	/*ScheduleJobConfig->defaultGrid*/
	public void dDefaultGrid_selectRowbyRowColNumber(int rowNum,int colNum){
		WebElement dDefaultGrid = driver.findElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/..")).findVisibleElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/.."));
		dDefaultGrid.click();
	}

	/*ScheduleJobConfig->defaultGrid*/
	public void dDefaultGrid_selectRowbyRowNumber(int rowNum){
		WebElement dDefaultGrid = driver.findElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr")).findVisibleElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr"));
		dDefaultGrid.click();
	}

	/*ScheduleJobConfig->defaultGrid*/
	public void dDefaultGrid_selectCellbyCellText(String cellText){
		WebElement dDefaultGrid = driver.findElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']")).findVisibleElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']"));
		dDefaultGrid.click();
	}

	/*ScheduleJobConfig->defaultGrid*/
	public void dDefaultGrid_selectRowbyCellText(String cellText){
		WebElement dDefaultGrid = driver.findElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/..")).findVisibleElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/.."));
		dDefaultGrid.click();
	}

	/*ScheduleJobConfig->defaultGrid*/
	public void dDefaultGrid_selectCellbyOtherInlineCellText(String otherInlineCellText,String targetCellText){
		WebElement dDefaultGrid = driver.findElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']")).findVisibleElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']"));
		dDefaultGrid.click();
	}

	/*ScheduleJobConfig->defaultGrid*/
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

	/*ScheduleJobConfig->defaultGrid*/
	public WebElement get_dDefaultGrid_colCaption_Self(String captionName){
		return driver.findElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']")).findVisibleElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']"));
	}

	/*ScheduleJobConfig->defaultGrid*/
	public WebElement get_dDefaultGrid_CellbyRowColNumber_Self(int rowNum,int colNum){
		return driver.findElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]")).findVisibleElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]"));
	}

	/*ScheduleJobConfig->defaultGrid*/
	public WebElement get_dDefaultGrid_RowbyRowColNumber_Self(int rowNum,int colNum){
		return driver.findElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/..")).findVisibleElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/.."));
	}

	/*ScheduleJobConfig->defaultGrid*/
	public WebElement get_dDefaultGrid_RowbyRowNumber_Self(int rowNum){
		return driver.findElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr")).findVisibleElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr"));
	}

	/*ScheduleJobConfig->defaultGrid*/
	public WebElement get_dDefaultGrid_CellbyCellText_Self(String cellText){
		return driver.findElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']")).findVisibleElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']"));
	}

	/*ScheduleJobConfig->defaultGrid*/
	public WebElement get_dDefaultGrid_RowbyCellText_Self(String cellText){
		return driver.findElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/..")).findVisibleElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/.."));
	}

	/*ScheduleJobConfig->defaultGrid*/
	public WebElement get_dDefaultGrid_CellbyOtherInlineCellText_Self(String otherInlineCellText,String targetCellText){
		return driver.findElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']")).findVisibleElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']"));
	}

	/*ScheduleJobConfig->defaultGrid*/
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

}
