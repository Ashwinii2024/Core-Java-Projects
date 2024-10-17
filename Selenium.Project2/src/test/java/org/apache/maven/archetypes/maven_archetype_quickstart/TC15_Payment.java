package org.apache.maven.archetypes.maven_archetype_quickstart;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

public class TC15_Payment extends AirlLine_Launch_Quit

{
  @Test
  public void PaymentPage() throws EncryptedDocumentException, IOException, InterruptedException 
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
	
	Flight_ForDifferentClass f3 = new Flight_ForDifferentClass(driver);
	f3.Select_Economyclass();
  f3.SearchBtn();
  
  Flight_SeatPage f4 = new Flight_SeatPage(driver);
  f4.SelectFlight();
  f4.Flight_Book();
  f4.Proceedtravellerdetails();
  f4.Select_Checkbox();
  f4.ProceedSeat();
  f4.Selectseat();
  f4.Next();
  f4.Selectreturn();
  f4.Next1();
  f4.SelectcheckBoxbeforepayment();
  //f4.Select_Checkbox();
  f4.ProceedtTopayBtn();
  PaymentPage p1 = new PaymentPage(driver);
  p1.CreditRadioBtn();
  p1.Cardnumber();
  p1.ExpiryDate();
  p1.Selectyear();
 // p1.ClickOnpayBtn();
 
  }
}
