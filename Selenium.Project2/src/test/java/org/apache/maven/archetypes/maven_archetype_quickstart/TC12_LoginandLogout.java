package org.apache.maven.archetypes.maven_archetype_quickstart;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TC12_LoginandLogout extends AirlLine_Launch_Quit

{
	
    @Test
    public void logout() throws EncryptedDocumentException, IOException, InterruptedException
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
		
	    LoginPage l2 = new LoginPage(driver);
		l2.ClickOn_Signin(driver);
		l2.Signout();
	
    }
}
