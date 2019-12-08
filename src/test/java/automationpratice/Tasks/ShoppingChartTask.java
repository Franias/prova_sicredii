package automationpratice.Tasks;

import org.openqa.selenium.WebDriver;

import automationpratice.AppObjects.CreateAccountAppObject;
import automationpratice.AppObjects.ShoppingChartAppObject;
import frameworks.utils.ScreenshotFw;

public class ShoppingChartTask {
	
	private WebDriver driver; 
	
	private ShoppingChartAppObject shoppingChartAppObject = new ShoppingChartAppObject(driver);	
	
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
		shoppingChartAppObject.getBankWireButton().click();
		shoppingChartAppObject.getConfirmOrderButton().click();			
	}
	
	

}
