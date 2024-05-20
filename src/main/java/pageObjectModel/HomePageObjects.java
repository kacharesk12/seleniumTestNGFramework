package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageObjects {
	
	public WebDriver driver;
	
	private By myAccount= By.xpath("//i[@class='fa fa-user']");
	private By register = By.xpath("//a[text()='Register']");
	private By Login = By.xpath("//a[text()='Login']");

	public HomePageObjects(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public WebElement clickonmyaccount() {
		return driver.findElement(myAccount);
	}
	
	public WebElement clickonregister() {
		return driver.findElement(register);
		
	}
	
	public WebElement clickonLogin() {
		return driver.findElement(Login);
	}
	
}
