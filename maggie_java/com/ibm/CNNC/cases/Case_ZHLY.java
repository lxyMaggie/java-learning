package com.ibm.CNNC.cases;

import static org.junit.Assert.fail;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import static org.testng.AssertJUnit.*;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.ibm.CNNC.data.Test_Data_ZHLY;
import com.ibm.CNNC.data.XMLDataExtractor;
import com.ibm.CNNC.elements.DepartmentLibTreeNode;
import com.ibm.CNNC.elements.DocManageView;
import com.ibm.CNNC.elements.LoginPaneSSO;
import com.ibm.CNNC.elements.ManageToolbar;
import com.ibm.CNNC.elements.PopupDialog;
import com.ibm.CNNC.elements.SearchDialog;
import com.ibm.CNNC.elements.Searchpane;
import com.ibm.CNNC.elements.SystemNavigation;
import com.ibm.CNNC.page.AdvancedSearchPage;
import com.ibm.CNNC.page.CommonSearchConditionPage;
import com.ibm.CNNC.page.DimensionSearchConditionPage;
import com.ibm.CNNC.page.SearchPanePage;
import com.ibm.CNNC.page.SearchPlatformPage;

import com.selenium.utils.DriverHelper;
import com.selenium.utils.WebDriver;
import com.thoughtworks.selenium.SeleneseTestNgHelper;



public class Case_ZHLY {
	private WebDriver driver;
	private StringBuffer verificationErrors = new StringBuffer();
	public Boolean testFailed = false;
	public Boolean relogin = false;
	public String browserType = "";
	public String url ="";
	public String username ="";
	public String password ="";
	
	@BeforeClass(alwaysRun=true)
	@Parameters({"browser-type", "url","username", "password"})
	public void setUp( String browserType,  String url, String username, String password) throws Exception {
		this.browserType=browserType;
		this.url  = url;
		this.username=username;
		this.password=password;
		Reporter.log("<br /><br />CNNC Smoke testing - Information");
		Reporter.log("<br />System - " + url);
		Reporter.log("<br />User - " + username);
		Reporter.log("<br />Password - " + password);	
		try{
			login();
		}catch(Exception e){
			testFailed = true;
			System.out.println("Failed Login");
			e.printStackTrace();
		}
	}
	
	public void login() throws Exception {
    	if(driver != null)
    		this.driver.quit();
    	this.driver = DriverHelper.setUpDriver(null, browserType);
		this.driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
    	
		Thread.sleep(1000);
		driver.get(url);
		driver.manage().window().maximize();
        
		Thread.sleep(5000);
		LoginPaneSSO login = new LoginPaneSSO(driver);
		login.userId_input(username);
		Thread.sleep(1000);
		login.password_input(password);
		Thread.sleep(1000);
		login.loginButton_click();
		Thread.sleep(5000);
		//TODO to check login success	
		testFailed = false;
		relogin = false;
	}  
	
