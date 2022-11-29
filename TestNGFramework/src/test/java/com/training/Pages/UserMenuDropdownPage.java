package com.training.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.training.Base.Basepage;

public class UserMenuDropdownPage extends Basepage {
	public UserMenuDropdownPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(id="username")
	WebElement name;
	@FindBy(id="password")
	WebElement password;
	@FindBy(id="Login")
	WebElement loginButton;
	@FindBy(xpath="//span[@id='userNavLabel']")
	WebElement usermenu;
	@FindBy(xpath="//a[@title='My Profile']")
	WebElement myprofile;
	@FindBy(xpath="//a[@class='contactInfoLaunch editLink']//img")
	WebElement edit;
	@FindBy(id="contactInfoContentId")
	WebElement imageframe;
	@FindBy(xpath="//a[contains(text(),'About')]")
	WebElement About;
	@FindBy(id="lastName")
	WebElement lastname;
	@FindBy(xpath="//input[@value='Save All']")
	WebElement saveall;
	@FindBy(xpath="//a[@id='publisherAttachTextPost']//img")
	WebElement post;
	@FindBy(id="//iframe[@title='Rich Text Editor, publisherRichTextEditor']")
	WebElement postframe;
	@FindBy(xpath="html[@dir='ltr']")
	WebElement shareandupdate;
	@FindBy(id="publishersharebutton")
	WebElement share;
	@FindBy(xpath="//span[@class='publisherattachtext '][contains(text(),'File')]")
	WebElement file;
	
	
	@FindBy(xpath="//a[contains(text(),'My Settings')]")
	WebElement mysettings;
	@FindBy(xpath="//span[@id='PersonalInfo_font']")
	WebElement personal;
	@FindBy(xpath="//div[@id='AutoNumber5']//div[@id='PersonalInfo']//span[@id='LoginHistory_font']")
	WebElement loginhistory;
	@FindBy(id="DisplayAndLayout_font")
	WebElement displayandlayout;
	@FindBy(xpath="//span[@id='CustomizeTabs_font']")
	WebElement customizemytabs;
	@FindBy(id="p4")
	WebElement content;
	@FindBy(xpath="//option[@value='report']")
	WebElement reports;
	@FindBy(xpath="//img[@title='Add']")
	WebElement add;
	@FindBy(xpath="//input[@value=' Save ']")
	WebElement save;
	@FindBy(id="EmailSetup_font")
	WebElement email;
	@FindBy(id="EmailSettings_font")
	WebElement myemailsettings;
	@FindBy(id="sender_name")
	WebElement emailname;
	@FindBy(id="sender_email")
	WebElement emailaddress;
	@FindBy(xpath="//input[@value=' Save ']")
	WebElement Save;
	@FindBy(id="CalendarAndReminders_font")
	WebElement calendar;
	@FindBy(id="Reminders_font")
	WebElement activity;
	@FindBy(id="testbtn")
	WebElement testremainder;
	@FindBy(xpath="//a[@class='debugLogLink menuButtonMenuLink']")
	WebElement developersconsole;
	@FindBy(xpath="//a[@title='Logout']")
	WebElement logout;
	
	public void enterintousername(String strname) {
		waitForElement(20,name);
		name.sendKeys(strname);
		
	}
		public void enterintopassword(String strpassword) {
			password.sendKeys(strpassword);		
		
	}
		public void clickonlogin()  {
			waitForElement(10,loginButton);
			loginButton.click();
			
}
		public void usermenudropdown()  {
			waitForElement(20,usermenu);
			usermenu.click();		
}
		public void Myprofile()  {
			waitForElement(20,myprofile);
			myprofile.click();	
		}
		
		public void clickonedit()  {
			waitForElement(20,edit);
			edit.click();	
		}
		
		public void switchtoabout()  {
			waitForElement(20,imageframe);
			driver.switchTo().frame(imageframe);
			
		}
		
		public void clickabout()  {
			waitForElement(10,About);
			About.click();	
		}
		public void enterlastname()  {
			lastname.clear();
			
			lastname.sendKeys("Madis");
		}
		public void clicksaveall()  {
		saveall.click();
		}
		public void clickpost()  {
			waitForElement(20,post);
			post.click();
			}
		
		public void Postframe()  {
			waitForElement(10,postframe);
			driver.switchTo().frame(postframe);
			
		}
		
public void Shareandupdate()  {
			shareandupdate.click();
			shareandupdate.sendKeys("Hi,Welcome to salesforce app");
			share.click();
		}
     public void clickonfile()  {
    	 waitForElement(20,file);
	   file.click();		

     }
		
		public void selectmysettings()  {
			waitForElement(20,mysettings);
			mysettings.click();
}
		public void selectmypersonnal()  {
			waitForElement(20,personal);
			personal.click();
}
		public void selectloginhistory()  {
			waitForElement(30,loginhistory);
			Actions action=new Actions(driver);
			action.moveToElement(loginhistory).build().perform();
		
}
		public void selectdisplayandlayout()  {
			waitForElement(20,displayandlayout);
			displayandlayout.click();
}	
		public void selectcustomizemytabs() {
			waitForElement(20,customizemytabs);
			customizemytabs.click();
}
		public void selectcustomapp() {
			Select customapp=new Select(content);
			 customapp.selectByVisibleText("Salesforce Chatter");
		}
		public void selectavailabletabs()  {
			reports.click();
		}
		public void clickadd()  {
			add.click();
		}
		public void clicksave()  {
			save.click();
		}
		public void selectemail() {
			
			//Select customapp=new Select(email);
			 //customapp.selectByVisibleText("Salesforce Chatter");	
			email.click();
			waitForElement(20,email);
		}
		public void selectmyemailsettings() {
		myemailsettings.click();
		}
		public void Emailname() {
			emailname.clear();
			emailname.sendKeys("Swathi");
			}
		public void Emailaddress() {
			emailaddress.clear();
			emailaddress.sendKeys("kll94538@gmail.com");
			}
		public void clickSave() {
		Save.click();
		}
     public void calendarandremainder() {
			calendar.click();
			activity.click();
     }
     public void openatestremainder() {
			testremainder.click();
}
     
     public void clickdevelopersconsole (){
			developersconsole.click();
			String parentwindow=driver.getWindowHandle();	
			for(String handle:driver.getWindowHandles()) {
				driver.switchTo().window(handle);
				}
				String title=driver.getTitle();
				System.out.println(title);
				driver.switchTo().window(parentwindow);
}	
     public void clicklogout() {
 		logout.click();
 		}
}
