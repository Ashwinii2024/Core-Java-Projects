package org.apache.maven.archetypes.maven_archetype_quickstart;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TC1_Registration extends AirlLine_Launch_Quit


{
  @Test
  public void Registration() throws InterruptedException, EncryptedDocumentException, IOException
  {
	
	RegistrationPage a1= new RegistrationPage(driver);
	
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(500));
    
	a1.SignInBtn(driver);
    
    a1.ClickOnSignBtn();
 
    a1.Create_New_Account();
    
    a1.Customer_name();
   
    Assert.assertEquals(a1.customerName.isDisplayed(), true, "Customer name input field is not displayed!");
  
    a1.Phone_No(driver);
   
    a1.Password(driver);
  
    a1.Continue_Btn();

}
  
}
