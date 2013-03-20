package com.ibm.CNNC.elements;

import org.openqa.selenium.By;

import com.selenium.utils.WebDriver;
import com.selenium.utils.WebElement;

public class DepartmentLibTreeNode {

	protected WebDriver driver;
	private static final String DepartmentTreeNode_XPath="//descendant::div[contains(@id,'DepartmentLibTagTree')]/descendant::div[contains(@id,'dijit__TreeNode')]";
	private static final String CommomTreeNode_XPath="//descendant::div[contains(@id,'dijit_commontree_ExtendTree')]//descendant::div[contains(@id,'dijit__TreeNode')]";
	public DepartmentLibTreeNode(WebDriver driver){
		this.driver=driver;
	}
	//部门库
	public void DepartmentTreeNode_Click(String selectStr){
		WebElement treenode=driver.findElement(By.xpath(DepartmentTreeNode_XPath+"/descendant::span[normalize-space(text())='"+selectStr+"']")).findVisibleElement(By.xpath(DepartmentTreeNode_XPath+"//descendant::span[normalize-space(text())='"+selectStr+"']"));
		treenode.click();
	}
	WebElement get_DepartmentTreeNode_Self(String selectStr){
		return driver.findElement(By.xpath(DepartmentTreeNode_XPath+"//descendant::span[contains(@class,'dijitTreeLabel')][normalize-space(text())='"+selectStr+"']")).findVisibleElement(By.xpath(DepartmentTreeNode_XPath+"//descendant::span[contains(@class,'dijitTreeLabel')][normalize-space(text())='"+selectStr+"']"));
	}
	//公司库
	public void CommomTreeNode_Click(String selectStr){
		WebElement treenode=driver.findElement(By.xpath(CommomTreeNode_XPath+"/descendant::span[normalize-space(text())='"+selectStr+"']")).findVisibleElement(By.xpath(CommomTreeNode_XPath+"//descendant::span[normalize-space(text())='"+selectStr+"']"));
		treenode.click();
	}
	WebElement get_CommomTreeNode_Self(String selectStr){
		return driver.findElement(By.xpath(CommomTreeNode_XPath+"//descendant::span[contains(@class,'dijitTreeLabel')][normalize-space(text())='"+selectStr+"']")).findVisibleElement(By.xpath(CommomTreeNode_XPath+"//descendant::span[contains(@class,'dijitTreeLabel')][normalize-space(text())='"+selectStr+"']"));
	}		
}
