package com.ibm.CNNC.elements;

import java.util.*;
import org.openqa.selenium.*;
import com.selenium.utils.WebDriver;
import com.selenium.utils.WebElement;

/*catalog\widget\dm\sysmanage\classlinkconfig\templates\ClassLinkConfig.html*/
public class ClassLinkConfig {
	protected WebDriver driver;
	private static final String Tabs_XPath="//descendant::div[contains(@id,'ClassLinkConfig')]/descendant::div[contains(@id,'dijit_layout_TabContainer')]";
	private static final String classLinkListGrid_XPath="//descendant::div[contains(@id,'ClassLinkConfig')]/descendant::div[contains(@id,'DataGrid')]";
	private static final String creatBtn_XPath="//descendant::div[contains(@id,'ClassLinkConfig')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"创建关联规则"+"']";
	private static final String editBtn_XPath="//descendant::div[contains(@id,'ClassLinkConfig')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"编辑关联规则"+"']";
	private static final String delBtn_XPath="//descendant::div[contains(@id,'ClassLinkConfig')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"删除关联规则"+"']";
	private static final String saveBtn_XPath="//descendant::div[contains(@id,'ClassLinkConfig')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"保存关联规则"+"']";

	//----Constructor Methods Begin----
	public ClassLinkConfig(WebDriver driver){
		this.driver=driver;
	}

	/*ClassLinkConfig->${resourceBundle.createLinkRule}
       
      
       ${resourceBundle.editLinkRule}
      
      
       ${resourceBundle.deleteLinkRule}
      
      
       ${resourceBundle.saveLinkRule}*/
	public void Tabs_click(String tabName){
		WebElement Tabs = driver.findElement(By.xpath(Tabs_XPath+"/descendant::div[contains(@id,'tablist')]/descendant::div[contains(@class,'TabListWrapper')]/descendant::span[normalize-space(text())='"+tabName+"']")).findVisibleElement(By.xpath(Tabs_XPath+"/descendant::div[contains(@id,'tablist')]/descendant::div[contains(@class,'TabListWrapper')]/descendant::span[normalize-space(text())='"+tabName+"']"));
		Tabs.click();
	}

	/*ClassLinkConfig->${resourceBundle.createLinkRule}
       
      
       ${resourceBundle.editLinkRule}
      
      
       ${resourceBundle.deleteLinkRule}
      
      
       ${resourceBundle.saveLinkRule}*/
	public void Tabs_close(String tabName){
		WebElement Tabs = driver.findElement(By.xpath(Tabs_XPath+"/descendant::div[contains(@id,'tablist')]/descendant::div[contains(@class,'TabListWrapper')]/descendant::span[normalize-space(text())='"+tabName+"']/following-sibling::span[contains(@class,'TabCloseButton')]")).findVisibleElement(By.xpath(Tabs_XPath+"/descendant::div[contains(@id,'tablist')]/descendant::div[contains(@class,'TabListWrapper')]/descendant::span[normalize-space(text())='"+tabName+"']/following-sibling::span[contains(@class,'TabCloseButton')]"));
		Tabs.click();
	}

	/*ClassLinkConfig->${resourceBundle.createLinkRule}
       
      
       ${resourceBundle.editLinkRule}
      
      
       ${resourceBundle.deleteLinkRule}
      
      
       ${resourceBundle.saveLinkRule}*/
	public WebElement get_Tabs_Self(String tabName){
		return driver.findElement(By.xpath(Tabs_XPath+"/descendant::div[contains(@id,'tablist')]/descendant::div[contains(@class,'TabListWrapper')]/descendant::span[normalize-space(text())='"+tabName+"']")).findVisibleElement(By.xpath(Tabs_XPath+"/descendant::div[contains(@id,'tablist')]/descendant::div[contains(@class,'TabListWrapper')]/descendant::span[normalize-space(text())='"+tabName+"']"));
	}

