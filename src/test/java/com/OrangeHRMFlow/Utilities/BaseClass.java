package com.OrangeHRMFlow.Utilities;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {
	
	ReadConfig readconfig=new ReadConfig();
	
	public String Baseurl=readconfig.GetApplicationUrl();
	public String Username=readconfig.GetUsername();
	public String Password=readconfig.GetPassword();
	public static WebDriver driver;
	
	public static Logger log;
	
	@Parameters("browser")
	@BeforeClass
	public void setup(String br)
	{
		log=Logger.getLogger("OrangeHRM");
		PropertyConfigurator.configure("log4j.properties");
		
		if(br.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver",readconfig.GetChrompath());
		driver=new ChromeDriver();
		}
		else if(br.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",readconfig.GetFirefoxpath());
			driver=new FirefoxDriver();
		}
		else if(br.equals("edge"))
		{
			System.setProperty("webdriver.edge.driver",readconfig.GetIEpath());
			driver=new EdgeDriver();
		}
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(Baseurl);
		driver.manage().window().maximize();
		log.info("URL is opened");
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
    
	public void capturescreenshots(WebDriver driver,String tname) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File(System.getProperty("user.dir")+ "/Screenshots/" +tname+ ".png"));
		System.out.println("Screenshot Taken");		
	}
	
	public static String Randomstring()
	{
		String generatestring=RandomStringUtils.randomAlphabetic(8);
		return generatestring;
	}
	
	public static String RandomNum()
	{
		String generatenum=RandomStringUtils.randomNumeric(10);
		return generatenum;
	}
	
}
