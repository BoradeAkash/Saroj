package Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import POJO.Browser;


public class ScreenShots {
public static void main(String[] args) throws IOException {
	
	WebDriver driver = Browser.openBrowser();
	File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	File destination = new File ("C:\\zoom\\vel.jpeg");
	
	FileHandler.copy(Source, destination);

	

	
	
	
	
}
}
