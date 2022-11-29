package com.training.tests;
import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.Base.Basetest;
import com.training.Pages.Contactspage;
import com.training.Pages.Leadspage;
import com.training.Pages.Loginpage;
import com.training.Pages.OpportunitiesPage;
import com.training.Utilities.CommonUtilities;

import io.github.bonigarcia.wdm.WebDriverManager;

	public class ContactsTest extends Basetest {
		 WebDriver driver;
		 String url;
		 String browser;
		 Contactspage contacts;
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
	contacts=new Contactspage(driver);
	}

	//25
		//@Test
		public void createnewcontact() {
		contacts.enterintousername(name);
		contacts.enterintopassword(password);
		contacts.clickonlogin();
		contacts.clickoncontacts();
		contacts.clickonnew();
		contacts.clickonlastname();
		contacts.clickonaccountname();
		contacts.clickonsave();
		}
		//26
				//@Test
				public void createnewviewcontact() {
				contacts.enterintousername(name);
				contacts.enterintopassword(password);
				contacts.clickonlogin();
				contacts.clickoncontacts();
				contacts.clickonnewview() ;
				contacts.clickonviewname();
				contacts.clickonuniqueviewname(); 
				contacts.clickonsave();
				}
				//27
				//@Test
				public void checkrecentlycreatedinthecontact() {
				contacts.enterintousername(name);
				contacts.enterintopassword(password);
				contacts.clickonlogin();
				contacts.clickoncontacts();
				contacts.clickonrecentlycreated();
				}
				//28
				//@Test
				public void mycontact() {
				contacts.enterintousername(name);
				contacts.enterintopassword(password);
				contacts.clickonlogin();
				contacts.clickoncontacts();
				contacts.clickonview() ;
}
	//29
				//@Test
				public void viewcontact() {
				contacts.enterintousername(name);
				contacts.enterintopassword(password);
				contacts.clickonlogin();
				contacts.clickoncontacts();
				contacts.clickonrecentcontact() ;
	}
	//30
				//@Test
				public void checkerrormsg() {
				contacts.enterintousername(name);
				contacts.enterintopassword(password);
				contacts.clickonlogin();
				contacts.clickoncontacts();
				contacts.clickonnewview() ;
				contacts.clickonuniqueviewname(); 
				contacts.clickonsave();
				contacts.Actualvalue();
				}
		//31
				//@Test
				public void checkthecancelbutton() {
				contacts.enterintousername(name);
				contacts.enterintopassword(password);
				contacts.clickonlogin();
				contacts.clickoncontacts();
				contacts.clickonnewview() ;
				contacts.clickonviewname();
				contacts.clickonuniqueviewname(); 
				contacts.clickoncancel();
	}
				//32
				@Test
				public void createnewandsavecontact() {
				contacts.enterintousername(name);
				contacts.enterintopassword(password);
				contacts.clickonlogin();
				contacts.clickoncontacts();
				contacts.clickonnew();
				contacts.clickonlastname();
				contacts.clickonaccountname();
				contacts.clickonsaveandnew();
				}
	}
