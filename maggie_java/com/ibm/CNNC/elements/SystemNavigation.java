package com.ibm.CNNC.elements;

import org.openqa.selenium.*;
import com.selenium.utils.WebDriver;
import com.selenium.utils.WebElement;

/*catalog\widget\common\systemnavigation\templates\SystemNavigation.html*/
public class SystemNavigation {
	protected WebDriver driver;
	private static final String menuStatusSpan_XPath="//descendant::a";
	private static final String SystemNavigation_UnifyReceiveView_XPath="//descendant::a[contains(@id,' UnifyReceiveView')]";
	private static final String SystemNavigation_DocumentDistributeView_XPath="//descendant::a[contains(@id,' DocumentDistributeView')]";
	private static final String SystemNavigation_DocumentManageView_XPath="//descendant::a[contains(@id,' DocumentManageView')]";
	//private static final String SystemNavigation_DocumentManageView_XPath="//descendant::a[contains(@title,'文档管理')]";
	private static final String SystemNavigation_MaterialManageView_XPath="//descendant::a[contains(@id,' MaterialManageView')]";
	private static final String SystemNavigation_BorrowManageView_XPath="//descendant::a[contains(@id,' BorrowManageView')]";
	private static final String SystemNavigation_SearchUseView_XPath="//descendant::a[contains(@id,' SearchUseView')]";
	private static final String SystemNavigation_HeadquarterManageView_XPath="//descendant::a[contains(@id,' HeadquarterManageView')]";
	private static final String SystemNavigation_MaterialShareView_XPath="//descendant::a[contains(@id,' MaterialShareView')]";
	private static final String SystemNavigation_ConfigManageView_XPath="//descendant::a[contains(@id,' ConfigManageView')]";
	private static final String SystemNavigation_ReportView_XPath="//descendant::a[contains(@id,' ReportView')]";
	private static final String NoName22_XPath="//descendant::a";
	private static final String NoName23_XPath="//descendant::a";
	private static final String systemReceive_UnifyReceiveView_XPath="//descendant::a[contains(@id,'systemReceive UnifyReceiveView')]";
	private static final String eamInvalidDocSearch_UnifyReceiveView_XPath="//descendant::a[contains(@id,'eamInvalidDocSearch UnifyReceiveView')]";
	private static final String importReceive_UnifyReceiveView_XPath="//descendant::a[contains(@id,'importReceive UnifyReceiveView')]";
	private static final String receiveRecordSearch_UnifyReceiveView_XPath="//descendant::a[contains(@id,'receiveRecordSearch UnifyReceiveView')]";
	private static final String documentReceiveProcess_UnifyReceiveView_XPath="//descendant::a[contains(@id,'documentReceiveProcess UnifyReceiveView')]";
	private static final String archiveReceiveProcess_UnifyReceiveView_XPath="//descendant::a[contains(@id,'archiveReceiveProcess UnifyReceiveView')]";
	private static final String documentDistributionManage_DocumentDistributeView_XPath="//descendant::a[contains(@id,'documentDistributionManage DocumentDistributeView')]";
	private static final String eamDocumentDistribute_DocumentDistributeView_XPath="//descendant::a[contains(@id,'eamDocumentDistribute DocumentDistributeView')]";
	private static final String distributionFormManage_DocumentDistributeView_XPath="//descendant::a[contains(@id,'distributionFormManage DocumentDistributeView')]";
	private static final String distributeTicketDraft_DocumentDistributeView_XPath="//descendant::a[contains(@id,'distributeTicketDraft DocumentDistributeView')]";
	private static final String distributeTicketDistributed_DocumentDistributeView_XPath="//descendant::a[contains(@id,'distributeTicketDistributed DocumentDistributeView')]";
	private static final String distributeTicketClosed_DocumentDistributeView_XPath="//descendant::a[contains(@id,'distributeTicketClosed DocumentDistributeView')]";
	private static final String documentRecycle_DocumentDistributeView_XPath="//descendant::a[contains(@id,'documentRecycle DocumentDistributeView')]";
	private static final String departmentDocumentReceive_DocumentDistributeView_XPath="//descendant::a[contains(@id,'departmentDocumentReceive DocumentDistributeView')]";
	private static final String departmentDocumentDistribute_DocumentDistributeView_XPath="//descendant::a[contains(@id,'departmentDocumentDistribute DocumentDistributeView')]";
	private static final String deptDistribution_DocumentDistributeView_XPath="//descendant::a[contains(@id,'deptDistribution DocumentDistributeView')]";
	private static final String deptDistributionReceived_DocumentDistributeView_XPath="//descendant::a[contains(@id,'deptDistributionReceived DocumentDistributeView')]";
	private static final String distributionRecordSearch_DocumentDistributeView_XPath="//descendant::a[contains(@id,'distributionRecordSearch DocumentDistributeView')]";
	private static final String corparationSearch_DocumentManageView_XPath="//descendant::a[contains(@id,'corparationSearch DocumentManageView')]";
	//private static final String corparationSearch_DocumentManageView_XPath="//descendant::a[contains(@title,'公司库')]";
	private static final String preArchiveSearch_DocumentManageView_XPath="//descendant::a[contains(@id,'preArchiveSearch DocumentManageView')]";
	private static final String departmentLib_DocumentManageView_XPath="//descendant::a[contains(@id,'departmentLib DocumentManageView')]";
	private static final String departmentLibTagConfig_DocumentManageView_XPath="//descendant::a[contains(@id,'departmentLibTagConfig DocumentManageView')]";
	private static final String recordSearch_DocumentManageView_XPath="//descendant::a[contains(@id,'recordSearch DocumentManageView')]";
	private static final String nuclearFolderSearch_DocumentManageView_XPath="//descendant::a[contains(@id,'nuclearFolderSearch DocumentManageView')]";
	private static final String ActionPane_DocumentManageView_XPath="//descendant::a[contains(@id,' DocumentManageView')]";
	private static final String eamDocumentSearch_DocumentManageView_XPath="//descendant::a[contains(@id,'eamDocumentSearch DocumentManageView')]";
	private static final String documentExportManage_DocumentManageView_XPath="//descendant::a[contains(@id,'documentExportManage DocumentManageView')]";
	private static final String documentBatchUpdate_DocumentManageView_XPath="//descendant::a[contains(@id,'documentBatchUpdate DocumentManageView')]";
	private static final String materialSearch_MaterialManageView_XPath="//descendant::a[contains(@id,'materialSearch MaterialManageView')]";
	private static final String materialDistributeSearch_MaterialManageView_XPath="//descendant::a[contains(@id,'materialDistributeSearch MaterialManageView')]";
	private static final String ActionPane_MaterialManageView_XPath="//descendant::a[contains(@id,' MaterialManageView')]";
	private static final String materialExportManage_MaterialManageView_XPath="//descendant::a[contains(@id,'materialExportManage MaterialManageView')]";
	private static final String materialBatchUpdate_MaterialManageView_XPath="//descendant::a[contains(@id,'materialBatchUpdate MaterialManageView')]";
	private static final String lendRegister_BorrowManageView_XPath="//descendant::a[contains(@id,'lendRegister BorrowManageView')]";
	private static final String borrowApprove_BorrowManageView_XPath="//descendant::a[contains(@id,'borrowApprove BorrowManageView')]";
	private static final String bookManage_BorrowManageView_XPath="//descendant::a[contains(@id,'bookManage BorrowManageView')]";
	private static final String borrowHistory_BorrowManageView_XPath="//descendant::a[contains(@id,'borrowHistory BorrowManageView')]";
	private static final String companyDocumentLibrary_SearchUseView_XPath="//descendant::a[contains(@id,'companyDocumentLibrary SearchUseView')]";
	private static final String departmentDocumentLibrary_SearchUseView_XPath="//descendant::a[contains(@id,'departmentDocumentLibrary SearchUseView')]";
	private static final String materialLibrary_SearchUseView_XPath="//descendant::a[contains(@id,'materialLibrary SearchUseView')]";
	private static final String myNavigator_SearchUseView_XPath="//descendant::a[contains(@id,'myNavigator SearchUseView')]";
	private static final String mySearch_SearchUseView_XPath="//descendant::a[contains(@id,'mySearch SearchUseView')]";
	private static final String DocumentSubscribe_SearchUseView_XPath="//descendant::a[contains(@id,'DocumentSubscribe SearchUseView')]";
	private static final String subscribeSearch_SearchUseView_XPath="//descendant::a[contains(@id,'subscribeSearch SearchUseView')]";
	private static final String subscribeSearchMaterial_SearchUseView_XPath="//descendant::a[contains(@id,'subscribeSearchMaterial SearchUseView')]";
	private static final String subscribeTagConfig_SearchUseView_XPath="//descendant::a[contains(@id,'subscribeTagConfig SearchUseView')]";
	private static final String DocumentFavorite_SearchUseView_XPath="//descendant::a[contains(@id,'DocumentFavorite SearchUseView')]";
	private static final String documentFavourite_SearchUseView_XPath="//descendant::a[contains(@id,'documentFavourite SearchUseView')]";
	private static final String materialFavourite_SearchUseView_XPath="//descendant::a[contains(@id,'materialFavourite SearchUseView')]";
	private static final String ActionPane_Comment_SearchUseView_XPath="//descendant::a[contains(@id,'Comment SearchUseView')]";
	private static final String documentComment_SearchUseView_XPath="//descendant::a[contains(@id,'documentComment SearchUseView')]";
	private static final String materialComment_SearchUseView_XPath="//descendant::a[contains(@id,'materialComment SearchUseView')]";
	private static final String UserProfile_SearchUseView_XPath="//descendant::a[contains(@id,'UserProfile SearchUseView')]";
	private static final String myNavConfig_SearchUseView_XPath="//descendant::a[contains(@id,'myNavConfig SearchUseView')]";
	private static final String ActionPane_HeadquarterManageView_XPath="//descendant::a[contains(@id,' HeadquarterManageView')]";
	private static final String metadataStandard_HeadquarterManageView_XPath="//descendant::a[contains(@id,'metadataStandard HeadquarterManageView')]";
	private static final String classDefinitionStandard_HeadquarterManageView_XPath="//descendant::a[contains(@id,'classDefinitionStandard HeadquarterManageView')]";
	private static final String managementDomainStandard_HeadquarterManageView_XPath="//descendant::a[contains(@id,'managementDomainStandard HeadquarterManageView')]";
	private static final String organizationStandard_HeadquarterManageView_XPath="//descendant::a[contains(@id,'organizationStandard HeadquarterManageView')]";
	private static final String nuclearPlantStageStandard_HeadquarterManageView_XPath="//descendant::a[contains(@id,'nuclearPlantStageStandard HeadquarterManageView')]";
	private static final String standardRuleStructureManage_HeadquarterManageView_XPath="//descendant::a[contains(@id,'standardRuleStructureManage HeadquarterManageView')]";
	private static final String standardRuleDistributeApply_HeadquarterManageView_XPath="//descendant::a[contains(@id,'standardRuleDistributeApply HeadquarterManageView')]";
	private static final String ruleDistributeFormManage_HeadquarterManageView_XPath="//descendant::a[contains(@id,'ruleDistributeFormManage HeadquarterManageView')]";
	private static final String standardRuleDistributeRecordQuery_HeadquarterManageView_XPath="//descendant::a[contains(@id,'standardRuleDistributeRecordQuery HeadquarterManageView')]";
	private static final String standardRuleReceiveQuery_HeadquarterManageView_XPath="//descendant::a[contains(@id,'standardRuleReceiveQuery HeadquarterManageView')]";
	private static final String SharedMaterialSubmit_MaterialShareView_XPath="//descendant::a[contains(@id,'SharedMaterialSubmit MaterialShareView')]";
	private static final String MaterialShareApplyRecord_MaterialShareView_XPath="//descendant::a[contains(@id,'MaterialShareApplyRecord MaterialShareView')]";
	private static final String SharedMaterialManage_MaterialShareView_XPath="//descendant::a[contains(@id,'SharedMaterialManage MaterialShareView')]";
	private static final String SharedMaterialSearch_MaterialShareView_XPath="//descendant::a[contains(@id,'SharedMaterialSearch MaterialShareView')]";
	private static final String systemReceiveConfig_ConfigManageView_XPath="//descendant::a[contains(@id,'systemReceiveConfig ConfigManageView')]";
	private static final String documentMetedataConfig_ConfigManageView_XPath="//descendant::a[contains(@id,'documentMetedataConfig ConfigManageView')]";
	private static final String materialMetedataConfig_ConfigManageView_XPath="//descendant::a[contains(@id,'materialMetedataConfig ConfigManageView')]";
	private static final String documentClassDefinitionConfig_ConfigManageView_XPath="//descendant::a[contains(@id,'documentClassDefinitionConfig ConfigManageView')]";
	private static final String materialClassDefinitionConfig_ConfigManageView_XPath="//descendant::a[contains(@id,'materialClassDefinitionConfig ConfigManageView')]";
	private static final String nuclearFolderConfig_ConfigManageView_XPath="//descendant::a[contains(@id,'nuclearFolderConfig ConfigManageView')]";
	private static final String ActionPane_ConfigManageView_XPath="//descendant::a[contains(@id,' ConfigManageView')]";
	private static final String documentClassAuthorize_ConfigManageView_XPath="//descendant::a[contains(@id,'documentClassAuthorize ConfigManageView')]";
	private static final String materialClassAuthorize_ConfigManageView_XPath="//descendant::a[contains(@id,'materialClassAuthorize ConfigManageView')]";
	private static final String importDocumentTemplateConfig_ConfigManageView_XPath="//descendant::a[contains(@id,'importDocumentTemplateConfig ConfigManageView')]";
	private static final String importMaterialTemplateConfig_ConfigManageView_XPath="//descendant::a[contains(@id,'importMaterialTemplateConfig ConfigManageView')]";
	private static final String documentViewConfig_ConfigManageView_XPath="//descendant::a[contains(@id,'documentViewConfig ConfigManageView')]";
	private static final String materialViewConfig_ConfigManageView_XPath="//descendant::a[contains(@id,'materialViewConfig ConfigManageView')]";
	private static final String nuclearFolderViewConfig_ConfigManageView_XPath="//descendant::a[contains(@id,'nuclearFolderViewConfig ConfigManageView')]";
	private static final String standardDistributionSchemaConfig_ConfigManageView_XPath="//descendant::a[contains(@id,'standardDistributionSchemaConfig ConfigManageView')]";
	private static final String documentTagConfig_ConfigManageView_XPath="//descendant::a[contains(@id,'documentTagConfig ConfigManageView')]";
	private static final String subjectTermConfig_ConfigManageView_XPath="//descendant::a[contains(@id,'subjectTermConfig ConfigManageView')]";
	private static final String documentVersionRuleConfig_ConfigManageView_XPath="//descendant::a[contains(@id,'documentVersionRuleConfig ConfigManageView')]";
	private static final String documentRelationshipRuleConfig_ConfigManageView_XPath="//descendant::a[contains(@id,'documentRelationshipRuleConfig ConfigManageView')]";
	private static final String classLinkRuleConfig_ConfigManageView_XPath="//descendant::a[contains(@id,'classLinkRuleConfig ConfigManageView')]";
	private static final String recordCodeRuleConfig_ConfigManageView_XPath="//descendant::a[contains(@id,'recordCodeRuleConfig ConfigManageView')]";
	private static final String archiveCodeRuleConfig_ConfigManageView_XPath="//descendant::a[contains(@id,'archiveCodeRuleConfig ConfigManageView')]";
	private static final String nuclearFolderCodeRuleConfig_ConfigManageView_XPath="//descendant::a[contains(@id,'nuclearFolderCodeRuleConfig ConfigManageView')]";
	private static final String distributionFormCodeRuleConfig_ConfigManageView_XPath="//descendant::a[contains(@id,'distributionFormCodeRuleConfig ConfigManageView')]";
	private static final String archiveAppraisalConfig_ConfigManageView_XPath="//descendant::a[contains(@id,'archiveAppraisalConfig ConfigManageView')]";
	private static final String scheduleJobConfig_ConfigManageView_XPath="//descendant::a[contains(@id,'scheduleJobConfig ConfigManageView')]";
	private static final String searchJobErrorLog_ConfigManageView_XPath="//descendant::a[contains(@id,'searchJobErrorLog ConfigManageView')]";
	private static final String documentManageStatistic_ReportView_XPath="//descendant::a[contains(@id,'documentManageStatistic ReportView')]";
	private static final String storeInfomationStatistic_ReportView_XPath="//descendant::a[contains(@id,'storeInfomationStatistic ReportView')]";
	private static final String bUPaperDocumentControlStatusStatistic_ReportView_XPath="//descendant::a[contains(@id,'bUPaperDocumentControlStatusStatistic ReportView')]";
	private static final String monthLossRepairArchiveStatusStatistic_ReportView_XPath="//descendant::a[contains(@id,'monthLossRepairArchiveStatusStatistic ReportView')]";
	private static final String newArchiveStatistic_ReportView_XPath="//descendant::a[contains(@id,'newArchiveStatistic ReportView')]";
	private static final String bussinessProcessManageStatistic_ReportView_XPath="//descendant::a[contains(@id,'bussinessProcessManageStatistic ReportView')]";
	private static final String stuffFinishedWorkflowStatistic_ReportView_XPath="//descendant::a[contains(@id,'stuffFinishedWorkflowStatistic ReportView')]";
	private static final String stuffTaskNumberStatistic_ReportView_XPath="//descendant::a[contains(@id,'stuffTaskNumberStatistic ReportView')]";
	private static final String departmentFinishedTaskStatistic_ReportView_XPath="//descendant::a[contains(@id,'departmentFinishedTaskStatistic ReportView')]";
	private static final String taskInTimeRateStatistic_ReportView_XPath="//descendant::a[contains(@id,'taskInTimeRateStatistic ReportView')]";
	private static final String currentWorkflowAccountStatistic_ReportView_XPath="//descendant::a[contains(@id,'currentWorkflowAccountStatistic ReportView')]";
	private static final String monthlyWorkflowAccountCompare_ReportView_XPath="//descendant::a[contains(@id,'monthlyWorkflowAccountCompare ReportView')]";
	private static final String monthlyAverageHandleTime_ReportView_XPath="//descendant::a[contains(@id,'monthlyAverageHandleTime ReportView')]";
	private static final String documentDistributeStatistic_ReportView_XPath="//descendant::a[contains(@id,'documentDistributeStatistic ReportView')]";
	private static final String monthlyDocumentDistributeStatistic_ReportView_XPath="//descendant::a[contains(@id,'monthlyDocumentDistributeStatistic ReportView')]";
	private static final String documentReceiveStatistic_ReportView_XPath="//descendant::a[contains(@id,'documentReceiveStatistic ReportView')]";
	private static final String materialManageStatistic_ReportView_XPath="//descendant::a[contains(@id,'materialManageStatistic ReportView')]";
	private static final String monthlyNewMaterialStatistic_ReportView_XPath="//descendant::a[contains(@id,'monthlyNewMaterialStatistic ReportView')]";
	private static final String borrowManageStatistic_ReportView_XPath="//descendant::a[contains(@id,'borrowManageStatistic ReportView')]";
	private static final String monthLyDocumentBorrowStatistic_ReportView_XPath="//descendant::a[contains(@id,'monthLyDocumentBorrowStatistic ReportView')]";
	private static final String searchUseStatistic_ReportView_XPath="//descendant::a[contains(@id,'searchUseStatistic ReportView')]";
	private static final String documentClassUseStatistic_ReportView_XPath="//descendant::a[contains(@id,'documentClassUseStatistic ReportView')]";
	private static final String documentBorrowRankStatistic_ReportView_XPath="//descendant::a[contains(@id,'documentBorrowRankStatistic ReportView')]";
	private static final String materialBorrowRankStatistic_ReportView_XPath="//descendant::a[contains(@id,'materialBorrowRankStatistic ReportView')]";
	private static final String documentDownloadRankStatistic_ReportView_XPath="//descendant::a[contains(@id,'documentDownloadRankStatistic ReportView')]";
	private static final String statisticOthers_ReportView_XPath="//descendant::a[contains(@id,'statisticOthers ReportView')]";
	private static final String archiveRoomBaseSituationAnnals_ReportView_XPath="//descendant::a[contains(@id,'archiveRoomBaseSituationAnnals ReportView')]";
	private static final String statisticList_ReportView_XPath="//descendant::a[contains(@id,'statisticList ReportView')]";
	private static final String manageProgramList_ReportView_XPath="//descendant::a[contains(@id,'manageProgramList ReportView')]";
	private static final String adminDispatchQueryList_ReportView_XPath="//descendant::a[contains(@id,'adminDispatchQueryList ReportView')]";
	private static final String adminReceiveQueryList_ReportView_XPath="//descendant::a[contains(@id,'adminReceiveQueryList ReportView')]";
	private static final String letterDispatchReplyReport_ReportView_XPath="//descendant::a[contains(@id,'letterDispatchReplyReport ReportView')]";
	private static final String letterReceiveReport_ReportView_XPath="//descendant::a[contains(@id,'letterReceiveReport ReportView')]";
	private static final String preUpgradeDocumentQueryList_ReportView_XPath="//descendant::a[contains(@id,'preUpgradeDocumentQueryList ReportView')]";
	private static final String overdueArchiveQueryList_ReportView_XPath="//descendant::a[contains(@id,'overdueArchiveQueryList ReportView')]";
	private static final String overdueMaterialQueryList_ReportView_XPath="//descendant::a[contains(@id,'overdueMaterialQueryList ReportView')]";
	private static final String documentDistributeRecordList_ReportView_XPath="//descendant::a[contains(@id,'documentDistributeRecordList ReportView')]";
	private static final String documentReceiveRecordList_ReportView_XPath="//descendant::a[contains(@id,'documentReceiveRecordList ReportView')]";
	private static final String paperDocumentControlList_ReportView_XPath="//descendant::a[contains(@id,'paperDocumentControlList ReportView')]";

