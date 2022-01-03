package com.OrangeHRMFlow.TestCases;



import org.testng.annotations.Test;

import com.OrangeHRMFlow.PageObjects.LoginPage;
import com.OrangeHRMFlow.PageObjects.Myinfo;
import com.OrangeHRMFlow.Utilities.BaseClass;

public class TC_001_Myinfo extends BaseClass {

	
	@Test
	public void MyinfoTest() throws Exception {
		
		LoginPage lp=new LoginPage(driver);
		lp.Loginpage(Username, Password);
		
		Myinfo mp=new Myinfo(driver);
		mp.Myinfopage();
		
		capturescreenshots(driver, "Myinfo"); 
		//capturescreenshots(driver, Username);
		
		mp.Edit();
		mp.Personaldetails();
		mp.Firstname("Prachika");
		log.info("Enter name");
		mp.Middlename("Bhaskar");
		log.info("Enter middlename");
		mp.Lastname("Sakharkar");
		log.info("Enter surname");
		mp.Employeeid("0011");
		log.info("Enter empid");
		mp.Otherid("1234");
		log.info("Enter otherid");
		mp.Drivingliceno("MH12");
		log.info("enter licenno");
		mp.LicenDate("2021-12-31");
		log.info("Enter licedate");
		mp.SSN("0123");
		log.info("enter SSNno");
		mp.SIN("9810");
		log.info("enter SINNO");
		mp.Gender();
		log.info("click Female");
		mp.maritalstatus();
	    log.info("Click Other");
	    mp.Nationality();
	    log.info("Indian");
		mp.DOB("2021-12-30");
		log.info("enter DOB");
		mp.Nickname("Prachu");
		log.info("enter nickname");
		mp.Smoker();
		mp.Military("NA");
		log.info("enter militryname");
	    lp.Logout();
	    log.info("Logout Successfully");
		
		
		
	}
	
	
	
}
