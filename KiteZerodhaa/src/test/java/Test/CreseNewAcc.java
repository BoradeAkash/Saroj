package Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POJO.Browser;
import POM.CreateNewACCount;
import POM.ZerodhaPinPage;

public class CreseNewAcc {

	
	WebDriver driver;
	@BeforeMethod
	public void browser() {
		 driver = Browser.openBrowser();	
	}
	@Test
	public void l() throws InterruptedException {
		
		ZerodhaPinPage zerodhaPinpage = new ZerodhaPinPage(driver);
		zerodhaPinpage.clickOnSignUp();
		Thread.sleep(3000);
		CreateNewACCount QAZ = new CreateNewACCount(driver);
		QAZ.enterContactNo("9998887776");
		
	}

	
	
	
}
