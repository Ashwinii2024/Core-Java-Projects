package org.apache.maven.archetypes.maven_archetype_quickstart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flight_ForDifferentClass 

{
   @FindBy(xpath="(//span[@class=\"_718722dc\"])[3]")
   WebElement economyclass;
   
   @FindBy(xpath="//button[@class=\"_7e41f983 bba41d3c  _50baedd0  \"]")
   WebElement searchBtn;
   
   public void Select_Economyclass()
   
   {
	   economyclass.click();
   }
   public void SearchBtn()
   {
  	 searchBtn.click();
   }
   
   public Flight_ForDifferentClass(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
   }
}
