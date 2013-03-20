package com.selenium.utils;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementHelper {
	public static int TIMEOUT = 60;
	public static int ACTION_WAIT = 10;

	/**
	 * Gets the parent of the WebElement.
	 * @param e WebElement
	 * @return WebElement
	 */
	public static WebElement getParent(WebElement e) {
		return e.findElement(By.xpath(".."));
	}

	public static WebElement tryFindElement(WebDriver webDriver, String xpath, int timeout){
		return ElementHelper.tryFindElement(webDriver, null, xpath, timeout);
	}

	public static WebElement tryFindElement(WebElement webElement, String xpath, int timeout){
		return ElementHelper.tryFindElement(null, webElement, xpath, timeout);
	}

	private static WebElement tryFindElement(WebDriver webDriver, WebElement webElement, String xpath, int timeout){
		SearchContext searchContext = (webElement != null) ? webElement : webDriver;
		WebElement element = null;
		int sleep = 500;
		int iterations = timeout/sleep;
		sleep = timeout/iterations;
		while (iterations > 0){
			try{
				element = searchContext.findElement(By.xpath(xpath));
			}catch(NoSuchElementException nsee){
				try {
					Thread.sleep(sleep);
				} catch (InterruptedException e) {}
				iterations--;
				continue;
			}
			break;
		}
		return element;
	}


	public static WebElement waitForElementVisible(WebDriver driver, final By locator) {
		return waitForElement(driver, locator, true, TIMEOUT, false);
	}

	public static WebElement waitForElementDisappear(WebDriver driver, final By locator) {
		return waitForElement(driver, locator, false, TIMEOUT, false);
	}

	/**
	 * Ensure that the locator can only find 1 result when displayFlag is false.
	 * means wait for the windows disappeared.
	 */
	public static WebElement waitForElement(WebDriver driver, final By locator, final boolean displayFlag, int timeout, final boolean debug) {
		Wait<WebDriver> wait = new WebDriverWait(driver, timeout);
		WebElement element = wait.until(new ExpectedCondition<WebElement>() {
			public WebElement apply(WebDriver driver) {
				List<WebElement> elementList = driver.findElements(locator);
				if (debug) {
					System.out.println(" -=-=- Elements found: " + elementList.size());
				}
				for (WebElement element : elementList) {
					if (debug) {
						System.out.println(" -=-=- element : " + element.getAttribute("id"));
					}

					if (element.isDisplayed() == displayFlag) {
						return element;
					}
				}
				return null;
			}
		});
		return element;
	}

	
	/* It's often a good idea to wait a little bit longer after waiting for an element. For example, a system may display a Success message
	 * and then enable a button. If the test code waits for the Success message and then clicks the button, the button may not be enabled
	 * when the Success element is detected. This method adds an additional sleep time to try to handle these race conditions. */
	public static WebElement waitForElementPlus(WebDriver driver, final By locator, final boolean displayFlag, int timeout, final boolean debug) throws InterruptedException
	{
		WebElement element = waitForElement(driver, locator, displayFlag, timeout, debug);
		if (element != null)
			Thread.sleep(300);
		return element;
	}
	
	public static WebElement waitForElementVisibleImplicitly(WebDriver driver, WebElement parentElement, final By locator) {
		return waitForElementVisibleImplicitly(driver, parentElement, locator, TIMEOUT);
	}

	public static WebElement waitForElementVisibleImplicitly(WebDriver driver, WebElement parentElement, final By locator, int timeout) {
		driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);

		List<WebElement> elementList = parentElement.findElements(locator);
		for (WebElement element : elementList) {
			if (element.isDisplayed()) {
				driver.manage().timeouts().implicitlyWait(ACTION_WAIT, TimeUnit.SECONDS);
				return element;
			}
		}

		driver.manage().timeouts().implicitlyWait(ACTION_WAIT, TimeUnit.SECONDS);
		return null;
	}

	public static void waitForNewWindow(WebDriver driver, int currentWindowNumber) throws Exception {
		Set<String> windows = driver.getWindowHandles();
		for (int i = 0; i < 6000; i++) {
			if (windows.size() > currentWindowNumber) {
				return;
			}
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
			}
		}
		throw new Exception();
	}

}
