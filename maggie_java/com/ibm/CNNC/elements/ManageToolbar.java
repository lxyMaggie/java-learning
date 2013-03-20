/**
 * 
 * �����ĵ����������Ϸ����ĵ���¼����Ȩ���ĵ��������ȹ������ĵ���*/
package com.ibm.CNNC.elements;

import java.util.List;

import org.openqa.selenium.*;

import com.selenium.utils.WebDriver;
import com.selenium.utils.WebElement;


public class ManageToolbar {
	protected WebDriver driver;
	
	private static final String CreateLable_XPath="//descendant::div[contains(@id,'dijit_layout_ContentPane')]//descendant::span[contains(@id,'DocumentCreate')]";
	private static final String UpgrateLable_XPath="//descendant::div[contains(@id,'dijit_layout_ContentPane')]//descendant::span[contains(@id,'DocumentUpdate')]";
	private static final String VersionAuthorizeLable_XPath="//descendant::div[contains(@id,'dijit_layout_ContentPane')]//descendant::span[contains(@id,'DocumentVersionsAuthorize')]";
	private static final String UpgradeLable_XPath="//descendant::div[contains(@id,'dijit_layout_ContentPane')]//descendant::span[contains(@id,'DocumentVersionUpgrade')]";
	private static final String DistributeLable_XPath="//descendant::div[contains(@id,'dijit_layout_ContentPane')]//descendant::span[contains(@id,'DocumentDistributionManage')]";
	private static final String PreArchiveLable_XPath="//descendant::div[contains(@id,'dijit_layout_ContentPane')]//descendant::span[contains(@id,'PreArchive')]";//constructor begin
	private static final String DocPropertyLable_XPath="//descendant::div[contains(@id,'dijit_layout_ContentPane')]//descendant::span[contains(@id,'DocumentDocProperty')]";
	private static final String FunctionPrintLable_XPath="//descendant::div[contains(@id,'dijit_layout_ContentPane')]//descendant::div[contains(@id,'FunctionPrint')]";
	private static final String FunctionPrintButton_XPath="//descendant::div[contains(@id,'dijit_layout_ContentPane')]//descendant::td[contains(@id,'FunctionPrint_arrow')]";
	private static final String DownloadLable_XPath="//descendant::div[contains(@id,'dijit_layout_ContentPane')]//descendant::div[contains(@id,'FunctionDownload')]";
	private static final String DownloadButton_XPath="//descendant::div[contains(@id,'dijit_layout_ContentPane')]//descendant::td[contains(@id,'FunctionDownload_arrow')]";
	private static final String ExportFileLable_XPath="//descendant::div[contains(@id,'dijit_layout_ContentPane')]//descendant::div[contains(@id,'FunctionSearchExport')]";
	private static final String ExportFileButton_XPath="//descendant::div[contains(@id,'dijit_layout_ContentPane')]//descendant::td[contains(@id,'FunctionSearchExport_arrow')]";
	private static final String MoreFunctionLable_XPath="//descendant::div[contains(@id,'dijit_layout_ContentPane')]//descendant::div[contains(@id,'MoreFunction')]";
	private static final String MoreFunctionButton_XPath="//descendant::div[contains(@id,'dijit_layout_ContentPane')]//descendant::td[contains(@id,'MoreFunction_arrow')]";
	private static final String ToggleSearchPaneBtnLable_XPath="//descendant::div[contains(@id,'dijit_layout_ContentPane')]//descendant::span[contains(@id,'ToggleSearchPaneBtn')]";
	private static final String FieldEditorTitleInput_XPath="//descendant::div[contains(@id,'dijit_layout_ContentPane')]//descendant::div[contains(@id,'dijit_form_field_TextField')]//descendant::span[normalize-space(text())='�ļ���������']/../../descendant::div[contains(@id,'ValidationTextBox')]//descendant::input[contains(@type,'text')]";
	private static final String DistributeFieldEditorTitleInput_XPath="//descendant::div[contains(@id,'dijit_layout_ContentPane')]//descendant::div[contains(@id,'dijit_form_field_TextField')]//descendant::span[normalize-space(text())='�ļ�����']/../../descendant::div[contains(@id,'ValidationTextBox')]//descendant::input[contains(@type,'text')]";
	private static final String SearchSubmitButton_XPath="//descendant::div[contains(@id,'dijit_layout_ContentPane')]//descendant::td[contains(@align,'center')]//descendant::span[contains(@id,'dijit_form_Button')][normalize-space(text())='"+"����"+"']";
	private static final String SearchSelectAllButton_XPath="//descendant::div[contains(@id,'dijit_layout_ContentPane')]//descendant::div[contains(@id,'DocumentSearch')]/descendant::span[contains(@id,'selectAll')]";
	
