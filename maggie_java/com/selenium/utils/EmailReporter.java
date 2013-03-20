package com.selenium.utils;

import org.testng.IReporter;
import org.testng.IResultMap;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import org.testng.Reporter;

import org.testng.log4testng.Logger;
import org.testng.xml.XmlSuite;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 * MODIFIED version of testng emailablereporter
 * 
 *
 */
public class EmailReporter implements IReporter
{
  Logger logger=Logger.getLogger(EmailReporter.class);
  //~ Instance fields ------------------------------------------------------

  private PrintWriter out;
  int row;

  //~ Methods --------------------------------------------------------------

  /** Creates summary of the run */
  public void generateReport(
    List<XmlSuite> xml,
    List<ISuite> suites,
    String outdir)
  {
    try {
      out=new PrintWriter(new FileWriter(new File(outdir,"emailable-report_fvt.html")));
    } catch(IOException e) {
      logger.error("output file",e);
      return;
    }
    startHtml(out);
    for(ISuite suite : suites) {
      summarize(suite);
      
      /*Map<String,ISuiteResult> r=suite.getResults();
      for(ISuiteResult r2 : r.values()) {
        resultSummary(
          r2.getTestContext().getFailedTests(),
          "failed");
        resultSummary(
          r2.getTestContext().getPassedTests(),
          "passed");
        resultDetail(
          r2.getTestContext().getFailedTests(),
          "failed");
        resultDetail(
          r2.getTestContext().getPassedTests(),
          "passed");
      }*/
    }
    out.println("</body></html>");
    out.close();
  }

  /**
   * @param tests
   */
  private void resultSummary(IResultMap tests,String style)
  {
    if(tests.getAllResults().size()>0) {
      tableStart(style);
      out.println(
        "<tr><th>Class</th>"
        +"<th>Method</th><th># of<br/>Scenarios</th><th>Time<br/>(Msecs)</th></tr>");
      int row=0;
      StringBuffer buff=new StringBuffer();
      String lastc="";
      int mq=0;
      int cq=0;
      for(ITestNGMethod method : getMethodSet(tests)) {
        row+=1;
        String cname=method.getTestClass().getName();
        if(!cname.equalsIgnoreCase(lastc)) {
          if(mq>0) {
            cq+=1;
            out.println(
              "<tr"+(cq%2==0
              ? " class=\"stripe\""
              : "")+">"+"<td rowspan=\""+mq+"\">"+lastc+buff);
          }
          mq=0;
          buff.setLength(0);
          lastc=cname;
        }
        Set<ITestResult> result_set=tests.getResults(method);
        long end=Long.MIN_VALUE;
        long start=Long.MAX_VALUE;
        for(ITestResult ans : tests.getResults(method)) {
          if(ans.getEndMillis()>end) {
            end=ans.getEndMillis();
          }
          if(ans.getStartMillis()<start) {
            start=ans.getStartMillis();
          }
        }
        mq+=1;
        if(mq>1) {
          buff.append("<tr"+(cq%2==1
            ? " class=\"stripe\""
            : "")+">");
        }
        buff.append(
          "<td><a href=\"#m"+row+"\">"+qualifiedName(method)+"</a></td>"
          +"<td class=\"numi\">"+result_set.size()+"</td><td class=\"numi\">"
          +(end-start)+"</td></tr>");
      }
      if(mq>0) {
        row+=1;
        out.println(
          "<tr"+(row%2==0
          ? " class=\"stripe\""
          : "")+">"+"<td rowspan=\""+mq+"\">"+lastc+buff);
      }
      out.println("</table>");
    }
  }

  private String qualifiedName(ITestNGMethod method) {
    String addon="";
    if(method.getGroups().length>0 && ! "basic".equalsIgnoreCase(method.getGroups()[0])) {
      addon=" ("+method.getGroups()[0]+")";
    }
    return method.getMethodName()+addon;
  }

