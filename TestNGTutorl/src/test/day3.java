package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {

	@BeforeClass
	public void befoclass()
	{
		System.out.println("before executing any methods in the class");
	}
	@Parameters({"URL","APIKey/username"})
	@Test
	public void WebloginCarLoan(String urlname,String key)
	{
		//Selenium
		System.out.println("weblogincar");
		System.out.println(urlname);
		System.out.println(key);
	}
	@BeforeMethod
	public void beforeevery()
	{
		System.out.println("i will execute before every test method in day 3 class");
	}
	@AfterMethod
	public void afterevery()
	{
		System.out.println("i will execute after every test method in day 3 class");
	}
	@AfterClass
	public void afterclass()
	{
		System.out.println("after executing all methods in the class");
	}
	@Test(groups={"Smoke"})
	public void MobileLogincarLoan()
	{
		//Appium
		System.out.println("mobilelogincar");
	}
	@BeforeSuite
	public void bfsuite()
	{
		System.out.println("i am no 1");
	}
	@Test(enabled=false)
	public void MobileSignincarLoan()
	{
		//Appium
		System.out.println("mobile SIGNIN");
	}
	@Test(dataProvider="getData")
	public void MobileSignoutcarLoan(String username,String password)
	{
		//Appium
		System.out.println("mobile SIGNOUT");
		System.out.println(username);
		System.out.println(password);
	}
	@Test(dependsOnMethods= {"WebloginCarLoan","MobileSignoutcarLoan"})
	public void APICarLoan()
	{
		//Rest API automation
		System.out.println("APIlogincar");
	}
	@DataProvider
	public Object[][] getData()
	{
		// 1st combination username and password - good credit history = row
		// 2nd username password - no credit history
		// 3rd - fradulent credit history
		Object[][] data = new Object[3][2];
		// 1st set
		data[0][0] = "firstsetusername";
		data[0][1] = "firstpassword";
		//columns in the row are nothing but values for that particular combination(row)
		
		// 2nd set
		data[1][0] = "secondsetusername";
		data[1][1] = "secondpassword";
		
		//3rd set
		data[2][0] = "thirdsetusername";
		data[2][1] = "thirdpassword";
		return data;
	}

	
}
