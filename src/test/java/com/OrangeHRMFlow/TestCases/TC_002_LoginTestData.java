package com.OrangeHRMFlow.TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.OrangeHRMFlow.PageObjects.LoginPage;
import com.OrangeHRMFlow.Utilities.BaseClass;
import com.OrangeHRMFlow.Utilities.XLUtils;

public class TC_002_LoginTestData extends BaseClass {

	@Test(dataProvider = "LoginData")
	public void LoginTest(String uname,String pword) {
		
		LoginPage lp=new LoginPage(driver);
		lp.Loginpage(uname, pword);
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
		
		
 }	
	@DataProvider(name = "LoginData")
	String[][] Getdata() throws Exception {
		
		String path=System.getProperty("user.dir")+"/src/test/java/com/OrangeHRMFlow/TestData/uploadfile.xlsx";
		int rownum=XLUtils.getRowCount(path, "Sheet1");
		int colcount=XLUtils.getCellCount(path, "Sheet1", 1);
		String logindata[][]=new String[rownum][colcount];
		
		for(int i=1;i<=rownum;i++) {
			
			   for(int j=0;j<colcount;j++) {
				
				 logindata[i-1][j]=XLUtils.getCellData(path, "Sheet1", i, j);
				 
				
			}
			
		}
		
		return logindata;
		
		
		
		
	}
			
	
	
	
	
}
