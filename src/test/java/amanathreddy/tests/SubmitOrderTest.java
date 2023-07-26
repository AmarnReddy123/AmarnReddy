package amanathreddy.tests;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import amanathreddy.PageObjects.CartPage;
import amanathreddy.PageObjects.CheckoutPage;
import amanathreddy.PageObjects.ConfirmationPage;
import amanathreddy.PageObjects.LandingPage;
import amanathreddy.PageObjects.OrderPage;
import amanathreddy.PageObjects.ProductCatalogue;
import amarnathreddy.TestComponents.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SubmitOrderTest extends BaseTest{

      	String productName = "ZARA COAT 3";
	
	    @Test(dataProvider="getData",groups = {"Purchase"})
	    public void submitOrder(HashMap<String,String> input) throws IOException, InterruptedException
	    {

		
		ProductCatalogue productCatalogue = landingPage.loginApplication(input.get("email"), input.get("password"));
		
		List<WebElement> products = productCatalogue.getProductList();
		productCatalogue.addProductToCart(input.get("product"));
		
		CartPage cartPage = productCatalogue.goToCartPage();
		Boolean match = cartPage.VerifyProductDisplay(input.get("product"));
		Assert.assertTrue(match);
		CheckoutPage checkoutPage = cartPage.goToCheckout();
		checkoutPage.selectCountry("india");
		ConfirmationPage confirmationPage = checkoutPage.submitOrder();

		  		  
	    String confirmMessage = confirmationPage.getConfirmationMessage();
	    Assert.assertTrue(confirmMessage.equalsIgnoreCase("THANKYOU FOR THE ORDER."));
	   // orders	 
	}

	    @Test(dependsOnMethods= {"submitOrder"})
	    public void OrderHistoryTest()
	    {
	    	ProductCatalogue productCatalogue = landingPage.loginApplication("anshika@gmail.com", "Iamking@000");
	    	OrderPage ordersPage = productCatalogue.goToOrderPage();
	    	Assert.assertTrue(ordersPage.VerifyOrderDisplay(productName));
	    	
	    }
	    
	    
	    
	    @DataProvider
	    public Object[][] getData() throws IOException
	    {
			 
	    	List<HashMap<String, String>> data = getJsonDataToMap(System.getProperty("user.dir")+"\\src\\test\\java\\amarnathreddy\\data\\PurchaseOrder.json");
	    	return new Object[][] {{data.get(0)}, {data.get(1)} };
	    
	    }
	   
	    
	//    @dataProvider
	//    public Object[][] getData()
	//   {
	//    	return new Object[][] {{"anshika@gmail.com","Iamking@000","ZARA COAT 3"}, {"shetty@gmail.com","Iamking@000","ADIDAS ORIGINAL"}};
	//    }
	    
	    
//	    HashMap<String,String> map = new HashMap<String,String>();
//		  map.put("email","anshika@gmail.com");
//		  map.put("password", "Iamking@000"); 
//		  map.put("product","ZARA COAT 3");
//		  
//		  HashMap<String,String> map1 = new HashMap<String,String>();
//		  map1.put("email","shetty@gmail.com");
//		  map1.put("password", "Iamking@000");
//		  map1.put("product","ADIDAS ORIGINAL");
//		 
	    
	    
	    
	    
	    
	    
}
