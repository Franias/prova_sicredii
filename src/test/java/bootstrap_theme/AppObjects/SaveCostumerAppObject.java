package bootstrap_theme.AppObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import frameworks.utils.WaitElementFw;

public class SaveCostumerAppObject{
	private static WebDriver driver;
	
	public SaveCostumerAppObject(WebDriver driver) {
		this.driver = driver;
	}
	
		
	public WebElement getSearchNameTextField() {
		return driver.findElement(By.xpath("//input[@name='customerName']"));
	}	
	public WebElement getEditButton() {
		return driver.findElement(By.xpath("//a[@href='/demo/bootstrap_theme_v4/edit/103']"));
	}	
	public WebElement getCostumerNameTextField() {
		return driver.findElement(By.id("field-customerName"));
	}	
	public WebElement getLastNameTextField() {
		return driver.findElement(By.id("contactLastName"));
	}
	public WebElement getPhoneTextField() {
		return driver.findElement(By.id("field-phone"));
	}
	public WebElement getAdress1TextField() {
		return driver.findElement(By.id("field-addressLine1"));
	}
	public WebElement getAdress2TextField() {
		return driver.findElement(By.id("id=\"field-addressLine2\""));
	}
	public WebElement getCityTextField() {
		return driver.findElement(By.id("field-city"));
	}
	public WebElement getStateTextField() {
		return driver.findElement(By.id("field-state"));
	}
	public WebElement getPostalTextField() {
		return driver.findElement(By.id("field-postalCode"));
	}	
	public WebElement getCountryTextField() {
		return driver.findElement(By.id("field-country"));
	}	
	public Select getEmployeerComboBox() {
		return new Select(this.driver.findElement(By.id("field-salesRepEmployeeNumber")));
	}
	public WebElement getCreditLimitTextField() {
		return driver.findElement(By.id("field-creditLimit"));
	}		
	public WebElement getSaveButton() {
		return driver.findElement(By.id("form-button-save"));
	}
	
	public WebElement getMoreButton() {
		WaitElementFw.elementToBeClickable(driver, By.xpath("//button[@class='btn btn-default btn-outline-dark gc-bootstrap-dropdown dropdown-toggle']"));
		return driver.findElement(By.xpath("//button[@class='btn btn-default btn-outline-dark gc-bootstrap-dropdown dropdown-toggle']"));
	}
	
	public WebElement getViewButton() {
		WaitElementFw.visibilityOfElementLocated(driver, By.xpath("//a[@href='/demo/bootstrap_theme_v4/read/103']"));
		return driver.findElement(By.xpath("//a[text()=' View                                        ']"));
	}	
	
	

}
