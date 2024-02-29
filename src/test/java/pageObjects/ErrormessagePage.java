package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import factory.BaseClass;

public class ErrormessagePage extends BasePage {

	BaseClass base=new BaseClass();
	public ErrormessagePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="//a[normalize-space()='For Enterprise']")
	WebElement forenterprice;
	
	
	@FindBy(xpath="//a[normalize-space()='Solutions']")
	WebElement solutions;
	
	
	@FindBy(xpath="//p[normalize-space()='Coursera for Campus']")
	WebElement courseraforcampus;
	
	@FindBy(id="FirstName")
	WebElement Firstname;
	
	@FindBy(id="LastName")
	WebElement Lastname;
	
	@FindBy(id="Email")
	WebElement EmailAddress;
	
	@FindBy(id="Phone")
	WebElement phoneno;
	
	@FindBy(id="Institution_Type__c")
	WebElement Institurintype;
	
	@FindBy(id="Company")
	WebElement InstitutionName;
	
	@FindBy(id="Title")
	WebElement jobrole;
	
	@FindBy(id="Department")
	WebElement department;
	
	@FindBy(id="What_the_lead_asked_for_on_the_website__c")
	WebElement needs;
	
	@FindBy(id="Country")
	WebElement country;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement submit;
	
	@FindBy(id="ValidMsgEmail")
	WebElement errormessage;
	
	
	
	public void forenter() {
		base.clicker(forenterprice);
	}
	
	public void soln() {
		base.clicker(solutions);
	}
	public void coursofcamp() {
		base.clicker(courseraforcampus);
	}
	public void Firstname() throws InterruptedException {
		Firstname.sendKeys(base.randomString());
		
	}
	public void LastName() {
		Lastname.sendKeys(base.randomString());
	}
	public void email() {
		EmailAddress.sendKeys(base.randomString()+base.reandomNumber());
	}
	public void Phoneno() {
		phoneno.sendKeys(base.reandomNumber());
	}
	public void  InstitutionType() throws InterruptedException {
		base.select(Institurintype,3);
		
	}
	public void institutinname(){
		InstitutionName.sendKeys(base.randomString());
	}
	public void Jobrole() {
		base.select(jobrole, 3);
		
	}
	public void department() {
		base.select(department, 3);
	}
	public void need() {
		base.select(needs, 3);
	}
	public void country() {
		base.select(country,3);
	}
	public void submit() {
		base.clicker(submit);
		JavascriptExecutor jss=(JavascriptExecutor)driver;
		jss.executeScript("arguments[0].scrollIntoView(true);", EmailAddress);
	}
	public void errormessage() {
		
		System.out.println("The messgae after entering wrong emailId");
		System.out.println("--------------------------------------------");
		System.out.println(errormessage.getText());
		System.out.println("--------------------------------------------");
	}
	
	
}
