package frameworks.utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JsExecutorFw {
	
	public void highlight(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver ;
		js.executeScript("arguments[0].setAttribute('style', 'background: white; border: 2px solid red;');", element);
	}
	
	public static void zoomStyle(WebDriver driver) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("document.body.style.zoom='100%'");
	}
}