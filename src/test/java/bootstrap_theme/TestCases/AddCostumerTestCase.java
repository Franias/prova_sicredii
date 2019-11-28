package bootstrap_theme.TestCases;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import bootstrap_theme.Tasks.AddCostumerTask;
import frameworks.utils.BaseTestFw;

public class AddCostumerTestCase extends BaseTestFw {
	private WebDriver driver = getDriver();
	
	private AddCostumerTask addCostumerTask = new AddCostumerTask(driver);

	@Before
	public void setUp() {
		driver.get("https://www.grocerycrud.com/demo/bootstrap_theme_v4");
	}
	
	@Test
	public void addNewCostumer() {		
		addCostumerTask.addNewCostumer("Teste Sicredi","Teste","Francielli","51 9999-9999",
				"Av Assis Brasil, 3970","Torre D", "Porto Alegre","RS","91000-000","Brasil", "Fixter", "200");
		addCostumerTask.confirmData("Teste Sicredi","Teste","Francielli","51 9999-9999",
				"Av Assis Brasil, 3970","Torre D", "Porto Alegre","RS","91000-000","Brasil","200");
	}
}
