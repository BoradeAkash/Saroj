package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaUserIDandPasswordPage {
	//label[@for='radio-31']
	@FindBy(xpath = "(//label[@class='su-radio-label'])[2]") private WebElement ForgotMyUserId;
	@FindBy(xpath="(//input[@type='text'])[1]")private WebElement PANnumber;
	@FindBy(xpath = "//label[@for='radio-36']")private WebElement SMS;
	@FindBy(xpath="(//input[@type='text'])[2]")private WebElement MobileNumber;
	@FindBy(xpath="(//input[@type='text'])[3]")private WebElement Captcha;
	@FindBy(xpath= "//button[@type='submit']")private WebElement Reset;
	@FindBy(xpath="(//a[@href='/'])[2]")private WebElement Back;
	@FindBy(xpath="(//a[@target='_blank'])[3]")private WebElement DontHaveAcc;
	
	public ZerodhaUserIDandPasswordPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void ClickOnForgotMyUserId() {
		ForgotMyUserId.click();
	}
	public void EnterPanNumber(String panNumber) {
		PANnumber.sendKeys(panNumber);
	}
	public void ClickOnSMS() {
		SMS.click();
	}
	public void EnterMobileNumber(String enterMobNum) {
		MobileNumber.sendKeys(enterMobNum);
	}
	public void EnterCaptcha(String captcha) {
		Captcha.sendKeys(captcha);
	}
	public void ClickOnReset() {
		Reset.click();
	}
	public void ClickOnBack() {
		Back.click();
	}
	public void ClickOnDontHaveAccunt() {
		DontHaveAcc.click();
	}
}
