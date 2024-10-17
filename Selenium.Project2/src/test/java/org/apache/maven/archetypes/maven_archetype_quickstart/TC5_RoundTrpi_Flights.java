package org.apache.maven.archetypes.maven_archetype_quickstart;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

public class TC5_RoundTrpi_Flights extends AirlLine_Launch_Quit

{
    @Test
    public void RountTrip() throws EncryptedDocumentException, IOException, InterruptedException
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
    	
    	FlightPage_RoundTrip f2 = new FlightPage_RoundTrip(driver);
    	f2.RoundTripRadio();
    	f2.Flightfrom();
    	f2.FlightTo();
    	f2.FromDate();
    	f2.ToDate();
    	f2.Economy();
    	f2.SearchBtn();
    	
    }
}