	/*ClassLinkConfig->${resourceBundle.createLinkRule}
       
      
       ${resourceBundle.editLinkRule}
      
      
       ${resourceBundle.deleteLinkRule}
      
      
       ${resourceBundle.saveLinkRule}*/
	public WebElement get_Tabsclose_Self(String tabName){
		return driver.findElement(By.xpath(Tabs_XPath+"/descendant::div[contains(@id,'tablist')]/descendant::div[contains(@class,'TabListWrapper')]/descendant::span[normalize-space(text())='"+tabName+"']/following-sibling::span[contains(@class,'TabCloseButton')]")).findVisibleElement(By.xpath(Tabs_XPath+"/descendant::div[contains(@id,'tablist')]/descendant::div[contains(@class,'TabListWrapper')]/descendant::span[normalize-space(text())='"+tabName+"']/following-sibling::span[contains(@class,'TabCloseButton')]"));
	}

	/*ClassLinkConfig->classLinkListGrid*/
	public void classLinkListGrid_colCaptionClick(String captionName){
		WebElement classLinkListGrid = driver.findElement(By.xpath(classLinkListGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']")).findVisibleElement(By.xpath(classLinkListGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']"));
		classLinkListGrid.click();
	}

	/*ClassLinkConfig->classLinkListGrid*/
	public void classLinkListGrid_selectCellbyRowColNumber(int rowNum,int colNum){
		WebElement classLinkListGrid = driver.findElement(By.xpath(classLinkListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]")).findVisibleElement(By.xpath(classLinkListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]"));
		classLinkListGrid.click();
	}

	/*ClassLinkConfig->classLinkListGrid*/
	public void classLinkListGrid_selectRowbyRowColNumber(int rowNum,int colNum){
		WebElement classLinkListGrid = driver.findElement(By.xpath(classLinkListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/..")).findVisibleElement(By.xpath(classLinkListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/.."));
		classLinkListGrid.click();
	}

	/*ClassLinkConfig->classLinkListGrid*/
	public void classLinkListGrid_selectRowbyRowNumber(int rowNum){
		WebElement classLinkListGrid = driver.findElement(By.xpath(classLinkListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr")).findVisibleElement(By.xpath(classLinkListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr"));
		classLinkListGrid.click();
	}

