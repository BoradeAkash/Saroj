package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

import POJO.Browser;
import POM.ZerodhaLoginPage;
import POM.ZerodhaPinPage;
import Utility.Pareametrizes;

public class ZerdodhaPinPageWithTest {
WebDriver driver;
	@BeforeMethod
	public void browser() {
		driver = Browser.openBrowser();
	}
	@BeforeMethod
	public void zeroDhaMainPageCredential() throws EncryptedDocumentException, IOException, InterruptedException {
		ZerodhaLoginPage zerodhaloginPage = new ZerodhaLoginPage(driver);
		String userName= Pareametrizes.getData(0, 1);
		String password = Pareametrizes.getData(1, 1);
		zerodhaloginPage.enterUserId(userName);
		zerodhaloginPage.enterPassword(password);
		zerodhaloginPage.clickOnLogin();
	    Thread.sleep(2000);

	}
	@Test
	public void EnterPinTest() throws EncryptedDocumentException, IOException, InterruptedException {
//		ZerodhaLoginPage zerodhaloginPage = new ZerodhaLoginPage(driver);
//		String userName= Pareametrizes.getData(0, 1);
//		String password = Pareametrizes.getData(1, 1);
//		zerodhaloginPage.enterUserId(userName);
//		zerodhaloginPage.enterPassword(password);
//		zerodhaloginPage.clickOnLogin();
//	    Thread.sleep(2000);
		ZerodhaPinPage zerodhaPinpage = new ZerodhaPinPage(driver);
		String pinSubmit =	Pareametrizes.getData(2, 1);
	    zerodhaPinpage.enterPin(pinSubmit,driver);
		zerodhaPinpage.clickOnlogin();			
	}
	@Test
	public void clickOnLoginTest() throws EncryptedDocumentException, IOException, InterruptedException {
//		ZerodhaLoginPage zerodhaloginPage = new ZerodhaLoginPage(driver);
//		String userNamee = Pareametrizes.getData(0, 1);
//		String passwordd =Pareametrizes.getData(1, 1);
//		zerodhaloginPage.enterUserId(userNamee);
//		zerodhaloginPage.enterPassword(passwordd);

		Thread.sleep(3000);
		ZerodhaPinPage zerodhaPinpage = new ZerodhaPinPage(driver);
		String pinNum = Pareametrizes.getData(2, 1);
		zerodhaPinpage.enterPin(pinNum,driver);
		zerodhaPinpage.clickOnlogin();
	}
	@Test
	public void clickOnForgetTest() throws EncryptedDocumentException, IOException, InterruptedException {
//		ZerodhaLoginPage zerodhaloginPage = new ZerodhaLoginPage(driver);
//		String userName= Pareametrizes.getData(0, 1);
//		String password = Pareametrizes.getData(1, 1);
//		zerodhaloginPage.enterUserId(userName);
//		zerodhaloginPage.enterPassword(password);
//		zerodhaloginPage.clickOnLogin();
//	    Thread.sleep(2000);
		ZerodhaPinPage zerodhaPinpage = new ZerodhaPinPage(driver);
		zerodhaPinpage.clickOnforgot();
	}
	@Test
	public void clickOnSignUpTest() throws EncryptedDocumentException, IOException, InterruptedException {
//	ZerodhaLoginPage zerodhaloginPage = new ZerodhaLoginPage(driver);
//	String userName= Pareametrizes.getData(0, 1);
//	String password = Pareametrizes.getData(1, 1);
//	zerodhaloginPage.enterUserId(userName);
//	zerodhaloginPage.enterPassword(password);
//	zerodhaloginPage.clickOnLogin();
//    Thread.sleep(2000);
		ZerodhaPinPage zerodhaPinpage = new ZerodhaPinPage(driver);
		zerodhaPinpage.clickOnSignUp();
	}
	
	
}
