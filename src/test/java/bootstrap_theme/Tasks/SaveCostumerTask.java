package bootstrap_theme.Tasks;

import static org.junit.Assert.assertEquals;

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
		saveCostumerAppObject.getEditButton().click();
		saveCostumerAppObject.getCostumerNameTextField().clear();
		saveCostumerAppObject.getCostumerNameTextField().sendKeys("FRANCIELLI");
		String name = saveCostumerAppObject.getCostumerNameTextField().getAttribute("value");
		saveCostumerAppObject.getCreditLimitTextField().clear();
		saveCostumerAppObject.getCreditLimitTextField().sendKeys("123");
		saveCostumerAppObject.getSaveButton().click();
		driver.navigate().back();
		saveCostumerAppObject.getSearchNameTextField().sendKeys(name);
		saveCostumerAppObject.getEditButton().click();
		String actual = saveCostumerAppObject.getCreditLimitTextField().getAttribute("value");
		String expected = "123";
		assertEquals(expected, actual);
		
		ScreenshotFw.takeViewpointShot(driver, "editAndConfirmCreditLimitTextField");
	}


}
