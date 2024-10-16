package MavenProjects.Selenium.Project1;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class UpdateIteam  
 
{  
	  WebDriver driver;
	
      @FindBy(id="nav-cart")
      WebElement cart;
      
      @FindBy(xpath = "//input[@value='Delete']")
      WebElement deleteBtn;
      
      @FindBy(id="sc-active-cart")
      WebElement emptyCartMessage;
      
      @FindBy(xpath="//span[@class=\"a-size-medium a-color-base sc-price sc-white-space-nowrap sc-product-price a-text-bold\"][1]")
      WebElement priceofprduct;
      
      public void ClickonCart() throws InterruptedException
      {
    	/*  Set<String> s1 =  driver.getWindowHandles();
		  Iterator<String> i1 = s1.iterator();
		  String parentId = i1.next();
		  String childId = i1.next();
		  System.out.println(parentId);
		  System.out.println(childId);
		  driver.switchTo().window(childId);*/
    	  cart.click();
    	  Assert.assertTrue(priceofprduct.isDisplayed(), "Item count is not dsiaply");
      }
      
      public void Deleteitem() throws InterruptedException
      {
    	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
          wait.until(ExpectedConditions.elementToBeClickable(deleteBtn));
          deleteBtn.click();
          System.out.println("Item deleted from cart");
          Assert.assertTrue(emptyCartMessage.isDisplayed(),"Cart is not empty");
        
       
       }
      
      public UpdateIteam(WebDriver driver)
      {
    	  this.driver = driver;
    	  PageFactory.initElements(driver, this);
      }
}
