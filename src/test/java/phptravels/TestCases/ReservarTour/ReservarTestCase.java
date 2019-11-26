package phptravels.TestCases.ReservarTour;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import phptravels.Tasks.ReservarTour.BookingTourTask;
import phptravels.Tasks.ReservarTour.LoginTask;
import phptravels.Tasks.ReservarTour.MyAccountTask;
import frameworks.utils.BaseTestFw;

public class ReservarTestCase extends BaseTestFw{
	private WebDriver driver = getDriver();
	
	private LoginTask loginTask = new LoginTask(driver);
	private BookingTourTask bookingTourTask = new BookingTourTask(driver);
	private MyAccountTask myAccountAppObject = new MyAccountTask(driver);
	
	@Before
	public void setUp() {
		driver.get("http://www.phptravels.net/");
	}
	
	@Test
	public void reservar() {		
		loginTask.logar("mociric475@tmail1.com", "qrpurm");
		bookingTourTask.chooseTour("31/12/2020");
		bookingTourTask.bookingOptions("31/12/2020");
		bookingTourTask.paymentSteps("Fran", "Dias", "515151551415", "154");
		myAccountAppObject.confirmReservation();
	}
}
