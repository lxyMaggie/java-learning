package com.ibm.CNNC.page;
import java.util.List;
import org.openqa.selenium.By;
import com.selenium.utils.WebDriver;
import com.selenium.utils.WebElement;
import com.thoughtworks.selenium.SeleneseTestBase;

public class SearchPlatformPage {
	private WebDriver driver;
	private static final String SearchPlatformGrid_XPath="//descendant::div[contains(@id,'SearchPlatform')]/descendant::div[contains(@class,'MasterView')]";
	private static final String SearchMain_XPath="//descendant::div[contains(@id,'SearchPlatform')]";
	public SearchPlatformPage(WebDriver driver){
		this.driver=driver;
	}
	public int get_SearchPlatformGrid_TotalRowNum_Self(){
		List<WebElement> GridRows=driver.findAll(By.xpath(SearchPlatformGrid_XPath+"/descendant::div[contains(@class,'GridRow')]"));
		return GridRows.size();
	}
	public WebElement get_SearchPlatformGrid_CellbyRowColNumber_Self(int rowNum,int colNum){
		return driver.findElement(By.xpath(SearchMain_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]")).findVisibleElement(By.xpath(SearchMain_XPath+"/descendant::div[contains(@class,'MasterView')]/descendant::div[contains(@class,'GridRow')][position()="+rowNum+"]/descendant::td[position()="+colNum+"]"));
	}
		

}
