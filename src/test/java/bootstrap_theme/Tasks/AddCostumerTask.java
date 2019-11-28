package bootstrap_theme.Tasks;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import bootstrap_theme.AppObjects.AddCostumerAppObject;
import frameworks.utils.ScreenshotFw;

public class AddCostumerTask {
	private WebDriver driver;
	private AddCostumerAppObject addCostumerAppObject;
	
	public AddCostumerTask(WebDriver driver){
		this.driver = driver;
		addCostumerAppObject = new AddCostumerAppObject(driver);
	}
	
	public void addNewCostumer(String CostumerName, String LastName, String FirstName,
			String Phone, String Adress1, String Adress2, String City, String State,
			String PostalCode, String Country, String Employeer, String CreditLimit){		
		addCostumerAppObject.getAddCostumerButton().click();
		addCostumerAppObject.getCostumerNameTextField().sendKeys(CostumerName);
		addCostumerAppObject.getLastNameTextField().sendKeys(LastName);
		addCostumerAppObject.getContactNameTextField().sendKeys(FirstName);
		addCostumerAppObject.getPhoneTextField().sendKeys(Phone);
		addCostumerAppObject.getAdress1TextField().sendKeys(Adress1);
		addCostumerAppObject.getAdress2TextField().sendKeys(Adress2);
		addCostumerAppObject.getCityTextField().sendKeys(City);
		addCostumerAppObject.getStateTextField().sendKeys(State);
		addCostumerAppObject.getPostalCodeTextField().sendKeys(PostalCode);
		addCostumerAppObject.getCountryTextField().sendKeys(Country);
		addCostumerAppObject.getCountryTextField().sendKeys(Keys.TAB);
		
		addCostumerAppObject.getEmployeerButton().click();
		addCostumerAppObject.getEmployeerTextField().click();
		addCostumerAppObject.getEmployeerTextField().sendKeys(Employeer);
		addCostumerAppObject.getEmployeerTextField().sendKeys(Keys.ENTER);		
		addCostumerAppObject.getCreditLimitTextField().sendKeys(CreditLimit);		
		addCostumerAppObject.getSaveButton().click();				
	}	
}
