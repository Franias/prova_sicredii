package bootstrap_theme.TestCases;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import bootstrap_theme.Tasks.SaveCostumerTask;
import frameworks.utils.BaseTestFw;

public class SaveCostumerTestCase extends BaseTestFw  {
	private WebDriver driver = getDriver();
	private SaveCostumerTask saveCostumerTask = new SaveCostumerTask(driver);
	
	@Before
	public void setUp() {
		driver.get("https://www.grocerycrud.com/demo/bootstrap_theme_v4");
	}
	
	@Test
	public void save() {
		saveCostumerTask.editAndConfirmCreditLimitTextField();
	}

}
