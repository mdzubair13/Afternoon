package org.pojo;

import org.baseclass.HelperClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewAccountPojo extends HelperClass{

	public NewAccountPojo() {
		PageFactory.initElements(driver,this);
	}
	
	
	@FindAll({
		@FindBy(xpath="(//a[@role='button'])[2]")
	})private WebElement newAccountButton;
	
	@FindAll({
		
		@FindBy(xpath="(//button[text()='Sign Up'])[1]")
	})private WebElement signUpBtn;

	public WebElement getNewAccountButton() {
		return newAccountButton;
	}

	public WebElement getSignUpBtn() {
		return signUpBtn;
	}
	
	
	
	
	
	
}