	//----Constructor Methods Begin----
	public SystemNavigation(WebDriver driver){
		this.driver=driver;
	}

	/**/
	public void menuStatusSpan_click(){
		WebElement menuStatusSpan = driver.findElement(By.xpath(menuStatusSpan_XPath)).findVisibleElement(By.xpath(menuStatusSpan_XPath));
		menuStatusSpan.click();
	}

	/**/
	public WebElement get_menuStatusSpan_Self(){
		return driver.findElement(By.xpath(menuStatusSpan_XPath)).findVisibleElement(By.xpath(menuStatusSpan_XPath));
	}

	/**/
	public void SystemNavigation_UnifyReceiveView_click(){
		WebElement SystemNavigation_UnifyReceiveView = driver.findElement(By.xpath(SystemNavigation_UnifyReceiveView_XPath)).findVisibleElement(By.xpath(SystemNavigation_UnifyReceiveView_XPath));
		SystemNavigation_UnifyReceiveView.click();
	}

	/**/
	public WebElement get_SystemNavigation_UnifyReceiveView_Self(){
		return driver.findElement(By.xpath(SystemNavigation_UnifyReceiveView_XPath)).findVisibleElement(By.xpath(SystemNavigation_UnifyReceiveView_XPath));
	}

	/**/
	public void SystemNavigation_DocumentDistributeView_click(){
		WebElement SystemNavigation_DocumentDistributeView = driver.findElement(By.xpath(SystemNavigation_DocumentDistributeView_XPath)).findVisibleElement(By.xpath(SystemNavigation_DocumentDistributeView_XPath));
		SystemNavigation_DocumentDistributeView.click();
	}

	/**/
	public WebElement get_SystemNavigation_DocumentDistributeView_Self(){
		return driver.findElement(By.xpath(SystemNavigation_DocumentDistributeView_XPath)).findVisibleElement(By.xpath(SystemNavigation_DocumentDistributeView_XPath));
	}

	/**/
	public void SystemNavigation_DocumentManageView_click(){
		WebElement SystemNavigation_DocumentManageView = driver.findElement(By.xpath(SystemNavigation_DocumentManageView_XPath)).findVisibleElement(By.xpath(SystemNavigation_DocumentManageView_XPath));
		SystemNavigation_DocumentManageView.click();
	}

	/**/
	public WebElement get_SystemNavigation_DocumentManageView_Self(){
		return driver.findElement(By.xpath(SystemNavigation_DocumentManageView_XPath)).findVisibleElement(By.xpath(SystemNavigation_DocumentManageView_XPath));
	}

	/**/
	public void SystemNavigation_MaterialManageView_click(){
		WebElement SystemNavigation_MaterialManageView = driver.findElement(By.xpath(SystemNavigation_MaterialManageView_XPath)).findVisibleElement(By.xpath(SystemNavigation_MaterialManageView_XPath));
		SystemNavigation_MaterialManageView.click();
	}

	/**/
	public WebElement get_SystemNavigation_MaterialManageView_Self(){
		return driver.findElement(By.xpath(SystemNavigation_MaterialManageView_XPath)).findVisibleElement(By.xpath(SystemNavigation_MaterialManageView_XPath));
	}

	/**/
	public void SystemNavigation_BorrowManageView_click(){
		WebElement SystemNavigation_BorrowManageView = driver.findElement(By.xpath(SystemNavigation_BorrowManageView_XPath)).findVisibleElement(By.xpath(SystemNavigation_BorrowManageView_XPath));
		SystemNavigation_BorrowManageView.click();
	}

	/**/
	public WebElement get_SystemNavigation_BorrowManageView_Self(){
		return driver.findElement(By.xpath(SystemNavigation_BorrowManageView_XPath)).findVisibleElement(By.xpath(SystemNavigation_BorrowManageView_XPath));
	}

	/**/
	public void SystemNavigation_SearchUseView_click(){
		WebElement SystemNavigation_SearchUseView = driver.findElement(By.xpath(SystemNavigation_SearchUseView_XPath)).findVisibleElement(By.xpath(SystemNavigation_SearchUseView_XPath));
		SystemNavigation_SearchUseView.click();
	}

	/**/
	public WebElement get_SystemNavigation_SearchUseView_Self(){
		return driver.findElement(By.xpath(SystemNavigation_SearchUseView_XPath)).findVisibleElement(By.xpath(SystemNavigation_SearchUseView_XPath));
	}

	/**/
	public void SystemNavigation_HeadquarterManageView_click(){
		WebElement SystemNavigation_HeadquarterManageView = driver.findElement(By.xpath(SystemNavigation_HeadquarterManageView_XPath)).findVisibleElement(By.xpath(SystemNavigation_HeadquarterManageView_XPath));
		SystemNavigation_HeadquarterManageView.click();
	}

	/**/
	public WebElement get_SystemNavigation_HeadquarterManageView_Self(){
		return driver.findElement(By.xpath(SystemNavigation_HeadquarterManageView_XPath)).findVisibleElement(By.xpath(SystemNavigation_HeadquarterManageView_XPath));
	}

	/**/
	public void SystemNavigation_MaterialShareView_click(){
		WebElement SystemNavigation_MaterialShareView = driver.findElement(By.xpath(SystemNavigation_MaterialShareView_XPath)).findVisibleElement(By.xpath(SystemNavigation_MaterialShareView_XPath));
		SystemNavigation_MaterialShareView.click();
	}

	/**/
	public WebElement get_SystemNavigation_MaterialShareView_Self(){
		return driver.findElement(By.xpath(SystemNavigation_MaterialShareView_XPath)).findVisibleElement(By.xpath(SystemNavigation_MaterialShareView_XPath));
	}

	/**/
	public void SystemNavigation_ConfigManageView_click(){
		WebElement SystemNavigation_ConfigManageView = driver.findElement(By.xpath(SystemNavigation_ConfigManageView_XPath)).findVisibleElement(By.xpath(SystemNavigation_ConfigManageView_XPath));
		SystemNavigation_ConfigManageView.click();
	}

	/**/
	public WebElement get_SystemNavigation_ConfigManageView_Self(){
		return driver.findElement(By.xpath(SystemNavigation_ConfigManageView_XPath)).findVisibleElement(By.xpath(SystemNavigation_ConfigManageView_XPath));
	}

	/**/
	public void SystemNavigation_ReportView_click(){
		WebElement SystemNavigation_ReportView = driver.findElement(By.xpath(SystemNavigation_ReportView_XPath)).findVisibleElement(By.xpath(SystemNavigation_ReportView_XPath));
		SystemNavigation_ReportView.click();
	}

	/**/
	public WebElement get_SystemNavigation_ReportView_Self(){
		return driver.findElement(By.xpath(SystemNavigation_ReportView_XPath)).findVisibleElement(By.xpath(SystemNavigation_ReportView_XPath));
	}

	/**/
	public void NoName22_click(){
		WebElement NoName22 = driver.findElement(By.xpath(NoName22_XPath)).findVisibleElement(By.xpath(NoName22_XPath));
		NoName22.click();
	}

	/**/
	public WebElement get_NoName22_Self(){
		return driver.findElement(By.xpath(NoName22_XPath)).findVisibleElement(By.xpath(NoName22_XPath));
	}

