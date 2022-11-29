package com.training.tests;

import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.Base.Basetest;
import com.training.Pages.Leadspage;
import com.training.Pages.Loginpage;
import com.training.Pages.OpportunitiesPage;
import com.training.Utilities.CommonUtilities;

import io.github.bonigarcia.wdm.WebDriverManager;

	public class Leadstest extends Basetest {
		 WebDriver driver;
		 String url;
		 String browser;
		 Leadspage leads;
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
	leads=new Leadspage(driver);
	}

	//20
		//@Test
		public void leadstab() {
		leads.enterintousername(name);
		leads.enterintopassword(password);
		leads.clickonlogin();
		leads.clickonleads();
		}
	
		//21
				//@Test
				public void leadsselectview() {
				leads.enterintousername(name);
				leads.enterintopassword(password);
				leads.clickonlogin();
				leads.clickonleads();
				leads.clickonview() ;
				
				}
				
	//22
				//@Test
				public void defaultview() {
				leads.enterintousername(name);
				leads.enterintopassword(password);
				leads.clickonlogin();
				leads.clickonleads();
				leads.clickonview() ;
				leads.usermenudropdown();
	            leads.clickonlogout();
	            leads.enterintousername(name);
				leads.enterintopassword(password);
				leads.clickonlogin();
				leads.clickonleads();
				leads.clickongo();
				}
	//23
				//@Test
				public void todaysleads() {
				leads.enterintousername(name);
				leads.enterintopassword(password);
				leads.clickonlogin();
				leads.clickonleads();
				leads.clickonView() ;
				}
		//24
				@Test
				public void checknewbutton() {
				leads.enterintousername(name);
				leads.enterintopassword(password);
				leads.clickonlogin();
				leads.clickonleads();
				leads.clickonnew();
				leads.enterlastname();
				leads.entercompanyname();
				leads.clickonsave();
				}
				
				//@AfterMethod
				public void teardown() {
					takescreenshot(driver);
					driver.close();
				}
	
}


