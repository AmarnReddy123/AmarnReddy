import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo {
  public static void main(String[] args) {
	
	
	  System.setProperty("WebDriver.edge.driver", "‪C:\\Users\\amarr\\Downloads\\edgedriver_win64 (1)\\msedgedriver.exe");
		
	  WebDriver driver = new EdgeDriver();
		
	  driver.get("https://www.youtube.com/");
  }
}
