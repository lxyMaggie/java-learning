package com.ibm.CNNC.elements;

import java.util.*;
import org.openqa.selenium.*;
import com.selenium.utils.WebDriver;
import com.selenium.utils.WebElement;

/*catalog\widget\dm\docmanage\nuclearfolderinnercatalog\templates\NuclearFolderInnerCatalog.html*/
public class NuclearFolderInnerCatalog {
	protected WebDriver driver;
	private static final String innerCatalogGrid_XPath="//descendant::div[contains(@id,'NuclearFolderInnerCatalog')]/descendant::div[contains(@id,'DataGrid')]";

	//----Constructor Methods Begin----
	public NuclearFolderInnerCatalog(WebDriver driver){
		this.driver=driver;
	}

	/*NuclearFolderInnerCatalog->innerCatalogGrid*/
	public void innerCatalogGrid_colCaptionClick(String captionName){
		WebElement innerCatalogGrid = driver.findElement(By.xpath(innerCatalogGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']")).findVisibleElement(By.xpath(innerCatalogGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']"));
		innerCatalogGrid.click();
	}

	/*NuclearFolderInnerCatalog->innerCatalogGrid*/
	public void innerCatalogGrid_selectCellbyRowColNumber(int rowNum,int colNum){
		WebElement innerCatalogGrid = driver.findElement(By.xpath(innerCatalogGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]")).findVisibleElement(By.xpath(innerCatalogGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]"));
		innerCatalogGrid.click();
	}

	/*NuclearFolderInnerCatalog->innerCatalogGrid*/
	public void innerCatalogGrid_selectRowbyRowColNumber(int rowNum,int colNum){
		WebElement innerCatalogGrid = driver.findElement(By.xpath(innerCatalogGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/..")).findVisibleElement(By.xpath(innerCatalogGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/.."));
		innerCatalogGrid.click();
	}

	/*NuclearFolderInnerCatalog->innerCatalogGrid*/
	public void innerCatalogGrid_selectRowbyRowNumber(int rowNum){
		WebElement innerCatalogGrid = driver.findElement(By.xpath(innerCatalogGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr")).findVisibleElement(By.xpath(innerCatalogGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr"));
		innerCatalogGrid.click();
	}

	/*NuclearFolderInnerCatalog->innerCatalogGrid*/
	public void innerCatalogGrid_selectCellbyCellText(String cellText){
		WebElement innerCatalogGrid = driver.findElement(By.xpath(innerCatalogGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']")).findVisibleElement(By.xpath(innerCatalogGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']"));
		innerCatalogGrid.click();
	}

	/*NuclearFolderInnerCatalog->innerCatalogGrid*/
	public void innerCatalogGrid_selectRowbyCellText(String cellText){
		WebElement innerCatalogGrid = driver.findElement(By.xpath(innerCatalogGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/..")).findVisibleElement(By.xpath(innerCatalogGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/.."));
		innerCatalogGrid.click();
	}

	/*NuclearFolderInnerCatalog->innerCatalogGrid*/
	public void innerCatalogGrid_selectCellbyOtherInlineCellText(String otherInlineCellText,String targetCellText){
		WebElement innerCatalogGrid = driver.findElement(By.xpath(innerCatalogGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']")).findVisibleElement(By.xpath(innerCatalogGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']"));
		innerCatalogGrid.click();
	}

	/*NuclearFolderInnerCatalog->innerCatalogGrid*/
	public void innerCatalogGrid_selectCellbyColNameCellText(String colName,String cellText){
		WebElement innerCatalogGrid = driver.findElement(By.xpath(innerCatalogGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../..")).findVisibleElement(By.xpath(innerCatalogGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../.."));
		String idx=innerCatalogGrid.getAttribute("idx");
		List<WebElement> Gridrows = driver.findAll(By.xpath(innerCatalogGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]"));
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

	/*NuclearFolderInnerCatalog->innerCatalogGrid*/
	public WebElement get_innerCatalogGrid_colCaption_Self(String captionName){
		return driver.findElement(By.xpath(innerCatalogGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']")).findVisibleElement(By.xpath(innerCatalogGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']"));
	}

	/*NuclearFolderInnerCatalog->innerCatalogGrid*/
	public WebElement get_innerCatalogGrid_CellbyRowColNumber_Self(int rowNum,int colNum){
		return driver.findElement(By.xpath(innerCatalogGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]")).findVisibleElement(By.xpath(innerCatalogGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]"));
	}

	/*NuclearFolderInnerCatalog->innerCatalogGrid*/
	public WebElement get_innerCatalogGrid_RowbyRowColNumber_Self(int rowNum,int colNum){
		return driver.findElement(By.xpath(innerCatalogGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/..")).findVisibleElement(By.xpath(innerCatalogGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/.."));
	}

	/*NuclearFolderInnerCatalog->innerCatalogGrid*/
	public WebElement get_innerCatalogGrid_RowbyRowNumber_Self(int rowNum){
		return driver.findElement(By.xpath(innerCatalogGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr")).findVisibleElement(By.xpath(innerCatalogGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr"));
	}

	/*NuclearFolderInnerCatalog->innerCatalogGrid*/
	public WebElement get_innerCatalogGrid_CellbyCellText_Self(String cellText){
		return driver.findElement(By.xpath(innerCatalogGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']")).findVisibleElement(By.xpath(innerCatalogGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']"));
	}

	/*NuclearFolderInnerCatalog->innerCatalogGrid*/
	public WebElement get_innerCatalogGrid_RowbyCellText_Self(String cellText){
		return driver.findElement(By.xpath(innerCatalogGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/..")).findVisibleElement(By.xpath(innerCatalogGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/.."));
	}

	/*NuclearFolderInnerCatalog->innerCatalogGrid*/
	public WebElement get_innerCatalogGrid_CellbyOtherInlineCellText_Self(String otherInlineCellText,String targetCellText){
		return driver.findElement(By.xpath(innerCatalogGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']")).findVisibleElement(By.xpath(innerCatalogGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']"));
	}

	/*NuclearFolderInnerCatalog->innerCatalogGrid*/
	public WebElement get_innerCatalogGrid_CellbyColNameCellText_Self(String colName,String cellText){
		WebElement innerCatalogGrid = driver.findElement(By.xpath(innerCatalogGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../..")).findVisibleElement(By.xpath(innerCatalogGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../.."));
		String idx=innerCatalogGrid.getAttribute("idx");
		List<WebElement> Gridrows = driver.findAll(By.xpath(innerCatalogGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]"));
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
