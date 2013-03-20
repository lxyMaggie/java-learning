package com.ibm.CNNC.elements;

import java.util.*;
import org.openqa.selenium.*;
import com.selenium.utils.WebDriver;
import com.selenium.utils.WebElement;

/*catalog\widget\dm\sysmanage\dynamicformconfig\dijit\templates\ViewMetaDataConfig.html*/
public class ViewMetaDataConfig {
	protected WebDriver driver;
	private static final String saveViewBtn_XPath="//descendant::div[contains(@id,'ViewMetaDataConfig')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"保存"+"']";
	private static final String upArrow_XPath="//descendant::div[contains(@id,'ViewMetaDataConfig')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+""+"']";
	private static final String downArrow_XPath="//descendant::div[contains(@id,'ViewMetaDataConfig')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+""+"']";
	private static final String moveToBtn_XPath="//descendant::div[contains(@id,'ViewMetaDataConfig')]/descendant::span[normalize-space(text())='"+"确定"+"']";
	private static final String updateTemplate_XPath="//descendant::div[contains(@id,'ViewMetaDataConfig')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"更新模板"+"']";
	private static final String moveBtn_XPath="//descendant::div[contains(@id,'ViewMetaDataConfig')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"确定"+"']";
	private static final String metaDataGrid_XPath="//descendant::div[contains(@id,'ViewMetaDataConfig')]/descendant::div[contains(@id,'EnhancedGrid')]";

	//----Constructor Methods Begin----
	public ViewMetaDataConfig(WebDriver driver){
		this.driver=driver;
	}

	/*ViewMetaDataConfig->saveViewBtn*/
	public void saveViewBtn_click(){
		WebElement saveViewBtn = driver.findElement(By.xpath(saveViewBtn_XPath)).findVisibleElement(By.xpath(saveViewBtn_XPath));
		saveViewBtn.click();
	}

	/*ViewMetaDataConfig->saveViewBtn*/
	public WebElement get_saveViewBtn_Self(){
		return driver.findElement(By.xpath(saveViewBtn_XPath)).findVisibleElement(By.xpath(saveViewBtn_XPath));
	}

	/*ViewMetaDataConfig->upArrow*/
	public void upArrow_click(){
		WebElement upArrow = driver.findElement(By.xpath(upArrow_XPath)).findVisibleElement(By.xpath(upArrow_XPath));
		upArrow.click();
	}

	/*ViewMetaDataConfig->upArrow*/
	public WebElement get_upArrow_Self(){
		return driver.findElement(By.xpath(upArrow_XPath)).findVisibleElement(By.xpath(upArrow_XPath));
	}

	/*ViewMetaDataConfig->downArrow*/
	public void downArrow_click(){
		WebElement downArrow = driver.findElement(By.xpath(downArrow_XPath)).findVisibleElement(By.xpath(downArrow_XPath));
		downArrow.click();
	}

	/*ViewMetaDataConfig->downArrow*/
	public WebElement get_downArrow_Self(){
		return driver.findElement(By.xpath(downArrow_XPath)).findVisibleElement(By.xpath(downArrow_XPath));
	}

