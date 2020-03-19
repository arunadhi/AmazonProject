package disneyRunner;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

import actions.DisneyActions;
import pages.DisneyHomePages;

public class Runner extends DisneyActions{
	
	  @BeforeClass 
	  public void excelData(){ 
		  dataFile ="C:\\Users\\Nitdeep\\Desktop\\Selenium\\Disney\\TestData\\Amazon.xlsx";
		  }
	 
	
	@Test (dataProvider ="getData") 
	public void runTest(String no, String user, String pwd ) throws InterruptedException {
		new DisneyHomePages(driver)
		.selectMovie()
		.enterUser(user);
		
		
	}
    
}
