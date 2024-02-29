package TestCases;

import org.testng.annotations.Test;

import factory.BaseClass;
import pageObjects.ErrormessagePage;

public class TC_02_errorcapture extends BaseClass {

	
	@Test(priority = 1)
	public void fillForm() throws InterruptedException {
		ErrormessagePage ep=new ErrormessagePage(driver);
		ep.forenter();
		ep.soln();
		ep.coursofcamp();
		ep.Firstname();
		ep.LastName();
		ep.email();
		ep.Phoneno();
		ep.InstitutionType();
		ep.institutinname();
		ep.Jobrole();
		ep.department();
		ep.need();
		ep.country();
		
		
		
		
	}
	@Test(priority = 2)
	public void submit() {
		ErrormessagePage ep=new ErrormessagePage(driver);
		ep.submit();
	}
	@Test(priority = 3)
	public void printErrorMessage() {
		ErrormessagePage ep=new ErrormessagePage(driver);
		ep.errormessage();
		
	}
	
	
}
