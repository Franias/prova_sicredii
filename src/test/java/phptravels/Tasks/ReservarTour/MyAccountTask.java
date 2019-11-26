package phptravels.Tasks.ReservarTour;

import org.openqa.selenium.WebDriver;

import phptravels.AppObjects.ReservarTour.MyAccountAppObject;
import frameworks.utils.ScreenshotFw;

public class MyAccountTask {
	private WebDriver driver;
	private MyAccountAppObject myAccountAppObject;
	
	public MyAccountTask(WebDriver driver) {
		this.driver = driver;
		myAccountAppObject = new MyAccountAppObject(driver);
	}
	
	public void confirmReservation() {
		myAccountAppObject.getToAccountButton().click();
		myAccountAppObject.getToAccount().click();
		myAccountAppObject.getLocationConfirm();
		
		ScreenshotFw.takeViewpointShot(driver, "confirmReservation");
	}	
}
