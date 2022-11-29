package com.training.tests;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.Base.Basetest;
import com.training.Pages.CreateAccountPage;
import com.training.Pages.Loginpage;
import com.training.Pages.UserMenuDropdownPage;
import com.training.Utilities.CommonUtilities;

public class CreateAccountTest extends Basetest {
	WebDriver driver;
	 String url;
	 String browser;
	 CreateAccountPage Account;
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
Account=new CreateAccountPage(driver);

}

//10(passed)
@Test
public void createaccount() {
	Account.enterintousername(name);
	Account.enterintopassword(password);
	Account.clickonlogin();
	Account.clickonaccounts();
	Account.clickonnew();
	
	
}

//11(passed)
//@Test
public void createnewview() {
	Account.enterintousername(name);
	Account.enterintopassword(password);
	Account.clickonlogin();
	Account.clickonaccounts();
	Account. clickonnewview();
	Account.enterviewname();
	Account.enteruniqueviewname();
	Account.clickonnewsave();
}

//12
//@Test
public void createdieviewview() {
	Account.enterintousername(name);
	Account.enterintopassword(password);
	Account.clickonlogin();
	Account.clickonaccounts();
	Account.clickonview();
	Account. clickonedit();
	Account.clickonviewname();
	Account.clickonfield();
	Account.clickonoperator();
	Account.clickonvalue();
	Account. clickonsave();
}

//13(passed)
//@Test
public void Mergeaccounts() {
	Account.enterintousername(name);
	Account.enterintopassword(password);
	Account.clickonlogin();
	Account.clickonaccounts();
	Account.clickonmergeaccounts();
	Account. searchaccount();
    Account.clickonfindaccount();
    Account. clickonnext();
    Account.clickonmerge();
}

//14
//@Test
public void createaccountreport() {
	Account.enterintousername(name);
	Account.enterintopassword(password);
	Account.clickonlogin();
	Account.clickonaccounts();
	Account. clickonreports();
	Account.enterfromdate();
	Account.enterfromdate();
	Account.entertodate();
	Account. clickonsavereport();
	Account. enterreportname() ;
	Account.enterreportuniquename();
	Account.clicksavereportbutton();
}



//@AfterMethod
public void teardown() {
	takescreenshot(driver);
	driver.close();
}
}