	/**/
	public void NoName23_click(){
		WebElement NoName23 = driver.findElement(By.xpath(NoName23_XPath)).findVisibleElement(By.xpath(NoName23_XPath));
		NoName23.click();
	}

	/**/
	public WebElement get_NoName23_Self(){
		return driver.findElement(By.xpath(NoName23_XPath)).findVisibleElement(By.xpath(NoName23_XPath));
	}

	/**/
	public void systemReceive_UnifyReceiveView_click(){
		WebElement systemReceive_UnifyReceiveView = driver.findElement(By.xpath(systemReceive_UnifyReceiveView_XPath)).findVisibleElement(By.xpath(systemReceive_UnifyReceiveView_XPath));
		systemReceive_UnifyReceiveView.click();
	}

	/**/
	public WebElement get_systemReceive_UnifyReceiveView_Self(){
		return driver.findElement(By.xpath(systemReceive_UnifyReceiveView_XPath)).findVisibleElement(By.xpath(systemReceive_UnifyReceiveView_XPath));
	}

	/**/
	public void eamInvalidDocSearch_UnifyReceiveView_click(){
		WebElement eamInvalidDocSearch_UnifyReceiveView = driver.findElement(By.xpath(eamInvalidDocSearch_UnifyReceiveView_XPath)).findVisibleElement(By.xpath(eamInvalidDocSearch_UnifyReceiveView_XPath));
		eamInvalidDocSearch_UnifyReceiveView.click();
	}

	/**/
	public WebElement get_eamInvalidDocSearch_UnifyReceiveView_Self(){
		return driver.findElement(By.xpath(eamInvalidDocSearch_UnifyReceiveView_XPath)).findVisibleElement(By.xpath(eamInvalidDocSearch_UnifyReceiveView_XPath));
	}

	/**/
	public void importReceive_UnifyReceiveView_click(){
		WebElement importReceive_UnifyReceiveView = driver.findElement(By.xpath(importReceive_UnifyReceiveView_XPath)).findVisibleElement(By.xpath(importReceive_UnifyReceiveView_XPath));
		importReceive_UnifyReceiveView.click();
	}

	/**/
	public WebElement get_importReceive_UnifyReceiveView_Self(){
		return driver.findElement(By.xpath(importReceive_UnifyReceiveView_XPath)).findVisibleElement(By.xpath(importReceive_UnifyReceiveView_XPath));
	}

	/**/
	public void receiveRecordSearch_UnifyReceiveView_click(){
		WebElement receiveRecordSearch_UnifyReceiveView = driver.findElement(By.xpath(receiveRecordSearch_UnifyReceiveView_XPath)).findVisibleElement(By.xpath(receiveRecordSearch_UnifyReceiveView_XPath));
		receiveRecordSearch_UnifyReceiveView.click();
	}

	/**/
	public WebElement get_receiveRecordSearch_UnifyReceiveView_Self(){
		return driver.findElement(By.xpath(receiveRecordSearch_UnifyReceiveView_XPath)).findVisibleElement(By.xpath(receiveRecordSearch_UnifyReceiveView_XPath));
	}

	/**/
	public void documentReceiveProcess_UnifyReceiveView_click(){
		WebElement documentReceiveProcess_UnifyReceiveView = driver.findElement(By.xpath(documentReceiveProcess_UnifyReceiveView_XPath)).findVisibleElement(By.xpath(documentReceiveProcess_UnifyReceiveView_XPath));
		documentReceiveProcess_UnifyReceiveView.click();
	}

	/**/
	public WebElement get_documentReceiveProcess_UnifyReceiveView_Self(){
		return driver.findElement(By.xpath(documentReceiveProcess_UnifyReceiveView_XPath)).findVisibleElement(By.xpath(documentReceiveProcess_UnifyReceiveView_XPath));
	}

	/**/
	public void archiveReceiveProcess_UnifyReceiveView_click(){
		WebElement archiveReceiveProcess_UnifyReceiveView = driver.findElement(By.xpath(archiveReceiveProcess_UnifyReceiveView_XPath)).findVisibleElement(By.xpath(archiveReceiveProcess_UnifyReceiveView_XPath));
		archiveReceiveProcess_UnifyReceiveView.click();
	}

	/**/
	public WebElement get_archiveReceiveProcess_UnifyReceiveView_Self(){
		return driver.findElement(By.xpath(archiveReceiveProcess_UnifyReceiveView_XPath)).findVisibleElement(By.xpath(archiveReceiveProcess_UnifyReceiveView_XPath));
	}

	/**/
	public void documentDistributionManage_DocumentDistributeView_click(){
		WebElement documentDistributionManage_DocumentDistributeView = driver.findElement(By.xpath(documentDistributionManage_DocumentDistributeView_XPath)).findVisibleElement(By.xpath(documentDistributionManage_DocumentDistributeView_XPath));
		documentDistributionManage_DocumentDistributeView.click();
	}

	/**/
	public WebElement get_documentDistributionManage_DocumentDistributeView_Self(){
		return driver.findElement(By.xpath(documentDistributionManage_DocumentDistributeView_XPath)).findVisibleElement(By.xpath(documentDistributionManage_DocumentDistributeView_XPath));
	}

	/**/
	public void eamDocumentDistribute_DocumentDistributeView_click(){
		WebElement eamDocumentDistribute_DocumentDistributeView = driver.findElement(By.xpath(eamDocumentDistribute_DocumentDistributeView_XPath)).findVisibleElement(By.xpath(eamDocumentDistribute_DocumentDistributeView_XPath));
		eamDocumentDistribute_DocumentDistributeView.click();
	}

	/**/
	public WebElement get_eamDocumentDistribute_DocumentDistributeView_Self(){
		return driver.findElement(By.xpath(eamDocumentDistribute_DocumentDistributeView_XPath)).findVisibleElement(By.xpath(eamDocumentDistribute_DocumentDistributeView_XPath));
	}

	/**/
	public void distributionFormManage_DocumentDistributeView_click(){
		WebElement distributionFormManage_DocumentDistributeView = driver.findElement(By.xpath(distributionFormManage_DocumentDistributeView_XPath)).findVisibleElement(By.xpath(distributionFormManage_DocumentDistributeView_XPath));
		distributionFormManage_DocumentDistributeView.click();
	}

	/**/
	public WebElement get_distributionFormManage_DocumentDistributeView_Self(){
		return driver.findElement(By.xpath(distributionFormManage_DocumentDistributeView_XPath)).findVisibleElement(By.xpath(distributionFormManage_DocumentDistributeView_XPath));
	}

	/**/
	public void distributeTicketDraft_DocumentDistributeView_click(){
		WebElement distributeTicketDraft_DocumentDistributeView = driver.findElement(By.xpath(distributeTicketDraft_DocumentDistributeView_XPath)).findVisibleElement(By.xpath(distributeTicketDraft_DocumentDistributeView_XPath));
		distributeTicketDraft_DocumentDistributeView.click();
	}

	/**/
	public WebElement get_distributeTicketDraft_DocumentDistributeView_Self(){
		return driver.findElement(By.xpath(distributeTicketDraft_DocumentDistributeView_XPath)).findVisibleElement(By.xpath(distributeTicketDraft_DocumentDistributeView_XPath));
	}

	/**/
	public void distributeTicketDistributed_DocumentDistributeView_click(){
		WebElement distributeTicketDistributed_DocumentDistributeView = driver.findElement(By.xpath(distributeTicketDistributed_DocumentDistributeView_XPath)).findVisibleElement(By.xpath(distributeTicketDistributed_DocumentDistributeView_XPath));
		distributeTicketDistributed_DocumentDistributeView.click();
	}

	/**/
	public WebElement get_distributeTicketDistributed_DocumentDistributeView_Self(){
		return driver.findElement(By.xpath(distributeTicketDistributed_DocumentDistributeView_XPath)).findVisibleElement(By.xpath(distributeTicketDistributed_DocumentDistributeView_XPath));
	}

	/**/
	public void distributeTicketClosed_DocumentDistributeView_click(){
		WebElement distributeTicketClosed_DocumentDistributeView = driver.findElement(By.xpath(distributeTicketClosed_DocumentDistributeView_XPath)).findVisibleElement(By.xpath(distributeTicketClosed_DocumentDistributeView_XPath));
		distributeTicketClosed_DocumentDistributeView.click();
	}

	/**/
	public WebElement get_distributeTicketClosed_DocumentDistributeView_Self(){
		return driver.findElement(By.xpath(distributeTicketClosed_DocumentDistributeView_XPath)).findVisibleElement(By.xpath(distributeTicketClosed_DocumentDistributeView_XPath));
	}

	/**/
	public void documentRecycle_DocumentDistributeView_click(){
		WebElement documentRecycle_DocumentDistributeView = driver.findElement(By.xpath(documentRecycle_DocumentDistributeView_XPath)).findVisibleElement(By.xpath(documentRecycle_DocumentDistributeView_XPath));
		documentRecycle_DocumentDistributeView.click();
	}

	/**/
	public WebElement get_documentRecycle_DocumentDistributeView_Self(){
		return driver.findElement(By.xpath(documentRecycle_DocumentDistributeView_XPath)).findVisibleElement(By.xpath(documentRecycle_DocumentDistributeView_XPath));
	}

	/**/
	public void departmentDocumentReceive_DocumentDistributeView_click(){
		WebElement departmentDocumentReceive_DocumentDistributeView = driver.findElement(By.xpath(departmentDocumentReceive_DocumentDistributeView_XPath)).findVisibleElement(By.xpath(departmentDocumentReceive_DocumentDistributeView_XPath));
		departmentDocumentReceive_DocumentDistributeView.click();
	}

	/**/
	public WebElement get_departmentDocumentReceive_DocumentDistributeView_Self(){
		return driver.findElement(By.xpath(departmentDocumentReceive_DocumentDistributeView_XPath)).findVisibleElement(By.xpath(departmentDocumentReceive_DocumentDistributeView_XPath));
	}

	/**/
	public void departmentDocumentDistribute_DocumentDistributeView_click(){
		WebElement departmentDocumentDistribute_DocumentDistributeView = driver.findElement(By.xpath(departmentDocumentDistribute_DocumentDistributeView_XPath)).findVisibleElement(By.xpath(departmentDocumentDistribute_DocumentDistributeView_XPath));
		departmentDocumentDistribute_DocumentDistributeView.click();
	}

	/**/
	public WebElement get_departmentDocumentDistribute_DocumentDistributeView_Self(){
		return driver.findElement(By.xpath(departmentDocumentDistribute_DocumentDistributeView_XPath)).findVisibleElement(By.xpath(departmentDocumentDistribute_DocumentDistributeView_XPath));
	}

	/**/
	public void deptDistribution_DocumentDistributeView_click(){
		WebElement deptDistribution_DocumentDistributeView = driver.findElement(By.xpath(deptDistribution_DocumentDistributeView_XPath)).findVisibleElement(By.xpath(deptDistribution_DocumentDistributeView_XPath));
		deptDistribution_DocumentDistributeView.click();
	}

	/**/
	public WebElement get_deptDistribution_DocumentDistributeView_Self(){
		return driver.findElement(By.xpath(deptDistribution_DocumentDistributeView_XPath)).findVisibleElement(By.xpath(deptDistribution_DocumentDistributeView_XPath));
	}

	/**/
	public void deptDistributionReceived_DocumentDistributeView_click(){
		WebElement deptDistributionReceived_DocumentDistributeView = driver.findElement(By.xpath(deptDistributionReceived_DocumentDistributeView_XPath)).findVisibleElement(By.xpath(deptDistributionReceived_DocumentDistributeView_XPath));
		deptDistributionReceived_DocumentDistributeView.click();
	}

	/**/
	public WebElement get_deptDistributionReceived_DocumentDistributeView_Self(){
		return driver.findElement(By.xpath(deptDistributionReceived_DocumentDistributeView_XPath)).findVisibleElement(By.xpath(deptDistributionReceived_DocumentDistributeView_XPath));
	}

	/**/
	public void distributionRecordSearch_DocumentDistributeView_click(){
		WebElement distributionRecordSearch_DocumentDistributeView = driver.findElement(By.xpath(distributionRecordSearch_DocumentDistributeView_XPath)).findVisibleElement(By.xpath(distributionRecordSearch_DocumentDistributeView_XPath));
		distributionRecordSearch_DocumentDistributeView.click();
	}

	/**/
	public WebElement get_distributionRecordSearch_DocumentDistributeView_Self(){
		return driver.findElement(By.xpath(distributionRecordSearch_DocumentDistributeView_XPath)).findVisibleElement(By.xpath(distributionRecordSearch_DocumentDistributeView_XPath));
	}

	/**/
	public void corparationSearch_DocumentManageView_click(){
		WebElement corparationSearch_DocumentManageView = driver.findElement(By.xpath(corparationSearch_DocumentManageView_XPath)).findVisibleElement(By.xpath(corparationSearch_DocumentManageView_XPath));
		corparationSearch_DocumentManageView.click();
	}

	/**/
	public WebElement get_corparationSearch_DocumentManageView_Self(){
		return driver.findElement(By.xpath(corparationSearch_DocumentManageView_XPath)).findVisibleElement(By.xpath(corparationSearch_DocumentManageView_XPath));
	}

	/**/
	public void preArchiveSearch_DocumentManageView_click(){
		WebElement preArchiveSearch_DocumentManageView = driver.findElement(By.xpath(preArchiveSearch_DocumentManageView_XPath)).findVisibleElement(By.xpath(preArchiveSearch_DocumentManageView_XPath));
		preArchiveSearch_DocumentManageView.click();
	}

	/**/
	public WebElement get_preArchiveSearch_DocumentManageView_Self(){
		return driver.findElement(By.xpath(preArchiveSearch_DocumentManageView_XPath)).findVisibleElement(By.xpath(preArchiveSearch_DocumentManageView_XPath));
	}

	/**/
	public void departmentLib_DocumentManageView_click(){
		WebElement departmentLib_DocumentManageView = driver.findElement(By.xpath(departmentLib_DocumentManageView_XPath)).findVisibleElement(By.xpath(departmentLib_DocumentManageView_XPath));
		departmentLib_DocumentManageView.click();
	}

	/**/
	public WebElement get_departmentLib_DocumentManageView_Self(){
		return driver.findElement(By.xpath(departmentLib_DocumentManageView_XPath)).findVisibleElement(By.xpath(departmentLib_DocumentManageView_XPath));
	}

	/**/
	public void departmentLibTagConfig_DocumentManageView_click(){
		WebElement departmentLibTagConfig_DocumentManageView = driver.findElement(By.xpath(departmentLibTagConfig_DocumentManageView_XPath)).findVisibleElement(By.xpath(departmentLibTagConfig_DocumentManageView_XPath));
		departmentLibTagConfig_DocumentManageView.click();
	}

