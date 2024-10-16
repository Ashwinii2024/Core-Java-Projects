package MavenProjects.Selenium.Project1;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class CheckOutProcess 

{
	WebDriver driver;
	
	@FindBy(xpath="//div[@class=\"sc-list-item-content\"][1]")
	WebElement selectproduct;
	
   @FindBy(name="proceedToRetailCheckout")
   WebElement ProceeddToBuyBtn;
   
   @FindBy(id="shipToThisAddressButton")
   WebElement address;
   
   @FindBy(name="ppw-instrumentRowSelection")
   WebElement SelectCredit;
   
   @FindBy(linkText="Enter card details")
   WebElement entercarddetails;
   
   @FindBy(name="ApxSecureIframe")
   WebElement paymentiframe;
   
   @FindBy(xpath="//input[@class=\"a-input-text a-form-normal pmts-account-Number\"]")
   WebElement cardNumber;
   
   @FindBy(name="ppw-expirationDate_month")
   WebElement expiryDate;
   
   @FindBy(name="ppw-expirationDate_year")
   WebElement expiryYear;
   
   @FindBy(name="ppw-widgetEvent:AddCreditCardEvent")
   WebElement enterCardDetails;
   
   @FindBy(name="apx-secure-field-addCreditCardVerificationNumber")
   WebElement cvviframe;
   
   @FindBy(xpath="//input[@class=\"card-cvv\"]")
   WebElement cvv;
   
   @FindBy(name="ppw-widgetEvent:SetPaymentPlanSelectContinueEvent")
   WebElement usethispaymentethod;
   
   @FindBy(xpath ="(//span[@class=\"a-label a-radio-label\"])[1]")
   WebElement addreess;
   
   
   public void ProceeddToBuy()
   {
	   WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
       wait.until(ExpectedConditions.elementToBeClickable(ProceeddToBuyBtn));
       ProceeddToBuyBtn.click();
      // Assert.assertEquals(addreess.isSelected(),true);
   }
   
   /* public void SelectproductforBuy()
    {
    	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
    	wait.until(ExpectedConditions.visibilityOf(selectproduct));
    	//selectproduct.click();
    	selectproduct.click();
    }
    */
    public void AddressBtn()
    {
    	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
    	wait.until(ExpectedConditions.elementToBeClickable(address));
    	address.click();
    }
    
    public void Select_Credit()
    {
    	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
    	wait.until(ExpectedConditions.elementToBeClickable(SelectCredit));
    	SelectCredit.click();
    }
    
    public void Enter_Card_Details(WebDriver driver)
    {
    	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
    	wait.until(ExpectedConditions.elementToBeClickable(entercarddetails));
    	entercarddetails.click();
    	driver.switchTo().frame(paymentiframe);
    }
    
    public void Card_Number(WebDriver driver)
    {
    	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
    	wait.until(ExpectedConditions.visibilityOf(cardNumber));
    	cardNumber.sendKeys("6521600827544184");
    }
   
    public void Expiry_Date() throws InterruptedException
    {
    	Select s1 = new Select(expiryDate);
    	Thread.sleep(2000);
    	s1.selectByVisibleText("09");
    }
    
    public void Expiry_Year() throws InterruptedException
    {
    	Select s1 = new Select(expiryYear);
    	Thread.sleep(2000);
    	s1.selectByVisibleText("2027");
    }
    
    public void EnterCard_Details(WebDriver driver)
    {
    	enterCardDetails.click();
    	driver.switchTo().defaultContent();
    	
    }
    
    public void Enter_cvv(WebDriver driver) throws InterruptedException
    {
    	
    	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
    	wait.until(ExpectedConditions.elementToBeClickable(cvviframe));
    	driver.switchTo().frame(cvviframe);
    	cvv.click();
    	Thread.sleep(1000);    
    	cvv.sendKeys("013");
    	Thread.sleep(1000);    
    	//cvv.sendKeys(Keys.ENTER);
    	driver.switchTo().defaultContent();
    	
    }
    
    public void UseThispaymentethod()
    {
 	   
 	   WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
 	   	wait.until(ExpectedConditions.elementToBeClickable(usethispaymentethod));
 	   usethispaymentethod.click();
    }
   public CheckOutProcess(WebDriver driver)
   {
	   this.driver=driver;
	   PageFactory.initElements(driver, this);
   }
   
}
