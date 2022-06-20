package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import POJO.Browser;

import POM.ZerodhaLoginPage;
import Utility.Pareametrizes;


@Listeners(TestListners.class)
public class ZerodhaLoginPageTest {
    WebDriver driver ;
     ExtentReports reports;
     ExtentTest test;
     
    @BeforeTest
    public void extentReports() {
    	reports = Report.createReports();
    }
    
    
    
    
    
    
   @BeforeMethod
 public void browser() {
	 driver = Browser.openBrowser();
}
	@Test
	public void loginWithValidCredentialsTest() throws EncryptedDocumentException, IOException{
		test = reports.createTest("loginWithValidCredentialsTest");
		ZerodhaLoginPage zerodhaloginPage = new ZerodhaLoginPage(driver);
		String userName= Pareametrizes.getData(0, 1);
		String password = Pareametrizes.getData(1, 1);
		zerodhaloginPage.enterUserId(userName);
		zerodhaloginPage.enterPassword(password);
		zerodhaloginPage.clickOnLogin();
		
	}
	@Test
	public void forgetPasswordLikedTest() {
		test = reports.createTest("forgetPasswordLikedTest");
		ZerodhaLoginPage zerodhaloginPage = new ZerodhaLoginPage(driver);
		zerodhaloginPage.clickOnforgot();
	}
	@Test
	public void signUpLinkTest() {
		test = reports.createTest("signUpLinkTest");
		ZerodhaLoginPage zerodhaloginPage = new ZerodhaLoginPage(driver);
		zerodhaloginPage.clickOnSignUp();
	}
	@Test
	public void ClickOnLoginWithoutTestData() throws EncryptedDocumentException, IOException {
		test = reports.createTest("ClickOnLoginWithoutTestData");

		ZerodhaLoginPage zerodhaloginPage = new ZerodhaLoginPage(driver);
		zerodhaloginPage.clickOnLogin();
		String text = zerodhaloginPage.getErrorText();
		String expectedText = "User ID should be minimum 6 characters.";
//		Assert.assertEquals(text, expectedText);//hard
//		zerodhaloginPage.enterPassword("velocity");
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(text, expectedText);
		
		String userName= Pareametrizes.getData(0, 1);
		String password = Pareametrizes.getData(1, 1);
		zerodhaloginPage.enterUserId(userName);
		zerodhaloginPage.enterPassword(password);
		zerodhaloginPage.clickOnLogin();
		softAssert.assertAll();	
	}
	@AfterMethod
	public void closeBrowser(ITestResult result) {
		if(result.getStatus()==ITestResult.FAILURE) {
			test.log(Status.FAIL,result.getName());
			}else if (result.getStatus()==ITestResult.SUCCESS) {
				test.log(Status.PASS, result.getName());
				}
			else {
				test.log(Status.SKIP, result.getName());	
			}
	}
	
	@AfterTest
	public void flushResult() {
		reports.flush();
	}
	
	
}
