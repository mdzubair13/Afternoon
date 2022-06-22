package org.steps;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReportGeneation {
	
	
	public static void jvmReport(String jsonpath) {
		
		//File path 
		File f=new File("C:\\Users\\zubee\\ClassWorkSpace\\Cucumber11m\\Report\\JVMReport");
		//Configuration Class	
		Configuration c= new Configuration(f, "FB Login Function");
		c.addClassifications("Lang", "Java");
		c.addClassifications("Tool", "Eclipse");
		c.addClassifications("OS", "Windions");
		//ADD json filepath in List
		List<String> l= new ArrayList<String>();
		l.add(jsonpath);
		
		//create object REportBuilder 
		ReportBuilder r= new ReportBuilder(l, c);
		r.generateReports();
		
	}

}
