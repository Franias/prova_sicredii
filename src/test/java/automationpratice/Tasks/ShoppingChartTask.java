package automationpratice.Tasks;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import automationpratice.AppObjects.CreateAccountAppObject;
import automationpratice.AppObjects.ShoppingChartAppObject;
import frameworks.utils.ScreenshotFw;

public class ShoppingChartTask {
	
	private WebDriver driver; 
	
	private ShoppingChartAppObject shoppingChartAppObject = new ShoppingChartAppObject(driver);	
	public String price;
	public String totalPriceActual;
	public String shipping;
	public ShoppingChartTask(WebDriver driver) {
		this.driver = driver;
		shoppingChartAppObject = new ShoppingChartAppObject(driver);
	}
	public void shoppingCartSummary(String email) {		
		shoppingChartAppObject.plusQuantityButton().click();		
		shoppingChartAppObject.getSummaryProceedButton().click();	
		shoppingChartAppObject.getEmailTextField().clear();
		shoppingChartAppObject.getEmailTextField().sendKeys(email);
		shoppingChartAppObject.getCreateButton().click();	
		ScreenshotFw.takeViewpointShot(driver, "shoppingCartSummary");

	}
	public void proceedToCheckout() {
		shoppingChartAppObject.getOrderMessageForm().sendKeys("I’d like to request that my packaged as minimally as possible. This means opting out of bubble wrap, plastic pillows. or any other additional plastic packaging that can be avoided.");
		shoppingChartAppObject.getAdressSubmitButton().click();
		shoppingChartAppObject.getConfirmTermsCheckBox().click();		
		shoppingChartAppObject.getShippingProceedButton().click();
		totalPriceActual = shoppingChartAppObject.getTotalPrice().getText().replace("$", "");
		price = shoppingChartAppObject.getProductPrice().getText().replace("$", "");
		shipping = shoppingChartAppObject.getShippingPrice().getText().replace("$", "");		
		shoppingChartAppObject.getBankWireButton().click();
		shoppingChartAppObject.getConfirmOrderButton().click();		
		shoppingChartAppObject.getConfirmMessage();
		String actual = shoppingChartAppObject.getConfirmMessage().getText();
		assertEquals("Your order on My Store is complete.", actual);
	}
	public void validateTotalPrice() {
		double priceNum = Double.parseDouble(price);
		double totalExpected = 3*priceNum + Double.parseDouble(shipping);
		if(totalExpected == Double.parseDouble(totalPriceActual)) {
			System.out.println("Same price positive validation");
		} else {
			System.out.println("Negative validation/; it's not same price");
		}		
	}
}
