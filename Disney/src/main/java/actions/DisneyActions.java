package actions;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;

import controller.DisneyConrtollers;
import util.DisneyUtil;



public class DisneyActions  extends DisneyConrtollers{
	public String dataFile;
	
	/*@BeforeMethod
	public void openBro() throws IOException {
		String path = "C:\\Users\\Nitdeep\\Desktop\\Selenium\\Disney\\disney.properties";
		FileInputStream file = new FileInputStream(path);
		Properties prop = new Properties();
		prop.load(file);
		String cbrowser = prop.getProperty("cbrowser");
		String ibrowser = prop.getProperty("ibrowser");
		String url = prop.getProperty("url");
		browserType(ibrowser, url);
	}*/
	
	
	  @BeforeMethod
	  @Parameters({"browser", "url"})
	  public void browserOpens(String browser,String url) {
		  browserType(browser, url);
	  
	  }
	 
	

	  @DataProvider (name = "getData")
	  public Object [][] readData() throws  IOException
	  { 
	  DisneyUtil data = new DisneyUtil(); 
	  return data.dataSheet(dataFile);
	  }
	
	@AfterMethod
	public void closeBrowserType() {
		quitBrowser();
	}

}
