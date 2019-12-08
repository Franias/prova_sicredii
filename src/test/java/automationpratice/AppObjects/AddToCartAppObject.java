package automationpratice.AppObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import frameworks.utils.WaitElementFw;

public class AddToCartAppObject{
	private static WebDriver driver;
	
	public AddToCartAppObject(WebDriver driver) {
		this.driver = driver;
	}
	
	//search product	
	public WebElement searchTextField() {
		return driver.findElement(By.id("search_query_top"));
	}
	
	public WebElement searchButton() {
		return driver.findElement(By.name("submit_search"));
		
	}	
	public WebElement validarLable() {
		WaitElementFw.visibilityOfElementLocated(driver, By.className("lighter"));
		return driver.findElement(By.className("lighter"));//blouse
	}
	//addToCart
	public WebElement viewProduct() {
		if (driver.findElement(By.className("quick-view-mobile")).isDisplayed()) {
			return driver.findElement(By.className("quick-view-mobile"));
		}
		return driver.findElement(By.className("product_img_link"));
	}
	public WebElement priceProduct() {
		
		return driver.findElement(By.id("our_price_display"));				
	}	
	
	public WebElement getQuantityTextField() {
		driver.switchTo().defaultContent();		
		return driver.findElement(By.name("qty"));
	}	
	
	public WebElement getPriceLabel() {
		return driver.findElement(By.id("our_price_display")); 
	}
	public Select getSizeComboBox() {
		return new Select(this.driver.findElement(By.id("group_1")));
	}
	
	public WebElement chooseWhiteColor() {
		return driver.findElement(By.id("color_8"));
	}
	public WebElement getAddToCartButton() {
		return driver.findElement(By.name("Submit"));
	}
	
	public WebElement getTotalProductsLabel() {
		WaitElementFw.visibilityOfElementLocated(driver, By.id("layer_cart_product_price"));
		return driver.findElement(By.id("layer_cart_product_price"));
	}
	public WebElement getSuccessMessageLabel() {
		return driver.findElement(By.cssSelector("div[class= 'layer_cart_product col-xs-12 col-md-6'] > h2"));
	}
	
	public WebElement proceedToCheckoutButton() {
		return driver.findElement(By.xpath("//a[@class='btn btn-default button button-medium']"));
	}

	
	

}
