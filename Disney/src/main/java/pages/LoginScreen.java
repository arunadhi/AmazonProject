package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import actions.DisneyActions;


public class LoginScreen extends DisneyActions{

	
		public LoginScreen (RemoteWebDriver  driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
			
		}
		
		@FindBy(id="ap_email")
		private WebElement id;
		public LoginScreen enterUser(String data) {
			enterText(id, data);
			return this;
			
		}
	

}
