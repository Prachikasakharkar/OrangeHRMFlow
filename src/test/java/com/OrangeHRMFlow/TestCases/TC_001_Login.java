package com.OrangeHRMFlow.TestCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.OrangeHRMFlow.PageObjects.LoginPage;
import com.OrangeHRMFlow.Utilities.BaseClass;

public class TC_001_Login extends BaseClass {

	@Test
	public void LoginTest() {
		
		LoginPage lp=new LoginPage(driver);
		lp.Loginpage(Username, Password);
		log.info("Login Successfully");
		
		
		String expectedUrl=driver.getCurrentUrl();
		log.info(expectedUrl);
		
		String ActualUrl="https://opensource-demo.orangehrmlive.com/index.php/dashboard";
		
		if(ActualUrl.contentEquals(expectedUrl)) {
			
			String txtdashboard=driver.findElement(By.xpath("//b[normalize-space()='Dashboard']")).getText();
			log.info(txtdashboard);
			lp.Logout();
		}
		else 
		{
			
			String txterror=driver.findElement(By.xpath("//span[@id='spanMessage']")).getText();
			log.info(txterror);
		}
		
		 log.info("enter name");
		
		
		
	}
	
	
	 
	
	
	
	
	
	
}
