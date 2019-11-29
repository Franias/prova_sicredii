package bootstrap_theme.Tasks;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import bootstrap_theme.AppObjects.SaveCostumerAppObject;
import frameworks.utils.ScreenshotFw;

public class SaveCostumerTask {
	private static WebDriver driver;
	
	private SaveCostumerAppObject saveCostumerAppObject;
	
	public SaveCostumerTask(WebDriver driver) {
		this.driver = driver;
		saveCostumerAppObject = new SaveCostumerAppObject(driver);
	}
	
	public void editAndConfirmCreditLimitTextField() {
		ScreenshotFw.takeViewpointShot(driver, "editAndConfirmCreditLimitTextField");
		saveCostumerAppObject.getEditButton().click();
		saveCostumerAppObject.getCostumerNameTextField().clear();
		saveCostumerAppObject.getCostumerNameTextField().sendKeys("FRANCIELLI");
		String nameExpected = saveCostumerAppObject.getCostumerNameTextField().getAttribute("value");
		saveCostumerAppObject.getCreditLimitTextField().clear();
		saveCostumerAppObject.getCreditLimitTextField().sendKeys("123");
		saveCostumerAppObject.getSaveButton().click();
		driver.navigate().back();
//		saveCostumerAppObject.getSearchNameTextField().clear();
//		saveCostumerAppObject.getSearchNameTextField().sendKeys(name);
		saveCostumerAppObject.getMoreButton().click();
		saveCostumerAppObject.getViewButton().click();
		String nameActual = saveCostumerAppObject.getCostumerNameTextField().getText();
		assertEquals(nameExpected, nameActual);
		String actual = saveCostumerAppObject.getCreditLimitTextField().getText();
		String expected = "123";
		assertEquals(expected, actual);
		
		ScreenshotFw.takeViewpointShot(driver, "editAndConfirmCreditLimitTextField");
	}


}
