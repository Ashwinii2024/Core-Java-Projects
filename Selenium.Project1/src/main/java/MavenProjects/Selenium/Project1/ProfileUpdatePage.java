package MavenProjects.Selenium.Project1;

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

public class ProfileUpdatePage


{
	 WebDriver driver;
	   @FindBy(id="nav-link-accountList")
	   WebElement signin;
	   
	   @FindBy(id="nav-flyout-ya-signin")
	   WebElement SignInClick;
	   
	   @FindBy(id="ap_email")
	   WebElement email;
	   
	   @FindBy(id="continue")
	   WebElement continueBtn;
	   
	   @FindBy(id="ap_password")
	   WebElement Password;
	   
	   @FindBy(id="signInSubmit")
	   WebElement SignInBtn;

	   @FindBy(linkText="Your Account")
	  // @FindBy(xpath="(//span[@class=\"nav-text\"])[11]")
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
	   
	   @FindBy(id="twotabsearchtextbox")
	   WebElement searchBox;
	   
	   
	   public void ClickOn_Signin(WebDriver driver)
	   {
		   Actions a1 = new Actions(driver);
		   a1.moveToElement(signin).perform();
		  
	   }
	   
	   public void SignIn_Click()
	   {
		   SignInClick.click();
		   Assert.assertTrue(email.isDisplayed());
		   //Assert.assertEquals(driver.getTitle(), "Amazon Sign In");
	   }
	  
	   public void Email() throws EncryptedDocumentException, IOException
	   {
		   DDT_File d1 = new DDT_File();
		   d1.Excel_Data();
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
		   DDT_File d1 = new DDT_File();
		   d1.Excel_Data();
		   Password.sendKeys(d1.Password);
	   }
	   
	 
	   public void Submit()
	   {
		   
		      SignInBtn.click();
		      Assert.assertEquals(nameisvisible.isDisplayed(), true);
		      
	   }
	   
	  
	   public void UrAccount()
	   {
	  	 account.click();
	  	 Assert.assertEquals(driver.getCurrentUrl(), "https://www.amazon.in/gp/css/homepage.html?ref_=nav_AccountFlyout_ya");
	   }
	   
	   public void Your_Address()
	   {
		   YourAddress.click();
		   Reporter.log("After click on Your address search box is display");
		   Assert.assertTrue(searchBox.isDisplayed());
	   }
	   
	   public void Edit()
	   {
		   Edit.click();
	   }
	   
	   public void Country_Dropdwn()
	   
	   {
		   Select s1 = new Select(CountryDropdwn);
		   s1.selectByVisibleText("India");
		  // Assert.assertEquals(s1.selectByVisibleText("India"), true);
	   }
	   
	   public void First_Name()
	   {
		   FirstName.clear();
		   FirstName.sendKeys("Ashwini Pawar");
	   }
	   
	   public void Check_Box() {
		   CheckBox.click();
	   }
	   
	   public void Update_address()
	   {
		   Updateaddress.click();
		  Assert.assertEquals(driver.getCurrentUrl(), "https://www.amazon.in/a/addresses?alertId=yaab-enterAddressSucceed");
			
	   }
	   public void Errormessage()
	   {
		   errormessage.getText();
	   }
	 
 public ProfileUpdatePage(WebDriver driver)
 {
	 this.driver=driver;
	   PageFactory.initElements(driver, this);
 }
}
