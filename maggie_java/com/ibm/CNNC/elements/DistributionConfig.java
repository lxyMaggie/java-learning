package com.ibm.CNNC.elements;

import java.util.*;
import org.openqa.selenium.*;
import com.selenium.utils.WebDriver;
import com.selenium.utils.WebElement;

/*catalog\widget\dm\sysmanage\distributionconfig\templates\DistributionConfig.html*/
public class DistributionConfig {
	protected WebDriver driver;
	private static final String Tabs_XPath="//descendant::div[contains(@id,'DistributionConfig')]/descendant::div[contains(@id,'dijit_layout_TabContainer')]";
	private static final String onCreateSTDDistSchema_XPath="//descendant::div[contains(@id,'DistributionConfig')]/descendant::*[contains(@id,'StandardConfig')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"${resourceBundle.createSTDDistSchema}"+"']";
	private static final String RemoveSTDDistSchemaButton_XPath="//descendant::div[contains(@id,'DistributionConfig')]/descendant::*[contains(@id,'StandardConfig')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"${resourceBundle.removeSTDDistSchema}"+"']";
	private static final String StandardSchemaGrid_XPath="//descendant::div[contains(@id,'DistributionConfig')]/descendant::*[contains(@id,'StandardConfig')]/descendant::div[contains(@id,'DataGrid')]";
	private static final String AddDistItemsButton_XPath="//descendant::div[contains(@id,'DistributionConfig')]/descendant::*[contains(@id,'StandardConfig')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"${resourceBundle.addDistItems}"+"']";
	private static final String ModifyDistItemsButton_XPath="//descendant::div[contains(@id,'DistributionConfig')]/descendant::*[contains(@id,'StandardConfig')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"${resourceBundle.modifyDistItems}"+"']";
	private static final String RemoveDistItemsButton_XPath="//descendant::div[contains(@id,'DistributionConfig')]/descendant::*[contains(@id,'StandardConfig')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"${resourceBundle.removeDistItems}"+"']";
	private static final String upArrow_XPath="//descendant::div[contains(@id,'DistributionConfig')]/descendant::*[contains(@id,'StandardConfig')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+""+"']";
	private static final String downArrow_XPath="//descendant::div[contains(@id,'DistributionConfig')]/descendant::*[contains(@id,'StandardConfig')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+""+"']";
	private static final String save_XPath="//descendant::div[contains(@id,'DistributionConfig')]/descendant::*[contains(@id,'StandardConfig')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"${resourceBundle.save}"+"']";
	private static final String StandardDistItemsGrid_XPath="//descendant::div[contains(@id,'DistributionConfig')]/descendant::*[contains(@id,'StandardConfig')]/descendant::div[contains(@id,'DataGrid')]";

	//----Constructor Methods Begin----
	public DistributionConfig(WebDriver driver){
		this.driver=driver;
	}

	/*DistributionConfig->stackContainer*/
	public void Tabs_click(String tabName){
		WebElement Tabs = driver.findElement(By.xpath(Tabs_XPath+"/descendant::div[contains(@id,'tablist')]/descendant::div[contains(@class,'TabListWrapper')]/descendant::span[normalize-space(text())='"+tabName+"']")).findVisibleElement(By.xpath(Tabs_XPath+"/descendant::div[contains(@id,'tablist')]/descendant::div[contains(@class,'TabListWrapper')]/descendant::span[normalize-space(text())='"+tabName+"']"));
		Tabs.click();
	}

	/*DistributionConfig->stackContainer*/
	public void Tabs_close(String tabName){
		WebElement Tabs = driver.findElement(By.xpath(Tabs_XPath+"/descendant::div[contains(@id,'tablist')]/descendant::div[contains(@class,'TabListWrapper')]/descendant::span[normalize-space(text())='"+tabName+"']/following-sibling::span[contains(@class,'TabCloseButton')]")).findVisibleElement(By.xpath(Tabs_XPath+"/descendant::div[contains(@id,'tablist')]/descendant::div[contains(@class,'TabListWrapper')]/descendant::span[normalize-space(text())='"+tabName+"']/following-sibling::span[contains(@class,'TabCloseButton')]"));
		Tabs.click();
	}

	/*DistributionConfig->stackContainer*/
	public WebElement get_Tabs_Self(String tabName){
		return driver.findElement(By.xpath(Tabs_XPath+"/descendant::div[contains(@id,'tablist')]/descendant::div[contains(@class,'TabListWrapper')]/descendant::span[normalize-space(text())='"+tabName+"']")).findVisibleElement(By.xpath(Tabs_XPath+"/descendant::div[contains(@id,'tablist')]/descendant::div[contains(@class,'TabListWrapper')]/descendant::span[normalize-space(text())='"+tabName+"']"));
	}

