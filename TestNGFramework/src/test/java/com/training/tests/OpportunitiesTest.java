package com.training.tests;

import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.Base.Basetest;
import com.training.Pages.Loginpage;
import com.training.Pages.OpportunitiesPage;
import com.training.Utilities.CommonUtilities;

import io.github.bonigarcia.wdm.WebDriverManager;

	public class OpportunitiesTest extends Basetest {
		 WebDriver driver;
		 String url;
		 String browser;
		 OpportunitiesPage opportunities;
		 String name;
		 String password;	  
		 CommonUtilities common=new CommonUtilities();
		
	@BeforeMethod
	public void Beforemethod() throws IOException {
		url=common.getproperty("url");
		browser=common.getproperty("browser");
		name=common.getproperty("Username");
		password=common.getproperty("Password");
	driver=getDriver(browser);
	driver.get(url);
	driver.manage().window().maximize();
	opportunities=new OpportunitiesPage(driver);
	}
	
	//15
	//@Test
	public void opportunitiesdropdown() {
	opportunities.enterintousername(name);
	opportunities.enterintopassword(password);
	opportunities.clickonlogin();
	opportunities.clickonopportunities();
	opportunities.clickonview();
	}
	
	//16
	@Test
	public void createnewopty() {
		opportunities.enterintousername(name);
		opportunities.enterintopassword(password);
		opportunities.clickonlogin();
		opportunities.clickonopportunities();
		opportunities.clickonnew();
		opportunities.clickonopportunityname();
		opportunities.clickonaccountname();
		opportunities.clickonleadsource(); 
		opportunities.clickondate();
		opportunities.clickonstage();
		opportunities.clickonpropability() ;
		opportunities.clickonasorce();
		opportunities.clickonsave();
	}
	
	//17
	//@Test
	public void testoptypipelinereport() {
		opportunities.enterintousername(name);
		opportunities.enterintopassword(password);
		opportunities.clickonlogin();
		opportunities.clickonopportunities();	
		opportunities.clickonpipeline();
	}
	
	//18
		//@Test
		public void teststuckoptyreport() {
			opportunities.enterintousername(name);
			opportunities.enterintopassword(password);
			opportunities.clickonlogin();
			opportunities.clickonopportunities();	
			opportunities.clickonstuck();
		}
		//19
		@Test
		public void testquarterlysummaryreport() {
			opportunities.enterintousername(name);
			opportunities.enterintopassword(password);
			opportunities.clickonlogin();
			opportunities.clickonopportunities();	
			opportunities.clickoninterval();
			opportunities.clickoninclude();
			opportunities.clickonrunreport();
		}
		
		//@AfterMethod
		public void teardown() {
			takescreenshot(driver);
			driver.close();
		}
		
		
}
