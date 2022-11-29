package com.training.Pages;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.training.Base.Basepage;

public class OpportunitiesPage extends Basepage {
	public OpportunitiesPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(id="username")
	WebElement name;
	@FindBy(id="password")
	WebElement password;
	@FindBy(id="Login")
	WebElement loginButton;
	@FindBy(id="Opportunity_Tab")
	WebElement opportunities;
	
	@FindBy(id="fcf")
	WebElement View;
	@FindBy(xpath="//input[@name='new']")
	WebElement New;
	@FindBy(id="opp3")
	WebElement opportunityname;
	@FindBy(id="opp4")
	WebElement accountname;
	@FindBy(id="opp6")
	WebElement leadsource ;
	@FindBy(id="opp9")
	WebElement date;
	@FindBy(id="opp11")
	WebElement stage;
	@FindBy(xpath="//table[@id='datePickerCalendar']//td[@class='weekday todayDate']")
	WebElement currentdate ;
	
	@FindBy(id="opp12")
	WebElement propability;
	@FindBy(id="opp17")
	WebElement source;
	@FindBy(xpath="//input[@value=' Save ']")
	WebElement save;
	@FindBy(xpath="//table[@id='toolsContent']//div[@class='toolsContentLeft']//a[contains(text(),'Opportunity Pipeline')]")
	WebElement optypipeline;
	@FindBy(xpath="//table[@id='toolsContent']//div[@class='toolsContentLeft']//a[contains(text(),'Stuck Opportunities')]")
	WebElement stuckopty;
	@FindBy(xpath="//table[@class='opportunitySummary']//select[@id='quarter_q']//option[@value='curnext1']")
	WebElement interval;
	@FindBy(xpath="//table[@class='opportunitySummary']//select[@id='open']//option[@value='closed']")
	WebElement include;
	@FindBy(xpath="//table[@class='opportunitySummary']//input[@name='go']")
	WebElement run;
	
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
		public void clickonopportunities()  {
		
			opportunities.click();
		
			
}
		public void clickonview()  {
			
			String dd=View.getText();
			System.out.println(dd);
}	
		
		public void clickonnew()  {
			waitForElement(10,New);
			New.click();	
}	
		
		public void clickonopportunityname() {
			opportunityname.sendKeys("madi");
		}
		public void clickonaccountname() {
			accountname.sendKeys("kll");
		}
		public void clickonleadsource() {
			
			leadsource.click();
			Select leaddd=new Select(leadsource);
			leaddd.selectByVisibleText("Web");
			
		}
		public void clickondate() {
			date.click();
			waitForElement(10,currentdate);
			currentdate.click();
		}	
		public void clickonstage() {
			waitForElement(10,stage);
			stage.click();
			Select stagedd=new Select(stage);
			stagedd.selectByVisibleText("Prospecting");
			
		}
		public void clickonpropability() {
			propability.clear();
			propability.sendKeys("20");
		}
		public void clickonasorce() {
			source.click();
			source.sendKeys("abc");
		}
		public void clickonsave() {
			save.click();
		}
		public void clickonpipeline() {
			optypipeline.click();
		}
		public void clickonstuck() {
			stuckopty.click();
		}
		public void clickoninterval() {
			interval.click();
		}
		public void clickoninclude() {
			include.click();
		}	
		public void clickonrunreport() {
			run.click();
		}	

}
