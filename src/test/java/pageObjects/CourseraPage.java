package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import factory.BaseClass;

public class CourseraPage extends BasePage {
	
	public CourseraPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//form//input")
	WebElement textbox;
	
	@FindBy(xpath="//form//button[2]/div")
	WebElement searchbox;
	
	//@FindBy(xpath="")
	
	public void Webdevtxt() throws InterruptedException {
		textbox.sendKeys("web development");
		Thread.sleep(4000);
	}
	public void clickSearch() {
		searchbox.click();
	}
	
	

}
