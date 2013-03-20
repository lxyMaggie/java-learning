import java.awt.Toolkit;
import java.util.concurrent.TimeUnit;
import static org.junit.Assert.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ibm.CNNC.elements.*;
import com.selenium.utils.AjaxHelper;
import com.selenium.utils.DriverHelper;
import com.selenium.utils.WebDriver;

  

public class testCNNC {
	private WebDriver driver;
	private String baseUrl;
	private StringBuffer verificationErrors = new StringBuffer();
	
	@BeforeClass
	public void setUp() throws Exception {
		//driver = new FirefoxDriver();
		driver = DriverHelper.setUpDriver(null, "firefox");
		baseUrl = "http://9.181.129.108:81/cnnpdm/";
		//baseUrl = "http://9.181.141.96:9080/";
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		
		//Login();
	}

	@Test(description="Test This Thing")
	public void Login() throws Exception {
		
		Thread.sleep(1000);
		driver.get(baseUrl);
		driver.manage().window().maximize();
        
		Thread.sleep(5000);
		driver.findElement(By.xpath("//descendant::img[contains(@id,'login')]")).getSize();
		//AjaxHelper.setUpAjaxMonitor(driver);
		//////Login to administrator desktop
		LoginPaneSSO Login = new LoginPaneSSO(driver);
		Login.userId_input("19986054");
		Thread.sleep(1000);
		Login.password_input("password");
		Thread.sleep(1000);
		Login.loginButton_click();
		Thread.sleep(5000);
		////////////////End of login//

		SystemNavigation SystemNavigator = new SystemNavigation(driver); 
		Thread.sleep(5000);
		SystemNavigator.SystemNavigation_UnifyReceiveView_click();
		Thread.sleep(1000);
		SystemNavigator.systemReceive_UnifyReceiveView_click();
		Thread.sleep(1000);
		SystemNavigator.SystemNavigation_BorrowManageView_click();
		Thread.sleep(1000);
		SystemNavigator.SystemNavigation_DocumentDistributeView_click();
		Thread.sleep(1000);
		SystemNavigator.documentDistributionManage_DocumentDistributeView_click();
		Thread.sleep(1000);
		SystemNavigator.SystemNavigation_DocumentManageView_click();

	}  

	@Test(description="Test This Thing")
	public void Login1() throws Exception {
		
		Thread.sleep(1000);
		driver.get(baseUrl);
		//driver.manage().window().maximize();
        
		Thread.sleep(5000);
		driver.findElement(By.xpath("//descendant::img[contains(@id,'login')]")).getSize();
		//AjaxHelper.setUpAjaxMonitor(driver);
		//////Login to administrator desktop
		LoginPaneSSO Login = new LoginPaneSSO(driver);
		Login.userId_input("19986054");
		Thread.sleep(1000);
		Login.password_input("password");
		Thread.sleep(1000);
		Login.loginButton_click();
		Thread.sleep(5000);
		////////////////End of login

		SystemNavigation SystemNavigator = new SystemNavigation(driver); 
		Thread.sleep(5000);
		SystemNavigator.SystemNavigation_UnifyReceiveView_click();
		Thread.sleep(1000);
		SystemNavigator.systemReceive_UnifyReceiveView_click();
		Thread.sleep(1000);
		SystemNavigator.SystemNavigation_BorrowManageView_click();
		Thread.sleep(1000);
		SystemNavigator.SystemNavigation_DocumentDistributeView_click();
		Thread.sleep(1000);
		SystemNavigator.documentDistributionManage_DocumentDistributeView_click();
		Thread.sleep(1000);
		SystemNavigator.SystemNavigation_DocumentManageView_click();

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
}
