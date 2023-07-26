package test;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class day1 {
	
    @AfterTest
    public void lastexecution()
    {
    	System.out.println("i will execute last");
    }
	@Test
	public void Demo()
	{
		System.out.println("Hello");
	    Assert.assertTrue(false);
	}
	@AfterSuite
	public void afSuite()
	{
		System.out.println("i am the no 1 from last");
	}

	@Test
	public void SecondTest()
	{
		System.out.println("bye");
	}
}
