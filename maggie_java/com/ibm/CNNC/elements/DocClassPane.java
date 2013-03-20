package com.ibm.CNNC.elements;

import java.util.*;
import org.openqa.selenium.*;
import com.selenium.utils.WebDriver;
import com.selenium.utils.WebElement;

/*catalog\widget\dm\sysmanage\documentclassconfig\templates\DocClassPane.html*/
public class DocClassPane {
	protected WebDriver driver;
	private static final String Tabs_XPath="//descendant::div[contains(@id,'DocClassPane')]/descendant::div[contains(@id,'dijit_layout_TabContainer')]";
	private static final String updateClassNavTreeOrderButton_XPath="//descendant::div[contains(@id,'DocClassPane')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"保存文件分类排序"+"']";
	private static final String inheritGrid_XPath="//descendant::div[contains(@id,'DocClassPane')]/descendant::div[contains(@id,'EnhancedGrid')]";
	private static final String managePropButton_XPath="//descendant::div[contains(@id,'DocClassPane')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"管理属性"+"']";
	private static final String dDefaultGrid_XPath="//descendant::div[contains(@id,'DocClassPane')]/descendant::div[contains(@id,'DataGrid')]";

	//----Constructor Methods Begin----
	public DocClassPane(WebDriver driver){
		this.driver=driver;
	}

	/*DocClassPane->stackContainer*/
	public void Tabs_click(String tabName){
		WebElement Tabs = driver.findElement(By.xpath(Tabs_XPath+"/descendant::div[contains(@id,'tablist')]/descendant::div[contains(@class,'TabListWrapper')]/descendant::span[normalize-space(text())='"+tabName+"']")).findVisibleElement(By.xpath(Tabs_XPath+"/descendant::div[contains(@id,'tablist')]/descendant::div[contains(@class,'TabListWrapper')]/descendant::span[normalize-space(text())='"+tabName+"']"));
		Tabs.click();
	}

	/*DocClassPane->stackContainer*/
	public void Tabs_close(String tabName){
		WebElement Tabs = driver.findElement(By.xpath(Tabs_XPath+"/descendant::div[contains(@id,'tablist')]/descendant::div[contains(@class,'TabListWrapper')]/descendant::span[normalize-space(text())='"+tabName+"']/following-sibling::span[contains(@class,'TabCloseButton')]")).findVisibleElement(By.xpath(Tabs_XPath+"/descendant::div[contains(@id,'tablist')]/descendant::div[contains(@class,'TabListWrapper')]/descendant::span[normalize-space(text())='"+tabName+"']/following-sibling::span[contains(@class,'TabCloseButton')]"));
		Tabs.click();
	}

	/*DocClassPane->stackContainer*/
	public WebElement get_Tabs_Self(String tabName){
		return driver.findElement(By.xpath(Tabs_XPath+"/descendant::div[contains(@id,'tablist')]/descendant::div[contains(@class,'TabListWrapper')]/descendant::span[normalize-space(text())='"+tabName+"']")).findVisibleElement(By.xpath(Tabs_XPath+"/descendant::div[contains(@id,'tablist')]/descendant::div[contains(@class,'TabListWrapper')]/descendant::span[normalize-space(text())='"+tabName+"']"));
	}

	/*DocClassPane->stackContainer*/
	public WebElement get_Tabsclose_Self(String tabName){
		return driver.findElement(By.xpath(Tabs_XPath+"/descendant::div[contains(@id,'tablist')]/descendant::div[contains(@class,'TabListWrapper')]/descendant::span[normalize-space(text())='"+tabName+"']/following-sibling::span[contains(@class,'TabCloseButton')]")).findVisibleElement(By.xpath(Tabs_XPath+"/descendant::div[contains(@id,'tablist')]/descendant::div[contains(@class,'TabListWrapper')]/descendant::span[normalize-space(text())='"+tabName+"']/following-sibling::span[contains(@class,'TabCloseButton')]"));
	}

	/*DocClassPane->updateClassNavTreeOrderButton*/
	public void updateClassNavTreeOrderButton_click(){
		WebElement updateClassNavTreeOrderButton = driver.findElement(By.xpath(updateClassNavTreeOrderButton_XPath)).findVisibleElement(By.xpath(updateClassNavTreeOrderButton_XPath));
		updateClassNavTreeOrderButton.click();
	}

