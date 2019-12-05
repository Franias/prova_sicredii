package automationpratice.TestCases;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import automationpratice.Tasks.AddToCartTask;
import frameworks.utils.BaseTestFw;

public class BuyProductTestCase extends BaseTestFw  {
	private WebDriver driver = getDriver();
	private AddToCartTask addToCartTask = new AddToCartTask(driver);
	
	@Before
	public void setUp() {
		driver.get("http://automationpractice.com/");
	}
	
	@Test
	public void buyProduct() {
		addToCartTask.searchProduct("blouse");
	}

}
