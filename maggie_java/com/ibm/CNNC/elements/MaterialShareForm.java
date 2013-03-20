package com.ibm.CNNC.elements;

import java.util.*;
import org.openqa.selenium.*;
import com.selenium.utils.WebDriver;
import com.selenium.utils.WebElement;

/*catalog\widget\dm\materialshare\materialshareform\templates\MaterialShareForm.html*/
public class MaterialShareForm {
	protected WebDriver driver;
	private static final String sharedMaterialType_XPath="//descendant::div[contains(@id,'MaterialShareForm')]/descendant::span[normalize-space(text())='共享资料类型']/../../descendant::div[contains(@id,'widget_dijit_form_FilteringSelect')]";
	private static final String authorizeButton_XPath="//descendant::div[contains(@id,'MaterialShareForm')]/descendant::*[contains(@id,'AttachedContentList')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"${resourceBundle.authorizeAttachment}"+"']";
	private static final String deleteButton_XPath="//descendant::div[contains(@id,'MaterialShareForm')]/descendant::*[contains(@id,'AttachedContentList')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"${resourceBundle.delete}"+"']";
	private static final String primaryKeyButton_XPath="//descendant::div[contains(@id,'MaterialShareForm')]/descendant::*[contains(@id,'AttachedContentList')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"${resourceBundle.asPrimary}"+"']";
	private static final String downloadBtn_XPath="//descendant::div[contains(@id,'MaterialShareForm')]/descendant::*[contains(@id,'AttachedContentList')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"下载附件"+"']";
	private static final String upArrow_XPath="//descendant::div[contains(@id,'MaterialShareForm')]/descendant::*[contains(@id,'AttachedContentList')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+""+"']";
	private static final String downArrow_XPath="//descendant::div[contains(@id,'MaterialShareForm')]/descendant::*[contains(@id,'AttachedContentList')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+""+"']";
	private static final String dDefaultGrid_XPath="//descendant::div[contains(@id,'MaterialShareForm')]/descendant::*[contains(@id,'AttachedContentList')]/descendant::div[contains(@id,'EnhancedGrid')]";
	private static final String submitMaterialShareBtn_XPath="//descendant::div[contains(@id,'MaterialShareForm')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"提交"+"']";
	private static final String cancelBtn_XPath="//descendant::div[contains(@id,'MaterialShareForm')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"取消"+"']";

	//----Constructor Methods Begin----
	public MaterialShareForm(WebDriver driver){
		this.driver=driver;
	}

	/*MaterialShareForm->sharedMaterialType*/
	public void sharedMaterialType_input(String inputStr){
		WebElement sharedMaterialType=driver.findElement(By.xpath(sharedMaterialType_XPath+"/descendant::input[contains(@role,'textbox')]")).findVisibleElement(By.xpath(sharedMaterialType_XPath+"/descendant::input[contains(@role,'textbox')]"));
		sharedMaterialType.click();
		sharedMaterialType.clear();
		sharedMaterialType.sendKeys(inputStr);
	}

