package frameworks.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitElementFw {
	
	private static final int TIMEOUT_SEC = 15;
	
	public static void visibilityOfElementLocated(WebDriver driver, By by) {
		WebDriverWait wait = new WebDriverWait(driver, TIMEOUT_SEC);
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}
	
	public static void visibilityOf(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, TIMEOUT_SEC);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public static void elementToBeClickable(WebDriver driver, By by) {
		WebDriverWait wait = new WebDriverWait(driver, TIMEOUT_SEC);
		wait.until(ExpectedConditions.elementToBeClickable(by));
	}
	
	public static void elementToBeClickable(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, TIMEOUT_SEC);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
}
