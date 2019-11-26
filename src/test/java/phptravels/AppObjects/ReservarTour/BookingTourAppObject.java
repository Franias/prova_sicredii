package phptravels.AppObjects.ReservarTour;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import frameworks.utils.WaitElementFw;

public class BookingTourAppObject {
	private static WebDriver driver;
	public BookingTourAppObject(WebDriver driver) {
		 this.driver = driver;
	}	
	
	public WebElement getToHome() {
		WaitElementFw.elementToBeClickable(driver, By.xpath("//a[contains(@href,'https://www.phptravels.net/')]/img"));
		return driver.findElement(By.xpath("//a[contains(@href,'https://www.phptravels.net/')]/img"));
}
	public WebElement getToursNavButton() {
		WaitElementFw.visibilityOfElementLocated(driver, By.xpath("//a[@data-name='tours']"));
		return driver.findElement(By.xpath("//a[@data-name='tours']"));
	}
	public WebElement getChooseLocation() {
		return driver.findElement(By.xpath("//a[text()='Spectaculars Of The…']"));
	}
	
	public WebElement getDateTextField() {
		return driver.findElement(By.id("DateTours"));
	}	
	public WebElement getDateTextFieldBooking() {
		return driver.findElement(By.name("date"));
	}	
	public WebElement getChangeDateButton() {
		return driver.findElement(By.xpath("//button[text()='Change Date']"));
	}	
	public Select getChildComboBox() {
		return new Select(this.driver.findElement(By.name("child")));
	}
	public WebElement getBookNowButton() {
		WaitElementFw.visibilityOfElementLocated(driver, (By.xpath("//button[text()='Book Now']")));
		return driver.findElement(By.xpath("//button[text()='Book Now']"));
	}
	public WebElement getNotesTextField() {
		return driver.findElement(By.name("additionalnotes"));
	}	
	public WebElement getConfirmBookingButton() {
		WaitElementFw.elementToBeClickable(driver, (By.xpath("//button[@name='logged'][text()='CONFIRM THIS BOOKING']")));
		return driver.findElement(By.xpath("//button[@name='logged'][text()='CONFIRM THIS BOOKING']"));
	}	
	public WebElement getPayNowButton() {
		WaitElementFw.visibilityOfElementLocated(driver, (By.xpath("//center/button[text()='Pay Now']")));
		return driver.findElement(By.xpath("//center/button[text()='Pay Now']"));
	}	
	public WebElement getGatewayButton() {
		WaitElementFw.visibilityOfElementLocated(driver, (By.xpath("//span[text()='Select Payment Method']")));
		return driver.findElement(By.xpath("//span[text()='Select Payment Method']"));
	}	
	public Select getGatewayComboBox() {
		WaitElementFw.elementToBeClickable(driver, By.id("gateway"));
		return new Select(this.driver.findElement(By.id("gateway")));	}
	
	public WebElement getSearchTextField() {
		WaitElementFw.elementToBeClickable(driver, By.className("chosen-search-input"));
		return driver.findElement(By.className("chosen-search-input"));
	}
	public WebElement getFirstNameTextField() {
		WaitElementFw.visibilityOfElementLocated(driver, By.name("firstname"));
		return driver.findElement(By.name("firstname"));
	}	
	public WebElement getLastNameTextField() {
		return driver.findElement(By.name("lastname"));
	}
	public WebElement getCardNumberTextField() {
		return driver.findElement(By.id("card-number"));
	}
	public Select getExpiryMonthComboBox() {
		return new Select(this.driver.findElement(By.id("expiry-month")));
	}
	public Select getExpiryYearComboBox() {
		return new Select(this.driver.findElement(By.id("expiry-year")));
	}
	public WebElement getCVVTextField() {
		return driver.findElement(By.id("cvv"));
	}
	public WebElement getPayNowGreenButton() {
		return driver.findElement(By.xpath("//button[@onclick='return expcheck();']"));
	}	
}
