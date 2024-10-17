package org.apache.maven.archetypes.maven_archetype_quickstart;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

public class LoginPage {
	
	 WebDriver driver;
	 
	   @FindBy(id="nav-link-accountList")
	   WebElement signin;
	   
	   @FindBy(id="nav-flyout-ya-signin")
	   WebElement SignInClick;
	   
	   @FindBy(id="nav-item-signout")
	   WebElement signout;
	   
	   @FindBy(id="ap_email")
	   WebElement email;
	   
	   @FindBy(id="continue")
	   WebElement continueBtn;
	   
	   @FindBy(id="ap_password")
	   WebElement Password;
	   
	   @FindBy(id="signInSubmit")
	   WebElement SignInBtn;

	   
	   @FindBy(xpath="(//span[@class=\"nav-text\"])[6]")
	   WebElement account;
	   
	   @FindBy(xpath="(//div[@class=\"a-box-inner\"])[4]")
	   WebElement YourAddress;
	   
	   @FindBy(linkText="Edit")
	   WebElement Edit;
	   
	   @FindBy(id="address-ui-widgets-countryCode-dropdown-nativeId")
	   WebElement CountryDropdwn;
	   
	   @FindBy(id="address-ui-widgets-enterAddressFullName")
	   WebElement FirstName;
	   
	   @FindBy(id="address-ui-widgets-use-as-my-default")
	   WebElement CheckBox;
	   
	   @FindBy(id="address-ui-widgets-form-submit-button")
	   WebElement Updateaddress;
	   
	   @FindBy(id="auth-email-invalid-claim-alert")
	   WebElement errormessage;
	   
	   @FindBy(xpath="//span[@id=\"nav-link-accountList-nav-line-1\"]")
	   WebElement nameisvisible;
	   
	   public void ClickOn_Signin(WebDriver driver)
	   {
		   Actions a1 = new Actions(driver);
		   a1.moveToElement(signin).perform();
	   }
	   
	   public void SignIn_Click()
	   {
		   SignInClick.click();
		   Assert.assertEquals(driver.getTitle(), "Amazon Sign In");
	   }
	   
	   public void Signout()
	   {
		   signout.click();
	   }
	  
	   public void Email() throws EncryptedDocumentException, IOException
	   {
		   DDT_File1 d1 = new DDT_File1();
		   d1.Excelsheet();
		   email.sendKeys(d1.email);
		   Reporter.log("After typing email continue btn is working");
		   Assert.assertEquals(continueBtn.isDisplayed(), true);
	   }
	  
	   public void Continue_Btn()
	   {
		   continueBtn.click();
		   Assert.assertEquals(Password.isDisplayed(), true);
	   }
	   
	   public void password() throws EncryptedDocumentException, IOException
	   {
		   DDT_File1 d1 = new DDT_File1();
		   d1.Excelsheet();
		   Password.sendKeys(d1.Password);
	   }
	   
	 
	   public void Submit()
	   {
		   
		      SignInBtn.click();
		  //  Assert.assertEquals(driver.getCurrentUrl(), "https://www.amazon.in/?ref_=nav_signin");
	      Assert.assertEquals(nameisvisible.isDisplayed(), true);
	   }
	   
	  
	   public void UrAccount()
	   {
	  	 account.click();
	  	 Assert.assertTrue(YourAddress.isDisplayed());
	   }
	   
	   public void Your_Address()
	   {
		  
		   YourAddress.click();
		   Assert.assertTrue(Edit.isDisplayed());
	   }
	   
	   public void Edit()
	   {
		   
		   Edit.click();
		   Assert.assertTrue(CountryDropdwn.isDisplayed());
	   }
	   
	   public void Country_Dropdwn()
	   {
		   Select s1 = new Select(CountryDropdwn);
		   s1.selectByVisibleText("India");
		   Assert.assertTrue(CountryDropdwn.isSelected());
	   }
	   
	   public void First_Name()
	   {
		   FirstName.clear();
		   FirstName.sendKeys("Ashwini Pawar");
		 
		   
	   }
	   
	   public void Check_Box() {
		   CheckBox.click();
		   Assert.assertTrue(CheckBox.isSelected());
	   }
	   
	   public void Update_address()
	   {
		   Updateaddress.click();
	   }
	   public void Errormessage()
	   {
		   errormessage.getText();
	   }
	   public LoginPage(WebDriver driver)
	   {
		   this.driver = driver;
		   PageFactory.initElements(driver, this);
	   }
	  

}
