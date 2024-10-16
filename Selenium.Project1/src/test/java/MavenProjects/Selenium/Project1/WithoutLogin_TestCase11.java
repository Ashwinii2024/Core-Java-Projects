package MavenProjects.Selenium.Project1;

import org.testng.annotations.Test;

public class WithoutLogin_TestCase11 extends AmazonLaunch_Quit

{
       @Test
       public void WithLogin() throws InterruptedException
       {
    	   WithoutLogin w1 = new WithoutLogin(driver);
    	   w1.SearchBtn();
    	   w1.SelectFirstProduct();
    	   
    	   ProductionDescpripnPage s1 = new ProductionDescpripnPage(driver);
      	   
      	   s1.category_select();
      	   s1.Brand_select();
      	   s1.sortedByPrice();
      	   s1.SelectProduct();
      	   s1.price();
      	   //s1.description();
      	   
      	 AddToCartPage p1 = new AddToCartPage(driver);
          p1.AddToCart();
          
    	   
       }
}
