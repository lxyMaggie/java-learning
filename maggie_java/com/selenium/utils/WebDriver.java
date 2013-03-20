package com.selenium.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriver implements org.openqa.selenium.WebDriver, org.openqa.selenium.TakesScreenshot
{
	org.openqa.selenium.WebDriver driver;
	public WebDriver(org.openqa.selenium.WebDriver driver)
	{
		this.driver = driver;
	}
	
	/**
	 * Get the driver this WebDriver represents
	 * @return
	 */
	public org.openqa.selenium.WebDriver getDriver()
	{
		return driver;
	}
	
	@Override
	public com.selenium.utils.WebElement findElement(By by) {
		//System.out.println("driver findElement called " );
		return new WebElement(driver.findElement(by), driver);
	}
	
	public List<com.selenium.utils.WebElement> findAll(By by) {
		//System.out.println("driver findElements called " );
		List<com.selenium.utils.WebElement> elements = new ArrayList<com.selenium.utils.WebElement>();
		for(org.openqa.selenium.WebElement element : driver.findElements(by))
		{
			elements.add(new com.selenium.utils.WebElement(element, driver));
		}
		
		return elements;
	}
	@Override
	public void close() {
		driver.close();
	}
	@Override
	public List<org.openqa.selenium.WebElement> findElements(By arg0) {
		return driver.findElements(arg0);
	}
	@Override
	public void get(String arg0) {
		driver.get(arg0);
	}
	@Override
	public String getCurrentUrl() {
		return driver.getCurrentUrl();
	}
	@Override
	public String getPageSource() {
		return driver.getPageSource();
	}
	@Override
	public String getTitle() {
		return driver.getTitle();
	}
	@Override
	public String getWindowHandle() {
		return driver.getWindowHandle();
	}
	@Override
	public Set<String> getWindowHandles() {
		return driver.getWindowHandles();
	}
	@Override
	public Options manage() {
		return driver.manage();
	}
	@Override
	public Navigation navigate() {
		return driver.navigate();
	}
	@Override
	public void quit() {
		driver.quit();
	}
	@Override
	public TargetLocator switchTo() {
		return driver.switchTo();
	}

	@Override
	public <X> X getScreenshotAs(OutputType<X> arg0) throws WebDriverException {
		//Firefox only for now.
		return ((FirefoxDriver)driver).getScreenshotAs(arg0);
	}
}
