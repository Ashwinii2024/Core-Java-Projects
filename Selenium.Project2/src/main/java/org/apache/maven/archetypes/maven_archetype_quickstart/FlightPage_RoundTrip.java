package org.apache.maven.archetypes.maven_archetype_quickstart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class FlightPage_RoundTrip 

{
	WebDriver driver;
	
     @FindBy(xpath="(//span[@class=\"_718722dc\"])[2]")
     WebElement rountTrip;
     
     @FindBy(xpath="(//span[@class=\"colorBase sizeMedium _8d2f006b _79bb5d49\"])[1]")
     WebElement flightfrom;
     
     @FindBy(xpath="(//span[@class=\"colorBase sizeMedium _8d2f006b _79bb5d49\"])[2]")
     WebElement flightTo;
     
     @FindBy(xpath="(//span[@class=\"dcb9db95 colorBase sizeMedium\"])[1]")
     WebElement fromDate;
     
     @FindBy(xpath="(//span[@class=\"dcb9db95 colorBase sizeMedium\"])[2]")
     WebElement toDate;
     
     @FindBy(xpath="//span[@class=\"_79bb5d49 _0bba7dca\"]")
     WebElement economy;
     
     @FindBy(xpath="//button[@class=\"_7e41f983 bba41d3c  _50baedd0  \"]")
     WebElement searchBtn;
     
     public void RoundTripRadio()
     {
    	 rountTrip.click();
    	// Assert.assertTrue(rountTrip.isSelected());
     }
     
     public void Flightfrom()
     {
    	 flightfrom.click();
    	 
     }
     
     public void FlightTo()
     {
    	 flightTo.click();
    	
     }
     
     public void FromDate()
     {
    	 fromDate.click();
    	
     }
     
     public void ToDate()
     {
    	 toDate.click();


     }
     
     public void Economy()
     {
    	 economy.click();
    	 
     }
     
     public void SearchBtn()
     {
    	 searchBtn.click();
    	 Assert.assertEquals(driver.getTitle(),"Flight Bookings on Amazon");
    	 
     }
     public FlightPage_RoundTrip(WebDriver driver)
     {
    	 this.driver=driver;
    	 PageFactory.initElements(driver, this);
     }
}
