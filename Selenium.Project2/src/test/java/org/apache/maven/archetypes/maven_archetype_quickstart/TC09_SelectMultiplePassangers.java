package org.apache.maven.archetypes.maven_archetype_quickstart;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

public class TC09_SelectMultiplePassangers extends AirlLine_Launch_Quit

{
   @Test
   public void SelectMultiplPassangers() throws InterruptedException, EncryptedDocumentException, IOException
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
		f1.SelectFrom_City();
	    f1.SelectairportTo();
	    f1.SelectTocity();
	    f1.Select_Calendor();
		f1.Traverse();
		f1.SelectChildren();
		//f1.SelectInfant();
		f1.Search_Flights();
		
		 Flight_SeatPage f4 = new Flight_SeatPage(driver);
		 f4.SelectFlight();
		 f4.Flight_Book();
		 f4.Proceedtravellerdetails();
		 f4.AddNew_Child();
		 f4.SelectChildGender();
		 f4.SelectFemale();
		 f4.Firstname();
		 f4.Lastname();
		 f4.ChildBOD();
		 f4.SelectMonthYear();
		 f4.Selectyear();
		 f4.Selectdate();
		 f4.AddChild();
		 f4.ProceedSeat();
		 f4.selectcheckBox();
	   
   }
}
