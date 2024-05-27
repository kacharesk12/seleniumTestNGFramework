package resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class extentReportManager {
	
	public static ExtentSparkReporter htmlReporter; 
	public static ExtentReports extent;
	public static ExtentTest test;
	
	public static void setup() {
		htmlReporter = new ExtentSparkReporter(System.getProperty("user.dir")+"/test-output/myReport.html");
		htmlReporter.config().setDocumentTitle("Automation Report");
		htmlReporter.config().setReportName("Functional Report");
		htmlReporter.config().setTheme(Theme.DARK);
		
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		extent.setSystemInfo("hostname", "Localhost");
		extent.setSystemInfo("OS", "windows 10");
		extent.setSystemInfo("browsername", "Chrome");
		extent.setSystemInfo("testername", "sneha");
		
	}
	
	public static void endReport() {
		extent.flush();
	}
	

}