	/**/
	public WebElement get_departmentLibTagConfig_DocumentManageView_Self(){
		return driver.findElement(By.xpath(departmentLibTagConfig_DocumentManageView_XPath)).findVisibleElement(By.xpath(departmentLibTagConfig_DocumentManageView_XPath));
	}

	/**/
	public void recordSearch_DocumentManageView_click(){
		WebElement recordSearch_DocumentManageView = driver.findElement(By.xpath(recordSearch_DocumentManageView_XPath)).findVisibleElement(By.xpath(recordSearch_DocumentManageView_XPath));
		recordSearch_DocumentManageView.click();
	}

	/**/
	public WebElement get_recordSearch_DocumentManageView_Self(){
		return driver.findElement(By.xpath(recordSearch_DocumentManageView_XPath)).findVisibleElement(By.xpath(recordSearch_DocumentManageView_XPath));
	}

	/**/
	public void nuclearFolderSearch_DocumentManageView_click(){
		WebElement nuclearFolderSearch_DocumentManageView = driver.findElement(By.xpath(nuclearFolderSearch_DocumentManageView_XPath)).findVisibleElement(By.xpath(nuclearFolderSearch_DocumentManageView_XPath));
		nuclearFolderSearch_DocumentManageView.click();
	}

	/**/
	public WebElement get_nuclearFolderSearch_DocumentManageView_Self(){
		return driver.findElement(By.xpath(nuclearFolderSearch_DocumentManageView_XPath)).findVisibleElement(By.xpath(nuclearFolderSearch_DocumentManageView_XPath));
	}

	/**/
	public void ActionPane_DocumentManageView_click(){
		WebElement ActionPane_DocumentManageView = driver.findElement(By.xpath(ActionPane_DocumentManageView_XPath)).findVisibleElement(By.xpath(ActionPane_DocumentManageView_XPath));
		ActionPane_DocumentManageView.click();
	}

	/**/
	public WebElement get_ActionPane_DocumentManageView_Self(){
		return driver.findElement(By.xpath(ActionPane_DocumentManageView_XPath)).findVisibleElement(By.xpath(ActionPane_DocumentManageView_XPath));
	}

	/**/
	public void eamDocumentSearch_DocumentManageView_click(){
		WebElement eamDocumentSearch_DocumentManageView = driver.findElement(By.xpath(eamDocumentSearch_DocumentManageView_XPath)).findVisibleElement(By.xpath(eamDocumentSearch_DocumentManageView_XPath));
		eamDocumentSearch_DocumentManageView.click();
	}

	/**/
	public WebElement get_eamDocumentSearch_DocumentManageView_Self(){
		return driver.findElement(By.xpath(eamDocumentSearch_DocumentManageView_XPath)).findVisibleElement(By.xpath(eamDocumentSearch_DocumentManageView_XPath));
	}

	/**/
	public void documentExportManage_DocumentManageView_click(){
		WebElement documentExportManage_DocumentManageView = driver.findElement(By.xpath(documentExportManage_DocumentManageView_XPath)).findVisibleElement(By.xpath(documentExportManage_DocumentManageView_XPath));
		documentExportManage_DocumentManageView.click();
	}

	/**/
	public WebElement get_documentExportManage_DocumentManageView_Self(){
		return driver.findElement(By.xpath(documentExportManage_DocumentManageView_XPath)).findVisibleElement(By.xpath(documentExportManage_DocumentManageView_XPath));
	}

	/**/
	public void documentBatchUpdate_DocumentManageView_click(){
		WebElement documentBatchUpdate_DocumentManageView = driver.findElement(By.xpath(documentBatchUpdate_DocumentManageView_XPath)).findVisibleElement(By.xpath(documentBatchUpdate_DocumentManageView_XPath));
		documentBatchUpdate_DocumentManageView.click();
	}

	/**/
	public WebElement get_documentBatchUpdate_DocumentManageView_Self(){
		return driver.findElement(By.xpath(documentBatchUpdate_DocumentManageView_XPath)).findVisibleElement(By.xpath(documentBatchUpdate_DocumentManageView_XPath));
	}

	/**/
	public void materialSearch_MaterialManageView_click(){
		WebElement materialSearch_MaterialManageView = driver.findElement(By.xpath(materialSearch_MaterialManageView_XPath)).findVisibleElement(By.xpath(materialSearch_MaterialManageView_XPath));
		materialSearch_MaterialManageView.click();
	}

	/**/
	public WebElement get_materialSearch_MaterialManageView_Self(){
		return driver.findElement(By.xpath(materialSearch_MaterialManageView_XPath)).findVisibleElement(By.xpath(materialSearch_MaterialManageView_XPath));
	}

	/**/
	public void materialDistributeSearch_MaterialManageView_click(){
		WebElement materialDistributeSearch_MaterialManageView = driver.findElement(By.xpath(materialDistributeSearch_MaterialManageView_XPath)).findVisibleElement(By.xpath(materialDistributeSearch_MaterialManageView_XPath));
		materialDistributeSearch_MaterialManageView.click();
	}

	/**/
	public WebElement get_materialDistributeSearch_MaterialManageView_Self(){
		return driver.findElement(By.xpath(materialDistributeSearch_MaterialManageView_XPath)).findVisibleElement(By.xpath(materialDistributeSearch_MaterialManageView_XPath));
	}

	/**/
	public void ActionPane_MaterialManageView_click(){
		WebElement ActionPane_MaterialManageView = driver.findElement(By.xpath(ActionPane_MaterialManageView_XPath)).findVisibleElement(By.xpath(ActionPane_MaterialManageView_XPath));
		ActionPane_MaterialManageView.click();
	}

	/**/
	public WebElement get_ActionPane_MaterialManageView_Self(){
		return driver.findElement(By.xpath(ActionPane_MaterialManageView_XPath)).findVisibleElement(By.xpath(ActionPane_MaterialManageView_XPath));
	}

	/**/
	public void materialExportManage_MaterialManageView_click(){
		WebElement materialExportManage_MaterialManageView = driver.findElement(By.xpath(materialExportManage_MaterialManageView_XPath)).findVisibleElement(By.xpath(materialExportManage_MaterialManageView_XPath));
		materialExportManage_MaterialManageView.click();
	}

	/**/
	public WebElement get_materialExportManage_MaterialManageView_Self(){
		return driver.findElement(By.xpath(materialExportManage_MaterialManageView_XPath)).findVisibleElement(By.xpath(materialExportManage_MaterialManageView_XPath));
	}

	/**/
	public void materialBatchUpdate_MaterialManageView_click(){
		WebElement materialBatchUpdate_MaterialManageView = driver.findElement(By.xpath(materialBatchUpdate_MaterialManageView_XPath)).findVisibleElement(By.xpath(materialBatchUpdate_MaterialManageView_XPath));
		materialBatchUpdate_MaterialManageView.click();
	}

	/**/
	public WebElement get_materialBatchUpdate_MaterialManageView_Self(){
		return driver.findElement(By.xpath(materialBatchUpdate_MaterialManageView_XPath)).findVisibleElement(By.xpath(materialBatchUpdate_MaterialManageView_XPath));
	}

	/**/
	public void lendRegister_BorrowManageView_click(){
		WebElement lendRegister_BorrowManageView = driver.findElement(By.xpath(lendRegister_BorrowManageView_XPath)).findVisibleElement(By.xpath(lendRegister_BorrowManageView_XPath));
		lendRegister_BorrowManageView.click();
	}

	/**/
	public WebElement get_lendRegister_BorrowManageView_Self(){
		return driver.findElement(By.xpath(lendRegister_BorrowManageView_XPath)).findVisibleElement(By.xpath(lendRegister_BorrowManageView_XPath));
	}

	/**/
	public void borrowApprove_BorrowManageView_click(){
		WebElement borrowApprove_BorrowManageView = driver.findElement(By.xpath(borrowApprove_BorrowManageView_XPath)).findVisibleElement(By.xpath(borrowApprove_BorrowManageView_XPath));
		borrowApprove_BorrowManageView.click();
	}

	/**/
	public WebElement get_borrowApprove_BorrowManageView_Self(){
		return driver.findElement(By.xpath(borrowApprove_BorrowManageView_XPath)).findVisibleElement(By.xpath(borrowApprove_BorrowManageView_XPath));
	}

	/**/
	public void bookManage_BorrowManageView_click(){
		WebElement bookManage_BorrowManageView = driver.findElement(By.xpath(bookManage_BorrowManageView_XPath)).findVisibleElement(By.xpath(bookManage_BorrowManageView_XPath));
		bookManage_BorrowManageView.click();
	}

	/**/
	public WebElement get_bookManage_BorrowManageView_Self(){
		return driver.findElement(By.xpath(bookManage_BorrowManageView_XPath)).findVisibleElement(By.xpath(bookManage_BorrowManageView_XPath));
	}

	/**/
	public void borrowHistory_BorrowManageView_click(){
		WebElement borrowHistory_BorrowManageView = driver.findElement(By.xpath(borrowHistory_BorrowManageView_XPath)).findVisibleElement(By.xpath(borrowHistory_BorrowManageView_XPath));
		borrowHistory_BorrowManageView.click();
	}

	/**/
	public WebElement get_borrowHistory_BorrowManageView_Self(){
		return driver.findElement(By.xpath(borrowHistory_BorrowManageView_XPath)).findVisibleElement(By.xpath(borrowHistory_BorrowManageView_XPath));
	}

	/**/
	public void companyDocumentLibrary_SearchUseView_click(){
		WebElement companyDocumentLibrary_SearchUseView = driver.findElement(By.xpath(companyDocumentLibrary_SearchUseView_XPath)).findVisibleElement(By.xpath(companyDocumentLibrary_SearchUseView_XPath));
		companyDocumentLibrary_SearchUseView.click();
	}

	/**/
	public WebElement get_companyDocumentLibrary_SearchUseView_Self(){
		return driver.findElement(By.xpath(companyDocumentLibrary_SearchUseView_XPath)).findVisibleElement(By.xpath(companyDocumentLibrary_SearchUseView_XPath));
	}

	/**/
	public void departmentDocumentLibrary_SearchUseView_click(){
		WebElement departmentDocumentLibrary_SearchUseView = driver.findElement(By.xpath(departmentDocumentLibrary_SearchUseView_XPath)).findVisibleElement(By.xpath(departmentDocumentLibrary_SearchUseView_XPath));
		departmentDocumentLibrary_SearchUseView.click();
	}

	/**/
	public WebElement get_departmentDocumentLibrary_SearchUseView_Self(){
		return driver.findElement(By.xpath(departmentDocumentLibrary_SearchUseView_XPath)).findVisibleElement(By.xpath(departmentDocumentLibrary_SearchUseView_XPath));
	}

	/**/
	public void materialLibrary_SearchUseView_click(){
		WebElement materialLibrary_SearchUseView = driver.findElement(By.xpath(materialLibrary_SearchUseView_XPath)).findVisibleElement(By.xpath(materialLibrary_SearchUseView_XPath));
		materialLibrary_SearchUseView.click();
	}

	/**/
	public WebElement get_materialLibrary_SearchUseView_Self(){
		return driver.findElement(By.xpath(materialLibrary_SearchUseView_XPath)).findVisibleElement(By.xpath(materialLibrary_SearchUseView_XPath));
	}

	/**/
	public void myNavigator_SearchUseView_click(){
		WebElement myNavigator_SearchUseView = driver.findElement(By.xpath(myNavigator_SearchUseView_XPath)).findVisibleElement(By.xpath(myNavigator_SearchUseView_XPath));
		myNavigator_SearchUseView.click();
	}

	/**/
	public WebElement get_myNavigator_SearchUseView_Self(){
		return driver.findElement(By.xpath(myNavigator_SearchUseView_XPath)).findVisibleElement(By.xpath(myNavigator_SearchUseView_XPath));
	}

	/**/
	public void mySearch_SearchUseView_click(){
		WebElement mySearch_SearchUseView = driver.findElement(By.xpath(mySearch_SearchUseView_XPath)).findVisibleElement(By.xpath(mySearch_SearchUseView_XPath));
		mySearch_SearchUseView.click();
	}

	/**/
	public WebElement get_mySearch_SearchUseView_Self(){
		return driver.findElement(By.xpath(mySearch_SearchUseView_XPath)).findVisibleElement(By.xpath(mySearch_SearchUseView_XPath));
	}

	/**/
	public void DocumentSubscribe_SearchUseView_click(){
		WebElement DocumentSubscribe_SearchUseView = driver.findElement(By.xpath(DocumentSubscribe_SearchUseView_XPath)).findVisibleElement(By.xpath(DocumentSubscribe_SearchUseView_XPath));
		DocumentSubscribe_SearchUseView.click();
	}

	/**/
	public WebElement get_DocumentSubscribe_SearchUseView_Self(){
		return driver.findElement(By.xpath(DocumentSubscribe_SearchUseView_XPath)).findVisibleElement(By.xpath(DocumentSubscribe_SearchUseView_XPath));
	}

	/**/
	public void subscribeSearch_SearchUseView_click(){
		WebElement subscribeSearch_SearchUseView = driver.findElement(By.xpath(subscribeSearch_SearchUseView_XPath)).findVisibleElement(By.xpath(subscribeSearch_SearchUseView_XPath));
		subscribeSearch_SearchUseView.click();
	}

	/**/
	public WebElement get_subscribeSearch_SearchUseView_Self(){
		return driver.findElement(By.xpath(subscribeSearch_SearchUseView_XPath)).findVisibleElement(By.xpath(subscribeSearch_SearchUseView_XPath));
	}

	/**/
	public void subscribeSearchMaterial_SearchUseView_click(){
		WebElement subscribeSearchMaterial_SearchUseView = driver.findElement(By.xpath(subscribeSearchMaterial_SearchUseView_XPath)).findVisibleElement(By.xpath(subscribeSearchMaterial_SearchUseView_XPath));
		subscribeSearchMaterial_SearchUseView.click();
	}

	/**/
	public WebElement get_subscribeSearchMaterial_SearchUseView_Self(){
		return driver.findElement(By.xpath(subscribeSearchMaterial_SearchUseView_XPath)).findVisibleElement(By.xpath(subscribeSearchMaterial_SearchUseView_XPath));
	}

	/**/
	public void subscribeTagConfig_SearchUseView_click(){
		WebElement subscribeTagConfig_SearchUseView = driver.findElement(By.xpath(subscribeTagConfig_SearchUseView_XPath)).findVisibleElement(By.xpath(subscribeTagConfig_SearchUseView_XPath));
		subscribeTagConfig_SearchUseView.click();
	}

