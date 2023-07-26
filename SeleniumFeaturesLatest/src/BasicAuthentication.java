import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.chrome.ChromeDriver;
import java.net.URI;
import java.util.function.Predicate;


public class BasicAuthentication {

	public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "‪‪C:\\Users\\amarr\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
        
		// predicate, consumer
		Predicate<URI> uriPredicate = uri-> uri.getHost().contains("https://httbin.org");
		
		((HasAuthentication)driver).register(uriPredicate,UsernameAndPassword.of("foo", "bar"));
		driver.get("https://httbin.org/basic-auth/foo/bar");
		
		
	}

}
