package SecondPackage;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;


public class MiscelleaneousScreenshot {

	public static void main(String[] args) throws IOException {

		
		System.setProperty("WebDriver.chrome.driver","C:\\Users\\amarr\\Downloads\\chromedriver_win32.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().deleteCookieNamed("sessionKey");
		//click on any link
		//login page verify login url
		
		
		driver.get("https://google.com");
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(src,new File("C:\\Users\\amarr\\screenshot.png"));
	
	
	}

}
