package MavenProjects.Selenium.Project1;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Amazon_TestCase1  extends AmazonLaunch_Quit

{
	@Test
	public void Registration_Form() throws InterruptedException, EncryptedDocumentException, IOException
	{ 
       //DTT_File d1 = new DDT_File();
	   // d1.Excel_Data();
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