	/**/
	public WebElement get_subscribeTagConfig_SearchUseView_Self(){
		return driver.findElement(By.xpath(subscribeTagConfig_SearchUseView_XPath)).findVisibleElement(By.xpath(subscribeTagConfig_SearchUseView_XPath));
	}

	/**/
	public void DocumentFavorite_SearchUseView_click(){
		WebElement DocumentFavorite_SearchUseView = driver.findElement(By.xpath(DocumentFavorite_SearchUseView_XPath)).findVisibleElement(By.xpath(DocumentFavorite_SearchUseView_XPath));
		DocumentFavorite_SearchUseView.click();
	}

	/**/
	public WebElement get_DocumentFavorite_SearchUseView_Self(){
		return driver.findElement(By.xpath(DocumentFavorite_SearchUseView_XPath)).findVisibleElement(By.xpath(DocumentFavorite_SearchUseView_XPath));
	}

	/**/
	public void documentFavourite_SearchUseView_click(){
		WebElement documentFavourite_SearchUseView = driver.findElement(By.xpath(documentFavourite_SearchUseView_XPath)).findVisibleElement(By.xpath(documentFavourite_SearchUseView_XPath));
		documentFavourite_SearchUseView.click();
	}

	/**/
	public WebElement get_documentFavourite_SearchUseView_Self(){
		return driver.findElement(By.xpath(documentFavourite_SearchUseView_XPath)).findVisibleElement(By.xpath(documentFavourite_SearchUseView_XPath));
	}

	/**/
	public void materialFavourite_SearchUseView_click(){
		WebElement materialFavourite_SearchUseView = driver.findElement(By.xpath(materialFavourite_SearchUseView_XPath)).findVisibleElement(By.xpath(materialFavourite_SearchUseView_XPath));
		materialFavourite_SearchUseView.click();
	}

	/**/
	public WebElement get_materialFavourite_SearchUseView_Self(){
		return driver.findElement(By.xpath(materialFavourite_SearchUseView_XPath)).findVisibleElement(By.xpath(materialFavourite_SearchUseView_XPath));
	}

	/**/
	public void ActionPane_Comment_SearchUseView_click(){
		WebElement ActionPane_Comment_SearchUseView = driver.findElement(By.xpath(ActionPane_Comment_SearchUseView_XPath)).findVisibleElement(By.xpath(ActionPane_Comment_SearchUseView_XPath));
		ActionPane_Comment_SearchUseView.click();
	}

	/**/
	public WebElement get_ActionPane_Comment_SearchUseView_Self(){
		return driver.findElement(By.xpath(ActionPane_Comment_SearchUseView_XPath)).findVisibleElement(By.xpath(ActionPane_Comment_SearchUseView_XPath));
	}

	/**/
	public void documentComment_SearchUseView_click(){
		WebElement documentComment_SearchUseView = driver.findElement(By.xpath(documentComment_SearchUseView_XPath)).findVisibleElement(By.xpath(documentComment_SearchUseView_XPath));
		documentComment_SearchUseView.click();
	}

	/**/
	public WebElement get_documentComment_SearchUseView_Self(){
		return driver.findElement(By.xpath(documentComment_SearchUseView_XPath)).findVisibleElement(By.xpath(documentComment_SearchUseView_XPath));
	}

	/**/
	public void materialComment_SearchUseView_click(){
		WebElement materialComment_SearchUseView = driver.findElement(By.xpath(materialComment_SearchUseView_XPath)).findVisibleElement(By.xpath(materialComment_SearchUseView_XPath));
		materialComment_SearchUseView.click();
	}

	/**/
	public WebElement get_materialComment_SearchUseView_Self(){
		return driver.findElement(By.xpath(materialComment_SearchUseView_XPath)).findVisibleElement(By.xpath(materialComment_SearchUseView_XPath));
	}

	/**/
	public void UserProfile_SearchUseView_click(){
		WebElement UserProfile_SearchUseView = driver.findElement(By.xpath(UserProfile_SearchUseView_XPath)).findVisibleElement(By.xpath(UserProfile_SearchUseView_XPath));
		UserProfile_SearchUseView.click();
	}

	/**/
	public WebElement get_UserProfile_SearchUseView_Self(){
		return driver.findElement(By.xpath(UserProfile_SearchUseView_XPath)).findVisibleElement(By.xpath(UserProfile_SearchUseView_XPath));
	}

	/**/
	public void myNavConfig_SearchUseView_click(){
		WebElement myNavConfig_SearchUseView = driver.findElement(By.xpath(myNavConfig_SearchUseView_XPath)).findVisibleElement(By.xpath(myNavConfig_SearchUseView_XPath));
		myNavConfig_SearchUseView.click();
	}

	/**/
	public WebElement get_myNavConfig_SearchUseView_Self(){
		return driver.findElement(By.xpath(myNavConfig_SearchUseView_XPath)).findVisibleElement(By.xpath(myNavConfig_SearchUseView_XPath));
	}

	/**/
	public void ActionPane_HeadquarterManageView_click(){
		WebElement ActionPane_HeadquarterManageView = driver.findElement(By.xpath(ActionPane_HeadquarterManageView_XPath)).findVisibleElement(By.xpath(ActionPane_HeadquarterManageView_XPath));
		ActionPane_HeadquarterManageView.click();
	}

	/**/
	public WebElement get_ActionPane_HeadquarterManageView_Self(){
		return driver.findElement(By.xpath(ActionPane_HeadquarterManageView_XPath)).findVisibleElement(By.xpath(ActionPane_HeadquarterManageView_XPath));
	}

	/**/
	public void metadataStandard_HeadquarterManageView_click(){
		WebElement metadataStandard_HeadquarterManageView = driver.findElement(By.xpath(metadataStandard_HeadquarterManageView_XPath)).findVisibleElement(By.xpath(metadataStandard_HeadquarterManageView_XPath));
		metadataStandard_HeadquarterManageView.click();
	}

	/**/
	public WebElement get_metadataStandard_HeadquarterManageView_Self(){
		return driver.findElement(By.xpath(metadataStandard_HeadquarterManageView_XPath)).findVisibleElement(By.xpath(metadataStandard_HeadquarterManageView_XPath));
	}

	/**/
	public void classDefinitionStandard_HeadquarterManageView_click(){
		WebElement classDefinitionStandard_HeadquarterManageView = driver.findElement(By.xpath(classDefinitionStandard_HeadquarterManageView_XPath)).findVisibleElement(By.xpath(classDefinitionStandard_HeadquarterManageView_XPath));
		classDefinitionStandard_HeadquarterManageView.click();
	}

	/**/
	public WebElement get_classDefinitionStandard_HeadquarterManageView_Self(){
		return driver.findElement(By.xpath(classDefinitionStandard_HeadquarterManageView_XPath)).findVisibleElement(By.xpath(classDefinitionStandard_HeadquarterManageView_XPath));
	}

	/**/
	public void managementDomainStandard_HeadquarterManageView_click(){
		WebElement managementDomainStandard_HeadquarterManageView = driver.findElement(By.xpath(managementDomainStandard_HeadquarterManageView_XPath)).findVisibleElement(By.xpath(managementDomainStandard_HeadquarterManageView_XPath));
		managementDomainStandard_HeadquarterManageView.click();
	}

	/**/
	public WebElement get_managementDomainStandard_HeadquarterManageView_Self(){
		return driver.findElement(By.xpath(managementDomainStandard_HeadquarterManageView_XPath)).findVisibleElement(By.xpath(managementDomainStandard_HeadquarterManageView_XPath));
	}

	/**/
	public void organizationStandard_HeadquarterManageView_click(){
		WebElement organizationStandard_HeadquarterManageView = driver.findElement(By.xpath(organizationStandard_HeadquarterManageView_XPath)).findVisibleElement(By.xpath(organizationStandard_HeadquarterManageView_XPath));
		organizationStandard_HeadquarterManageView.click();
	}

	/**/
	public WebElement get_organizationStandard_HeadquarterManageView_Self(){
		return driver.findElement(By.xpath(organizationStandard_HeadquarterManageView_XPath)).findVisibleElement(By.xpath(organizationStandard_HeadquarterManageView_XPath));
	}

	/**/
	public void nuclearPlantStageStandard_HeadquarterManageView_click(){
		WebElement nuclearPlantStageStandard_HeadquarterManageView = driver.findElement(By.xpath(nuclearPlantStageStandard_HeadquarterManageView_XPath)).findVisibleElement(By.xpath(nuclearPlantStageStandard_HeadquarterManageView_XPath));
		nuclearPlantStageStandard_HeadquarterManageView.click();
	}

	/**/
	public WebElement get_nuclearPlantStageStandard_HeadquarterManageView_Self(){
		return driver.findElement(By.xpath(nuclearPlantStageStandard_HeadquarterManageView_XPath)).findVisibleElement(By.xpath(nuclearPlantStageStandard_HeadquarterManageView_XPath));
	}

	/**/
	public void standardRuleStructureManage_HeadquarterManageView_click(){
		WebElement standardRuleStructureManage_HeadquarterManageView = driver.findElement(By.xpath(standardRuleStructureManage_HeadquarterManageView_XPath)).findVisibleElement(By.xpath(standardRuleStructureManage_HeadquarterManageView_XPath));
		standardRuleStructureManage_HeadquarterManageView.click();
	}

	/**/
	public WebElement get_standardRuleStructureManage_HeadquarterManageView_Self(){
		return driver.findElement(By.xpath(standardRuleStructureManage_HeadquarterManageView_XPath)).findVisibleElement(By.xpath(standardRuleStructureManage_HeadquarterManageView_XPath));
	}

	/**/
	public void standardRuleDistributeApply_HeadquarterManageView_click(){
		WebElement standardRuleDistributeApply_HeadquarterManageView = driver.findElement(By.xpath(standardRuleDistributeApply_HeadquarterManageView_XPath)).findVisibleElement(By.xpath(standardRuleDistributeApply_HeadquarterManageView_XPath));
		standardRuleDistributeApply_HeadquarterManageView.click();
	}

	/**/
	public WebElement get_standardRuleDistributeApply_HeadquarterManageView_Self(){
		return driver.findElement(By.xpath(standardRuleDistributeApply_HeadquarterManageView_XPath)).findVisibleElement(By.xpath(standardRuleDistributeApply_HeadquarterManageView_XPath));
	}

	/**/
	public void ruleDistributeFormManage_HeadquarterManageView_click(){
		WebElement ruleDistributeFormManage_HeadquarterManageView = driver.findElement(By.xpath(ruleDistributeFormManage_HeadquarterManageView_XPath)).findVisibleElement(By.xpath(ruleDistributeFormManage_HeadquarterManageView_XPath));
		ruleDistributeFormManage_HeadquarterManageView.click();
	}

	/**/
	public WebElement get_ruleDistributeFormManage_HeadquarterManageView_Self(){
		return driver.findElement(By.xpath(ruleDistributeFormManage_HeadquarterManageView_XPath)).findVisibleElement(By.xpath(ruleDistributeFormManage_HeadquarterManageView_XPath));
	}

	/**/
	public void standardRuleDistributeRecordQuery_HeadquarterManageView_click(){
		WebElement standardRuleDistributeRecordQuery_HeadquarterManageView = driver.findElement(By.xpath(standardRuleDistributeRecordQuery_HeadquarterManageView_XPath)).findVisibleElement(By.xpath(standardRuleDistributeRecordQuery_HeadquarterManageView_XPath));
		standardRuleDistributeRecordQuery_HeadquarterManageView.click();
	}

	/**/
	public WebElement get_standardRuleDistributeRecordQuery_HeadquarterManageView_Self(){
		return driver.findElement(By.xpath(standardRuleDistributeRecordQuery_HeadquarterManageView_XPath)).findVisibleElement(By.xpath(standardRuleDistributeRecordQuery_HeadquarterManageView_XPath));
	}

	/**/
	public void standardRuleReceiveQuery_HeadquarterManageView_click(){
		WebElement standardRuleReceiveQuery_HeadquarterManageView = driver.findElement(By.xpath(standardRuleReceiveQuery_HeadquarterManageView_XPath)).findVisibleElement(By.xpath(standardRuleReceiveQuery_HeadquarterManageView_XPath));
		standardRuleReceiveQuery_HeadquarterManageView.click();
	}

	/**/
	public WebElement get_standardRuleReceiveQuery_HeadquarterManageView_Self(){
		return driver.findElement(By.xpath(standardRuleReceiveQuery_HeadquarterManageView_XPath)).findVisibleElement(By.xpath(standardRuleReceiveQuery_HeadquarterManageView_XPath));
	}

	/**/
	public void SharedMaterialSubmit_MaterialShareView_click(){
		WebElement SharedMaterialSubmit_MaterialShareView = driver.findElement(By.xpath(SharedMaterialSubmit_MaterialShareView_XPath)).findVisibleElement(By.xpath(SharedMaterialSubmit_MaterialShareView_XPath));
		SharedMaterialSubmit_MaterialShareView.click();
	}

	/**/
	public WebElement get_SharedMaterialSubmit_MaterialShareView_Self(){
		return driver.findElement(By.xpath(SharedMaterialSubmit_MaterialShareView_XPath)).findVisibleElement(By.xpath(SharedMaterialSubmit_MaterialShareView_XPath));
	}

	/**/
	public void MaterialShareApplyRecord_MaterialShareView_click(){
		WebElement MaterialShareApplyRecord_MaterialShareView = driver.findElement(By.xpath(MaterialShareApplyRecord_MaterialShareView_XPath)).findVisibleElement(By.xpath(MaterialShareApplyRecord_MaterialShareView_XPath));
		MaterialShareApplyRecord_MaterialShareView.click();
	}

	/**/
	public WebElement get_MaterialShareApplyRecord_MaterialShareView_Self(){
		return driver.findElement(By.xpath(MaterialShareApplyRecord_MaterialShareView_XPath)).findVisibleElement(By.xpath(MaterialShareApplyRecord_MaterialShareView_XPath));
	}

	/**/
	public void SharedMaterialManage_MaterialShareView_click(){
		WebElement SharedMaterialManage_MaterialShareView = driver.findElement(By.xpath(SharedMaterialManage_MaterialShareView_XPath)).findVisibleElement(By.xpath(SharedMaterialManage_MaterialShareView_XPath));
		SharedMaterialManage_MaterialShareView.click();
	}

	/**/
	public WebElement get_SharedMaterialManage_MaterialShareView_Self(){
		return driver.findElement(By.xpath(SharedMaterialManage_MaterialShareView_XPath)).findVisibleElement(By.xpath(SharedMaterialManage_MaterialShareView_XPath));
	}

