package com.ibm.CNNC.elements;

import java.util.*;
import org.openqa.selenium.*;
import com.selenium.utils.WebDriver;
import com.selenium.utils.WebElement;

/*catalog\widget\dm\lendmanage\borrowcart\templates\BorrowCart.html*/
public class BorrowCart {
	protected WebDriver driver;
	private static final String docPropertyBtn_XPath="//descendant::div[contains(@id,'BorrowCart')]/descendant::span[contains(@id,'BorrowCart')][contains(@id,'_CorparationDocumentCreate')][contains(@id, 'Button')][normalize-space(text())='"+"文档属性"+"']";
	private static final String deleteItemBtn_XPath="//descendant::div[contains(@id,'BorrowCart')]/descendant::span[contains(@id,'BorrowCart')][contains(@id,'_CorparationDocumentUpdate')][contains(@id, 'Button')][normalize-space(text())='"+"删除"+"']";
	private static final String borrowDocumentType_XPath="//descendant::div[contains(@id,'BorrowCart')]/descendant::div";
	private static final String borrowSpeedType_XPath="//descendant::div[contains(@id,'BorrowCart')]/descendant::div";
	private static final String borrowProcessType_XPath="//descendant::div[contains(@id,'BorrowCart')]/descendant::div";
	private static final String borrowDocumentGrid_XPath="//descendant::div[contains(@id,'BorrowCart')]/descendant::div[contains(@id,'DataGrid')]";
	private static final String onStartBorrow_XPath="//descendant::div[contains(@id,'BorrowCart')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"发起借阅"+"']";

	//----Constructor Methods Begin----
	public BorrowCart(WebDriver driver){
		this.driver=driver;
	}

	/*BorrowCart->docPropertyBtn*/
	public void docPropertyBtn_click(){
		WebElement docPropertyBtn = driver.findElement(By.xpath(docPropertyBtn_XPath)).findVisibleElement(By.xpath(docPropertyBtn_XPath));
		docPropertyBtn.click();
	}

	/*BorrowCart->docPropertyBtn*/
	public WebElement get_docPropertyBtn_Self(){
		return driver.findElement(By.xpath(docPropertyBtn_XPath)).findVisibleElement(By.xpath(docPropertyBtn_XPath));
	}

	/*BorrowCart->deleteItemBtn*/
	public void deleteItemBtn_click(){
		WebElement deleteItemBtn = driver.findElement(By.xpath(deleteItemBtn_XPath)).findVisibleElement(By.xpath(deleteItemBtn_XPath));
		deleteItemBtn.click();
	}

	/*BorrowCart->deleteItemBtn*/
	public WebElement get_deleteItemBtn_Self(){
		return driver.findElement(By.xpath(deleteItemBtn_XPath)).findVisibleElement(By.xpath(deleteItemBtn_XPath));
	}

	/*BorrowCart->borrowDocumentType*/
	public void borrowDocumentType_input(String inputStr){
		WebElement borrowDocumentType=driver.findElement(By.xpath(borrowDocumentType_XPath+"/descendant::input[contains(@role,'textbox')]")).findVisibleElement(By.xpath(borrowDocumentType_XPath+"/descendant::input[contains(@role,'textbox')]"));
		borrowDocumentType.click();
		borrowDocumentType.clear();
		borrowDocumentType.sendKeys(inputStr);
	}

