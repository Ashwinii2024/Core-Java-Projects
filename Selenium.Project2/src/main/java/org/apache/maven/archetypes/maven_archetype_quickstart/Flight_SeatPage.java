package org.apache.maven.archetypes.maven_archetype_quickstart;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flight_SeatPage 

{
	WebDriver driver;
	
    @FindBy(xpath="(//div[@class=\"bef6210b _682e3a1d \"])[1]")
    WebElement selectFlight;
    
    @FindBy(linkText="Book")
    WebElement book;
    
    @FindBy(linkText="Proceed to traveller details")
    WebElement travellerdetails;
    
    @FindBy(id="fl_tr_select")
    WebElement selectcheckbox;
    
    @FindBy(xpath="//button[@class=\"_7e41f983 bba41d3c  _50baedd0  ada8b185 _6b9247a2\"]")
    WebElement seatselection;
    
    @FindBy(xpath="(//div[@class=\"_0d462540  _1b6b90e5  \"])[1]")
    WebElement selectseat;
    
    @FindBy(xpath="//button[@class=\"_7e41f983 bba41d3c  _50baedd0  ada8b185 _6b9247a2\"]")
    WebElement next;
    
    @FindBy(xpath="(//div[@class=\"_0d462540  _1b6b90e5 _2ae0b8e0 \"])[1]")
    WebElement selectreturn;
    
    @FindBy(xpath="//button[@class=\"_7e41f983 bba41d3c  _50baedd0  ada8b185 _6b9247a2\"]")
    WebElement next1;
    
    @FindBy(xpath="(//div[@class=\"_7c598c35 colorLink d7c291ce\"])[2]")
    WebElement AddNewChild;
    
    @FindBy(xpath="(//button[@class=\" _526485ba _7e41f983   cdf8d022 _50baedd0\"])[2]")
    WebElement selectChildGender;
    
    @FindBy(xpath="(//li[@class=\" undefined\"])[4]")
    WebElement selectFemale;
  
    @FindBy(xpath="(//input[@id='input-first_name'])[2]")
    WebElement firstname;
    
    @FindBy(xpath="(//input[@id='input-last_name'])[2]")
    WebElement lastname;
    
    @FindBy(xpath="(//button[@class=\"_7e41f983 undefined  _50baedd0  c0de9476\"])[1]")
    WebElement childBOD;
    
    @FindBy(xpath="//a[@class=\"rc-calendar-year-select\"]")
    WebElement selectMonthYear;
    
    @FindBy(xpath="(//a[@class=\"rc-calendar-year-panel-year\"])[4]")
    WebElement selectyear;
    
    @FindBy(xpath="(//div[@class=\"rc-calendar-date\"])[7]")
    WebElement selectdate;
    
    @FindBy(xpath="(//button[@class=\"_7e41f983 bba41d3c    _6c913dd6\"])[2]")
    WebElement addChild;
    
    @FindBy(xpath="(//i[@class=\"d726bd8f _4d2636f0\"])[1]")
    WebElement selectcheckBox;
    
    @FindBy(xpath="//i[@class=\"d726bd8f _4d2636f0\"]")
    WebElement	selectcheckBoxbeforepayment;
    
    @FindBy(xpath="//button[@class=\"_7e41f983 bba41d3c  _50baedd0  ada8b185 _6b9247a2\"]")
    WebElement ProceedtTopay;
    
    public void SelectFlight()
    {
    	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
    	wait.until(ExpectedConditions.visibilityOf(selectFlight));
    	selectFlight.click();
    }
    
    public void Flight_Book()

    {
    	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
    	wait.until(ExpectedConditions.visibilityOf(book));
    	book.click();
    }
    
    public void Proceedtravellerdetails()
    {
    	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
    	wait.until(ExpectedConditions.visibilityOf(travellerdetails));
    	travellerdetails.click();
    }
    
    public void Select_Checkbox()
    
    {
    	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
    	wait.until(ExpectedConditions.elementToBeClickable(selectcheckbox));
    	selectcheckbox.click();
    	
    }
    
    public void ProceedSeat()
    {
    	seatselection.click();
    }
    
    public void Selectseat()
    {
    	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
    	wait.until(ExpectedConditions.elementToBeClickable(selectseat));
    	selectseat.click();
    }
    public void Next()
    {
    	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
    	wait.until(ExpectedConditions.elementToBeClickable(next));
    	next.click();
    }
    
    public void Selectreturn()
    {
    	selectreturn.click();
    }
    
    public void Next1()
    {
    	next1.click();
    }
    public void AddNew_Child()
    {
    	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
    	wait.until(ExpectedConditions.elementToBeClickable(AddNewChild));
    	AddNewChild.click();
    }
    
    public void SelectChildGender() 
    {
    	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
    	wait.until(ExpectedConditions.elementToBeClickable(selectChildGender));
    	selectChildGender.click();
    }
    
    public void SelectFemale()
    {
    	selectFemale.click();
    }
    public void Firstname() throws InterruptedException
    {
    	Thread.sleep(2000);    
    	firstname.sendKeys("Nakshu Ashu");
    }
    
    public void Lastname() throws InterruptedException
    {
    	Thread.sleep(2000); 
    	lastname.sendKeys("Pawar");
    }
    
    public void ChildBOD() throws InterruptedException
    {
    	Thread.sleep(2000); 
    	childBOD.click();
    }
    public void SelectMonthYear()
    {
    	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
    	wait.until(ExpectedConditions.elementToBeClickable(selectMonthYear));
    	selectMonthYear.click();;
    }
    public void Selectyear()
    {
    	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
    	wait.until(ExpectedConditions.elementToBeClickable(selectyear));
    	selectyear.click();
    }
    
    public void Selectdate()
    {
    	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
    	wait.until(ExpectedConditions.elementToBeClickable(selectdate));
    	selectdate.click();
    }
    public void AddChild()
    {
    	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
    	wait.until(ExpectedConditions.elementToBeClickable(addChild));
    	addChild.click();
    }
    public void selectcheckBox()
    {
    	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
    	wait.until(ExpectedConditions.elementToBeClickable(selectcheckBox));
    	selectcheckBox.click();
    }
    
    public void SelectcheckBoxbeforepayment()
    {
    	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
    	wait.until(ExpectedConditions.elementToBeClickable(selectcheckBoxbeforepayment));
    	selectcheckBoxbeforepayment.click();
    }
    
    public void ProceedtTopayBtn()
    {
    	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
    	wait.until(ExpectedConditions.elementToBeClickable(ProceedtTopay));
    	ProceedtTopay.click();
    }
    public Flight_SeatPage(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
}
