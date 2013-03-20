package com.ibm.CNNC.elements;

import org.openqa.selenium.*;
import com.selenium.utils.WebDriver;
import com.selenium.utils.WebElement;

/*catalog\widget\common\sysnav\templates\SysNav.html*/
public class SysNav {
	protected WebDriver driver;
	private static final String unifyReceiveBtn_XPath="//descendant::div[contains(@id,'SysNav')]/descendant::span[contains(@id,'SysNav')][contains(@id,'_unifyReceive')][contains(@id, 'Button')][normalize-space(text())='"+"统一接收与处理"+"']";
	private static final String documentDistributeBtn_XPath="//descendant::div[contains(@id,'SysNav')]/descendant::span[contains(@id,'SysNav')][contains(@id,'_documentDistribute')][contains(@id, 'Button')][normalize-space(text())='"+"文件分发管理"+"']";
	private static final String documentArchiveBtn_XPath="//descendant::div[contains(@id,'SysNav')]/descendant::span[contains(@id,'SysNav')][contains(@id,'_documentArchive')][contains(@id, 'Button')][normalize-space(text())='"+"文件归档"+"']";
	private static final String archiveStoreBtn_XPath="//descendant::div[contains(@id,'SysNav')]/descendant::span[contains(@id,'SysNav')][contains(@id,'_archiveStore')][contains(@id, 'Button')][normalize-space(text())='"+"档案入库"+"']";
	private static final String archiveKeepAndDisposeBtn_XPath="//descendant::div[contains(@id,'SysNav')]/descendant::span[contains(@id,'SysNav')][contains(@id,'_archiveKeepAndDispose')][contains(@id, 'Button')][normalize-space(text())='"+"档案保管与处置"+"']";
	private static final String documentManageBtn_XPath="//descendant::div[contains(@id,'SysNav')]/descendant::span[contains(@id,'SysNav')][contains(@id,'_documentManage')][contains(@id, 'Button')][normalize-space(text())='"+"文件管理"+"']";
	private static final String materialManageBtn_XPath="//descendant::div[contains(@id,'SysNav')]/descendant::span[contains(@id,'SysNav')][contains(@id,'_materialManage')][contains(@id, 'Button')][normalize-space(text())='"+"资料管理"+"']";
	private static final String borrowManageBtn_XPath="//descendant::div[contains(@id,'SysNav')]/descendant::span[contains(@id,'SysNav')][contains(@id,'_borrowManage')][contains(@id, 'Button')][normalize-space(text())='"+"借阅管理"+"']";
	private static final String searchUseBtn_XPath="//descendant::div[contains(@id,'SysNav')]/descendant::span[contains(@id,'SysNav')][contains(@id,'_searchUse')][contains(@id, 'Button')][normalize-space(text())='"+"综合查询利用"+"']";
	private static final String headquarterManageBtn_XPath="//descendant::div[contains(@id,'SysNav')]/descendant::span[contains(@id,'SysNav')][contains(@id,'_headquarterManage')][contains(@id, 'Button')][normalize-space(text())='"+"本部管控"+"']";
	private static final String materialShareBtn_XPath="//descendant::div[contains(@id,'SysNav')]/descendant::span[contains(@id,'SysNav')][contains(@id,'_materialShare')][contains(@id, 'Button')][normalize-space(text())='"+"资料共享"+"']";
	private static final String configManageBtn_XPath="//descendant::div[contains(@id,'SysNav')]/descendant::span[contains(@id,'SysNav')][contains(@id,'_configManage')][contains(@id, 'Button')][normalize-space(text())='"+"系统管理"+"']";

	//----Constructor Methods Begin----
	public SysNav(WebDriver driver){
		this.driver=driver;
	}

	/*SysNav->unifyReceiveBtn*/
	public void unifyReceiveBtn_click(){
		WebElement unifyReceiveBtn = driver.findElement(By.xpath(unifyReceiveBtn_XPath)).findVisibleElement(By.xpath(unifyReceiveBtn_XPath));
		unifyReceiveBtn.click();
	}

	/*SysNav->unifyReceiveBtn*/
	public WebElement get_unifyReceiveBtn_Self(){
		return driver.findElement(By.xpath(unifyReceiveBtn_XPath)).findVisibleElement(By.xpath(unifyReceiveBtn_XPath));
	}

	/*SysNav->documentDistributeBtn*/
	public void documentDistributeBtn_click(){
		WebElement documentDistributeBtn = driver.findElement(By.xpath(documentDistributeBtn_XPath)).findVisibleElement(By.xpath(documentDistributeBtn_XPath));
		documentDistributeBtn.click();
	}

	/*SysNav->documentDistributeBtn*/
	public WebElement get_documentDistributeBtn_Self(){
		return driver.findElement(By.xpath(documentDistributeBtn_XPath)).findVisibleElement(By.xpath(documentDistributeBtn_XPath));
	}

	/*SysNav->documentArchiveBtn*/
	public void documentArchiveBtn_click(){
		WebElement documentArchiveBtn = driver.findElement(By.xpath(documentArchiveBtn_XPath)).findVisibleElement(By.xpath(documentArchiveBtn_XPath));
		documentArchiveBtn.click();
	}

