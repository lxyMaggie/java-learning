package com.ibm.CNNC.elements;

import java.util.*;
import org.openqa.selenium.*;
import com.selenium.utils.WebDriver;
import com.selenium.utils.WebElement;

/*catalog\widget\dm\sysmanage\templateconfig\templates\DocumentTemplateConfig.html*/
public class DocumentTemplateConfig {
	protected WebDriver driver;
	private static final String templateRuleGrid_XPath="//descendant::div[contains(@id,'DocumentTemplateConfig')]/descendant::div[contains(@id,'DataGrid')]";
	private static final String save_XPath="//descendant::div[contains(@id,'DocumentTemplateConfig')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"±£´æÄ£°å"+"']";
	private static final String dDefault_XPath="//descendant::div[contains(@id,'DocumentTemplateConfig')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"»Ö¸´Ä¬ÈÏÅäÖÃ"+"']";

	//----Constructor Methods Begin----
	public DocumentTemplateConfig(WebDriver driver){
		this.driver=driver;
	}

	/*DocumentTemplateConfig->templateRuleGrid*/
	public void templateRuleGrid_colCaptionClick(String captionName){
		WebElement templateRuleGrid = driver.findElement(By.xpath(templateRuleGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']")).findVisibleElement(By.xpath(templateRuleGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']"));
		templateRuleGrid.click();
	}

	/*DocumentTemplateConfig->templateRuleGrid*/
	public void templateRuleGrid_selectCellbyRowColNumber(int rowNum,int colNum){
		WebElement templateRuleGrid = driver.findElement(By.xpath(templateRuleGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]")).findVisibleElement(By.xpath(templateRuleGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]"));
		templateRuleGrid.click();
	}

	/*DocumentTemplateConfig->templateRuleGrid*/
	public void templateRuleGrid_selectRowbyRowColNumber(int rowNum,int colNum){
		WebElement templateRuleGrid = driver.findElement(By.xpath(templateRuleGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/..")).findVisibleElement(By.xpath(templateRuleGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/.."));
		templateRuleGrid.click();
	}

	/*DocumentTemplateConfig->templateRuleGrid*/
	public void templateRuleGrid_selectRowbyRowNumber(int rowNum){
		WebElement templateRuleGrid = driver.findElement(By.xpath(templateRuleGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr")).findVisibleElement(By.xpath(templateRuleGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr"));
		templateRuleGrid.click();
	}

	/*DocumentTemplateConfig->templateRuleGrid*/
	public void templateRuleGrid_selectCellbyCellText(String cellText){
		WebElement templateRuleGrid = driver.findElement(By.xpath(templateRuleGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']")).findVisibleElement(By.xpath(templateRuleGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']"));
		templateRuleGrid.click();
	}

	/*DocumentTemplateConfig->templateRuleGrid*/
	public void templateRuleGrid_selectRowbyCellText(String cellText){
		WebElement templateRuleGrid = driver.findElement(By.xpath(templateRuleGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/..")).findVisibleElement(By.xpath(templateRuleGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/.."));
		templateRuleGrid.click();
	}

	/*DocumentTemplateConfig->templateRuleGrid*/
	public void templateRuleGrid_selectCellbyOtherInlineCellText(String otherInlineCellText,String targetCellText){
		WebElement templateRuleGrid = driver.findElement(By.xpath(templateRuleGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']")).findVisibleElement(By.xpath(templateRuleGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']"));
		templateRuleGrid.click();
	}

	/*DocumentTemplateConfig->templateRuleGrid*/
	public void templateRuleGrid_selectCellbyColNameCellText(String colName,String cellText){
		WebElement templateRuleGrid = driver.findElement(By.xpath(templateRuleGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../..")).findVisibleElement(By.xpath(templateRuleGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../.."));
		String idx=templateRuleGrid.getAttribute("idx");
		List<WebElement> Gridrows = driver.findAll(By.xpath(templateRuleGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]"));
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

	/*DocumentTemplateConfig->templateRuleGrid*/
	public WebElement get_templateRuleGrid_colCaption_Self(String captionName){
		return driver.findElement(By.xpath(templateRuleGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']")).findVisibleElement(By.xpath(templateRuleGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']"));
	}

	/*DocumentTemplateConfig->templateRuleGrid*/
	public WebElement get_templateRuleGrid_CellbyRowColNumber_Self(int rowNum,int colNum){
		return driver.findElement(By.xpath(templateRuleGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]")).findVisibleElement(By.xpath(templateRuleGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]"));
	}

	/*DocumentTemplateConfig->templateRuleGrid*/
	public WebElement get_templateRuleGrid_RowbyRowColNumber_Self(int rowNum,int colNum){
		return driver.findElement(By.xpath(templateRuleGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/..")).findVisibleElement(By.xpath(templateRuleGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/.."));
	}

	/*DocumentTemplateConfig->templateRuleGrid*/
	public WebElement get_templateRuleGrid_RowbyRowNumber_Self(int rowNum){
		return driver.findElement(By.xpath(templateRuleGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr")).findVisibleElement(By.xpath(templateRuleGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr"));
	}

	/*DocumentTemplateConfig->templateRuleGrid*/
	public WebElement get_templateRuleGrid_CellbyCellText_Self(String cellText){
		return driver.findElement(By.xpath(templateRuleGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']")).findVisibleElement(By.xpath(templateRuleGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']"));
	}

	/*DocumentTemplateConfig->templateRuleGrid*/
	public WebElement get_templateRuleGrid_RowbyCellText_Self(String cellText){
		return driver.findElement(By.xpath(templateRuleGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/..")).findVisibleElement(By.xpath(templateRuleGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/.."));
	}

	/*DocumentTemplateConfig->templateRuleGrid*/
	public WebElement get_templateRuleGrid_CellbyOtherInlineCellText_Self(String otherInlineCellText,String targetCellText){
		return driver.findElement(By.xpath(templateRuleGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']")).findVisibleElement(By.xpath(templateRuleGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']"));
	}

	/*DocumentTemplateConfig->templateRuleGrid*/
	public WebElement get_templateRuleGrid_CellbyColNameCellText_Self(String colName,String cellText){
		WebElement templateRuleGrid = driver.findElement(By.xpath(templateRuleGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../..")).findVisibleElement(By.xpath(templateRuleGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../.."));
		String idx=templateRuleGrid.getAttribute("idx");
		List<WebElement> Gridrows = driver.findAll(By.xpath(templateRuleGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]"));
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

	/*DocumentTemplateConfig->save*/
	public void save_click(){
		WebElement save = driver.findElement(By.xpath(save_XPath)).findVisibleElement(By.xpath(save_XPath));
		save.click();
	}

	/*DocumentTemplateConfig->save*/
	public WebElement get_save_Self(){
		return driver.findElement(By.xpath(save_XPath)).findVisibleElement(By.xpath(save_XPath));
	}

	/*DocumentTemplateConfig->default*/
	public void dDefault_click(){
		WebElement dDefault = driver.findElement(By.xpath(dDefault_XPath)).findVisibleElement(By.xpath(dDefault_XPath));
		dDefault.click();
	}

	/*DocumentTemplateConfig->default*/
	public WebElement get_dDefault_Self(){
		return driver.findElement(By.xpath(dDefault_XPath)).findVisibleElement(By.xpath(dDefault_XPath));
	}

}