	private static final String FileStatementSelect_XPath="//descendant::div[contains(@id,'dijit_layout_ContentPane')]//descendant::div[contains(@id,'dijit_form_field_FilteringSelectField')]/descendant::span[normalize-space(text())='�ĵ�״̬']/../..";
	private static final String RecycleCloseLable_XPath="//descendant::div[contains(@id,'dijit_layout_ContentPane')]//descendant::span[contains(@id,'RecycleClose')]";
	private static final String DrawBackLable_XPath="//descendant::div[contains(@id,'dijit_layout_ContentPane')]//descendant::span[contains(@id,'DrawBack')]";
	private static final String DistributeRecordSelect_XPath="//descendant::div[contains(@id,'dijit_layout_ContentPane')]//descendant::div[contains(@id,'dijit_form_field_FilteringSelectField')]/descendant::span[normalize-space(text())='�ַ���¼״̬']/../../descendant::div[contains(@id,'widget_dijit_form_FilteringSelect')]";
	private static final String DistributeTypeSelect_XPath="//descendant::div[contains(@id,'dijit_layout_ContentPane')]//descendant::div[contains(@id,'dijit_form_field_FilteringSelectField')]/descendant::span[normalize-space(text())='�ַ�����']/../../descendant::div[contains(@id,'widget_dijit_form_FilteringSelect')]";
	private static final String ShowDocPropertyLable_XPath="//descendant::div[contains(@id,'dijit_layout_ContentPane')]//descendant::span[contains(@id,'ShowDocumentProperty')]";
	private static final String InnerSelect_XPath="//descendant::div[contains(@class,'dijitTabInner')]/descendant::span[normalize-space(text())='�����б�']/../..";
	private static final String RecycleSubmitLable_XPath="//descendant::div[contains(@id,'dijit_layout_ContentPane')]//descendant::span[contains(@id,'RecycleSubmit')]";
	private static final String RecycleReceiveLable_XPath="//descendant::div[contains(@id,'dijit_layout_ContentPane')]//descendant::span[contains(@id,'RecycleReceive')]";
	private static final String FastSearchInput_XPath="//descendant::div[contains(@id,'searchpane_Searchpane')]//descendant::div[contains(@id,'dijit_layout_ContentPane')]/descendant::div[contains(@id,'dijit_form_TextBox')]//descendant::input[contains(@type,'text')]";
	private static final String FastSearchSubmitButton_XPath="//descendant::div[contains(@id,'searchpane_Searchpane')]//descendant::div[contains(@id,'dijit_layout_ContentPane')]//descendant::span[contains(@id,'dijit_form_Button')][normalize-space(text())='"+"��������"+"']";
	private static final String VersionNumInput_XPath="//descendant::div[contains(@id,'dijit_TitlePane')]//descendant::div[contains(@id,'dijit_form_field_TextField')]//descendant::span[normalize-space(text())='�汾1']/../../descendant::div[contains(@id,'ValidationTextBox')]//descendant::input[contains(@type,'text')]";
	private static final String ReceiveVerifyConfirmLable_XPath="//descendant::div[contains(@id,'dijit_Toolbar')]//descendant::span[contains(@id,'DocumentReceiveVerifyConfirm')]";
	private static final String ReceiveVerifyConfirmButton_XPath="//descendant::div[contains(@id,'dijit_layout_ContentPane')]//descendant::span[contains(@id,'dijit_form_Button')]//descendant::span[normalize-space(text())='ȷ�Ͻ���']";
	private static final String CreateFileFieldInput_XPath="//descendant::div[contains(@id,'dijit_TitlePane')]//descendant::div[contains(@id,'dijit_form_field_TextField')]";
	private static final String InstituteSelect_XPath="//descendant::div[contains(@id,'dijit_TitlePane')]//descendant::div[contains(@id,'dijit_form_field_SearchField')]//descendant::span[normalize-space(text())='���Ƶ�λ']/../..";
	private static final String InstituteSelectButton_XPath="//descendant::div[contains(@class,'Dialog')]//descendant::div[contains(@class,'MainPane')]//descendant::span[contains(@class,'dijitButton')]//descendant::span[contains(@id,'dijit_form_Button')]//descendant::span[contains(@class,'toRightButton')]";
	private static final String InstituteRowSelect_XPath="//descendant::div[contains(@class,'Dialog')]//descendant::div[contains(@class,'MainPane')]//descendant::div[contains(@id,'dijit_layout_ContentPane')]//descendant::div[contains(@id,'TreeNode')]";
	private static final String InstituteConfirmButton_XPath="//descendant::div[contains(@class,'Dialog')]//descendant::div[contains(@class,'MainPane')]//descendant::div[contains(@id,'dijit_layout_ContentPane')]//descendant::span[contains(@id,'Button')]//descendant::span[normalize-space(text())='ȷ��']";
	private static final String CreateFileSubmit_XPath="//descendant::div[contains(@id,'dijit_layout_ContentPane')]//descendant::span[contains(@class,'dijitButton')]//descendant::span[contains(@id,'dijit_form_Button')]//descendant::span[normalize-space(text())='���沢�ر�']";
	private static final String FileTypeSelectButton_XPath="//descendant::div[contains(@id,'dijit_layout_ContentPane')]//descendant::div[contains(@id,'SearchField')]//descendant::span[normalize-space(text())='�ļ�����']/../..";
	private static final String FileTypeSelect_XPath="//descendant::div[contains(@id,'dijit_layout_ContentPane')]/descendant::div[contains(@id,'CommonTree')]/descendant::div[contains(@id,'dijit__TreeNode')]";	
	private static final String FileTypeConfirm_XPath="//descendant::div[contains(@id,'dijit_layout_ContentPane')]//descendant::span[contains(@class,'dijitButton')]//descendant::span[contains(@id,'OKButton')]";
	private static final String CategorySelect_XPath="//descendant::div[contains(@id,'dijit_layout_ContentPane')]/descendant::div[contains(@id,'SearchField')]/descendant::span[normalize-space(text())='���Ÿ��Է����ǩ']/../..";
	private static final String CategoryRowSelect_XPath="//descendant::div[contains(@class,'Dialog')]/descendant::div[contains(@id,'dijit_layout_ContentPane')]/descendant::div[contains(@id,'TreeNode')]";
	private static final String CategoryLableSelectButton_XPath="//descendant::div[contains(@class,'Dialog')]/descendant::div[contains(@id,'dijit_layout_ContentPane')]/descendant::span[contains(@id,'dijit_form_Button')]";

