package automationpratice.Tasks;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import automationpratice.AppObjects.AddToCartAppObject;
import frameworks.utils.ScreenshotFw;

public class AddToCartTask {
	private WebDriver driver;
	private AddToCartAppObject addToCartAppObject;
	private static final int QTT_PRODUCT = 2;
	private static final String SIZE_PRODUCT = "M";
	public String price;
	public String totalProducts;
	
	public AddToCartTask(WebDriver driver) {
		this.driver = driver;
		addToCartAppObject = new AddToCartAppObject(driver);
	}
	
	public void searchProduct(String search) {
		addToCartAppObject.searchTextField().sendKeys("blouse");
		addToCartAppObject.searchButton().click();
		String searchActual = addToCartAppObject.validarLable().getText();
		addToCartAppObject.viewProduct().click();
		ScreenshotFw.takeViewpointShot(driver, "searchProduct");
	}
	
	public void addToCart() {
		addToCartAppObject.getQuantityTextField().clear();
		addToCartAppObject.getQuantityTextField().sendKeys(Integer.toString(QTT_PRODUCT));
		addToCartAppObject.getSizeComboBox().selectByVisibleText(SIZE_PRODUCT);
		price = addToCartAppObject.getPriceLabel().getText().replace("$", "");	
		addToCartAppObject.getAddToCartButton().click();
		ScreenshotFw.takeViewpointShot(driver, "addToCart");
	}
	
	public void validateBuyInfos() {
		totalProducts = addToCartAppObject.getTotalProductsLabel().getText().replace("$", "");

		double priceNum = Double.parseDouble(price);
		double totalPrice = priceNum * QTT_PRODUCT;
		double totalProductsPiceNum = Double.parseDouble(totalProducts);
		
		if(totalProductsPiceNum == totalPrice) {
			System.out.println("Same price positive validation");
		} else {
			System.out.println("Negative validation/; it's not same price");
		}		
		String expected = "Product successfully added to your shopping cart";
		String actual = addToCartAppObject.getSuccessMessageLabel().getText();
		assertEquals(expected, actual);
		addToCartAppObject.proceedToCheckoutButton().click();
		
		ScreenshotFw.takeViewpointShot(driver, "validarInformativosCompra");
	}
}
