package Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Report {

	public static ExtentReports createReports () {
		ExtentSparkReporter htmlReporter = new ExtentSparkReporter("extentReporter.html");
		
		ExtentReports reports = new ExtentReports();
		reports.attachReporter(htmlReporter);
		reports.setSystemInfo("Regression", "Zerodha");
		reports.setSystemInfo("Browser", "Chrome");
		reports.setSystemInfo("Test by ","Akash");
		return reports;
		
	}
	
	
	
}
