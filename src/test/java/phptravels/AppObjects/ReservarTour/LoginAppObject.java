package phptravels.AppObjects.ReservarTour;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginAppObject {
	private static WebDriver driver;
	public LoginAppObject(WebDriver driver) {
		 this.driver = driver;
	}	
	public WebElement myAccountDropdown() {
		return driver.findElement(By.xpath("//a[text()=' My Account                  ']"));
	}
	public WebElement loginButton() {
		return driver.findElement(By.xpath("//a[text()='Login']"));
	}
	public WebElement emailTextField() {
		return driver.findElement(By.name("username"));
	}
	public WebElement passwdTextField() {
		return driver.findElement(By.name("password"));
	}
	public WebElement loginSubmitButton() {
		return driver.findElement(By.xpath("//button[text()='Login']"));
	}
	
	
	
	
	
}
