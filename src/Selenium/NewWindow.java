package Selenium;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindow {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\amarr\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		//switching window
		driver.switchTo().newWindow(WindowType.TAB);
		
		//driver.switchTo().newWindow(WindowType.WINDOW);  //we can open new window also
		
		Set<String> handles = driver.getWindowHandles();
		Iterator<String>it = handles.iterator();
		String parentWindowId = it.next();
		String childWindowId = it.next();
		
		driver.switchTo().window(childWindowId);
		
		
		driver.get("https://rahulshettyacademy.com/");
	
		String courseName = driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']"))
		.get(1).getText();
        driver.switchTo().window(parentWindowId);
        WebElement name = driver.findElement(By.cssSelector("[name='name']"));
        name.sendKeys(courseName);
        //screenshot
        File file = name.getScreenshotAs(OutputType.FILE);
     
        FileUtils.copyFile(file, new File("logo.png"));
        
        // to see the file refresh the project and you can see in the project local system 
        
        //driver.quit();
        
        // get Height and Width
        
        System.out.println(name.getRect().getDimension().getHeight());
	    System.out.println(name.getRect().getDimension().getWidth());
	
	}

}
