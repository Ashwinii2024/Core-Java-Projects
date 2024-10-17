package org.apache.maven.archetypes.maven_archetype_quickstart;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;


public class TC2_Login extends AirlLine_Launch_Quit
{
	
	@Test
	public void Login_Page() throws InterruptedException, EncryptedDocumentException, IOException {
		LoginPage l1 = new LoginPage(driver);
		l1.ClickOn_Signin(driver);
		l1.SignIn_Click();
		l1.Email();
		l1.Continue_Btn();
		l1.password();
		l1.Submit();
		
	}


}
