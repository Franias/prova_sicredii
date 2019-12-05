package frameworks.widget;

import org.openqa.selenium.WebDriver;

import frameworks.IButtonFw;

public class ButtonFw implements IButtonFw {
	
	private WebDriver driver;
	
	public ButtonFw(WebDriver driver) {
		this.driver = driver;
	}
	
	public IButtonFw click() {
		return null;
	}
}