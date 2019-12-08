package automationpratice.AppObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import frameworks.utils.WaitElementFw;

public class CreateAccountAppObject {
	private static WebDriver driver;
	public CreateAccountAppObject(WebDriver driver) {
		this.driver = driver;
	}	

	public WebElement getGenderRadio() {
		WaitElementFw.visibilityOfElementLocated(driver, By.id("id_gender2"));
		return driver.findElement(By.id("id_gender2"));
	}
	public WebElement getFirstNameTextField() {
		return driver.findElement(By.id("customer_firstname"));
	}
	public WebElement getLastNameTextField() {
		return driver.findElement(By.id("customer_lastname"));
	}
	public WebElement getPasswordTextField() {
		return driver.findElement(By.id("passwd"));
	}
	public Select getDaysComboBox() {
		return new Select(this.driver.findElement(By.id("days")));
	}
	public Select getMonthComboBox() {
		return new Select(this.driver.findElement(By.id("months")));
	}
	public Select getYearComboBox() {
		return new Select(this.driver.findElement(By.id("years")));
	}		
	public WebElement getFirstNameAdressTextField() {
		return driver.findElement(By.name("firstname"));
	}
	public WebElement getLastNameAdressTextField() {
		return driver.findElement(By.name("lastname"));
	}
	public WebElement getAdress1TextField() {
		return driver.findElement(By.name("address1"));
	}
	public WebElement getAdress2TextField() {
		return driver.findElement(By.name("address2"));
	}
	public WebElement getCityTextField() {
		return driver.findElement(By.name("city"));
	}
	public Select getStateComboBox() {
		return new Select(this.driver.findElement(By.id("id_state")));
	}
	public WebElement getPostalCodeTextField() {
		return driver.findElement(By.name("postcode"));
	}
	public Select getCountryComboBox() {
		return new Select(this.driver.findElement(By.id("id_country")));
	}
	public WebElement getPhoneTextField() {
		return driver.findElement(By.name("phone_mobile"));
	}
	public WebElement getAliasTextField() {
		return driver.findElement(By.id("alias"));
	}	
	
	public WebElement getSubmitAccountButton() {
		return driver.findElement(By.name("submitAccount"));
	}
	
	public WebElement getInfoAdress() {
		WaitElementFw.visibilityOfElementLocated(driver, By.xpath("//ul[@id='address_delivery']/li[@class='address_address1 address_address2']"));
		return driver.findElement(By.xpath("//ul[@id='address_delivery']/li[@class='address_address1 address_address2']"));
	}
	public WebElement getInfoCityStatePostal() {
		return driver.findElement(By.xpath("//ul[@id='address_delivery']/li[@class='address_city address_state_name address_postcode']"));
	}
	public WebElement getInfoCountry() {
		return driver.findElement(By.xpath("//ul[@id='address_delivery']/li[@class='address_country_name']"));
	}
}
