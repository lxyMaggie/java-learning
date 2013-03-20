package com.ibm.CNNC.elements;

import java.util.*;
import org.openqa.selenium.*;
import com.selenium.utils.WebDriver;
import com.selenium.utils.WebElement;

/*catalog\widget\dm\lendmanage\documentdetail\templates\DocumentDetail.html*/
public class DocumentDetail {
	protected WebDriver driver;
	private static final String documentDetailGrid_XPath="//descendant::div[contains(@id,'DocumentDetail')]/descendant::div[contains(@id,'DataGrid')]";
	private static final String docPropertyBtn_XPath="//descendant::div[contains(@id,'DocumentDetail')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"ÎÄµµÊôÐÔ"+"']";
	private static final String bookApplyBtn_XPath="//descendant::div[contains(@id,'DocumentDetail')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"Ô¤Ô¼"+"']";

	//----Constructor Methods Begin----
	public DocumentDetail(WebDriver driver){
		this.driver=driver;
	}

	/*DocumentDetail->documentDetailGrid*/
	public void documentDetailGrid_colCaptionClick(String captionName){
		WebElement documentDetailGrid = driver.findElement(By.xpath(documentDetailGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']")).findVisibleElement(By.xpath(documentDetailGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']"));
		documentDetailGrid.click();
	}

	/*DocumentDetail->documentDetailGrid*/
	public void documentDetailGrid_selectCellbyRowColNumber(int rowNum,int colNum){
		WebElement documentDetailGrid = driver.findElement(By.xpath(documentDetailGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]")).findVisibleElement(By.xpath(documentDetailGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]"));
		documentDetailGrid.click();
	}

	/*DocumentDetail->documentDetailGrid*/
	public void documentDetailGrid_selectRowbyRowColNumber(int rowNum,int colNum){
		WebElement documentDetailGrid = driver.findElement(By.xpath(documentDetailGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/..")).findVisibleElement(By.xpath(documentDetailGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/.."));
		documentDetailGrid.click();
	}

	/*DocumentDetail->documentDetailGrid*/
	public void documentDetailGrid_selectRowbyRowNumber(int rowNum){
		WebElement documentDetailGrid = driver.findElement(By.xpath(documentDetailGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr")).findVisibleElement(By.xpath(documentDetailGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr"));
		documentDetailGrid.click();
	}

	/*DocumentDetail->documentDetailGrid*/
	public void documentDetailGrid_selectCellbyCellText(String cellText){
		WebElement documentDetailGrid = driver.findElement(By.xpath(documentDetailGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']")).findVisibleElement(By.xpath(documentDetailGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']"));
		documentDetailGrid.click();
	}

	/*DocumentDetail->documentDetailGrid*/
	public void documentDetailGrid_selectRowbyCellText(String cellText){
		WebElement documentDetailGrid = driver.findElement(By.xpath(documentDetailGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/..")).findVisibleElement(By.xpath(documentDetailGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/.."));
		documentDetailGrid.click();
	}

	/*DocumentDetail->documentDetailGrid*/
	public void documentDetailGrid_selectCellbyOtherInlineCellText(String otherInlineCellText,String targetCellText){
		WebElement documentDetailGrid = driver.findElement(By.xpath(documentDetailGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']")).findVisibleElement(By.xpath(documentDetailGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']"));
		documentDetailGrid.click();
	}

	/*DocumentDetail->documentDetailGrid*/
	public void documentDetailGrid_selectCellbyColNameCellText(String colName,String cellText){
		WebElement documentDetailGrid = driver.findElement(By.xpath(documentDetailGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../..")).findVisibleElement(By.xpath(documentDetailGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../.."));
		String idx=documentDetailGrid.getAttribute("idx");
		List<WebElement> Gridrows = driver.findAll(By.xpath(documentDetailGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]"));
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

	/*DocumentDetail->documentDetailGrid*/
	public WebElement get_documentDetailGrid_colCaption_Self(String captionName){
		return driver.findElement(By.xpath(documentDetailGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']")).findVisibleElement(By.xpath(documentDetailGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']"));
	}

	/*DocumentDetail->documentDetailGrid*/
	public WebElement get_documentDetailGrid_CellbyRowColNumber_Self(int rowNum,int colNum){
		return driver.findElement(By.xpath(documentDetailGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]")).findVisibleElement(By.xpath(documentDetailGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]"));
	}

	/*DocumentDetail->documentDetailGrid*/
	public WebElement get_documentDetailGrid_RowbyRowColNumber_Self(int rowNum,int colNum){
		return driver.findElement(By.xpath(documentDetailGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/..")).findVisibleElement(By.xpath(documentDetailGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/.."));
	}

	/*DocumentDetail->documentDetailGrid*/
	public WebElement get_documentDetailGrid_RowbyRowNumber_Self(int rowNum){
		return driver.findElement(By.xpath(documentDetailGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr")).findVisibleElement(By.xpath(documentDetailGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr"));
	}

	/*DocumentDetail->documentDetailGrid*/
	public WebElement get_documentDetailGrid_CellbyCellText_Self(String cellText){
		return driver.findElement(By.xpath(documentDetailGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']")).findVisibleElement(By.xpath(documentDetailGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']"));
	}

	/*DocumentDetail->documentDetailGrid*/
	public WebElement get_documentDetailGrid_RowbyCellText_Self(String cellText){
		return driver.findElement(By.xpath(documentDetailGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/..")).findVisibleElement(By.xpath(documentDetailGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/.."));
	}

	/*DocumentDetail->documentDetailGrid*/
	public WebElement get_documentDetailGrid_CellbyOtherInlineCellText_Self(String otherInlineCellText,String targetCellText){
		return driver.findElement(By.xpath(documentDetailGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']")).findVisibleElement(By.xpath(documentDetailGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']"));
	}

	/*DocumentDetail->documentDetailGrid*/
	public WebElement get_documentDetailGrid_CellbyColNameCellText_Self(String colName,String cellText){
		WebElement documentDetailGrid = driver.findElement(By.xpath(documentDetailGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../..")).findVisibleElement(By.xpath(documentDetailGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../.."));
		String idx=documentDetailGrid.getAttribute("idx");
		List<WebElement> Gridrows = driver.findAll(By.xpath(documentDetailGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]"));
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

	/*DocumentDetail->docPropertyBtn*/
	public void docPropertyBtn_click(){
		WebElement docPropertyBtn = driver.findElement(By.xpath(docPropertyBtn_XPath)).findVisibleElement(By.xpath(docPropertyBtn_XPath));
		docPropertyBtn.click();
	}

	/*DocumentDetail->docPropertyBtn*/
	public WebElement get_docPropertyBtn_Self(){
		return driver.findElement(By.xpath(docPropertyBtn_XPath)).findVisibleElement(By.xpath(docPropertyBtn_XPath));
	}

	/*DocumentDetail->bookApplyBtn*/
	public void bookApplyBtn_click(){
		WebElement bookApplyBtn = driver.findElement(By.xpath(bookApplyBtn_XPath)).findVisibleElement(By.xpath(bookApplyBtn_XPath));
		bookApplyBtn.click();
	}

	/*DocumentDetail->bookApplyBtn*/
	public WebElement get_bookApplyBtn_Self(){
		return driver.findElement(By.xpath(bookApplyBtn_XPath)).findVisibleElement(By.xpath(bookApplyBtn_XPath));
	}

}
