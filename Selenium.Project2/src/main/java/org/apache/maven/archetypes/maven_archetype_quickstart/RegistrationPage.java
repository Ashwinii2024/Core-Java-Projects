	package org.apache.maven.archetypes.maven_archetype_quickstart;
	
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

//import MavenProjects.Selenium.Project1.DDT_File;
	
	public class RegistrationPage 
	
	{
		 WebDriver driver;
		   @FindBy(id="nav-link-accountList")
		   WebElement Signinbtn;
		   
		   @FindBy(id="nav-flyout-ya-signin")
		   WebElement ClickSignIn;
		   
		   @FindBy(id="createAccountSubmit")
		   WebElement CreateAccount;
		   
		   @FindBy(name="customerName")
		   WebElement customerName;
		   
		   @FindBy(id="ap_phone_number")
		   WebElement Phonenumber;
		   
		   @FindBy(id="ap_password")
		   WebElement password;
		   
		   @FindBy(id="continue")
		   WebElement continueBtn;
		   
		   @FindBy(id="auth-verify-button")
		   WebElement VerifyBtn;
		   
		 //  DDT_File d1 = new DDT_File();
		   
		   public void SignInBtn(WebDriver driver)
		   {
			   Actions a1 = new Actions(driver);
			   a1.moveToElement(Signinbtn).perform();
		   }
		   
		   public void ClickOnSignBtn()
		   {
			   
			   ClickSignIn.click();
			   Assert.assertTrue(CreateAccount.isDisplayed());;
			     
		   }
		   
		   public void Create_New_Account()
		   {
			  /* Set<String> s1 =  driver.getWindowHandles();
				  Iterator<String> i1 = s1.iterator();
				  String parentId = i1.next();
				  String childId = i1.next();
				  System.out.println(parentId);
				  System.out.println(childId);
				  driver.switchTo().window(childId);*/
			      CreateAccount.click();
			      Assert.assertEquals(driver.getTitle(), "Amazon Registration");;
			   
		   }
		   
		   public void Customer_name()
		   {
			customerName.sendKeys("Ashwini");
			Assert.assertTrue(Phonenumber.isDisplayed());
		   }
		   
		   public  void Phone_No(WebDriver driver) throws EncryptedDocumentException, IOException 
		 
		   {
			   DDT_File1 d1 = new DDT_File1();
			   d1.Excelsheet();
			   Phonenumber.sendKeys(d1.PhoneNumber);
			   Assert.assertTrue(password.isDisplayed());
			  
		   }
		   
		   public void Password(WebDriver driver) throws EncryptedDocumentException, IOException 
		   {
			   DDT_File1 d1 = new DDT_File1();
			   d1.Excelsheet();
			   password.sendKeys(d1.Password); 
		   }
		   
		   public void Continue_Btn()
		   {
			   continueBtn.click();
		   }
		   public void Verify_Btn()
		   {
			   VerifyBtn.click();
		   }
		   public RegistrationPage(WebDriver driver)
		   
		   {
			   this.driver = driver;
			   PageFactory.initElements(driver, this);
		   }
		   
	}