	/**/
	public void SharedMaterialSearch_MaterialShareView_click(){
		WebElement SharedMaterialSearch_MaterialShareView = driver.findElement(By.xpath(SharedMaterialSearch_MaterialShareView_XPath)).findVisibleElement(By.xpath(SharedMaterialSearch_MaterialShareView_XPath));
		SharedMaterialSearch_MaterialShareView.click();
	}

	/**/
	public WebElement get_SharedMaterialSearch_MaterialShareView_Self(){
		return driver.findElement(By.xpath(SharedMaterialSearch_MaterialShareView_XPath)).findVisibleElement(By.xpath(SharedMaterialSearch_MaterialShareView_XPath));
	}

	/**/
	public void systemReceiveConfig_ConfigManageView_click(){
		WebElement systemReceiveConfig_ConfigManageView = driver.findElement(By.xpath(systemReceiveConfig_ConfigManageView_XPath)).findVisibleElement(By.xpath(systemReceiveConfig_ConfigManageView_XPath));
		systemReceiveConfig_ConfigManageView.click();
	}

	/**/
	public WebElement get_systemReceiveConfig_ConfigManageView_Self(){
		return driver.findElement(By.xpath(systemReceiveConfig_ConfigManageView_XPath)).findVisibleElement(By.xpath(systemReceiveConfig_ConfigManageView_XPath));
	}

	/**/
	public void documentMetedataConfig_ConfigManageView_click(){
		WebElement documentMetedataConfig_ConfigManageView = driver.findElement(By.xpath(documentMetedataConfig_ConfigManageView_XPath)).findVisibleElement(By.xpath(documentMetedataConfig_ConfigManageView_XPath));
		documentMetedataConfig_ConfigManageView.click();
	}

	/**/
	public WebElement get_documentMetedataConfig_ConfigManageView_Self(){
		return driver.findElement(By.xpath(documentMetedataConfig_ConfigManageView_XPath)).findVisibleElement(By.xpath(documentMetedataConfig_ConfigManageView_XPath));
	}

	/**/
	public void materialMetedataConfig_ConfigManageView_click(){
		WebElement materialMetedataConfig_ConfigManageView = driver.findElement(By.xpath(materialMetedataConfig_ConfigManageView_XPath)).findVisibleElement(By.xpath(materialMetedataConfig_ConfigManageView_XPath));
		materialMetedataConfig_ConfigManageView.click();
	}

	/**/
	public WebElement get_materialMetedataConfig_ConfigManageView_Self(){
		return driver.findElement(By.xpath(materialMetedataConfig_ConfigManageView_XPath)).findVisibleElement(By.xpath(materialMetedataConfig_ConfigManageView_XPath));
	}

	/**/
	public void documentClassDefinitionConfig_ConfigManageView_click(){
		WebElement documentClassDefinitionConfig_ConfigManageView = driver.findElement(By.xpath(documentClassDefinitionConfig_ConfigManageView_XPath)).findVisibleElement(By.xpath(documentClassDefinitionConfig_ConfigManageView_XPath));
		documentClassDefinitionConfig_ConfigManageView.click();
	}

	/**/
	public WebElement get_documentClassDefinitionConfig_ConfigManageView_Self(){
		return driver.findElement(By.xpath(documentClassDefinitionConfig_ConfigManageView_XPath)).findVisibleElement(By.xpath(documentClassDefinitionConfig_ConfigManageView_XPath));
	}

	/**/
	public void materialClassDefinitionConfig_ConfigManageView_click(){
		WebElement materialClassDefinitionConfig_ConfigManageView = driver.findElement(By.xpath(materialClassDefinitionConfig_ConfigManageView_XPath)).findVisibleElement(By.xpath(materialClassDefinitionConfig_ConfigManageView_XPath));
		materialClassDefinitionConfig_ConfigManageView.click();
	}

	/**/
	public WebElement get_materialClassDefinitionConfig_ConfigManageView_Self(){
		return driver.findElement(By.xpath(materialClassDefinitionConfig_ConfigManageView_XPath)).findVisibleElement(By.xpath(materialClassDefinitionConfig_ConfigManageView_XPath));
	}

	/**/
	public void nuclearFolderConfig_ConfigManageView_click(){
		WebElement nuclearFolderConfig_ConfigManageView = driver.findElement(By.xpath(nuclearFolderConfig_ConfigManageView_XPath)).findVisibleElement(By.xpath(nuclearFolderConfig_ConfigManageView_XPath));
		nuclearFolderConfig_ConfigManageView.click();
	}

	/**/
	public WebElement get_nuclearFolderConfig_ConfigManageView_Self(){
		return driver.findElement(By.xpath(nuclearFolderConfig_ConfigManageView_XPath)).findVisibleElement(By.xpath(nuclearFolderConfig_ConfigManageView_XPath));
	}

	/**/
	public void ActionPane_ConfigManageView_click(){
		WebElement ActionPane_ConfigManageView = driver.findElement(By.xpath(ActionPane_ConfigManageView_XPath)).findVisibleElement(By.xpath(ActionPane_ConfigManageView_XPath));
		ActionPane_ConfigManageView.click();
	}

	/**/
	public WebElement get_ActionPane_ConfigManageView_Self(){
		return driver.findElement(By.xpath(ActionPane_ConfigManageView_XPath)).findVisibleElement(By.xpath(ActionPane_ConfigManageView_XPath));
	}

	/**/
	public void documentClassAuthorize_ConfigManageView_click(){
		WebElement documentClassAuthorize_ConfigManageView = driver.findElement(By.xpath(documentClassAuthorize_ConfigManageView_XPath)).findVisibleElement(By.xpath(documentClassAuthorize_ConfigManageView_XPath));
		documentClassAuthorize_ConfigManageView.click();
	}

	/**/
	public WebElement get_documentClassAuthorize_ConfigManageView_Self(){
		return driver.findElement(By.xpath(documentClassAuthorize_ConfigManageView_XPath)).findVisibleElement(By.xpath(documentClassAuthorize_ConfigManageView_XPath));
	}

	/**/
	public void materialClassAuthorize_ConfigManageView_click(){
		WebElement materialClassAuthorize_ConfigManageView = driver.findElement(By.xpath(materialClassAuthorize_ConfigManageView_XPath)).findVisibleElement(By.xpath(materialClassAuthorize_ConfigManageView_XPath));
		materialClassAuthorize_ConfigManageView.click();
	}

	/**/
	public WebElement get_materialClassAuthorize_ConfigManageView_Self(){
		return driver.findElement(By.xpath(materialClassAuthorize_ConfigManageView_XPath)).findVisibleElement(By.xpath(materialClassAuthorize_ConfigManageView_XPath));
	}

	/**/
	public void importDocumentTemplateConfig_ConfigManageView_click(){
		WebElement importDocumentTemplateConfig_ConfigManageView = driver.findElement(By.xpath(importDocumentTemplateConfig_ConfigManageView_XPath)).findVisibleElement(By.xpath(importDocumentTemplateConfig_ConfigManageView_XPath));
		importDocumentTemplateConfig_ConfigManageView.click();
	}

	/**/
	public WebElement get_importDocumentTemplateConfig_ConfigManageView_Self(){
		return driver.findElement(By.xpath(importDocumentTemplateConfig_ConfigManageView_XPath)).findVisibleElement(By.xpath(importDocumentTemplateConfig_ConfigManageView_XPath));
	}

	/**/
	public void importMaterialTemplateConfig_ConfigManageView_click(){
		WebElement importMaterialTemplateConfig_ConfigManageView = driver.findElement(By.xpath(importMaterialTemplateConfig_ConfigManageView_XPath)).findVisibleElement(By.xpath(importMaterialTemplateConfig_ConfigManageView_XPath));
		importMaterialTemplateConfig_ConfigManageView.click();
	}

	/**/
	public WebElement get_importMaterialTemplateConfig_ConfigManageView_Self(){
		return driver.findElement(By.xpath(importMaterialTemplateConfig_ConfigManageView_XPath)).findVisibleElement(By.xpath(importMaterialTemplateConfig_ConfigManageView_XPath));
	}

	/**/
	public void documentViewConfig_ConfigManageView_click(){
		WebElement documentViewConfig_ConfigManageView = driver.findElement(By.xpath(documentViewConfig_ConfigManageView_XPath)).findVisibleElement(By.xpath(documentViewConfig_ConfigManageView_XPath));
		documentViewConfig_ConfigManageView.click();
	}

	/**/
	public WebElement get_documentViewConfig_ConfigManageView_Self(){
		return driver.findElement(By.xpath(documentViewConfig_ConfigManageView_XPath)).findVisibleElement(By.xpath(documentViewConfig_ConfigManageView_XPath));
	}

	/**/
	public void materialViewConfig_ConfigManageView_click(){
		WebElement materialViewConfig_ConfigManageView = driver.findElement(By.xpath(materialViewConfig_ConfigManageView_XPath)).findVisibleElement(By.xpath(materialViewConfig_ConfigManageView_XPath));
		materialViewConfig_ConfigManageView.click();
	}

	/**/
	public WebElement get_materialViewConfig_ConfigManageView_Self(){
		return driver.findElement(By.xpath(materialViewConfig_ConfigManageView_XPath)).findVisibleElement(By.xpath(materialViewConfig_ConfigManageView_XPath));
	}

	/**/
	public void nuclearFolderViewConfig_ConfigManageView_click(){
		WebElement nuclearFolderViewConfig_ConfigManageView = driver.findElement(By.xpath(nuclearFolderViewConfig_ConfigManageView_XPath)).findVisibleElement(By.xpath(nuclearFolderViewConfig_ConfigManageView_XPath));
		nuclearFolderViewConfig_ConfigManageView.click();
	}

	/**/
	public WebElement get_nuclearFolderViewConfig_ConfigManageView_Self(){
		return driver.findElement(By.xpath(nuclearFolderViewConfig_ConfigManageView_XPath)).findVisibleElement(By.xpath(nuclearFolderViewConfig_ConfigManageView_XPath));
	}

	/**/
	public void standardDistributionSchemaConfig_ConfigManageView_click(){
		WebElement standardDistributionSchemaConfig_ConfigManageView = driver.findElement(By.xpath(standardDistributionSchemaConfig_ConfigManageView_XPath)).findVisibleElement(By.xpath(standardDistributionSchemaConfig_ConfigManageView_XPath));
		standardDistributionSchemaConfig_ConfigManageView.click();
	}

	/**/
	public WebElement get_standardDistributionSchemaConfig_ConfigManageView_Self(){
		return driver.findElement(By.xpath(standardDistributionSchemaConfig_ConfigManageView_XPath)).findVisibleElement(By.xpath(standardDistributionSchemaConfig_ConfigManageView_XPath));
	}

	/**/
	public void documentTagConfig_ConfigManageView_click(){
		WebElement documentTagConfig_ConfigManageView = driver.findElement(By.xpath(documentTagConfig_ConfigManageView_XPath)).findVisibleElement(By.xpath(documentTagConfig_ConfigManageView_XPath));
		documentTagConfig_ConfigManageView.click();
	}

	/**/
	public WebElement get_documentTagConfig_ConfigManageView_Self(){
		return driver.findElement(By.xpath(documentTagConfig_ConfigManageView_XPath)).findVisibleElement(By.xpath(documentTagConfig_ConfigManageView_XPath));
	}

	/**/
	public void subjectTermConfig_ConfigManageView_click(){
		WebElement subjectTermConfig_ConfigManageView = driver.findElement(By.xpath(subjectTermConfig_ConfigManageView_XPath)).findVisibleElement(By.xpath(subjectTermConfig_ConfigManageView_XPath));
		subjectTermConfig_ConfigManageView.click();
	}

	/**/
	public WebElement get_subjectTermConfig_ConfigManageView_Self(){
		return driver.findElement(By.xpath(subjectTermConfig_ConfigManageView_XPath)).findVisibleElement(By.xpath(subjectTermConfig_ConfigManageView_XPath));
	}

	/**/
	public void documentVersionRuleConfig_ConfigManageView_click(){
		WebElement documentVersionRuleConfig_ConfigManageView = driver.findElement(By.xpath(documentVersionRuleConfig_ConfigManageView_XPath)).findVisibleElement(By.xpath(documentVersionRuleConfig_ConfigManageView_XPath));
		documentVersionRuleConfig_ConfigManageView.click();
	}

	/**/
	public WebElement get_documentVersionRuleConfig_ConfigManageView_Self(){
		return driver.findElement(By.xpath(documentVersionRuleConfig_ConfigManageView_XPath)).findVisibleElement(By.xpath(documentVersionRuleConfig_ConfigManageView_XPath));
	}

	/**/
	public void documentRelationshipRuleConfig_ConfigManageView_click(){
		WebElement documentRelationshipRuleConfig_ConfigManageView = driver.findElement(By.xpath(documentRelationshipRuleConfig_ConfigManageView_XPath)).findVisibleElement(By.xpath(documentRelationshipRuleConfig_ConfigManageView_XPath));
		documentRelationshipRuleConfig_ConfigManageView.click();
	}

	/**/
	public WebElement get_documentRelationshipRuleConfig_ConfigManageView_Self(){
		return driver.findElement(By.xpath(documentRelationshipRuleConfig_ConfigManageView_XPath)).findVisibleElement(By.xpath(documentRelationshipRuleConfig_ConfigManageView_XPath));
	}

	/**/
	public void classLinkRuleConfig_ConfigManageView_click(){
		WebElement classLinkRuleConfig_ConfigManageView = driver.findElement(By.xpath(classLinkRuleConfig_ConfigManageView_XPath)).findVisibleElement(By.xpath(classLinkRuleConfig_ConfigManageView_XPath));
		classLinkRuleConfig_ConfigManageView.click();
	}

	/**/
	public WebElement get_classLinkRuleConfig_ConfigManageView_Self(){
		return driver.findElement(By.xpath(classLinkRuleConfig_ConfigManageView_XPath)).findVisibleElement(By.xpath(classLinkRuleConfig_ConfigManageView_XPath));
	}

	/**/
	public void recordCodeRuleConfig_ConfigManageView_click(){
		WebElement recordCodeRuleConfig_ConfigManageView = driver.findElement(By.xpath(recordCodeRuleConfig_ConfigManageView_XPath)).findVisibleElement(By.xpath(recordCodeRuleConfig_ConfigManageView_XPath));
		recordCodeRuleConfig_ConfigManageView.click();
	}

	/**/
	public WebElement get_recordCodeRuleConfig_ConfigManageView_Self(){
		return driver.findElement(By.xpath(recordCodeRuleConfig_ConfigManageView_XPath)).findVisibleElement(By.xpath(recordCodeRuleConfig_ConfigManageView_XPath));
	}