    @BeforeMethod(alwaysRun=true)
    public void beforeMethod()
    {
    	try{
        	if(testFailed || relogin)
        		login();
    	}catch(Exception e){
    		relogin = true;
    		testFailed = true;
    		Reporter.log("Login Failed<br />");
		}
    }
	//创建文档
	@Test(description="Create File", dataProvider = "TestData_ZHLY")
	public void createfile(Test_Data_ZHLY data) throws Exception{
		SystemNavigation SystemNavigator = new SystemNavigation(driver); 
		PopupDialog popup=new PopupDialog(driver);
		ManageToolbar toolbar=new ManageToolbar(driver);
		SystemNavigator.SystemNavigation_UnifyReceiveView_click();
		SystemNavigator.SystemNavigation_DocumentManageView_click();
		Thread.sleep(1000);
		SystemNavigator.corparationSearch_DocumentManageView_click();
		Thread.sleep(1000);
		toolbar.CreateLable_click();
		Thread.sleep(1000);
		toolbar.FileTypeSelect_select(data.getFiletype());
		Thread.sleep(1000);
		Date date=new Date();
		DateFormat sdf=new SimpleDateFormat("HHmmss");
		String Filecode="M-IBM-SEARCH-"+sdf.format(date);
		String Filename ="M搜索测试"+sdf.format(date);
		toolbar.CreateFilecodeField_input(Filecode);
		Thread.sleep(1000);
		toolbar.CreateFileeditionField_input(data.getEdition());
		Thread.sleep(1000);
		toolbar.CreateFilenameField_input(Filename);
		Thread.sleep(1000);
		toolbar.InstituteSelect_select(data.getInstitute());
		Thread.sleep(1000);
		toolbar.CreateFileSubmit_click();
		Thread.sleep(1000);
		try{
			//assertEquals(popup.get_ContentResult_self().getText().trim(),"著录成功！");
			SeleneseTestNgHelper.assertEquals(popup.get_ContentResult_self().getText().trim(),"著录成功！");
			System.out.println("Creating File in Corporation Lib Succeeded");
		}catch(Error e){
			System.out.println(popup.get_ContentResult_self().getText().trim());
			System.out.println("【Fail】Creating File in Corporation Lib Failed");
		}
		popup.ConfirmButton_Click();
		Thread.sleep(1000);
		System.out.println("System Receive the created file");
		SystemNavigator.SystemNavigation_UnifyReceiveView_click();
		SystemNavigator.documentReceiveProcess_UnifyReceiveView_click();
		Thread.sleep(1000);
		toolbar.ToggleSearchPaneBtnLable_click();
		Thread.sleep(1000);
		toolbar.FieldEditorTitle_input(Filename);
		Thread.sleep(1000);
		toolbar.SearchSubmitLable_click();
		Thread.sleep(1000);
		DocManageView ManageDoc=new DocManageView(driver);
		ManageDoc.RowSelect_click(Filename);
		Thread.sleep(1000);
		toolbar.ReceiveVerifyConfirmLable_click();
		Thread.sleep(1000);
		toolbar.ReceiveVerifyConfirmButton_click();
		Thread.sleep(1000);
		try{
			SeleneseTestNgHelper.assertEquals(popup.get_ContentResult_self().getText().substring(13).trim(),"文件接收成功");
			System.out.println("System Receiving Succeeded");
		}catch(Error e){
			System.out.println("【Fail】System Receiving Failed!");
			System.out.println(popup.get_ContentResult_self().getText().trim());
		}
		popup.ConfirmButton_Click();
		Thread.sleep(1000);
	}
	//快速搜索
	@Test(description="Quick Search", dataProvider = "TestData_ZHLY")
	public void qiuckSearch(Test_Data_ZHLY data) throws Exception  {
		SearchPanePage spp = new SearchPanePage(driver);
		SearchPlatformPage spf=new SearchPlatformPage(driver);
		SystemNavigation sn =new SystemNavigation(driver);
		sn.SystemNavigation_SearchUseView_click();
		Thread.sleep(1000);
		sn.companyDocumentLibrary_SearchUseView_click();
		Thread.sleep(1000);
		spp.documentType_select(data.getQuick_search_type());
		Thread.sleep(1000);
		spp.searchAllContextOption_check();
		Thread.sleep(1000);
		spp.searchText_input(data.getQuick_search_condition());
		Thread.sleep(1000);
		spp.onQuickSearch_click();
		Thread.sleep(1000);
		int TotalRow=spf.get_SearchPlatformGrid_TotalRowNum_Self();
		try{
			SeleneseTestNgHelper.assertNotEquals(TotalRow, 0);
			Reporter.log("<br />Quick Search find Files!");
			for(int i=1;i<=TotalRow;i++){
				SeleneseTestNgHelper.assertEquals(spf.get_SearchPlatformGrid_CellbyRowColNumber_Self(i,2).getText().trim().contains(data.getQuick_search_type())||
						spf.get_SearchPlatformGrid_CellbyRowColNumber_Self(i,2).getText().trim().contains(data.getUpstreamFileOne())||
						spf.get_SearchPlatformGrid_CellbyRowColNumber_Self(i,2).getText().trim().contains(data.getUpstreamFileTwo())||
						spf.get_SearchPlatformGrid_CellbyRowColNumber_Self(i,2).getText().trim().contains(data.getUpstreamFileThree())||
						spf.get_SearchPlatformGrid_CellbyRowColNumber_Self(i,2).getText().trim().contains(data.getUpstreamFileFour())||
						spf.get_SearchPlatformGrid_CellbyRowColNumber_Self(i,2).getText().trim().contains(data.getUpstreamFileFive())||
						spf.get_SearchPlatformGrid_CellbyRowColNumber_Self(i,2).getText().trim().contains(data.getUpstreamFileSix()), true);
				SeleneseTestNgHelper.assertEquals(spf.get_SearchPlatformGrid_CellbyRowColNumber_Self(i,7).getText().trim().contains(data.getQuick_search_condition()),true);
				//System.out.println("<br />Quick Search FileName - " +spf.get_SearchPlatformGrid_CellbyRowColNumber_Self(i,7).getText().trim());
			}
			System.out.println("Quick Search Succeeded");
			Reporter.log("<br /> Quick Search Succeeded");
		}catch(Error e){
			System.out.println("Quick Search Failed");
			Reporter.log("<br /> Quick Search Failed");
			testFailed=true;
		}
		relogin = true;
	}
	//普通搜索
	@Test(description="Common Search",dataProvider = "TestData_ZHLY")
	public void commonSearch(Test_Data_ZHLY data) throws Exception {
		SystemNavigation sn =new SystemNavigation(driver);
		Searchpane sp = new Searchpane(driver);
		SearchPlatformPage spf=new SearchPlatformPage(driver);
		CommonSearchConditionPage cscp = new CommonSearchConditionPage(driver);
		sn.SystemNavigation_UnifyReceiveView_click();
		sn.SystemNavigation_SearchUseView_click();
		Thread.sleep(1000);
		sn.companyDocumentLibrary_SearchUseView_click();
		Thread.sleep(1000);
		sp.commonSearch_click();
		Thread.sleep(1000);
		cscp.typeselect_select(data.getCommon_search_type());
		Thread.sleep(1000);
		cscp.documentcode_input(data.getCommon_search_doccode());
		Thread.sleep(1000);
		cscp.documenttitle_input(data.getCommon_search_doctitle());
		Thread.sleep(1000);
		cscp.resetButton_click();
		Thread.sleep(1000);
		cscp.typeselect_select(data.getCommon_search_type());
		Thread.sleep(1000);
		cscp.documentcode_input(data.getCommon_search_doccode());
		Thread.sleep(1000);
		cscp.documenttitle_input(data.getCommon_search_doctitle());
		Thread.sleep(1000);
		cscp.searchButton_click();
		Thread.sleep(1000);
		int TotalRow=spf.get_SearchPlatformGrid_TotalRowNum_Self();
		try{
			SeleneseTestNgHelper.assertNotEquals(TotalRow, 0);
			Reporter.log("<br />Common Search find Files!");
			for(int i=1;i<=TotalRow;i++){
				SeleneseTestNgHelper.assertEquals(spf.get_SearchPlatformGrid_CellbyRowColNumber_Self(i,7).getText().trim().contains(data.getCommon_search_doctitle()),true);
				SeleneseTestNgHelper.assertEquals(spf.get_SearchPlatformGrid_CellbyRowColNumber_Self(i,3).getText().trim().contains(data.getCommon_search_doccode()),true);
				SeleneseTestNgHelper.assertEquals(spf.get_SearchPlatformGrid_CellbyRowColNumber_Self(i,2).getText().trim(),data.getCommon_search_type());
				//System.out.println("<br />Common Search FileName - " +spf.get_SearchPlatformGrid_CellbyRowColNumber_Self(i,7).getText().trim());

			}
			System.out.println("Common Search Succeeded");
			Reporter.log("<br />Common Search Succeeded");
		}catch(Error e){
			System.out.println("Common Search Failed");
			Reporter.log("<br />Common Search Failed");
			testFailed=true;
		}
		relogin = true;
		
	}
	//多维搜索
	@Test(description="Dimension Search",dataProvider = "TestData_ZHLY")
	public void dimensionSearch(Test_Data_ZHLY data) throws Exception{
		Searchpane sp = new Searchpane(driver);
		DimensionSearchConditionPage dscp = new DimensionSearchConditionPage(driver);
		SystemNavigation sn =new SystemNavigation(driver);
		SearchPlatformPage spf=new SearchPlatformPage(driver);
		sn.SystemNavigation_UnifyReceiveView_click();
		sn.SystemNavigation_SearchUseView_click();
		Thread.sleep(1000);
		sn.companyDocumentLibrary_SearchUseView_click();
		Thread.sleep(1000);
		sp.dimensionSearch_click();
		Thread.sleep(1000);
		dscp.categoryImg_click();
		Thread.sleep(1000);
		//dscp.upstreamImg_click();
		//Thread.sleep(1000);
		dscp.checkBox_check(data.getDimension_search_type());
		Thread.sleep(1000);
		dscp.searchButton_click();
		Thread.sleep(1000);
		int TotalRow=spf.get_SearchPlatformGrid_TotalRowNum_Self();
		try{
			SeleneseTestNgHelper.assertNotEquals(TotalRow, 0);
			Reporter.log("<br />Dimension Search find Files!");
			for(int i=1;i<=TotalRow;i++){
				SeleneseTestNgHelper.assertEquals(spf.get_SearchPlatformGrid_CellbyRowColNumber_Self(i,2).getText().trim().contains(data.getDimension_search_type())||
						spf.get_SearchPlatformGrid_CellbyRowColNumber_Self(i,2).getText().trim().contains(data.getUpstreamFileOne())||
						spf.get_SearchPlatformGrid_CellbyRowColNumber_Self(i,2).getText().trim().contains(data.getUpstreamFileTwo())||
						spf.get_SearchPlatformGrid_CellbyRowColNumber_Self(i,2).getText().trim().contains(data.getUpstreamFileThree())||
						spf.get_SearchPlatformGrid_CellbyRowColNumber_Self(i,2).getText().trim().contains(data.getUpstreamFileFour())||
						spf.get_SearchPlatformGrid_CellbyRowColNumber_Self(i,2).getText().trim().contains(data.getUpstreamFileFive())||
						spf.get_SearchPlatformGrid_CellbyRowColNumber_Self(i,2).getText().trim().contains(data.getUpstreamFileSix()), true);
				//System.out.println("<br />Dimension Search FileName - " +spf.get_SearchPlatformGrid_CellbyRowColNumber_Self(i,7).getText().trim());
				//System.out.println("<br />Dimension Search FileType - " +spf.get_SearchPlatformGrid_CellbyRowColNumber_Self(i,2).getText().trim());		
			}
			System.out.println("Dimension Search Succeeded");
			Reporter.log("<br />Dimension Search Succeeded");
		}catch(Error e){
			System.out.println("Dimension Search Failed");
			Reporter.log("<br />Dimension Search Failed");
			testFailed=true;
		}
		secondSearch(data.getSecond_search_condition()); 
		Thread.sleep(1000);
		int TotalRow1=spf.get_SearchPlatformGrid_TotalRowNum_Self();
		try{
			SeleneseTestNgHelper.assertNotEquals(TotalRow1, 0);
			Reporter.log("<br />Second Search find Files!");
			for(int i=1;i<=TotalRow1;i++){
				SeleneseTestNgHelper.assertEquals(spf.get_SearchPlatformGrid_CellbyRowColNumber_Self(i,7).getText().trim().contains(data.getCommon_search_doctitle()),true);
				//System.out.println("<br />Second Search FileName - " +spf.get_SearchPlatformGrid_CellbyRowColNumber_Self(i,7).getText().trim());

			}
			System.out.println("Second Search Succeeded");
			Reporter.log("<br />Second Search Succeeded");
		}catch(Error e){
			System.out.println("Second Search Failed");
			Reporter.log("<br />Second Search Failed");
			testFailed=true;
		}
		saveAsMySearch(data.getSearchname());
		relogin=true;
	}
	//高级搜索
	@Test(description="Advanced Search",dataProvider = "TestData_ZHLY")
	public void advancedSearch(Test_Data_ZHLY data) throws Exception{
		SearchPanePage spp = new SearchPanePage(driver);
		AdvancedSearchPage asp = new AdvancedSearchPage(driver);
		SearchPlatformPage spf=new SearchPlatformPage(driver);
		Thread.sleep(1000);
		spp.advancedSearchBtn_click();
		Thread.sleep(1000);
		asp.repositoryselect_select(data.getAdvanced_search_repository_type());
		Thread.sleep(1000);
		asp.typeselect_click();
		Thread.sleep(1000);
		asp.categoryImg_click(data.getAllcatogery());
		Thread.sleep(1000);
		asp.checkBox_check(data.getAdvanced_search_document_type());
		Thread.sleep(1000);
		asp.typeSelect_OKButton_click();
		Thread.sleep(1000);
		asp.dataItemSelect_select(data.getAdvanced_search_data_item());
		Thread.sleep(1000);
		asp.dataConditionSelect_select(data.getAdvanced_search_data_condition());
		Thread.sleep(1000);
		asp.dataValueSelect_select(data.getAdvanced_search_data_value());
		Thread.sleep(1000);
		asp.AdvancedSearchConfirmButton_click();
		Thread.sleep(1000);
		int TotalRow=spf.get_SearchPlatformGrid_TotalRowNum_Self();
		try{
			SeleneseTestNgHelper.assertNotEquals(TotalRow, 0);
			Reporter.log("<br />Advanced Search find Files!");
			for(int i=1;i<=TotalRow;i++){
				SeleneseTestNgHelper.assertEquals(spf.get_SearchPlatformGrid_CellbyRowColNumber_Self(i,2).getText().trim().contains(data.getAdvanced_search_document_type())||
						spf.get_SearchPlatformGrid_CellbyRowColNumber_Self(i,2).getText().trim().contains(data.getUpstreamFileOne())||
						spf.get_SearchPlatformGrid_CellbyRowColNumber_Self(i,2).getText().trim().contains(data.getUpstreamFileTwo())||
						spf.get_SearchPlatformGrid_CellbyRowColNumber_Self(i,2).getText().trim().contains(data.getUpstreamFileThree())||
						spf.get_SearchPlatformGrid_CellbyRowColNumber_Self(i,2).getText().trim().contains(data.getUpstreamFileFour())||
						spf.get_SearchPlatformGrid_CellbyRowColNumber_Self(i,2).getText().trim().contains(data.getUpstreamFileFive())||
						spf.get_SearchPlatformGrid_CellbyRowColNumber_Self(i,2).getText().trim().contains(data.getUpstreamFileSix()), true);
				SeleneseTestNgHelper.assertEquals(spf.get_SearchPlatformGrid_CellbyRowColNumber_Self(i,9).getText().trim(),data.getAdvanced_search_data_value());
				//System.out.println("<br />Advanced Search FileName - " +spf.get_SearchPlatformGrid_CellbyRowColNumber_Self(i,7).getText().trim());
				//System.out.println("<br />Advanced Search Institute - " +spf.get_SearchPlatformGrid_CellbyRowColNumber_Self(i,9).getText().trim());

			}
			System.out.println("Advanced Search Succeeded");
			Reporter.log("<br />Advanced Search Succeeded");
		}catch(Error e){
			System.out.println("Advanced Search Failed");
			Reporter.log("<br />Advanced Search Failed");
			testFailed=true;
		}
		secondSearch(data.getSecond_search_condition()); 
		Thread.sleep(1000);
		int TotalRow1=spf.get_SearchPlatformGrid_TotalRowNum_Self();
		try{
			SeleneseTestNgHelper.assertNotEquals(TotalRow1, 0);
			Reporter.log("<br />Second Search find Files!");
			for(int i=1;i<=TotalRow1;i++){
				SeleneseTestNgHelper.assertEquals(spf.get_SearchPlatformGrid_CellbyRowColNumber_Self(i,7).getText().trim().contains(data.getCommon_search_doctitle()),true);
				//System.out.println("<br />Second Search FileName - " +spf.get_SearchPlatformGrid_CellbyRowColNumber_Self(i,7).getText().trim());

			}
			System.out.println("Second Search Succeeded");
			Reporter.log("<br />Second Search Succeeded");
		}catch(Error e){
			System.out.println("Second Search Failed");
			Reporter.log("<br />Second Search Failed");
			testFailed=true;
		}
		saveAsMySearch(data.getSearchname());
		relogin=true;
	}
	//二次搜索
	public void secondSearch(String condition) throws Exception{				
		SearchPanePage spp = new SearchPanePage(driver);	
		Thread.sleep(1000);
		spp.secondSearchText_input(condition);
		Thread.sleep(1000);
		spp.secondSearchButton_click();
		Thread.sleep(1000);
	}


