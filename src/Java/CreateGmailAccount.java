package Java;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateGmailAccount {
	
    public static void main(String[] args) {
        // Set system property for chromedriver
        System.setProperty("WebDriver.chrome.driver","C:\\Users\\amarr\\Downloads\\chromedriver_win32.exe");

        // Create an instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the Gmail sign-up page
        driver.get("https://accounts.google.com/signup");

        // Fill in the form with desired information
        WebElement firstName = driver.findElement(By.name("firstName"));
        firstName.sendKeys("John");

        WebElement lastName = driver.findElement(By.name("lastName"));
        lastName.sendKeys("Doe");

        WebElement username = driver.findElement(By.name("Username"));
        username.sendKeys("johndoe123");

        WebElement password = driver.findElement(By.name("Passwd"));
        password.sendKeys("password123");

        WebElement confirmPassword = driver.findElement(By.name("ConfirmPasswd"));
        confirmPassword.sendKeys("password123");

        // Click the next button to proceed to the next form
        WebElement nextButton = driver.findElement(By.id("accountDetailsNext"));
        nextButton.click();

        // Fill in the rest of the form with desired information
        WebElement phoneNumber = driver.findElement(By.name("phoneNumberId"));
        phoneNumber.sendKeys("9606560568");

        WebElement recoveryEmail = driver.findElement(By.name("recoveryEmail"));
        recoveryEmail.sendKeys("johndoe@gmail.com");

        // Click the next button to proceed to the next form
        nextButton = driver.findElement(By.id("personalDetailsNext"));
        nextButton.click();

        // Accept terms of service
        WebElement agreeButton = driver.findElement(By.id("termsofserviceNext"));
        agreeButton.click();

        // Click the create button to create the account
        WebElement createButton = driver.findElement(By.id("submitbutton"));
        createButton.click();

        // Close the browser window
        driver.quit();
    }
}
