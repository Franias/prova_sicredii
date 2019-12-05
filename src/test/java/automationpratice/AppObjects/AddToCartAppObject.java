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
	
	public WebElement addQuantity() {
		driver.switchTo().defaultContent();		
		return driver.findElement(By.id("quantity_wanted"));
	}	
	
	public WebElement getPrice() {
		return driver.findElement(By.id("our_price_display")); 
	}
	public Select addSizeComboBox() {
		return new Select(this.driver.findElement(By.id("group_1")));
	}
	
	public WebElement chooseOrange() {
		return driver.findElement(By.name("Orange"));
	}
	public WebElement addToCart() {
		return driver.findElement(By.name("Submit"));
	}
	
	public WebElement getTotalProductsLabel() {
		return driver.findElement(By.cssSelector(".ajax_block_products_total"));
	}
	public WebElement getSuccessMessageLabel() {
		return driver.findElement(By.cssSelector("div[class= 'layer_cart_product col-xs-12 col-md-6'] > h2"));
	}
	
	public WebElement proceedToCheckoutButton() {
		return driver.findElement(By.xpath("//a[@class='btn btn-default button button-medium']"));
	}

	
	

}
