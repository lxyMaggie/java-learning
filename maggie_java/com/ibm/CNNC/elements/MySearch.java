package com.ibm.CNNC.elements;

import java.util.*;
import org.openqa.selenium.*;
import com.selenium.utils.WebDriver;
import com.selenium.utils.WebElement;

/*catalog\widget\dm\searchuse\mysearch\templates\MySearch.html*/
public class MySearch {
	protected WebDriver driver;
	private static final String grid_XPath="//descendant::div[contains(@id,'MySearch')]/descendant::div[contains(@id,'EnhancedGrid')]";

	//----Constructor Methods Begin----
	public MySearch(WebDriver driver){
		this.driver=driver;
	}

	/*MySearch->grid*/
	public void grid_colCaptionClick(String captionName){
		WebElement grid = driver.findElement(By.xpath(grid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']")).findVisibleElement(By.xpath(grid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']"));
		grid.click();
	}

	/*MySearch->grid*/
	public void grid_selectCellbyRowColNumber(int rowNum,int colNum){
		WebElement grid = driver.findElement(By.xpath(grid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]")).findVisibleElement(By.xpath(grid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]"));
		grid.click();
	}

	/*MySearch->grid*/
	public void grid_selectRowbyRowColNumber(int rowNum,int colNum){
		WebElement grid = driver.findElement(By.xpath(grid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/..")).findVisibleElement(By.xpath(grid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/.."));
		grid.click();
	}

	/*MySearch->grid*/
	public void grid_selectRowbyRowNumber(int rowNum){
		WebElement grid = driver.findElement(By.xpath(grid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr")).findVisibleElement(By.xpath(grid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr"));
		grid.click();
	}

	/*MySearch->grid*/
	public void grid_selectCellbyCellText(String cellText){
		WebElement grid = driver.findElement(By.xpath(grid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']")).findVisibleElement(By.xpath(grid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']"));
		grid.click();
	}

	/*MySearch->grid*/
	public void grid_selectRowbyCellText(String cellText){
		WebElement grid = driver.findElement(By.xpath(grid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/..")).findVisibleElement(By.xpath(grid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/.."));
		grid.click();
	}

	/*MySearch->grid*/
	public void grid_selectCellbyOtherInlineCellText(String otherInlineCellText,String targetCellText){
		WebElement grid = driver.findElement(By.xpath(grid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']")).findVisibleElement(By.xpath(grid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']"));
		grid.click();
	}

	/*MySearch->grid*/
	public void grid_selectCellbyColNameCellText(String colName,String cellText){
		WebElement grid = driver.findElement(By.xpath(grid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../..")).findVisibleElement(By.xpath(grid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../.."));
		String idx=grid.getAttribute("idx");
		List<WebElement> Gridrows = driver.findAll(By.xpath(grid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]"));
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

	/*MySearch->grid*/
	public WebElement get_grid_colCaption_Self(String captionName){
		return driver.findElement(By.xpath(grid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']")).findVisibleElement(By.xpath(grid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']"));
	}

	/*MySearch->grid*/
	public WebElement get_grid_CellbyRowColNumber_Self(int rowNum,int colNum){
		return driver.findElement(By.xpath(grid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]")).findVisibleElement(By.xpath(grid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]"));
	}

	/*MySearch->grid*/
	public WebElement get_grid_RowbyRowColNumber_Self(int rowNum,int colNum){
		return driver.findElement(By.xpath(grid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/..")).findVisibleElement(By.xpath(grid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/.."));
	}

	/*MySearch->grid*/
	public WebElement get_grid_RowbyRowNumber_Self(int rowNum){
		return driver.findElement(By.xpath(grid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr")).findVisibleElement(By.xpath(grid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr"));
	}

	/*MySearch->grid*/
	public WebElement get_grid_CellbyCellText_Self(String cellText){
		return driver.findElement(By.xpath(grid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']")).findVisibleElement(By.xpath(grid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']"));
	}

	/*MySearch->grid*/
	public WebElement get_grid_RowbyCellText_Self(String cellText){
		return driver.findElement(By.xpath(grid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/..")).findVisibleElement(By.xpath(grid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/.."));
	}

	/*MySearch->grid*/
	public WebElement get_grid_CellbyOtherInlineCellText_Self(String otherInlineCellText,String targetCellText){
		return driver.findElement(By.xpath(grid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']")).findVisibleElement(By.xpath(grid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']"));
	}

	/*MySearch->grid*/
	public WebElement get_grid_CellbyColNameCellText_Self(String colName,String cellText){
		WebElement grid = driver.findElement(By.xpath(grid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../..")).findVisibleElement(By.xpath(grid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../.."));
		String idx=grid.getAttribute("idx");
		List<WebElement> Gridrows = driver.findAll(By.xpath(grid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]"));
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