	/*DistributionConfig->stackContainer*/
	public WebElement get_Tabsclose_Self(String tabName){
		return driver.findElement(By.xpath(Tabs_XPath+"/descendant::div[contains(@id,'tablist')]/descendant::div[contains(@class,'TabListWrapper')]/descendant::span[normalize-space(text())='"+tabName+"']/following-sibling::span[contains(@class,'TabCloseButton')]")).findVisibleElement(By.xpath(Tabs_XPath+"/descendant::div[contains(@id,'tablist')]/descendant::div[contains(@class,'TabListWrapper')]/descendant::span[normalize-space(text())='"+tabName+"']/following-sibling::span[contains(@class,'TabCloseButton')]"));
	}

	/*DistributionConfig->StandardConfig->onClick: onCreateSTDDistSchema*/
	public void onCreateSTDDistSchema_click(){
		WebElement onCreateSTDDistSchema = driver.findElement(By.xpath(onCreateSTDDistSchema_XPath)).findVisibleElement(By.xpath(onCreateSTDDistSchema_XPath));
		onCreateSTDDistSchema.click();
	}

	/*DistributionConfig->StandardConfig->onClick: onCreateSTDDistSchema*/
	public WebElement get_onCreateSTDDistSchema_Self(){
		return driver.findElement(By.xpath(onCreateSTDDistSchema_XPath)).findVisibleElement(By.xpath(onCreateSTDDistSchema_XPath));
	}

	/*DistributionConfig->StandardConfig->RemoveSTDDistSchemaButton*/
	public void RemoveSTDDistSchemaButton_click(){
		WebElement RemoveSTDDistSchemaButton = driver.findElement(By.xpath(RemoveSTDDistSchemaButton_XPath)).findVisibleElement(By.xpath(RemoveSTDDistSchemaButton_XPath));
		RemoveSTDDistSchemaButton.click();
	}

	/*DistributionConfig->StandardConfig->RemoveSTDDistSchemaButton*/
	public WebElement get_RemoveSTDDistSchemaButton_Self(){
		return driver.findElement(By.xpath(RemoveSTDDistSchemaButton_XPath)).findVisibleElement(By.xpath(RemoveSTDDistSchemaButton_XPath));
	}

	/*DistributionConfig->StandardConfig->StandardSchemaGrid*/
	public void StandardSchemaGrid_colCaptionClick(String captionName){
		WebElement StandardSchemaGrid = driver.findElement(By.xpath(StandardSchemaGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']")).findVisibleElement(By.xpath(StandardSchemaGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']"));
		StandardSchemaGrid.click();
	}

	/*DistributionConfig->StandardConfig->StandardSchemaGrid*/
	public void StandardSchemaGrid_selectCellbyRowColNumber(int rowNum,int colNum){
		WebElement StandardSchemaGrid = driver.findElement(By.xpath(StandardSchemaGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]")).findVisibleElement(By.xpath(StandardSchemaGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]"));
		StandardSchemaGrid.click();
	}

	/*DistributionConfig->StandardConfig->StandardSchemaGrid*/
	public void StandardSchemaGrid_selectRowbyRowColNumber(int rowNum,int colNum){
		WebElement StandardSchemaGrid = driver.findElement(By.xpath(StandardSchemaGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/..")).findVisibleElement(By.xpath(StandardSchemaGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/.."));
		StandardSchemaGrid.click();
	}

	/*DistributionConfig->StandardConfig->StandardSchemaGrid*/
	public void StandardSchemaGrid_selectRowbyRowNumber(int rowNum){
		WebElement StandardSchemaGrid = driver.findElement(By.xpath(StandardSchemaGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr")).findVisibleElement(By.xpath(StandardSchemaGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr"));
		StandardSchemaGrid.click();
	}