	/*ViewMetaDataConfig->moveToBtn*/
	public void moveToBtn_select(String selectStr){
		WebElement moveToBtn=driver.findElement(By.xpath(moveToBtn_XPath)).findVisibleElement(By.xpath(moveToBtn_XPath));
		moveToBtn.click();
		WebElement mySelectItem=driver.findElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']")).findVisibleElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']"));
		mySelectItem.click();
	}

	/*ViewMetaDataConfig->moveToBtn*/
	public void moveToBtn_click(){
		WebElement moveToBtn = driver.findElement(By.xpath(moveToBtn_XPath)).findVisibleElement(By.xpath(moveToBtn_XPath));
		moveToBtn.click();
	}

	/*ViewMetaDataConfig->moveToBtn*/
	public WebElement get_moveToBtn_Self(){
		return driver.findElement(By.xpath(moveToBtn_XPath)).findVisibleElement(By.xpath(moveToBtn_XPath));
	}

	/*ViewMetaDataConfig->moveToBtn*/
	public WebElement get_moveToBtn_selectItem_Self(String selectStr){
		WebElement moveToBtn=driver.findElement(By.xpath(moveToBtn_XPath)).findVisibleElement(By.xpath(moveToBtn_XPath));
		moveToBtn.click();
		return driver.findElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']")).findVisibleElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']"));
	}

	/*ViewMetaDataConfig->updateTemplate*/
	public void updateTemplate_click(){
		WebElement updateTemplate = driver.findElement(By.xpath(updateTemplate_XPath)).findVisibleElement(By.xpath(updateTemplate_XPath));
		updateTemplate.click();
	}

	/*ViewMetaDataConfig->updateTemplate*/
	public WebElement get_updateTemplate_Self(){
		return driver.findElement(By.xpath(updateTemplate_XPath)).findVisibleElement(By.xpath(updateTemplate_XPath));
	}

	/*ViewMetaDataConfig->moveBtn*/
	public void moveBtn_click(){
		WebElement moveBtn = driver.findElement(By.xpath(moveBtn_XPath)).findVisibleElement(By.xpath(moveBtn_XPath));
		moveBtn.click();
	}

	/*ViewMetaDataConfig->moveBtn*/
	public WebElement get_moveBtn_Self(){
		return driver.findElement(By.xpath(moveBtn_XPath)).findVisibleElement(By.xpath(moveBtn_XPath));
	}

	/*ViewMetaDataConfig->metaDataGrid*/
	public void metaDataGrid_colCaptionClick(String captionName){
		WebElement metaDataGrid = driver.findElement(By.xpath(metaDataGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']")).findVisibleElement(By.xpath(metaDataGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']"));
		metaDataGrid.click();
	}

	/*ViewMetaDataConfig->metaDataGrid*/
	public void metaDataGrid_selectCellbyRowColNumber(int rowNum,int colNum){
		WebElement metaDataGrid = driver.findElement(By.xpath(metaDataGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]")).findVisibleElement(By.xpath(metaDataGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]"));
		metaDataGrid.click();
	}

	/*ViewMetaDataConfig->metaDataGrid*/
	public void metaDataGrid_selectRowbyRowColNumber(int rowNum,int colNum){
		WebElement metaDataGrid = driver.findElement(By.xpath(metaDataGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/..")).findVisibleElement(By.xpath(metaDataGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/.."));
		metaDataGrid.click();
	}

	/*ViewMetaDataConfig->metaDataGrid*/
	public void metaDataGrid_selectRowbyRowNumber(int rowNum){
		WebElement metaDataGrid = driver.findElement(By.xpath(metaDataGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr")).findVisibleElement(By.xpath(metaDataGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr"));
		metaDataGrid.click();
	}

	/*ViewMetaDataConfig->metaDataGrid*/
	public void metaDataGrid_selectCellbyCellText(String cellText){
		WebElement metaDataGrid = driver.findElement(By.xpath(metaDataGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']")).findVisibleElement(By.xpath(metaDataGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']"));
		metaDataGrid.click();
	}

	/*ViewMetaDataConfig->metaDataGrid*/
	public void metaDataGrid_selectRowbyCellText(String cellText){
		WebElement metaDataGrid = driver.findElement(By.xpath(metaDataGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/..")).findVisibleElement(By.xpath(metaDataGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/.."));
		metaDataGrid.click();
	}

	/*ViewMetaDataConfig->metaDataGrid*/
	public void metaDataGrid_selectCellbyOtherInlineCellText(String otherInlineCellText,String targetCellText){
		WebElement metaDataGrid = driver.findElement(By.xpath(metaDataGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']")).findVisibleElement(By.xpath(metaDataGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']"));
		metaDataGrid.click();
	}

	/*ViewMetaDataConfig->metaDataGrid*/
	public void metaDataGrid_selectCellbyColNameCellText(String colName,String cellText){
		WebElement metaDataGrid = driver.findElement(By.xpath(metaDataGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../..")).findVisibleElement(By.xpath(metaDataGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../.."));
		String idx=metaDataGrid.getAttribute("idx");
		List<WebElement> Gridrows = driver.findAll(By.xpath(metaDataGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]"));
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

	/*ViewMetaDataConfig->metaDataGrid*/
	public WebElement get_metaDataGrid_colCaption_Self(String captionName){
		return driver.findElement(By.xpath(metaDataGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']")).findVisibleElement(By.xpath(metaDataGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']"));
	}

	/*ViewMetaDataConfig->metaDataGrid*/
	public WebElement get_metaDataGrid_CellbyRowColNumber_Self(int rowNum,int colNum){
		return driver.findElement(By.xpath(metaDataGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]")).findVisibleElement(By.xpath(metaDataGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]"));
	}

	/*ViewMetaDataConfig->metaDataGrid*/
	public WebElement get_metaDataGrid_RowbyRowColNumber_Self(int rowNum,int colNum){
		return driver.findElement(By.xpath(metaDataGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/..")).findVisibleElement(By.xpath(metaDataGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/.."));
	}

	/*ViewMetaDataConfig->metaDataGrid*/
	public WebElement get_metaDataGrid_RowbyRowNumber_Self(int rowNum){
		return driver.findElement(By.xpath(metaDataGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr")).findVisibleElement(By.xpath(metaDataGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr"));
	}

	/*ViewMetaDataConfig->metaDataGrid*/
	public WebElement get_metaDataGrid_CellbyCellText_Self(String cellText){
		return driver.findElement(By.xpath(metaDataGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']")).findVisibleElement(By.xpath(metaDataGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']"));
	}

	/*ViewMetaDataConfig->metaDataGrid*/
	public WebElement get_metaDataGrid_RowbyCellText_Self(String cellText){
		return driver.findElement(By.xpath(metaDataGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/..")).findVisibleElement(By.xpath(metaDataGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/.."));
	}

	/*ViewMetaDataConfig->metaDataGrid*/
	public WebElement get_metaDataGrid_CellbyOtherInlineCellText_Self(String otherInlineCellText,String targetCellText){
		return driver.findElement(By.xpath(metaDataGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']")).findVisibleElement(By.xpath(metaDataGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']"));
	}

	/*ViewMetaDataConfig->metaDataGrid*/
	public WebElement get_metaDataGrid_CellbyColNameCellText_Self(String colName,String cellText){
		WebElement metaDataGrid = driver.findElement(By.xpath(metaDataGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../..")).findVisibleElement(By.xpath(metaDataGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../.."));
		String idx=metaDataGrid.getAttribute("idx");
		List<WebElement> Gridrows = driver.findAll(By.xpath(metaDataGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]"));
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
