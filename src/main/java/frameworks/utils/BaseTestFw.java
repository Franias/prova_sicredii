package frameworks.utils;
import static frameworks.utils.DriverManagerFactoryFw.setDriver;
import static frameworks.utils.DriverManagerFactoryFw.quitDriver;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

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