	public ManageToolbar(WebDriver driver){
		this.driver=driver;
	}
	//�ĵ���¼
	public void CreateLable_click(){
		WebElement Createlable=driver.findElement(By.xpath(CreateLable_XPath)).findVisibleElement(By.xpath(CreateLable_XPath));
		Createlable.click();
	}
	public WebElement get_CreateLable_Self(){
		return driver.findElement(By.xpath(CreateLable_XPath)).findVisibleElement(By.xpath(CreateLable_XPath));
	}
	//�ĵ��޸�
	public void UpgrateLable_click(){
		WebElement Upgratelable=driver.findElement(By.xpath(UpgrateLable_XPath)).findVisibleElement(By.xpath(UpgrateLable_XPath));
		Upgratelable.click();
	}
	public WebElement get_UpgrateLable_Self(){
		return driver.findElement(By.xpath(UpgrateLable_XPath)).findVisibleElement(By.xpath(UpgrateLable_XPath));
	}
	//�ĵ���Ȩ
	public void VersionAuthorizeLable_click(){
		WebElement VersionAuthorize=driver.findElement(By.xpath(VersionAuthorizeLable_XPath)).findVisibleElement(By.xpath(VersionAuthorizeLable_XPath));
		VersionAuthorize.click();
	}
	public WebElement get_VersionAuthorizeLable_Self(){
		return driver.findElement(By.xpath(VersionAuthorizeLable_XPath)).findVisibleElement(By.xpath(VersionAuthorizeLable_XPath));
	}
	//�ĵ�����
	public void UpgradeLable_click(){
		WebElement UpgradeLable=driver.findElement(By.xpath(UpgradeLable_XPath)).findVisibleElement(By.xpath(UpgradeLable_XPath));
		UpgradeLable.click();
	}
	public WebElement get_UpgradeLable_Self(){
		return driver.findElement(By.xpath(UpgradeLable_XPath)).findVisibleElement(By.xpath(UpgradeLable_XPath));
	}
	//�ĵ��ַ�
	public void DistributeLable_click(){
		WebElement DistributeLable=driver.findElement(By.xpath(DistributeLable_XPath)).findVisibleElement(By.xpath(DistributeLable_XPath));
		DistributeLable.click();
	}
	public WebElement get_DistributeLable_Self(){
		return driver.findElement(By.xpath(DistributeLable_XPath)).findVisibleElement(By.xpath(DistributeLable_XPath));
	}
	//Ԥ�鵵
	public void PreArchiveLable_click(){
		WebElement PreArchiveLable=driver.findElement(By.xpath(PreArchiveLable_XPath)).findVisibleElement(By.xpath(PreArchiveLable_XPath));
		PreArchiveLable.click();
	}
	public WebElement get_PreArchiveLable_Self(){
		return driver.findElement(By.xpath(PreArchiveLable_XPath)).findVisibleElement(By.xpath(PreArchiveLable_XPath));
	}
	//�ĵ�����
	public void DocPropertyLable_click(){
		WebElement DocPropertyLable=driver.findElement(By.xpath(DocPropertyLable_XPath)).findVisibleElement(By.xpath(DocPropertyLable_XPath));
		DocPropertyLable.click();
	}
	public WebElement get_DocPropertyLable_Self(){
		return driver.findElement(By.xpath(DocPropertyLable_XPath)).findVisibleElement(By.xpath(DocPropertyLable_XPath));
	}
	//��ӡ����ѡ������ˮӡ��ӡ
	public void FunctionPrintLableSelect_select(String selectStr){
		WebElement FunctionPrintLable=driver.findElement(By.xpath(FunctionPrintLable_XPath)).findVisibleElement(By.xpath(FunctionPrintLable_XPath));
		FunctionPrintLable.click();
		WebElement FunctionPrintButtonArrow =driver.findElement(By.xpath(FunctionPrintButton_XPath)).findVisibleElement(By.xpath(FunctionPrintButton_XPath));
		FunctionPrintButtonArrow.click();
		CommonClass.implicitWait(driver);
		WebElement mySelectItem=driver.findElement(By.xpath("//descendant::div[contains(@id,'FunctionPrint_dropdown')]/descendant::td[normalize-space(text())='"+selectStr+"']")).findVisibleElement(By.xpath("//descendant::div[contains(@id,'FunctionPrint_dropdown')]/descendant::td[normalize-space(text())='"+selectStr+"']"));
		mySelectItem.click();
	}
	public WebElement get_FunctionPrintLableSelect_self(String selectStr){
		WebElement FunctionPrintLable=driver.findElement(By.xpath(FunctionPrintLable_XPath)).findVisibleElement(By.xpath(FunctionPrintLable_XPath));
		FunctionPrintLable.click();
		WebElement FunctionPrintButtonArrow =driver.findElement(By.xpath(FunctionPrintButton_XPath)).findVisibleElement(By.xpath(FunctionPrintButton_XPath));
		FunctionPrintButtonArrow.click();
		CommonClass.implicitWait(driver);
		return driver.findElement(By.xpath("//descendant::div[contains(@id,'FunctionPrint_dropdown')]/descendant::td[normalize-space(text())='"+selectStr+"']")).findVisibleElement(By.xpath("//descendant::div[contains(@id,'FunctionPrint_dropdown')]/descendant::td[normalize-space(text())='"+selectStr+"']"));

	}
	//���أ���ѡ������ˮӡ����
	public void DownloadLableSelect_select(String selectStr){
		WebElement FunctionPrintLable=driver.findElement(By.xpath(FunctionPrintLable_XPath)).findVisibleElement(By.xpath(FunctionPrintLable_XPath));
		FunctionPrintLable.click();
		WebElement FunctionPrintButtonArrow =driver.findElement(By.xpath(DownloadButton_XPath)).findVisibleElement(By.xpath(DownloadButton_XPath));
		FunctionPrintButtonArrow.click();
		CommonClass.implicitWait(driver);
		WebElement mySelectItem=driver.findElement(By.xpath("//descendant::div[contains(@id,'FunctionDownload_dropdown')]/descendant::td[normalize-space(text())='"+selectStr+"']")).findVisibleElement(By.xpath("//descendant::div[contains(@id,'FunctionDownload_dropdown')]/descendant::td[normalize-space(text())='"+selectStr+"']"));
		mySelectItem.click();
	}
	public WebElement get_DownloadLableSelect_self(String selectStr){
		WebElement DownloadLable=driver.findElement(By.xpath(DownloadLable_XPath)).findVisibleElement(By.xpath(DownloadLable_XPath));
		DownloadLable.click();
		WebElement DownloadButtonArrow =driver.findElement(By.xpath(DownloadButton_XPath)).findVisibleElement(By.xpath(DownloadButton_XPath));
		DownloadButtonArrow.click();
		CommonClass.implicitWait(driver);
		return driver.findElement(By.xpath("//descendant::div[contains(@id,'FunctionDownload_dropdown')]/descendant::td[normalize-space(text())='"+selectStr+"']")).findVisibleElement(By.xpath("//descendant::div[contains(@id,'FunctionDownload_dropdown')]/descendant::td[normalize-space(text())='"+selectStr+"']"));

	}
	//�����ĵ�
	public void ExportFileLableSelect_select(String selectStr){
		WebElement ExportFileLable=driver.findElement(By.xpath(ExportFileLable_XPath)).findVisibleElement(By.xpath(ExportFileLable_XPath));
		ExportFileLable.click();
		WebElement ExportFileButtonArrow =driver.findElement(By.xpath(ExportFileButton_XPath)).findVisibleElement(By.xpath(ExportFileButton_XPath));
		ExportFileButtonArrow.click();
		CommonClass.implicitWait(driver);
		WebElement mySelectItem=driver.findElement(By.xpath("//descendant::div[contains(@id,'FunctionSearchExport_dropdown')]/descendant::td[normalize-space(text())='"+selectStr+"']")).findVisibleElement(By.xpath("//descendant::div[contains(@id,'FunctionSearchExport_dropdown')]/descendant::td[normalize-space(text())='"+selectStr+"']"));
		mySelectItem.click();
	}
	public WebElement get_ExportFileLableSelect_self(String selectStr){
		WebElement ExportFileLable=driver.findElement(By.xpath(ExportFileLable_XPath)).findVisibleElement(By.xpath(ExportFileLable_XPath));
		ExportFileLable.click();
		WebElement ExportFileButtonArrow =driver.findElement(By.xpath(ExportFileButton_XPath)).findVisibleElement(By.xpath(ExportFileButton_XPath));
		ExportFileButtonArrow.click();
		CommonClass.implicitWait(driver);
		return driver.findElement(By.xpath("//descendant::div[contains(@id,'FunctionSearchExport_dropdown')]/descendant::td[normalize-space(text())='"+selectStr+"']")).findVisibleElement(By.xpath("//descendant::div[contains(@id,'FunctionSearchExport_dropdown')]/descendant::td[normalize-space(text())='"+selectStr+"']"));
	}
	//���๦��
	public void MoreFunctionSelect_select(String selectStr){
		WebElement MoreFunctionLable=driver.findElement(By.xpath(MoreFunctionLable_XPath)).findVisibleElement(By.xpath(MoreFunctionLable_XPath));
		MoreFunctionLable.click();
		WebElement MoreFunctionButtonArrow =driver.findElement(By.xpath(MoreFunctionButton_XPath)).findVisibleElement(By.xpath(MoreFunctionButton_XPath));
		MoreFunctionButtonArrow.click();
		CommonClass.implicitWait(driver);
		WebElement mySelectItem=driver.findElement(By.xpath("//descendant::div[contains(@id,'MoreFunction_dropdown')]/descendant::td[normalize-space(text())='"+selectStr+"']")).findVisibleElement(By.xpath("//descendant::div[contains(@id,'MoreFunction_dropdown')]//descendant::td[normalize-space(text())='"+selectStr+"']"));
		mySelectItem.click();
	}
	public WebElement get_MoreFunctionLableSelect_self(String selectStr){
		WebElement MoreFunctionLable=driver.findElement(By.xpath(MoreFunctionLable_XPath)).findVisibleElement(By.xpath(MoreFunctionLable_XPath));
		MoreFunctionLable.click();
		WebElement MoreFunctionButtonArrow =driver.findElement(By.xpath(MoreFunctionButton_XPath)).findVisibleElement(By.xpath(MoreFunctionButton_XPath));
		MoreFunctionButtonArrow.click();
		CommonClass.implicitWait(driver);
		return driver.findElement(By.xpath("//descendant::div[contains(@id,'MoreFunction_dropdown')]//descendant::td[normalize-space(text())='"+selectStr+"']")).findVisibleElement(By.xpath("//descendant::div[contains(@id,'MoreFunction_dropdown')]//descendant::td[normalize-space(text())='"+selectStr+"']"));
	}
	//��ʾ�����أ�������������
	public void ToggleSearchPaneBtnLable_click(){
		WebElement ToggleSearchPaneBtnLable=driver.findElement(By.xpath(ToggleSearchPaneBtnLable_XPath)).findVisibleElement(By.xpath(ToggleSearchPaneBtnLable_XPath));
		if(ToggleSearchPaneBtnLable.getText().trim().equals("��ʾ��������")){
			ToggleSearchPaneBtnLable.click();
		}
	}
	public WebElement get_ToggleSearchPaneBtnLable_Self(){
		return driver.findElement(By.xpath(ToggleSearchPaneBtnLable_XPath)).findVisibleElement(By.xpath(ToggleSearchPaneBtnLable_XPath));
	}
	//�����������ļ���
	public void FieldEditorTitle_input(String inputStr){
		WebElement FieldEditorTitle=driver.findElement(By.xpath(FieldEditorTitleInput_XPath)).findVisibleElement(By.xpath(FieldEditorTitleInput_XPath));
		FieldEditorTitle.click();
		FieldEditorTitle.clear();
		FieldEditorTitle.sendKeys(inputStr);
	}
	public WebElement get_FieldEditorTitle_self(String inputStr){
		return driver.findElement(By.xpath(FieldEditorTitleInput_XPath)).findVisibleElement(By.xpath(FieldEditorTitleInput_XPath));
	}  
	//�����ļ������ַ�������
	public void DistributeFieldEditorTitle_input(String inputStr){
		WebElement FieldEditorTitle=driver.findElement(By.xpath(DistributeFieldEditorTitleInput_XPath)).findVisibleElement(By.xpath(DistributeFieldEditorTitleInput_XPath));
		FieldEditorTitle.click();
		FieldEditorTitle.clear();
		FieldEditorTitle.sendKeys(inputStr);
	}
	public WebElement get_DistributeFieldEditorTitle_self(String inputStr){
		return driver.findElement(By.xpath(DistributeFieldEditorTitleInput_XPath)).findVisibleElement(By.xpath(DistributeFieldEditorTitleInput_XPath));
	}

