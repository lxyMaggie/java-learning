/**
 * Case�������̣�1)�ĵ���¼���ĵ�����--��˾�⣩2���ļ����� ���ļ����ܴ���--�����ļ���Ϣ����봦��
 *               3��ֽ���ļ��ַ����ļ��ַ�-�ļ��ַ���4�����ַ���λ�ļ����գ��ļ��ַ�--�����ļ��������Ͻ���
 *               5���ĵ����� ���ĵ�����--��˾�⣩6���汾��ʷ��ѯ���ĵ�����---��˾�⣩
 *               7��ԭ���ĵ��ύ���ļ��ַ�---�����ļ��������Ͻ���  8��ԭ���ĵ��رգ��ļ��ַ�--�ļ����գ� 
 *               9���ĵ�ɾ�����ĵ�����--��˾�⣩10���ĵ�����ɾ�����ĵ�����---��˾�⣩
 *               11���ĵ�ɾ�����ĵ�����-���ſ⣩
 **/
import static org.junit.Assert.fail;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ibm.CNNC.data.Test_Data_ZHLY;
import com.ibm.CNNC.data.XMLDataExtractor;
import com.ibm.CNNC.elements.ManageToolbar;
import com.ibm.CNNC.elements.DepartmentLibTreeNode;
import com.ibm.CNNC.elements.DocManageView;
import com.ibm.CNNC.elements.Header;
import com.ibm.CNNC.elements.LoginPaneSSO;
import com.ibm.CNNC.elements.PopupDialog;
import com.ibm.CNNC.elements.SystemNavigation;
import com.ibm.CNNC.page.DistributeFormPage;
import com.ibm.CNNC.page.ForDistributeListPage;
import com.ibm.CNNC.page.UpgradePage;
import com.ibm.CNNC.page.VersionHistoryRecordPage;
import com.selenium.utils.DriverHelper;
import com.selenium.utils.WebDriver;
import com.thoughtworks.selenium.SeleneseTestNgHelper;
public class DocManagement_Case {
	private WebDriver driver;
	private String baseUrl="http://9.181.129.108:81/cnnpdm";
	private StringBuffer verificationErrors = new StringBuffer();

