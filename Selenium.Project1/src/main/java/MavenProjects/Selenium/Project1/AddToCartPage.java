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

public class AddToCartPage 

{ 
	WebDriver driver;
	
	@FindBy(name="quantity")
	WebElement dropdown;
	
	@FindBy(id="add-to-cart-button")
	WebElement AddToCartBtn;
	
	public void AddToCart() throws InterruptedException
	{ 
		Set<String> s1 =  driver.getWindowHandles();
		  Iterator<String> i1 = s1.iterator();
		  String parentId = i1.next();
		  String childId = i1.next();
		  System.out.println(parentId);
		  System.out.println(childId);
		  driver.switchTo().window(childId);
		  AddToCartBtn.click();
		
		  Assert.assertEquals(driver.getTitle(),"Amazon.in Shopping Cart");
	}
   
  
public AddToCartPage(WebDriver driver)
   {   
	   this.driver = driver; 
	   PageFactory.initElements(driver, this);
   }
}
