package com.training.Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.training.Base.Basepage;

public class CreateAccountPage extends Basepage {
	
	public CreateAccountPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(id="username")
	WebElement name;
	@FindBy(id="password")
	WebElement password;
	@FindBy(id="Login")
	WebElement loginButton;
	@FindBy(xpath="//a[@title='Accounts Tab']")
	WebElement accounts;
	@FindBy(xpath="//a[@id='tryLexDialogX']")
	WebElement popup;
	@FindBy(xpath="//input[@name='new']")
	WebElement New;
	@FindBy(xpath="//a[contains(text(),'Create New View')]")
	WebElement createnewview;
	@FindBy(id="fname")
	WebElement viewname;
	@FindBy(id="devname")
	WebElement uniqueviewname;
	@FindBy(xpath="//input[@data-uidsfdc='3']")
	WebElement save;
	@FindBy(id="fcf")
	WebElement view;
	@FindBy(xpath="//a[@href='/ui/list/FilterEditPage?id=00B5g00000j1WcU&retURL=%2F001%3Ffcf%3D00B5g00000j1WcU%26rolodexIndex%3D-1%26page%3D1']")
	WebElement edit;
	@FindBy(id="fname")
	WebElement Viewname;
	@FindBy(id="fcol3")
	WebElement field;
	@FindBy(id="fop3")
	WebElement operator;
	@FindBy(id="fval3")
	WebElement value;
	@FindBy(xpath="//input[@data-uidsfdc='3']")
	WebElement Save;
	@FindBy(xpath="//table[@id='toolsContent']//div[@class='bSubBlock brandSecondaryBrd secondaryPalette']//a[contains(text(),'Merge Accounts')]")
	WebElement tools;
	@FindBy(id="srch")
	WebElement search;
	@FindBy(xpath="//input[@title='Find Accounts'][@type='submit']")
	WebElement findaccount;
	@FindBy(xpath="//input[@name='goNext'][@title='Next']")
	WebElement next;
	@FindBy(xpath="//input[@name='save'][@title='Merge']")
	WebElement merge;
	@FindBy(xpath="//table[@id='toolsContent']//div[@class='toolsContentLeft']//div[@class='bSubBlock brandSecondaryBrd secondaryPalette']//a[contains(text(),'Accounts with last activity > 30 days')]")
	WebElement reports;
	@FindBy(id="ext-comp-1042")
	WebElement fromdate;
	@FindBy(id="ext-comp-1045")
	WebElement todate;
	@FindBy(id="ext-gen49")
	WebElement savereport;
	@FindBy(id="saveReportDlg_reportNameField")
	WebElement reportname;
	@FindBy(id="saveReportDlg_DeveloperName")
	WebElement reportuniquename;
	@FindBy(id="ext-gen303")
	WebElement saveandrun;
	
	
	
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
	public void clickonaccounts()  {
	accounts.click();
	
	
	}
	public void clickonnew()  {
		New.click();
		}
	
	public void clickonnewview()  {
		waitForElement(20,createnewview);
		createnewview.click();
		}
	public void enterviewname()  {
		waitForElement(20,viewname);
		viewname.sendKeys("Account1");
		}
	public void enteruniqueviewname()  {
		uniqueviewname.sendKeys("Account1");
		}
	public void clickonnewsave()  {
		waitForElement(20,save);
		save.click();
		}
	public void clickonview()  {
		waitForElement(20,view);
		view.click();
		Select viewdropdown=new Select(view);
		viewdropdown.selectByVisibleText("New view Name");
		}
	public void clickonedit()  {
		waitForElement(30,edit);
		edit.click();
		}
	public void clickonviewname()  {
		Viewname.clear();
		Viewname.sendKeys("New View Name");
		}
	public void clickonfield()  {
		field.click();
		Select fielddropdown=new Select(field);
		fielddropdown.selectByVisibleText("Account Name");
		}
	public void clickonoperator()  {
		operator.click();
		Select operatordropdown=new Select(operator);
		operatordropdown.selectByVisibleText("contains");
		}
	public void clickonvalue()  {
		value.sendKeys("a");
		}
	public void clickonsave()  {
		waitForElement(20,Save);
		Save.click();
		}
	public void clickonmergeaccounts()  {
		waitForElement(20,tools);
		tools.click();
		}
	public void searchaccount()  {
		search.click();
		search.sendKeys("Account");
		}
	public void clickonfindaccount()  {
		findaccount.click();
		}
	public void clickonnext()  {
		waitForElement(20,next);
		next.click();
		}
	public void clickonmerge()  {
		merge.click();
		driver.switchTo().alert().accept();
		}
	public void clickonreports()  {
		waitForElement(20,reports);
		reports.click();
		}
	public void enterfromdate()  {
		waitForElement(20,fromdate);
		fromdate.clear();
		fromdate.sendKeys("12/11/2022");
		}
	public void entertodate()  {
		todate.clear();
		todate.sendKeys("13/11/2022");
		}
	public void clickonsavereport()  {
		savereport.click();
		}
	public void enterreportname()  {
		reportname.sendKeys("madish");
		}
	public void enterreportuniquename()  {
		reportuniquename.click();
		}
	public void clicksavereportbutton()  {
		waitForElement(20,saveandrun);
		saveandrun.click();
		}
	}
