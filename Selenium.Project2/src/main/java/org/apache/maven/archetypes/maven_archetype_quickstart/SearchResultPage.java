package org.apache.maven.archetypes.maven_archetype_quickstart;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class SearchResultPage

{
	WebDriver driver;
   @FindBy(xpath="//div[@class=\"d7b2a52c\"]")
   WebElement flightInfo;
   
   @FindBy(xpath="//div[@class=\"_7c598c35 a69d62e8\"]")
   WebElement faredetails;
   
   @FindBy(xpath="//div[@class=\"_7c598c35 \"]")
   WebElement viewBaggage;
   
  @FindBy(xpath="//div[@class=\"b948a4af\"]")
  WebElement baggagedetails;
  
   @FindBy(xpath="//span[@class=\"a9212bfd\"]")
   WebElement basefare;
   
   public void FlightInfo()
   {
	   WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
       wait.until(ExpectedConditions.visibilityOf(flightInfo));
	   Assert.assertEquals(flightInfo.isDisplayed(), true);
   }
   
   public void FareDetails()
   
   {    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(faredetails));
	   faredetails.click();
	 Assert.assertTrue(basefare.isDisplayed());
	 
   }
   
   public void ViewBaggage()
   
   {
	   WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
       wait.until(ExpectedConditions.elementToBeClickable(viewBaggage));
	   viewBaggage.click();
	  // Assert.assertTrue(baggagedetails.isDisplayed());
	   
   }
   public SearchResultPage(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
   }
}
