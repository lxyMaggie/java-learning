package com.ibm.CNNC.elements;

import java.util.*;
import org.openqa.selenium.*;
import com.selenium.utils.WebDriver;
import com.selenium.utils.WebElement;

/*catalog\widget\dm\sysmanage\distributionconfig\dijit\templates\StandardConfig.html*/
public class StandardConfig {
	protected WebDriver driver;
	private static final String onCreateSTDDistSchema_XPath="//descendant::div[contains(@id,'StandardConfig')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"创建分发方案"+"']";
	private static final String RemoveSTDDistSchemaButton_XPath="//descendant::div[contains(@id,'StandardConfig')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"删除选中方案"+"']";
	private static final String StandardSchemaGrid_XPath="//descendant::div[contains(@id,'StandardConfig')]/descendant::div[contains(@id,'DataGrid')]";
	private static final String AddDistItemsButton_XPath="//descendant::div[contains(@id,'StandardConfig')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"添加分发条目"+"']";
	private static final String ModifyDistItemsButton_XPath="//descendant::div[contains(@id,'StandardConfig')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"修改选中条目"+"']";
	private static final String RemoveDistItemsButton_XPath="//descendant::div[contains(@id,'StandardConfig')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"删除选中条目"+"']";
	private static final String upArrow_XPath="//descendant::div[contains(@id,'StandardConfig')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+""+"']";
	private static final String downArrow_XPath="//descendant::div[contains(@id,'StandardConfig')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+""+"']";
	private static final String save_XPath="//descendant::div[contains(@id,'StandardConfig')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"保存排序"+"']";
	private static final String StandardDistItemsGrid_XPath="//descendant::div[contains(@id,'StandardConfig')]/descendant::div[contains(@id,'DataGrid')]";

	//----Constructor Methods Begin----
	public StandardConfig(WebDriver driver){
		this.driver=driver;
	}

	/*StandardConfig->onClick: onCreateSTDDistSchema*/
	public void onCreateSTDDistSchema_click(){
		WebElement onCreateSTDDistSchema = driver.findElement(By.xpath(onCreateSTDDistSchema_XPath)).findVisibleElement(By.xpath(onCreateSTDDistSchema_XPath));
		onCreateSTDDistSchema.click();
	}

	/*StandardConfig->onClick: onCreateSTDDistSchema*/
	public WebElement get_onCreateSTDDistSchema_Self(){
		return driver.findElement(By.xpath(onCreateSTDDistSchema_XPath)).findVisibleElement(By.xpath(onCreateSTDDistSchema_XPath));
	}

	/*StandardConfig->RemoveSTDDistSchemaButton*/
	public void RemoveSTDDistSchemaButton_click(){
		WebElement RemoveSTDDistSchemaButton = driver.findElement(By.xpath(RemoveSTDDistSchemaButton_XPath)).findVisibleElement(By.xpath(RemoveSTDDistSchemaButton_XPath));
		RemoveSTDDistSchemaButton.click();
	}

	/*StandardConfig->RemoveSTDDistSchemaButton*/
	public WebElement get_RemoveSTDDistSchemaButton_Self(){
		return driver.findElement(By.xpath(RemoveSTDDistSchemaButton_XPath)).findVisibleElement(By.xpath(RemoveSTDDistSchemaButton_XPath));
	}

	/*StandardConfig->StandardSchemaGrid*/
	public void StandardSchemaGrid_colCaptionClick(String captionName){
		WebElement StandardSchemaGrid = driver.findElement(By.xpath(StandardSchemaGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']")).findVisibleElement(By.xpath(StandardSchemaGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']"));
		StandardSchemaGrid.click();
	}

	/*StandardConfig->StandardSchemaGrid*/
	public void StandardSchemaGrid_selectCellbyRowColNumber(int rowNum,int colNum){
		WebElement StandardSchemaGrid = driver.findElement(By.xpath(StandardSchemaGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]")).findVisibleElement(By.xpath(StandardSchemaGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]"));
		StandardSchemaGrid.click();
	}

