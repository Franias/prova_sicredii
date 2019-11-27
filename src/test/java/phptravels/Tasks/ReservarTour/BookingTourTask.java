package phptravels.Tasks.ReservarTour;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import phptravels.AppObjects.ReservarTour.BookingTourAppObject;
import frameworks.utils.ScreenshotFw;
import phptravels.AppObjects.ReservarTour.BookingTourAppObject;

public class BookingTourTask {
	private WebDriver driver;
	private BookingTourAppObject chooseTourAppObject;
	
	public BookingTourTask(WebDriver driver) {
		this.driver = driver;
		chooseTourAppObject = new BookingTourAppObject(driver);
	}	
	public void chooseTour(String date) {
		Actions actions = new Actions(driver);
		chooseTourAppObject.getToHome().click();
		actions.doubleClick(chooseTourAppObject.getToHome()).perform();
		chooseTourAppObject.getToursNavButton().click();		
		chooseTourAppObject.getDateTextField().clear();
		chooseTourAppObject.getDateTextField().sendKeys(date);
		chooseTourAppObject.getDateTextField().sendKeys(Keys.ENTER);
		chooseTourAppObject.getChooseLocation().click();
		
		ScreenshotFw.takeFullPageShot(driver, "chooseTour");
	}
	public void bookingOptions(String date) {
		chooseTourAppObject.getDateTextFieldBooking().clear();
		chooseTourAppObject.getDateTextFieldBooking().sendKeys(date);
		chooseTourAppObject.getChangeDateButton().click();
		chooseTourAppObject.getChildComboBox().selectByVisibleText("3");
		chooseTourAppObject.getBookNowButton().click();
		chooseTourAppObject.getConfirmBookingButton().click();
		chooseTourAppObject.getPayNowButton().click();	
	}	
	public void paymentSteps(String FirstName, String LastName, String CardNumber, String CVV) {
		chooseTourAppObject.getGatewayButton().click();
		chooseTourAppObject.getSearchTextField().click();
		chooseTourAppObject.getSearchTextField().sendKeys("stripe");
		chooseTourAppObject.getSearchTextField().sendKeys(Keys.ENTER);
		chooseTourAppObject.getFirstNameTextField().sendKeys(FirstName);
		chooseTourAppObject.getLastNameTextField().sendKeys(LastName);
		chooseTourAppObject.getCardNumberTextField().sendKeys(CardNumber);
		chooseTourAppObject.getExpiryMonthComboBox().selectByValue("12");
		chooseTourAppObject.getExpiryYearComboBox().selectByValue("2020");
		chooseTourAppObject.getCVVTextField().sendKeys(CVV);
		chooseTourAppObject.getPayNowGreenButton().click();
		
//		ScreenshotFw.takeViewpointShot(driver, "paymentSteps");
		
	}	
}
