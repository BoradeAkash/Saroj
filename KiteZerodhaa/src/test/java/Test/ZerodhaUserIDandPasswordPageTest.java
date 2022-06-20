package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POJO.Browser;
import POM.ZerodhaLoginPage;
import POM.ZerodhaUserIDandPasswordPage;
import Utility.Pareametrizes;

public class ZerodhaUserIDandPasswordPageTest {
WebDriver driver;

	@BeforeMethod
	public void browser() {
		driver =Browser.openBrowser();
	}
	
	@Test
	public void userIDpasswordReset() throws EncryptedDocumentException, IOException, InterruptedException {
		ZerodhaLoginPage zerodhaloginPage = new ZerodhaLoginPage(driver);
		zerodhaloginPage.clickOnforgot();
		Thread.sleep(3000);
		
		ZerodhaUserIDandPasswordPage zerodhaUserIDandPasswordPage = new ZerodhaUserIDandPasswordPage(driver);
		zerodhaUserIDandPasswordPage.ClickOnForgotMyUserId();
		String panNum = Pareametrizes.getData(3, 1);
		zerodhaUserIDandPasswordPage.EnterPanNumber(panNum);
		zerodhaUserIDandPasswordPage.ClickOnSMS();
		String MobNumber =Pareametrizes.getData(4, 1);
		zerodhaUserIDandPasswordPage.EnterMobileNumber(MobNumber);
		String enterCaptchas = Pareametrizes.getData(5, 1);
		zerodhaUserIDandPasswordPage.EnterCaptcha(enterCaptchas);
		zerodhaUserIDandPasswordPage.ClickOnReset();	
	}
	@Test
	public void ClickOnBack() throws InterruptedException {
		ZerodhaLoginPage zerodhaloginPage = new ZerodhaLoginPage(driver);
		zerodhaloginPage.clickOnforgot();Thread.sleep(3000);
		ZerodhaUserIDandPasswordPage zerodhaUserIDandPasswordPage = new ZerodhaUserIDandPasswordPage(driver);
		zerodhaUserIDandPasswordPage.ClickOnBack();
	}
	@Test
	public void ClickOnDonthaveAcc() throws InterruptedException {
		ZerodhaLoginPage zerodhaloginPage = new ZerodhaLoginPage(driver);
		zerodhaloginPage.clickOnforgot();Thread.sleep(3000);
		ZerodhaUserIDandPasswordPage zerodhaUserIDandPasswordPage = new ZerodhaUserIDandPasswordPage(driver);
		zerodhaUserIDandPasswordPage.ClickOnDontHaveAccunt();
	}
	@Test
	public void CaptcaGet() throws InterruptedException {
		ZerodhaLoginPage zerodhaloginPage = new ZerodhaLoginPage(driver);
		zerodhaloginPage.clickOnforgot();Thread.sleep(3000);

	}
	
	
	
}
