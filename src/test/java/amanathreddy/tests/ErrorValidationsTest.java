package amanathreddy.tests;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import amanathreddy.PageObjects.CartPage;
import amanathreddy.PageObjects.CheckoutPage;
import amanathreddy.PageObjects.ConfirmationPage;
import amanathreddy.PageObjects.LandingPage;
import amanathreddy.PageObjects.ProductCatalogue;
import amarnathreddy.TestComponents.BaseTest;
import amarnathreddy.TestComponents.Retry;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ErrorValidationsTest extends BaseTest{

	    @Test(groups= {"ErrorHandling"},retryAnalyzer=Retry.class)
	   public void LoginErrorValidation() throws IOException, InterruptedException
	    {

		String productName = "ZARA COAT 3";
		landingPage.loginApplication("anshika@gmail.com", "Iamki000");
		Assert.assertEquals("Incorrect email password.", landingPage.getErrormessage());
		
		
	    }

	    @Test
	    public void ProductErrorValidation() throws IOException, InterruptedException
	    {

		String productName = "ZARA COAT 3";
		ProductCatalogue productCatalogue = landingPage.loginApplication("rahulshetty@gmail.com", "Iamking@000");
		
		List<WebElement> products = productCatalogue.getProductList();
		productCatalogue.addProductToCart(productName);
		CartPage cartPage = productCatalogue.goToCartPage();
	
		Boolean match = cartPage.VerifyProductDisplay("ZARA COAT 3");
		Assert.assertFalse(match);
				 
	}

	    
	    
}
