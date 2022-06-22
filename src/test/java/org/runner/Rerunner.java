package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.steps.JvmReportGeneation;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features="@src\\test\\resources\\RerunFiles",
glue="org.steps",monochrome=true,dryRun=false,snippets=SnippetType.CAMELCASE,strict=true,
plugin= {"json:C:\\Users\\zubee\\ClassWorkSpace\\Cucumber11m\\Report\\JsonREport\\fb.json",
		"rerun:src\\test\\resources\\RerunFiles\\failed.txt"})



public class Rerunner {
	
	@AfterClass
	public static  void Report() {
	JvmReportGeneation.jvmReport("C:\\Users\\zubee\\ClassWorkSpace\\Cucumber11m\\Report\\JsonREport\\fb.json");

	}
	
}
