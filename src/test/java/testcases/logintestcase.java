package testcases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageObjectModel.HomePageObjects;
import pageObjectModel.LoginPageObjects;

import resources.baseClass;
import resources.commonMethods;
import resources.testData;

public class logintestcase extends baseClass {
	@Test
	public void verifyloginwithvalidData() throws IOException, InterruptedException {
		

		HomePageObjects hpo = new HomePageObjects(driver);
		
		commonMethods.handleExplicitwait(driver, 3, hpo.clickonmyaccount());

		

		hpo.clickonmyaccount().click();
		hpo.clickonLogin().click();
		
		
		
		LoginPageObjects lpo = new LoginPageObjects(driver);
		
		lpo.EnterUserName().sendKeys(emailID);
		lpo.EnterPassword().sendKeys(testData.Password);
		lpo.clickonlogin().click();
		
		String expected = testData.Succesloginexpected;
		String actual = lpo.loginsucceText().getText();
		
	
//			
		commonMethods.HandleAssertion(actual,expected);

	}
	
	@Test()
	public void verifyloginwithinvalidData() throws IOException, InterruptedException {
		
		HomePageObjects hpo = new HomePageObjects(driver);
		
		commonMethods.handleExplicitwait(driver, 3, hpo.clickonmyaccount());

		hpo.clickonmyaccount().click();
		hpo.clickonLogin().click();
		
		
		
		LoginPageObjects lpo = new LoginPageObjects(driver);
		
		lpo.EnterUserName().sendKeys(emailID);
		lpo.EnterPassword().sendKeys(testData.Password);
		lpo.clickonlogin().click();
		
		String expected = testData.invalidloginexpected;
		
		String actual = lpo.loginfailtext().getText();
		
		commonMethods.HandleAssertion(actual,expected);
		
	}
		
	
	
	
	
	
	

}
