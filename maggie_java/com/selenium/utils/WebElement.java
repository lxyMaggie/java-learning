package com.selenium.utils;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;

public class WebElement implements org.openqa.selenium.WebElement
{
	org.openqa.selenium.WebElement element;
	org.openqa.selenium.WebDriver driver;
	
	public WebElement(org.openqa.selenium.WebElement element, org.openqa.selenium.WebDriver driver)
	{
		this.element = element;
		this.driver = driver;
	}
	
	/**
	 * Get the element this WebElement represents
	 * @return
	 */
	public org.openqa.selenium.WebElement getElement()
	{
		return element;
	}
	
	/**
	 * Get the driver this WebElement came from 
	 * DO NOT use findElement/s on this object. Create a new com.selenium.utils.WebElement first
	 * @return
	 */
	public WebDriver getDriver()
	{
		return new WebDriver(driver);
	}
	
	@Override
	public WebElement findElement(By by) {
		return new WebElement(element.findElement(by), driver);
	}

	public WebElement findVisibleElement(By by)
	{
		List<WebElement> list = findAll(by);
		for(WebElement e : list)
		{
			if(e.isDisplayed() == true)
				return e;
		}
		return null;
	}
	
	public List<WebElement> findAll(By by)
	{
		List<com.selenium.utils.WebElement> elements = new ArrayList<com.selenium.utils.WebElement>();
		for(org.openqa.selenium.WebElement e : element.findElements(by))
		{
				elements.add(new com.selenium.utils.WebElement(e, driver));
		}
		return elements;
	}

	@Override
	public void clear() {
		element.clear();
	}

	@Override
	public void click() {
		element.click();
		//AjaxHelper.waitForAjax(this.getDriver(), 60000, 500);
	}

	@Override
	public List<org.openqa.selenium.WebElement> findElements(By arg0) {
		return element.findElements(arg0);
	}

	@Override
	public String getAttribute(String arg0) {
		// TODO Auto-generated method stub
		return element.getAttribute(arg0);
	}

	@Override
	public String getCssValue(String arg0) {
		return element.getCssValue(arg0);
	}

	@Override
	public Point getLocation() {
		return element.getLocation();
	}

	@Override
	public Dimension getSize() {
		return element.getSize();
	}

	@Override
	public String getTagName() {
		return element.getTagName();
	}

	@Override
	public String getText() {
		return element.getText();
	}

	@Override
	public boolean isDisplayed() {
		return element.isDisplayed();
	}

	@Override
	public boolean isEnabled() {
		return element.isEnabled();
	}

	@Override
	public boolean isSelected() {
		return element.isSelected();
	}

	@Override
	public void sendKeys(CharSequence... arg0) {
		element.sendKeys(arg0);
	}

	@Override
	public void submit() {
		element.submit();
	}
	
}
