package Test;

import org.testng.ISuiteResult;
import org.testng.ITestListener;
import org.testng.ITestResult;

import Utility.ScreenShots;

public class TestListners extends BestTest implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println(result.getName() + "Test has been Start");
	}
	public void onTestFailure(ITestResult result) {
		ScreenShots.teakeScreenShot(driver,result.getName());
		ScreenShots.
		
		//System.out.println(result.getName() + "Test failure report");
	}
	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName() + "Test Successfully started");
	}
	public void onTestSkipped(ITestResult result) {
		System.out.println(result.getName() + "Test skipped");
	}
	
	
}