	/*DocClassPane->updateClassNavTreeOrderButton*/
	public WebElement get_updateClassNavTreeOrderButton_Self(){
		return driver.findElement(By.xpath(updateClassNavTreeOrderButton_XPath)).findVisibleElement(By.xpath(updateClassNavTreeOrderButton_XPath));
	}

	/*DocClassPane->inheritGrid*/
	public void inheritGrid_colCaptionClick(String captionName){
		WebElement inheritGrid = driver.findElement(By.xpath(inheritGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']")).findVisibleElement(By.xpath(inheritGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']"));
		inheritGrid.click();
	}

	/*DocClassPane->inheritGrid*/
	public void inheritGrid_selectCellbyRowColNumber(int rowNum,int colNum){
		WebElement inheritGrid = driver.findElement(By.xpath(inheritGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]")).findVisibleElement(By.xpath(inheritGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]"));
		inheritGrid.click();
	}

	/*DocClassPane->inheritGrid*/
	public void inheritGrid_selectRowbyRowColNumber(int rowNum,int colNum){
		WebElement inheritGrid = driver.findElement(By.xpath(inheritGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/..")).findVisibleElement(By.xpath(inheritGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/.."));
		inheritGrid.click();
	}

	/*DocClassPane->inheritGrid*/
	public void inheritGrid_selectRowbyRowNumber(int rowNum){
		WebElement inheritGrid = driver.findElement(By.xpath(inheritGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr")).findVisibleElement(By.xpath(inheritGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr"));
		inheritGrid.click();
	}

	/*DocClassPane->inheritGrid*/
	public void inheritGrid_selectCellbyCellText(String cellText){
		WebElement inheritGrid = driver.findElement(By.xpath(inheritGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']")).findVisibleElement(By.xpath(inheritGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']"));
		inheritGrid.click();
	}

	/*DocClassPane->inheritGrid*/
	public void inheritGrid_selectRowbyCellText(String cellText){
		WebElement inheritGrid = driver.findElement(By.xpath(inheritGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/..")).findVisibleElement(By.xpath(inheritGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/.."));
		inheritGrid.click();
	}

	/*DocClassPane->inheritGrid*/
	public void inheritGrid_selectCellbyOtherInlineCellText(String otherInlineCellText,String targetCellText){
		WebElement inheritGrid = driver.findElement(By.xpath(inheritGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']")).findVisibleElement(By.xpath(inheritGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']"));
		inheritGrid.click();
	}

	/*DocClassPane->inheritGrid*/
	public void inheritGrid_selectCellbyColNameCellText(String colName,String cellText){
		WebElement inheritGrid = driver.findElement(By.xpath(inheritGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../..")).findVisibleElement(By.xpath(inheritGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../.."));
		String idx=inheritGrid.getAttribute("idx");
		List<WebElement> Gridrows = driver.findAll(By.xpath(inheritGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]"));
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

	/*DocClassPane->inheritGrid*/
	public WebElement get_inheritGrid_colCaption_Self(String captionName){
		return driver.findElement(By.xpath(inheritGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']")).findVisibleElement(By.xpath(inheritGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']"));
	}

	/*DocClassPane->inheritGrid*/
	public WebElement get_inheritGrid_CellbyRowColNumber_Self(int rowNum,int colNum){
		return driver.findElement(By.xpath(inheritGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]")).findVisibleElement(By.xpath(inheritGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]"));
	}

	/*DocClassPane->inheritGrid*/
	public WebElement get_inheritGrid_RowbyRowColNumber_Self(int rowNum,int colNum){
		return driver.findElement(By.xpath(inheritGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/..")).findVisibleElement(By.xpath(inheritGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/.."));
	}

	/*DocClassPane->inheritGrid*/
	public WebElement get_inheritGrid_RowbyRowNumber_Self(int rowNum){
		return driver.findElement(By.xpath(inheritGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr")).findVisibleElement(By.xpath(inheritGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr"));
	}

	/*DocClassPane->inheritGrid*/
	public WebElement get_inheritGrid_CellbyCellText_Self(String cellText){
		return driver.findElement(By.xpath(inheritGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']")).findVisibleElement(By.xpath(inheritGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']"));
	}

	/*DocClassPane->inheritGrid*/
	public WebElement get_inheritGrid_RowbyCellText_Self(String cellText){
		return driver.findElement(By.xpath(inheritGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/..")).findVisibleElement(By.xpath(inheritGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/.."));
	}

	/*DocClassPane->inheritGrid*/
	public WebElement get_inheritGrid_CellbyOtherInlineCellText_Self(String otherInlineCellText,String targetCellText){
		return driver.findElement(By.xpath(inheritGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']")).findVisibleElement(By.xpath(inheritGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']"));
	}

	/*DocClassPane->inheritGrid*/
	public WebElement get_inheritGrid_CellbyColNameCellText_Self(String colName,String cellText){
		WebElement inheritGrid = driver.findElement(By.xpath(inheritGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../..")).findVisibleElement(By.xpath(inheritGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../.."));
		String idx=inheritGrid.getAttribute("idx");
		List<WebElement> Gridrows = driver.findAll(By.xpath(inheritGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]"));
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

	/*DocClassPane->managePropButton*/
	public void managePropButton_click(){
		WebElement managePropButton = driver.findElement(By.xpath(managePropButton_XPath)).findVisibleElement(By.xpath(managePropButton_XPath));
		managePropButton.click();
	}

	/*DocClassPane->managePropButton*/
	public WebElement get_managePropButton_Self(){
		return driver.findElement(By.xpath(managePropButton_XPath)).findVisibleElement(By.xpath(managePropButton_XPath));
	}

	/*DocClassPane->defaultGrid*/
	public void dDefaultGrid_colCaptionClick(String captionName){
		WebElement dDefaultGrid = driver.findElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']")).findVisibleElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']"));
		dDefaultGrid.click();
	}

	/*DocClassPane->defaultGrid*/
	public void dDefaultGrid_selectCellbyRowColNumber(int rowNum,int colNum){
		WebElement dDefaultGrid = driver.findElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]")).findVisibleElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]"));
		dDefaultGrid.click();
	}

	/*DocClassPane->defaultGrid*/
	public void dDefaultGrid_selectRowbyRowColNumber(int rowNum,int colNum){
		WebElement dDefaultGrid = driver.findElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/..")).findVisibleElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/.."));
		dDefaultGrid.click();
	}

	/*DocClassPane->defaultGrid*/
	public void dDefaultGrid_selectRowbyRowNumber(int rowNum){
		WebElement dDefaultGrid = driver.findElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr")).findVisibleElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr"));
		dDefaultGrid.click();
	}