	/*SysNav->documentArchiveBtn*/
	public WebElement get_documentArchiveBtn_Self(){
		return driver.findElement(By.xpath(documentArchiveBtn_XPath)).findVisibleElement(By.xpath(documentArchiveBtn_XPath));
	}

	/*SysNav->archiveStoreBtn*/
	public void archiveStoreBtn_click(){
		WebElement archiveStoreBtn = driver.findElement(By.xpath(archiveStoreBtn_XPath)).findVisibleElement(By.xpath(archiveStoreBtn_XPath));
		archiveStoreBtn.click();
	}

	/*SysNav->archiveStoreBtn*/
	public WebElement get_archiveStoreBtn_Self(){
		return driver.findElement(By.xpath(archiveStoreBtn_XPath)).findVisibleElement(By.xpath(archiveStoreBtn_XPath));
	}

	/*SysNav->archiveKeepAndDisposeBtn*/
	public void archiveKeepAndDisposeBtn_click(){
		WebElement archiveKeepAndDisposeBtn = driver.findElement(By.xpath(archiveKeepAndDisposeBtn_XPath)).findVisibleElement(By.xpath(archiveKeepAndDisposeBtn_XPath));
		archiveKeepAndDisposeBtn.click();
	}

	/*SysNav->archiveKeepAndDisposeBtn*/
	public WebElement get_archiveKeepAndDisposeBtn_Self(){
		return driver.findElement(By.xpath(archiveKeepAndDisposeBtn_XPath)).findVisibleElement(By.xpath(archiveKeepAndDisposeBtn_XPath));
	}

	/*SysNav->documentManageBtn*/
	public void documentManageBtn_click(){
		WebElement documentManageBtn = driver.findElement(By.xpath(documentManageBtn_XPath)).findVisibleElement(By.xpath(documentManageBtn_XPath));
		documentManageBtn.click();
	}

	/*SysNav->documentManageBtn*/
	public WebElement get_documentManageBtn_Self(){
		return driver.findElement(By.xpath(documentManageBtn_XPath)).findVisibleElement(By.xpath(documentManageBtn_XPath));
	}

	/*SysNav->materialManageBtn*/
	public void materialManageBtn_click(){
		WebElement materialManageBtn = driver.findElement(By.xpath(materialManageBtn_XPath)).findVisibleElement(By.xpath(materialManageBtn_XPath));
		materialManageBtn.click();
	}

	/*SysNav->materialManageBtn*/
	public WebElement get_materialManageBtn_Self(){
		return driver.findElement(By.xpath(materialManageBtn_XPath)).findVisibleElement(By.xpath(materialManageBtn_XPath));
	}

	/*SysNav->borrowManageBtn*/
	public void borrowManageBtn_click(){
		WebElement borrowManageBtn = driver.findElement(By.xpath(borrowManageBtn_XPath)).findVisibleElement(By.xpath(borrowManageBtn_XPath));
		borrowManageBtn.click();
	}

	/*SysNav->borrowManageBtn*/
	public WebElement get_borrowManageBtn_Self(){
		return driver.findElement(By.xpath(borrowManageBtn_XPath)).findVisibleElement(By.xpath(borrowManageBtn_XPath));
	}

	/*SysNav->searchUseBtn*/
	public void searchUseBtn_click(){
		WebElement searchUseBtn = driver.findElement(By.xpath(searchUseBtn_XPath)).findVisibleElement(By.xpath(searchUseBtn_XPath));
		searchUseBtn.click();
	}

	/*SysNav->searchUseBtn*/
	public WebElement get_searchUseBtn_Self(){
		return driver.findElement(By.xpath(searchUseBtn_XPath)).findVisibleElement(By.xpath(searchUseBtn_XPath));
	}

	/*SysNav->headquarterManageBtn*/
	public void headquarterManageBtn_click(){
		WebElement headquarterManageBtn = driver.findElement(By.xpath(headquarterManageBtn_XPath)).findVisibleElement(By.xpath(headquarterManageBtn_XPath));
		headquarterManageBtn.click();
	}

	/*SysNav->headquarterManageBtn*/
	public WebElement get_headquarterManageBtn_Self(){
		return driver.findElement(By.xpath(headquarterManageBtn_XPath)).findVisibleElement(By.xpath(headquarterManageBtn_XPath));
	}

	/*SysNav->materialShareBtn*/
	public void materialShareBtn_click(){
		WebElement materialShareBtn = driver.findElement(By.xpath(materialShareBtn_XPath)).findVisibleElement(By.xpath(materialShareBtn_XPath));
		materialShareBtn.click();
	}

	/*SysNav->materialShareBtn*/
	public WebElement get_materialShareBtn_Self(){
		return driver.findElement(By.xpath(materialShareBtn_XPath)).findVisibleElement(By.xpath(materialShareBtn_XPath));
	}

	/*SysNav->configManageBtn*/
	public void configManageBtn_click(){
		WebElement configManageBtn = driver.findElement(By.xpath(configManageBtn_XPath)).findVisibleElement(By.xpath(configManageBtn_XPath));
		configManageBtn.click();
	}

	/*SysNav->configManageBtn*/
	public WebElement get_configManageBtn_Self(){
		return driver.findElement(By.xpath(configManageBtn_XPath)).findVisibleElement(By.xpath(configManageBtn_XPath));
	}

}
