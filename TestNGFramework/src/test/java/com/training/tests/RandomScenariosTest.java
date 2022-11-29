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
import com.training.Pages.RandomScenariospage;
import com.training.Utilities.CommonUtilities;

import io.github.bonigarcia.wdm.WebDriverManager;

	public class RandomScenariosTest  extends Basetest {
		 WebDriver driver;
		 String url;
		 String browser;
		 RandomScenariospage random;
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
	random=new RandomScenariospage (driver);
	}

	//33
		@Test
		public void createnewcontact() {
		random.enterintousername(name);
		random.enterintopassword(password);
	    random.clickonlogin();
	    random.clickonhome();
	    random.clickonuserfirstandlastname();

		}
		
		@AfterMethod
		public void teardown() {
			takescreenshot(driver);
			driver.close();
		}

}
