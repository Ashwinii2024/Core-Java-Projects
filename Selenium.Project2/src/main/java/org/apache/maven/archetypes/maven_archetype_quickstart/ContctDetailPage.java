package org.apache.maven.archetypes.maven_archetype_quickstart;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContctDetailPage 

{
	WebDriver driver;
	
  @FindBy(name="mobile")
  WebElement mobileno;
  
  @FindBy(xpath="//div[@class=\"_7c598c35 colorLink d7c291ce\"]")
  WebElement addnewadult;
  
  @FindBy(xpath="//button[@class=\" _526485ba _7e41f983   cdf8d022 _50baedd0\"]")
  WebElement selectGender;
  
  @FindBy(xpath="(//li[@class=\" undefined\"])[2]")
  WebElement clickonFemale;
  
  @FindBy(xpath="//input[@id='input-first_name']")
  WebElement addName;
  
  @FindBy(xpath="//input[@id='input-last_name']")
  WebElement lastName;
  
  @FindBy(xpath="(//button[@class=\"_7e41f983 bba41d3c    _6c913dd6\"])[1]")
  WebElement Addadult;
  
  @FindBy(name="email")
  WebElement email;
  
  public void AddnewAdult()
  {
	  WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
      wait.until(ExpectedConditions.elementToBeClickable(addnewadult));
	  addnewadult.click();
  }
  
  public void SelectGender()
  { 
	  WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
  wait.until(ExpectedConditions.elementToBeClickable(selectGender));
	  selectGender.click();
  }
  
  public void ClickonFemale()
  {
	  WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	  wait.until(ExpectedConditions.elementToBeClickable(selectGender));
	  clickonFemale.click();
  }
  
  public void AddName()
  {
	  addName.sendKeys("Nakshatra");
  }
  
  public void LastName()
  {
	  lastName.sendKeys("Pawar");
  }
  public void Add_adult()
  {
	  WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	  wait.until(ExpectedConditions.elementToBeClickable(Addadult));
	  Addadult.click();
  }
  public void MobileNo()
  {
	  mobileno.clear();
	  mobileno.sendKeys("8104845408");
  }
  public void Email()
  {
	  email.clear();
	  email.sendKeys("Patilashu7075@gmail.com");
  }
  
  public ContctDetailPage(WebDriver driver)
  {
	  PageFactory.initElements(driver, this);
  }
}
