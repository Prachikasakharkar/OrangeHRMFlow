package com.OrangeHRMFlow.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	      WebDriver driver;

	public  LoginPage(WebDriver driver) {
	    	
	   this.driver=driver;
	   PageFactory.initElements(driver, this);
		
  }
	
	@FindBy(xpath = "//input[@id='txtUsername']")WebElement txtUsername;
	@FindBy(xpath = "//input[@id='txtPassword']")WebElement txtPassword;
	@FindBy(xpath = "//input[@id='btnLogin']")WebElement btnlogin;
	@FindBy(xpath = "//a[normalize-space()='Forgot your password?']")WebElement btnForgetPassword;
	@FindBy(xpath = "//a[@id='welcome']")WebElement txtwelcome;
	@FindBy(xpath = "//a[normalize-space()='Logout']")WebElement btnlogout;
	
	public void Loginpage(String Uname,String Pword) {
		
		txtUsername.sendKeys(Uname);
		txtPassword.sendKeys(Pword);
	    btnlogin.click();
	}
	
	public void Logout() {
		
		txtwelcome.click();
		btnlogout.click();
		
		
	}
 	
	
	
	
	
	
}
