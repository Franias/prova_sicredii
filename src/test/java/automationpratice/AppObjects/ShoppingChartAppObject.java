package automationpratice.AppObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import frameworks.utils.WaitElementFw;

public class ShoppingChartAppObject {
	private static WebDriver driver;
	public ShoppingChartAppObject(WebDriver driver) {
		this.driver = driver;
	}	

	public WebElement plusQuantityButton() {
		return driver.findElement(By.className("cart_quantity_up"));
	}	
	
	public WebElement getSummaryProceedButton() {
		return driver.findElement(By.className("standard-checkout"));
	}	
	public WebElement getEmailTextField() {
		WaitElementFw.visibilityOfElementLocated(driver, By.id("email_create"));
		return driver.findElement(By.id("email_create"));
	}
	public WebElement getCreateButton() {
		WaitElementFw.visibilityOfElementLocated(driver, By.id("SubmitCreate"));
		return driver.findElement(By.id("SubmitCreate"));
	}		
	public WebElement getOrderMessageForm() {
		return driver.findElement(By.name("message"));
	}		
	public WebElement getAdressSubmitButton() {
		return driver.findElement(By.name("processAddress"));
	}
	public WebElement getConfirmTermsCheckBox() {
		return driver.findElement(By.xpath("//input[@id='cgv']"));
	}
	public WebElement getShippingProceedButton() {
		return driver.findElement(By.name("processCarrier"));
	}

	public WebElement getProductPrice() {
		return driver.findElement(By.xpath("//span[@id='product_price_2_8_247508']/span[@class='price']"));
	}
	public WebElement getTotalProductPrice() {
		return driver.findElement(By.id("total_product_price_2_8_247508"));
	}
	public WebElement getShippingPrice() {
		return driver.findElement(By.id("total_shipping"));
	}
	public WebElement getTotalPrice() {
		return driver.findElement(By.id("total_price"));
	}

	public WebElement getBankWireButton() {
		return driver.findElement(By.className("bankwire"));
	}		
	public WebElement getConfirmOrderButton() {
		return driver.findElement(By.xpath("//button[@type='submit'][@class='button btn btn-default button-medium']"));
	}
}