  private void resultDetail(IResultMap tests,String style)
  {
    if(tests.getAllResults().size()>0) {
      int row=0;
      StringBuffer buff=new StringBuffer();
      for(ITestNGMethod method : getMethodSet(tests)) {
        row+=1;
        String cname=method.getTestClass().getName();
        out.println(
          "<a id=\"m"+row+"\"></a><h2>"+cname+":"+method.getMethodName()
          +"</h2>");
        //        Set<ITestResult> result_set=tests.getResults(method);
        //        long end=Long.MIN_VALUE;
        //        long start=Long.MAX_VALUE;
        int rq=0;
        Set<ITestResult> result_set=tests.getResults(method);
        for(ITestResult ans : result_set) {
          rq+=1;
          Object[] pset=ans.getParameters();
          if(pset.length>0) {
            if(rq==1) {
              tableStart("param");
              out.print("<tr>");
              for(int x=1; x<=pset.length; x++) {
                out.print(
                  "<th style=\"padding-left:1em;padding-right:1em\">Parameter #"+x
                  +"</th>");
              }
              out.println("</tr>");
            }
            out.print("<tr>");
            for(Object p : pset) {
              out.println(
                "<td style=\"padding-left:.5em;padding-right:2em\">"+p+"</td>");
            }
            out.println("</tr>");
            if(rq==result_set.size()) {
              out.println("</table>");
            }
          }
          List<String> msgs=Reporter.getOutput(ans);
          if(msgs.size()>0) {
            out.println("<div style=\"padding-left:3em\">");
            for(String line : msgs) {
              out.println(line+"<br/>");
            }
            out.println("</div>");
          }
        }
        //        mq+=1;
        //        if(mq>1)
        //          buff.append("<tr"+(row%2==1?" class=\"stripe\"":"")+">");
        //        buff.append("<td><a href=\"#"+method.getId()+">"+method.getMethodName()+"</a></td>"
        //          +"<td class=\"numi\">"+result_set.size()+"</td><td class=\"numi\">"
        //          +(end-start)
        //          +"</td></tr>");
        //      }
        //      if(mq>0) {
        //        row+=1;
        //        out.println("<tr"+(row%2==0?" class=\"stripe\"":"")+">"
        //          +"<td rowspan=\""+mq+"\">"+lastc+buff);
        out.println("<p class=\"totop\"><a href=#top>back to summary</a></p>");
      }

      //      out.println("</table>");
    }
  }

  /**
   * @param tests
   * @return
   */
  private Collection<ITestNGMethod> getMethodSet(IResultMap tests)
  {
    Set r=new TreeSet<ITestNGMethod>(new TestSorter<ITestNGMethod>());
    r.addAll(tests.getAllMethods());
    return r;
  }

