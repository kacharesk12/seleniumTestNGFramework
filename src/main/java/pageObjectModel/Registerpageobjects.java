package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Registerpageobjects {
	
	public WebDriver driver;
	
	private By Firstname = By.xpath("//input[@name='firstname']");
	private By Lastname = By.xpath("//input[@name='lastname']");
	private By Email = By.xpath("//input[@name='email']");
	private By Telephone = By.xpath("//input[@name='telephone']");
	private By Password = By.xpath("//input[@name='password']");
	private By Passwordconfirm = By.xpath("//input[@name='confirm']");
	private By agree = By.xpath("//input[@name='agree']");
	private By Continue = By.xpath("//input[@value='Continue']");
	
	private By registerationScuccefull = By.xpath("//h1[text()='Your Account Has Been Created!']");
	private By Firstnameerrormsg = By.xpath("//div[text()='First Name must be between 1 and 32 characters!']");
	private By Lastnameerrormsg = By.xpath("(//div[@class='text-danger'])[2]");
	private By Emailerrormsg = By.xpath("(//div[@class='text-danger'])[3]");
	private By Telephoneerrormsg = By.xpath("(//div[@class='text-danger'])[4]");
	private By Passworderrormsg = By.xpath("(//div[@class='text-danger'])[5]");
//	private By Passwordconfirmerrormsg = By.xpath("//div[@class='text-danger']");
	private By PrivacyPolicyAlert = By.xpath("//div[text()=' Warning: You must agree to the Privacy Policy!']");
	private By EmailAlertMsg = By.xpath("//p[text()='If you already have an account with us, please login at the ']");
	private By Continu = By.xpath("//input[@value='Continue']");
	
	public Registerpageobjects(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebElement EnterFirstname () {
		return driver.findElement(Firstname);
	}
	
	public WebElement EnterLastname() {
		return driver.findElement(Lastname);
	}
	
	public WebElement EnterEmail() {
		return driver.findElement(Email);
	}
	
	public WebElement EnterTelephone() {
		return driver.findElement(Telephone);
	}
	
	public WebElement EnterPassword() {
		return driver.findElement(Password);
	}
	
	public WebElement EnterPasswordconfirm () {
		return driver.findElement(Passwordconfirm);
	}
	
	public WebElement Clickonagree () {
		return driver.findElement(agree);
	}
	
	public WebElement ClickonContinue() {
		return driver.findElement(Continue);
	}
	
	
	
	public WebElement getFirstNameErrorMsg() {
		return driver.findElement(Firstnameerrormsg);
	}
	public WebElement getLastNameErrorMsg() {
		return driver.findElement(Lastnameerrormsg);
	}
	public WebElement getEmailerrormsg() {
		return driver.findElement(Emailerrormsg);
	}
	public WebElement getTelephoneerrormsg() {
		return driver.findElement(Telephoneerrormsg);
	}
	public WebElement getPassworderrormsg() {
		return driver.findElement(Passworderrormsg);
	}
	
	public WebElement getPrivacyPolicyAlert() {
		return driver.findElement(PrivacyPolicyAlert);
	}
	public WebElement getEmailAlertMsg() {
		return driver.findElement(EmailAlertMsg);
	}
	
	public WebElement getClickonContinue() {
		return driver.findElement(Continue);
	}
	public WebElement getregisterationScuccefull() {
		return driver.findElement(registerationScuccefull);
	}
	
	
}