	/*DocClassPane->defaultGrid*/
	public void dDefaultGrid_selectCellbyCellText(String cellText){
		WebElement dDefaultGrid = driver.findElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']")).findVisibleElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']"));
		dDefaultGrid.click();
	}

	/*DocClassPane->defaultGrid*/
	public void dDefaultGrid_selectRowbyCellText(String cellText){
		WebElement dDefaultGrid = driver.findElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/..")).findVisibleElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/.."));
		dDefaultGrid.click();
	}

	/*DocClassPane->defaultGrid*/
	public void dDefaultGrid_selectCellbyOtherInlineCellText(String otherInlineCellText,String targetCellText){
		WebElement dDefaultGrid = driver.findElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']")).findVisibleElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']"));
		dDefaultGrid.click();
	}

	/*DocClassPane->defaultGrid*/
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

	/*DocClassPane->defaultGrid*/
	public WebElement get_dDefaultGrid_colCaption_Self(String captionName){
		return driver.findElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']")).findVisibleElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']"));
	}

	/*DocClassPane->defaultGrid*/
	public WebElement get_dDefaultGrid_CellbyRowColNumber_Self(int rowNum,int colNum){
		return driver.findElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]")).findVisibleElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]"));
	}

	/*DocClassPane->defaultGrid*/
	public WebElement get_dDefaultGrid_RowbyRowColNumber_Self(int rowNum,int colNum){
		return driver.findElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/..")).findVisibleElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/.."));
	}

	/*DocClassPane->defaultGrid*/
	public WebElement get_dDefaultGrid_RowbyRowNumber_Self(int rowNum){
		return driver.findElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr")).findVisibleElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr"));
	}

	/*DocClassPane->defaultGrid*/
	public WebElement get_dDefaultGrid_CellbyCellText_Self(String cellText){
		return driver.findElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']")).findVisibleElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']"));
	}

	/*DocClassPane->defaultGrid*/
	public WebElement get_dDefaultGrid_RowbyCellText_Self(String cellText){
		return driver.findElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/..")).findVisibleElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/.."));
	}

	/*DocClassPane->defaultGrid*/
	public WebElement get_dDefaultGrid_CellbyOtherInlineCellText_Self(String otherInlineCellText,String targetCellText){
		return driver.findElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']")).findVisibleElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']"));
	}

	/*DocClassPane->defaultGrid*/
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
