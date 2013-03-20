package com.ibm.CNNC.elements;

import java.util.*;
import org.openqa.selenium.*;
import com.selenium.utils.WebDriver;
import com.selenium.utils.WebElement;

/*catalog\widget\dm\lendmanage\nativeborrow\templates\NativeBorrow.html*/
public class NativeBorrow {
	protected WebDriver driver;
	private static final String addBorrowDocsBtn_XPath="//descendant::div[contains(@id,'NativeBorrow')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"Ìí¼Ó½èÔÄÎÄµµ"+"']";
	private static final String removeBorrowDocsBtn_XPath="//descendant::div[contains(@id,'NativeBorrow')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"É¾³ý"+"']";
	private static final String borrowDocumentGrid_XPath="//descendant::div[contains(@id,'NativeBorrow')]/descendant::div[contains(@id,'DataGrid')]";
	private static final String onStartBorrow_XPath="//descendant::div[contains(@id,'NativeBorrow')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"½èÔÄ"+"']";

	//----Constructor Methods Begin----
	public NativeBorrow(WebDriver driver){
		this.driver=driver;
	}

	/*NativeBorrow->addBorrowDocsBtn*/
	public void addBorrowDocsBtn_click(){
		WebElement addBorrowDocsBtn = driver.findElement(By.xpath(addBorrowDocsBtn_XPath)).findVisibleElement(By.xpath(addBorrowDocsBtn_XPath));
		addBorrowDocsBtn.click();
	}

	/*NativeBorrow->addBorrowDocsBtn*/
	public WebElement get_addBorrowDocsBtn_Self(){
		return driver.findElement(By.xpath(addBorrowDocsBtn_XPath)).findVisibleElement(By.xpath(addBorrowDocsBtn_XPath));
	}

	/*NativeBorrow->removeBorrowDocsBtn*/
	public void removeBorrowDocsBtn_click(){
		WebElement removeBorrowDocsBtn = driver.findElement(By.xpath(removeBorrowDocsBtn_XPath)).findVisibleElement(By.xpath(removeBorrowDocsBtn_XPath));
		removeBorrowDocsBtn.click();
	}

	/*NativeBorrow->removeBorrowDocsBtn*/
	public WebElement get_removeBorrowDocsBtn_Self(){
		return driver.findElement(By.xpath(removeBorrowDocsBtn_XPath)).findVisibleElement(By.xpath(removeBorrowDocsBtn_XPath));
	}

	/*NativeBorrow->borrowDocumentGrid*/
	public void borrowDocumentGrid_colCaptionClick(String captionName){
		WebElement borrowDocumentGrid = driver.findElement(By.xpath(borrowDocumentGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']")).findVisibleElement(By.xpath(borrowDocumentGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']"));
		borrowDocumentGrid.click();
	}

	/*NativeBorrow->borrowDocumentGrid*/
	public void borrowDocumentGrid_selectCellbyRowColNumber(int rowNum,int colNum){
		WebElement borrowDocumentGrid = driver.findElement(By.xpath(borrowDocumentGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]")).findVisibleElement(By.xpath(borrowDocumentGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]"));
		borrowDocumentGrid.click();
	}

	/*NativeBorrow->borrowDocumentGrid*/
	public void borrowDocumentGrid_selectRowbyRowColNumber(int rowNum,int colNum){
		WebElement borrowDocumentGrid = driver.findElement(By.xpath(borrowDocumentGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/..")).findVisibleElement(By.xpath(borrowDocumentGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/.."));
		borrowDocumentGrid.click();
	}

	/*NativeBorrow->borrowDocumentGrid*/
	public void borrowDocumentGrid_selectRowbyRowNumber(int rowNum){
		WebElement borrowDocumentGrid = driver.findElement(By.xpath(borrowDocumentGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr")).findVisibleElement(By.xpath(borrowDocumentGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr"));
		borrowDocumentGrid.click();
	}