	/*StandardConfig->StandardSchemaGrid*/
	public void StandardSchemaGrid_selectRowbyRowColNumber(int rowNum,int colNum){
		WebElement StandardSchemaGrid = driver.findElement(By.xpath(StandardSchemaGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/..")).findVisibleElement(By.xpath(StandardSchemaGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/.."));
		StandardSchemaGrid.click();
	}

	/*StandardConfig->StandardSchemaGrid*/
	public void StandardSchemaGrid_selectRowbyRowNumber(int rowNum){
		WebElement StandardSchemaGrid = driver.findElement(By.xpath(StandardSchemaGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr")).findVisibleElement(By.xpath(StandardSchemaGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr"));
		StandardSchemaGrid.click();
	}

	/*StandardConfig->StandardSchemaGrid*/
	public void StandardSchemaGrid_selectCellbyCellText(String cellText){
		WebElement StandardSchemaGrid = driver.findElement(By.xpath(StandardSchemaGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']")).findVisibleElement(By.xpath(StandardSchemaGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']"));
		StandardSchemaGrid.click();
	}

	/*StandardConfig->StandardSchemaGrid*/
	public void StandardSchemaGrid_selectRowbyCellText(String cellText){
		WebElement StandardSchemaGrid = driver.findElement(By.xpath(StandardSchemaGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/..")).findVisibleElement(By.xpath(StandardSchemaGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/.."));
		StandardSchemaGrid.click();
	}

	/*StandardConfig->StandardSchemaGrid*/
	public void StandardSchemaGrid_selectCellbyOtherInlineCellText(String otherInlineCellText,String targetCellText){
		WebElement StandardSchemaGrid = driver.findElement(By.xpath(StandardSchemaGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']")).findVisibleElement(By.xpath(StandardSchemaGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']"));
		StandardSchemaGrid.click();
	}

	/*StandardConfig->StandardSchemaGrid*/
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

	/*StandardConfig->StandardSchemaGrid*/
	public WebElement get_StandardSchemaGrid_colCaption_Self(String captionName){
		return driver.findElement(By.xpath(StandardSchemaGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']")).findVisibleElement(By.xpath(StandardSchemaGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']"));
	}

	/*StandardConfig->StandardSchemaGrid*/
	public WebElement get_StandardSchemaGrid_CellbyRowColNumber_Self(int rowNum,int colNum){
		return driver.findElement(By.xpath(StandardSchemaGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]")).findVisibleElement(By.xpath(StandardSchemaGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]"));
	}

	/*StandardConfig->StandardSchemaGrid*/
	public WebElement get_StandardSchemaGrid_RowbyRowColNumber_Self(int rowNum,int colNum){
		return driver.findElement(By.xpath(StandardSchemaGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/..")).findVisibleElement(By.xpath(StandardSchemaGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/.."));
	}

	/*StandardConfig->StandardSchemaGrid*/
	public WebElement get_StandardSchemaGrid_RowbyRowNumber_Self(int rowNum){
		return driver.findElement(By.xpath(StandardSchemaGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr")).findVisibleElement(By.xpath(StandardSchemaGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr"));
	}

	/*StandardConfig->StandardSchemaGrid*/
	public WebElement get_StandardSchemaGrid_CellbyCellText_Self(String cellText){
		return driver.findElement(By.xpath(StandardSchemaGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']")).findVisibleElement(By.xpath(StandardSchemaGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']"));
	}

	/*StandardConfig->StandardSchemaGrid*/
	public WebElement get_StandardSchemaGrid_RowbyCellText_Self(String cellText){
		return driver.findElement(By.xpath(StandardSchemaGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/..")).findVisibleElement(By.xpath(StandardSchemaGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/.."));
	}

	/*StandardConfig->StandardSchemaGrid*/
	public WebElement get_StandardSchemaGrid_CellbyOtherInlineCellText_Self(String otherInlineCellText,String targetCellText){
		return driver.findElement(By.xpath(StandardSchemaGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']")).findVisibleElement(By.xpath(StandardSchemaGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']"));
	}

	/*StandardConfig->StandardSchemaGrid*/
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

	/*StandardConfig->AddDistItemsButton*/
	public void AddDistItemsButton_click(){
		WebElement AddDistItemsButton = driver.findElement(By.xpath(AddDistItemsButton_XPath)).findVisibleElement(By.xpath(AddDistItemsButton_XPath));
		AddDistItemsButton.click();
	}

	/*StandardConfig->AddDistItemsButton*/
	public WebElement get_AddDistItemsButton_Self(){
		return driver.findElement(By.xpath(AddDistItemsButton_XPath)).findVisibleElement(By.xpath(AddDistItemsButton_XPath));
	}

	/*StandardConfig->ModifyDistItemsButton*/
	public void ModifyDistItemsButton_click(){
		WebElement ModifyDistItemsButton = driver.findElement(By.xpath(ModifyDistItemsButton_XPath)).findVisibleElement(By.xpath(ModifyDistItemsButton_XPath));
		ModifyDistItemsButton.click();
	}

	/*StandardConfig->ModifyDistItemsButton*/
	public WebElement get_ModifyDistItemsButton_Self(){
		return driver.findElement(By.xpath(ModifyDistItemsButton_XPath)).findVisibleElement(By.xpath(ModifyDistItemsButton_XPath));
	}

	/*StandardConfig->RemoveDistItemsButton*/
	public void RemoveDistItemsButton_click(){
		WebElement RemoveDistItemsButton = driver.findElement(By.xpath(RemoveDistItemsButton_XPath)).findVisibleElement(By.xpath(RemoveDistItemsButton_XPath));
		RemoveDistItemsButton.click();
	}

	/*StandardConfig->RemoveDistItemsButton*/
	public WebElement get_RemoveDistItemsButton_Self(){
		return driver.findElement(By.xpath(RemoveDistItemsButton_XPath)).findVisibleElement(By.xpath(RemoveDistItemsButton_XPath));
	}

	/*StandardConfig->upArrow*/
	public void upArrow_click(){
		WebElement upArrow = driver.findElement(By.xpath(upArrow_XPath)).findVisibleElement(By.xpath(upArrow_XPath));
		upArrow.click();
	}

	/*StandardConfig->upArrow*/
	public WebElement get_upArrow_Self(){
		return driver.findElement(By.xpath(upArrow_XPath)).findVisibleElement(By.xpath(upArrow_XPath));
	}

	/*StandardConfig->downArrow*/
	public void downArrow_click(){
		WebElement downArrow = driver.findElement(By.xpath(downArrow_XPath)).findVisibleElement(By.xpath(downArrow_XPath));
		downArrow.click();
	}

	/*StandardConfig->downArrow*/
	public WebElement get_downArrow_Self(){
		return driver.findElement(By.xpath(downArrow_XPath)).findVisibleElement(By.xpath(downArrow_XPath));
	}

	/*StandardConfig->save*/
	public void save_click(){
		WebElement save = driver.findElement(By.xpath(save_XPath)).findVisibleElement(By.xpath(save_XPath));
		save.click();
	}

	/*StandardConfig->save*/
	public WebElement get_save_Self(){
		return driver.findElement(By.xpath(save_XPath)).findVisibleElement(By.xpath(save_XPath));
	}

	/*StandardConfig->StandardDistItemsGrid*/
	public void StandardDistItemsGrid_colCaptionClick(String captionName){
		WebElement StandardDistItemsGrid = driver.findElement(By.xpath(StandardDistItemsGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']")).findVisibleElement(By.xpath(StandardDistItemsGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']"));
		StandardDistItemsGrid.click();
	}

	/*StandardConfig->StandardDistItemsGrid*/
	public void StandardDistItemsGrid_selectCellbyRowColNumber(int rowNum,int colNum){
		WebElement StandardDistItemsGrid = driver.findElement(By.xpath(StandardDistItemsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]")).findVisibleElement(By.xpath(StandardDistItemsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]"));
		StandardDistItemsGrid.click();
	}

	/*StandardConfig->StandardDistItemsGrid*/
	public void StandardDistItemsGrid_selectRowbyRowColNumber(int rowNum,int colNum){
		WebElement StandardDistItemsGrid = driver.findElement(By.xpath(StandardDistItemsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/..")).findVisibleElement(By.xpath(StandardDistItemsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/.."));
		StandardDistItemsGrid.click();
	}

	/*StandardConfig->StandardDistItemsGrid*/
	public void StandardDistItemsGrid_selectRowbyRowNumber(int rowNum){
		WebElement StandardDistItemsGrid = driver.findElement(By.xpath(StandardDistItemsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr")).findVisibleElement(By.xpath(StandardDistItemsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr"));
		StandardDistItemsGrid.click();
	}

	/*StandardConfig->StandardDistItemsGrid*/
	public void StandardDistItemsGrid_selectCellbyCellText(String cellText){
		WebElement StandardDistItemsGrid = driver.findElement(By.xpath(StandardDistItemsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']")).findVisibleElement(By.xpath(StandardDistItemsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']"));
		StandardDistItemsGrid.click();
	}

	/*StandardConfig->StandardDistItemsGrid*/
	public void StandardDistItemsGrid_selectRowbyCellText(String cellText){
		WebElement StandardDistItemsGrid = driver.findElement(By.xpath(StandardDistItemsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/..")).findVisibleElement(By.xpath(StandardDistItemsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/.."));
		StandardDistItemsGrid.click();
	}

	/*StandardConfig->StandardDistItemsGrid*/
	public void StandardDistItemsGrid_selectCellbyOtherInlineCellText(String otherInlineCellText,String targetCellText){
		WebElement StandardDistItemsGrid = driver.findElement(By.xpath(StandardDistItemsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']")).findVisibleElement(By.xpath(StandardDistItemsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']"));
		StandardDistItemsGrid.click();
	}

	/*StandardConfig->StandardDistItemsGrid*/
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

	/*StandardConfig->StandardDistItemsGrid*/
	public WebElement get_StandardDistItemsGrid_colCaption_Self(String captionName){
		return driver.findElement(By.xpath(StandardDistItemsGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']")).findVisibleElement(By.xpath(StandardDistItemsGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']"));
	}

	/*StandardConfig->StandardDistItemsGrid*/
	public WebElement get_StandardDistItemsGrid_CellbyRowColNumber_Self(int rowNum,int colNum){
		return driver.findElement(By.xpath(StandardDistItemsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]")).findVisibleElement(By.xpath(StandardDistItemsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]"));
	}

	/*StandardConfig->StandardDistItemsGrid*/
	public WebElement get_StandardDistItemsGrid_RowbyRowColNumber_Self(int rowNum,int colNum){
		return driver.findElement(By.xpath(StandardDistItemsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/..")).findVisibleElement(By.xpath(StandardDistItemsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/.."));
	}

	/*StandardConfig->StandardDistItemsGrid*/
	public WebElement get_StandardDistItemsGrid_RowbyRowNumber_Self(int rowNum){
		return driver.findElement(By.xpath(StandardDistItemsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr")).findVisibleElement(By.xpath(StandardDistItemsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr"));
	}

	/*StandardConfig->StandardDistItemsGrid*/
	public WebElement get_StandardDistItemsGrid_CellbyCellText_Self(String cellText){
		return driver.findElement(By.xpath(StandardDistItemsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']")).findVisibleElement(By.xpath(StandardDistItemsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']"));
	}

	/*StandardConfig->StandardDistItemsGrid*/
	public WebElement get_StandardDistItemsGrid_RowbyCellText_Self(String cellText){
		return driver.findElement(By.xpath(StandardDistItemsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/..")).findVisibleElement(By.xpath(StandardDistItemsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/.."));
	}

	/*StandardConfig->StandardDistItemsGrid*/
	public WebElement get_StandardDistItemsGrid_CellbyOtherInlineCellText_Self(String otherInlineCellText,String targetCellText){
		return driver.findElement(By.xpath(StandardDistItemsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']")).findVisibleElement(By.xpath(StandardDistItemsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']"));
	}

	/*StandardConfig->StandardDistItemsGrid*/
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
