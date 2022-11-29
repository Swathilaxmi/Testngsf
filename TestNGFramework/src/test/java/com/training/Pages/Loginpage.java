package com.training.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.training.Base.Basepage;

public class Loginpage extends Basepage {
	public Loginpage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(id="username")
	WebElement name;
	@FindBy(id="password")
	WebElement password;
	@FindBy(id="Login")
	WebElement loginButton;
	@FindBy(xpath="//input[@id='rememberUn']")
	WebElement rememberme;
	@FindBy(id="userNavLabel")
	WebElement usermenu;
	@FindBy(xpath="//a[@title='Logout']")
	WebElement logout;
	@FindBy(id="idcard-identity")
	WebElement actualtitle;
	@FindBy(xpath="//a[@id='forgot_password_link']")
	WebElement Forgotpassword;
	@FindBy(id="un")
	WebElement Username ;
	@FindBy(id="continue")
	WebElement Continue ;
	
	
	
	
	public void enterintousername(String strname) {
		waitForElement(20,name);
		name.sendKeys(strname);
		
	}
		public void enterintopassword(String strpassword) {
			//waitForElement(20,password);
			password.sendKeys(strpassword);		
		
	}
		public void clickonlogin()  {
			waitForElement(10,loginButton);
			loginButton.click();
			
}
		public void clickonRememberme() {
			rememberme.click();		
		
		}
		public void usermenudropdown()  {
			waitForElement(20,usermenu);
			usermenu.click();		
}
		
		public void clickonlogout() {
			logout.click();
		}
		
		public void Actualvalue()  {
			waitForElement(20,actualtitle);
			String Actualtitle=actualtitle.getText();
			System.out.println(Actualtitle);
			String Expectedtitle="oct22@abc.com";
			Assert.assertEquals(Actualtitle, Expectedtitle);
		}
		
		public void forgotpassword() {
			Forgotpassword.click();
        }
		public void username() {
			Username.sendKeys("oct22@abc.com");
		}
		public void clickoncontinue() {
			Continue.click();
		}	
		public void Username() {
			name.sendKeys("abc");
		}
		public void password() {
			password.sendKeys("1234");
		}
}
