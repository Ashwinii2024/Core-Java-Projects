package org.apache.maven.archetypes.maven_archetype_quickstart;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PaymentPage

{
	WebDriver driver;
	
   @FindBy(name="ppw-instrumentRowSelection")
   WebElement creditRadioBtn;
   
   @FindBy(name="addCreditCardNumber")
   WebElement cardnumber;
   
   @FindBy(xpath="(//span[@class=\"a-button-text a-declarative\"])[2]")
   WebElement expiryDate;
  
   @FindBy(xpath="(//a[@class=\"a-dropdown-link\"])[2]")
   WebElement selectyear;
   
   @FindBy(xpath="//span[@id='pp-LCiP1D-126']")
   WebElement pay;
   
   
   public void CreditRadioBtn()
   {
	   WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
   	wait.until(ExpectedConditions.elementToBeClickable(creditRadioBtn));
	   creditRadioBtn.click();
   }
   
   public void Cardnumber()
   {
	   WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	   	wait.until(ExpectedConditions.elementToBeClickable(cardnumber));
	   cardnumber.sendKeys("6521600827544184");
   }
   
   public void ExpiryDate()
   {
	   WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
  	wait.until(ExpectedConditions.elementToBeClickable(expiryDate));
	   expiryDate.click();
	   
   }
   
   public void Selectyear()
   {
	   WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	  	wait.until(ExpectedConditions.elementToBeClickable(selectyear));
	   selectyear.click();
   }
   public void ClickOnpayBtn()
   {
	   WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	  	wait.until(ExpectedConditions.elementToBeClickable(pay));
	   pay.click();
   }
   public PaymentPage(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
   }
}
