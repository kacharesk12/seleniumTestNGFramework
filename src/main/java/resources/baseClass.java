package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class baseClass {
	public static WebDriver driver;

	public static String emailID = generateRandomEmailID();

	public Properties prop;

	public void initilizeDriver() throws IOException {

//		Read the properties file
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\main\\java\\resources\\data.properties");
//		Location of data property file 

		prop = new Properties();
		prop.load(fis);

		String browsername = prop.getProperty("browser");

		if (browsername.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();

		} else if (browsername.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();

		} else if (browsername.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} else {
			System.out.println("Plase choose the proper browser");

		}

	}

	public static String generateRandomEmailID() {
		return "test" + System.currentTimeMillis() + "@gmail.com";

	}

	@BeforeMethod
	public void browserAndURLlaunch() throws IOException {
		initilizeDriver();

		driver.get(prop.getProperty("url"));

	}

	public static String screenshot (WebDriver driver, String filename) {
		 String dateAndTime = new SimpleDateFormat ("yyyyMMddhhmmss").format(new Date());
		 File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 
		 String destination = System.getProperty("user.dir") + "\\Screenshot" + filename + " _" +dateAndTime + ".png";
		 try {
			 FileUtils.copyFile(source, new File (destination));
		 }catch (Exception e) {
				 e.getMessage();
			 }
			 return destination;
			 
		 }
		 
		 @BeforeSuite
		 public void ExtentReport1() {
			 extentReportManager.setup();
			 
		 }
		 
		 @AfterSuite
		 public void ExtentReport() {
			 extentReportManager.endReport();
		 }
	 }

		