	/**/
	public void archiveCodeRuleConfig_ConfigManageView_click(){
		WebElement archiveCodeRuleConfig_ConfigManageView = driver.findElement(By.xpath(archiveCodeRuleConfig_ConfigManageView_XPath)).findVisibleElement(By.xpath(archiveCodeRuleConfig_ConfigManageView_XPath));
		archiveCodeRuleConfig_ConfigManageView.click();
	}

	/**/
	public WebElement get_archiveCodeRuleConfig_ConfigManageView_Self(){
		return driver.findElement(By.xpath(archiveCodeRuleConfig_ConfigManageView_XPath)).findVisibleElement(By.xpath(archiveCodeRuleConfig_ConfigManageView_XPath));
	}

	/**/
	public void nuclearFolderCodeRuleConfig_ConfigManageView_click(){
		WebElement nuclearFolderCodeRuleConfig_ConfigManageView = driver.findElement(By.xpath(nuclearFolderCodeRuleConfig_ConfigManageView_XPath)).findVisibleElement(By.xpath(nuclearFolderCodeRuleConfig_ConfigManageView_XPath));
		nuclearFolderCodeRuleConfig_ConfigManageView.click();
	}

	/**/
	public WebElement get_nuclearFolderCodeRuleConfig_ConfigManageView_Self(){
		return driver.findElement(By.xpath(nuclearFolderCodeRuleConfig_ConfigManageView_XPath)).findVisibleElement(By.xpath(nuclearFolderCodeRuleConfig_ConfigManageView_XPath));
	}

	/**/
	public void distributionFormCodeRuleConfig_ConfigManageView_click(){
		WebElement distributionFormCodeRuleConfig_ConfigManageView = driver.findElement(By.xpath(distributionFormCodeRuleConfig_ConfigManageView_XPath)).findVisibleElement(By.xpath(distributionFormCodeRuleConfig_ConfigManageView_XPath));
		distributionFormCodeRuleConfig_ConfigManageView.click();
	}

	/**/
	public WebElement get_distributionFormCodeRuleConfig_ConfigManageView_Self(){
		return driver.findElement(By.xpath(distributionFormCodeRuleConfig_ConfigManageView_XPath)).findVisibleElement(By.xpath(distributionFormCodeRuleConfig_ConfigManageView_XPath));
	}

	/**/
	public void archiveAppraisalConfig_ConfigManageView_click(){
		WebElement archiveAppraisalConfig_ConfigManageView = driver.findElement(By.xpath(archiveAppraisalConfig_ConfigManageView_XPath)).findVisibleElement(By.xpath(archiveAppraisalConfig_ConfigManageView_XPath));
		archiveAppraisalConfig_ConfigManageView.click();
	}

	/**/
	public WebElement get_archiveAppraisalConfig_ConfigManageView_Self(){
		return driver.findElement(By.xpath(archiveAppraisalConfig_ConfigManageView_XPath)).findVisibleElement(By.xpath(archiveAppraisalConfig_ConfigManageView_XPath));
	}

	/**/
	public void scheduleJobConfig_ConfigManageView_click(){
		WebElement scheduleJobConfig_ConfigManageView = driver.findElement(By.xpath(scheduleJobConfig_ConfigManageView_XPath)).findVisibleElement(By.xpath(scheduleJobConfig_ConfigManageView_XPath));
		scheduleJobConfig_ConfigManageView.click();
	}

	/**/
	public WebElement get_scheduleJobConfig_ConfigManageView_Self(){
		return driver.findElement(By.xpath(scheduleJobConfig_ConfigManageView_XPath)).findVisibleElement(By.xpath(scheduleJobConfig_ConfigManageView_XPath));
	}

	/**/
	public void searchJobErrorLog_ConfigManageView_click(){
		WebElement searchJobErrorLog_ConfigManageView = driver.findElement(By.xpath(searchJobErrorLog_ConfigManageView_XPath)).findVisibleElement(By.xpath(searchJobErrorLog_ConfigManageView_XPath));
		searchJobErrorLog_ConfigManageView.click();
	}

	/**/
	public WebElement get_searchJobErrorLog_ConfigManageView_Self(){
		return driver.findElement(By.xpath(searchJobErrorLog_ConfigManageView_XPath)).findVisibleElement(By.xpath(searchJobErrorLog_ConfigManageView_XPath));
	}

	/**/
	public void documentManageStatistic_ReportView_click(){
		WebElement documentManageStatistic_ReportView = driver.findElement(By.xpath(documentManageStatistic_ReportView_XPath)).findVisibleElement(By.xpath(documentManageStatistic_ReportView_XPath));
		documentManageStatistic_ReportView.click();
	}

	/**/
	public WebElement get_documentManageStatistic_ReportView_Self(){
		return driver.findElement(By.xpath(documentManageStatistic_ReportView_XPath)).findVisibleElement(By.xpath(documentManageStatistic_ReportView_XPath));
	}

	/**/
	public void storeInfomationStatistic_ReportView_click(){
		WebElement storeInfomationStatistic_ReportView = driver.findElement(By.xpath(storeInfomationStatistic_ReportView_XPath)).findVisibleElement(By.xpath(storeInfomationStatistic_ReportView_XPath));
		storeInfomationStatistic_ReportView.click();
	}

	/**/
	public WebElement get_storeInfomationStatistic_ReportView_Self(){
		return driver.findElement(By.xpath(storeInfomationStatistic_ReportView_XPath)).findVisibleElement(By.xpath(storeInfomationStatistic_ReportView_XPath));
	}

	/**/
	public void bUPaperDocumentControlStatusStatistic_ReportView_click(){
		WebElement bUPaperDocumentControlStatusStatistic_ReportView = driver.findElement(By.xpath(bUPaperDocumentControlStatusStatistic_ReportView_XPath)).findVisibleElement(By.xpath(bUPaperDocumentControlStatusStatistic_ReportView_XPath));
		bUPaperDocumentControlStatusStatistic_ReportView.click();
	}

	/**/
	public WebElement get_bUPaperDocumentControlStatusStatistic_ReportView_Self(){
		return driver.findElement(By.xpath(bUPaperDocumentControlStatusStatistic_ReportView_XPath)).findVisibleElement(By.xpath(bUPaperDocumentControlStatusStatistic_ReportView_XPath));
	}

	/**/
	public void monthLossRepairArchiveStatusStatistic_ReportView_click(){
		WebElement monthLossRepairArchiveStatusStatistic_ReportView = driver.findElement(By.xpath(monthLossRepairArchiveStatusStatistic_ReportView_XPath)).findVisibleElement(By.xpath(monthLossRepairArchiveStatusStatistic_ReportView_XPath));
		monthLossRepairArchiveStatusStatistic_ReportView.click();
	}

	/**/
	public WebElement get_monthLossRepairArchiveStatusStatistic_ReportView_Self(){
		return driver.findElement(By.xpath(monthLossRepairArchiveStatusStatistic_ReportView_XPath)).findVisibleElement(By.xpath(monthLossRepairArchiveStatusStatistic_ReportView_XPath));
	}

	/**/
	public void newArchiveStatistic_ReportView_click(){
		WebElement newArchiveStatistic_ReportView = driver.findElement(By.xpath(newArchiveStatistic_ReportView_XPath)).findVisibleElement(By.xpath(newArchiveStatistic_ReportView_XPath));
		newArchiveStatistic_ReportView.click();
	}

	/**/
	public WebElement get_newArchiveStatistic_ReportView_Self(){
		return driver.findElement(By.xpath(newArchiveStatistic_ReportView_XPath)).findVisibleElement(By.xpath(newArchiveStatistic_ReportView_XPath));
	}

	/**/
	public void bussinessProcessManageStatistic_ReportView_click(){
		WebElement bussinessProcessManageStatistic_ReportView = driver.findElement(By.xpath(bussinessProcessManageStatistic_ReportView_XPath)).findVisibleElement(By.xpath(bussinessProcessManageStatistic_ReportView_XPath));
		bussinessProcessManageStatistic_ReportView.click();
	}

	/**/
	public WebElement get_bussinessProcessManageStatistic_ReportView_Self(){
		return driver.findElement(By.xpath(bussinessProcessManageStatistic_ReportView_XPath)).findVisibleElement(By.xpath(bussinessProcessManageStatistic_ReportView_XPath));
	}

	/**/
	public void stuffFinishedWorkflowStatistic_ReportView_click(){
		WebElement stuffFinishedWorkflowStatistic_ReportView = driver.findElement(By.xpath(stuffFinishedWorkflowStatistic_ReportView_XPath)).findVisibleElement(By.xpath(stuffFinishedWorkflowStatistic_ReportView_XPath));
		stuffFinishedWorkflowStatistic_ReportView.click();
	}

	/**/
	public WebElement get_stuffFinishedWorkflowStatistic_ReportView_Self(){
		return driver.findElement(By.xpath(stuffFinishedWorkflowStatistic_ReportView_XPath)).findVisibleElement(By.xpath(stuffFinishedWorkflowStatistic_ReportView_XPath));
	}

	/**/
	public void stuffTaskNumberStatistic_ReportView_click(){
		WebElement stuffTaskNumberStatistic_ReportView = driver.findElement(By.xpath(stuffTaskNumberStatistic_ReportView_XPath)).findVisibleElement(By.xpath(stuffTaskNumberStatistic_ReportView_XPath));
		stuffTaskNumberStatistic_ReportView.click();
	}

	/**/
	public WebElement get_stuffTaskNumberStatistic_ReportView_Self(){
		return driver.findElement(By.xpath(stuffTaskNumberStatistic_ReportView_XPath)).findVisibleElement(By.xpath(stuffTaskNumberStatistic_ReportView_XPath));
	}

	/**/
	public void departmentFinishedTaskStatistic_ReportView_click(){
		WebElement departmentFinishedTaskStatistic_ReportView = driver.findElement(By.xpath(departmentFinishedTaskStatistic_ReportView_XPath)).findVisibleElement(By.xpath(departmentFinishedTaskStatistic_ReportView_XPath));
		departmentFinishedTaskStatistic_ReportView.click();
	}

	/**/
	public WebElement get_departmentFinishedTaskStatistic_ReportView_Self(){
		return driver.findElement(By.xpath(departmentFinishedTaskStatistic_ReportView_XPath)).findVisibleElement(By.xpath(departmentFinishedTaskStatistic_ReportView_XPath));
	}

	/**/
	public void taskInTimeRateStatistic_ReportView_click(){
		WebElement taskInTimeRateStatistic_ReportView = driver.findElement(By.xpath(taskInTimeRateStatistic_ReportView_XPath)).findVisibleElement(By.xpath(taskInTimeRateStatistic_ReportView_XPath));
		taskInTimeRateStatistic_ReportView.click();
	}

	/**/
	public WebElement get_taskInTimeRateStatistic_ReportView_Self(){
		return driver.findElement(By.xpath(taskInTimeRateStatistic_ReportView_XPath)).findVisibleElement(By.xpath(taskInTimeRateStatistic_ReportView_XPath));
	}

	/**/
	public void currentWorkflowAccountStatistic_ReportView_click(){
		WebElement currentWorkflowAccountStatistic_ReportView = driver.findElement(By.xpath(currentWorkflowAccountStatistic_ReportView_XPath)).findVisibleElement(By.xpath(currentWorkflowAccountStatistic_ReportView_XPath));
		currentWorkflowAccountStatistic_ReportView.click();
	}

	/**/
	public WebElement get_currentWorkflowAccountStatistic_ReportView_Self(){
		return driver.findElement(By.xpath(currentWorkflowAccountStatistic_ReportView_XPath)).findVisibleElement(By.xpath(currentWorkflowAccountStatistic_ReportView_XPath));
	}

	/**/
	public void monthlyWorkflowAccountCompare_ReportView_click(){
		WebElement monthlyWorkflowAccountCompare_ReportView = driver.findElement(By.xpath(monthlyWorkflowAccountCompare_ReportView_XPath)).findVisibleElement(By.xpath(monthlyWorkflowAccountCompare_ReportView_XPath));
		monthlyWorkflowAccountCompare_ReportView.click();
	}

	/**/
	public WebElement get_monthlyWorkflowAccountCompare_ReportView_Self(){
		return driver.findElement(By.xpath(monthlyWorkflowAccountCompare_ReportView_XPath)).findVisibleElement(By.xpath(monthlyWorkflowAccountCompare_ReportView_XPath));
	}

	/**/
	public void monthlyAverageHandleTime_ReportView_click(){
		WebElement monthlyAverageHandleTime_ReportView = driver.findElement(By.xpath(monthlyAverageHandleTime_ReportView_XPath)).findVisibleElement(By.xpath(monthlyAverageHandleTime_ReportView_XPath));
		monthlyAverageHandleTime_ReportView.click();
	}

	/**/
	public WebElement get_monthlyAverageHandleTime_ReportView_Self(){
		return driver.findElement(By.xpath(monthlyAverageHandleTime_ReportView_XPath)).findVisibleElement(By.xpath(monthlyAverageHandleTime_ReportView_XPath));
	}

	/**/
	public void documentDistributeStatistic_ReportView_click(){
		WebElement documentDistributeStatistic_ReportView = driver.findElement(By.xpath(documentDistributeStatistic_ReportView_XPath)).findVisibleElement(By.xpath(documentDistributeStatistic_ReportView_XPath));
		documentDistributeStatistic_ReportView.click();
	}

	/**/
	public WebElement get_documentDistributeStatistic_ReportView_Self(){
		return driver.findElement(By.xpath(documentDistributeStatistic_ReportView_XPath)).findVisibleElement(By.xpath(documentDistributeStatistic_ReportView_XPath));
	}

	/**/
	public void monthlyDocumentDistributeStatistic_ReportView_click(){
		WebElement monthlyDocumentDistributeStatistic_ReportView = driver.findElement(By.xpath(monthlyDocumentDistributeStatistic_ReportView_XPath)).findVisibleElement(By.xpath(monthlyDocumentDistributeStatistic_ReportView_XPath));
		monthlyDocumentDistributeStatistic_ReportView.click();
	}

	/**/
	public WebElement get_monthlyDocumentDistributeStatistic_ReportView_Self(){
		return driver.findElement(By.xpath(monthlyDocumentDistributeStatistic_ReportView_XPath)).findVisibleElement(By.xpath(monthlyDocumentDistributeStatistic_ReportView_XPath));
	}

	/**/
	public void documentReceiveStatistic_ReportView_click(){
		WebElement documentReceiveStatistic_ReportView = driver.findElement(By.xpath(documentReceiveStatistic_ReportView_XPath)).findVisibleElement(By.xpath(documentReceiveStatistic_ReportView_XPath));
		documentReceiveStatistic_ReportView.click();
	}

