package SecondPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Myexper {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("WebDriver.edge.driver","‪C:\\Users\\amarr\\Downloads\\edgedriver_win64 (1)\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bing.com/search?q=hospitals+in+bangalore&cvid=06ceef09d9034c2094fe3d75f3ceb98b&aqs=edge.1.69i57j0l8.6458j0j1&pglt=2083&FORM=ANSPA1&PC=HCTS");
		Thread.sleep(3000);
		System.out.println(driver.findElements(By.tagName("a")).size());
	}

}
