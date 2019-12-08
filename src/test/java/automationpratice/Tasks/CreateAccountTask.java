package automationpratice.Tasks;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import automationpratice.AppObjects.CreateAccountAppObject;
import frameworks.utils.ScreenshotFw;

public class CreateAccountTask {
	private WebDriver driver; 
	private CreateAccountAppObject createAccountAppObject = new CreateAccountAppObject(driver);
	public String cityStatePostal;
	public String state;
	public String country;
	public String adress;
	
	
	public CreateAccountTask(WebDriver driver) {
		this.driver = driver;
		createAccountAppObject = new CreateAccountAppObject(driver);
	}	
	public void signIn(String passwrd, String firstName, String lastName,String adress1, String adress2, String postalCode, String city, String phone) {

		createAccountAppObject.getGenderRadio().click();
		createAccountAppObject.getFirstNameTextField().clear();
		createAccountAppObject.getFirstNameTextField().sendKeys(firstName);
		createAccountAppObject.getLastNameTextField().clear();
		createAccountAppObject.getLastNameTextField().sendKeys(lastName);		
		createAccountAppObject.getPasswordTextField().sendKeys(passwrd);
		createAccountAppObject.getDaysComboBox().selectByValue("10");
		createAccountAppObject.getMonthComboBox().selectByValue("10");
		createAccountAppObject.getYearComboBox().selectByValue("2000");
		createAccountAppObject.getFirstNameAdressTextField().sendKeys(firstName);
		createAccountAppObject.getLastNameAdressTextField().sendKeys(lastName);
		createAccountAppObject.getAdress1TextField().sendKeys(adress1);
		createAccountAppObject.getAdress2TextField().sendKeys(adress2);
		createAccountAppObject.getCityTextField().sendKeys(city);
		createAccountAppObject.getStateComboBox().selectByValue("11");
		state = createAccountAppObject.getStateComboBox().getFirstSelectedOption().getText();		
		createAccountAppObject.getPostalCodeTextField().sendKeys(postalCode);
		createAccountAppObject.getCountryComboBox().selectByValue("21");
		country = createAccountAppObject.getCountryComboBox().getFirstSelectedOption().getText();
		createAccountAppObject.getPhoneTextField().sendKeys(phone);
		createAccountAppObject.getAliasTextField().clear();
		createAccountAppObject.getAliasTextField().sendKeys("home");
		createAccountAppObject.getSubmitAccountButton().click();
		
		ScreenshotFw.takeViewpointShot(driver, "signIn");		
	}
	public void validateAdressInfo( String adress1, String adress2, String postalCode, String city) {
		adress = adress1+" "+adress2;
		String adressActual = createAccountAppObject.getInfoAdress().getText();
		assertEquals(adress, adressActual);
		cityStatePostal = city+", "+state +" "+postalCode;		
		String cityStatePostalActual = createAccountAppObject.getInfoCityStatePostal().getText();
		assertEquals(cityStatePostal, cityStatePostalActual);		
		String countryActual = createAccountAppObject.getInfoCountry().getText();
		assertEquals(country, countryActual);
		
		ScreenshotFw.takeViewpointShot(driver, "validateAdressInfo");
	}	
}
