package com.ibm.CNNC.elements;

import java.util.*;
import org.openqa.selenium.*;
import com.selenium.utils.WebDriver;
import com.selenium.utils.WebElement;

/*catalog\widget\dm\distribute\standardrulemanage\templates\StandardRuleDistribution.html*/
public class StandardRuleDistribution {
	protected WebDriver driver;
	private static final String addFile_XPath="//descendant::div[contains(@id,'StandardRuleDistribution')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"添加文件"+"']";
	private static final String removeFile_XPath="//descendant::div[contains(@id,'StandardRuleDistribution')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"删除选中文件"+"']";
	private static final String docDistributionGrid_XPath="//descendant::div[contains(@id,'StandardRuleDistribution')]/descendant::div[contains(@id,'DataGrid')]";
	private static final String selectDocDistributeToBtn_XPath="//descendant::div[contains(@id,'StandardRuleDistribution')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"选择发往单位"+"']";
	private static final String DeleteDistributeItemBtn_XPath="//descendant::div[contains(@id,'StandardRuleDistribution')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"删除发往单位"+"']";
	private static final String docDistributionToGrid_XPath="//descendant::div[contains(@id,'StandardRuleDistribution')]/descendant::div[contains(@id,'DataGrid')]";
	private static final String dDefaultOk_XPath="//descendant::div[contains(@id,'StandardRuleDistribution')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"确定"+"']";
	private static final String modifyBtn_XPath="//descendant::div[contains(@id,'StandardRuleDistribution')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"保存"+"']";
	private static final String approvalBtn_XPath="//descendant::div[contains(@id,'StandardRuleDistribution')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"确认"+"']";
	private static final String returnBackBtn_XPath="//descendant::div[contains(@id,'StandardRuleDistribution')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"退回"+"']";
	private static final String cancleBtn_XPath="//descendant::div[contains(@id,'StandardRuleDistribution')]/descendant::span[contains(@id, 'Button')][normalize-space(text())='"+"取消"+"']";

	//----Constructor Methods Begin----
	public StandardRuleDistribution(WebDriver driver){
		this.driver=driver;
	}

	/*StandardRuleDistribution->addFile*/
	public void addFile_click(){
		WebElement addFile = driver.findElement(By.xpath(addFile_XPath)).findVisibleElement(By.xpath(addFile_XPath));
		addFile.click();
	}

	/*StandardRuleDistribution->addFile*/
	public WebElement get_addFile_Self(){
		return driver.findElement(By.xpath(addFile_XPath)).findVisibleElement(By.xpath(addFile_XPath));
	}

	/*StandardRuleDistribution->removeFile*/
	public void removeFile_click(){
		WebElement removeFile = driver.findElement(By.xpath(removeFile_XPath)).findVisibleElement(By.xpath(removeFile_XPath));
		removeFile.click();
	}

	/*StandardRuleDistribution->removeFile*/
	public WebElement get_removeFile_Self(){
		return driver.findElement(By.xpath(removeFile_XPath)).findVisibleElement(By.xpath(removeFile_XPath));
	}

	/*StandardRuleDistribution->docDistributionGrid*/
	public void docDistributionGrid_colCaptionClick(String captionName){
		WebElement docDistributionGrid = driver.findElement(By.xpath(docDistributionGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']")).findVisibleElement(By.xpath(docDistributionGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']"));
		docDistributionGrid.click();
	}

	/*StandardRuleDistribution->docDistributionGrid*/
	public void docDistributionGrid_selectCellbyRowColNumber(int rowNum,int colNum){
		WebElement docDistributionGrid = driver.findElement(By.xpath(docDistributionGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]")).findVisibleElement(By.xpath(docDistributionGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]"));
		docDistributionGrid.click();
	}

	/*StandardRuleDistribution->docDistributionGrid*/
	public void docDistributionGrid_selectRowbyRowColNumber(int rowNum,int colNum){
		WebElement docDistributionGrid = driver.findElement(By.xpath(docDistributionGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/..")).findVisibleElement(By.xpath(docDistributionGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/.."));
		docDistributionGrid.click();
	}

	/*StandardRuleDistribution->docDistributionGrid*/
	public void docDistributionGrid_selectRowbyRowNumber(int rowNum){
		WebElement docDistributionGrid = driver.findElement(By.xpath(docDistributionGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr")).findVisibleElement(By.xpath(docDistributionGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr"));
		docDistributionGrid.click();
	}

