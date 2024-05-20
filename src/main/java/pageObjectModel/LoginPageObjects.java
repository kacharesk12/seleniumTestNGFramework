package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects {
	public WebDriver driver;
	
	private By emailaddress = By.xpath("//input[@name='email']");
	private By password = By.xpath("//input[@name='password']");
	private By login =By.xpath("//input[@type='submit']");
	private By loginsucceText= By.xpath("//h2[text()='My Account']");
	private By loginfailtext = By.xpath("//div[@class='alert alert-danger alert-dismissible']");
	
	

	public LoginPageObjects(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver = driver;
	}
	
	public WebElement EnterUserName () {
		return driver.findElement(emailaddress);
	}
	public WebElement EnterPassword() {
		return driver.findElement(password);
		
	}
	public WebElement clickonlogin() {
		return driver.findElement(login);
	}
	
	
	public WebElement loginsucceText () {
		return driver.findElement(loginsucceText);
	}
	public WebElement loginfailtext() {
		return driver.findElement(loginfailtext);
	}
	
	
	

}
