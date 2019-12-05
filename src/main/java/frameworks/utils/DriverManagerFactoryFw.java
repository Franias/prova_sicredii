package frameworks.utils;

import frameworks.utils.DriverTypeFw;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManagerFactoryFw {
	private static WebDriver driver;
	
	public static WebDriver getManager(DriverTypeFw type) {
		switch (type) {
		case CHROME:
			WebDriverManager.chromedriver().setup();
			ChromeOptions option = new ChromeOptions();
			option.addArguments("start-maximized");
			driver = new ChromeDriver(option);
			break;
		case FIREFOX:
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
			
		case IE:
			WebDriverManager.iedriver().setup();
			MutableCapabilities caps = new MutableCapabilities();
			caps.setCapability(CapabilityType.BROWSER_NAME, BrowserType.IE);
			caps.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
			driver = new InternetExplorerDriver();		
			break;
			
		case CHROME_HEADLESS:
			WebDriverManager.chromedriver().setup();
			ChromeOptions options_headless = new ChromeOptions();
			options_headless.addArguments("--headless");
			options_headless.addArguments("--window-size(1024,768)");
			driver = new ChromeDriver(options_headless);
			break;
		
		default:
			break;		
		}
		return driver;
	}
	
	public static WebDriver setDriver(DriverTypeFw type){
		if(driver== null) {
			driver = getManager(type);
		}
		return driver;
	}
	
	public static void quitDriver(){
		if(driver!=null) {
			driver.quit();
			driver = null;
		}
		
	}
}
