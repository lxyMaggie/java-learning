package com.ibm.CNNC.elements;

import java.util.*;
import org.openqa.selenium.*;
import com.selenium.utils.WebDriver;
import com.selenium.utils.WebElement;

/*catalog\widget\dm\sysmanage\classlinkconfig\templates\ClassLinkConfigDialog.html*/
public class ClassLinkConfigDialog {
	protected WebDriver driver;
	private static final String sourcePropsGrid_XPath="//descendant::div[contains(@id,'ClassLinkConfigDialog')]/descendant::div[contains(@id,'DataGrid')]";
	private static final String destinationPropsGrid_XPath="//descendant::div[contains(@id,'ClassLinkConfigDialog')]/descendant::div[contains(@id,'DataGrid')]";
	private static final String okButton_XPath="//descendant::div[contains(@id,'ClassLinkConfigDialog')]/descendant::span[contains(@id,'ClassLinkConfigDialog')][contains(@id,'_OKButton')][contains(@id, 'Button')][normalize-space(text())='"+"确定"+"']";
	private static final String cancelButton_XPath="//descendant::div[contains(@id,'ClassLinkConfigDialog')]/descendant::span[contains(@id,'ClassLinkConfigDialog')][contains(@id,'_CancelButton')][contains(@id, 'Button')][normalize-space(text())='"+"取消"+"']";
	private static final String Actionbar_XPath="//div[contains(@id,'ClassLinkConfigDialog')]";

	//----Constructor Methods Begin----
	public ClassLinkConfigDialog(WebDriver driver){
		this.driver=driver;
	}

	/*ClassLinkConfigDialog->sourcePropsGrid*/
	public void sourcePropsGrid_colCaptionClick(String captionName){
		WebElement sourcePropsGrid = driver.findElement(By.xpath(sourcePropsGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']")).findVisibleElement(By.xpath(sourcePropsGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']"));
		sourcePropsGrid.click();
	}

	/*ClassLinkConfigDialog->sourcePropsGrid*/
	public void sourcePropsGrid_selectCellbyRowColNumber(int rowNum,int colNum){
		WebElement sourcePropsGrid = driver.findElement(By.xpath(sourcePropsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]")).findVisibleElement(By.xpath(sourcePropsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]"));
		sourcePropsGrid.click();
	}

	/*ClassLinkConfigDialog->sourcePropsGrid*/
	public void sourcePropsGrid_selectRowbyRowColNumber(int rowNum,int colNum){
		WebElement sourcePropsGrid = driver.findElement(By.xpath(sourcePropsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/..")).findVisibleElement(By.xpath(sourcePropsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/.."));
		sourcePropsGrid.click();
	}

	/*ClassLinkConfigDialog->sourcePropsGrid*/
	public void sourcePropsGrid_selectRowbyRowNumber(int rowNum){
		WebElement sourcePropsGrid = driver.findElement(By.xpath(sourcePropsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr")).findVisibleElement(By.xpath(sourcePropsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr"));
		sourcePropsGrid.click();
	}

