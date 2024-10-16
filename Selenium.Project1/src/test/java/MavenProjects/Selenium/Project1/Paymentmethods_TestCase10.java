package MavenProjects.Selenium.Project1;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

public class Paymentmethods_TestCase10 extends AmazonLaunch_Quit

{
    @Test
    public void Addanotherapaymentmethod() throws InterruptedException, EncryptedDocumentException, IOException
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
      
      CheckOutProcess c1 = new CheckOutProcess(driver);
      c1.ProceeddToBuy();
      c1.AddressBtn();
      
      PaymentPage p3 = new PaymentPage(driver);
      //cash on delivery payment option
    //  p3.CashOn_Delivery();
      //p3.UseThispaymentethod();
     

    //NetBanking payment option
     // p3.NetBanking_Radiobtn();
    p3.BankSelection_dropdown();
    p3.UseThispaymentethod();
    
      //EMI payment Option
  //   p3.EMI();
    //p3.UseThispaymentethod();
    }
}
