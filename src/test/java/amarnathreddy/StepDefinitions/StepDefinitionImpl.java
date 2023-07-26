package amarnathreddy.StepDefinitions;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import amanathreddy.PageObjects.CartPage;
import amanathreddy.PageObjects.CheckoutPage;
import amanathreddy.PageObjects.ConfirmationPage;
import amanathreddy.PageObjects.LandingPage;
import amanathreddy.PageObjects.ProductCatalogue;
import amarnathreddy.TestComponents.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionImpl extends BaseTest{
	
	public LandingPage landingpage;
	public ProductCatalogue productCatalogue ;
	public ConfirmationPage confirmationPage;
	
	@Given("I landed on Ecommerce Page")
	public void I_landed_on_Ecommerce_Page() throws IOException
	{
		landingpage = launchApplication();
		//code
		
	}
	
    @Given ("^Logged in with username (.+) and password (.+)$")
    public void logged_in_username_and_password(String username, String password)
    {
    	productCatalogue = landingPage.loginApplication(username,password);
    }
	
	@When ("^I add the product (.+) from Cart$")
	public void I_add_product_to_cart(String productName) throws InterruptedException
	{
		List<WebElement> products = productCatalogue.getProductList();
		productCatalogue.addProductToCart(productName);
		
	}
	
	@When("^Checkout (.+) and submit the order$")
	public void checkout_submit_the_order(String productName)
	{
		CartPage cartPage = productCatalogue.goToCartPage();
		Boolean match = cartPage.VerifyProductDisplay(productName);
		Assert.assertTrue(match);
		CheckoutPage checkoutPage = cartPage.goToCheckout();
		checkoutPage.selectCountry("india");
        confirmationPage = checkoutPage.submitOrder();

	}
	
	@Then("{string} message is displayed on ConfirmationPage")
	public void message_displayed_confirmationPage(String string)
	{
		 String confirmMessage = confirmationPage.getConfirmationMessage();
		 Assert.assertTrue(confirmMessage.equalsIgnoreCase(string));
		 driver.close();  	
	}
	
	  @Then("^\"([^\"]*)\" message id is displayed$")
	    public void something_message_id_is_displayed(String strArg1) throws Throwable {
	       
		  Assert.assertEquals(strArg1, landingPage.getErrormessage());
		  driver.close();
		  
	    }

	

}
