package com.training.tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.Base.Basetest;
import com.training.Pages.Loginpage;
import com.training.Pages.UserMenuDropdownPage;
import com.training.Utilities.CommonUtilities;

public class UserMenuDropdownTest extends Basetest {
	WebDriver driver;
	 String url;
	 String browser;
	 UserMenuDropdownPage Home;
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
Home=new UserMenuDropdownPage(driver);
}

//5
//@Test	
public void Selectusermenudropdown() {
	Home.enterintousername(name);
	Home.enterintopassword(password);
	Home.clickonlogin();
	Home.usermenudropdown();
}

//6
//@Test
public void selectmyprofile() {
	Home.enterintousername(name);
	Home.enterintopassword(password);
	Home.clickonlogin();
	Home.usermenudropdown();
	Home.Myprofile();
	Home.clickonedit();
	Home.switchtoabout();
	Home.clickabout();
	Home.enterlastname();
	Home.clicksaveall();
	//Home.clickpost();
	//Home.Postframe(); 
	//Home.Shareandupdate();
	Home. clickonfile();
}


//7
@Test	
public void clickonmysettings() {

	Home.enterintousername(name);
	Home.enterintopassword(password);
	Home.clickonlogin();
	Home.usermenudropdown();
	Home.selectmysettings();
	Home.selectmypersonnal();
	Home.selectloginhistory();
	Home.selectdisplayandlayout();
	Home.selectcustomizemytabs();
	Home.selectcustomapp();
	Home.selectavailabletabs();
	Home.clickadd();
	Home.clicksave();
	Home.selectemail();
	Home.selectmyemailsettings();
	Home. Emailname();
	Home.Emailaddress();
	Home.clicksave();
	Home.calendarandremainder();
	Home.openatestremainder();
}

//8
//@Test
public void DevelopersConsole() {
	Home.enterintousername(name);
	Home.enterintopassword(password);
	Home.clickonlogin();
	Home.usermenudropdown();
	Home.clickdevelopersconsole();
}
	//9
//@Test
public void logout() {
	Home.enterintousername(name);
	Home.enterintopassword(password);
	Home.clickonlogin();
	Home.usermenudropdown();
	Home. clicklogout();

}


//@AfterMethod
public void teardown() {
	takescreenshot(driver);
	driver.close();
}

}
