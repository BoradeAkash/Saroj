package POM;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateNewACCount {
WebDriver driver;
	
	@FindBy(xpath="//input[@type=\"text\"]")private WebElement ContactNo;
	
	public CreateNewACCount(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void enterContactNo(String NUM) {
		Set<String> childpage = driver.getWindowHandles();
		Iterator<String> a = childpage.iterator();
		
		while(a.hasNext()) {
			String mainpage = a.next();
			driver.switchTo().window(mainpage);
			String currentTitlee = driver.getTitle();
			if(currentTitlee.equals("Signup and open a Zerodha trading and demat account online and start investing – Zerodha")){
//				WebElement dropdown = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
//				Select option = new Select(dropdown);
//				option.selectByIndex(2);
//				WebElement radio2 =driver.findElement(By.xpath("(//input[@value='Radio2'])"));
//				radio2.click();
		
		ContactNo.sendKeys(NUM);
	}
	
}
}
}