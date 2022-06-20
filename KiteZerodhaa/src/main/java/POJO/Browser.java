package POJO;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

	public static WebDriver openBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\zoom\\Updated chromedriver101\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		//driver.manage().timeouts().implicitlyWait(4000,TimeUnit.MILLISECONDS);
		return driver;
		
		
	}
	
	
	
	
	
}