	/*DistributionConfig->StandardConfig->StandardSchemaGrid*/
	public void StandardSchemaGrid_selectCellbyCellText(String cellText){
		WebElement StandardSchemaGrid = driver.findElement(By.xpath(StandardSchemaGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']")).findVisibleElement(By.xpath(StandardSchemaGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']"));
		StandardSchemaGrid.click();
	}

	/*DistributionConfig->StandardConfig->StandardSchemaGrid*/
	public void StandardSchemaGrid_selectRowbyCellText(String cellText){
		WebElement StandardSchemaGrid = driver.findElement(By.xpath(StandardSchemaGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/..")).findVisibleElement(By.xpath(StandardSchemaGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/.."));
		StandardSchemaGrid.click();
	}

	/*DistributionConfig->StandardConfig->StandardSchemaGrid*/
	public void StandardSchemaGrid_selectCellbyOtherInlineCellText(String otherInlineCellText,String targetCellText){
		WebElement StandardSchemaGrid = driver.findElement(By.xpath(StandardSchemaGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']")).findVisibleElement(By.xpath(StandardSchemaGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']"));
		StandardSchemaGrid.click();
	}

	/*DistributionConfig->StandardConfig->StandardSchemaGrid*/
	public void StandardSchemaGrid_selectCellbyColNameCellText(String colName,String cellText){
		WebElement StandardSchemaGrid = driver.findElement(By.xpath(StandardSchemaGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../..")).findVisibleElement(By.xpath(StandardSchemaGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../.."));
		String idx=StandardSchemaGrid.getAttribute("idx");
		List<WebElement> Gridrows = driver.findAll(By.xpath(StandardSchemaGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]"));
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

	/*DistributionConfig->StandardConfig->StandardSchemaGrid*/
	public WebElement get_StandardSchemaGrid_colCaption_Self(String captionName){
		return driver.findElement(By.xpath(StandardSchemaGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']")).findVisibleElement(By.xpath(StandardSchemaGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']"));
	}

	/*DistributionConfig->StandardConfig->StandardSchemaGrid*/
	public WebElement get_StandardSchemaGrid_CellbyRowColNumber_Self(int rowNum,int colNum){
		return driver.findElement(By.xpath(StandardSchemaGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]")).findVisibleElement(By.xpath(StandardSchemaGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]"));
	}

	/*DistributionConfig->StandardConfig->StandardSchemaGrid*/
	public WebElement get_StandardSchemaGrid_RowbyRowColNumber_Self(int rowNum,int colNum){
		return driver.findElement(By.xpath(StandardSchemaGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/..")).findVisibleElement(By.xpath(StandardSchemaGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/.."));
	}

	/*DistributionConfig->StandardConfig->StandardSchemaGrid*/
	public WebElement get_StandardSchemaGrid_RowbyRowNumber_Self(int rowNum){
		return driver.findElement(By.xpath(StandardSchemaGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr")).findVisibleElement(By.xpath(StandardSchemaGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr"));
	}

	/*DistributionConfig->StandardConfig->StandardSchemaGrid*/
	public WebElement get_StandardSchemaGrid_CellbyCellText_Self(String cellText){
		return driver.findElement(By.xpath(StandardSchemaGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']")).findVisibleElement(By.xpath(StandardSchemaGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']"));
	}

	/*DistributionConfig->StandardConfig->StandardSchemaGrid*/
	public WebElement get_StandardSchemaGrid_RowbyCellText_Self(String cellText){
		return driver.findElement(By.xpath(StandardSchemaGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/..")).findVisibleElement(By.xpath(StandardSchemaGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/.."));
	}

	/*DistributionConfig->StandardConfig->StandardSchemaGrid*/
	public WebElement get_StandardSchemaGrid_CellbyOtherInlineCellText_Self(String otherInlineCellText,String targetCellText){
		return driver.findElement(By.xpath(StandardSchemaGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']")).findVisibleElement(By.xpath(StandardSchemaGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']"));
	}

	/*DistributionConfig->StandardConfig->StandardSchemaGrid*/
	public WebElement get_StandardSchemaGrid_CellbyColNameCellText_Self(String colName,String cellText){
		WebElement StandardSchemaGrid = driver.findElement(By.xpath(StandardSchemaGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../..")).findVisibleElement(By.xpath(StandardSchemaGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../.."));
		String idx=StandardSchemaGrid.getAttribute("idx");
		List<WebElement> Gridrows = driver.findAll(By.xpath(StandardSchemaGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]"));
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

	/*DistributionConfig->StandardConfig->AddDistItemsButton*/
	public void AddDistItemsButton_click(){
		WebElement AddDistItemsButton = driver.findElement(By.xpath(AddDistItemsButton_XPath)).findVisibleElement(By.xpath(AddDistItemsButton_XPath));
		AddDistItemsButton.click();
	}

	/*DistributionConfig->StandardConfig->AddDistItemsButton*/
	public WebElement get_AddDistItemsButton_Self(){
		return driver.findElement(By.xpath(AddDistItemsButton_XPath)).findVisibleElement(By.xpath(AddDistItemsButton_XPath));
	}

	/*DistributionConfig->StandardConfig->ModifyDistItemsButton*/
	public void ModifyDistItemsButton_click(){
		WebElement ModifyDistItemsButton = driver.findElement(By.xpath(ModifyDistItemsButton_XPath)).findVisibleElement(By.xpath(ModifyDistItemsButton_XPath));
		ModifyDistItemsButton.click();
	}

	/*DistributionConfig->StandardConfig->ModifyDistItemsButton*/
	public WebElement get_ModifyDistItemsButton_Self(){
		return driver.findElement(By.xpath(ModifyDistItemsButton_XPath)).findVisibleElement(By.xpath(ModifyDistItemsButton_XPath));
	}

	/*DistributionConfig->StandardConfig->RemoveDistItemsButton*/
	public void RemoveDistItemsButton_click(){
		WebElement RemoveDistItemsButton = driver.findElement(By.xpath(RemoveDistItemsButton_XPath)).findVisibleElement(By.xpath(RemoveDistItemsButton_XPath));
		RemoveDistItemsButton.click();
	}

	/*DistributionConfig->StandardConfig->RemoveDistItemsButton*/
	public WebElement get_RemoveDistItemsButton_Self(){
		return driver.findElement(By.xpath(RemoveDistItemsButton_XPath)).findVisibleElement(By.xpath(RemoveDistItemsButton_XPath));
	}

	/*DistributionConfig->StandardConfig->upArrow*/
	public void upArrow_click(){
		WebElement upArrow = driver.findElement(By.xpath(upArrow_XPath)).findVisibleElement(By.xpath(upArrow_XPath));
		upArrow.click();
	}

	/*DistributionConfig->StandardConfig->upArrow*/
	public WebElement get_upArrow_Self(){
		return driver.findElement(By.xpath(upArrow_XPath)).findVisibleElement(By.xpath(upArrow_XPath));
	}

	/*DistributionConfig->StandardConfig->downArrow*/
	public void downArrow_click(){
		WebElement downArrow = driver.findElement(By.xpath(downArrow_XPath)).findVisibleElement(By.xpath(downArrow_XPath));
		downArrow.click();
	}

	/*DistributionConfig->StandardConfig->downArrow*/
	public WebElement get_downArrow_Self(){
		return driver.findElement(By.xpath(downArrow_XPath)).findVisibleElement(By.xpath(downArrow_XPath));
	}

	/*DistributionConfig->StandardConfig->save*/
	public void save_click(){
		WebElement save = driver.findElement(By.xpath(save_XPath)).findVisibleElement(By.xpath(save_XPath));
		save.click();
	}

	/*DistributionConfig->StandardConfig->save*/
	public WebElement get_save_Self(){
		return driver.findElement(By.xpath(save_XPath)).findVisibleElement(By.xpath(save_XPath));
	}

	/*DistributionConfig->StandardConfig->StandardDistItemsGrid*/
	public void StandardDistItemsGrid_colCaptionClick(String captionName){
		WebElement StandardDistItemsGrid = driver.findElement(By.xpath(StandardDistItemsGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']")).findVisibleElement(By.xpath(StandardDistItemsGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']"));
		StandardDistItemsGrid.click();
	}

	/*DistributionConfig->StandardConfig->StandardDistItemsGrid*/
	public void StandardDistItemsGrid_selectCellbyRowColNumber(int rowNum,int colNum){
		WebElement StandardDistItemsGrid = driver.findElement(By.xpath(StandardDistItemsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]")).findVisibleElement(By.xpath(StandardDistItemsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]"));
		StandardDistItemsGrid.click();
	}

	/*DistributionConfig->StandardConfig->StandardDistItemsGrid*/
	public void StandardDistItemsGrid_selectRowbyRowColNumber(int rowNum,int colNum){
		WebElement StandardDistItemsGrid = driver.findElement(By.xpath(StandardDistItemsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/..")).findVisibleElement(By.xpath(StandardDistItemsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/.."));
		StandardDistItemsGrid.click();
	}

	/*DistributionConfig->StandardConfig->StandardDistItemsGrid*/
	public void StandardDistItemsGrid_selectRowbyRowNumber(int rowNum){
		WebElement StandardDistItemsGrid = driver.findElement(By.xpath(StandardDistItemsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr")).findVisibleElement(By.xpath(StandardDistItemsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr"));
		StandardDistItemsGrid.click();
	}

	/*DistributionConfig->StandardConfig->StandardDistItemsGrid*/
	public void StandardDistItemsGrid_selectCellbyCellText(String cellText){
		WebElement StandardDistItemsGrid = driver.findElement(By.xpath(StandardDistItemsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']")).findVisibleElement(By.xpath(StandardDistItemsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']"));
		StandardDistItemsGrid.click();
	}

	/*DistributionConfig->StandardConfig->StandardDistItemsGrid*/
	public void StandardDistItemsGrid_selectRowbyCellText(String cellText){
		WebElement StandardDistItemsGrid = driver.findElement(By.xpath(StandardDistItemsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/..")).findVisibleElement(By.xpath(StandardDistItemsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/.."));
		StandardDistItemsGrid.click();
	}

	/*DistributionConfig->StandardConfig->StandardDistItemsGrid*/
	public void StandardDistItemsGrid_selectCellbyOtherInlineCellText(String otherInlineCellText,String targetCellText){
		WebElement StandardDistItemsGrid = driver.findElement(By.xpath(StandardDistItemsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']")).findVisibleElement(By.xpath(StandardDistItemsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']"));
		StandardDistItemsGrid.click();
	}

	/*DistributionConfig->StandardConfig->StandardDistItemsGrid*/
	public void StandardDistItemsGrid_selectCellbyColNameCellText(String colName,String cellText){
		WebElement StandardDistItemsGrid = driver.findElement(By.xpath(StandardDistItemsGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../..")).findVisibleElement(By.xpath(StandardDistItemsGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../.."));
		String idx=StandardDistItemsGrid.getAttribute("idx");
		List<WebElement> Gridrows = driver.findAll(By.xpath(StandardDistItemsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]"));
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

	/*DistributionConfig->StandardConfig->StandardDistItemsGrid*/
	public WebElement get_StandardDistItemsGrid_colCaption_Self(String captionName){
		return driver.findElement(By.xpath(StandardDistItemsGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']")).findVisibleElement(By.xpath(StandardDistItemsGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']"));
	}

	/*DistributionConfig->StandardConfig->StandardDistItemsGrid*/
	public WebElement get_StandardDistItemsGrid_CellbyRowColNumber_Self(int rowNum,int colNum){
		return driver.findElement(By.xpath(StandardDistItemsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]")).findVisibleElement(By.xpath(StandardDistItemsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]"));
	}

	/*DistributionConfig->StandardConfig->StandardDistItemsGrid*/
	public WebElement get_StandardDistItemsGrid_RowbyRowColNumber_Self(int rowNum,int colNum){
		return driver.findElement(By.xpath(StandardDistItemsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/..")).findVisibleElement(By.xpath(StandardDistItemsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/.."));
	}

	/*DistributionConfig->StandardConfig->StandardDistItemsGrid*/
	public WebElement get_StandardDistItemsGrid_RowbyRowNumber_Self(int rowNum){
		return driver.findElement(By.xpath(StandardDistItemsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr")).findVisibleElement(By.xpath(StandardDistItemsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr"));
	}

	/*DistributionConfig->StandardConfig->StandardDistItemsGrid*/
	public WebElement get_StandardDistItemsGrid_CellbyCellText_Self(String cellText){
		return driver.findElement(By.xpath(StandardDistItemsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']")).findVisibleElement(By.xpath(StandardDistItemsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']"));
	}

	/*DistributionConfig->StandardConfig->StandardDistItemsGrid*/
	public WebElement get_StandardDistItemsGrid_RowbyCellText_Self(String cellText){
		return driver.findElement(By.xpath(StandardDistItemsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/..")).findVisibleElement(By.xpath(StandardDistItemsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/.."));
	}

	/*DistributionConfig->StandardConfig->StandardDistItemsGrid*/
	public WebElement get_StandardDistItemsGrid_CellbyOtherInlineCellText_Self(String otherInlineCellText,String targetCellText){
		return driver.findElement(By.xpath(StandardDistItemsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']")).findVisibleElement(By.xpath(StandardDistItemsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']"));
	}

	/*DistributionConfig->StandardConfig->StandardDistItemsGrid*/
	public WebElement get_StandardDistItemsGrid_CellbyColNameCellText_Self(String colName,String cellText){
		WebElement StandardDistItemsGrid = driver.findElement(By.xpath(StandardDistItemsGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../..")).findVisibleElement(By.xpath(StandardDistItemsGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../.."));
		String idx=StandardDistItemsGrid.getAttribute("idx");
		List<WebElement> Gridrows = driver.findAll(By.xpath(StandardDistItemsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]"));
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
