package org.apache.maven.archetypes.maven_archetype_quickstart;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TC11_VerifyTextField extends AirlLine_Launch_Quit
{
	
  @Test
  public void ContactDetails() throws EncryptedDocumentException, IOException, InterruptedException
  {
	  LoginPage l1 = new LoginPage(driver);
		l1.ClickOn_Signin(driver);
		l1.SignIn_Click();
		l1.Email();
		l1.Continue_Btn();
		l1.password();
		l1.Submit();
		
		FlightPage f1 = new FlightPage(driver);
		f1.SearchBox();
		f1.BookFlight_Ticket();
 	
		f1.Selectairportfrom();
		f1.SelectairportTo();
		f1.Select_Calendor();
		f1.Traverse();
		f1.Search_Flights();
        f1.Book_For_Oneway();
        
        Flight_SeatPage f4 = new Flight_SeatPage(driver);
        f4.Proceedtravellerdetails();
        
        ContctDetailPage c1 = new ContctDetailPage(driver);
        c1.AddnewAdult();
        c1.SelectGender();
        c1.ClickonFemale();
        c1.AddName();
        c1.LastName();
        c1.Add_adult();
        c1.MobileNo();
        c1.Email();
  }
}
