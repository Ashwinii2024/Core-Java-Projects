package MavenProjects.Selenium.Project1;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.junit.Assert;
import org.testng.annotations.Test;



public class ProductionDescpripnPage_AmazonTestCase6 extends AmazonLaunch_Quit

{ 
	//@Test(retryAnalyzer=MavenProjects.Selenium.Project1.Retry_FailedTest_Case.class)
@Test
	public void productdescription() throws InterruptedException, EncryptedDocumentException, IOException
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
  	     
  	   ProductionDescpripnPage s1 = new ProductionDescpripnPage(driver);
  	   
  	   s1.category_select();
  	   s1.Brand_select();
  	   s1.sortedByPrice();
  	   s1.SelectProduct();
  	   s1.price();
  //   s1.review();
  	  // s1.description();
  	
  	   
  	    
	}

}
