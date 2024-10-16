	package MavenProjects.Selenium.Project1;
	
	import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.Select;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.testng.Assert;
	
	public class ProductionDescpripnPage
	
	{   
		WebDriver driver;
		
		
	   // @FindBy(linkText="Men's Formal Shoes")
		@FindBy(xpath="(//span[@class=\"a-size-base a-color-base\"])[5]")
	    WebElement category;
	    
	    @FindBy(xpath="//i[@class=\"a-icon a-icon-checkbox\"][1]")
	    WebElement Brand;
	    
	    @FindBy(xpath="//span[@class=\"a-size-base-plus a-color-base\"]")
	    WebElement Brandname;
	    
		@FindBy(xpath="//span[@class=\"a-size-base-plus a-color-base a-text-normal\"][1]")
		WebElement selectshoe;
		
		 @FindBy(xpath="//span[@class=\"a-price-whole\"]")
	    WebElement price;
		
	@FindBy(xpath="//div[@id='cm-cr-dp-review-sort-type']")
    WebElement review;
	
	
	
	@FindBy(xpath="//h2[.='Product details']")
	//@FindBy(id="productDescription_feature_div")
	WebElement Description;
	     

	  @FindBy(id="s-result-sort-select")
	   WebElement sortbyprice;
	   
	   
	   public void sortedByPrice()
	   {
		   Select s1 = new Select(sortbyprice);
		   s1.selectByIndex(2);
	   }
	  
		public void Brand_select()
		{
			Brand.click();
		    Assert.assertTrue(Brandname.isDisplayed(),"Brandname is selected");	
			System.out.println("Brandname is Displayed");
		}
		public void category_select()
		{
			category.click();
		}
		public void SelectProduct() throws InterruptedException
	    {
	    	WebDriverWait w2 = new WebDriverWait(driver,Duration.ofSeconds(10));
	    	w2.until(ExpectedConditions.elementToBeClickable(selectshoe));
	    	selectshoe.click();
	    	 
	    	Thread.sleep(2000);
	   }

	     public void price()
	     {
	    	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	    	wait.until(ExpectedConditions.visibilityOf(price));
	        Assert.assertTrue(price.isDisplayed(), "Price is displayed");
	       System.out.println("Price is displayed");
	     }
	     
	     public void review() throws InterruptedException 
	     {
		   
		   Select s1 = new Select(review);
		   s1.selectByIndex(1);
		
	          }
		   public void description() throws InterruptedException
		     {
		    	//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		    	//wait.until(ExpectedConditions.visibilityOf(Description));
		    	Thread.sleep(2000);	    
		    	Assert.assertTrue(Description.isDisplayed());
		    	//Assert.assertTrue(Description.getText().contains("Introducing Airson Footwears, a collection designed..."), "Product description doesn't match.");
				System.out.println("Description is displayed");
		     }
	  public ProductionDescpripnPage(WebDriver driver)
	  {
		  this.driver = driver; 
		  PageFactory.initElements(driver, this);
	  }
	}
