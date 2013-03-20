package com.ibm.CNNC.elements;

import java.util.*;
import org.openqa.selenium.*;
import com.selenium.utils.WebDriver;
import com.selenium.utils.WebElement;

/*catalog\widget\dm\distribute\docdistributionrecord\templates\ViewDistTicketRecord.html*/
public class ViewDistTicketRecord {
	protected WebDriver driver;
	private static final String distTicketDocsGrid_XPath="//descendant::div[contains(@id,'ViewDistTicketRecord')]/descendant::div[contains(@id,'DataGrid')]";
	private static final String onAddAdditionalOrderItems_XPath="//descendant::div[contains(@id,'ViewDistTicketRecord')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"补充指令分发对象"+"']";
	private static final String onAddAdditionalStandardItems_XPath="//descendant::div[contains(@id,'ViewDistTicketRecord')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"补充标准分发对象"+"']";
	private static final String onRemoveDepartItems_XPath="//descendant::div[contains(@id,'ViewDistTicketRecord')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"移除选中对象"+"']";
	private static final String distTicketItemsGrid_XPath="//descendant::div[contains(@id,'ViewDistTicketRecord')]/descendant::div[contains(@id,'DataGrid')]";
	private static final String onOK_XPath="//descendant::div[contains(@id,'ViewDistTicketRecord')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"打印"+"']";
	private static final String onCancel_XPath="//descendant::div[contains(@id,'ViewDistTicketRecord')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"返回"+"']";
	private static final String disBtn_XPath="//descendant::div[contains(@id,'ViewDistTicketRecord')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"补充分发"+"']";

	//----Constructor Methods Begin----
	public ViewDistTicketRecord(WebDriver driver){
		this.driver=driver;
	}

	/*ViewDistTicketRecord->distTicketDocsGrid*/
	public void distTicketDocsGrid_colCaptionClick(String captionName){
		WebElement distTicketDocsGrid = driver.findElement(By.xpath(distTicketDocsGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']")).findVisibleElement(By.xpath(distTicketDocsGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']"));
		distTicketDocsGrid.click();
	}

	/*ViewDistTicketRecord->distTicketDocsGrid*/
	public void distTicketDocsGrid_selectCellbyRowColNumber(int rowNum,int colNum){
		WebElement distTicketDocsGrid = driver.findElement(By.xpath(distTicketDocsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]")).findVisibleElement(By.xpath(distTicketDocsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]"));
		distTicketDocsGrid.click();
	}

	/*ViewDistTicketRecord->distTicketDocsGrid*/
	public void distTicketDocsGrid_selectRowbyRowColNumber(int rowNum,int colNum){
		WebElement distTicketDocsGrid = driver.findElement(By.xpath(distTicketDocsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/..")).findVisibleElement(By.xpath(distTicketDocsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/.."));
		distTicketDocsGrid.click();
	}

	/*ViewDistTicketRecord->distTicketDocsGrid*/
	public void distTicketDocsGrid_selectRowbyRowNumber(int rowNum){
		WebElement distTicketDocsGrid = driver.findElement(By.xpath(distTicketDocsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr")).findVisibleElement(By.xpath(distTicketDocsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr"));
		distTicketDocsGrid.click();
	}

