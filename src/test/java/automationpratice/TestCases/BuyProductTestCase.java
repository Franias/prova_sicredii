package automationpratice.TestCases;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import automationpratice.Tasks.AddToCartTask;
import automationpratice.Tasks.CreateAccountTask;
import automationpratice.Tasks.ShoppingChartTask;
import frameworks.utils.BaseTestFw;

public class BuyProductTestCase extends BaseTestFw  {
	private WebDriver driver = getDriver();
	private AddToCartTask addToCartTask = new AddToCartTask(driver);
	private ShoppingChartTask shoppingChartTask = new ShoppingChartTask(driver);

	private CreateAccountTask createAccountTask = new CreateAccountTask(driver);
	@Before
	public void setUp() {
		driver.get("http://automationpractice.com/");
	}
	
	@Test
	public void buyProduct() {
		addToCartTask.searchProduct("blouse");
		addToCartTask.addToCart();
		addToCartTask.validateBuyInfos();
		shoppingChartTask.shoppingCartSummary("spjWfaoic@gmail.com");
		createAccountTask.signIn("password", "Francielli", "Dias","Rua Miranda","apto 10","32154", "Porto Alegre","55515155");
		createAccountTask.validateAdressInfo("Rua Miranda","apto 10","32154", "Porto Alegre");
		shoppingChartTask.proceedToCheckout();
	}

}
