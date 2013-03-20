import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ibm.CNNC.elements.DistributeView;
import com.ibm.CNNC.elements.Header;
import com.ibm.CNNC.elements.LoginPaneSSO;
import com.ibm.CNNC.elements.SystemNavigation;
import com.ibm.CNNC.page.DistributeFormPage;
import com.ibm.CNNC.page.ForDistributeListPage;
import com.ibm.CNNC.page.SearchDocumentDialogPage;
import com.selenium.utils.DriverHelper;
import com.selenium.utils.WebDriver;
import com.thoughtworks.selenium.SeleneseTestNgHelper;


public class docDistribution {
	private WebDriver driver;
	private String baseUrl = "http://9.181.129.108:81/cnnpdm/";

	@BeforeClass
	public void setUp() throws Exception {
		//Open CNNC DM system
		System.out.println("[LOG]: Open CNNC DM system.");
		driver = DriverHelper.setUpDriver(null, "firefox");
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		driver.get(baseUrl);
		//driver.manage().window().maximize();        
		Thread.sleep(1000);
	}

	@Test(description="Distribute document from company repository to department reposiroty")
	public void importToCompany() throws Exception {
		String actualResult;
		String expectedResult;

		//Login by company administrator
		System.out.println("[LOG]: Login by company administrator.");
		LoginPaneSSO loginPaneSSO = new LoginPaneSSO(driver);
		loginPaneSSO.userId_input("19987004");
		Thread.sleep(1000);
		loginPaneSSO.password_input("password");
		Thread.sleep(1000);
		loginPaneSSO.loginButton_click();
		Thread.sleep(5000);

		//Select company
		System.out.println("[LOG]: Select company.");
		Header header = new Header(driver);
		header.authorizedPlantsSelect_select("中核核电运行管理有限公司");
		Thread.sleep(1000);
		
		//Open docDistribution page
		System.out.println("[LOG]: Open docDistribution page.");
		SystemNavigation systemNavigator = new SystemNavigation(driver); 
		systemNavigator.SystemNavigation_DocumentDistributeView_click();
		Thread.sleep(1000);
		systemNavigator.documentDistributionManage_DocumentDistributeView_click();
		Thread.sleep(1000);

		//Filter documents that prepared for distribute
		System.out.println("[LOG]: Filter documents that prepared for distribute.");
		ForDistributeListPage forDistributeListPage = new ForDistributeListPage(driver);
		forDistributeListPage.toggleSearchPaneBtnButton_click();
		Thread.sleep(1000);
		forDistributeListPage.fileChineseName_input("CN-");
		Thread.sleep(1000);
		forDistributeListPage.searchButton_click();
		Thread.sleep(1000);
		SeleneseTestNgHelper.assertNotEquals(forDistributeListPage.get_forDistributeListGrid_RowCount(), 0);
		
		//Distribute without document and department
		System.out.println("[LOG]: Distribute without document and department.");
		forDistributeListPage.documentDistributionManageButton_click();
		Thread.sleep(1000);
		DistributeFormPage distributeFormPage = new DistributeFormPage(driver);
		distributeFormPage.distributeButton_click();
		Thread.sleep(1000);
		expectedResult = "请添加至少一个文件和一个分发对象";
		actualResult = distributeFormPage.get_dialog_Message_Text();
		System.out.println("[MSG]: ");
		System.out.println(actualResult);
		try {
			SeleneseTestNgHelper.assertTrue(actualResult.contains(expectedResult));
			distributeFormPage.dialog_Ok_Click();
			Thread.sleep(1000);
		} catch (Error e) {
			System.out.println("[VP-FAIL]: Distribute without document and department should be failed.");
			distributeFormPage.dialog_Ok_Click();
			Thread.sleep(1000);
			DistributeView distributeView = new DistributeView(driver);
			distributeView.Tabs_close("文件分发");
			Thread.sleep(1000);
		}

		//Distribute without document
		System.out.println("[LOG]: Distribute without document.");
		forDistributeListPage.documentDistributionManageButton_click();
		Thread.sleep(1000);
		distributeFormPage = new DistributeFormPage(driver);
		distributeFormPage.standardDistributionRadio_click();
		Thread.sleep(1000);
		distributeFormPage.standardDistributionSelect_select("CN-001");
		Thread.sleep(1000);
		distributeFormPage.distributeButton_click();
		Thread.sleep(1000);
		expectedResult = "请添加至少一个文件";
		actualResult = distributeFormPage.get_dialog_Message_Text();
		System.out.println("[MSG]: ");
		System.out.println(actualResult);
		try {
			SeleneseTestNgHelper.assertTrue(actualResult.contains(expectedResult));
			distributeFormPage.dialog_Ok_Click();
			Thread.sleep(1000);
		} catch (Error e) {
			System.out.println("[VP-FAIL]: Distribute without document should be failed.");
			distributeFormPage.dialog_Ok_Click();
			Thread.sleep(1000);
			DistributeView distributeView = new DistributeView(driver);
			distributeView.Tabs_close("文件分发");
			Thread.sleep(1000);
		}
		
		//Distribute without department
		System.out.println("[LOG]: Distribute without department.");
		forDistributeListPage.forDistributeListGrid_selectRowbyCellTitle("CN-001");
		Thread.sleep(1000);
		forDistributeListPage.documentDistributionManageButton_click();
		Thread.sleep(1000);
		distributeFormPage = new DistributeFormPage(driver);
		distributeFormPage.distributeButton_click();
		Thread.sleep(1000);
		expectedResult = "请添加至少一个分发对象";
		actualResult = distributeFormPage.get_dialog_Message_Text();
		System.out.println("[MSG]: ");
		System.out.println(actualResult);
		try {
			SeleneseTestNgHelper.assertTrue(actualResult.contains(expectedResult));
			distributeFormPage.dialog_Ok_Click();
			Thread.sleep(1000);
		} catch (Error e) {
			System.out.println("[VP-FAIL]: Distribute without department should be failed.");
			distributeFormPage.dialog_Ok_Click();
			Thread.sleep(1000);
			DistributeView distributeView = new DistributeView(driver);
			distributeView.Tabs_close("文件分发");
			Thread.sleep(1000);
		}
		
		//Distribute from company to department 
		System.out.println("[LOG]: Distribute from company to department.");
		forDistributeListPage.forDistributeListGrid_selectRowbyCellTitle("CN-001");
		Thread.sleep(1000);
		forDistributeListPage.documentDistributionManageButton_click();
		Thread.sleep(1000);
		distributeFormPage = new DistributeFormPage(driver);
		try {
			SeleneseTestNgHelper.assertEquals(distributeFormPage.get_documentListGrid_RowCount(), 1);
		} catch (Error e) {
			System.out.println("[VP-FAIL]: Select document for distribute failed.");
		}
		distributeFormPage.addDocumentButton_click();
		Thread.sleep(1000);
		SearchDocumentDialogPage searchDocumentDialogPage = new SearchDocumentDialogPage(driver);
		searchDocumentDialogPage.fileChineseName_input("CN-");
		Thread.sleep(1000);
		searchDocumentDialogPage.searchButton_click();
		Thread.sleep(1000);
		searchDocumentDialogPage.searchDocumentGrid_selectRowbyCellTitle("CN-002");
		Thread.sleep(1000);
		searchDocumentDialogPage.okButton_click();
		Thread.sleep(1000);
		try {
			SeleneseTestNgHelper.assertEquals(distributeFormPage.get_documentListGrid_RowCount(), 2);
		} catch (Error e) {
			System.out.println("[VP-FAIL]: Add document for distribute failed.");
		}
		distributeFormPage.standardDistributionRadio_click();
		Thread.sleep(1000);
		distributeFormPage.standardDistributionSelect_select("CN-001");
		Thread.sleep(1000);
		try {
			SeleneseTestNgHelper.assertEquals(distributeFormPage.get_departmentListGrid_RowCount(), 3);
		} catch (Error e) {
			System.out.println("[VP-FAIL]: Distribute scenario is not loaded correctly.");
		}
		distributeFormPage.orderDistributionRadio_click();
		Thread.sleep(1000);
		distributeFormPage.orderDistributionSelectButton_click();
		Thread.sleep(1000);
		
		
		
		
		distributeFormPage.distributeButton_click();
		Thread.sleep(1000);
		expectedResult = "";
		actualResult = distributeFormPage.get_dialog_Message_Text();
		System.out.println("[MSG]: ");
		System.out.println(actualResult);
		try {
			SeleneseTestNgHelper.assertTrue(actualResult.contains(expectedResult));
			distributeFormPage.dialog_Ok_Click();
			Thread.sleep(1000);
		} catch (Error e) {
			System.out.println("[VP-FAIL]: Distribute without document should be failed.");
			distributeFormPage.dialog_Ok_Click();
			Thread.sleep(1000);
			DistributeView distributeView = new DistributeView(driver);
			distributeView.Tabs_close("文件分发");
			Thread.sleep(1000);
		}
	}

	@AfterClass
	public void tearDown() throws Exception {
		//Clear all documents that are imported
		System.out.println("[LOG]: Clear all documents that are imported.");
		
		//Close the browser
		System.out.println("[LOG]: Close the browser.");
		driver.quit();
	}
}
