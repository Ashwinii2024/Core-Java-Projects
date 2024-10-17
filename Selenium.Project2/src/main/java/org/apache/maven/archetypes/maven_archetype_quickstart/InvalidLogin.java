package org.apache.maven.archetypes.maven_archetype_quickstart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class InvalidLogin 

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
	   
	   @FindBy(id="auth-error-message-box")
	   WebElement errorBox;
	   
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
	  
	   public void Email()
	   {
		   email.sendKeys("patila7075@gmail.com");
		   Assert.assertTrue(continueBtn.isDisplayed());
		   
	   }
	  
	   public void Continue_Btn()
	   {
		   continueBtn.click();
		   Reporter.log("Erroe message is displayed");
		   Assert.assertEquals(errorBox.isDisplayed(), true);
		   
	   }
	   
	   public void password()
	   {
		   Password.sendKeys("Apr1995");
		   Assert.assertTrue(false);
	   }
	   
	   public void Submit()
	   {
		   
		      SignInBtn.click();
		      Assert.assertFalse(false);
	   }
	   
	   public InvalidLogin(WebDriver driver)
	   {
		   this.driver=driver;
		   PageFactory.initElements(driver, this);
	   }
}
