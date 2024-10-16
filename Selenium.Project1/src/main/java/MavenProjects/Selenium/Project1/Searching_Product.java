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

public class Searching_Product 

{
      WebDriver driver;
	
	 @FindBy(id="twotabsearchtextbox")
	   WebElement searchBox;

	   
	   @FindBy(xpath="//div[@class=\"s-suggestion-container\"][1]")
	   WebElement SelectFirstProduct;
	   

	   public void SearchBtn() throws InterruptedException
	   {
		   Thread.sleep(2000);
		  // WebDriverWait w1 = new WebDriverWait(driver,Duration.ofSeconds(10));
		 //	w1.until(ExpectedConditions.elementToBeSelected(searchBox));
		   searchBox.sendKeys("shoes");
		   
	   }
	   
	    public void SelectFirstProduct() throws InterruptedException
	    
	    {
	 	WebDriverWait w1 = new WebDriverWait(driver,Duration.ofSeconds(10));
	 	w1.until(ExpectedConditions.elementToBeClickable(SelectFirstProduct));
	 	   SelectFirstProduct.click();
	 	  Assert.assertTrue(driver.getTitle().contains("Amazon.in")); 
	    	
	    }
	    
	    public Searching_Product(WebDriver driver)
	    {
	 	   this.driver = driver;
	 	   PageFactory.initElements(driver, this);
	    }
}