	/*ViewDistTicketRecord->distTicketDocsGrid*/
	public void distTicketDocsGrid_selectCellbyCellText(String cellText){
		WebElement distTicketDocsGrid = driver.findElement(By.xpath(distTicketDocsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']")).findVisibleElement(By.xpath(distTicketDocsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']"));
		distTicketDocsGrid.click();
	}

	/*ViewDistTicketRecord->distTicketDocsGrid*/
	public void distTicketDocsGrid_selectRowbyCellText(String cellText){
		WebElement distTicketDocsGrid = driver.findElement(By.xpath(distTicketDocsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/..")).findVisibleElement(By.xpath(distTicketDocsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/.."));
		distTicketDocsGrid.click();
	}

	/*ViewDistTicketRecord->distTicketDocsGrid*/
	public void distTicketDocsGrid_selectCellbyOtherInlineCellText(String otherInlineCellText,String targetCellText){
		WebElement distTicketDocsGrid = driver.findElement(By.xpath(distTicketDocsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']")).findVisibleElement(By.xpath(distTicketDocsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']"));
		distTicketDocsGrid.click();
	}

	/*ViewDistTicketRecord->distTicketDocsGrid*/
	public void distTicketDocsGrid_selectCellbyColNameCellText(String colName,String cellText){
		WebElement distTicketDocsGrid = driver.findElement(By.xpath(distTicketDocsGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../..")).findVisibleElement(By.xpath(distTicketDocsGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../.."));
		String idx=distTicketDocsGrid.getAttribute("idx");
		List<WebElement> Gridrows = driver.findAll(By.xpath(distTicketDocsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]"));
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

	/*ViewDistTicketRecord->distTicketDocsGrid*/
	public WebElement get_distTicketDocsGrid_colCaption_Self(String captionName){
		return driver.findElement(By.xpath(distTicketDocsGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']")).findVisibleElement(By.xpath(distTicketDocsGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']"));
	}

	/*ViewDistTicketRecord->distTicketDocsGrid*/
	public WebElement get_distTicketDocsGrid_CellbyRowColNumber_Self(int rowNum,int colNum){
		return driver.findElement(By.xpath(distTicketDocsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]")).findVisibleElement(By.xpath(distTicketDocsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]"));
	}

	/*ViewDistTicketRecord->distTicketDocsGrid*/
	public WebElement get_distTicketDocsGrid_RowbyRowColNumber_Self(int rowNum,int colNum){
		return driver.findElement(By.xpath(distTicketDocsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/..")).findVisibleElement(By.xpath(distTicketDocsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/.."));
	}

	/*ViewDistTicketRecord->distTicketDocsGrid*/
	public WebElement get_distTicketDocsGrid_RowbyRowNumber_Self(int rowNum){
		return driver.findElement(By.xpath(distTicketDocsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr")).findVisibleElement(By.xpath(distTicketDocsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr"));
	}

	/*ViewDistTicketRecord->distTicketDocsGrid*/
	public WebElement get_distTicketDocsGrid_CellbyCellText_Self(String cellText){
		return driver.findElement(By.xpath(distTicketDocsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']")).findVisibleElement(By.xpath(distTicketDocsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']"));
	}

	/*ViewDistTicketRecord->distTicketDocsGrid*/
	public WebElement get_distTicketDocsGrid_RowbyCellText_Self(String cellText){
		return driver.findElement(By.xpath(distTicketDocsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/..")).findVisibleElement(By.xpath(distTicketDocsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/.."));
	}

	/*ViewDistTicketRecord->distTicketDocsGrid*/
	public WebElement get_distTicketDocsGrid_CellbyOtherInlineCellText_Self(String otherInlineCellText,String targetCellText){
		return driver.findElement(By.xpath(distTicketDocsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']")).findVisibleElement(By.xpath(distTicketDocsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']"));
	}

	/*ViewDistTicketRecord->distTicketDocsGrid*/
	public WebElement get_distTicketDocsGrid_CellbyColNameCellText_Self(String colName,String cellText){
		WebElement distTicketDocsGrid = driver.findElement(By.xpath(distTicketDocsGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../..")).findVisibleElement(By.xpath(distTicketDocsGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../.."));
		String idx=distTicketDocsGrid.getAttribute("idx");
		List<WebElement> Gridrows = driver.findAll(By.xpath(distTicketDocsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]"));
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

	/*ViewDistTicketRecord->onClick: onAddAdditionalOrderItems*/
	public void onAddAdditionalOrderItems_click(){
		WebElement onAddAdditionalOrderItems = driver.findElement(By.xpath(onAddAdditionalOrderItems_XPath)).findVisibleElement(By.xpath(onAddAdditionalOrderItems_XPath));
		onAddAdditionalOrderItems.click();
	}

	/*ViewDistTicketRecord->onClick: onAddAdditionalOrderItems*/
	public WebElement get_onAddAdditionalOrderItems_Self(){
		return driver.findElement(By.xpath(onAddAdditionalOrderItems_XPath)).findVisibleElement(By.xpath(onAddAdditionalOrderItems_XPath));
	}

	/*ViewDistTicketRecord->onClick: onAddAdditionalStandardItems*/
	public void onAddAdditionalStandardItems_click(){
		WebElement onAddAdditionalStandardItems = driver.findElement(By.xpath(onAddAdditionalStandardItems_XPath)).findVisibleElement(By.xpath(onAddAdditionalStandardItems_XPath));
		onAddAdditionalStandardItems.click();
	}

	/*ViewDistTicketRecord->onClick: onAddAdditionalStandardItems*/
	public WebElement get_onAddAdditionalStandardItems_Self(){
		return driver.findElement(By.xpath(onAddAdditionalStandardItems_XPath)).findVisibleElement(By.xpath(onAddAdditionalStandardItems_XPath));
	}

	/*ViewDistTicketRecord->onClick: onRemoveDepartItems*/
	public void onRemoveDepartItems_click(){
		WebElement onRemoveDepartItems = driver.findElement(By.xpath(onRemoveDepartItems_XPath)).findVisibleElement(By.xpath(onRemoveDepartItems_XPath));
		onRemoveDepartItems.click();
	}

	/*ViewDistTicketRecord->onClick: onRemoveDepartItems*/
	public WebElement get_onRemoveDepartItems_Self(){
		return driver.findElement(By.xpath(onRemoveDepartItems_XPath)).findVisibleElement(By.xpath(onRemoveDepartItems_XPath));
	}

	/*ViewDistTicketRecord->distTicketItemsGrid*/
	public void distTicketItemsGrid_colCaptionClick(String captionName){
		WebElement distTicketItemsGrid = driver.findElement(By.xpath(distTicketItemsGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']")).findVisibleElement(By.xpath(distTicketItemsGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']"));
		distTicketItemsGrid.click();
	}

	/*ViewDistTicketRecord->distTicketItemsGrid*/
	public void distTicketItemsGrid_selectCellbyRowColNumber(int rowNum,int colNum){
		WebElement distTicketItemsGrid = driver.findElement(By.xpath(distTicketItemsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]")).findVisibleElement(By.xpath(distTicketItemsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]"));
		distTicketItemsGrid.click();
	}

	/*ViewDistTicketRecord->distTicketItemsGrid*/
	public void distTicketItemsGrid_selectRowbyRowColNumber(int rowNum,int colNum){
		WebElement distTicketItemsGrid = driver.findElement(By.xpath(distTicketItemsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/..")).findVisibleElement(By.xpath(distTicketItemsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/.."));
		distTicketItemsGrid.click();
	}

	/*ViewDistTicketRecord->distTicketItemsGrid*/
	public void distTicketItemsGrid_selectRowbyRowNumber(int rowNum){
		WebElement distTicketItemsGrid = driver.findElement(By.xpath(distTicketItemsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr")).findVisibleElement(By.xpath(distTicketItemsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr"));
		distTicketItemsGrid.click();
	}

	/*ViewDistTicketRecord->distTicketItemsGrid*/
	public void distTicketItemsGrid_selectCellbyCellText(String cellText){
		WebElement distTicketItemsGrid = driver.findElement(By.xpath(distTicketItemsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']")).findVisibleElement(By.xpath(distTicketItemsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']"));
		distTicketItemsGrid.click();
	}

	/*ViewDistTicketRecord->distTicketItemsGrid*/
	public void distTicketItemsGrid_selectRowbyCellText(String cellText){
		WebElement distTicketItemsGrid = driver.findElement(By.xpath(distTicketItemsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/..")).findVisibleElement(By.xpath(distTicketItemsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/.."));
		distTicketItemsGrid.click();
	}

	/*ViewDistTicketRecord->distTicketItemsGrid*/
	public void distTicketItemsGrid_selectCellbyOtherInlineCellText(String otherInlineCellText,String targetCellText){
		WebElement distTicketItemsGrid = driver.findElement(By.xpath(distTicketItemsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']")).findVisibleElement(By.xpath(distTicketItemsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']"));
		distTicketItemsGrid.click();
	}

	/*ViewDistTicketRecord->distTicketItemsGrid*/
	public void distTicketItemsGrid_selectCellbyColNameCellText(String colName,String cellText){
		WebElement distTicketItemsGrid = driver.findElement(By.xpath(distTicketItemsGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../..")).findVisibleElement(By.xpath(distTicketItemsGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../.."));
		String idx=distTicketItemsGrid.getAttribute("idx");
		List<WebElement> Gridrows = driver.findAll(By.xpath(distTicketItemsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]"));
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

	/*ViewDistTicketRecord->distTicketItemsGrid*/
	public WebElement get_distTicketItemsGrid_colCaption_Self(String captionName){
		return driver.findElement(By.xpath(distTicketItemsGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']")).findVisibleElement(By.xpath(distTicketItemsGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']"));
	}

	/*ViewDistTicketRecord->distTicketItemsGrid*/
	public WebElement get_distTicketItemsGrid_CellbyRowColNumber_Self(int rowNum,int colNum){
		return driver.findElement(By.xpath(distTicketItemsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]")).findVisibleElement(By.xpath(distTicketItemsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]"));
	}

	/*ViewDistTicketRecord->distTicketItemsGrid*/
	public WebElement get_distTicketItemsGrid_RowbyRowColNumber_Self(int rowNum,int colNum){
		return driver.findElement(By.xpath(distTicketItemsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/..")).findVisibleElement(By.xpath(distTicketItemsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/.."));
	}

	/*ViewDistTicketRecord->distTicketItemsGrid*/
	public WebElement get_distTicketItemsGrid_RowbyRowNumber_Self(int rowNum){
		return driver.findElement(By.xpath(distTicketItemsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr")).findVisibleElement(By.xpath(distTicketItemsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr"));
	}

	/*ViewDistTicketRecord->distTicketItemsGrid*/
	public WebElement get_distTicketItemsGrid_CellbyCellText_Self(String cellText){
		return driver.findElement(By.xpath(distTicketItemsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']")).findVisibleElement(By.xpath(distTicketItemsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']"));
	}

	/*ViewDistTicketRecord->distTicketItemsGrid*/
	public WebElement get_distTicketItemsGrid_RowbyCellText_Self(String cellText){
		return driver.findElement(By.xpath(distTicketItemsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/..")).findVisibleElement(By.xpath(distTicketItemsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/.."));
	}

	/*ViewDistTicketRecord->distTicketItemsGrid*/
	public WebElement get_distTicketItemsGrid_CellbyOtherInlineCellText_Self(String otherInlineCellText,String targetCellText){
		return driver.findElement(By.xpath(distTicketItemsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']")).findVisibleElement(By.xpath(distTicketItemsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']"));
	}

	/*ViewDistTicketRecord->distTicketItemsGrid*/
	public WebElement get_distTicketItemsGrid_CellbyColNameCellText_Self(String colName,String cellText){
		WebElement distTicketItemsGrid = driver.findElement(By.xpath(distTicketItemsGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../..")).findVisibleElement(By.xpath(distTicketItemsGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../.."));
		String idx=distTicketItemsGrid.getAttribute("idx");
		List<WebElement> Gridrows = driver.findAll(By.xpath(distTicketItemsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]"));
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

	/*ViewDistTicketRecord->onClick: onOK*/
	public void onOK_click(){
		WebElement onOK = driver.findElement(By.xpath(onOK_XPath)).findVisibleElement(By.xpath(onOK_XPath));
		onOK.click();
	}

	/*ViewDistTicketRecord->onClick: onOK*/
	public WebElement get_onOK_Self(){
		return driver.findElement(By.xpath(onOK_XPath)).findVisibleElement(By.xpath(onOK_XPath));
	}

	/*ViewDistTicketRecord->onClick: onCancel*/
	public void onCancel_click(){
		WebElement onCancel = driver.findElement(By.xpath(onCancel_XPath)).findVisibleElement(By.xpath(onCancel_XPath));
		onCancel.click();
	}

	/*ViewDistTicketRecord->onClick: onCancel*/
	public WebElement get_onCancel_Self(){
		return driver.findElement(By.xpath(onCancel_XPath)).findVisibleElement(By.xpath(onCancel_XPath));
	}

	/*ViewDistTicketRecord->disBtn*/
	public void disBtn_click(){
		WebElement disBtn = driver.findElement(By.xpath(disBtn_XPath)).findVisibleElement(By.xpath(disBtn_XPath));
		disBtn.click();
	}

	/*ViewDistTicketRecord->disBtn*/
	public WebElement get_disBtn_Self(){
		return driver.findElement(By.xpath(disBtn_XPath)).findVisibleElement(By.xpath(disBtn_XPath));
	}

}
