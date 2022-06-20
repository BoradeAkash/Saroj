package POM;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.Pareametrizes;

public class dashBoardZerodha {

	@FindBy(xpath="//input[@type=\"text\"]") private WebElement searchShare;//Search
	@FindBy(xpath ="(//span[text()='TATAMOTORS'])[1]")private WebElement TATA;
	@FindBy(xpath="(//button[@type=\"button\"])[1]")private WebElement Buy;//(//button[@type='button'])[1]  //button[@class='button-blue buy']
	@FindBy(xpath="//label[text()='Regular']")private WebElement Regular;
	@FindBy(xpath="//label[text()='AMO']")private WebElement AMO;
	@FindBy(xpath="(//input[@type='number'])[1]")private WebElement enterShareQuantity;
	@FindBy(xpath="(//input[@type='number'])[2]")private WebElement enterSharePrice;
	@FindBy(xpath="//button[@type='submit']")private WebElement BuyShare;
	@FindBy(xpath="//a[@class='router-link-active']")private WebElement ClickOnDashboad;
	@FindBy(xpath="//a[@class='orders-nav-item']")private WebElement ClickOnOrder;
	@FindBy(xpath="//a[@href='/holdings']")private WebElement ClickOnHolding;
	@FindBy(xpath="//a[@href='/positions']")private WebElement ClickOnPosition;
	@FindBy(xpath="//a[@href='/funds']")private WebElement ClickOnFund;
	@FindBy(xpath="//a[@href='/apps']")private WebElement ClickOnApps;
	@FindBy(xpath="//span[@class='user-id']")private WebElement ClickInMyAccount;
	@FindBy(xpath="(//span[@class='icon icon-trending-up'])[1]")private WebElement Chart;
	

	public dashBoardZerodha(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void EnterShareName(String ShareName) {
		searchShare.sendKeys(ShareName);
	}
	
	public void SelectShare(WebDriver driver) throws InterruptedException {
	Actions action = new Actions(driver);
	Thread.sleep(3000);
	action.moveToElement(TATA).perform();
	Thread.sleep(3000);
	//action.moveToElement(Chart);
	action.moveToElement(Buy);
	action.click();
	action.perform();
	}
	public void SelectRegularShare() {
		Regular.click();
	}
	public void SelectAMOShare() {
		AMO.click();
	}
	public void ShareQuantity(String Qty) throws EncryptedDocumentException, IOException {
		enterShareQuantity.sendKeys(Qty);
	}
	public void enterPrice(String price) {
		enterSharePrice.clear();
		enterSharePrice.sendKeys(price);
	}
	public void BUYshare() {
		BuyShare.click();
	}
	public void ClickOnChart() {
		
		Chart.click();
	}
}
