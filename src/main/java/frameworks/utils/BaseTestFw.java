package frameworks.utils;

import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import static frameworks.utils.DriverManagerFactoryFw.setDriver;
import static frameworks.utils.DriverManagerFactoryFw.quitDriver;

public class BaseTestFw {
	
private static WebDriver driver;
	
	public WebDriver getDriver() {
		this.driver = setDriver(DriverTypeFw.CHROME);
		return driver;
	}
	
	@AfterClass
	public static void tearDown() {
		quitDriver();
	}

}