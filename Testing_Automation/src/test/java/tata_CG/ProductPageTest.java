package tata_CG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Page_Factory_Model.Product_Page_Elements;
import Utility.Utility;

public class ProductPageTest extends Utility {

	Product_Page_Elements product_page = PageFactory.initElements(driver, Product_Page_Elements.class);
	boolean testResult = false;
	
	
	@Test
	public void VerifyAllControlls()
	{
		
	}
	
	@Test
	public void VerifyGenderErrorMsg() throws Exception
	{
		//Click On proceed button
		Thread.sleep(3000);
		custom_clickOnButton(product_page.getProceedButton(),"Proceed");
		String errormsg = driver.findElement(By.xpath("//span[@id='undefined-error']")).getText();
		Assert.assertEquals(errormsg,"Please confirm your gender.");
	}
	@Test
	public void VerifyInavlidName() 
	{
		
	}
}
