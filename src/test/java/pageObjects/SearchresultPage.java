package pageObjects;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import factory.BaseClass;
import utilities.WriteData;

public class SearchresultPage extends BasePage {
	
	BaseClass base=new BaseClass();
	public SearchresultPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="//*[@data-testid=\"search-filter-group-Level\"]//div[1]/div[1]/div")
	List<WebElement> listOfLevels;
	
	@FindBy(xpath="//*[@id=\"checkbox-group\"]/div")
	List<WebElement> listOfLanguages;
	
	@FindBy(xpath="//button[@aria-label='Show more Language options']")
	WebElement showMore;
	
	@FindBy(xpath="//*[@data-testid=\"scroll-container\"]/div[3]/button[1]")
	WebElement apply;
	
	
	@FindBy(xpath="//*[@class=\"css-kplcru\"]")
	List<WebElement> courseName;
	
	@FindBy(xpath="(//*[@class=\"css-lt1dx1\"]/div[1]/div[1])[2]")
	WebElement ratings;

	@FindBy(xpath="(//*[@class=\"css-lt1dx1\"]/div[3]/div[1])[2]")
	WebElement learningtimings;
	
	
	public void languages() throws IOException {
		BaseClass bs=new BaseClass();
		System.out.println("-----------List of languages---------------");
		bs.printList(listOfLanguages);
		System.out.println("No of Languages--->"+listOfLanguages.size());
		
	}
	public void levels() throws IOException {
		BaseClass bs2=new BaseClass();
		System.out.println("-----------List of Levels------------------");
		bs2.printList(listOfLevels);
		System.out.println("No of levels--->"+listOfLevels.size());
	}
	
	public void showmore() {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",showMore);
	}
	
	public void apply() {
		JavascriptExecutor js2=(JavascriptExecutor)driver;
		js2.executeScript("arguments[0].click();",apply);
	}
	public void selectEnglish() {
		//BaseClass bs=new BaseClass();
		base.SelectStr("English", listOfLanguages);
	}
	public void selectLevels() {
		//BaseClass bs1=new BaseClass();
		base.SelectStr("Beginner",listOfLevels);
	}
	public void coursedetails() throws IOException  {
	  base.CourseDetais(courseName, ratings, learningtimings);
	  
	  
	}
	
	
	
	
	
	
	

}