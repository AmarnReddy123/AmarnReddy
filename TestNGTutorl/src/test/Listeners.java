package test;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.ITestContext;

//ITestListener which implements TestNG Listeners
public class Listeners implements ITestListener{

	
	@Override
	public void onTestStart(ITestResult result) {
		
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		//System.out.println("i successfully executed listeners pass code");
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		//screenshot 
		//response if API failed
		System.out.println("i failed executed listeners pass code" +result.getName());
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		
	}
	
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}
	
	@Override
	public void onStart(ITestContext context) {
		
	}
	
	
	@Override
	public void onFinish(ITestContext context) {
		
	}
	
	
	
	
	
}
