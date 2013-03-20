package com.ibm.CNNC.elements;

import java.util.*;
import org.openqa.selenium.*;
import com.selenium.utils.WebDriver;
import com.selenium.utils.WebElement;

/*catalog\widget\dm\docmanage\documentdata\dijit\templates\EntityNuclearFolderTab.html*/
public class EntityNuclearFolderTab {
	protected WebDriver driver;
	private static final String addButton_XPath="//descendant::div[contains(@id,'EntityNuclearFolderTab')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"Ìí¼Ó"+"']";
	private static final String updButton_XPath="//descendant::div[contains(@id,'EntityNuclearFolderTab')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"ÐÞ¸Ä"+"']";
	private static final String delButton_XPath="//descendant::div[contains(@id,'EntityNuclearFolderTab')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"É¾³ý"+"']";
	private static final String upArrow_XPath="//descendant::div[contains(@id,'EntityNuclearFolderTab')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+""+"']";
	private static final String downArrow_XPath="//descendant::div[contains(@id,'EntityNuclearFolderTab')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+""+"']";
	private static final String entityForderGrid_XPath="//descendant::div[contains(@id,'EntityNuclearFolderTab')]/descendant::div[contains(@id,'DataGrid')]";

	//----Constructor Methods Begin----
	public EntityNuclearFolderTab(WebDriver driver){
		this.driver=driver;
	}

	/*EntityNuclearFolderTab->addButton*/
	public void addButton_click(){
		WebElement addButton = driver.findElement(By.xpath(addButton_XPath)).findVisibleElement(By.xpath(addButton_XPath));
		addButton.click();
	}

	/*EntityNuclearFolderTab->addButton*/
	public WebElement get_addButton_Self(){
		return driver.findElement(By.xpath(addButton_XPath)).findVisibleElement(By.xpath(addButton_XPath));
	}

	/*EntityNuclearFolderTab->updButton*/
	public void updButton_click(){
		WebElement updButton = driver.findElement(By.xpath(updButton_XPath)).findVisibleElement(By.xpath(updButton_XPath));
		updButton.click();
	}

	/*EntityNuclearFolderTab->updButton*/
	public WebElement get_updButton_Self(){
		return driver.findElement(By.xpath(updButton_XPath)).findVisibleElement(By.xpath(updButton_XPath));
	}

	/*EntityNuclearFolderTab->delButton*/
	public void delButton_click(){
		WebElement delButton = driver.findElement(By.xpath(delButton_XPath)).findVisibleElement(By.xpath(delButton_XPath));
		delButton.click();
	}

	/*EntityNuclearFolderTab->delButton*/
	public WebElement get_delButton_Self(){
		return driver.findElement(By.xpath(delButton_XPath)).findVisibleElement(By.xpath(delButton_XPath));
	}

	/*EntityNuclearFolderTab->upArrow*/
	public void upArrow_click(){
		WebElement upArrow = driver.findElement(By.xpath(upArrow_XPath)).findVisibleElement(By.xpath(upArrow_XPath));
		upArrow.click();
	}

	/*EntityNuclearFolderTab->upArrow*/
	public WebElement get_upArrow_Self(){
		return driver.findElement(By.xpath(upArrow_XPath)).findVisibleElement(By.xpath(upArrow_XPath));
	}

	/*EntityNuclearFolderTab->downArrow*/
	public void downArrow_click(){
		WebElement downArrow = driver.findElement(By.xpath(downArrow_XPath)).findVisibleElement(By.xpath(downArrow_XPath));
		downArrow.click();
	}

	/*EntityNuclearFolderTab->downArrow*/
	public WebElement get_downArrow_Self(){
		return driver.findElement(By.xpath(downArrow_XPath)).findVisibleElement(By.xpath(downArrow_XPath));
	}

	/*EntityNuclearFolderTab->entityForderGrid*/
	public void entityForderGrid_colCaptionClick(String captionName){
		WebElement entityForderGrid = driver.findElement(By.xpath(entityForderGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']")).findVisibleElement(By.xpath(entityForderGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']"));
		entityForderGrid.click();
	}

	/*EntityNuclearFolderTab->entityForderGrid*/
	public void entityForderGrid_selectCellbyRowColNumber(int rowNum,int colNum){
		WebElement entityForderGrid = driver.findElement(By.xpath(entityForderGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]")).findVisibleElement(By.xpath(entityForderGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]"));
		entityForderGrid.click();
	}

