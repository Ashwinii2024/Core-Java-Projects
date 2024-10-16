package MavenProjects.Selenium.Project1;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Searching_Product_AmazonTestCase5 extends AmazonLaunch_Quit

{
      @Test
      public void HomePage () throws InterruptedException, EncryptedDocumentException, IOException

      {
    	LoginPage l1 = new LoginPage(driver);
  		l1.ClickOn_Signin(driver);
  		l1.SignIn_Click();
  		l1.Email();
  		l1.Continue_Btn();
  		l1.password();
  		l1.Submit();
  		
  		Searching_Product h1 = new Searching_Product(driver);
  	     h1.SearchBtn();
  	     h1.SelectFirstProduct();
  	   
      }
}
