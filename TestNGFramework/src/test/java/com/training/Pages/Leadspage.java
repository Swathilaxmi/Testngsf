package com.training.Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.training.Base.Basepage;

public class Leadspage extends Basepage {
	public Leadspage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(id="username")
	WebElement name;
	@FindBy(id="password")
	WebElement password;
	@FindBy(id="Login")
	WebElement loginButton;
	@FindBy(xpath="//a[@title='Leads Tab']")
	WebElement leads;
	@FindBy(xpath="//a[@id='tryLexDialogX']")
	WebElement popup;
	@FindBy(id="fcf")
	WebElement view;
	@FindBy(id="userNavLabel")
	WebElement usermenu;
	@FindBy(xpath="//a[@title='Logout']")
	WebElement logout;
	@FindBy(xpath="//span[@class='fBody']//input[@value=' Go! ']")
	WebElement go;
	@FindBy(id="fcf")
	WebElement View;
	@FindBy(xpath="//input[@name='new']")
	WebElement New;
	@FindBy(id="name_lastlea2")
	WebElement lastname;
	@FindBy(id="lea3")
	WebElement companyname;
	@FindBy(xpath="//input[@name='save']")
	WebElement save;
	
	
	
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
		public void clickonleads()  {
			waitForElement(10,leads);
			leads.click();
			waitForElement(10,popup);
			popup.click();		
}
		public void clickonview()  {
			view.click();
			String dd=view.getText();
			System.out.println(dd);
			Select viewdd=new Select(view);
			viewdd.selectByVisibleText("My Unread Leads");
		}
		public void usermenudropdown()  {
			waitForElement(20,usermenu);
			usermenu.click();		
}
		
		public void clickonlogout() {
			logout.click();
		}
		public void clickongo() {
			go.click();
		}
		public void clickonView()  {
			View.click();
			Select viewdd=new Select(View);
			viewdd.selectByVisibleText("Today's Leads");
		}
		public void clickonnew() {
			New.click();
		}
		public void enterlastname() {
			waitForElement(20,lastname);
			lastname.sendKeys("ABCD");
			
		}
		public void entercompanyname() {
			companyname.sendKeys("ABCD");
		}
		public void clickonsave() {
			save.click();
		}
}