	//保存为我的搜索
	public void saveAsMySearch(String name) throws Exception{
		SearchPanePage spp = new SearchPanePage(driver);
		spp.saveSearchTemplateBtn_click();
		Thread.sleep(1000);
		SearchDialog dialog=new SearchDialog(driver);
		dialog.SearchDialogInput(name);
		Thread.sleep(1000);
		dialog.SearchDialogConfirm();
		PopupDialog popup=new PopupDialog(driver);
		try{
			SeleneseTestNgHelper.assertEquals(popup.get_ContentResult_self().getText().trim(), "保存成功！");
			System.out.println("Save Search Succeeded");
			Reporter.log("<br />Save Search Succeeded");
		}catch(Error e){
			System.out.println("Save Search Failed");
			Reporter.log("<br />Save Search Failed");
			testFailed=true;
		}
		popup.ConfirmButton_Click();
		Thread.sleep(1000);
	}

	@AfterClass
	public void tearDown() throws Exception {
		driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}

	@DataProvider(name = "TestData_ZHLY")
	public Object[][] addTestDataForZHLY() {
		return new Object[][] {
				{ (Test_Data_ZHLY)new XMLDataExtractor(new File("runtime/testdata/TestData_ZHLY.xml"),Test_Data_ZHLY.class).extractDataToObject()},
		};
	}
}
