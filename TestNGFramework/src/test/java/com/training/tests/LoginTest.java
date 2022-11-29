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
import com.training.Utilities.CommonUtilities;

import io.github.bonigarcia.wdm.WebDriverManager;

	public class LoginTest extends Basetest {
		 WebDriver driver;
		 String url;
		 String browser;
		 Loginpage login;
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
	login=new Loginpage(driver);
	}
	
//1.LoginErrorMessage
	
	@Test
	public void LoginErrorMsg1()  {
		login.enterintousername(name);
		login.clickonlogin();
	}
		
//2.LogintoSalesforce
	@Test
	public void LogintoSalesForce2()  {
		login.enterintousername(name);
		login.enterintopassword(password);
		login.clickonlogin();
	}
	
//3
	@Test
	public void CheckRememberme3() throws InterruptedException {
		login.enterintousername(name);
		login.enterintopassword(password);
		login.clickonRememberme();
		login.clickonlogin();
		login.usermenudropdown();
		login.clickonlogout();
		login.Actualvalue();
		
	}
	
	//4A
	@Test
	public void ForgotPassword4A()  {
	login.forgotpassword();
	login.username();
	login.clickoncontinue();
	}
	
	//4B
	@Test
	public void ValidateLoginErrorMsg() {
		login.Username();
		login.password();
		login.clickonlogin();
		
		
	}
	
	
	@AfterMethod
	public void teardown() {
		takescreenshot(driver);
		driver.close();
	}

	

}