	/**/
	public WebElement get_documentReceiveStatistic_ReportView_Self(){
		return driver.findElement(By.xpath(documentReceiveStatistic_ReportView_XPath)).findVisibleElement(By.xpath(documentReceiveStatistic_ReportView_XPath));
	}

	/**/
	public void materialManageStatistic_ReportView_click(){
		WebElement materialManageStatistic_ReportView = driver.findElement(By.xpath(materialManageStatistic_ReportView_XPath)).findVisibleElement(By.xpath(materialManageStatistic_ReportView_XPath));
		materialManageStatistic_ReportView.click();
	}

	/**/
	public WebElement get_materialManageStatistic_ReportView_Self(){
		return driver.findElement(By.xpath(materialManageStatistic_ReportView_XPath)).findVisibleElement(By.xpath(materialManageStatistic_ReportView_XPath));
	}

	/**/
	public void monthlyNewMaterialStatistic_ReportView_click(){
		WebElement monthlyNewMaterialStatistic_ReportView = driver.findElement(By.xpath(monthlyNewMaterialStatistic_ReportView_XPath)).findVisibleElement(By.xpath(monthlyNewMaterialStatistic_ReportView_XPath));
		monthlyNewMaterialStatistic_ReportView.click();
	}

	/**/
	public WebElement get_monthlyNewMaterialStatistic_ReportView_Self(){
		return driver.findElement(By.xpath(monthlyNewMaterialStatistic_ReportView_XPath)).findVisibleElement(By.xpath(monthlyNewMaterialStatistic_ReportView_XPath));
	}

	/**/
	public void borrowManageStatistic_ReportView_click(){
		WebElement borrowManageStatistic_ReportView = driver.findElement(By.xpath(borrowManageStatistic_ReportView_XPath)).findVisibleElement(By.xpath(borrowManageStatistic_ReportView_XPath));
		borrowManageStatistic_ReportView.click();
	}

	/**/
	public WebElement get_borrowManageStatistic_ReportView_Self(){
		return driver.findElement(By.xpath(borrowManageStatistic_ReportView_XPath)).findVisibleElement(By.xpath(borrowManageStatistic_ReportView_XPath));
	}

	/**/
	public void monthLyDocumentBorrowStatistic_ReportView_click(){
		WebElement monthLyDocumentBorrowStatistic_ReportView = driver.findElement(By.xpath(monthLyDocumentBorrowStatistic_ReportView_XPath)).findVisibleElement(By.xpath(monthLyDocumentBorrowStatistic_ReportView_XPath));
		monthLyDocumentBorrowStatistic_ReportView.click();
	}

	/**/
	public WebElement get_monthLyDocumentBorrowStatistic_ReportView_Self(){
		return driver.findElement(By.xpath(monthLyDocumentBorrowStatistic_ReportView_XPath)).findVisibleElement(By.xpath(monthLyDocumentBorrowStatistic_ReportView_XPath));
	}

	/**/
	public void searchUseStatistic_ReportView_click(){
		WebElement searchUseStatistic_ReportView = driver.findElement(By.xpath(searchUseStatistic_ReportView_XPath)).findVisibleElement(By.xpath(searchUseStatistic_ReportView_XPath));
		searchUseStatistic_ReportView.click();
	}

	/**/
	public WebElement get_searchUseStatistic_ReportView_Self(){
		return driver.findElement(By.xpath(searchUseStatistic_ReportView_XPath)).findVisibleElement(By.xpath(searchUseStatistic_ReportView_XPath));
	}

	/**/
	public void documentClassUseStatistic_ReportView_click(){
		WebElement documentClassUseStatistic_ReportView = driver.findElement(By.xpath(documentClassUseStatistic_ReportView_XPath)).findVisibleElement(By.xpath(documentClassUseStatistic_ReportView_XPath));
		documentClassUseStatistic_ReportView.click();
	}

	/**/
	public WebElement get_documentClassUseStatistic_ReportView_Self(){
		return driver.findElement(By.xpath(documentClassUseStatistic_ReportView_XPath)).findVisibleElement(By.xpath(documentClassUseStatistic_ReportView_XPath));
	}

	/**/
	public void documentBorrowRankStatistic_ReportView_click(){
		WebElement documentBorrowRankStatistic_ReportView = driver.findElement(By.xpath(documentBorrowRankStatistic_ReportView_XPath)).findVisibleElement(By.xpath(documentBorrowRankStatistic_ReportView_XPath));
		documentBorrowRankStatistic_ReportView.click();
	}

	/**/
	public WebElement get_documentBorrowRankStatistic_ReportView_Self(){
		return driver.findElement(By.xpath(documentBorrowRankStatistic_ReportView_XPath)).findVisibleElement(By.xpath(documentBorrowRankStatistic_ReportView_XPath));
	}

	/**/
	public void materialBorrowRankStatistic_ReportView_click(){
		WebElement materialBorrowRankStatistic_ReportView = driver.findElement(By.xpath(materialBorrowRankStatistic_ReportView_XPath)).findVisibleElement(By.xpath(materialBorrowRankStatistic_ReportView_XPath));
		materialBorrowRankStatistic_ReportView.click();
	}

	/**/
	public WebElement get_materialBorrowRankStatistic_ReportView_Self(){
		return driver.findElement(By.xpath(materialBorrowRankStatistic_ReportView_XPath)).findVisibleElement(By.xpath(materialBorrowRankStatistic_ReportView_XPath));
	}

	/**/
	public void documentDownloadRankStatistic_ReportView_click(){
		WebElement documentDownloadRankStatistic_ReportView = driver.findElement(By.xpath(documentDownloadRankStatistic_ReportView_XPath)).findVisibleElement(By.xpath(documentDownloadRankStatistic_ReportView_XPath));
		documentDownloadRankStatistic_ReportView.click();
	}

	/**/
	public WebElement get_documentDownloadRankStatistic_ReportView_Self(){
		return driver.findElement(By.xpath(documentDownloadRankStatistic_ReportView_XPath)).findVisibleElement(By.xpath(documentDownloadRankStatistic_ReportView_XPath));
	}

	/**/
	public void statisticOthers_ReportView_click(){
		WebElement statisticOthers_ReportView = driver.findElement(By.xpath(statisticOthers_ReportView_XPath)).findVisibleElement(By.xpath(statisticOthers_ReportView_XPath));
		statisticOthers_ReportView.click();
	}

	/**/
	public WebElement get_statisticOthers_ReportView_Self(){
		return driver.findElement(By.xpath(statisticOthers_ReportView_XPath)).findVisibleElement(By.xpath(statisticOthers_ReportView_XPath));
	}

	/**/
	public void archiveRoomBaseSituationAnnals_ReportView_click(){
		WebElement archiveRoomBaseSituationAnnals_ReportView = driver.findElement(By.xpath(archiveRoomBaseSituationAnnals_ReportView_XPath)).findVisibleElement(By.xpath(archiveRoomBaseSituationAnnals_ReportView_XPath));
		archiveRoomBaseSituationAnnals_ReportView.click();
	}

	/**/
	public WebElement get_archiveRoomBaseSituationAnnals_ReportView_Self(){
		return driver.findElement(By.xpath(archiveRoomBaseSituationAnnals_ReportView_XPath)).findVisibleElement(By.xpath(archiveRoomBaseSituationAnnals_ReportView_XPath));
	}

	/**/
	public void statisticList_ReportView_click(){
		WebElement statisticList_ReportView = driver.findElement(By.xpath(statisticList_ReportView_XPath)).findVisibleElement(By.xpath(statisticList_ReportView_XPath));
		statisticList_ReportView.click();
	}

	/**/
	public WebElement get_statisticList_ReportView_Self(){
		return driver.findElement(By.xpath(statisticList_ReportView_XPath)).findVisibleElement(By.xpath(statisticList_ReportView_XPath));
	}

	/**/
	public void manageProgramList_ReportView_click(){
		WebElement manageProgramList_ReportView = driver.findElement(By.xpath(manageProgramList_ReportView_XPath)).findVisibleElement(By.xpath(manageProgramList_ReportView_XPath));
		manageProgramList_ReportView.click();
	}

	/**/
	public WebElement get_manageProgramList_ReportView_Self(){
		return driver.findElement(By.xpath(manageProgramList_ReportView_XPath)).findVisibleElement(By.xpath(manageProgramList_ReportView_XPath));
	}

	/**/
	public void adminDispatchQueryList_ReportView_click(){
		WebElement adminDispatchQueryList_ReportView = driver.findElement(By.xpath(adminDispatchQueryList_ReportView_XPath)).findVisibleElement(By.xpath(adminDispatchQueryList_ReportView_XPath));
		adminDispatchQueryList_ReportView.click();
	}

	/**/
	public WebElement get_adminDispatchQueryList_ReportView_Self(){
		return driver.findElement(By.xpath(adminDispatchQueryList_ReportView_XPath)).findVisibleElement(By.xpath(adminDispatchQueryList_ReportView_XPath));
	}

	/**/
	public void adminReceiveQueryList_ReportView_click(){
		WebElement adminReceiveQueryList_ReportView = driver.findElement(By.xpath(adminReceiveQueryList_ReportView_XPath)).findVisibleElement(By.xpath(adminReceiveQueryList_ReportView_XPath));
		adminReceiveQueryList_ReportView.click();
	}

	/**/
	public WebElement get_adminReceiveQueryList_ReportView_Self(){
		return driver.findElement(By.xpath(adminReceiveQueryList_ReportView_XPath)).findVisibleElement(By.xpath(adminReceiveQueryList_ReportView_XPath));
	}

	/**/
	public void letterDispatchReplyReport_ReportView_click(){
		WebElement letterDispatchReplyReport_ReportView = driver.findElement(By.xpath(letterDispatchReplyReport_ReportView_XPath)).findVisibleElement(By.xpath(letterDispatchReplyReport_ReportView_XPath));
		letterDispatchReplyReport_ReportView.click();
	}

	/**/
	public WebElement get_letterDispatchReplyReport_ReportView_Self(){
		return driver.findElement(By.xpath(letterDispatchReplyReport_ReportView_XPath)).findVisibleElement(By.xpath(letterDispatchReplyReport_ReportView_XPath));
	}

	/**/
	public void letterReceiveReport_ReportView_click(){
		WebElement letterReceiveReport_ReportView = driver.findElement(By.xpath(letterReceiveReport_ReportView_XPath)).findVisibleElement(By.xpath(letterReceiveReport_ReportView_XPath));
		letterReceiveReport_ReportView.click();
	}

	/**/
	public WebElement get_letterReceiveReport_ReportView_Self(){
		return driver.findElement(By.xpath(letterReceiveReport_ReportView_XPath)).findVisibleElement(By.xpath(letterReceiveReport_ReportView_XPath));
	}

	/**/
	public void preUpgradeDocumentQueryList_ReportView_click(){
		WebElement preUpgradeDocumentQueryList_ReportView = driver.findElement(By.xpath(preUpgradeDocumentQueryList_ReportView_XPath)).findVisibleElement(By.xpath(preUpgradeDocumentQueryList_ReportView_XPath));
		preUpgradeDocumentQueryList_ReportView.click();
	}

	/**/
	public WebElement get_preUpgradeDocumentQueryList_ReportView_Self(){
		return driver.findElement(By.xpath(preUpgradeDocumentQueryList_ReportView_XPath)).findVisibleElement(By.xpath(preUpgradeDocumentQueryList_ReportView_XPath));
	}

	/**/
	public void overdueArchiveQueryList_ReportView_click(){
		WebElement overdueArchiveQueryList_ReportView = driver.findElement(By.xpath(overdueArchiveQueryList_ReportView_XPath)).findVisibleElement(By.xpath(overdueArchiveQueryList_ReportView_XPath));
		overdueArchiveQueryList_ReportView.click();
	}

	/**/
	public WebElement get_overdueArchiveQueryList_ReportView_Self(){
		return driver.findElement(By.xpath(overdueArchiveQueryList_ReportView_XPath)).findVisibleElement(By.xpath(overdueArchiveQueryList_ReportView_XPath));
	}

	/**/
	public void overdueMaterialQueryList_ReportView_click(){
		WebElement overdueMaterialQueryList_ReportView = driver.findElement(By.xpath(overdueMaterialQueryList_ReportView_XPath)).findVisibleElement(By.xpath(overdueMaterialQueryList_ReportView_XPath));
		overdueMaterialQueryList_ReportView.click();
	}

	/**/
	public WebElement get_overdueMaterialQueryList_ReportView_Self(){
		return driver.findElement(By.xpath(overdueMaterialQueryList_ReportView_XPath)).findVisibleElement(By.xpath(overdueMaterialQueryList_ReportView_XPath));
	}

	/**/
	public void documentDistributeRecordList_ReportView_click(){
		WebElement documentDistributeRecordList_ReportView = driver.findElement(By.xpath(documentDistributeRecordList_ReportView_XPath)).findVisibleElement(By.xpath(documentDistributeRecordList_ReportView_XPath));
		documentDistributeRecordList_ReportView.click();
	}

	/**/
	public WebElement get_documentDistributeRecordList_ReportView_Self(){
		return driver.findElement(By.xpath(documentDistributeRecordList_ReportView_XPath)).findVisibleElement(By.xpath(documentDistributeRecordList_ReportView_XPath));
	}

	/**/
	public void documentReceiveRecordList_ReportView_click(){
		WebElement documentReceiveRecordList_ReportView = driver.findElement(By.xpath(documentReceiveRecordList_ReportView_XPath)).findVisibleElement(By.xpath(documentReceiveRecordList_ReportView_XPath));
		documentReceiveRecordList_ReportView.click();
	}

	/**/
	public WebElement get_documentReceiveRecordList_ReportView_Self(){
		return driver.findElement(By.xpath(documentReceiveRecordList_ReportView_XPath)).findVisibleElement(By.xpath(documentReceiveRecordList_ReportView_XPath));
	}

	/**/
	public void paperDocumentControlList_ReportView_click(){
		WebElement paperDocumentControlList_ReportView = driver.findElement(By.xpath(paperDocumentControlList_ReportView_XPath)).findVisibleElement(By.xpath(paperDocumentControlList_ReportView_XPath));
		paperDocumentControlList_ReportView.click();
	}

	/**/
	public WebElement get_paperDocumentControlList_ReportView_Self(){
		return driver.findElement(By.xpath(paperDocumentControlList_ReportView_XPath)).findVisibleElement(By.xpath(paperDocumentControlList_ReportView_XPath));
	}

}