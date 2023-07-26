import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;

public class setGeoLocation {

	public static void main(String[] args) {

		 System.setProperty("webdriver.chrome.driver", "‪‪C:\\Users\\amarr\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
			
			ChromeDriver driver = new ChromeDriver();
		
			DevTools devTolls=driver.getDevTools();
			
			Map<String,Object> coordinates = new HashMap<String,Object>();
			coordinates.put("latitude", 40);
			coordinates.put("longitude", 3);
			coordinates.put("accuracy", 1);
			
			
			driver.executeCdpCommand("Emulation.setGeolocationOverride", coordinates);
			driver.get("http://google.com");
			driver.findElement(By.name("q")).sendKeys("netflix",Keys.ENTER);
			driver.findElements(By.cssSelector(".LC20lb")).get(0).click();
			String title = driver.findElement(By.cssSelector(".default-ltr-cache-cvi30i e1yzhtxy7")).getText();
			System.out.println(title);
		
		
	}

}
