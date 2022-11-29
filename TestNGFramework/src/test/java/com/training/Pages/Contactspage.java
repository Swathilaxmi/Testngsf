package com.training.Pages;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.training.Base.Basepage;

public class Contactspage extends Basepage {
	public Contactspage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(id="username")
	WebElement name;
	@FindBy(id="password")
	WebElement password;
	@FindBy(id="Login")
	WebElement loginButton;
	@FindBy(xpath="//a[@title='Contacts Tab']")
	WebElement contacts;
	@FindBy(xpath="//a[@id='tryLexDialogX']")
	WebElement popup;
	@FindBy(xpath="//input[@name='new']")
	WebElement New;
	@FindBy(id="name_lastcon2")
	WebElement lastname;
	@FindBy(id="con4")
	WebElement accountname;
	@FindBy(xpath="//input[@name='save']")
	WebElement save;
	@FindBy(xpath="//a[contains(text(),'Create New View')]")
	WebElement newview;
	@FindBy(id="fname")
	WebElement viewname;
	@FindBy(id="devname")
	WebElement uniquename;
	@FindBy(id="hotlist_mode")
	WebElement recentlycreated;
	@FindBy(id="fcf")
	WebElement view;
	@FindBy(xpath="//table[@class='list']//th[@scope='row']//a[contains(text(),'Gonzalez, Rose')]")
	WebElement contact;
	@FindBy(xpath="//div[contains(text(),' You must enter a value')]")
	WebElement errormsg;
	@FindBy(name="cancel")
	WebElement cancel;
	@FindBy(name="cancel")
	WebElement saveandnew;
	
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
		public void clickoncontacts()  {
			contacts.click();
			waitForElement(10,popup);
			popup.click();			
}
		public void clickonnew()  {
			New.click();
			
}
		public void clickonlastname()  {
			waitForElement(10,lastname);
			lastname.sendKeys("abcd");		
}	
		public void clickonaccountname()  {
			accountname.sendKeys("kll");		
}	
		public void clickonsave()  {
			save.click();
			
}
		public void clickonnewview()  {
			newview.click();	
}
		public void clickonviewname()  {
			waitForElement(10,viewname);
			viewname.sendKeys("Indian");	
}
		public void clickonuniqueviewname()  {
			waitForElement(10,uniquename);
			uniquename.clear();
			uniquename.sendKeys("Global Media");		
}
		public void clickonrecentlycreated()  {
			recentlycreated.click();
			Select dd=new Select(recentlycreated);
			dd.selectByVisibleText("Recently Created");
}
		public void clickonview()  {
			view.click();
			Select dd=new Select(view);
			dd.selectByVisibleText("My Contacts");
}
		
		public void clickonrecentcontact()  {
			contact.click();	
}	
		public void Actualvalue()  {
			waitForElement(10,errormsg);
			String Actualtitle=errormsg.getText();
			System.out.println(Actualtitle);
			String Expectedtitle="Error: You must enter a value";
			Assert.assertEquals(Actualtitle, Expectedtitle);
		}
		public void clickoncancel()  {
			cancel.click();	
}	
		public void clickonsaveandnew()  {
			saveandnew.click();	
}	
		
}
