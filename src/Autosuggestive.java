import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestive {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("WebDriver.chrome.driver","C:\\Users\\amarr\\Downloads\\chromedriver_win32.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("autosuggest")).sendKeys("ind");
        Thread.sleep(3000);
        List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
        
		for(WebElement option :options)
		{
			if(option.getText().equalsIgnoreCase("india"))
			{
				option.click();
				break;
			}
		}
		
	}

}