  private void summarize(ISuite suite)
  {
	  out.println("<p><table border='1' cellspacing='1'>");
	  out.println("<tr><th align='left'colspan='7'>Detailed Summary (Work in Progress)</th></tr>");
	  out.println("<tr class='boldLabel'>");
	  out.println("<td>Suite</td>");
	  out.println("<td>Total Tests</td>");
	  out.println("<td>Methods Passed</td>");
	  out.println("<td>Scenarious Passed</td>");
	  out.println("<td># failed</td>");
	  out.println("<td># skipped</td>");
	  out.println("<td>Total Time</td>");
	  out.println("</tr>");
	  Map<String,ISuiteResult> r=suite.getResults();
	  int qty_pass_m = 0;
	  int qty_pass_s = 0;
	  int qty_skip = 0;
	  int qty_fail = 0;
	  long time_start = Long.MAX_VALUE;
	  long time_end = Long.MIN_VALUE;

	  for(ISuiteResult r2 : r.values()) {
		  ITestContext overview=r2.getTestContext();

		  out.println("<tr><td>" + overview.getName() + "</td>");
		  out.println("<td>" + (getMethodSet(overview.getPassedTests()).size() + overview.getFailedTests().size() + overview.getSkippedTests().size()) + "</td>");
		  out.println("<td>" + getMethodSet(overview.getPassedTests()).size() + "</td>");
		  out.println("<td>" + overview.getPassedTests().size() + "</td>");
		  out.println("<td>" + overview.getFailedTests().size() + "</td>");
		  out.println("<td>" + overview.getSkippedTests().size() + "</td>");
		  time_start = Math.min(overview.getStartDate().getTime(), time_start);
	      time_end = Math.max(overview.getEndDate().getTime(), time_end);

		  NumberFormat formatter=new DecimalFormat("#,##0.0");
		  out.println("<td>" + formatter.format(
				  (overview.getEndDate().getTime()-overview.getStartDate().getTime())/1000.)
				  +" seconds" + "</td></tr>");
		  
		  qty_pass_m += getMethodSet(overview.getPassedTests()).size();
		  qty_pass_s += overview.getPassedTests().size();
		  qty_skip += overview.getSkippedTests().size();
		  qty_fail += overview.getFailedTests().size();
	  }
	  out.println("<tr class='silverBack'><td>Total</td>");
	  out.println("<td>" + (qty_pass_m + qty_fail + qty_skip) + "</td>");
	  out.println("<td>" + qty_pass_m + "</td>");
	  out.println("<td>" + qty_pass_s + "</td>");
	  out.println("<td>" + qty_fail + "</td>");
	  out.println("<td>" + qty_skip + "</td>");
	  NumberFormat formatter=new DecimalFormat("#,##0.0");
	  out.println("<td>" + formatter.format((time_end - time_start) / 1000.) + " seconds" + "</td></tr>");
	  
	  out.println("</table>");
	  
	  
  }

  /**
   *
   */
  private void tableStart(String cssclass)
  {
    out.println(
      "<table cellspacing=0 cellpadding=0"
      +(
        cssclass!=null
        ? " class=\""+cssclass+"\""
        : " style=\"padding-bottom:2em\""
      )+">");
    row=0;
  }

  private void tableRow(String label,String val)
  {
    row+=1;
    out.println(
      "<tr"+(row%2==0
      ? " class=\"stripe\""
      : "")+"><th style=\"text-align:left;padding-right:2em\">"+label
      +"</th><td style=\"text-align:right\">"+val+"</td></tr>");
  }

  private void tableRow(String label,long val)
  {
    tableRow(
      label,
      String.valueOf(val));
  }

  private void tableRow(String label,String[] val)
  {
    StringBuffer b=new StringBuffer();
    for(String v : val)
      b.append(v+" ");
    tableRow(
      label,
      b.toString().trim());
  }

  private void startHtml(PrintWriter out)
  {
	  out.println("<html><head><title>Workplace XT Automation Summary</title>");
      out.println("<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>");
      out.println("<style type='text/css'>");
      out.println(" th { font-family:Tahoma; font-size:12px; font-weight:bold; color:#ffcc00; background-color:#333333 }");
      out.println(" td.boldHeading  { font-family:Tahoma; font-size:12px; font-weight:bold; color:#333333 }");
      out.println(" td.border       { border-top-color:Blue;border-bottom-color:Blue}");
      out.println(" tr.silverBack   { background-color:Silver}");
      out.println(" tr.boldLabel    { font-family:Tahoma; font-size:12px; font-weight:bold; color:#003366 }");
      out.println("</style>");
      out.println("</head><body>");
  }

  //~ Inner Classes --------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @author $author$
   * @version $Revision: 3 $
    *
   * @param <T> DOCUMENT ME!
   */
  private class TestSorter<T extends ITestNGMethod> implements Comparator
  {
    //~ Methods -------------------------------------------------------------

    /**
     * DOCUMENT ME!
     *
     * @param o1 DOCUMENT ME!
     * @param o2 DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public int compare(Object o1,Object o2)
    {
      int r=
        ((T)o1).getTestClass().getName()
            .compareTo(((T)o2).getTestClass().getName());
      if(r==0) {
        r=((T)o1).getMethodName().compareTo(((T)o2).getMethodName());
      }
      return r;
    }
  }
}
