import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntroduction {

	public static void main(String[] args) {

		//Invoking browser
		//Chrome - ChromeDriver exten-->Methods close get
		//Firefox - FirefoxDriver -->Methods close get
		//Safari SafariDriver -->methods close get
		//WebDriver close get
		//webDriver methods + class methods
		
		//chromedriver.exe-->Chrome browser
		System.setProperty("WebDriver.chrome.driver","C:\\Users\\amarr\\Downloads\\chromedriver_win32.exe");
		
		//webdriver.chrome.driver-->value of path
		WebDriver driver = new ChromeDriver();
		
		//Firefox Launch
		//geckodriver
		//webDriver.gecko.driver
		//System.setProperty("WebDriver.gecko.driver","C:\\Users\\amarr\\Downloads\\geckodriver-v0.32.0-win-aarch64.exe");
		//WebDriver driver1 = new FirefoxDriver();
		
		//Edge driver
		//System.setProperty("WebDriver.edge.driver","C:\\Users\\amarr\\Downloads\\edgedriver_win64");
		//WebDriver driver2 = new EdgeDriver();
		
		driver.get("https://www.google.co.in/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
		
		
		
	}

}
