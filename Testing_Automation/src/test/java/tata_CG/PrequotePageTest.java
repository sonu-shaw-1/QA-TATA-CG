package tata_CG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

import Page_Factory_Model.Prequote_Page_Elements;
import Utility.Utility;

public class PrequotePageTest extends Utility {
	
	Prequote_Page_Elements prequote_page = PageFactory.initElements(driver, Prequote_Page_Elements.class);
	@SuppressWarnings("deprecation")
	@Test
	public void Prequote() {
		//Enter all details in the page
//		custom_enterDataTextField(prequote_page.getName(),"Sonu Shaw","preQuote_Name");
//		custom_enterDataTextField(prequote_page.getMobileNumber(),"9999999999","mobNo");
//		custom_enterDataTextField(prequote_page.getEmailId(),"test@policybazaar.com","emailId");
//		try 
//		{
//			//Click on View plans
//			custom_clickOnButton(prequote_page.viewPlan(), "viewPlans");
//			
//			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//			
//		    driver.findElement(By.id("btn_15742")).click();		    
//		    driver.findElement(By.xpath("//button[contains(text(),'Proceed')]")).click(); 		    		  
//		}
//		catch(Exception e)
//		{
//			System.out.println(e);
//		}
			
	}
}
