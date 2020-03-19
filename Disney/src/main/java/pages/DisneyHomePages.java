package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import actions.DisneyActions;

public class DisneyHomePages extends DisneyActions{
	
	public DisneyHomePages(RemoteWebDriver  driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	//@FindBy(xpath="//span[contains(text(),'Account & Lists')]")
	@FindBy(id="nav-link-accountList")
	private WebElement clickSigin;
	public LoginScreen selectMovie()  {
		/*
		 * Actions act = new Actions(driver);
		 * act.moveToElement(mouseOverMovie).build().perform();
		 */
		clickAction(clickSigin);
		return new LoginScreen(driver);
		
	}
	
	

}
