package com.ibm.CNNC.elements;

import java.util.*;
import org.openqa.selenium.*;
import com.selenium.utils.WebDriver;
import com.selenium.utils.WebElement;

/*catalog\widget\dm\sysmanage\documentclassconfig\templates\ManageDocClassProps.html*/
public class ManageDocClassProps {
	protected WebDriver driver;
	private static final String allPropGrid_XPath="//descendant::div[contains(@id,'ManageDocClassProps')]/descendant::div[contains(@id,'EnhancedGrid')]";
	private static final String okButton_XPath="//descendant::div[contains(@id,'ManageDocClassProps')]/descendant::span[contains(@id,'ManageDocClassProps')][contains(@id,'_OKButton')][contains(@id, 'Button')][normalize-space(text())='"+"确定"+"']";
	private static final String cancelButton_XPath="//descendant::div[contains(@id,'ManageDocClassProps')]/descendant::span[contains(@id,'ManageDocClassProps')][contains(@id,'_CancelButton')][contains(@id, 'Button')][normalize-space(text())='"+"取消"+"']";
	private static final String addButton_XPath="//descendant::div[contains(@id,'ManageDocClassProps')]/descendant::span[contains(@id,'ManageDocClassProps')][contains(@id,'_AddButton')][contains(@id, 'Button')][normalize-space(text())='"+"&gt;&gt;"+"']";
	private static final String removeButton_XPath="//descendant::div[contains(@id,'ManageDocClassProps')]/descendant::span[contains(@id,'ManageDocClassProps')][contains(@id,'_RemoveButton')][contains(@id, 'Button')][normalize-space(text())='"+"&lt;&lt;"+"']";
	private static final String currentPropGrid_XPath="//descendant::div[contains(@id,'ManageDocClassProps')]/descendant::div[contains(@id,'DataGrid')]";

	//----Constructor Methods Begin----
	public ManageDocClassProps(WebDriver driver){
		this.driver=driver;
	}

	/*ManageDocClassProps->allPropGrid*/
	public void allPropGrid_colCaptionClick(String captionName){
		WebElement allPropGrid = driver.findElement(By.xpath(allPropGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']")).findVisibleElement(By.xpath(allPropGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']"));
		allPropGrid.click();
	}

	/*ManageDocClassProps->allPropGrid*/
	public void allPropGrid_selectCellbyRowColNumber(int rowNum,int colNum){
		WebElement allPropGrid = driver.findElement(By.xpath(allPropGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]")).findVisibleElement(By.xpath(allPropGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]"));
		allPropGrid.click();
	}

	/*ManageDocClassProps->allPropGrid*/
	public void allPropGrid_selectRowbyRowColNumber(int rowNum,int colNum){
		WebElement allPropGrid = driver.findElement(By.xpath(allPropGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/..")).findVisibleElement(By.xpath(allPropGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/.."));
		allPropGrid.click();
	}

	/*ManageDocClassProps->allPropGrid*/
	public void allPropGrid_selectRowbyRowNumber(int rowNum){
		WebElement allPropGrid = driver.findElement(By.xpath(allPropGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr")).findVisibleElement(By.xpath(allPropGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr"));
		allPropGrid.click();
	}