	/*MaterialShareForm->sharedMaterialType*/
	public void sharedMaterialType_select(String selectStr){
		WebElement sharedMaterialType=driver.findElement(By.xpath(sharedMaterialType_XPath)).findVisibleElement(By.xpath(sharedMaterialType_XPath));
		sharedMaterialType.click();
		WebElement comboboxNameArrow =driver.findElement(By.xpath(sharedMaterialType_XPath+"/descendant::input[contains(@class,'ArrowButton')]")).findVisibleElement(By.xpath(sharedMaterialType_XPath+"/descendant::input[contains(@class,'ArrowButton')]"));
		comboboxNameArrow.click();
		CommonClass.implicitWait(driver);
		WebElement mySelectItem=driver.findElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']")).findVisibleElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']"));
		mySelectItem.click();
	}

	/*MaterialShareForm->sharedMaterialType*/
	public WebElement get_sharedMaterialType_input_Self(){
		return driver.findElement(By.xpath(sharedMaterialType_XPath+"/descendant::input[contains(@role,'textbox')]")).findVisibleElement(By.xpath(sharedMaterialType_XPath+"/descendant::input[contains(@role,'textbox')]"));
	}

	/*MaterialShareForm->sharedMaterialType*/
	public WebElement get_sharedMaterialType_selectItem_Self(String selectStr){
		WebElement sharedMaterialType=driver.findElement(By.xpath(sharedMaterialType_XPath)).findVisibleElement(By.xpath(sharedMaterialType_XPath));
		sharedMaterialType.click();
		WebElement comboboxNameArrow =driver.findElement(By.xpath(sharedMaterialType_XPath+"/descendant::input[contains(@class,'ArrowButton')]")).findVisibleElement(By.xpath(sharedMaterialType_XPath+"/descendant::input[contains(@class,'ArrowButton')]"));
		comboboxNameArrow.click();
		CommonClass.implicitWait(driver);
		return driver.findElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']")).findVisibleElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']"));
	}

	/*MaterialShareForm->AttachedContentList->authorizeButton*/
	public void authorizeButton_click(){
		WebElement authorizeButton = driver.findElement(By.xpath(authorizeButton_XPath)).findVisibleElement(By.xpath(authorizeButton_XPath));
		authorizeButton.click();
	}

	/*MaterialShareForm->AttachedContentList->authorizeButton*/
	public WebElement get_authorizeButton_Self(){
		return driver.findElement(By.xpath(authorizeButton_XPath)).findVisibleElement(By.xpath(authorizeButton_XPath));
	}

	/*MaterialShareForm->AttachedContentList->deleteButton*/
	public void deleteButton_click(){
		WebElement deleteButton = driver.findElement(By.xpath(deleteButton_XPath)).findVisibleElement(By.xpath(deleteButton_XPath));
		deleteButton.click();
	}

	/*MaterialShareForm->AttachedContentList->deleteButton*/
	public WebElement get_deleteButton_Self(){
		return driver.findElement(By.xpath(deleteButton_XPath)).findVisibleElement(By.xpath(deleteButton_XPath));
	}

	/*MaterialShareForm->AttachedContentList->primaryKeyButton*/
	public void primaryKeyButton_click(){
		WebElement primaryKeyButton = driver.findElement(By.xpath(primaryKeyButton_XPath)).findVisibleElement(By.xpath(primaryKeyButton_XPath));
		primaryKeyButton.click();
	}

	/*MaterialShareForm->AttachedContentList->primaryKeyButton*/
	public WebElement get_primaryKeyButton_Self(){
		return driver.findElement(By.xpath(primaryKeyButton_XPath)).findVisibleElement(By.xpath(primaryKeyButton_XPath));
	}

	/*MaterialShareForm->AttachedContentList->downloadBtn*/
	public void downloadBtn_click(){
		WebElement downloadBtn = driver.findElement(By.xpath(downloadBtn_XPath)).findVisibleElement(By.xpath(downloadBtn_XPath));
		downloadBtn.click();
	}

	/*MaterialShareForm->AttachedContentList->downloadBtn*/
	public WebElement get_downloadBtn_Self(){
		return driver.findElement(By.xpath(downloadBtn_XPath)).findVisibleElement(By.xpath(downloadBtn_XPath));
	}

	/*MaterialShareForm->AttachedContentList->upArrow*/
	public void upArrow_click(){
		WebElement upArrow = driver.findElement(By.xpath(upArrow_XPath)).findVisibleElement(By.xpath(upArrow_XPath));
		upArrow.click();
	}

	/*MaterialShareForm->AttachedContentList->upArrow*/
	public WebElement get_upArrow_Self(){
		return driver.findElement(By.xpath(upArrow_XPath)).findVisibleElement(By.xpath(upArrow_XPath));
	}

	/*MaterialShareForm->AttachedContentList->downArrow*/
	public void downArrow_click(){
		WebElement downArrow = driver.findElement(By.xpath(downArrow_XPath)).findVisibleElement(By.xpath(downArrow_XPath));
		downArrow.click();
	}

	/*MaterialShareForm->AttachedContentList->downArrow*/
	public WebElement get_downArrow_Self(){
		return driver.findElement(By.xpath(downArrow_XPath)).findVisibleElement(By.xpath(downArrow_XPath));
	}

	/*MaterialShareForm->AttachedContentList->defaultGrid*/
	public void dDefaultGrid_colCaptionClick(String captionName){
		WebElement dDefaultGrid = driver.findElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']")).findVisibleElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']"));
		dDefaultGrid.click();
	}

	/*MaterialShareForm->AttachedContentList->defaultGrid*/
	public void dDefaultGrid_selectCellbyRowColNumber(int rowNum,int colNum){
		WebElement dDefaultGrid = driver.findElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]")).findVisibleElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]"));
		dDefaultGrid.click();
	}

	/*MaterialShareForm->AttachedContentList->defaultGrid*/
	public void dDefaultGrid_selectRowbyRowColNumber(int rowNum,int colNum){
		WebElement dDefaultGrid = driver.findElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/..")).findVisibleElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/.."));
		dDefaultGrid.click();
	}

	/*MaterialShareForm->AttachedContentList->defaultGrid*/
	public void dDefaultGrid_selectRowbyRowNumber(int rowNum){
		WebElement dDefaultGrid = driver.findElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr")).findVisibleElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr"));
		dDefaultGrid.click();
	}

	/*MaterialShareForm->AttachedContentList->defaultGrid*/
	public void dDefaultGrid_selectCellbyCellText(String cellText){
		WebElement dDefaultGrid = driver.findElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']")).findVisibleElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']"));
		dDefaultGrid.click();
	}

	/*MaterialShareForm->AttachedContentList->defaultGrid*/
	public void dDefaultGrid_selectRowbyCellText(String cellText){
		WebElement dDefaultGrid = driver.findElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/..")).findVisibleElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/.."));
		dDefaultGrid.click();
	}

	/*MaterialShareForm->AttachedContentList->defaultGrid*/
	public void dDefaultGrid_selectCellbyOtherInlineCellText(String otherInlineCellText,String targetCellText){
		WebElement dDefaultGrid = driver.findElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']")).findVisibleElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']"));
		dDefaultGrid.click();
	}

	/*MaterialShareForm->AttachedContentList->defaultGrid*/
	public void dDefaultGrid_selectCellbyColNameCellText(String colName,String cellText){
		WebElement dDefaultGrid = driver.findElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../..")).findVisibleElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../.."));
		String idx=dDefaultGrid.getAttribute("idx");
		List<WebElement> Gridrows = driver.findAll(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]"));
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

	/*MaterialShareForm->AttachedContentList->defaultGrid*/
	public WebElement get_dDefaultGrid_colCaption_Self(String captionName){
		return driver.findElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']")).findVisibleElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']"));
	}

	/*MaterialShareForm->AttachedContentList->defaultGrid*/
	public WebElement get_dDefaultGrid_CellbyRowColNumber_Self(int rowNum,int colNum){
		return driver.findElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]")).findVisibleElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]"));
	}

	/*MaterialShareForm->AttachedContentList->defaultGrid*/
	public WebElement get_dDefaultGrid_RowbyRowColNumber_Self(int rowNum,int colNum){
		return driver.findElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/..")).findVisibleElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/.."));
	}

	/*MaterialShareForm->AttachedContentList->defaultGrid*/
	public WebElement get_dDefaultGrid_RowbyRowNumber_Self(int rowNum){
		return driver.findElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr")).findVisibleElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr"));
	}

	/*MaterialShareForm->AttachedContentList->defaultGrid*/
	public WebElement get_dDefaultGrid_CellbyCellText_Self(String cellText){
		return driver.findElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']")).findVisibleElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']"));
	}

	/*MaterialShareForm->AttachedContentList->defaultGrid*/
	public WebElement get_dDefaultGrid_RowbyCellText_Self(String cellText){
		return driver.findElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/..")).findVisibleElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/.."));
	}

	/*MaterialShareForm->AttachedContentList->defaultGrid*/
	public WebElement get_dDefaultGrid_CellbyOtherInlineCellText_Self(String otherInlineCellText,String targetCellText){
		return driver.findElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']")).findVisibleElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']"));
	}

	/*MaterialShareForm->AttachedContentList->defaultGrid*/
	public WebElement get_dDefaultGrid_CellbyColNameCellText_Self(String colName,String cellText){
		WebElement dDefaultGrid = driver.findElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../..")).findVisibleElement(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../.."));
		String idx=dDefaultGrid.getAttribute("idx");
		List<WebElement> Gridrows = driver.findAll(By.xpath(dDefaultGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]"));
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

	/*MaterialShareForm->submitMaterialShareBtn*/
	public void submitMaterialShareBtn_click(){
		WebElement submitMaterialShareBtn = driver.findElement(By.xpath(submitMaterialShareBtn_XPath)).findVisibleElement(By.xpath(submitMaterialShareBtn_XPath));
		submitMaterialShareBtn.click();
	}

	/*MaterialShareForm->submitMaterialShareBtn*/
	public WebElement get_submitMaterialShareBtn_Self(){
		return driver.findElement(By.xpath(submitMaterialShareBtn_XPath)).findVisibleElement(By.xpath(submitMaterialShareBtn_XPath));
	}

	/*MaterialShareForm->cancelBtn*/
	public void cancelBtn_click(){
		WebElement cancelBtn = driver.findElement(By.xpath(cancelBtn_XPath)).findVisibleElement(By.xpath(cancelBtn_XPath));
		cancelBtn.click();
	}

	/*MaterialShareForm->cancelBtn*/
	public WebElement get_cancelBtn_Self(){
		return driver.findElement(By.xpath(cancelBtn_XPath)).findVisibleElement(By.xpath(cancelBtn_XPath));
	}

}
