package testcases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageObjectModel.HomePageObjects;
import pageObjectModel.Registerpageobjects;
import resources.baseClass;
import resources.commonMethods;
import resources.testData;

public class registerTestcases extends baseClass {
	@Test(priority=1)

	
	public void verifyRegisterwithvalidData() throws IOException, InterruptedException {
		
		HomePageObjects hpo = new HomePageObjects(driver);
		
		commonMethods.handleExplicitwait(driver, 3, hpo.clickonmyaccount());


		hpo.clickonmyaccount().click();

		hpo.clickonregister().click();

		Registerpageobjects rpo = new Registerpageobjects(driver);

		rpo.EnterFirstname().sendKeys(testData.Firstname);
		rpo.EnterLastname().sendKeys(testData.Lastname);
		rpo.EnterEmail().sendKeys(emailID);
		rpo.EnterTelephone().sendKeys(testData.Telephone);
		rpo.EnterPassword().sendKeys(testData.Password);
		rpo.EnterPasswordconfirm().sendKeys(testData.Passwordconfirm);
		rpo.Clickonagree().click();
		rpo.ClickonContinue().click();
		
		String expected = testData.Registrationsucessexpect;
		String actual = rpo.getregisterationScuccefull().getText();
		
		commonMethods.HandleAssertion(actual,expected);

	}

        
	
	
	@Test(enabled=false)
	
	public void verifyRegisterwithinvalidData() throws IOException, InterruptedException {
		
		
		
		
		HomePageObjects hpo= new HomePageObjects(driver);
		Thread.sleep(2000);
		
		
		hpo.clickonmyaccount().click();
		
		hpo.clickonregister().click();
		
		Registerpageobjects rpo = new Registerpageobjects(driver);
		
		rpo.EnterFirstname().sendKeys("1234");
		rpo.EnterLastname().sendKeys("789");
		rpo.EnterEmail().sendKeys("Deepu@1210gmail.com");
		rpo.EnterTelephone().sendKeys("snehak");
		rpo.EnterPassword().sendKeys("Deepu");
		rpo.EnterPasswordconfirm().sendKeys("Deepu");
		rpo.Clickonagree().click();
		rpo.ClickonContinue().click();
		
		
		String expected = testData.Registrationsucessexpect;
		String actual = rpo.getregisterationScuccefull().getText();
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actual,expected);
		sa.assertAll();
		
	
	
   }
	
	
       @Test(priority=2)
	
	public void verifyRegisterwithblankData() throws IOException, InterruptedException {
		
		
		HomePageObjects hpo = new 	HomePageObjects(driver);
		commonMethods.handleExplicitwait(driver, 3, hpo.clickonmyaccount());

		
		
		hpo.clickonmyaccount().click();
		
		hpo.clickonregister().click();
		
		
		
		
		Registerpageobjects rpo = new Registerpageobjects(driver);
		
		
		
		rpo.ClickonContinue().click();
		
		
		String fnExpected = testData.FirstnameExpected;
        String fnActual = rpo.getFirstNameErrorMsg().getText();
        
        String lnExpected = testData.LastnameExpected;
        String lnActual = rpo.getLastNameErrorMsg().getText();
        
        String emailExpected = testData.emailExpected;
        String emaqilActual = rpo.getEmailerrormsg().getText();
        
        String telephoneExpected = testData.telephoneExpected;
        String telephoneActual = rpo.getTelephoneerrormsg().getText();
        
        String passwordExpected = testData.passwordExpected;
        String passwordActual = rpo.getPassworderrormsg().getText();
        
      
        
        String priacypolExpected = testData.priacypolExpected;
        String priacypolActual = rpo.getPrivacyPolicyAlert().getText();
        
        String emailalertExpected = testData.emailalertExpected;
        String emailalertActual = rpo.getEmailAlertMsg().getText();
        
        commonMethods.HandleAssertion(fnActual,fnExpected);
        commonMethods.HandleAssertion(lnActual,lnExpected);
        commonMethods.HandleAssertion(emaqilActual, emailExpected);
        commonMethods.HandleAssertion(telephoneActual, telephoneExpected);
        commonMethods.HandleAssertion(passwordActual, passwordExpected);
        commonMethods.HandleAssertion(priacypolActual, priacypolExpected);
        commonMethods.HandleAssertion(emailalertActual, emailalertExpected);
        
        
        
        
        
        
        
        
        
        
        
        	
        
        
        		
        
		
		
		
		
		
       }

}