	/*ManageDocClassProps->allPropGrid*/
	public void allPropGrid_selectCellbyCellText(String cellText){
		WebElement allPropGrid = driver.findElement(By.xpath(allPropGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']")).findVisibleElement(By.xpath(allPropGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']"));
		allPropGrid.click();
	}

	/*ManageDocClassProps->allPropGrid*/
	public void allPropGrid_selectRowbyCellText(String cellText){
		WebElement allPropGrid = driver.findElement(By.xpath(allPropGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/..")).findVisibleElement(By.xpath(allPropGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/.."));
		allPropGrid.click();
	}

	/*ManageDocClassProps->allPropGrid*/
	public void allPropGrid_selectCellbyOtherInlineCellText(String otherInlineCellText,String targetCellText){
		WebElement allPropGrid = driver.findElement(By.xpath(allPropGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']")).findVisibleElement(By.xpath(allPropGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']"));
		allPropGrid.click();
	}

	/*ManageDocClassProps->allPropGrid*/
	public void allPropGrid_selectCellbyColNameCellText(String colName,String cellText){
		WebElement allPropGrid = driver.findElement(By.xpath(allPropGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../..")).findVisibleElement(By.xpath(allPropGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../.."));
		String idx=allPropGrid.getAttribute("idx");
		List<WebElement> Gridrows = driver.findAll(By.xpath(allPropGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]"));
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

	/*ManageDocClassProps->allPropGrid*/
	public WebElement get_allPropGrid_colCaption_Self(String captionName){
		return driver.findElement(By.xpath(allPropGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']")).findVisibleElement(By.xpath(allPropGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']"));
	}

	/*ManageDocClassProps->allPropGrid*/
	public WebElement get_allPropGrid_CellbyRowColNumber_Self(int rowNum,int colNum){
		return driver.findElement(By.xpath(allPropGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]")).findVisibleElement(By.xpath(allPropGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]"));
	}

	/*ManageDocClassProps->allPropGrid*/
	public WebElement get_allPropGrid_RowbyRowColNumber_Self(int rowNum,int colNum){
		return driver.findElement(By.xpath(allPropGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/..")).findVisibleElement(By.xpath(allPropGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/.."));
	}

	/*ManageDocClassProps->allPropGrid*/
	public WebElement get_allPropGrid_RowbyRowNumber_Self(int rowNum){
		return driver.findElement(By.xpath(allPropGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr")).findVisibleElement(By.xpath(allPropGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr"));
	}

	/*ManageDocClassProps->allPropGrid*/
	public WebElement get_allPropGrid_CellbyCellText_Self(String cellText){
		return driver.findElement(By.xpath(allPropGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']")).findVisibleElement(By.xpath(allPropGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']"));
	}

	/*ManageDocClassProps->allPropGrid*/
	public WebElement get_allPropGrid_RowbyCellText_Self(String cellText){
		return driver.findElement(By.xpath(allPropGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/..")).findVisibleElement(By.xpath(allPropGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/.."));
	}

	/*ManageDocClassProps->allPropGrid*/
	public WebElement get_allPropGrid_CellbyOtherInlineCellText_Self(String otherInlineCellText,String targetCellText){
		return driver.findElement(By.xpath(allPropGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']")).findVisibleElement(By.xpath(allPropGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']"));
	}

	/*ManageDocClassProps->allPropGrid*/
	public WebElement get_allPropGrid_CellbyColNameCellText_Self(String colName,String cellText){
		WebElement allPropGrid = driver.findElement(By.xpath(allPropGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../..")).findVisibleElement(By.xpath(allPropGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../.."));
		String idx=allPropGrid.getAttribute("idx");
		List<WebElement> Gridrows = driver.findAll(By.xpath(allPropGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]"));
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

	/*ManageDocClassProps->okButton*/
	public void okButton_click(){
		WebElement okButton = driver.findElement(By.xpath(okButton_XPath)).findVisibleElement(By.xpath(okButton_XPath));
		okButton.click();
	}

	/*ManageDocClassProps->okButton*/
	public WebElement get_okButton_Self(){
		return driver.findElement(By.xpath(okButton_XPath)).findVisibleElement(By.xpath(okButton_XPath));
	}

	/*ManageDocClassProps->cancelButton*/
	public void cancelButton_click(){
		WebElement cancelButton = driver.findElement(By.xpath(cancelButton_XPath)).findVisibleElement(By.xpath(cancelButton_XPath));
		cancelButton.click();
	}

	/*ManageDocClassProps->cancelButton*/
	public WebElement get_cancelButton_Self(){
		return driver.findElement(By.xpath(cancelButton_XPath)).findVisibleElement(By.xpath(cancelButton_XPath));
	}

	/*ManageDocClassProps->addButton*/
	public void addButton_click(){
		WebElement addButton = driver.findElement(By.xpath(addButton_XPath)).findVisibleElement(By.xpath(addButton_XPath));
		addButton.click();
	}

	/*ManageDocClassProps->addButton*/
	public WebElement get_addButton_Self(){
		return driver.findElement(By.xpath(addButton_XPath)).findVisibleElement(By.xpath(addButton_XPath));
	}

	/*ManageDocClassProps->removeButton*/
	public void removeButton_click(){
		WebElement removeButton = driver.findElement(By.xpath(removeButton_XPath)).findVisibleElement(By.xpath(removeButton_XPath));
		removeButton.click();
	}

	/*ManageDocClassProps->removeButton*/
	public WebElement get_removeButton_Self(){
		return driver.findElement(By.xpath(removeButton_XPath)).findVisibleElement(By.xpath(removeButton_XPath));
	}

	/*ManageDocClassProps->currentPropGrid*/
	public void currentPropGrid_colCaptionClick(String captionName){
		WebElement currentPropGrid = driver.findElement(By.xpath(currentPropGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']")).findVisibleElement(By.xpath(currentPropGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']"));
		currentPropGrid.click();
	}

	/*ManageDocClassProps->currentPropGrid*/
	public void currentPropGrid_selectCellbyRowColNumber(int rowNum,int colNum){
		WebElement currentPropGrid = driver.findElement(By.xpath(currentPropGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]")).findVisibleElement(By.xpath(currentPropGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]"));
		currentPropGrid.click();
	}

	/*ManageDocClassProps->currentPropGrid*/
	public void currentPropGrid_selectRowbyRowColNumber(int rowNum,int colNum){
		WebElement currentPropGrid = driver.findElement(By.xpath(currentPropGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/..")).findVisibleElement(By.xpath(currentPropGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/.."));
		currentPropGrid.click();
	}

	/*ManageDocClassProps->currentPropGrid*/
	public void currentPropGrid_selectRowbyRowNumber(int rowNum){
		WebElement currentPropGrid = driver.findElement(By.xpath(currentPropGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr")).findVisibleElement(By.xpath(currentPropGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr"));
		currentPropGrid.click();
	}

	/*ManageDocClassProps->currentPropGrid*/
	public void currentPropGrid_selectCellbyCellText(String cellText){
		WebElement currentPropGrid = driver.findElement(By.xpath(currentPropGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']")).findVisibleElement(By.xpath(currentPropGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']"));
		currentPropGrid.click();
	}

	/*ManageDocClassProps->currentPropGrid*/
	public void currentPropGrid_selectRowbyCellText(String cellText){
		WebElement currentPropGrid = driver.findElement(By.xpath(currentPropGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/..")).findVisibleElement(By.xpath(currentPropGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/.."));
		currentPropGrid.click();
	}

	/*ManageDocClassProps->currentPropGrid*/
	public void currentPropGrid_selectCellbyOtherInlineCellText(String otherInlineCellText,String targetCellText){
		WebElement currentPropGrid = driver.findElement(By.xpath(currentPropGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']")).findVisibleElement(By.xpath(currentPropGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']"));
		currentPropGrid.click();
	}

	/*ManageDocClassProps->currentPropGrid*/
	public void currentPropGrid_selectCellbyColNameCellText(String colName,String cellText){
		WebElement currentPropGrid = driver.findElement(By.xpath(currentPropGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../..")).findVisibleElement(By.xpath(currentPropGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../.."));
		String idx=currentPropGrid.getAttribute("idx");
		List<WebElement> Gridrows = driver.findAll(By.xpath(currentPropGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]"));
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

	/*ManageDocClassProps->currentPropGrid*/
	public WebElement get_currentPropGrid_colCaption_Self(String captionName){
		return driver.findElement(By.xpath(currentPropGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']")).findVisibleElement(By.xpath(currentPropGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']"));
	}

	/*ManageDocClassProps->currentPropGrid*/
	public WebElement get_currentPropGrid_CellbyRowColNumber_Self(int rowNum,int colNum){
		return driver.findElement(By.xpath(currentPropGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]")).findVisibleElement(By.xpath(currentPropGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]"));
	}

	/*ManageDocClassProps->currentPropGrid*/
	public WebElement get_currentPropGrid_RowbyRowColNumber_Self(int rowNum,int colNum){
		return driver.findElement(By.xpath(currentPropGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/..")).findVisibleElement(By.xpath(currentPropGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/.."));
	}

	/*ManageDocClassProps->currentPropGrid*/
	public WebElement get_currentPropGrid_RowbyRowNumber_Self(int rowNum){
		return driver.findElement(By.xpath(currentPropGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr")).findVisibleElement(By.xpath(currentPropGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr"));
	}

	/*ManageDocClassProps->currentPropGrid*/
	public WebElement get_currentPropGrid_CellbyCellText_Self(String cellText){
		return driver.findElement(By.xpath(currentPropGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']")).findVisibleElement(By.xpath(currentPropGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']"));
	}

	/*ManageDocClassProps->currentPropGrid*/
	public WebElement get_currentPropGrid_RowbyCellText_Self(String cellText){
		return driver.findElement(By.xpath(currentPropGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/..")).findVisibleElement(By.xpath(currentPropGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/.."));
	}

	/*ManageDocClassProps->currentPropGrid*/
	public WebElement get_currentPropGrid_CellbyOtherInlineCellText_Self(String otherInlineCellText,String targetCellText){
		return driver.findElement(By.xpath(currentPropGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']")).findVisibleElement(By.xpath(currentPropGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']"));
	}

	/*ManageDocClassProps->currentPropGrid*/
	public WebElement get_currentPropGrid_CellbyColNameCellText_Self(String colName,String cellText){
		WebElement currentPropGrid = driver.findElement(By.xpath(currentPropGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../..")).findVisibleElement(By.xpath(currentPropGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../.."));
		String idx=currentPropGrid.getAttribute("idx");
		List<WebElement> Gridrows = driver.findAll(By.xpath(currentPropGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]"));
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
