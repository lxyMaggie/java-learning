package com.ibm.CNNC.data;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.LinkedList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class XMLDataExtractor extends DefaultHandler {
		
	private Object destination;
	
	private Document source;
		
	@SuppressWarnings("unused")
	private XMLDataExtractor(){}
	
	public XMLDataExtractor(File dataSource, Class<?> dataDestination) {
		try {
			DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
			this.source = documentBuilder.parse(dataSource);
			this.source.getDocumentElement().normalize();
			this.destination = dataDestination.newInstance();
			if (!this.source.getDocumentElement().getNodeName().equalsIgnoreCase(this.destination.getClass().getSimpleName())){
				throw new XMLDataExtractionException("The xml file's top level node must have the same name as the destination class.");
			}
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (XMLDataExtractionException e) {
			e.printStackTrace();
		}	
	}

	private String getString(String tagName, Element context){
		NodeList nodes = context.getElementsByTagName(tagName);
		if (nodes.getLength() <= 0) {
			return null;
		}
		NodeList childNodes = nodes.item(0).getChildNodes();
		if (childNodes.getLength() <= 0) {
			return null;
		}
		return childNodes.item(0).getNodeValue();
	}
	
	private String[] getStringArray(String tagName, Element context){
		NodeList nodes = context.getElementsByTagName(tagName);
		if (nodes.getLength() <= 0) {
			return null;
		}
		NodeList childNodes = nodes.item(0).getChildNodes();
		LinkedList<Integer> elementNodeIndices = new LinkedList<Integer>();
		for (int i = 0; i < childNodes.getLength(); i++){
			if (childNodes.item(i).getNodeType() == Node.ELEMENT_NODE){
				elementNodeIndices.add(i);
			}
		}
		int arrayIndex = 0;
		String[] array = new String[elementNodeIndices.size()];
		for (Integer nodesIndex : elementNodeIndices){
			Element xmlElement = (Element)(childNodes.item(nodesIndex));
			String arrayElement = xmlElement.getChildNodes().item(0).getNodeValue();
			array[arrayIndex] = arrayElement;
			arrayIndex++;
		}
		return array;
	}
	
	private Object getObject(String tagName, Element context, Class<?> elementType) throws IllegalAccessException, InstantiationException, XMLDataExtractionException{
		NodeList nodes = context.getElementsByTagName(tagName);
		if (nodes.getLength() <= 0) {
			return null;
		}
		if (nodes.getLength() > 1){
			throw new XMLDataExtractionException("Duplicate property found for '" + tagName + "'.");
		}
		if (nodes.item(0).getNodeType() != Node.ELEMENT_NODE){
			throw new XMLDataExtractionException("'" + tagName + "' is not an element node.");
		}
		else {
			Object subObject = elementType.newInstance();
			this.recPopulateFields(subObject, (Element)nodes.item(0));
			return subObject;
		}
	}
	
	private Object getObjectArray(String tagName, Element context, Class<?> arrayElementType) throws IllegalAccessException, InstantiationException{
		NodeList nodes = context.getElementsByTagName(tagName);
		if (nodes.getLength() <= 0) {
			return null;
		}
		NodeList childNodes = nodes.item(0).getChildNodes();
		LinkedList<Integer> elementNodeIndices = new LinkedList<Integer>();
		for (int i = 0; i < childNodes.getLength(); i++){
			if (childNodes.item(i).getNodeType() == Node.ELEMENT_NODE){
				elementNodeIndices.add(i);
			}
		}
		Object array = Array.newInstance(arrayElementType, elementNodeIndices.size());
		int arrayIndex = 0;
		for (Integer nodesIndex : elementNodeIndices){
			Element xmlElement = (Element)childNodes.item(nodesIndex);
			Object arrayElement = arrayElementType.newInstance();
			this.recPopulateFields(arrayElement, xmlElement);
			Array.set(array, arrayIndex, arrayElement);
			arrayIndex++;
		}
		return array;
	}
		
	private void recPopulateFields(Object object, Element element) {
		try {
			Element context = (element != null) ? element : source.getDocumentElement(); 
			for (Field field : object.getClass().getDeclaredFields()){
				field.setAccessible(true);
				if (field.getType().isPrimitive()){
					throw new XMLDataExtractionException(object.getClass(),field);
				}
				else if (field.getType().equals(String.class)){
					field.set(object, this.getString(field.getName().toLowerCase(), context));
				}
				else if (field.getType().isArray()){
					if (field.getType().getComponentType().isPrimitive()){
						throw new XMLDataExtractionException(object.getClass(),field);
					}
					else if(field.getType().getComponentType().equals(String.class)){
						field.set(object, this.getStringArray(field.getName(), context));
					}
					else {
						field.set(object, this.getObjectArray(field.getName(), context, field.getType().getComponentType()));
					}
				}
				else {
					field.set(object, this.getObject(field.getName(), context, field.getType()));
				}
			}
		} catch (XMLDataExtractionException e){
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		}
	}
	
	public Object extractDataToObject() {
		this.recPopulateFields(this.destination, null);
		return this.destination;
	}
	
	public class XMLDataExtractionException extends Exception {
		private static final long serialVersionUID = -3345040176652308333L;
		public XMLDataExtractionException(String msg) {
			super(msg);
		}
		public XMLDataExtractionException(Class<?> objClass, Field field){
			super("'" + objClass.getName() + "." + field.getName() + "' does no not reduce to type String or String[]");
		}
	}
}