	//�������submit�ύ
	public void SearchSubmitLable_click(){
		WebElement SearchSubmitLable=driver.findElement(By.xpath(SearchSubmitButton_XPath)).findVisibleElement(By.xpath(SearchSubmitButton_XPath));
		SearchSubmitLable.click();
	}
	public WebElement get_SearchSubmitLable_Self(){
		return driver.findElement(By.xpath(SearchSubmitButton_XPath)).findVisibleElement(By.xpath(SearchSubmitButton_XPath));
	}
	//���ȫѡ
	public void SearchSelectAllLable_click(){
		WebElement SearchSubmitLable=driver.findElement(By.xpath(SearchSelectAllButton_XPath)).findVisibleElement(By.xpath(SearchSelectAllButton_XPath));
		SearchSubmitLable.click();
	}
	public WebElement get_SearchSelectAllLable_Self(){
		return driver.findElement(By.xpath(SearchSelectAllButton_XPath)).findVisibleElement(By.xpath(SearchSelectAllButton_XPath));
	}
	//�ĵ�״̬��ɾ���ȣ�
	public void FileStatementSelect_select(String selectStr){
		WebElement FileStatementSelect=driver.findElement(By.xpath(FileStatementSelect_XPath)).findVisibleElement(By.xpath(FileStatementSelect_XPath));
		FileStatementSelect.click();
		WebElement comboboxNameArrow =driver.findElement(By.xpath(FileStatementSelect_XPath+"/descendant::input[contains(@type,'text')]")).findVisibleElement(By.xpath(FileStatementSelect_XPath+"/descendant::input[contains(@type,'text')]"));
		comboboxNameArrow.click();
		CommonClass.implicitWait(driver);
		WebElement mySelectItem=driver.findElement(By.xpath("//descendant::div[contains(@id,'dropdown')][contains(@id,'FilteringSelect')]/descendant::div[normalize-space(text())='"+selectStr+"']")).findVisibleElement(By.xpath("//descendant::div[contains(@id,'dropdown')][contains(@id,'FilteringSelect')]/descendant::div[normalize-space(text())='"+selectStr+"']"));	
		mySelectItem.click();
	}
	public WebElement get_FileStatementSelect_input_Self(String selectStr){
		return driver.findElement(By.xpath("//descendant::div[contains(@id,'dropdown')][contains(@id,'FilteringSelect')]/descendant::div[normalize-space(text())='"+selectStr+"']")).findVisibleElement(By.xpath("//descendant::div[contains(@id,'dropdown')][contains(@id,'FilteringSelect')]/descendant::div[normalize-space(text())='"+selectStr+"']"));
	}
	/////////////////////////�ļ����մ�����////////////////////////////////////
	//���ܼ��
	public void ReceiveVerifyConfirmLable_click(){
		WebElement ReceiveVerifyConfirmlable=driver.findElement(By.xpath(ReceiveVerifyConfirmLable_XPath)).findVisibleElement(By.xpath(ReceiveVerifyConfirmLable_XPath));
		ReceiveVerifyConfirmlable.click();
	}
	public WebElement get_ReceiveVerifyConfirm_Self(){
		return driver.findElement(By.xpath(ReceiveVerifyConfirmLable_XPath)).findVisibleElement(By.xpath(ReceiveVerifyConfirmLable_XPath));
	}
	//ȷ�Ͻ���button
	public void ReceiveVerifyConfirmButton_click(){
		WebElement SearchSubmitLable=driver.findElement(By.xpath(ReceiveVerifyConfirmButton_XPath)).findVisibleElement(By.xpath(ReceiveVerifyConfirmButton_XPath));
		SearchSubmitLable.click();
	}
	public WebElement get_ReceiveVerifyConfirmButton_Self(){
		return driver.findElement(By.xpath(ReceiveVerifyConfirmButton_XPath)).findVisibleElement(By.xpath(ReceiveVerifyConfirmButton_XPath));
	}
	/////////////////////////�ĵ���¼����////////////////////////////////////
	//header���ļ�����ѡ�񣬲����ļ���¼
	public void FileTypeSelect_select(String selectStr){
		WebElement fileTypeSelect=driver.findElement(By.xpath(FileTypeSelectButton_XPath+"//descendant::div[contains(@id,'SearchTextBox')]")).findVisibleElement(By.xpath(FileTypeSelectButton_XPath+"//descendant::div[contains(@id,'SearchTextBox')]"));
		fileTypeSelect.click();
		WebElement comboboxNameArrow =driver.findElement(By.xpath(FileTypeSelectButton_XPath+"/descendant::input[contains(@class,'ArrowButton')]")).findVisibleElement(By.xpath(FileTypeSelectButton_XPath+"/descendant::input[contains(@class,'ArrowButton')]"));
		comboboxNameArrow.click();
		CommonClass.implicitWait(driver);
		WebElement mySelectItem=driver.findElement(By.xpath(FileTypeSelect_XPath+"/descendant::span[normalize-space(text())='"+selectStr+"']")).findVisibleElement(By.xpath(FileTypeSelect_XPath+"/descendant::span[normalize-space(text())='"+selectStr+"']"));
		mySelectItem.click();
		WebElement OKbutton=driver.findElement(By.xpath(FileTypeConfirm_XPath));//ȷ��button
		OKbutton.click();
	}
	public WebElement get_FileTypeSelect_selectItem_Self(String selectStr){
		WebElement fileTypeSelect=driver.findElement(By.xpath(FileTypeSelectButton_XPath+"//descendant::div[contains(@id,'SearchTextBox')]")).findVisibleElement(By.xpath(FileTypeSelectButton_XPath+"//descendant::div[contains(@id,'SearchTextBox')]"));
		fileTypeSelect.click();
		WebElement comboboxNameArrow =driver.findElement(By.xpath(FileTypeSelectButton_XPath+"/descendant::input[contains(@class,'ArrowButton')]")).findVisibleElement(By.xpath(FileTypeSelectButton_XPath+"/descendant::input[contains(@class,'ArrowButton')]"));
		comboboxNameArrow.click();
		CommonClass.implicitWait(driver);
		return driver.findElement(By.xpath(FileTypeSelect_XPath+"//descendant::span[normalize-space(text())='"+selectStr+"']")).findVisibleElement(By.xpath(FileTypeSelect_XPath+"//descendant::span[normalize-space(text())='"+selectStr+"']"));
	}
	//�����ļ����Է����ǩѡ��
	public void CategoryLableSelect_select(String selectStr){
		WebElement fileTypeSelect=driver.findElement(By.xpath(CategorySelect_XPath+"/descendant::div[contains(@id,'SearchTextBox')]")).findVisibleElement(By.xpath(CategorySelect_XPath+"/descendant::div[contains(@id,'SearchTextBox')]"));
		fileTypeSelect.click();
		WebElement comboboxNameArrow =driver.findElement(By.xpath(CategorySelect_XPath+"/descendant::input[contains(@class,'ArrowButton')]")).findVisibleElement(By.xpath(CategorySelect_XPath+"/descendant::input[contains(@class,'ArrowButton')]"));
		comboboxNameArrow.click();
		CommonClass.implicitWait(driver);
		WebElement mySelectItem=driver.findElement(By.xpath(CategoryRowSelect_XPath+"/descendant::span[normalize-space(text())='"+selectStr+"']")).findVisibleElement(By.xpath(CategoryRowSelect_XPath+"/descendant::span[normalize-space(text())='"+selectStr+"']"));
		mySelectItem.click();
		//List<WebElement> Gridrows=driver.findAll(By.xpath(CategoryLableSelectButton_XPath));
		//for (WebElement w : Gridrows)
		//{
		//	System.out.println(w.getText().trim());			
		//}
		WebElement Selectbutton=driver.findElement(By.xpath(CategoryLableSelectButton_XPath+"/descendant::span[normalize-space(text())='>']")).findVisibleElement(By.xpath(CategoryLableSelectButton_XPath+"/descendant::span[normalize-space(text())='>']"));
		Selectbutton.click();
		CommonClass.implicitWait(driver);
		WebElement OKbutton=driver.findElement(By.xpath(CategoryLableSelectButton_XPath+"/descendant::span[normalize-space(text())='ȷ��']")).findVisibleElement(By.xpath(CategoryLableSelectButton_XPath+"/descendant::span[normalize-space(text())='ȷ��']"));//ȷ��button
		OKbutton.click();
	}
	public WebElement get_CategoryLableSelect_self(String selectStr){
		WebElement fileTypeSelect=driver.findElement(By.xpath(CategorySelect_XPath+"//descendant::div[contains(@id,'SearchTextBox')]")).findVisibleElement(By.xpath(CategorySelect_XPath+"/descendant::div[contains(@id,'SearchTextBox')]"));
		fileTypeSelect.click();
		WebElement comboboxNameArrow =driver.findElement(By.xpath(CategorySelect_XPath+"/descendant::input[contains(@class,'ArrowButton')]")).findVisibleElement(By.xpath(CategorySelect_XPath+"/descendant::input[contains(@class,'ArrowButton')]"));
		comboboxNameArrow.click();
		CommonClass.implicitWait(driver);
		WebElement mySelectItem=driver.findElement(By.xpath(CategoryRowSelect_XPath+"/descendant::span[normalize-space(text())='"+selectStr+"']")).findVisibleElement(By.xpath(CategoryRowSelect_XPath+"/descendant::span[normalize-space(text())='"+selectStr+"']"));
		mySelectItem.click();
		return driver.findElement(By.xpath(CategoryLableSelectButton_XPath+"/descendant::span[normalize-space(text())='>']")).findVisibleElement(By.xpath(CategoryLableSelectButton_XPath+"/descendant::span[normalize-space(text())='>']"));

	}
	//�ļ������Ϣ����:�ļ�����
	public void CreateFilecodeField_input(String inputStr){
		WebElement FieldEditorTitle=driver.findElement(By.xpath(CreateFileFieldInput_XPath+"//descendant::span[normalize-space(text())='�ļ�����']/../../descendant::div[contains(@id,'ValidationTextBox')]//descendant::input[contains(@type,'text')]")).findVisibleElement(By.xpath(CreateFileFieldInput_XPath+"//descendant::span[normalize-space(text())='�ļ�����']/../../descendant::div[contains(@id,'ValidationTextBox')]//descendant::input[contains(@type,'text')]"));
		FieldEditorTitle.click();
		FieldEditorTitle.clear();
		FieldEditorTitle.sendKeys(inputStr);
	}
	public WebElement get_CreateFilecodeField_self(String inputStr){
		return driver.findElement(By.xpath(CreateFileFieldInput_XPath+"//descendant::span[normalize-space(text())='�ļ�����']/../../descendant::div[contains(@id,'ValidationTextBox')]//descendant::input[contains(@type,'text')]")).findVisibleElement(By.xpath(CreateFileFieldInput_XPath+"//descendant::span[normalize-space(text())='�ļ�����']/../../descendant::div[contains(@id,'ValidationTextBox')]//descendant::input[contains(@type,'text')]"));
	}
	//�ļ������Ϣ���룺�汾
	public void CreateFileeditionField_input(String inputStr){
		WebElement FieldEditorTitle=driver.findElement(By.xpath(CreateFileFieldInput_XPath+"//descendant::span[normalize-space(text())='�汾1']/../../descendant::div[contains(@id,'ValidationTextBox')]//descendant::input[contains(@type,'text')]")).findVisibleElement(By.xpath(CreateFileFieldInput_XPath+"//descendant::span[normalize-space(text())='�汾1']/../../descendant::div[contains(@id,'ValidationTextBox')]//descendant::input[contains(@type,'text')]"));
		FieldEditorTitle.click();
		FieldEditorTitle.clear();
		FieldEditorTitle.sendKeys(inputStr);
	}
	public WebElement get_CreateFileeditionField_self(String inputStr){
		return driver.findElement(By.xpath(CreateFileFieldInput_XPath+"//descendant::span[normalize-space(text())='�汾1']/../../descendant::div[contains(@id,'ValidationTextBox')]//descendant::input[contains(@type,'text')]")).findVisibleElement(By.xpath(CreateFileFieldInput_XPath+"//descendant::span[normalize-space(text())='�汾1']/../../descendant::div[contains(@id,'ValidationTextBox')]//descendant::input[contains(@type,'text')]"));
	}
	//�ļ������Ϣ���룺�ļ���������
	public void CreateFilenameField_input(String inputStr){
		WebElement FieldEditorTitle=driver.findElement(By.xpath(CreateFileFieldInput_XPath+"//descendant::span[normalize-space(text())='�ļ���������']/../../descendant::div[contains(@id,'ValidationTextBox')]//descendant::input[contains(@type,'text')]")).findVisibleElement(By.xpath(CreateFileFieldInput_XPath+"//descendant::span[normalize-space(text())='�ļ���������']/../../descendant::div[contains(@id,'ValidationTextBox')]//descendant::input[contains(@type,'text')]"));
		FieldEditorTitle.click();
		FieldEditorTitle.clear();
		FieldEditorTitle.sendKeys(inputStr);
	}
	public WebElement get_CreateFilenameField_self(String inputStr){
		return driver.findElement(By.xpath(CreateFileFieldInput_XPath+"//descendant::span[normalize-space(text())='�ļ���������']/../../descendant::div[contains(@id,'ValidationTextBox')]//descendant::input[contains(@type,'text')]")).findVisibleElement(By.xpath(CreateFileFieldInput_XPath+"//descendant::span[normalize-space(text())='�ļ���������']/../../descendant::div[contains(@id,'ValidationTextBox')]//descendant::input[contains(@type,'text')]"));
	}
	
