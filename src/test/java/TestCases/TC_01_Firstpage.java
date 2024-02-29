package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import factory.BaseClass;
import pageObjects.CourseraPage;
import pageObjects.SearchresultPage;


public class TC_01_Firstpage extends BaseClass{
	
	
//ExploreNairobiPage en=new ExploreNairobiPage(driver);

	@Test(priority = 1)
	public void Webdevinput() throws InterruptedException, IOException {
		CourseraPage cp=new CourseraPage(driver);
		cp.Webdevtxt();
		cp.clickSearch();
		
		
	
	}
	@Test(priority = 2)
	public void filterResult() throws IOException {
		SearchresultPage sp=new SearchresultPage(driver);
		logger.info("filter Result");
		sp.showmore();
		sp.languages();
		sp.selectEnglish();
		sp.apply();
		sp.levels();
		sp.selectLevels();
		
	}
	@Test(priority = 3)
	public void fetchCourseDetails() throws IOException {
		
		SearchresultPage sp=new SearchresultPage(driver);
		sp.coursedetails();
	}
	
	
}
