package Page_Factory_Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Prequote_Page_Elements {

	WebDriver driver;
		
	
	@FindBy(how=How.XPATH,using="//input[@id='txtCustomerName']")
	private WebElement preQuote_Name;
	
	public WebElement getName() {
		return preQuote_Name;
	}
	
	@FindBy(how=How.XPATH,using="//input[@id='txtMobileNo']") 
	private WebElement mobNo;
	
	public WebElement getMobileNumber() {
		return mobNo;
	}
	  	  
	@FindBy(how=How.XPATH,using="//input[@id='txtEmail']") 
	private WebElement emailId;
	
	public WebElement getEmailId() {
		return emailId;
	}
	  
	@FindBy(how=How.XPATH,using="//button[text()='View Plans']") 
	private WebElement viewPlans;
	
	public WebElement viewPlan() {
		return viewPlans;
	}
}