	/*ClassLinkConfigDialog->sourcePropsGrid*/
	public void sourcePropsGrid_selectCellbyCellText(String cellText){
		WebElement sourcePropsGrid = driver.findElement(By.xpath(sourcePropsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']")).findVisibleElement(By.xpath(sourcePropsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']"));
		sourcePropsGrid.click();
	}

	/*ClassLinkConfigDialog->sourcePropsGrid*/
	public void sourcePropsGrid_selectRowbyCellText(String cellText){
		WebElement sourcePropsGrid = driver.findElement(By.xpath(sourcePropsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/..")).findVisibleElement(By.xpath(sourcePropsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/.."));
		sourcePropsGrid.click();
	}

	/*ClassLinkConfigDialog->sourcePropsGrid*/
	public void sourcePropsGrid_selectCellbyOtherInlineCellText(String otherInlineCellText,String targetCellText){
		WebElement sourcePropsGrid = driver.findElement(By.xpath(sourcePropsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']")).findVisibleElement(By.xpath(sourcePropsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']"));
		sourcePropsGrid.click();
	}

	/*ClassLinkConfigDialog->sourcePropsGrid*/
	public void sourcePropsGrid_selectCellbyColNameCellText(String colName,String cellText){
		WebElement sourcePropsGrid = driver.findElement(By.xpath(sourcePropsGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../..")).findVisibleElement(By.xpath(sourcePropsGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../.."));
		String idx=sourcePropsGrid.getAttribute("idx");
		List<WebElement> Gridrows = driver.findAll(By.xpath(sourcePropsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]"));
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

	/*ClassLinkConfigDialog->sourcePropsGrid*/
	public WebElement get_sourcePropsGrid_colCaption_Self(String captionName){
		return driver.findElement(By.xpath(sourcePropsGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']")).findVisibleElement(By.xpath(sourcePropsGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']"));
	}

	/*ClassLinkConfigDialog->sourcePropsGrid*/
	public WebElement get_sourcePropsGrid_CellbyRowColNumber_Self(int rowNum,int colNum){
		return driver.findElement(By.xpath(sourcePropsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]")).findVisibleElement(By.xpath(sourcePropsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]"));
	}

	/*ClassLinkConfigDialog->sourcePropsGrid*/
	public WebElement get_sourcePropsGrid_RowbyRowColNumber_Self(int rowNum,int colNum){
		return driver.findElement(By.xpath(sourcePropsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/..")).findVisibleElement(By.xpath(sourcePropsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/.."));
	}

	/*ClassLinkConfigDialog->sourcePropsGrid*/
	public WebElement get_sourcePropsGrid_RowbyRowNumber_Self(int rowNum){
		return driver.findElement(By.xpath(sourcePropsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr")).findVisibleElement(By.xpath(sourcePropsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr"));
	}

	/*ClassLinkConfigDialog->sourcePropsGrid*/
	public WebElement get_sourcePropsGrid_CellbyCellText_Self(String cellText){
		return driver.findElement(By.xpath(sourcePropsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']")).findVisibleElement(By.xpath(sourcePropsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']"));
	}

	/*ClassLinkConfigDialog->sourcePropsGrid*/
	public WebElement get_sourcePropsGrid_RowbyCellText_Self(String cellText){
		return driver.findElement(By.xpath(sourcePropsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/..")).findVisibleElement(By.xpath(sourcePropsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/.."));
	}

	/*ClassLinkConfigDialog->sourcePropsGrid*/
	public WebElement get_sourcePropsGrid_CellbyOtherInlineCellText_Self(String otherInlineCellText,String targetCellText){
		return driver.findElement(By.xpath(sourcePropsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']")).findVisibleElement(By.xpath(sourcePropsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']"));
	}

	/*ClassLinkConfigDialog->sourcePropsGrid*/
	public WebElement get_sourcePropsGrid_CellbyColNameCellText_Self(String colName,String cellText){
		WebElement sourcePropsGrid = driver.findElement(By.xpath(sourcePropsGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../..")).findVisibleElement(By.xpath(sourcePropsGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../.."));
		String idx=sourcePropsGrid.getAttribute("idx");
		List<WebElement> Gridrows = driver.findAll(By.xpath(sourcePropsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]"));
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

	/*ClassLinkConfigDialog->destinationPropsGrid*/
	public void destinationPropsGrid_colCaptionClick(String captionName){
		WebElement destinationPropsGrid = driver.findElement(By.xpath(destinationPropsGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']")).findVisibleElement(By.xpath(destinationPropsGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']"));
		destinationPropsGrid.click();
	}

	/*ClassLinkConfigDialog->destinationPropsGrid*/
	public void destinationPropsGrid_selectCellbyRowColNumber(int rowNum,int colNum){
		WebElement destinationPropsGrid = driver.findElement(By.xpath(destinationPropsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]")).findVisibleElement(By.xpath(destinationPropsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]"));
		destinationPropsGrid.click();
	}

	/*ClassLinkConfigDialog->destinationPropsGrid*/
	public void destinationPropsGrid_selectRowbyRowColNumber(int rowNum,int colNum){
		WebElement destinationPropsGrid = driver.findElement(By.xpath(destinationPropsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/..")).findVisibleElement(By.xpath(destinationPropsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/.."));
		destinationPropsGrid.click();
	}

	/*ClassLinkConfigDialog->destinationPropsGrid*/
	public void destinationPropsGrid_selectRowbyRowNumber(int rowNum){
		WebElement destinationPropsGrid = driver.findElement(By.xpath(destinationPropsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr")).findVisibleElement(By.xpath(destinationPropsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr"));
		destinationPropsGrid.click();
	}

	/*ClassLinkConfigDialog->destinationPropsGrid*/
	public void destinationPropsGrid_selectCellbyCellText(String cellText){
		WebElement destinationPropsGrid = driver.findElement(By.xpath(destinationPropsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']")).findVisibleElement(By.xpath(destinationPropsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']"));
		destinationPropsGrid.click();
	}

	/*ClassLinkConfigDialog->destinationPropsGrid*/
	public void destinationPropsGrid_selectRowbyCellText(String cellText){
		WebElement destinationPropsGrid = driver.findElement(By.xpath(destinationPropsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/..")).findVisibleElement(By.xpath(destinationPropsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/.."));
		destinationPropsGrid.click();
	}

	/*ClassLinkConfigDialog->destinationPropsGrid*/
	public void destinationPropsGrid_selectCellbyOtherInlineCellText(String otherInlineCellText,String targetCellText){
		WebElement destinationPropsGrid = driver.findElement(By.xpath(destinationPropsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']")).findVisibleElement(By.xpath(destinationPropsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']"));
		destinationPropsGrid.click();
	}

	/*ClassLinkConfigDialog->destinationPropsGrid*/
	public void destinationPropsGrid_selectCellbyColNameCellText(String colName,String cellText){
		WebElement destinationPropsGrid = driver.findElement(By.xpath(destinationPropsGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../..")).findVisibleElement(By.xpath(destinationPropsGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../.."));
		String idx=destinationPropsGrid.getAttribute("idx");
		List<WebElement> Gridrows = driver.findAll(By.xpath(destinationPropsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]"));
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

	/*ClassLinkConfigDialog->destinationPropsGrid*/
	public WebElement get_destinationPropsGrid_colCaption_Self(String captionName){
		return driver.findElement(By.xpath(destinationPropsGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']")).findVisibleElement(By.xpath(destinationPropsGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']"));
	}

	/*ClassLinkConfigDialog->destinationPropsGrid*/
	public WebElement get_destinationPropsGrid_CellbyRowColNumber_Self(int rowNum,int colNum){
		return driver.findElement(By.xpath(destinationPropsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]")).findVisibleElement(By.xpath(destinationPropsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]"));
	}

	/*ClassLinkConfigDialog->destinationPropsGrid*/
	public WebElement get_destinationPropsGrid_RowbyRowColNumber_Self(int rowNum,int colNum){
		return driver.findElement(By.xpath(destinationPropsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/..")).findVisibleElement(By.xpath(destinationPropsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/.."));
	}

	/*ClassLinkConfigDialog->destinationPropsGrid*/
	public WebElement get_destinationPropsGrid_RowbyRowNumber_Self(int rowNum){
		return driver.findElement(By.xpath(destinationPropsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr")).findVisibleElement(By.xpath(destinationPropsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr"));
	}

	/*ClassLinkConfigDialog->destinationPropsGrid*/
	public WebElement get_destinationPropsGrid_CellbyCellText_Self(String cellText){
		return driver.findElement(By.xpath(destinationPropsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']")).findVisibleElement(By.xpath(destinationPropsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']"));
	}

	/*ClassLinkConfigDialog->destinationPropsGrid*/
	public WebElement get_destinationPropsGrid_RowbyCellText_Self(String cellText){
		return driver.findElement(By.xpath(destinationPropsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/..")).findVisibleElement(By.xpath(destinationPropsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/.."));
	}

	/*ClassLinkConfigDialog->destinationPropsGrid*/
	public WebElement get_destinationPropsGrid_CellbyOtherInlineCellText_Self(String otherInlineCellText,String targetCellText){
		return driver.findElement(By.xpath(destinationPropsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']")).findVisibleElement(By.xpath(destinationPropsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']"));
	}

	/*ClassLinkConfigDialog->destinationPropsGrid*/
	public WebElement get_destinationPropsGrid_CellbyColNameCellText_Self(String colName,String cellText){
		WebElement destinationPropsGrid = driver.findElement(By.xpath(destinationPropsGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../..")).findVisibleElement(By.xpath(destinationPropsGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../.."));
		String idx=destinationPropsGrid.getAttribute("idx");
		List<WebElement> Gridrows = driver.findAll(By.xpath(destinationPropsGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]"));
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

	/*ClassLinkConfigDialog->okButton*/
	public void okButton_click(){
		WebElement okButton = driver.findElement(By.xpath(okButton_XPath)).findVisibleElement(By.xpath(okButton_XPath));
		okButton.click();
	}

	/*ClassLinkConfigDialog->okButton*/
	public WebElement get_okButton_Self(){
		return driver.findElement(By.xpath(okButton_XPath)).findVisibleElement(By.xpath(okButton_XPath));
	}

	/*ClassLinkConfigDialog->cancelButton*/
	public void cancelButton_click(){
		WebElement cancelButton = driver.findElement(By.xpath(cancelButton_XPath)).findVisibleElement(By.xpath(cancelButton_XPath));
		cancelButton.click();
	}

	/*ClassLinkConfigDialog->cancelButton*/
	public WebElement get_cancelButton_Self(){
		return driver.findElement(By.xpath(cancelButton_XPath)).findVisibleElement(By.xpath(cancelButton_XPath));
	}

	/*ClassLinkConfigDialog->Actionbar*/
	public void Actionbar_clickButtonbyLabel(String labelName){
		WebElement Actionbar = driver.findElement(By.xpath(Actionbar_XPath+"/descendant::div[contains(@class,'DialogPaneActionBar')]/descendant::span[contains(@id,'Button')][normalize-space(text())='"+labelName+"']")).findVisibleElement(By.xpath(Actionbar_XPath+"/descendant::div[contains(@class,'DialogPaneActionBar')]/descendant::span[contains(@id,'Button')][normalize-space(text())='"+labelName+"']"));
		Actionbar.click();
	}

	/*ClassLinkConfigDialog->Actionbar*/
	public WebElement get_Actionbar_Button_Self(String labelName){
		return driver.findElement(By.xpath(Actionbar_XPath+"/descendant::div[contains(@class,'DialogPaneActionBar')]/descendant::span[contains(@id,'Button')][normalize-space(text())='"+labelName+"']")).findVisibleElement(By.xpath(Actionbar_XPath+"/descendant::div[contains(@class,'DialogPaneActionBar')]/descendant::span[contains(@id,'Button')][normalize-space(text())='"+labelName+"']"));
	}

}
