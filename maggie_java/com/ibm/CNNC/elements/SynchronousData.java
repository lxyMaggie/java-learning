package com.ibm.CNNC.elements;

import java.util.*;
import org.openqa.selenium.*;
import com.selenium.utils.WebDriver;
import com.selenium.utils.WebElement;

/*catalog\widget\dm\headquartermanage\synchronousdata\templates\SynchronousData.html*/
public class SynchronousData {
	protected WebDriver driver;
	private static final String addselectPowerPlant_XPath="//descendant::div[contains(@id,'SynchronousData')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"选择同步单位"+"']";
	private static final String delselectPowerPlant_XPath="//descendant::div[contains(@id,'SynchronousData')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"删除所选单位"+"']";
	private static final String sysDataType_XPath="//descendant::div[contains(@id,'SynchronousData')]/descendant::span[normalize-space(text())='操作类型']/../../descendant::div[contains(@id,'widget_dijit_form_FilteringSelect')]";
	private static final String selectPlantGrid_XPath="//descendant::div[contains(@id,'SynchronousData')]/descendant::div[contains(@id,'DataGrid')]";
	private static final String onSysData_XPath="//descendant::div[contains(@id,'SynchronousData')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"确定"+"']";
	private static final String onCancel_XPath="//descendant::div[contains(@id,'SynchronousData')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"取消"+"']";

	//----Constructor Methods Begin----
	public SynchronousData(WebDriver driver){
		this.driver=driver;
	}

	/*SynchronousData->onClick: ->addselectPowerPlant*/
	public void addselectPowerPlant_click(){
		WebElement addselectPowerPlant = driver.findElement(By.xpath(addselectPowerPlant_XPath)).findVisibleElement(By.xpath(addselectPowerPlant_XPath));
		addselectPowerPlant.click();
	}

	/*SynchronousData->onClick: ->addselectPowerPlant*/
	public WebElement get_addselectPowerPlant_Self(){
		return driver.findElement(By.xpath(addselectPowerPlant_XPath)).findVisibleElement(By.xpath(addselectPowerPlant_XPath));
	}

	/*SynchronousData->onClick: ->delselectPowerPlant*/
	public void delselectPowerPlant_click(){
		WebElement delselectPowerPlant = driver.findElement(By.xpath(delselectPowerPlant_XPath)).findVisibleElement(By.xpath(delselectPowerPlant_XPath));
		delselectPowerPlant.click();
	}

	/*SynchronousData->onClick: ->delselectPowerPlant*/
	public WebElement get_delselectPowerPlant_Self(){
		return driver.findElement(By.xpath(delselectPowerPlant_XPath)).findVisibleElement(By.xpath(delselectPowerPlant_XPath));
	}

	/*SynchronousData->sysDataType*/
	public void sysDataType_input(String inputStr){
		WebElement sysDataType=driver.findElement(By.xpath(sysDataType_XPath+"/descendant::input[contains(@role,'textbox')]")).findVisibleElement(By.xpath(sysDataType_XPath+"/descendant::input[contains(@role,'textbox')]"));
		sysDataType.click();
		sysDataType.clear();
		sysDataType.sendKeys(inputStr);
	}

