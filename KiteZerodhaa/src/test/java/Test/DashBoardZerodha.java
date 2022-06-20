package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POJO.Browser;
import POM.ZerodhaLoginPage;
import POM.ZerodhaPinPage;
import POM.dashBoardZerodha;
import Utility.Pareametrizes;

public class DashBoardZerodha {
WebDriver driver;
	@BeforeMethod
	public void browser() {
		 driver = Browser.openBrowser();	
	}
	@Test
	public void purchaseShareACC() throws EncryptedDocumentException, IOException, InterruptedException {
		ZerodhaLoginPage zerodhaloginPage = new ZerodhaLoginPage(driver);
		String userName= Pareametrizes.getData(0, 1);
		String password = Pareametrizes.getData(1, 1);
		zerodhaloginPage.enterUserId(userName);
		zerodhaloginPage.enterPassword(password);
		zerodhaloginPage.clickOnLogin();
		Thread.sleep(2000);
		ZerodhaPinPage zerodhaPinpage = new ZerodhaPinPage(driver);
		String pinSubmit =	Pareametrizes.getData(2, 1);
	    zerodhaPinpage.enterPin(pinSubmit,driver);
		zerodhaPinpage.clickOnlogin();
		Thread.sleep(2000);//upto this Account is open
		dashBoardZerodha dashboardZerodha = new dashBoardZerodha(driver);
		String share = Pareametrizes.getData(8, 1);
		dashboardZerodha.EnterShareName(share);
		Thread.sleep(2000);
		dashboardZerodha.SelectShare(driver);//tab open 
		Thread.sleep(2000);
//		dashboardZerodha.SelectRegularShare();
//		
//		String QTY = Pareametrizes.getData(9, 1);
//		dashboardZerodha.ShareQuantity(QTY);
//		
//		String pricee = Pareametrizes.getData(10, 1);
//		dashboardZerodha.enterPrice(pricee);
//		dashboardZerodha.BUYshare();
		

	}
	
}
