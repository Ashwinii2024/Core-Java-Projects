package org.apache.maven.archetypes.maven_archetype_quickstart;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class FlightPage 

{
	
	WebDriver driver;
	
	 @FindBy(linkText="Flights")
	    WebElement Flights;
	    
	 
	 @FindBy(xpath="//input[@name=\"searchText\"]")
	 WebElement searchText1;
	 
	 @FindBy(id="twotabsearchtextbox")
	 WebElement searchBox;
	
	 @FindBy(xpath= "//span[@id='a-autoid-1']")
	 WebElement BookFlightTicket;
	 
	 @FindBy(id="radioId-oneWay-tripTypeRadio")
	 WebElement oneway;
	 
	 @FindBy(xpath="(//span[@class=\"_76efd884 sizeMini colorTertiary\"])[1]")
	 WebElement selectairportfrom;
	 
	 @FindBy(xpath="(//div[@class=\"_32608d65\"])[2]")
	 WebElement selectfirst;
	  
	 @FindBy(xpath="//div[@class=\"_576acefe\"]")
     WebElement selectairportTo;
	
	 @FindBy(xpath="(//div[@class=\"_90aa3c07 a407febf _6078df67\"])[1]")
	 WebElement selectTocity;
	 
	 @FindBy(xpath="//span[@class=\"dcb9db95 colorBase sizeMedium\"]")
	 WebElement selectdate;
	 
	 @FindBy(xpath="//button[@class=\"_4a388932\"]")
	 WebElement selectnexticon;
	 
	 @FindBy(xpath="(//span[@class=\"db14b3bc\"])[87]")
     WebElement dateselection;
	 
	 @FindBy(xpath="//span[@class=\"_79bb5d49 _0bba7dca\"]")
	 WebElement traverse;
	 
	 @FindBy(xpath="//div[@id='fl_lp_search']")
	 WebElement search;
	 
	 @FindBy(xpath="(//button[@class=\"_7e41f983 bba41d3c  _50baedd0  \"])[2]")
	 WebElement Bookforoneway;
	 
	 @FindBy(xpath="(//button[@class=\"_7e149b6e  edfe9d73\"])[2]")
	 WebElement selectChildren;
	 
	 @FindBy(xpath="(//button[@class=\"_7e149b6e  edfe9d73\"])[3]")
	 WebElement selectInfant;
	 
	 public void SearchBox()
	 
	  {
		  searchBox.sendKeys("Flights"+Keys.ENTER);	
		  Assert.assertEquals(driver.getTitle(), "Amazon.in : Flights");;
	  }
	 
	  
	  public void BookFlight_Ticket() throws InterruptedException
	  {
		  WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.elementToBeClickable(BookFlightTicket));
	    BookFlightTicket.click();
	    Assert.assertEquals(driver.getTitle(), "Flight Bookings on Amazon");
	  }
	
	  public void Oneway_radio_Btn_Select() throws InterruptedException
	  {   Thread.sleep(9000);
		  oneway.click();
		  Assert.assertTrue(oneway.isSelected());
	  }
	  
	    public void searchText()
	    {
	    	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	    	wait.until(ExpectedConditions.elementToBeClickable(searchText1));
	    	searchText1.click();
	    }
	    
	    public void Selectairportfrom()
	    {
	    	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	    	wait.until(ExpectedConditions.elementToBeClickable(selectairportfrom));
	    	selectairportfrom.click();
	    	Assert.assertTrue(true);
	    }
	    public void SelectFrom_City()
	    {
	    	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	    	wait.until(ExpectedConditions.elementToBeClickable(selectfirst));
	    	selectfirst.click();
	    	Assert.assertTrue(true);
	    }
	    
	    public void SelectairportTo()
	    {
	    	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	    	wait.until(ExpectedConditions.elementToBeClickable(selectairportTo));
	    	selectairportTo.click();
	    	Assert.assertTrue(true);
	    }
	   
	    public void SelectTocity()
	    {
	    	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	    	wait.until(ExpectedConditions.elementToBeClickable(selectTocity));
	    	selectTocity.click();
	    	Assert.assertTrue(true);
	    }
	   
	    public void Select_Calendor()
	    {
	    	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
	    	wait.until(ExpectedConditions.visibilityOf(selectdate));
	    	selectdate.click();
	    	Assert.assertTrue(true);
	    }
	    public void Selectnexticon() throws InterruptedException
	    {
	   Thread.sleep(3000);
	    			 
	    	selectnexticon.click();
	    	Assert.assertTrue(true);
	    }
	    public void selectDate()
	    {
	    	WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(30));
	    	wait1.until(ExpectedConditions.visibilityOf(dateselection));
	    	dateselection.click();
	    	Assert.assertTrue(true);
	    }
	    
	    public void Traverse()
	    {
	    	traverse.click();
	    	Assert.assertTrue(search.isDisplayed());
	    }
	    
	    public void Search_Flights()
	    {
	    	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	    	wait.until(ExpectedConditions.visibilityOf(search));
	    	search.click();
	    	Assert.assertEquals(driver.getTitle(),"Flight Bookings on Amazon");
	    }
	    
	    public void Book_For_Oneway()
	    {
	    	
	    	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
    	    wait.until(ExpectedConditions.visibilityOf(Bookforoneway));
	    	Bookforoneway.click();
	    }
	    
	    public void SelectChildren()
	    {
	    	selectChildren.click();
	    }
	    
	    public void SelectInfant()
	    {
	    	selectInfant.click();
	    }
	    public FlightPage(WebDriver driver)
	    {
	    	this.driver=driver;
	    	PageFactory.initElements(driver,this);
	    }
}


