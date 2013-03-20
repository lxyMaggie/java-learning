package com.ibm.CNNC.elements;

import java.io.*;
import java.net.*;
import java.util.*;
import java.util.regex.*;
import org.openqa.selenium.*;
import com.selenium.utils.WebDriver;
import com.selenium.utils.WebElement;

public class CommonClass {
	public static String local="en";
	public static String messagePath="http://9.181.141.96:9080/navigator/ecm/nls/";
	public static String serviceMessagePath="D:\\MyWorkspace\\navigator.war\\WEB-INF\\classes\\com\\ibm\\ecm\\nls\\";
	public static void implicitWait(WebDriver driver){
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static WebElement getLastWebElement(WebDriver driver,By by) {
		List<WebElement> elementList = driver.findAll(by);
		WebElement[] elements=new WebElement[elementList.size()];
		elementList.toArray(elements);

		if(elements.length<=1){
			return elements[0];
		}else {
			int max=0;
			for (int i = 0; i < elements.length; i++) {
				String idString=elements[i].getAttribute("id");
				String numString="";
				Pattern patt=Pattern.compile("\\d+");
				Matcher matcher=patt.matcher(idString);
				if(matcher.find()){
					numString=matcher.group().toString();
					if(Integer.parseInt(numString)>max){
						max=i;
					}
				}
			}
			return elements[max];
		}
	}

	public static String getMessageValue(String local,String toParse) {
		BufferedReader br;
		String lineStr;	
		String messageFile="";
		if(local.equals("en")){
			messageFile = CommonClass.messagePath+"/messages.js";
		}else {
			messageFile = CommonClass.messagePath+local+"/messages.js";
		}
		
		if(toParse.contains("messages.")&&toParse.contains("${")&&toParse.contains("}")){
			toParse=toParse.substring(toParse.indexOf("$"),toParse.lastIndexOf("}")+1);
		}
		if(toParse.startsWith("${messages.")&&toParse.endsWith("}"))
			toParse=toParse.substring(11,toParse.length()-1);
		else if(toParse.startsWith("${_messages.")&&toParse.endsWith("}"))
			toParse=toParse.substring(12,toParse.length()-1);
			
		//这是在根目录中不需要翻译的几个message
		if(toParse.equals("product_name")){
			return "IBM Content Navigator";
		}else if(toParse.equals("content_manager")){
			return "Content Manager";
		}else if(toParse.equals("ondemand")){
			return "Content Manager OnDemand";
		}else if(toParse.equals("filenet_p8")){
			return "FileNet Content Manager";
		}else if(toParse.equals("content_integrator")){
			return "Content Integrator";
		}else if(toParse.equals("cmis")){
			return "Content Management Interoperability Services (CMIS)";
		}		
		
		try {
			br=new BufferedReader(new InputStreamReader((new URL(messageFile)).openStream(),"utf-8"));
			
			while (br.ready()) {
				lineStr=br.readLine().trim();
				if(lineStr.startsWith(toParse)&&lineStr.contains(":")){
					String valString=lineStr.substring(lineStr.indexOf(":")+1).trim();
					if(valString.startsWith("\"") && valString.endsWith("\",")){
						valString=valString.substring(1,valString.length()-2);
					}
					return valString;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "NO Such Key In Message File";
	}
		
	public static String getServiceMessageValue(String local,String key) {
		String messageFile="";
		BufferedReader br;
		String lineStr;
		if(local.equals("en")){
			messageFile = CommonClass.serviceMessagePath+"ServicesMessages.properties";
		}else {
			messageFile = CommonClass.serviceMessagePath+"ServicesMessages_"+local+".properties";
		}
		
		try {
			br=new BufferedReader(new InputStreamReader(new FileInputStream(messageFile),"utf-8"));
			
			while (br.ready()) {
				lineStr=br.readLine().trim();
				if(lineStr.startsWith(key)&&lineStr.contains("=")){
					return lineStr.substring(lineStr.indexOf("=")+1).trim();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "NO Such Key In ServiceMessage File";
	}

}
