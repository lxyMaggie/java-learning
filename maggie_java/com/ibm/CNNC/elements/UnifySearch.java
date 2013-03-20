package com.ibm.CNNC.elements;

import java.util.*;
import org.openqa.selenium.*;
import com.selenium.utils.WebDriver;
import com.selenium.utils.WebElement;

/*catalog\widget\dm\searchuse/unifysearch\templates\UnifySearch.html*/
public class UnifySearch {
	protected WebDriver driver;
	private static final String grid_XPath="//descendant::div[contains(@id,'UnifySearch')]/descendant::*[contains(@id,'GridSearchPlatform')]/descendant::div[contains(@id,'EnhancedGrid')]";
	private static final String timeSort_XPath="//descendant::div[contains(@id,'UnifySearch')]/descendant::*[contains(@id,'SearchPlatform')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"时间"+"']";
	private static final String downloadSort_XPath="//descendant::div[contains(@id,'UnifySearch')]/descendant::*[contains(@id,'SearchPlatform')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"下载量"+"']";
	private static final String codeSort_XPath="//descendant::div[contains(@id,'UnifySearch')]/descendant::*[contains(@id,'SearchPlatform')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"文件代码"+"']";

	//----Constructor Methods Begin----
	public UnifySearch(WebDriver driver){
		this.driver=driver;
	}

	/*UnifySearch->GridSearchPlatform->grid*/
	public void grid_colCaptionClick(String captionName){
		WebElement grid = driver.findElement(By.xpath(grid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']")).findVisibleElement(By.xpath(grid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']"));
		grid.click();
	}

	/*UnifySearch->GridSearchPlatform->grid*/
	public void grid_selectCellbyRowColNumber(int rowNum,int colNum){
		WebElement grid = driver.findElement(By.xpath(grid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]")).findVisibleElement(By.xpath(grid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]"));
		grid.click();
	}

	/*UnifySearch->GridSearchPlatform->grid*/
	public void grid_selectRowbyRowColNumber(int rowNum,int colNum){
		WebElement grid = driver.findElement(By.xpath(grid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/..")).findVisibleElement(By.xpath(grid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/.."));
		grid.click();
	}

	/*UnifySearch->GridSearchPlatform->grid*/
	public void grid_selectRowbyRowNumber(int rowNum){
		WebElement grid = driver.findElement(By.xpath(grid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr")).findVisibleElement(By.xpath(grid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr"));
		grid.click();
	}

	/*UnifySearch->GridSearchPlatform->grid*/
	public void grid_selectCellbyCellText(String cellText){
		WebElement grid = driver.findElement(By.xpath(grid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']")).findVisibleElement(By.xpath(grid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']"));
		grid.click();
	}

	/*UnifySearch->GridSearchPlatform->grid*/
	public void grid_selectRowbyCellText(String cellText){
		WebElement grid = driver.findElement(By.xpath(grid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/..")).findVisibleElement(By.xpath(grid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/.."));
		grid.click();
	}

	/*UnifySearch->GridSearchPlatform->grid*/
	public void grid_selectCellbyOtherInlineCellText(String otherInlineCellText,String targetCellText){
		WebElement grid = driver.findElement(By.xpath(grid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']")).findVisibleElement(By.xpath(grid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']"));
		grid.click();
	}

	/*UnifySearch->GridSearchPlatform->grid*/
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

	/*UnifySearch->GridSearchPlatform->grid*/
	public WebElement get_grid_colCaption_Self(String captionName){
		return driver.findElement(By.xpath(grid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']")).findVisibleElement(By.xpath(grid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']"));
	}

	/*UnifySearch->GridSearchPlatform->grid*/
	public WebElement get_grid_CellbyRowColNumber_Self(int rowNum,int colNum){
		return driver.findElement(By.xpath(grid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]")).findVisibleElement(By.xpath(grid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]"));
	}

	/*UnifySearch->GridSearchPlatform->grid*/
	public WebElement get_grid_RowbyRowColNumber_Self(int rowNum,int colNum){
		return driver.findElement(By.xpath(grid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/..")).findVisibleElement(By.xpath(grid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/.."));
	}

	/*UnifySearch->GridSearchPlatform->grid*/
	public WebElement get_grid_RowbyRowNumber_Self(int rowNum){
		return driver.findElement(By.xpath(grid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr")).findVisibleElement(By.xpath(grid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr"));
	}

	/*UnifySearch->GridSearchPlatform->grid*/
	public WebElement get_grid_CellbyCellText_Self(String cellText){
		return driver.findElement(By.xpath(grid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']")).findVisibleElement(By.xpath(grid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']"));
	}

	/*UnifySearch->GridSearchPlatform->grid*/
	public WebElement get_grid_RowbyCellText_Self(String cellText){
		return driver.findElement(By.xpath(grid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/..")).findVisibleElement(By.xpath(grid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/.."));
	}

	/*UnifySearch->GridSearchPlatform->grid*/
	public WebElement get_grid_CellbyOtherInlineCellText_Self(String otherInlineCellText,String targetCellText){
		return driver.findElement(By.xpath(grid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']")).findVisibleElement(By.xpath(grid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']"));
	}

	/*UnifySearch->GridSearchPlatform->grid*/
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

	/*UnifySearch->SearchPlatform->timeSort*/
	public void timeSort_click(){
		WebElement timeSort = driver.findElement(By.xpath(timeSort_XPath)).findVisibleElement(By.xpath(timeSort_XPath));
		timeSort.click();
	}

	/*UnifySearch->SearchPlatform->timeSort*/
	public WebElement get_timeSort_Self(){
		return driver.findElement(By.xpath(timeSort_XPath)).findVisibleElement(By.xpath(timeSort_XPath));
	}

	/*UnifySearch->SearchPlatform->downloadSort*/
	public void downloadSort_click(){
		WebElement downloadSort = driver.findElement(By.xpath(downloadSort_XPath)).findVisibleElement(By.xpath(downloadSort_XPath));
		downloadSort.click();
	}

	/*UnifySearch->SearchPlatform->downloadSort*/
	public WebElement get_downloadSort_Self(){
		return driver.findElement(By.xpath(downloadSort_XPath)).findVisibleElement(By.xpath(downloadSort_XPath));
	}

	/*UnifySearch->SearchPlatform->codeSort*/
	public void codeSort_click(){
		WebElement codeSort = driver.findElement(By.xpath(codeSort_XPath)).findVisibleElement(By.xpath(codeSort_XPath));
		codeSort.click();
	}

	/*UnifySearch->SearchPlatform->codeSort*/
	public WebElement get_codeSort_Self(){
		return driver.findElement(By.xpath(codeSort_XPath)).findVisibleElement(By.xpath(codeSort_XPath));
	}

}
