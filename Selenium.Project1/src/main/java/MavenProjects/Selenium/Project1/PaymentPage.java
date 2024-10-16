package MavenProjects.Selenium.Project1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class PaymentPage 

{
	WebDriver driver;
   @FindBy(xpath="//input[@value=\"instrumentId=NetBanking&isExpired=false&paymentMethod=NB&tfxEligible=false\"]")
   WebElement netBankingradiobtn;
   
   @FindBy(name="ppw-bankSelection_dropdown")
   WebElement bankSelection_dropdown;
   
   @FindBy(name="ppw-widgetEvent:SetPaymentPlanSelectContinueEvent")
   WebElement usethispaymentethod;
   
   @FindBy(xpath="//input[@value=\"instrumentId=EMI&isExpired=false&paymentMethod=CC&tfxEligible=false\"]")
   WebElement EMI;
   
   @FindBy(xpath="//input[@value=\"instrumentId=0h_PE_CUS_18b1c868-2e63-40e2-8b24-414fe05d88c8%2FCash&isExpired=false&paymentMethod=COD&tfxEligible=false\"]")
   WebElement CashOnDelivery;
   
   
   public void NetBanking_Radiobtn()
   {
	   WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
   	wait.until(ExpectedConditions.elementToBeClickable(netBankingradiobtn));
	   netBankingradiobtn.click();
	   Assert.assertTrue(netBankingradiobtn.isSelected());
	   System.out.println("net banking radio btn is selected");
	   
   }
   
   public void BankSelection_dropdown()
   {
	   WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	   	wait.until(ExpectedConditions.elementToBeClickable(bankSelection_dropdown));
	 Select s1 = new Select(bankSelection_dropdown);
	 s1.selectByIndex(13);
	//Assert.assertEquals(bankSelection_dropdown.isSelected(),true);
	  
   }
   
   public void UseThispaymentethod()
   {
	   
	   WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	   	wait.until(ExpectedConditions.elementToBeClickable(usethispaymentethod));
	   usethispaymentethod.click();
   }
   
   public void EMI()
   {
	   WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	   	wait.until(ExpectedConditions.elementToBeClickable(EMI));
	    EMI.click();
	   //Assert.assertEquals(EMI.isEnabled(), false);
   }
   
   public void CashOn_Delivery()
   {
	   WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	   	wait.until(ExpectedConditions.elementToBeClickable(CashOnDelivery));
	   CashOnDelivery.click();
   }
   
   public PaymentPage(WebDriver driver)
   {
	   this.driver=driver;
	   PageFactory.initElements(driver, this);
   }
}