	/*NativeBorrow->borrowDocumentGrid*/
	public void borrowDocumentGrid_selectCellbyCellText(String cellText){
		WebElement borrowDocumentGrid = driver.findElement(By.xpath(borrowDocumentGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']")).findVisibleElement(By.xpath(borrowDocumentGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']"));
		borrowDocumentGrid.click();
	}

	/*NativeBorrow->borrowDocumentGrid*/
	public void borrowDocumentGrid_selectRowbyCellText(String cellText){
		WebElement borrowDocumentGrid = driver.findElement(By.xpath(borrowDocumentGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/..")).findVisibleElement(By.xpath(borrowDocumentGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/.."));
		borrowDocumentGrid.click();
	}

	/*NativeBorrow->borrowDocumentGrid*/
	public void borrowDocumentGrid_selectCellbyOtherInlineCellText(String otherInlineCellText,String targetCellText){
		WebElement borrowDocumentGrid = driver.findElement(By.xpath(borrowDocumentGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']")).findVisibleElement(By.xpath(borrowDocumentGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']"));
		borrowDocumentGrid.click();
	}

	/*NativeBorrow->borrowDocumentGrid*/
	public void borrowDocumentGrid_selectCellbyColNameCellText(String colName,String cellText){
		WebElement borrowDocumentGrid = driver.findElement(By.xpath(borrowDocumentGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../..")).findVisibleElement(By.xpath(borrowDocumentGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../.."));
		String idx=borrowDocumentGrid.getAttribute("idx");
		List<WebElement> Gridrows = driver.findAll(By.xpath(borrowDocumentGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]"));
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

	/*NativeBorrow->borrowDocumentGrid*/
	public WebElement get_borrowDocumentGrid_colCaption_Self(String captionName){
		return driver.findElement(By.xpath(borrowDocumentGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']")).findVisibleElement(By.xpath(borrowDocumentGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']"));
	}

	/*NativeBorrow->borrowDocumentGrid*/
	public WebElement get_borrowDocumentGrid_CellbyRowColNumber_Self(int rowNum,int colNum){
		return driver.findElement(By.xpath(borrowDocumentGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]")).findVisibleElement(By.xpath(borrowDocumentGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]"));
	}

	/*NativeBorrow->borrowDocumentGrid*/
	public WebElement get_borrowDocumentGrid_RowbyRowColNumber_Self(int rowNum,int colNum){
		return driver.findElement(By.xpath(borrowDocumentGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/..")).findVisibleElement(By.xpath(borrowDocumentGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/.."));
	}

	/*NativeBorrow->borrowDocumentGrid*/
	public WebElement get_borrowDocumentGrid_RowbyRowNumber_Self(int rowNum){
		return driver.findElement(By.xpath(borrowDocumentGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr")).findVisibleElement(By.xpath(borrowDocumentGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr"));
	}

	/*NativeBorrow->borrowDocumentGrid*/
	public WebElement get_borrowDocumentGrid_CellbyCellText_Self(String cellText){
		return driver.findElement(By.xpath(borrowDocumentGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']")).findVisibleElement(By.xpath(borrowDocumentGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']"));
	}

	/*NativeBorrow->borrowDocumentGrid*/
	public WebElement get_borrowDocumentGrid_RowbyCellText_Self(String cellText){
		return driver.findElement(By.xpath(borrowDocumentGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/..")).findVisibleElement(By.xpath(borrowDocumentGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/.."));
	}

	/*NativeBorrow->borrowDocumentGrid*/
	public WebElement get_borrowDocumentGrid_CellbyOtherInlineCellText_Self(String otherInlineCellText,String targetCellText){
		return driver.findElement(By.xpath(borrowDocumentGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']")).findVisibleElement(By.xpath(borrowDocumentGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']"));
	}

	/*NativeBorrow->borrowDocumentGrid*/
	public WebElement get_borrowDocumentGrid_CellbyColNameCellText_Self(String colName,String cellText){
		WebElement borrowDocumentGrid = driver.findElement(By.xpath(borrowDocumentGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../..")).findVisibleElement(By.xpath(borrowDocumentGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../.."));
		String idx=borrowDocumentGrid.getAttribute("idx");
		List<WebElement> Gridrows = driver.findAll(By.xpath(borrowDocumentGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]"));
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

	/*NativeBorrow->onClick:->onStartBorrow*/
	public void onStartBorrow_click(){
		WebElement onStartBorrow = driver.findElement(By.xpath(onStartBorrow_XPath)).findVisibleElement(By.xpath(onStartBorrow_XPath));
		onStartBorrow.click();
	}

	/*NativeBorrow->onClick:->onStartBorrow*/
	public WebElement get_onStartBorrow_Self(){
		return driver.findElement(By.xpath(onStartBorrow_XPath)).findVisibleElement(By.xpath(onStartBorrow_XPath));
	}

}
