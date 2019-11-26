package phptravels.Tasks.ReservarTour;

import org.openqa.selenium.WebDriver;

import phptravels.AppObjects.ReservarTour.LoginAppObject;
import frameworks.utils.ScreenshotFw;

public class LoginTask {
	private WebDriver driver;
	private LoginAppObject loginAppObject;
	
	public LoginTask(WebDriver driver){
		this.driver = driver;
		this.loginAppObject = new LoginAppObject(driver);
	}
	
	public void logar(String email, String senha){
		loginAppObject.myAccountDropdown().click();
		loginAppObject.loginButton().click();
		loginAppObject.emailTextField().sendKeys(email);
		loginAppObject.passwdTextField().sendKeys(senha);
		loginAppObject.loginSubmitButton().click();
		
		ScreenshotFw.takeViewpointShot(driver, "logar");
	}
	
}
