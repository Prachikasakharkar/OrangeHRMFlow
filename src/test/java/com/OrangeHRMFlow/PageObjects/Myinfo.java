package com.OrangeHRMFlow.PageObjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.asm.Advice.Enter;

public class Myinfo {

	 WebDriver driver;
	  
 public  Myinfo(WebDriver driver ) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//b[normalize-space()='My Info']")WebElement txtMyinfo;
	@FindBy(xpath = "//input[@id='btnSave']")WebElement btnEdit;
	@FindBy(xpath = "//h1[normalize-space()='Personal Details']")WebElement txtpersonaldetails;
	@FindBy(xpath = "//input[@id='personal_txtEmpFirstName']")WebElement txtFirstname;
	@FindBy(xpath = "//input[@id='personal_txtEmpMiddleName']")WebElement txtMiddlename;
	@FindBy(xpath = "//input[@id='personal_txtEmpLastName']")WebElement txtLastname;
	@FindBy(xpath = "//input[@id='personal_txtEmployeeId']")WebElement txtEmployeeid;
	@FindBy(xpath = "//input[@id='personal_txtOtherID']")WebElement txtOtherid;
	@FindBy(xpath = "//input[@id='personal_txtLicenNo']")WebElement txtLicenNo;
	@FindBy(xpath = "//input[@id='personal_txtLicExpDate']")WebElement txtLicdate;
	@FindBy(xpath = "//input[@id='personal_txtNICNo']")WebElement txtNICNo;
	@FindBy(xpath = "//input[@id='personal_txtSINNo']")WebElement txtSINo;
	@FindBy(xpath = "//input[@id='personal_optGender_2']")WebElement txtGender;
	@FindBy(xpath = "//input[@id='personal_DOB']")WebElement txtDOB;
	@FindBy(xpath = "//input[@id='personal_txtEmpNickName']")WebElement txtNickName;
	@FindBy(xpath = "//input[@id='personal_chkSmokeFlag']")WebElement txtsmoker;
	@FindBy(xpath = "//input[@id='personal_txtMilitarySer']")WebElement txtMilitry;
	//@FindBy(xpath = "//input[@id='btnSave']")WebElement btnsave;
	@FindBy(xpath = "//select[@id='personal_cmbMarital']")WebElement txtMaritalstatus;
	@FindBy(xpath = "//select[@id='personal_cmbNation']")WebElement txtNationality;
	
   public void Myinfopage() {
		
		txtMyinfo.click();
	}
	
	public void Edit() throws Exception {
		
		btnEdit.click();
		Thread.sleep(2000);
	}
	
	public void Personaldetails() {
		
		String Persnaldetails=txtpersonaldetails.getText();
	}
	
	public void Firstname(String firstname) throws Exception {
		
		txtFirstname.clear();
		txtFirstname.sendKeys(firstname);
		Thread.sleep(2000);
	}
	public void Middlename(String Middlename ) throws Exception {
		
		txtMiddlename.clear();
		txtMiddlename.sendKeys(Middlename);
		Thread.sleep(2000);
		
	}
	public void Lastname(String Lastname) throws Exception {
		
		txtLastname.clear();
		txtLastname.sendKeys(Lastname);
		Thread.sleep(2000);
    }
	
	public void Employeeid(String Employeeid) throws Exception {
		
		txtEmployeeid.clear();
		txtEmployeeid.sendKeys(Employeeid);
		Thread.sleep(2000);
	}
	public void Otherid(String otherid) throws Exception {
		
		txtOtherid.clear();
		txtOtherid.sendKeys(otherid);
		Thread.sleep(2000);

	}
	public void Drivingliceno(String drivingliceno) throws Exception {
		
		txtLicenNo.clear();
		txtLicenNo.sendKeys(drivingliceno);
		Thread.sleep(2000);
	}
	public void LicenDate(String licendate) throws Exception {
		
		txtLicdate.clear();
		txtLicdate.sendKeys(licendate,Keys.ENTER);
		Thread.sleep(2000);
	}
	public void SSN(String SSNNo) throws Exception {
		
		txtNICNo.clear();
		txtNICNo.sendKeys(SSNNo);
		Thread.sleep(2000);
    }
	public void SIN(String SINno) throws Exception {
		
		txtSINo.clear();
		txtSINo.sendKeys(SINno);
		Thread.sleep(2000);
	}
	public void Gender() {
		
		txtGender.click();
	}
	public void maritalstatus() throws Exception {
		
		Select Maritalstatus=new Select(txtMaritalstatus);
		Maritalstatus.selectByValue("Other");
		Thread.sleep(2000);
    }
	public void Nationality() throws Exception {
		Select Nationality=new Select(txtNationality);
		Nationality.selectByIndex(3);
		Thread.sleep(2000);
	}
	public void DOB(String DOB) throws Exception {
		
		txtDOB.clear();
		txtDOB.sendKeys(DOB,Keys.ENTER);
		Thread.sleep(2000);
	}
	public void Nickname(String NickName) throws Exception {
		
		txtNickName.clear();
		txtNickName.sendKeys(NickName);
		Thread.sleep(2000);
	}
	public void Smoker() {
		
		txtsmoker.click();
	}
	public void Military(String MilitryName) throws Exception {
		
		txtMilitry.clear();
		txtMilitry.sendKeys(MilitryName);
		Thread.sleep(2000);
	}
	//public void Save() {
		
		//btnsave.click();
	//}
	
	
	
}
