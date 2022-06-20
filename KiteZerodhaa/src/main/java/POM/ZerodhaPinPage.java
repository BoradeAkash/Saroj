package POM;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ZerodhaPinPage {

	
	@FindBy(xpath="//input[@type=\"password\"]") private WebElement Pin;
	@FindBy (xpath="//button[@type=\"submit\"]") private WebElement login;
	@FindBy (xpath="//a[text()='Forgot 2FA?']") private WebElement forgot;
	@FindBy (xpath="//a[text()=\"Don't have an account? Signup now!\"]")private WebElement signUp;
	
	public ZerodhaPinPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void enterPin(String PinNumber, WebDriver driver) {//in this mothod i have added the WebDriver driver in arg then I need to add in every method where iI am iterating it
	
		
		WebDriverWait Wait = new WebDriverWait(driver, Duration.ofMillis(5000));
		Wait.until(ExpectedConditions.visibilityOf(Pin));
		Pin.sendKeys(PinNumber);
	}
	public void clickOnlogin() {
		login.click();
	}
	public void clickOnforgot() {
		forgot.click();
	}
	public void clickOnSignUp() {
		signUp.click();
	}
	
}
