package org.steps;

import org.baseclass.HelperClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends HelperClass {
	@Before(order=3)
	public void beforeMethod3() {

		System.out.println("Before Method -3");
	}
	
	@Before(order=2)
	public void beforeMethod2() {
		System.out.println("Before Method -2");
	}
	
	

	@Before(order=1)
	public void beforeMethod1() {
		System.out.println("Before Method -1");
		
	}

	@After(order=3)
	public void screenShot(Scenario s) {
		
		if (s.isFailed()) {
			
			TakesScreenshot t=(TakesScreenshot)driver;
			byte[] src = t.getScreenshotAs(OutputType.BYTES);
			s.embed(src, "image/png");
			
			
			
			
		}
	
	
	}
	
	
	
	@After(order=2)
	public void afterMethod2() {
		System.out.println("After Method-2");
	}
	@After(order=1)
	public void afterMethod3() {
		System.out.println("After Method-3");
	}
	
}
