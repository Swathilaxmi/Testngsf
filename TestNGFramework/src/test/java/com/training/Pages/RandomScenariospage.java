package com.training.Pages;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.training.Base.Basepage;

public class RandomScenariospage extends Basepage {
	public RandomScenariospage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(id="username")
	WebElement name;
	@FindBy(id="password")
	WebElement password;
	@FindBy(id="Login")
	WebElement loginButton;
	@FindBy(xpath="//ul[@id='tabBar']//a[@title='Home Tab - Selected']")
	WebElement home;
	@FindBy(xpath="//div[@class='recentItemModule sidebarModule']//div[@id='92']//div[@id='hoverItem93']")
	WebElement userfirstlastname;
	
	
	public void enterintousername(String strname) {
		waitForElement(20,name);
		name.sendKeys(strname);
		
	}
		public void enterintopassword(String strpassword) {
			//waitForElement(20,password);
			password.sendKeys(strpassword);		
		
	}
		public void clickonlogin()  {
			//waitForElement(20,loginButton);
			loginButton.click();		
}
		public void clickonhome()  {
			waitForElement(20,home);
			home.click();		
}	
		
		public void clickonuserfirstandlastname()  {
		
			userfirstlastname.click();		
}	
}