	@BeforeClass
	public void setUp() throws Exception {
		//////////////Open the Main Page
		System.out.println("Open the Main Page.");
		driver = DriverHelper.setUpDriver(null, "firefox");
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);

	}
	@Test(description="Test the Document Management and Recycle Procedure",dataProvider = "TestData_ZHLY")
	public void DocManage(Test_Data_ZHLY data)throws Exception{
		/////////////Login into the System
		System.out.println("Login in the System.");
		driver.get(baseUrl);
		driver.manage().window().maximize();
		LoginPaneSSO Login = new LoginPaneSSO(driver);
		Login.userId_input("19986054");
		Thread.sleep(1000);
		Login.password_input("password");
		Thread.sleep(1000);
		Login.loginButton_click();
		Thread.sleep(1000);
		SystemNavigation SystemNavigator = new SystemNavigation(driver); 
		PopupDialog popup=new PopupDialog(driver);
		ManageToolbar toolbar=new ManageToolbar(driver);
		DepartmentLibTreeNode treeNode=new DepartmentLibTreeNode(driver);
		DocManageView ManageDoc=new DocManageView(driver);

		/////////////////Create Document in Corporation Lib for later usage
		System.out.println("Create Document in Corporation Lib");
		Date date=new Date();
		DateFormat sdf=new SimpleDateFormat("HHmmss");
		String Filecode="IBM-TEST-"+sdf.format(date);
		String Filename="���ղ���"+sdf.format(date);
		String Edition= "1";
		String UpgradeEdition="2";

		SystemNavigator.SystemNavigation_UnifyReceiveView_click();
		SystemNavigator.SystemNavigation_DocumentManageView_click();
		Thread.sleep(1000);
		SystemNavigator.corparationSearch_DocumentManageView_click();
		Thread.sleep(1000);
		treeNode.CommomTreeNode_Click(data.getFiletype());
		Thread.sleep(1000);
		toolbar.CreateLable_click();
		Thread.sleep(1000);
		toolbar.CreateFilecodeField_input(Filecode);
		Thread.sleep(1000);
		toolbar.CreateFileeditionField_input(Edition);
		Thread.sleep(1000);
		toolbar.CreateFilenameField_input(Filename);
		Thread.sleep(1000);
		toolbar.InstituteSelect_select(data.getInstitue());
		Thread.sleep(1000);
		toolbar.CreateFileSubmit_click();
		Thread.sleep(1000);
		try{
			SeleneseTestNgHelper.assertEquals(popup.get_ContentResult_self().getText().trim(),"��¼�ɹ���");
			System.out.println("Creating File in Corporation Lib Succeeded");
		}catch(Error e){
			System.out.println(popup.get_ContentResult_self().getText().trim());
			System.out.println("Creating File in Corporation Lib Failed");
		}
		popup.ConfirmButton_Click();
		Thread.sleep(1000);


		/////////////System Receive the created file
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
		ManageDoc.RowSelect_click(Filename);
		Thread.sleep(1000);
		toolbar.ReceiveVerifyConfirmLable_click();
		Thread.sleep(1000);
		toolbar.ReceiveVerifyConfirmButton_click();
		Thread.sleep(1000);
		try{
			SeleneseTestNgHelper.assertEquals(popup.get_ContentResult_self().getText().substring(13).trim(),"�ļ����ճɹ�");
			System.out.println("System Receiving Succeeded");
		}catch(Error e){
			System.out.println("System Receiving Failed!");
			System.out.println(popup.get_ContentResult_self().getText().trim());
		}
		popup.ConfirmButton_Click();
		Thread.sleep(1000);

		//////////////Corporation File Distribution and receiving
		System.out.println("Distribute Corporation File ");
		SystemNavigator.SystemNavigation_DocumentDistributeView_click();
		SystemNavigator.documentDistributionManage_DocumentDistributeView_click();
		Thread.sleep(1000);
		toolbar.ToggleSearchPaneBtnLable_click();
		Thread.sleep(1000);
		toolbar.FieldEditorTitle_input(Filename);
		Thread.sleep(1000);
		toolbar.SearchSubmitLable_click();
		Thread.sleep(1000);
		ManageDoc.RowSelect_click(Filename);
		Thread.sleep(1000);
		ForDistributeListPage forDistributeListPage = new ForDistributeListPage(driver);
		forDistributeListPage.documentDistributionManageButton_click();
		Thread.sleep(1000);
		DistributeFormPage distributeFormPage = new DistributeFormPage(driver);
		/*
		try {
			SeleneseTestNgHelper.assertEquals(distributeFormPage.get_documentListGrid_RowCount(), 1);
		} catch (Error e) {
			System.out.println("Select document for distribute failed.");
			System.out.println(distributeFormPage.get_documentListGrid_RowCount());
		}*/
		ManageDoc.RowDistributeSelect_click(Filename);
		Thread.sleep(1000);
		distributeFormPage.orderDistribution_click();
		Thread.sleep(1000);
		distributeFormPage.orderDistributionSelectButton_click();
		Thread.sleep(1000);
		distributeFormPage.DialogDepartmentSelect_click(data.getdepartment());
		Thread.sleep(1000);
		distributeFormPage.distributeButton_click();
		Thread.sleep(1000);
		try{
			SeleneseTestNgHelper.assertEquals(popup.get_ContentResult_self().getText().trim(),"�ַ������ɹ�");
			System.out.println("File Distribute Succeeded");
		}catch(Error e){
			System.out.println("File Distriution Failed!");
			System.out.println(popup.get_ContentResult_self().getText().trim());
		}
		popup.ConfirmButton_Click();
		Thread.sleep(1000);

		//////////////Department receive the distributed file
		System.out.println("Department Receive the Distributed File");
		SystemNavigator.departmentDocumentReceive_DocumentDistributeView_click();
		Thread.sleep(1000);
		toolbar.ToggleSearchPaneBtnLable_click();
		Thread.sleep(1000);
		toolbar.DistributeFieldEditorTitle_input(Filename);
		Thread.sleep(1000);
		toolbar.SearchSubmitLable_click();
		Thread.sleep(1000);
		ManageDoc.RowSelect_click(Filename);
		Thread.sleep(1000);
		toolbar.RecycleReceiveLable_click();
		Thread.sleep(1000);
		try{
			SeleneseTestNgHelper.assertEquals(popup.get_ContentResult_self().getText().trim(),"���ղ����ɹ�");
			System.out.println("Department File Receiving Succeeded");
		}catch(Error e){
			System.out.println("Department File Receiving Failed!");
			System.out.println(popup.get_ContentResult_self().getText().trim());
		}
		popup.ConfirmButton_Click();
		Thread.sleep(1000);

		//////////////Version Upgrade in Corporation Lib
		System.out.println("Version Upgrade for distributed files");
		SystemNavigator.SystemNavigation_UnifyReceiveView_click();
		SystemNavigator.SystemNavigation_DocumentManageView_click();
		Thread.sleep(1000);
		SystemNavigator.corparationSearch_DocumentManageView_click();
		Thread.sleep(1000);
		toolbar.ToggleSearchPaneBtnLable_click();
		Thread.sleep(1000);
		toolbar.FieldEditorTitle_input(Filename);
		Thread.sleep(1000);
		toolbar.SearchSubmitLable_click();
		Thread.sleep(1000);
		ManageDoc.RowSelect_click(Filename);
		Thread.sleep(1000);
		toolbar.UpgradeLable_click();
		Thread.sleep(1000);
		UpgradePage upgrade=new UpgradePage(driver);
		toolbar.VersionNum_input(UpgradeEdition);
		Thread.sleep(1000);
		toolbar.InstituteSelect_select(data.getInstitue());
		Thread.sleep(1000);
		upgrade.UpgradeButton_Click();
		Thread.sleep(1000);	
		try{
			SeleneseTestNgHelper.assertEquals(popup.get_TitleResult_self().getText().trim(),"����ɹ�");
			System.out.println("Version Upgrade Succeeded");
		}catch(Error e){
			System.out.println(popup.get_TitleResult_self().getText().trim());
			System.out.println("Version Upgrade Failed");
		}
		popup.ConfirmButton_Click();
		Thread.sleep(1000);


		/////////////System Check and Receive the upgraded file
		System.out.println("System Check and Receive upgraded file");
		SystemNavigator.SystemNavigation_UnifyReceiveView_click();
		SystemNavigator.documentReceiveProcess_UnifyReceiveView_click();
		Thread.sleep(1000);
		toolbar.ToggleSearchPaneBtnLable_click();
		Thread.sleep(1000);
		toolbar.FieldEditorTitle_input(Filename);
		Thread.sleep(1000);
		toolbar.SearchSubmitLable_click();
		Thread.sleep(1000);
		ManageDoc.RowSelect_click(Filename);
		Thread.sleep(1000);
		toolbar.ReceiveVerifyConfirmLable_click();
		Thread.sleep(1000);
		toolbar.ReceiveVerifyConfirmButton_click();
		Thread.sleep(1000);
		try{
			SeleneseTestNgHelper.assertEquals(popup.get_ContentResult_self().getText().substring(13).trim(),"�ļ�����ɹ�");
			System.out.println("System Receiving for Version Upgrade File Succeeded");
		}catch(Error e){
			System.out.println(popup.get_ContentResult_self().getText().trim());
			System.out.println("System Receiving for Version Upgrade File Failed");
		}
		popup.ConfirmButton_Click();
		Thread.sleep(1000);

		//////////Version History Check/////////////
		System.out.println("Version History Check");
		SystemNavigator.SystemNavigation_UnifyReceiveView_click();
		SystemNavigator.SystemNavigation_DocumentManageView_click();
		Thread.sleep(1000);
		SystemNavigator.corparationSearch_DocumentManageView_click();
		Thread.sleep(1000);
		toolbar.ToggleSearchPaneBtnLable_click();
		Thread.sleep(1000);
		toolbar.FieldEditorTitle_input(Filename);
		Thread.sleep(1000);
		toolbar.SearchSubmitLable_click();
		Thread.sleep(1000);
		ManageDoc.RowSelect_click(Filename);
		Thread.sleep(1000);
		toolbar.DocPropertyLable_click();
		Thread.sleep(1000);
		upgrade.VersionHistory_Click();
		Thread.sleep(1000);
		VersionHistoryRecordPage versionHistoryRecord=new VersionHistoryRecordPage(driver);
		try{
			SeleneseTestNgHelper.assertEquals(versionHistoryRecord.get_VersionHistoryRecordGrid_EditionCellbyStateCellText_Self("������").getText().trim(),Edition);
			SeleneseTestNgHelper.assertEquals(versionHistoryRecord.get_VersionHistoryRecordGrid_EditionCellbyStateCellText_Self("��Ч").getText().trim(),UpgradeEdition);
			System.out.println("Version History Check Correct");
		}catch(Error e){
			System.out.println("Version History Wrong");
			System.out.println(versionHistoryRecord.get_VersionHistoryRecordGrid_EditionCellbyStateCellText_Self("������").getText().trim());
			System.out.println(versionHistoryRecord.get_VersionHistoryRecordGrid_EditionCellbyStateCellText_Self("��Ч").getText().trim());
		}

		////////////Hand over paper-distributed, waiting for being recycled Files /////////////////
		System.out.println("Hand over the Department Files");
		SystemNavigator.SystemNavigation_DocumentDistributeView_click();
		SystemNavigator.departmentDocumentReceive_DocumentDistributeView_click();
		Thread.sleep(1000);
		toolbar.DistributeTypeSelect_select("ֽ�ʷַ�");
		toolbar.DistributeRecordSelect_select("������");
		Thread.sleep(1000);
		toolbar.SearchSubmitLable_click();
		Thread.sleep(1000);	
		ManageDoc.RowSelect_click(Filename);
		Thread.sleep(1000);	
		toolbar.RecycleSubmitLable_click();
		Thread.sleep(1000);
		try{
			SeleneseTestNgHelper.assertEquals(popup.get_ContentResult_self().getText().trim(),"�ύ�����ɹ�");
			System.out.println("Submit File Succeeded");
		}catch(Error e){
			System.out.println("Sumit File Failed!");
			System.out.println(popup.get_ContentResult_self().getText().trim());
		}
		popup.ConfirmButton_Click();
		Thread.sleep(1000);

		///////////////////Close the File that already submit///////////////////////////////
		System.out.println("Close the Submitted File");
		SystemNavigator.documentRecycle_DocumentDistributeView_click();
		Thread.sleep(1000);
		toolbar.DistributeRecordSelect_select("���ύ");
		toolbar.DistributeTypeSelect_select("ȫ��");
		Thread.sleep(1000);
		toolbar.SearchSubmitLable_click();
		Thread.sleep(1000);
		ManageDoc.RowSelect_click(Filename);
		Thread.sleep(1000);
		toolbar.RecycleCloseLable_click();
		Thread.sleep(1000);
		try{
			SeleneseTestNgHelper.assertEquals(popup.get_ContentResult_self().getText().trim(),"�رղ����ɹ�");
			System.out.println("Close File Succeed");
		}catch(Error e){
			System.out.println("Close file Failed!");
			System.out.println(popup.get_ContentResult_self().getText().trim());
		}
		popup.ConfirmButton_Click();
		Thread.sleep(1000);

		/////////////Delete Files in Corporation Lib Completely//////////////////////////////
		System.out.println("Delete file completely from corporation Lib");
		SystemNavigator.SystemNavigation_UnifyReceiveView_click();
		SystemNavigator.SystemNavigation_DocumentManageView_click();
		Thread.sleep(1000);
		SystemNavigator.corparationSearch_DocumentManageView_click();
		Thread.sleep(1000);
		toolbar.ToggleSearchPaneBtnLable_click();
		Thread.sleep(1000);
		toolbar.FieldEditorTitle_input(Filename);
		Thread.sleep(1000);
		toolbar.SearchSubmitLable_click();
		Thread.sleep(1000);
		ManageDoc.RowSelect_click(Filename);
		Thread.sleep(1000);
		toolbar.MoreFunctionSelect_select("�ĵ�ɾ��");
		Thread.sleep(1000);
		popup.ConfirmYesButton_Click();
		Thread.sleep(1000);
		try{
			SeleneseTestNgHelper.assertEquals(popup.get_TitleResult_self().getText().trim(),"ɾ���ɹ�");
			System.out.println("Delete file in corporation Lib succeeded");
		}catch(Error e){
			System.out.println(popup.get_TitleResult_self().getText().trim());
			System.out.println("Deleting file failed");
		}
		popup.ConfirmButton_Click();
		Thread.sleep(1000);
		toolbar.FileStatementSelect_select("ɾ��");
		Thread.sleep(1000);
		toolbar.SearchSubmitLable_click();
		Thread.sleep(1000);
		ManageDoc.RowSelect_click(Filename);
		Thread.sleep(1000);
		toolbar.MoreFunctionSelect_select("����ɾ��");
		Thread.sleep(1000);
		popup.ConfirmYesButton_Click();
		Thread.sleep(1000);
		try{
			SeleneseTestNgHelper.assertEquals(popup.get_TitleResult_self().getText().trim(),"����ɾ���ɹ�");
			System.out.println("Delete file completely from corporation Lib succeeded");
		}catch(Error e){
			System.out.println(popup.get_TitleResult_self().getText().trim());
			System.out.println("Deleting completely files failed");
		}
		popup.ConfirmButton_Click();
		Thread.sleep(1000);

		//////////////Create a department file at first
		System.out.println("Create Document in Department Lib");
		String DFilecode="D-IBM-TEST-"+sdf.format(date);
		String DFilename="D���ղ���"+sdf.format(date);
		String DEdition= "1";
		SystemNavigator.SystemNavigation_UnifyReceiveView_click();
		SystemNavigator.SystemNavigation_DocumentManageView_click();
		SystemNavigator.departmentLib_DocumentManageView_click();
		Thread.sleep(1000);
		treeNode.DepartmentTreeNode_Click(data.getdepartment());
		Thread.sleep(1000);
		toolbar.CreateLable_click();
		Thread.sleep(1000);
		toolbar.FileTypeSelect_select(data.getFiletype());
		Thread.sleep(1000);
		toolbar.CreateFilecodeField_input(DFilecode);
		Thread.sleep(1000);
		toolbar.CreateFileeditionField_input(DEdition);
		Thread.sleep(1000);
		toolbar.CategoryLableSelect_select(data.getCategory());
		Thread.sleep(1000);
		toolbar.CreateFilenameField_input(DFilename);
		Thread.sleep(1000);
		toolbar.CreateFileSubmit_click();
		Thread.sleep(1000);
		try{
			SeleneseTestNgHelper.assertEquals(popup.get_ContentResult_self().getText().trim(),"��¼�ɹ���");
			System.out.println("Creating File in Department Lib succeeded");
		}catch(Error e){
			System.out.println(popup.get_ContentResult_self().getText().trim());
			System.out.println("Creating File in Department Lib Failed");
		}
		popup.ConfirmButton_Click();
		Thread.sleep(1000);


		//////////////////////Delete File in Department Lib
		System.out.println("Delete file from department Lib");
		SystemNavigator.SystemNavigation_UnifyReceiveView_click();
		SystemNavigator.SystemNavigation_DocumentManageView_click();
		SystemNavigator.departmentLib_DocumentManageView_click();
		Thread.sleep(1000);
		treeNode.DepartmentTreeNode_Click(data.getdepartment());
		Thread.sleep(1000);
		toolbar.ToggleSearchPaneBtnLable_click();
		Thread.sleep(1000);
		toolbar.FieldEditorTitle_input(DFilename);
		Thread.sleep(1000);
		toolbar.SearchSubmitLable_click();
		Thread.sleep(1000);
		ManageDoc.RowSelect_click(DFilename);
		Thread.sleep(1000);
		toolbar.MoreFunctionSelect_select("�ĵ�ɾ��");
		Thread.sleep(1000);
		popup.ConfirmYesButton_Click();
		Thread.sleep(1000);
		try{
			SeleneseTestNgHelper.assertEquals(popup.get_TitleResult_self().getText().trim(),"����ɾ���ɹ�");
			System.out.println("Delete file succeeded");
			popup.ConfirmButton_Click();
		}catch(Error e){
			System.out.println("Deleting File in Department Lib Failed");
			popup.ConfirmYesButton_Click();
			Thread.sleep(1000);
			System.out.println(popup.get_TitleResult_self().getText().trim());
			popup.ConfirmButton_Click();//����ɾ�����ִ���
		}
	}


	@AfterClass
	public void tearDown() throws Exception {
		driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}

	private boolean isElementPresent(WebElement element) {
		try {
			if(element.isDisplayed())
				return true;
			else {
				return false;
			}
		} catch (NoSuchElementException e) {
			return false;
		}
	}
	@DataProvider(name = "TestData_ZHLY")
	public Object[][] addTestDataForZHLY() {
		return new Object[][] {
				{ (Test_Data_ZHLY)new XMLDataExtractor(new File("runtime/testdata/TestData_ZHLY.xml"),Test_Data_ZHLY.class).extractDataToObject()},
		};
	}
}