	/*EntityNuclearFolderTab->entityForderGrid*/
	public void entityForderGrid_selectRowbyRowColNumber(int rowNum,int colNum){
		WebElement entityForderGrid = driver.findElement(By.xpath(entityForderGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/..")).findVisibleElement(By.xpath(entityForderGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/.."));
		entityForderGrid.click();
	}

	/*EntityNuclearFolderTab->entityForderGrid*/
	public void entityForderGrid_selectRowbyRowNumber(int rowNum){
		WebElement entityForderGrid = driver.findElement(By.xpath(entityForderGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr")).findVisibleElement(By.xpath(entityForderGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr"));
		entityForderGrid.click();
	}

	/*EntityNuclearFolderTab->entityForderGrid*/
	public void entityForderGrid_selectCellbyCellText(String cellText){
		WebElement entityForderGrid = driver.findElement(By.xpath(entityForderGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']")).findVisibleElement(By.xpath(entityForderGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']"));
		entityForderGrid.click();
	}

	/*EntityNuclearFolderTab->entityForderGrid*/
	public void entityForderGrid_selectRowbyCellText(String cellText){
		WebElement entityForderGrid = driver.findElement(By.xpath(entityForderGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/..")).findVisibleElement(By.xpath(entityForderGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/.."));
		entityForderGrid.click();
	}

	/*EntityNuclearFolderTab->entityForderGrid*/
	public void entityForderGrid_selectCellbyOtherInlineCellText(String otherInlineCellText,String targetCellText){
		WebElement entityForderGrid = driver.findElement(By.xpath(entityForderGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']")).findVisibleElement(By.xpath(entityForderGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']"));
		entityForderGrid.click();
	}

	/*EntityNuclearFolderTab->entityForderGrid*/
	public void entityForderGrid_selectCellbyColNameCellText(String colName,String cellText){
		WebElement entityForderGrid = driver.findElement(By.xpath(entityForderGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../..")).findVisibleElement(By.xpath(entityForderGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../.."));
		String idx=entityForderGrid.getAttribute("idx");
		List<WebElement> Gridrows = driver.findAll(By.xpath(entityForderGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]"));
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

	/*EntityNuclearFolderTab->entityForderGrid*/
	public WebElement get_entityForderGrid_colCaption_Self(String captionName){
		return driver.findElement(By.xpath(entityForderGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']")).findVisibleElement(By.xpath(entityForderGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']"));
	}

	/*EntityNuclearFolderTab->entityForderGrid*/
	public WebElement get_entityForderGrid_CellbyRowColNumber_Self(int rowNum,int colNum){
		return driver.findElement(By.xpath(entityForderGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]")).findVisibleElement(By.xpath(entityForderGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]"));
	}

	/*EntityNuclearFolderTab->entityForderGrid*/
	public WebElement get_entityForderGrid_RowbyRowColNumber_Self(int rowNum,int colNum){
		return driver.findElement(By.xpath(entityForderGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/..")).findVisibleElement(By.xpath(entityForderGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/.."));
	}

	/*EntityNuclearFolderTab->entityForderGrid*/
	public WebElement get_entityForderGrid_RowbyRowNumber_Self(int rowNum){
		return driver.findElement(By.xpath(entityForderGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr")).findVisibleElement(By.xpath(entityForderGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr"));
	}

	/*EntityNuclearFolderTab->entityForderGrid*/
	public WebElement get_entityForderGrid_CellbyCellText_Self(String cellText){
		return driver.findElement(By.xpath(entityForderGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']")).findVisibleElement(By.xpath(entityForderGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']"));
	}

	/*EntityNuclearFolderTab->entityForderGrid*/
	public WebElement get_entityForderGrid_RowbyCellText_Self(String cellText){
		return driver.findElement(By.xpath(entityForderGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/..")).findVisibleElement(By.xpath(entityForderGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/.."));
	}

	/*EntityNuclearFolderTab->entityForderGrid*/
	public WebElement get_entityForderGrid_CellbyOtherInlineCellText_Self(String otherInlineCellText,String targetCellText){
		return driver.findElement(By.xpath(entityForderGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']")).findVisibleElement(By.xpath(entityForderGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']"));
	}

	/*EntityNuclearFolderTab->entityForderGrid*/
	public WebElement get_entityForderGrid_CellbyColNameCellText_Self(String colName,String cellText){
		WebElement entityForderGrid = driver.findElement(By.xpath(entityForderGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../..")).findVisibleElement(By.xpath(entityForderGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../.."));
		String idx=entityForderGrid.getAttribute("idx");
		List<WebElement> Gridrows = driver.findAll(By.xpath(entityForderGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]"));
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
