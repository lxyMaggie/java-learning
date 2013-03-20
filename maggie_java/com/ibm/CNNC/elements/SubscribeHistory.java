package com.ibm.CNNC.elements;

import java.util.*;
import org.openqa.selenium.*;
import com.selenium.utils.WebDriver;
import com.selenium.utils.WebElement;

/*catalog\widget\dm\searchuse\subscribehistory\templates\SubscribeHistory.html*/
public class SubscribeHistory {
	protected WebDriver driver;
	private static final String subcriptionListGrid_XPath="//descendant::div[contains(@id,'SubscribeHistory')]/descendant::div[contains(@id,'DataGrid')]";

	//----Constructor Methods Begin----
	public SubscribeHistory(WebDriver driver){
		this.driver=driver;
	}

	/*SubscribeHistory->subcriptionListGrid*/
	public void subcriptionListGrid_colCaptionClick(String captionName){
		WebElement subcriptionListGrid = driver.findElement(By.xpath(subcriptionListGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']")).findVisibleElement(By.xpath(subcriptionListGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']"));
		subcriptionListGrid.click();
	}

	/*SubscribeHistory->subcriptionListGrid*/
	public void subcriptionListGrid_selectCellbyRowColNumber(int rowNum,int colNum){
		WebElement subcriptionListGrid = driver.findElement(By.xpath(subcriptionListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]")).findVisibleElement(By.xpath(subcriptionListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]"));
		subcriptionListGrid.click();
	}

	/*SubscribeHistory->subcriptionListGrid*/
	public void subcriptionListGrid_selectRowbyRowColNumber(int rowNum,int colNum){
		WebElement subcriptionListGrid = driver.findElement(By.xpath(subcriptionListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/..")).findVisibleElement(By.xpath(subcriptionListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/.."));
		subcriptionListGrid.click();
	}

	/*SubscribeHistory->subcriptionListGrid*/
	public void subcriptionListGrid_selectRowbyRowNumber(int rowNum){
		WebElement subcriptionListGrid = driver.findElement(By.xpath(subcriptionListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr")).findVisibleElement(By.xpath(subcriptionListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr"));
		subcriptionListGrid.click();
	}

	/*SubscribeHistory->subcriptionListGrid*/
	public void subcriptionListGrid_selectCellbyCellText(String cellText){
		WebElement subcriptionListGrid = driver.findElement(By.xpath(subcriptionListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']")).findVisibleElement(By.xpath(subcriptionListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']"));
		subcriptionListGrid.click();
	}

	/*SubscribeHistory->subcriptionListGrid*/
	public void subcriptionListGrid_selectRowbyCellText(String cellText){
		WebElement subcriptionListGrid = driver.findElement(By.xpath(subcriptionListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/..")).findVisibleElement(By.xpath(subcriptionListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/.."));
		subcriptionListGrid.click();
	}

	/*SubscribeHistory->subcriptionListGrid*/
	public void subcriptionListGrid_selectCellbyOtherInlineCellText(String otherInlineCellText,String targetCellText){
		WebElement subcriptionListGrid = driver.findElement(By.xpath(subcriptionListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']")).findVisibleElement(By.xpath(subcriptionListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']"));
		subcriptionListGrid.click();
	}

	/*SubscribeHistory->subcriptionListGrid*/
	public void subcriptionListGrid_selectCellbyColNameCellText(String colName,String cellText){
		WebElement subcriptionListGrid = driver.findElement(By.xpath(subcriptionListGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../..")).findVisibleElement(By.xpath(subcriptionListGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../.."));
		String idx=subcriptionListGrid.getAttribute("idx");
		List<WebElement> Gridrows = driver.findAll(By.xpath(subcriptionListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]"));
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

	/*SubscribeHistory->subcriptionListGrid*/
	public WebElement get_subcriptionListGrid_colCaption_Self(String captionName){
		return driver.findElement(By.xpath(subcriptionListGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']")).findVisibleElement(By.xpath(subcriptionListGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']"));
	}

	/*SubscribeHistory->subcriptionListGrid*/
	public WebElement get_subcriptionListGrid_CellbyRowColNumber_Self(int rowNum,int colNum){
		return driver.findElement(By.xpath(subcriptionListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]")).findVisibleElement(By.xpath(subcriptionListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]"));
	}

	/*SubscribeHistory->subcriptionListGrid*/
	public WebElement get_subcriptionListGrid_RowbyRowColNumber_Self(int rowNum,int colNum){
		return driver.findElement(By.xpath(subcriptionListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/..")).findVisibleElement(By.xpath(subcriptionListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/.."));
	}

	/*SubscribeHistory->subcriptionListGrid*/
	public WebElement get_subcriptionListGrid_RowbyRowNumber_Self(int rowNum){
		return driver.findElement(By.xpath(subcriptionListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr")).findVisibleElement(By.xpath(subcriptionListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr"));
	}

	/*SubscribeHistory->subcriptionListGrid*/
	public WebElement get_subcriptionListGrid_CellbyCellText_Self(String cellText){
		return driver.findElement(By.xpath(subcriptionListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']")).findVisibleElement(By.xpath(subcriptionListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']"));
	}

	/*SubscribeHistory->subcriptionListGrid*/
	public WebElement get_subcriptionListGrid_RowbyCellText_Self(String cellText){
		return driver.findElement(By.xpath(subcriptionListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/..")).findVisibleElement(By.xpath(subcriptionListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/.."));
	}

	/*SubscribeHistory->subcriptionListGrid*/
	public WebElement get_subcriptionListGrid_CellbyOtherInlineCellText_Self(String otherInlineCellText,String targetCellText){
		return driver.findElement(By.xpath(subcriptionListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']")).findVisibleElement(By.xpath(subcriptionListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']"));
	}

	/*SubscribeHistory->subcriptionListGrid*/
	public WebElement get_subcriptionListGrid_CellbyColNameCellText_Self(String colName,String cellText){
		WebElement subcriptionListGrid = driver.findElement(By.xpath(subcriptionListGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../..")).findVisibleElement(By.xpath(subcriptionListGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../.."));
		String idx=subcriptionListGrid.getAttribute("idx");
		List<WebElement> Gridrows = driver.findAll(By.xpath(subcriptionListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]"));
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
