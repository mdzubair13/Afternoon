package org.steps;

import java.util.List;
import java.util.Map;

import org.baseclass.HelperClass;
import org.pojo.LoginPojo;
import org.pojo.NewAccountPojo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends HelperClass{
	@Given("To Open Chrome Browser")
	public void to_Open_Chrome_Browser() {
		launchChromeBrowser();
		maxi();
		implict(10);
	   
	}	


@Then("To Click login button")
public void toClickLoginButton() {
LoginPojo l =new LoginPojo();
	
	btnClick(l.getLoginbtn());
 
}

@When("To pass invalid username and invalid password")
public void toPassInvalidUsernameAndInvalidPassword() {
url("https://www.facebook.com/");
	
	LoginPojo l =new LoginPojo();
	
	fillTheTextBox(l.getTxtuser(),"red");
	fillTheTextBox(l.getTxtpass(),"222");
}



@Given("To open Chrome browser")
public void toOpenChromeBrowser() {
	launchChromeBrowser();
	maxi();
	implict(10);
}

@When("to Click createnew btn")
public void toClickCreatenewBtn() {
    
	url("https://www.facebook.com/");
	NewAccountPojo n= new NewAccountPojo();
	
	btnClick(n.getNewAccountButton());
	
}

@Then("to click sign in button")
public void toClickSignInButton() {
    
	NewAccountPojo n= new NewAccountPojo();
	
	btnClick(n.getSignUpBtn());
	 
	
}

@When("To pass  valid username and  password")
public void toPassValidUsernameAndPassword(io.cucumber.datatable.DataTable d) {
	
	Map<String, String> alldata = d.asMap(String.class, String.class);
	
	String user = alldata.get("username");
	String pass = alldata.get("password");
 
url("https://www.facebook.com/");
	
	LoginPojo l =new LoginPojo();
	
	fillTheTextBox(l.getTxtuser(),user);
	fillTheTextBox(l.getTxtpass(),pass);
	
}

@When("To pass invalid username and valid password")
public void toPassInvalidUsernameAndValidPassword(io.cucumber.datatable.DataTable d) {

	
	List<Map<String, String>> alldata = d.asMaps(String.class,String.class );
	String user = alldata.get(1).get("numbers");
	String pass = alldata.get(0).get("pass");
	
	
	url("https://www.facebook.com/");
	
	LoginPojo l =new LoginPojo();
	
	fillTheTextBox(l.getTxtuser(),user);
	fillTheTextBox(l.getTxtpass(),pass);
}




}
