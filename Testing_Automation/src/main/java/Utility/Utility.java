package Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Page_Factory_Model.Prequote_Page_Elements;

public class Utility {
	public WebDriver driver=new ChromeDriver();
	@SuppressWarnings("deprecation")
	@BeforeMethod
	public void setup() {

		driver.get("https://investmentnewqa.policybazaar.com/");
		driver.manage().window().maximize();

		//Enter all details in the page
		Prequote_Page_Elements prequote_page = PageFactory.initElements(driver, Prequote_Page_Elements.class);
		custom_enterDataTextField(prequote_page.getName(),"Sonu Shaw","preQuote_Name");
		custom_enterDataTextField(prequote_page.getMobileNumber(),"9999999999","mobNo");
		custom_enterDataTextField(prequote_page.getEmailId(),"test@policybazaar.com","emailId");
		try 
		{
			//Click on View plans
			custom_clickOnButton(prequote_page.viewPlan(), "viewPlans");

			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			driver.findElement(By.id("btn_15742")).click();		    
			driver.findElement(By.xpath("//button[contains(text(),'Proceed')]")).click(); 		    		  
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}
	@AfterMethod
	public void TearDown() {	
		//driver.close();
	}

	//Enter data into Text field
	public void custom_enterDataTextField(WebElement webElement,String data, String FieldName) {
		try {
			webElement.sendKeys(data);
		}
		catch(Exception ex)
		{
			System.out.println(FieldName + " Fail " + ex.getMessage());
		}		
	}

	//Click on any Button
	public void custom_clickOnButton(WebElement webElement, String FieldName) {
		try {
			webElement.click();
		}
		catch(Exception ex)
		{
			System.out.println(FieldName + " Button not found.. " + ex.getMessage());
		}
	}

	//get Text
	public void custom_getText(WebElement webElement, String FieldName) {
		try {
			webElement.getText();
		}
		catch(Exception ex)
		{
			System.out.println(FieldName + " Button not found.. " + ex.getMessage());
		}
	}
}
