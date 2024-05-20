package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

public class baseClass {
	public WebDriver driver;
	
	public static String emailID = generateRandomEmailID();
	
	public Properties prop;
	
	

	public void initilizeDriver() throws IOException {
		
//		Read the properties file
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\resources\\data.properties");
//		Location of data property file 
		
		 prop = new Properties();
		prop.load(fis);
		
		String browsername = prop.getProperty("browser");
		
		if (browsername.equalsIgnoreCase("chrome")) {
			driver= new ChromeDriver();
			
		}
		else if (browsername.equalsIgnoreCase("firefox")) {
			driver= new FirefoxDriver();
			
		}else if (browsername.equalsIgnoreCase("edge")) {
			driver= new EdgeDriver();
		}
		else {
			System.out.println("Plase choose the proper browser");

        }
		
		
	}
	 public static String generateRandomEmailID() {
		 return "test"+System.currentTimeMillis()+"@gmail.com";
		 
	 }
	 @BeforeMethod
	 public void browserAndURLlaunch() throws IOException {
		 initilizeDriver();


			driver.get(prop.getProperty("url"));
		 
	 }
	
	
}	
		
		
		
		