	/*BorrowCart->borrowDocumentType*/
	public void borrowDocumentType_select(String selectStr){
		WebElement borrowDocumentType=driver.findElement(By.xpath(borrowDocumentType_XPath)).findVisibleElement(By.xpath(borrowDocumentType_XPath));
		borrowDocumentType.click();
		WebElement comboboxNameArrow =driver.findElement(By.xpath(borrowDocumentType_XPath+"/descendant::input[contains(@class,'ArrowButton')]")).findVisibleElement(By.xpath(borrowDocumentType_XPath+"/descendant::input[contains(@class,'ArrowButton')]"));
		comboboxNameArrow.click();
		CommonClass.implicitWait(driver);
		WebElement mySelectItem=driver.findElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']")).findVisibleElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']"));
		mySelectItem.click();
	}

	/*BorrowCart->borrowDocumentType*/
	public WebElement get_borrowDocumentType_input_Self(){
		return driver.findElement(By.xpath(borrowDocumentType_XPath+"/descendant::input[contains(@role,'textbox')]")).findVisibleElement(By.xpath(borrowDocumentType_XPath+"/descendant::input[contains(@role,'textbox')]"));
	}

	/*BorrowCart->borrowDocumentType*/
	public WebElement get_borrowDocumentType_selectItem_Self(String selectStr){
		WebElement borrowDocumentType=driver.findElement(By.xpath(borrowDocumentType_XPath)).findVisibleElement(By.xpath(borrowDocumentType_XPath));
		borrowDocumentType.click();
		WebElement comboboxNameArrow =driver.findElement(By.xpath(borrowDocumentType_XPath+"/descendant::input[contains(@class,'ArrowButton')]")).findVisibleElement(By.xpath(borrowDocumentType_XPath+"/descendant::input[contains(@class,'ArrowButton')]"));
		comboboxNameArrow.click();
		CommonClass.implicitWait(driver);
		return driver.findElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']")).findVisibleElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']"));
	}

	/*BorrowCart->borrowSpeedType*/
	public void borrowSpeedType_input(String inputStr){
		WebElement borrowSpeedType=driver.findElement(By.xpath(borrowSpeedType_XPath+"/descendant::input[contains(@role,'textbox')]")).findVisibleElement(By.xpath(borrowSpeedType_XPath+"/descendant::input[contains(@role,'textbox')]"));
		borrowSpeedType.click();
		borrowSpeedType.clear();
		borrowSpeedType.sendKeys(inputStr);
	}

	/*BorrowCart->borrowSpeedType*/
	public void borrowSpeedType_select(String selectStr){
		WebElement borrowSpeedType=driver.findElement(By.xpath(borrowSpeedType_XPath)).findVisibleElement(By.xpath(borrowSpeedType_XPath));
		borrowSpeedType.click();
		WebElement comboboxNameArrow =driver.findElement(By.xpath(borrowSpeedType_XPath+"/descendant::input[contains(@class,'ArrowButton')]")).findVisibleElement(By.xpath(borrowSpeedType_XPath+"/descendant::input[contains(@class,'ArrowButton')]"));
		comboboxNameArrow.click();
		CommonClass.implicitWait(driver);
		WebElement mySelectItem=driver.findElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']")).findVisibleElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']"));
		mySelectItem.click();
	}

	/*BorrowCart->borrowSpeedType*/
	public WebElement get_borrowSpeedType_input_Self(){
		return driver.findElement(By.xpath(borrowSpeedType_XPath+"/descendant::input[contains(@role,'textbox')]")).findVisibleElement(By.xpath(borrowSpeedType_XPath+"/descendant::input[contains(@role,'textbox')]"));
	}

	/*BorrowCart->borrowSpeedType*/
	public WebElement get_borrowSpeedType_selectItem_Self(String selectStr){
		WebElement borrowSpeedType=driver.findElement(By.xpath(borrowSpeedType_XPath)).findVisibleElement(By.xpath(borrowSpeedType_XPath));
		borrowSpeedType.click();
		WebElement comboboxNameArrow =driver.findElement(By.xpath(borrowSpeedType_XPath+"/descendant::input[contains(@class,'ArrowButton')]")).findVisibleElement(By.xpath(borrowSpeedType_XPath+"/descendant::input[contains(@class,'ArrowButton')]"));
		comboboxNameArrow.click();
		CommonClass.implicitWait(driver);
		return driver.findElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']")).findVisibleElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']"));
	}

	/*BorrowCart->borrowProcessType*/
	public void borrowProcessType_input(String inputStr){
		WebElement borrowProcessType=driver.findElement(By.xpath(borrowProcessType_XPath+"/descendant::input[contains(@role,'textbox')]")).findVisibleElement(By.xpath(borrowProcessType_XPath+"/descendant::input[contains(@role,'textbox')]"));
		borrowProcessType.click();
		borrowProcessType.clear();
		borrowProcessType.sendKeys(inputStr);
	}

	/*BorrowCart->borrowProcessType*/
	public void borrowProcessType_select(String selectStr){
		WebElement borrowProcessType=driver.findElement(By.xpath(borrowProcessType_XPath)).findVisibleElement(By.xpath(borrowProcessType_XPath));
		borrowProcessType.click();
		WebElement comboboxNameArrow =driver.findElement(By.xpath(borrowProcessType_XPath+"/descendant::input[contains(@class,'ArrowButton')]")).findVisibleElement(By.xpath(borrowProcessType_XPath+"/descendant::input[contains(@class,'ArrowButton')]"));
		comboboxNameArrow.click();
		CommonClass.implicitWait(driver);
		WebElement mySelectItem=driver.findElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']")).findVisibleElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']"));
		mySelectItem.click();
	}

	/*BorrowCart->borrowProcessType*/
	public WebElement get_borrowProcessType_input_Self(){
		return driver.findElement(By.xpath(borrowProcessType_XPath+"/descendant::input[contains(@role,'textbox')]")).findVisibleElement(By.xpath(borrowProcessType_XPath+"/descendant::input[contains(@role,'textbox')]"));
	}

	/*BorrowCart->borrowProcessType*/
	public WebElement get_borrowProcessType_selectItem_Self(String selectStr){
		WebElement borrowProcessType=driver.findElement(By.xpath(borrowProcessType_XPath)).findVisibleElement(By.xpath(borrowProcessType_XPath));
		borrowProcessType.click();
		WebElement comboboxNameArrow =driver.findElement(By.xpath(borrowProcessType_XPath+"/descendant::input[contains(@class,'ArrowButton')]")).findVisibleElement(By.xpath(borrowProcessType_XPath+"/descendant::input[contains(@class,'ArrowButton')]"));
		comboboxNameArrow.click();
		CommonClass.implicitWait(driver);
		return driver.findElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']")).findVisibleElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']"));
	}

	/*BorrowCart->borrowDocumentGrid*/
	public void borrowDocumentGrid_colCaptionClick(String captionName){
		WebElement borrowDocumentGrid = driver.findElement(By.xpath(borrowDocumentGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']")).findVisibleElement(By.xpath(borrowDocumentGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']"));
		borrowDocumentGrid.click();
	}

	/*BorrowCart->borrowDocumentGrid*/
	public void borrowDocumentGrid_selectCellbyRowColNumber(int rowNum,int colNum){
		WebElement borrowDocumentGrid = driver.findElement(By.xpath(borrowDocumentGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]")).findVisibleElement(By.xpath(borrowDocumentGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]"));
		borrowDocumentGrid.click();
	}

	/*BorrowCart->borrowDocumentGrid*/
	public void borrowDocumentGrid_selectRowbyRowColNumber(int rowNum,int colNum){
		WebElement borrowDocumentGrid = driver.findElement(By.xpath(borrowDocumentGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/..")).findVisibleElement(By.xpath(borrowDocumentGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/.."));
		borrowDocumentGrid.click();
	}

	/*BorrowCart->borrowDocumentGrid*/
	public void borrowDocumentGrid_selectRowbyRowNumber(int rowNum){
		WebElement borrowDocumentGrid = driver.findElement(By.xpath(borrowDocumentGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr")).findVisibleElement(By.xpath(borrowDocumentGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr"));
		borrowDocumentGrid.click();
	}

	/*BorrowCart->borrowDocumentGrid*/
	public void borrowDocumentGrid_selectCellbyCellText(String cellText){
		WebElement borrowDocumentGrid = driver.findElement(By.xpath(borrowDocumentGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']")).findVisibleElement(By.xpath(borrowDocumentGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']"));
		borrowDocumentGrid.click();
	}

	/*BorrowCart->borrowDocumentGrid*/
	public void borrowDocumentGrid_selectRowbyCellText(String cellText){
		WebElement borrowDocumentGrid = driver.findElement(By.xpath(borrowDocumentGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/..")).findVisibleElement(By.xpath(borrowDocumentGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/.."));
		borrowDocumentGrid.click();
	}

	/*BorrowCart->borrowDocumentGrid*/
	public void borrowDocumentGrid_selectCellbyOtherInlineCellText(String otherInlineCellText,String targetCellText){
		WebElement borrowDocumentGrid = driver.findElement(By.xpath(borrowDocumentGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']")).findVisibleElement(By.xpath(borrowDocumentGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']"));
		borrowDocumentGrid.click();
	}

	/*BorrowCart->borrowDocumentGrid*/
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

	/*BorrowCart->borrowDocumentGrid*/
	public WebElement get_borrowDocumentGrid_colCaption_Self(String captionName){
		return driver.findElement(By.xpath(borrowDocumentGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']")).findVisibleElement(By.xpath(borrowDocumentGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']"));
	}

	/*BorrowCart->borrowDocumentGrid*/
	public WebElement get_borrowDocumentGrid_CellbyRowColNumber_Self(int rowNum,int colNum){
		return driver.findElement(By.xpath(borrowDocumentGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]")).findVisibleElement(By.xpath(borrowDocumentGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]"));
	}

	/*BorrowCart->borrowDocumentGrid*/
	public WebElement get_borrowDocumentGrid_RowbyRowColNumber_Self(int rowNum,int colNum){
		return driver.findElement(By.xpath(borrowDocumentGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/..")).findVisibleElement(By.xpath(borrowDocumentGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/.."));
	}

	/*BorrowCart->borrowDocumentGrid*/
	public WebElement get_borrowDocumentGrid_RowbyRowNumber_Self(int rowNum){
		return driver.findElement(By.xpath(borrowDocumentGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr")).findVisibleElement(By.xpath(borrowDocumentGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr"));
	}

	/*BorrowCart->borrowDocumentGrid*/
	public WebElement get_borrowDocumentGrid_CellbyCellText_Self(String cellText){
		return driver.findElement(By.xpath(borrowDocumentGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']")).findVisibleElement(By.xpath(borrowDocumentGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']"));
	}

	/*BorrowCart->borrowDocumentGrid*/
	public WebElement get_borrowDocumentGrid_RowbyCellText_Self(String cellText){
		return driver.findElement(By.xpath(borrowDocumentGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/..")).findVisibleElement(By.xpath(borrowDocumentGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/.."));
	}

	/*BorrowCart->borrowDocumentGrid*/
	public WebElement get_borrowDocumentGrid_CellbyOtherInlineCellText_Self(String otherInlineCellText,String targetCellText){
		return driver.findElement(By.xpath(borrowDocumentGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']")).findVisibleElement(By.xpath(borrowDocumentGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']"));
	}

	/*BorrowCart->borrowDocumentGrid*/
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

	/*BorrowCart->onClick:->onStartBorrow*/
	public void onStartBorrow_click(){
		WebElement onStartBorrow = driver.findElement(By.xpath(onStartBorrow_XPath)).findVisibleElement(By.xpath(onStartBorrow_XPath));
		onStartBorrow.click();
	}

	/*BorrowCart->onClick:->onStartBorrow*/
	public WebElement get_onStartBorrow_Self(){
		return driver.findElement(By.xpath(onStartBorrow_XPath)).findVisibleElement(By.xpath(onStartBorrow_XPath));
	}

}
