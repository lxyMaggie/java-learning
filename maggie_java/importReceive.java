import static org.junit.Assert.fail;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.selenium.utils.DriverHelper;
import com.selenium.utils.WebDriver;

import com.thoughtworks.selenium.SeleneseTestNgHelper;

import com.ibm.CNNC.data.Test_Data_ZHLY;
import com.ibm.CNNC.data.XMLDataExtractor;
import com.ibm.CNNC.elements.DocManageView;
import com.ibm.CNNC.elements.Header;
import com.ibm.CNNC.elements.LoginPaneSSO;
import com.ibm.CNNC.elements.ManageToolbar;
import com.ibm.CNNC.elements.PopupDialog;
import com.ibm.CNNC.elements.SystemNavigation;
import com.ibm.CNNC.elements.UnifyReceiveView;

import com.ibm.CNNC.page.BatchImportPage;
import com.ibm.CNNC.page.DocReceivePage;
import com.ibm.CNNC.page.DocumentData;
import com.ibm.CNNC.page.ExportDetailsRecordSearchPage;
import com.ibm.CNNC.page.ExportRecordSearchPage;

public class importReceive {
	private WebDriver driver;
	public Boolean testFailed = false;
	public Boolean relogin = false;
	private StringBuffer verificationErrors = new StringBuffer();
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
	@Test(description="Import document to company repository and confirm",dataProvider = "TestData_ZHLY")
	public void importToCompany(Test_Data_ZHLY data) throws Exception {
		String actualResult;
		String expectedResult;
/*
		//Select company
		System.out.println("[LOG]: Select company.");
		Reporter.log("[LOG]: Select company.");
		Header header = new Header(driver);
		header.authorizedPlantsSelect_select(data.getCompany_select());
		Thread.sleep(1000);
		*/
		//Open importReceive page
		System.out.println("[LOG]: Open importReceive page.");
		Reporter.log("[LOG]: Open importReceive page.");
		SystemNavigation systemNavigator = new SystemNavigation(driver); 
		systemNavigator.SystemNavigation_UnifyReceiveView_click();
		Thread.sleep(1000);
		systemNavigator.importReceive_UnifyReceiveView_click();
		Thread.sleep(1000);
		
		//Import zip package
		System.out.println("[LOG]: Import zip package.");
		Reporter.log("[LOG]: Import zip package.");
		BatchImportPage batchImportPage = new BatchImportPage(driver);
		batchImportPage.typeselect_select(data.getImportpage_type());
		Thread.sleep(1000);
		batchImportPage.deptselect_select(data.getImportpage_dept());
		Thread.sleep(1000);
		batchImportPage.packageSelect(data.getImportpage_filepath());
		Thread.sleep(1000);
		batchImportPage.importButton_click();
		Thread.sleep(1000);
		batchImportPage.dialog_Yes_Click();
		Thread.sleep(1000);
		
		//Check import result
		System.out.println("[LOG]: Check import result.");
		Reporter.log("[LOG]: Check import result.");
		UnifyReceiveView unifyReceiveView = new UnifyReceiveView(driver);
		unifyReceiveView.ImportRecordTabs_click();
		Thread.sleep(1000);
		ExportRecordSearchPage exportRecordSearchPage = new ExportRecordSearchPage(driver);
		exportRecordSearchPage.fileName_input(data.getImport_filename());
		Thread.sleep(1000);
		exportRecordSearchPage.searchButton_click();
		Thread.sleep(1000);
		for (String s=exportRecordSearchPage.get_exportRecordGrid_CellbyRowColNumber_Self(1, 4).getText().trim(); s.equals("导入中"); s = exportRecordSearchPage.get_exportRecordGrid_CellbyRowColNumber_Self(1, 4).getText().trim()) {
			Thread.sleep(10000);
			exportRecordSearchPage.searchButton_click();
		}
		SeleneseTestNgHelper.assertEquals(exportRecordSearchPage.get_exportRecordGrid_CellbyRowColNumber_Self(1, 4).getText().trim(), "导入完成");

		//Check detailed import result
		System.out.println("[LOG]: Check detailed import result.");
		Reporter.log("[LOG]: Check detailed import result.");
		exportRecordSearchPage.exportRecordGrid_doubleClickRowbyRowNumber(1);
		Thread.sleep(1000);
		ExportDetailsRecordSearchPage exportDetailsRecordSearchPage = new ExportDetailsRecordSearchPage(driver);
		try {
			SeleneseTestNgHelper.assertEquals(exportDetailsRecordSearchPage.get_exportDetailsRecordGrid_NextCellByCellTitle("CN-001").getText().trim(), "Success");
		} catch (Error e) {
			System.out.println("[VP-FAIL]: CN-001 is not imported successfully as expected.");
		}
		try {
			SeleneseTestNgHelper.assertEquals(exportDetailsRecordSearchPage.get_exportDetailsRecordGrid_NextCellByCellTitle("CN-002").getText().trim(), "Success");
		} catch (Error e) {
			System.out.println("[VP-FAIL]: CN-002 is not imported successfully as expected.");
		}
		try {
			SeleneseTestNgHelper.assertEquals(exportDetailsRecordSearchPage.get_exportDetailsRecordGrid_NextCellByCellTitle("CN-003").getText().trim(), "Success");
		} catch (Error e) {
			System.out.println("[VP-FAIL]: CN-003 is not imported successfully as expected.");
		}
		try {
			SeleneseTestNgHelper.assertEquals(exportDetailsRecordSearchPage.get_exportDetailsRecordGrid_NextCellByCellTitle("CN-004-文件代码不合规范").getText().trim(), "Fail");
		} catch (Error e) {
			System.out.println("[VP-FAIL]: CN-004-文件代码不合规范  is not imported failed as expected.");
		}
		try {
			SeleneseTestNgHelper.assertEquals(exportDetailsRecordSearchPage.get_exportDetailsRecordGrid_NextCellByCellTitle("CN-004-必填项为空").getText().trim(), "Fail");
		} catch (Error e) {
			System.out.println("[VP-FAIL]: CN-004-必填项为空   is not imported failed as expected.");
		}
		try {
			SeleneseTestNgHelper.assertEquals(exportDetailsRecordSearchPage.get_exportDetailsRecordGrid_NextCellByCellTitle("CN-004-文件名错误").getText().trim(), "Fail");
		} catch (Error e) {
			System.out.println("[VP-FAIL]: CN-004-文件名错误  is not imported failed as expected.");
		}
		try {
			SeleneseTestNgHelper.assertEquals(exportDetailsRecordSearchPage.get_exportDetailsRecordGrid_NextCellByCellTitle("CN-005").getText().trim(), "Success");
		} catch (Error e) {
			System.out.println("[VP-FAIL]: CN-005 is not imported successfully as expected.");
		}
		try {
			SeleneseTestNgHelper.assertEquals(exportDetailsRecordSearchPage.get_exportDetailsRecordGrid_NextCellByCellTitle("CN-006").getText().trim(), "Success");
		} catch (Error e) {
			System.out.println("[VP-FAIL]: CN-006 is not imported successfully as expected.");
		}
		try {
			SeleneseTestNgHelper.assertEquals(exportDetailsRecordSearchPage.get_exportDetailsRecordGrid_NextCellByCellTitle("CN-007").getText().trim(), "Success");
		} catch (Error e) {
			System.out.println("[VP-FAIL]: CN-007 is not imported successfully as expected.");
		}
		try {
			SeleneseTestNgHelper.assertEquals(exportDetailsRecordSearchPage.get_exportDetailsRecordGrid_NextCellByCellTitle("CN-008").getText().trim(), "Success");
		} catch (Error e) {
			System.out.println("[VP-FAIL]: CN-008 is not imported successfully as expected.");
		}
		try {
			SeleneseTestNgHelper.assertEquals(exportDetailsRecordSearchPage.get_exportDetailsRecordGrid_NextCellByCellTitle("CN-009").getText().trim(), "Success");
		} catch (Error e) {
			System.out.println("[VP-FAIL]: CN-009 is not imported successfully as expected.");
		}
		try {
			SeleneseTestNgHelper.assertEquals(exportDetailsRecordSearchPage.get_exportDetailsRecordGrid_NextCellByCellTitle("CN-010").getText().trim(), "Success");
		} catch (Error e) {
			System.out.println("[VP-FAIL]: CN-010 is not imported successfully as expected.");
		}
		try {
			SeleneseTestNgHelper.assertEquals(exportDetailsRecordSearchPage.get_exportDetailsRecordGrid_NextCellByCellTitle("CN-011").getText().trim(), "Success");
		} catch (Error e) {
			System.out.println("[VP-FAIL]: CN-011 is not imported successfully as expected.");
		}
		try {
			SeleneseTestNgHelper.assertEquals(exportDetailsRecordSearchPage.get_exportDetailsRecordGrid_NextCellByCellTitle("CN-012").getText().trim(), "Success");
		} catch (Error e) {
			System.out.println("[VP-FAIL]: CN-012 is not imported successfully as expected.");
		}
		try {
			SeleneseTestNgHelper.assertEquals(exportDetailsRecordSearchPage.get_exportDetailsRecordGrid_NextCellByCellTitle("CN-013").getText().trim(), "Success");
		} catch (Error e) {
			System.out.println("[VP-FAIL]: CN-013 is not imported successfully as expected.");
		}
		try {
			SeleneseTestNgHelper.assertEquals(exportDetailsRecordSearchPage.get_exportDetailsRecordGrid_NextCellByCellTitle("CN-014").getText().trim(), "Success");
		} catch (Error e) {
			System.out.println("[VP-FAIL]: CN-014 is not imported successfully as expected.");
		}
		try {
			SeleneseTestNgHelper.assertEquals(exportDetailsRecordSearchPage.get_exportDetailsRecordGrid_NextCellByCellTitle("CN-015").getText().trim(), "Success");
		} catch (Error e) {
			System.out.println("[VP-FAIL]: CN-015 is not imported successfully as expected.");
		}
		
		//Open documentReceiveProcess page
		System.out.println("[LOG]: Open documentReceiveProcess page.");
		systemNavigator.documentReceiveProcess_UnifyReceiveView_click();
		Thread.sleep(1000);
		
		//Filter documents that just imported
		System.out.println("[LOG]: Filter documents that just imported.");
		DocReceivePage docReceivePage = new DocReceivePage(driver);
		docReceivePage.toggleSearchPaneBtnButton_click();
		Thread.sleep(1000);
		docReceivePage.fileChineseName_input("CN-");
		Thread.sleep(1000);
		docReceivePage.searchButton_click();
		Thread.sleep(1000);
		
		//Delete one document
		System.out.println("[LOG]: Delete one document.");
		
		docReceivePage.docReceiveGrid_selectRowbyCellTitle("CN-015");
		
		Thread.sleep(1000);
		docReceivePage.documentReceiveDeleteButton_click();
		Thread.sleep(1000);
		docReceivePage.dialog_Yes_Click();
		Thread.sleep(1000);
		expectedResult = "删除成功";
		actualResult = docReceivePage.get_dialog_Message_Text();
		System.out.println("[MSG]: ");
		System.out.println(actualResult);
		try {
			SeleneseTestNgHelper.assertTrue(actualResult.contains(expectedResult));
			docReceivePage.dialog_Ok_Click();
			Thread.sleep(1000);
		} catch (Error e) {
			System.out.println("[VP-FAIL]: CN-015 is deleted failed");
			docReceivePage.dialog_Ok_Click();
			Thread.sleep(1000);
		}
		
		//Confirm one document
		System.out.println("[LOG]: Confirm one document.");
		docReceivePage.docReceiveGrid_selectRowbyCellTitle("CN-001");
		Thread.sleep(1000);
		docReceivePage.documentReceiveVerifyConfirmButton_click();
		Thread.sleep(1000);
		DocumentData documentData = new DocumentData(driver);
		documentData.confirmReceiveButton_click();
		Thread.sleep(1000);
		expectedResult = "成功";
		actualResult = docReceivePage.get_dialog_Message_Text();
		System.out.println("[MSG]: ");
		System.out.println(actualResult);
		try {
			SeleneseTestNgHelper.assertTrue(actualResult.contains(expectedResult));
			docReceivePage.dialog_Ok_Click();
			Thread.sleep(1000);
		} catch (Error e) {
			System.out.println("[VP-FAIL]: CN-001 is confirmed failed.");
			docReceivePage.dialog_Ok_Click();
			Thread.sleep(1000);
			documentData.cancleReceiveButton_click();
			Thread.sleep(1000);
		}
		
		//Batch confirm all the other documents
		System.out.println("[LOG]: Batch confirm all the other documents.");
		docReceivePage.selectAllButton_click();
		Thread.sleep(1000);
		int expectedCount = docReceivePage.get_docReceiveGrid_RowCount();
		int actualCount = 0;
		docReceivePage.documentReceiveBatchConfirmButton_click();
		Thread.sleep(1000);
		expectedResult = "文件确认成功";
		actualResult = docReceivePage.get_dialog_Message_Text();
		System.out.println("[MSG]: ");
		System.out.println(actualResult);
		for (int i=actualResult.indexOf(expectedResult); i!=-1; i=actualResult.indexOf(expectedResult)) {
			actualCount++;
			actualResult=actualResult.substring(i+expectedResult.length());
		}
		try {
			SeleneseTestNgHelper.assertEquals(actualCount, expectedCount);
			docReceivePage.dialog_Ok_Click();
			Thread.sleep(1000);
		} catch (Error e) {
			System.out.println("[VP-FAIL]: " + expectedCount + " documents are selected, and " + actualCount + " of them are confirmed successfully.");
			docReceivePage.dialog_Ok_Click();
			Thread.sleep(1000);
		}
		//Clear Test Data
		System.out.println("[LOG]: Clear Test Data!");
		systemNavigator.SystemNavigation_UnifyReceiveView_click();
		systemNavigator.SystemNavigation_DocumentManageView_click();
		Thread.sleep(1000);
		systemNavigator.corparationSearch_DocumentManageView_click();
		ManageToolbar toolbar=new ManageToolbar(driver);
		Thread.sleep(1000);
		toolbar.ToggleSearchPaneBtnLable_click();
		Thread.sleep(1000);
		toolbar.FieldEditorTitle_input("CN-");
		Thread.sleep(1000);
		toolbar.SearchSubmitLable_click();
		Thread.sleep(1000);
		toolbar.SearchSelectAllLable_click();
		Thread.sleep(1000);
		toolbar.MoreFunctionSelect_select("文档删除");
		Thread.sleep(1000);
		PopupDialog popup=new PopupDialog(driver);
		popup.ConfirmYesButton_Click();
		Thread.sleep(1000);
		try{
			SeleneseTestNgHelper.assertEquals(popup.get_TitleResult_self().getText().trim(),"删除成功");
			System.out.println("[LOG]:Delete file in corporation Lib succeeded");
		}catch(Error e){
			System.out.println(popup.get_TitleResult_self().getText().trim());
			System.out.println("[LOG]:Deleting file failed");
		}
		popup.ConfirmButton_Click();
		Thread.sleep(1000);
		toolbar.FileStatementSelect_select("删除");
		Thread.sleep(1000);
		toolbar.SearchSubmitLable_click();
		Thread.sleep(1000);
		toolbar.SearchSelectAllLable_click();
		Thread.sleep(1000);
		toolbar.MoreFunctionSelect_select("彻底删除");
		Thread.sleep(1000);
		popup.ConfirmYesButton_Click();
		Thread.sleep(1000);
		try{
			SeleneseTestNgHelper.assertEquals(popup.get_TitleResult_self().getText().trim(),"物理删除成功");
			System.out.println("[LOG]:Delete file completely from corporation Lib succeeded");
		}catch(Error e){
			System.out.println(popup.get_TitleResult_self().getText().trim());
			System.out.println("[LOG]:Deleting completely files failed");
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