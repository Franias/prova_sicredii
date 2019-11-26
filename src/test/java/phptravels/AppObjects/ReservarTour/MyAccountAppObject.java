package phptravels.AppObjects.ReservarTour;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import frameworks.utils.WaitElementFw;

public class MyAccountAppObject {
	
	private static WebDriver driver;
	public MyAccountAppObject(WebDriver driver) {
		 this.driver = driver;
	}
	public WebElement getToAccountButton() {
		WaitElementFw.elementToBeClickable(driver, By.id("dropdownCurrency"));
		return driver.findElement(By.id("dropdownCurrency"));
	}
	public WebElement getToAccount() {
		WaitElementFw.visibilityOfElementLocated(driver, By.xpath("//a[@href='http://www.phptravels.net/account']"));
		return driver.findElement(By.xpath("//a[@href='http://www.phptravels.net/account']"));
	}
	public WebElement getLocationConfirm() {
		return driver.findElement(By.xpath("//b[text()='Spectaculars Of The Nile 3 Nights']"));
	}

}
