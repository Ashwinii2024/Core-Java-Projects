package MavenProjects.Selenium.Project1;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

public class AddToCart_AmazonTestCase7 extends AmazonLaunch_Quit

{
	@Test
	public void Sorted() throws InterruptedException, EncryptedDocumentException, IOException
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
  	  // s1.description();
  	   
  	   AddToCartPage p1 = new AddToCartPage(driver);
       p1.AddToCart();
  	   
  	
	}
	
}