	//���Ƶ�λѡ��,�����
	public void InstituteSelect_select(String selectStr){
		WebElement InstituteSelect=driver.findElement(By.xpath(InstituteSelect_XPath+"//descendant::div[contains(@id,'SearchTextBox')]")).findVisibleElement(By.xpath(InstituteSelect_XPath+"//descendant::div[contains(@id,'SearchTextBox')]"));
		InstituteSelect.click();
		WebElement comboboxNameArrow =driver.findElement(By.xpath(InstituteSelect_XPath+"/descendant::input[contains(@class,'ArrowButton')]")).findVisibleElement(By.xpath(InstituteSelect_XPath+"/descendant::input[contains(@class,'ArrowButton')]"));
		comboboxNameArrow.click();
		CommonClass.implicitWait(driver);
		WebElement mySelectItem=driver.findElement(By.xpath(InstituteRowSelect_XPath+"//descendant::span[normalize-space(text())='"+selectStr+"']")).findVisibleElement(By.xpath(InstituteRowSelect_XPath+"//descendant::span[normalize-space(text())='"+selectStr+"']"));
		mySelectItem.click();
		WebElement Selectbutton=driver.findElement(By.xpath(InstituteSelectButton_XPath)).findVisibleElement(By.xpath(InstituteSelectButton_XPath));
		Selectbutton.click();
		CommonClass.implicitWait(driver);
		WebElement OKbutton=driver.findElement(By.xpath(InstituteConfirmButton_XPath)).findVisibleElement(By.xpath(InstituteConfirmButton_XPath));//ȷ��button
		OKbutton.click();
	}
	public WebElement get_InstituteSelect_self(String selectStr){
		WebElement InstituteSelect=driver.findElement(By.xpath(InstituteSelect_XPath+"//descendant::div[contains(@id,'SearchTextBox')]")).findVisibleElement(By.xpath(InstituteSelect_XPath+"//descendant::div[contains(@id,'SearchTextBox')]"));
		InstituteSelect.click();
		WebElement comboboxNameArrow =driver.findElement(By.xpath(InstituteSelect_XPath+"/descendant::input[contains(@class,'ArrowButton')]")).findVisibleElement(By.xpath(InstituteSelect_XPath+"/descendant::input[contains(@class,'ArrowButton')]"));
		comboboxNameArrow.click();
		CommonClass.implicitWait(driver);
		WebElement mySelectItem=driver.findElement(By.xpath(InstituteRowSelect_XPath+"//descendant::span[normalize-space(text())='"+selectStr+"']")).findVisibleElement(By.xpath(InstituteRowSelect_XPath+"//descendant::span[normalize-space(text())='"+selectStr+"']"));
		mySelectItem.click();
		WebElement Selectbutton=driver.findElement(By.xpath(InstituteSelectButton_XPath)).findVisibleElement(By.xpath(InstituteSelectButton_XPath));
		Selectbutton.click();
		CommonClass.implicitWait(driver);
		WebElement OKbutton=driver.findElement(By.xpath(InstituteConfirmButton_XPath)).findVisibleElement(By.xpath(InstituteConfirmButton_XPath));//ȷ��button
		OKbutton.click();	
		return driver.findElement(By.xpath(InstituteSelect_XPath+"//descendant::div[contains(@class,'dijitInputField')]//descendant::input[contains(@value,'"+selectStr+"')]"));
	}
	//�ύ�����沢�ر�
	public void CreateFileSubmit_click(){
		WebElement CreateFileSubmitLable=driver.findElement(By.xpath(CreateFileSubmit_XPath)).findVisibleElement(By.xpath(CreateFileSubmit_XPath));
		CreateFileSubmitLable.click();
	}
	public WebElement get_CreateFileSubmitLable_Self(){
		return driver.findElement(By.xpath(CreateFileSubmit_XPath)).findVisibleElement(By.xpath(CreateFileSubmit_XPath));
	}


