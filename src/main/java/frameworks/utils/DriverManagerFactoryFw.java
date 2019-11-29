package frameworks.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManagerFactoryFw {
	private static WebDriver driver;
	
	public static WebDriver getManager(DriverTypeFw type) {
		switch(type) {
			case CHROME:	
				WebDriverManager.chromedriver().setup();
				ChromeOptions option = new ChromeOptions();
				option.addArguments("--start-maximized");
				DesiredCapabilities capabilities = DesiredCapabilities.chrome();
				capabilities.setCapability(ChromeOptions.CAPABILITY, option);				
				driver = new ChromeDriver(option);
				break;
			case FIREFOX:
				break;
			case CHROME_HEADLESS:
				WebDriverManager.chromedriver().setup();
				ChromeOptions option_headless = new ChromeOptions();
				option_headless.addArguments("--headless");
				option_headless.addArguments("--window-size(1280,800)");
				driver = new ChromeDriver(option_headless);
				break;
			default:
				break;		
		}
		
		return driver;
	}
	
	public static WebDriver setDriver(DriverTypeFw type) {
		if(driver==null) {
			driver = getManager(type);			
		}
		return driver;		
	}
	
	public static void quitDriver() {
		if(driver!=null) {
			driver.quit();
			driver = null;
		}
	}

}
