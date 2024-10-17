package org.apache.maven.archetypes.maven_archetype_quickstart;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPageForCoupon 

{
	WebDriver driver;
	
   @FindBy(xpath="(//button[@class=\"_7e41f983 bba41d3c  _50baedd0  \"])[1]")
   WebElement Apply;
   
   
   public void Apply_Coupon()
   {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
    	wait.until(ExpectedConditions.elementToBeClickable(Apply));
	   Apply.click();
   }
   
   public SearchPageForCoupon(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
   }
   
}
