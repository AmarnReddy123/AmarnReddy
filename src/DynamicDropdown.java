import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("WebDriver.chrome.driver","C:\\Users\\amarr\\Downloads\\chromedriver_win32.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        //  //a[@value='MAA']  - xpath for chennai
        
        //  //a[@value='BLR']
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        driver.findElement(By.xpath("//a[@value='BLR']")).click();
        Thread.sleep(2000);
       
        //driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		driver.findElement(By.xpath("//div[@id='glsct100_mainContent_dd1_destinationStation1_CTNR'] //a[@value='MAA']")).click();
	
	    //driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
	
	
	}

}
