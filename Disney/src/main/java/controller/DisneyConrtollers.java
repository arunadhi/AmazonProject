package controller;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

// all locators listed
public class DisneyConrtollers 
{
   
	public RemoteWebDriver  driver;
	public void browserType(String browser, String url) {
		
	
		switch(browser){
		
		case"ie":System.setProperty("webdriver.ie.driver", "C:\\Users\\Nitdeep\\Desktop\\Selenium\\Disney\\driver\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		break;
		case"chrome":System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nitdeep\\Desktop\\Selenium\\Disney\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		break;
		
		}
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
		
		
	}
	
	public WebElement allLocators(String locator, String locatorValue) {
		
		WebElement element = null;
		
		switch(locator) {
		case"id":element= driver.findElement(By.id(locatorValue));
		break;
		case"name": element= driver.findElement(By.name(locatorValue));
		break;
		case"classname":element= driver.findElement(By.className(locatorValue));
		break;
		case"xpath": element=driver.findElement(By.xpath(locatorValue));
		break;
		case"linkText":element= driver.findElement(By.linkText(locatorValue));
		break;
		}
			
		return element;
	}
	
	public void enterText(WebElement element, String data) {
		element.clear();
		element.sendKeys(data);
		
	}
	
	
	public void clickAction(WebElement element) {
		element.click();
	}
	
	public void getTitleOfThePage() {
		driver.getTitle();
	}
	
	public String getTextValue(WebElement element) {
		
		String data= element.getText();
		return data;
		
	}
	
	public String getAttributeValue(WebElement element, String value) {
		
		String data = element.getAttribute(value);
		return data;
	}
	
	public void takeScreenshot() throws IOException{
		
		
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("E:\\Screenshot"+System.currentTimeMillis()+".jpg"));
	
	}

	public void closeBrowser() {
	driver.close();
	}

	public void quitBrowser() {
	driver.quit();
}
}
