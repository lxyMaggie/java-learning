package com.selenium.utils;

public class XPathHelper {

	/**
	 * Gets Element &lt;E> with attribute A.
	 * @param e
	 * @param a
	 * @return //E[@A]
	 */
	public static String getEleAttr(String e, String a) {
		return "//" + e + "[@" + a + "]";
	}
	
	/**
	 * Gets Element &lt;E> with attribute A containing text 't' exactly.
	 * @param e
	 * @param a
	 * @param t
	 * @return //E[@A='t']
	 */
	public static String getEleAttrEquals(String e, String a, String t) {
		return "//" + e + "[@" + a + "='" + t + "']";
	}
	
	/**
	 * Gets Element &lt;E> with attribute A containing text 't.'
	 * @param e
	 * @param a
	 * @param t
	 * @return //E[contains(@A,'t')]
	 */
	public static String getEleAttrContains(String e, String a, String t) {
		return "//" + e + "[contains(@" + a + ",'" + t + "')]";
	}
	
	/**
	 * Gets Element &lt;E> whose attribute A begins with 't.'
	 * @param e
	 * @param attribute
	 * @param t
	 * @return //E[starts-with(@A, 't')]
	 */
	public static String getEleAttrBeginsWith(String e, String a, String t) {
		return "//" + e + "[starts-with(@" + a + ", '" + t + "')]";
	}
	
	/**
	 * Gets Element &lt;E> whose attribute A ends with 't.'
	 * @param e
	 * @param a
	 * @param t
	 * @return //E[ends-with(@A, 't')] 
	 */
	public static String getEleAttrEndWith(String e, String a, String t) {
		// Alternate: //E[substring(@A, string-length(@A) - string-length('t')+1)='t']		
		return "//" + e + "[ends-with(@" + a + ", '" + t + "')]";
	}
	
	/**
	 * Gets Element &lt;E> with attribute A containing word 'w.'
	 * @param e
	 * @param a
	 * @param word
	 * @return //E[contains(concat('⦿', @A, '⦿'), '⦿w⦿')
	 */
	public static String getEleAttrContainsWord(String e, String a, String word) {
		return "";
	}
	
	/**
	 * Gets Element &lt;E> with attribute A matching regex ‘r.’
	 * @param e
	 * @param a
	 * @param regex
	 * @return //E*matches(@A, ‘r’)
	 */
	public static String getEleAttrMatchRegex(String e, String a, String regex) {
		return "";
	}
	
	/**
	 * Gets Element &lt;E1> with id I1 or id I2.
	 * @param e
	 * @param id1
	 * @param id2
	 * @return //E1[@id=I1 or @id=I2]
	 */
	public static String getEleAltIds(String e, String id1, String id2) {
		return "//" + e + "[@id='" + id1 + "' or @id='" + id2 + "']";
	}
}