	/////////////////////////�ĵ���������//////////////////////////////////////
	//�汾��������
	public void VersionNum_input(String inputStr){
		WebElement VersionNum=driver.findElement(By.xpath(VersionNumInput_XPath)).findVisibleElement(By.xpath(VersionNumInput_XPath));
		VersionNum.click();
		VersionNum.clear();
		VersionNum.sendKeys(inputStr);
	}
	public WebElement get_VersionNum_self(String inputStr){
		return driver.findElement(By.xpath(VersionNumInput_XPath)).findVisibleElement(By.xpath(VersionNumInput_XPath));
	}

	/////////////////////////���ճ���//////////////////////////////////////////
	//�ر�
	public void RecycleCloseLable_click(){
		WebElement Createlable=driver.findElement(By.xpath(RecycleCloseLable_XPath)).findVisibleElement(By.xpath(RecycleCloseLable_XPath));
		Createlable.click();
	}
	public WebElement get_RecycleCloseLable_Self(){
		return driver.findElement(By.xpath(RecycleCloseLable_XPath)).findVisibleElement(By.xpath(RecycleCloseLable_XPath));
	}
	//�ύ
	public void RecycleSubmitLable_click(){
		WebElement Createlable=driver.findElement(By.xpath(RecycleSubmitLable_XPath)).findVisibleElement(By.xpath(RecycleSubmitLable_XPath));
		Createlable.click();
	}
	public WebElement get_RecycleSubmitLable_Self(){
		return driver.findElement(By.xpath(RecycleSubmitLable_XPath)).findVisibleElement(By.xpath(RecycleSubmitLable_XPath));
	}
	//����
	public void RecycleReceiveLable_click(){
		WebElement RecycleReceivelable=driver.findElement(By.xpath(RecycleReceiveLable_XPath)).findVisibleElement(By.xpath(RecycleReceiveLable_XPath));
		RecycleReceivelable.click();
	}
	public WebElement get_RecycleReceiveLable_Self(){
		return driver.findElement(By.xpath(RecycleReceiveLable_XPath)).findVisibleElement(By.xpath(RecycleReceiveLable_XPath));
	}
	//�ĵ�����
	public void ShowDocPropertyLable_click(){
		WebElement DocPropertyLable=driver.findElement(By.xpath(ShowDocPropertyLable_XPath)).findVisibleElement(By.xpath(ShowDocPropertyLable_XPath));
		DocPropertyLable.click();
	}
	public WebElement get_ShowDocPropertyLable_Self(){
		return driver.findElement(By.xpath(ShowDocPropertyLable_XPath)).findVisibleElement(By.xpath(ShowDocPropertyLable_XPath));
	}
	//�س�
	public void DrawBackLable_click(){
		WebElement Createlable=driver.findElement(By.xpath(DrawBackLable_XPath)).findVisibleElement(By.xpath(DrawBackLable_XPath));
		Createlable.click();
	}
	public WebElement get_DrawBackLable_Self(){
		return driver.findElement(By.xpath(DrawBackLable_XPath)).findVisibleElement(By.xpath(DrawBackLable_XPath));
	}
	//�ַ���¼״̬�������գ��ѷַ��ȣ�
	public void DistributeRecordSelect_select(String selectStr){
		//WebElement DistributeRecordSelect=driver.findElement(By.xpath(DistributeRecordSelect_XPath)).findVisibleElement(By.xpath(DistributeRecordSelect_XPath));
		//DistributeRecordSelect.click();
		WebElement comboboxNameArrow =driver.findElement(By.xpath(DistributeRecordSelect_XPath+"//descendant::input[contains(@class,'ArrowButton')]")).findVisibleElement(By.xpath(DistributeRecordSelect_XPath+"//descendant::input[contains(@class,'ArrowButton')]"));
		comboboxNameArrow.click();
		CommonClass.implicitWait(driver);
		WebElement mySelectItem=driver.findElement(By.xpath("//descendant::div[contains(@id,'dijit_form_FilteringSelect')]/descendant::div[normalize-space(text())='"+selectStr+"']")).findVisibleElement(By.xpath("//descendant::div[contains(@id,'dijit_form_FilteringSelect')]/descendant::div[normalize-space(text())='"+selectStr+"']"));	
		mySelectItem.click();
	}
	public WebElement get_DistributeRecordSelect_input_Self(String selectStr){
		WebElement comboboxNameArrow =driver.findElement(By.xpath(DistributeRecordSelect_XPath+"//descendant::input[contains(@class,'ArrowButton')]")).findVisibleElement(By.xpath(DistributeRecordSelect_XPath+"//descendant::input[contains(@class,'ArrowButton')]"));
		comboboxNameArrow.click();
		return driver.findElement(By.xpath("//descendant::div[contains(@id,'dijit_form_FilteringSelect')]/descendant::div[normalize-space(text())='"+selectStr+"']")).findVisibleElement(By.xpath("//descendant::div[contains(@id,'dijit_form_FilteringSelect')]/descendant::div[normalize-space(text())='"+selectStr+"']"));
	}
	//�ַ����ͣ����ӣ�ֽ�ʵȣ�
	public void DistributeTypeSelect_select(String selectStr){
		WebElement DistributeTypeSelect=driver.findElement(By.xpath(DistributeTypeSelect_XPath)).findVisibleElement(By.xpath(DistributeTypeSelect_XPath));
		DistributeTypeSelect.click();
		WebElement comboboxNameArrow =driver.findElement(By.xpath(DistributeTypeSelect_XPath+"/descendant::input[contains(@type,'text')]")).findVisibleElement(By.xpath(DistributeTypeSelect_XPath+"/descendant::input[contains(@type,'text')]"));
		comboboxNameArrow.click();
		CommonClass.implicitWait(driver);
		WebElement mySelectItem=driver.findElement(By.xpath("//descendant::div[contains(@id,'dijit_form_FilteringSelect')]/descendant::div[normalize-space(text())='"+selectStr+"']")).findVisibleElement(By.xpath("//descendant::div[contains(@id,'dijit_form_FilteringSelect')]/descendant::div[normalize-space(text())='"+selectStr+"']"));	
		mySelectItem.click();
	}
	public WebElement get_DistributeTypeSelect_input_Self(String selectStr){
		WebElement DistributeTypeSelect=driver.findElement(By.xpath(DistributeTypeSelect_XPath)).findVisibleElement(By.xpath(DistributeTypeSelect_XPath));
		DistributeTypeSelect.click();
		return driver.findElement(By.xpath("//descendant::div[contains(@id,'dijit_form_FilteringSelect')]/descendant::div[normalize-space(text())='"+selectStr+"']")).findVisibleElement(By.xpath("//descendant::div[contains(@id,'dijit_form_FilteringSelect')]/descendant::div[normalize-space(text())='"+selectStr+"']"));
	}
	//������������
	public void FastSearch_input(String inputStr){
		WebElement FieldEditorTitle=driver.findElement(By.xpath(FastSearchInput_XPath)).findVisibleElement(By.xpath(FastSearchInput_XPath));
		FieldEditorTitle.click();
		FieldEditorTitle.clear();
		FieldEditorTitle.sendKeys(inputStr);
	}
	public WebElement get_FastSearch_self(String inputStr){
		return driver.findElement(By.xpath(FastSearchInput_XPath)).findVisibleElement(By.xpath(FastSearchInput_XPath));
	}

	//������������ύ
	public void FastSearchSubmitLable_click(){
		WebElement SearchSubmitLable=driver.findElement(By.xpath(FastSearchSubmitButton_XPath)).findVisibleElement(By.xpath(FastSearchSubmitButton_XPath));
		SearchSubmitLable.click();
	}
	public WebElement get_FastSearchSubmitLable_Self(){
		return driver.findElement(By.xpath(FastSearchSubmitButton_XPath)).findVisibleElement(By.xpath(FastSearchSubmitButton_XPath));
	}
	//�����ϲ�ѡ��˵�
	public void InnerSelectLable_click(){
		WebElement InnerSelectlable=driver.findElement(By.xpath(InnerSelect_XPath)).findVisibleElement(By.xpath(InnerSelect_XPath));
		InnerSelectlable.click();
	}
	public WebElement get_InnerSelectLable_Self(){
		return driver.findElement(By.xpath(InnerSelect_XPath)).findVisibleElement(By.xpath(InnerSelect_XPath));
	}
}
