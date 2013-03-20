package com.ibm.CNNC.page;

import org.openqa.selenium.By;

import com.selenium.utils.WebDriver;
import com.selenium.utils.WebElement;

public class CheckBoxTreeView {

	protected WebDriver driver;
	public CheckBoxTreeView (WebDriver driver){
		this.driver=driver;
	}

	/*  public void selectConditions(String conditionString) throws Exception{

		String[][] conditions = splitConditionString(conditionString);	
		System.out.println("string condition is "+conditions);
		System.out.println("the length of conditions is "+conditions.length);
		for (int i = 0; i< conditions.length; i++){	
			for(int j =0 ; j< conditions[i].length;j++){
				if (conditions[i][j]!=null && ! conditions[i][j].equals(""))
				{
				if (j<conditions[i].length-1 )
				{
				   expandImg_click(conditions[i][j]);
				   Thread.sleep(1000);
				} else 
				{
					checkBox_check(conditions[i][j]);
					Thread.sleep(1000);
					if (j != 0) //如果只有一级节点，不需要合上节点
					{
					expandImg_click(conditions[i][0]);
					Thread.sleep(1000);
					}
				}				
			    }	
		  }	
		}
	}

	private String[][] splitConditionString (String str) {		

		String[] strArray = str.split(";");
		String[][] conditions = new String[strArray.length][];
		System.out.println("strArray is"+strArray);
		for(int i =0; i < strArray.length ; i++)
		{
			conditions[i] = new String[strArray[i].split("/").length];			
			conditions[i] = strArray[i].split("/");
		}		
		return conditions ;
	}*/
	private static final String categoryImg_XPath="//descendant::div[contains(@id,'CheckBoxTree')]/descendant::span[normalize-space(text())='文件分类']/../../descendant::img[contains(@class,'dijitTreeExpando')]";
	public void categoryImg_click(){
		WebElement expandImg = driver.findElement(By.xpath(categoryImg_XPath)).findVisibleElement(By.xpath(categoryImg_XPath));
		expandImg.click();
	}
	private static final String UpstreamImg_XPath="//descendant::div[contains(@id,'CheckBoxTree')]/descendant::span[normalize-space(text())='上游文件']/../../descendant::img[contains(@class,'dijitTreeExpando')]";
	public void upstreamImg_click(){
		WebElement expandImg = driver.findElement(By.xpath(UpstreamImg_XPath)).findVisibleElement(By.xpath(UpstreamImg_XPath));
		expandImg.click();
	}
	private static final String fieldImg_XPath="//descendant::div[contains(@id,'CheckBoxTree')]/descendant::span[normalize-space(text())='业务领域']/../../descendant::img[contains(@class,'dijitTreeExpando')]";
	public void fieldImg_click(){
		WebElement expandImg = driver.findElement(By.xpath(fieldImg_XPath)).findVisibleElement(By.xpath(fieldImg_XPath));
		expandImg.click();
	}

	private static final String organizationImg_XPath="//descendant::div[contains(@id,'CheckBoxTree')]/descendant::span[normalize-space(text())='组织机构']/../../descendant::img[contains(@class,'dijitTreeExpando')]";
	public void organizationImg_click(){
		WebElement expandImg = driver.findElement(By.xpath(organizationImg_XPath)).findVisibleElement(By.xpath(organizationImg_XPath));
		expandImg.click();
	}
	private static final String lifeperiodImg_XPath="//descendant::div[contains(@id,'CheckBoxTree')]/descendant::span[normalize-space(text())='核电生命周期']/../../descendant::img[contains(@class,'dijitTreeExpando')]";
	public void lifeperiodImg_click(){
		WebElement expandImg = driver.findElement(By.xpath(lifeperiodImg_XPath)).findVisibleElement(By.xpath(lifeperiodImg_XPath));
		expandImg.click();
	}
	private static final String AllcategoryImg_XPath="//descendant::div[contains(@id,'CheckBoxTree')]";
	public void categoryImg_click(String selectStr){
		WebElement expandImg = driver.findElement(By.xpath(AllcategoryImg_XPath+"/descendant::span[normalize-space(text())='"+selectStr+"']/../../descendant::img[contains(@class,'dijitTreeExpando')]")).findVisibleElement(By.xpath(AllcategoryImg_XPath+"/descendant::span[normalize-space(text())='"+selectStr+"']/../../descendant::img[contains(@class,'dijitTreeExpando')]"));
		expandImg.click();
	}

	private static final String checkBox_XPath="//descendant::div[contains(@id,'CheckBoxTree')]";
	public void checkBox_check(String str){
		WebElement checkBox = driver.findElement(By.xpath(checkBox_XPath+"/descendant::span[normalize-space(text())='"+str+"']/../../descendant::input[contains(@id,'CheckBox')]")).findVisibleElement(By.xpath(checkBox_XPath+"/descendant::span[normalize-space(text())='"+str+"']/../../descendant::input[contains(@id,'CheckBox')]"));
		if(!checkBox.isSelected()){
			checkBox.click();
			}
	}
}