	/*StandardRuleDistribution->docDistributionGrid*/
	public void docDistributionGrid_selectCellbyCellText(String cellText){
		WebElement docDistributionGrid = driver.findElement(By.xpath(docDistributionGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']")).findVisibleElement(By.xpath(docDistributionGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']"));
		docDistributionGrid.click();
	}

	/*StandardRuleDistribution->docDistributionGrid*/
	public void docDistributionGrid_selectRowbyCellText(String cellText){
		WebElement docDistributionGrid = driver.findElement(By.xpath(docDistributionGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/..")).findVisibleElement(By.xpath(docDistributionGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/.."));
		docDistributionGrid.click();
	}

	/*StandardRuleDistribution->docDistributionGrid*/
	public void docDistributionGrid_selectCellbyOtherInlineCellText(String otherInlineCellText,String targetCellText){
		WebElement docDistributionGrid = driver.findElement(By.xpath(docDistributionGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']")).findVisibleElement(By.xpath(docDistributionGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']"));
		docDistributionGrid.click();
	}

	/*StandardRuleDistribution->docDistributionGrid*/
	public void docDistributionGrid_selectCellbyColNameCellText(String colName,String cellText){
		WebElement docDistributionGrid = driver.findElement(By.xpath(docDistributionGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../..")).findVisibleElement(By.xpath(docDistributionGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../.."));
		String idx=docDistributionGrid.getAttribute("idx");
		List<WebElement> Gridrows = driver.findAll(By.xpath(docDistributionGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]"));
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

	/*StandardRuleDistribution->docDistributionGrid*/
	public WebElement get_docDistributionGrid_colCaption_Self(String captionName){
		return driver.findElement(By.xpath(docDistributionGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']")).findVisibleElement(By.xpath(docDistributionGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']"));
	}

	/*StandardRuleDistribution->docDistributionGrid*/
	public WebElement get_docDistributionGrid_CellbyRowColNumber_Self(int rowNum,int colNum){
		return driver.findElement(By.xpath(docDistributionGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]")).findVisibleElement(By.xpath(docDistributionGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]"));
	}

	/*StandardRuleDistribution->docDistributionGrid*/
	public WebElement get_docDistributionGrid_RowbyRowColNumber_Self(int rowNum,int colNum){
		return driver.findElement(By.xpath(docDistributionGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/..")).findVisibleElement(By.xpath(docDistributionGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/.."));
	}

	/*StandardRuleDistribution->docDistributionGrid*/
	public WebElement get_docDistributionGrid_RowbyRowNumber_Self(int rowNum){
		return driver.findElement(By.xpath(docDistributionGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr")).findVisibleElement(By.xpath(docDistributionGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr"));
	}

	/*StandardRuleDistribution->docDistributionGrid*/
	public WebElement get_docDistributionGrid_CellbyCellText_Self(String cellText){
		return driver.findElement(By.xpath(docDistributionGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']")).findVisibleElement(By.xpath(docDistributionGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']"));
	}

	/*StandardRuleDistribution->docDistributionGrid*/
	public WebElement get_docDistributionGrid_RowbyCellText_Self(String cellText){
		return driver.findElement(By.xpath(docDistributionGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/..")).findVisibleElement(By.xpath(docDistributionGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/.."));
	}

	/*StandardRuleDistribution->docDistributionGrid*/
	public WebElement get_docDistributionGrid_CellbyOtherInlineCellText_Self(String otherInlineCellText,String targetCellText){
		return driver.findElement(By.xpath(docDistributionGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']")).findVisibleElement(By.xpath(docDistributionGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']"));
	}

	/*StandardRuleDistribution->docDistributionGrid*/
	public WebElement get_docDistributionGrid_CellbyColNameCellText_Self(String colName,String cellText){
		WebElement docDistributionGrid = driver.findElement(By.xpath(docDistributionGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../..")).findVisibleElement(By.xpath(docDistributionGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../.."));
		String idx=docDistributionGrid.getAttribute("idx");
		List<WebElement> Gridrows = driver.findAll(By.xpath(docDistributionGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]"));
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

	/*StandardRuleDistribution->selectDocDistributeToBtn*/
	public void selectDocDistributeToBtn_click(){
		WebElement selectDocDistributeToBtn = driver.findElement(By.xpath(selectDocDistributeToBtn_XPath)).findVisibleElement(By.xpath(selectDocDistributeToBtn_XPath));
		selectDocDistributeToBtn.click();
	}

	/*StandardRuleDistribution->selectDocDistributeToBtn*/
	public WebElement get_selectDocDistributeToBtn_Self(){
		return driver.findElement(By.xpath(selectDocDistributeToBtn_XPath)).findVisibleElement(By.xpath(selectDocDistributeToBtn_XPath));
	}

	/*StandardRuleDistribution->DeleteDistributeItemBtn*/
	public void DeleteDistributeItemBtn_click(){
		WebElement DeleteDistributeItemBtn = driver.findElement(By.xpath(DeleteDistributeItemBtn_XPath)).findVisibleElement(By.xpath(DeleteDistributeItemBtn_XPath));
		DeleteDistributeItemBtn.click();
	}

	/*StandardRuleDistribution->DeleteDistributeItemBtn*/
	public WebElement get_DeleteDistributeItemBtn_Self(){
		return driver.findElement(By.xpath(DeleteDistributeItemBtn_XPath)).findVisibleElement(By.xpath(DeleteDistributeItemBtn_XPath));
	}

	/*StandardRuleDistribution->docDistributionToGrid*/
	public void docDistributionToGrid_colCaptionClick(String captionName){
		WebElement docDistributionToGrid = driver.findElement(By.xpath(docDistributionToGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']")).findVisibleElement(By.xpath(docDistributionToGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']"));
		docDistributionToGrid.click();
	}

	/*StandardRuleDistribution->docDistributionToGrid*/
	public void docDistributionToGrid_selectCellbyRowColNumber(int rowNum,int colNum){
		WebElement docDistributionToGrid = driver.findElement(By.xpath(docDistributionToGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]")).findVisibleElement(By.xpath(docDistributionToGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]"));
		docDistributionToGrid.click();
	}

	/*StandardRuleDistribution->docDistributionToGrid*/
	public void docDistributionToGrid_selectRowbyRowColNumber(int rowNum,int colNum){
		WebElement docDistributionToGrid = driver.findElement(By.xpath(docDistributionToGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/..")).findVisibleElement(By.xpath(docDistributionToGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/.."));
		docDistributionToGrid.click();
	}

	/*StandardRuleDistribution->docDistributionToGrid*/
	public void docDistributionToGrid_selectRowbyRowNumber(int rowNum){
		WebElement docDistributionToGrid = driver.findElement(By.xpath(docDistributionToGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr")).findVisibleElement(By.xpath(docDistributionToGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr"));
		docDistributionToGrid.click();
	}

	/*StandardRuleDistribution->docDistributionToGrid*/
	public void docDistributionToGrid_selectCellbyCellText(String cellText){
		WebElement docDistributionToGrid = driver.findElement(By.xpath(docDistributionToGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']")).findVisibleElement(By.xpath(docDistributionToGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']"));
		docDistributionToGrid.click();
	}

	/*StandardRuleDistribution->docDistributionToGrid*/
	public void docDistributionToGrid_selectRowbyCellText(String cellText){
		WebElement docDistributionToGrid = driver.findElement(By.xpath(docDistributionToGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/..")).findVisibleElement(By.xpath(docDistributionToGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/.."));
		docDistributionToGrid.click();
	}

	/*StandardRuleDistribution->docDistributionToGrid*/
	public void docDistributionToGrid_selectCellbyOtherInlineCellText(String otherInlineCellText,String targetCellText){
		WebElement docDistributionToGrid = driver.findElement(By.xpath(docDistributionToGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']")).findVisibleElement(By.xpath(docDistributionToGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']"));
		docDistributionToGrid.click();
	}

	/*StandardRuleDistribution->docDistributionToGrid*/
	public void docDistributionToGrid_selectCellbyColNameCellText(String colName,String cellText){
		WebElement docDistributionToGrid = driver.findElement(By.xpath(docDistributionToGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../..")).findVisibleElement(By.xpath(docDistributionToGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../.."));
		String idx=docDistributionToGrid.getAttribute("idx");
		List<WebElement> Gridrows = driver.findAll(By.xpath(docDistributionToGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]"));
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

	/*StandardRuleDistribution->docDistributionToGrid*/
	public WebElement get_docDistributionToGrid_colCaption_Self(String captionName){
		return driver.findElement(By.xpath(docDistributionToGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']")).findVisibleElement(By.xpath(docDistributionToGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+captionName+"']"));
	}

	/*StandardRuleDistribution->docDistributionToGrid*/
	public WebElement get_docDistributionToGrid_CellbyRowColNumber_Self(int rowNum,int colNum){
		return driver.findElement(By.xpath(docDistributionToGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]")).findVisibleElement(By.xpath(docDistributionToGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]"));
	}

	/*StandardRuleDistribution->docDistributionToGrid*/
	public WebElement get_docDistributionToGrid_RowbyRowColNumber_Self(int rowNum,int colNum){
		return driver.findElement(By.xpath(docDistributionToGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/..")).findVisibleElement(By.xpath(docDistributionToGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]/.."));
	}

	/*StandardRuleDistribution->docDistributionToGrid*/
	public WebElement get_docDistributionToGrid_RowbyRowNumber_Self(int rowNum){
		return driver.findElement(By.xpath(docDistributionToGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr")).findVisibleElement(By.xpath(docDistributionToGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::tr"));
	}

	/*StandardRuleDistribution->docDistributionToGrid*/
	public WebElement get_docDistributionToGrid_CellbyCellText_Self(String cellText){
		return driver.findElement(By.xpath(docDistributionToGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']")).findVisibleElement(By.xpath(docDistributionToGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']"));
	}

	/*StandardRuleDistribution->docDistributionToGrid*/
	public WebElement get_docDistributionToGrid_RowbyCellText_Self(String cellText){
		return driver.findElement(By.xpath(docDistributionToGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/..")).findVisibleElement(By.xpath(docDistributionToGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+cellText+"']/.."));
	}

	/*StandardRuleDistribution->docDistributionToGrid*/
	public WebElement get_docDistributionToGrid_CellbyOtherInlineCellText_Self(String otherInlineCellText,String targetCellText){
		return driver.findElement(By.xpath(docDistributionToGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']")).findVisibleElement(By.xpath(docDistributionToGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]/descendant::td[contains(@class,'GridCell')][normalize-space(text())='"+otherInlineCellText+"']/following-sibling::td[contains(@class,'GridCell')][normalize-space(text())='"+targetCellText+"']"));
	}

	/*StandardRuleDistribution->docDistributionToGrid*/
	public WebElement get_docDistributionToGrid_CellbyColNameCellText_Self(String colName,String cellText){
		WebElement docDistributionToGrid = driver.findElement(By.xpath(docDistributionToGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../..")).findVisibleElement(By.xpath(docDistributionToGrid_XPath+"/descendant::div[contains(@class,'MasterHeader')]/descendant::th/descendant::div[normalize-space(text())='"+colName+"']/../.."));
		String idx=docDistributionToGrid.getAttribute("idx");
		List<WebElement> Gridrows = driver.findAll(By.xpath(docDistributionToGrid_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')]"));
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

	/*StandardRuleDistribution->defaultOk*/
	public void dDefaultOk_click(){
		WebElement dDefaultOk = driver.findElement(By.xpath(dDefaultOk_XPath)).findVisibleElement(By.xpath(dDefaultOk_XPath));
		dDefaultOk.click();
	}

	/*StandardRuleDistribution->defaultOk*/
	public WebElement get_dDefaultOk_Self(){
		return driver.findElement(By.xpath(dDefaultOk_XPath)).findVisibleElement(By.xpath(dDefaultOk_XPath));
	}

	/*StandardRuleDistribution->modifyBtn*/
	public void modifyBtn_click(){
		WebElement modifyBtn = driver.findElement(By.xpath(modifyBtn_XPath)).findVisibleElement(By.xpath(modifyBtn_XPath));
		modifyBtn.click();
	}

	/*StandardRuleDistribution->modifyBtn*/
	public WebElement get_modifyBtn_Self(){
		return driver.findElement(By.xpath(modifyBtn_XPath)).findVisibleElement(By.xpath(modifyBtn_XPath));
	}

	/*StandardRuleDistribution->approvalBtn*/
	public void approvalBtn_click(){
		WebElement approvalBtn = driver.findElement(By.xpath(approvalBtn_XPath)).findVisibleElement(By.xpath(approvalBtn_XPath));
		approvalBtn.click();
	}

	/*StandardRuleDistribution->approvalBtn*/
	public WebElement get_approvalBtn_Self(){
		return driver.findElement(By.xpath(approvalBtn_XPath)).findVisibleElement(By.xpath(approvalBtn_XPath));
	}

	/*StandardRuleDistribution->returnBackBtn*/
	public void returnBackBtn_click(){
		WebElement returnBackBtn = driver.findElement(By.xpath(returnBackBtn_XPath)).findVisibleElement(By.xpath(returnBackBtn_XPath));
		returnBackBtn.click();
	}

	/*StandardRuleDistribution->returnBackBtn*/
	public WebElement get_returnBackBtn_Self(){
		return driver.findElement(By.xpath(returnBackBtn_XPath)).findVisibleElement(By.xpath(returnBackBtn_XPath));
	}

	/*StandardRuleDistribution->cancleBtn*/
	public void cancleBtn_click(){
		WebElement cancleBtn = driver.findElement(By.xpath(cancleBtn_XPath)).findVisibleElement(By.xpath(cancleBtn_XPath));
		cancleBtn.click();
	}

	/*StandardRuleDistribution->cancleBtn*/
	public WebElement get_cancleBtn_Self(){
		return driver.findElement(By.xpath(cancleBtn_XPath)).findVisibleElement(By.xpath(cancleBtn_XPath));
	}

}