	/*ClassLinkConfig->classLinkListGrid*/
	public void classLinkListGrid_selectCellbyCellText(String cellText){
		WebElement classLinkListGrid = driver.findElement(By.xpath(classLinkListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']")).findVisibleElement(By.xpath(classLinkListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']"));
		classLinkListGrid.click();
	}

	/*ClassLinkConfig->classLinkListGrid*/
	public void classLinkListGrid_selectRowbyCellText(String cellText){
		WebElement classLinkListGrid = driver.findElement(By.xpath(classLinkListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/..")).findVisibleElement(By.xpath(classLinkListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/.."));
		classLinkListGrid.click();
	}

	/*ClassLinkConfig->classLinkListGrid*/
	public void classLinkListGrid_selectCellbyOtherInlineCellText(String otherInlineCellText,String targetCellText){
		WebElement classLinkListGrid = driver.findElement(By.xpath(classLinkListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']")).findVisibleElement(By.xpath(classLinkListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']"));
		classLinkListGrid.click();
	}

	/*ClassLinkConfig->classLinkListGrid*/
	public void classLinkListGrid_selectCellbyColNameCellText(String colName,String cellText){
		WebElement classLinkListGrid = driver.findElement(By.xpath(classLinkListGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../..")).findVisibleElement(By.xpath(classLinkListGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../.."));
		String idx=classLinkListGrid.getAttribute("idx");
		List<WebElement> Gridrows = driver.findAll(By.xpath(classLinkListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]"));
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

	/*ClassLinkConfig->classLinkListGrid*/
	public WebElement get_classLinkListGrid_colCaption_Self(String captionName){
		return driver.findElement(By.xpath(classLinkListGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']")).findVisibleElement(By.xpath(classLinkListGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']"));
	}

	/*ClassLinkConfig->classLinkListGrid*/
	public WebElement get_classLinkListGrid_CellbyRowColNumber_Self(int rowNum,int colNum){
		return driver.findElement(By.xpath(classLinkListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]")).findVisibleElement(By.xpath(classLinkListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]"));
	}

	/*ClassLinkConfig->classLinkListGrid*/
	public WebElement get_classLinkListGrid_RowbyRowColNumber_Self(int rowNum,int colNum){
		return driver.findElement(By.xpath(classLinkListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/..")).findVisibleElement(By.xpath(classLinkListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/.."));
	}

	/*ClassLinkConfig->classLinkListGrid*/
	public WebElement get_classLinkListGrid_RowbyRowNumber_Self(int rowNum){
		return driver.findElement(By.xpath(classLinkListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr")).findVisibleElement(By.xpath(classLinkListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr"));
	}

	/*ClassLinkConfig->classLinkListGrid*/
	public WebElement get_classLinkListGrid_CellbyCellText_Self(String cellText){
		return driver.findElement(By.xpath(classLinkListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']")).findVisibleElement(By.xpath(classLinkListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']"));
	}

	/*ClassLinkConfig->classLinkListGrid*/
	public WebElement get_classLinkListGrid_RowbyCellText_Self(String cellText){
		return driver.findElement(By.xpath(classLinkListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/..")).findVisibleElement(By.xpath(classLinkListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/.."));
	}

	/*ClassLinkConfig->classLinkListGrid*/
	public WebElement get_classLinkListGrid_CellbyOtherInlineCellText_Self(String otherInlineCellText,String targetCellText){
		return driver.findElement(By.xpath(classLinkListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']")).findVisibleElement(By.xpath(classLinkListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']"));
	}

	/*ClassLinkConfig->classLinkListGrid*/
	public WebElement get_classLinkListGrid_CellbyColNameCellText_Self(String colName,String cellText){
		WebElement classLinkListGrid = driver.findElement(By.xpath(classLinkListGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../..")).findVisibleElement(By.xpath(classLinkListGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../.."));
		String idx=classLinkListGrid.getAttribute("idx");
		List<WebElement> Gridrows = driver.findAll(By.xpath(classLinkListGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]"));
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

	/*ClassLinkConfig->creatBtn*/
	public void creatBtn_click(){
		WebElement creatBtn = driver.findElement(By.xpath(creatBtn_XPath)).findVisibleElement(By.xpath(creatBtn_XPath));
		creatBtn.click();
	}

	/*ClassLinkConfig->creatBtn*/
	public WebElement get_creatBtn_Self(){
		return driver.findElement(By.xpath(creatBtn_XPath)).findVisibleElement(By.xpath(creatBtn_XPath));
	}

	/*ClassLinkConfig->editBtn*/
	public void editBtn_click(){
		WebElement editBtn = driver.findElement(By.xpath(editBtn_XPath)).findVisibleElement(By.xpath(editBtn_XPath));
		editBtn.click();
	}

	/*ClassLinkConfig->editBtn*/
	public WebElement get_editBtn_Self(){
		return driver.findElement(By.xpath(editBtn_XPath)).findVisibleElement(By.xpath(editBtn_XPath));
	}

	/*ClassLinkConfig->delBtn*/
	public void delBtn_click(){
		WebElement delBtn = driver.findElement(By.xpath(delBtn_XPath)).findVisibleElement(By.xpath(delBtn_XPath));
		delBtn.click();
	}

	/*ClassLinkConfig->delBtn*/
	public WebElement get_delBtn_Self(){
		return driver.findElement(By.xpath(delBtn_XPath)).findVisibleElement(By.xpath(delBtn_XPath));
	}

	/*ClassLinkConfig->saveBtn*/
	public void saveBtn_click(){
		WebElement saveBtn = driver.findElement(By.xpath(saveBtn_XPath)).findVisibleElement(By.xpath(saveBtn_XPath));
		saveBtn.click();
	}

	/*ClassLinkConfig->saveBtn*/
	public WebElement get_saveBtn_Self(){
		return driver.findElement(By.xpath(saveBtn_XPath)).findVisibleElement(By.xpath(saveBtn_XPath));
	}

}