	/*SynchronousData->sysDataType*/
	public void sysDataType_select(String selectStr){
		WebElement sysDataType=driver.findElement(By.xpath(sysDataType_XPath)).findVisibleElement(By.xpath(sysDataType_XPath));
		sysDataType.click();
		WebElement comboboxNameArrow =driver.findElement(By.xpath(sysDataType_XPath+"/descendant::input[contains(@class,'ArrowButton')]")).findVisibleElement(By.xpath(sysDataType_XPath+"/descendant::input[contains(@class,'ArrowButton')]"));
		comboboxNameArrow.click();
		CommonClass.implicitWait(driver);
		WebElement mySelectItem=driver.findElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']")).findVisibleElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']"));
		mySelectItem.click();
	}

	/*SynchronousData->sysDataType*/
	public WebElement get_sysDataType_input_Self(){
		return driver.findElement(By.xpath(sysDataType_XPath+"/descendant::input[contains(@role,'textbox')]")).findVisibleElement(By.xpath(sysDataType_XPath+"/descendant::input[contains(@role,'textbox')]"));
	}

	/*SynchronousData->sysDataType*/
	public WebElement get_sysDataType_selectItem_Self(String selectStr){
		WebElement sysDataType=driver.findElement(By.xpath(sysDataType_XPath)).findVisibleElement(By.xpath(sysDataType_XPath));
		sysDataType.click();
		WebElement comboboxNameArrow =driver.findElement(By.xpath(sysDataType_XPath+"/descendant::input[contains(@class,'ArrowButton')]")).findVisibleElement(By.xpath(sysDataType_XPath+"/descendant::input[contains(@class,'ArrowButton')]"));
		comboboxNameArrow.click();
		CommonClass.implicitWait(driver);
		return driver.findElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']")).findVisibleElement(By.xpath("//descendant::*[contains(@class,'dijitMenuItem')][text()='"+selectStr+"'] | //div[contains(@id,'dropdown')]/descendant::ul/descendant::li[contains(@class,'MenuItem')][normalize-space(text())='"+selectStr+"']"));
	}

	/*SynchronousData->selectPlantGrid*/
	public void selectPlantGrid_colCaptionClick(String captionName){
		WebElement selectPlantGrid = driver.findElement(By.xpath(selectPlantGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']")).findVisibleElement(By.xpath(selectPlantGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']"));
		selectPlantGrid.click();
	}

	/*SynchronousData->selectPlantGrid*/
	public void selectPlantGrid_selectCellbyRowColNumber(int rowNum,int colNum){
		WebElement selectPlantGrid = driver.findElement(By.xpath(selectPlantGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]")).findVisibleElement(By.xpath(selectPlantGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]"));
		selectPlantGrid.click();
	}

	/*SynchronousData->selectPlantGrid*/
	public void selectPlantGrid_selectRowbyRowColNumber(int rowNum,int colNum){
		WebElement selectPlantGrid = driver.findElement(By.xpath(selectPlantGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/..")).findVisibleElement(By.xpath(selectPlantGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/.."));
		selectPlantGrid.click();
	}

	/*SynchronousData->selectPlantGrid*/
	public void selectPlantGrid_selectRowbyRowNumber(int rowNum){
		WebElement selectPlantGrid = driver.findElement(By.xpath(selectPlantGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr")).findVisibleElement(By.xpath(selectPlantGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr"));
		selectPlantGrid.click();
	}

	/*SynchronousData->selectPlantGrid*/
	public void selectPlantGrid_selectCellbyCellText(String cellText){
		WebElement selectPlantGrid = driver.findElement(By.xpath(selectPlantGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']")).findVisibleElement(By.xpath(selectPlantGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']"));
		selectPlantGrid.click();
	}

	/*SynchronousData->selectPlantGrid*/
	public void selectPlantGrid_selectRowbyCellText(String cellText){
		WebElement selectPlantGrid = driver.findElement(By.xpath(selectPlantGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/..")).findVisibleElement(By.xpath(selectPlantGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/.."));
		selectPlantGrid.click();
	}

	/*SynchronousData->selectPlantGrid*/
	public void selectPlantGrid_selectCellbyOtherInlineCellText(String otherInlineCellText,String targetCellText){
		WebElement selectPlantGrid = driver.findElement(By.xpath(selectPlantGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']")).findVisibleElement(By.xpath(selectPlantGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']"));
		selectPlantGrid.click();
	}

	/*SynchronousData->selectPlantGrid*/
	public void selectPlantGrid_selectCellbyColNameCellText(String colName,String cellText){
		WebElement selectPlantGrid = driver.findElement(By.xpath(selectPlantGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../..")).findVisibleElement(By.xpath(selectPlantGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../.."));
		String idx=selectPlantGrid.getAttribute("idx");
		List<WebElement> Gridrows = driver.findAll(By.xpath(selectPlantGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]"));
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

	/*SynchronousData->selectPlantGrid*/
	public WebElement get_selectPlantGrid_colCaption_Self(String captionName){
		return driver.findElement(By.xpath(selectPlantGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']")).findVisibleElement(By.xpath(selectPlantGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']"));
	}

	/*SynchronousData->selectPlantGrid*/
	public WebElement get_selectPlantGrid_CellbyRowColNumber_Self(int rowNum,int colNum){
		return driver.findElement(By.xpath(selectPlantGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]")).findVisibleElement(By.xpath(selectPlantGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]"));
	}

	/*SynchronousData->selectPlantGrid*/
	public WebElement get_selectPlantGrid_RowbyRowColNumber_Self(int rowNum,int colNum){
		return driver.findElement(By.xpath(selectPlantGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/..")).findVisibleElement(By.xpath(selectPlantGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/.."));
	}

	/*SynchronousData->selectPlantGrid*/
	public WebElement get_selectPlantGrid_RowbyRowNumber_Self(int rowNum){
		return driver.findElement(By.xpath(selectPlantGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr")).findVisibleElement(By.xpath(selectPlantGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr"));
	}

	/*SynchronousData->selectPlantGrid*/
	public WebElement get_selectPlantGrid_CellbyCellText_Self(String cellText){
		return driver.findElement(By.xpath(selectPlantGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']")).findVisibleElement(By.xpath(selectPlantGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']"));
	}

	/*SynchronousData->selectPlantGrid*/
	public WebElement get_selectPlantGrid_RowbyCellText_Self(String cellText){
		return driver.findElement(By.xpath(selectPlantGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/..")).findVisibleElement(By.xpath(selectPlantGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/.."));
	}

	/*SynchronousData->selectPlantGrid*/
	public WebElement get_selectPlantGrid_CellbyOtherInlineCellText_Self(String otherInlineCellText,String targetCellText){
		return driver.findElement(By.xpath(selectPlantGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']")).findVisibleElement(By.xpath(selectPlantGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']"));
	}

	/*SynchronousData->selectPlantGrid*/
	public WebElement get_selectPlantGrid_CellbyColNameCellText_Self(String colName,String cellText){
		WebElement selectPlantGrid = driver.findElement(By.xpath(selectPlantGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../..")).findVisibleElement(By.xpath(selectPlantGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../.."));
		String idx=selectPlantGrid.getAttribute("idx");
		List<WebElement> Gridrows = driver.findAll(By.xpath(selectPlantGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]"));
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

	/*SynchronousData->onClick: ->onSysData*/
	public void onSysData_click(){
		WebElement onSysData = driver.findElement(By.xpath(onSysData_XPath)).findVisibleElement(By.xpath(onSysData_XPath));
		onSysData.click();
	}

	/*SynchronousData->onClick: ->onSysData*/
	public WebElement get_onSysData_Self(){
		return driver.findElement(By.xpath(onSysData_XPath)).findVisibleElement(By.xpath(onSysData_XPath));
	}

	/*SynchronousData->onClick: ->onCancel*/
	public void onCancel_click(){
		WebElement onCancel = driver.findElement(By.xpath(onCancel_XPath)).findVisibleElement(By.xpath(onCancel_XPath));
		onCancel.click();
	}

	/*SynchronousData->onClick: ->onCancel*/
	public WebElement get_onCancel_Self(){
		return driver.findElement(By.xpath(onCancel_XPath)).findVisibleElement(By.xpath(onCancel_XPath));
	}

}
