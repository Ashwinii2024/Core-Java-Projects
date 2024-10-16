package MavenProjects.Selenium.Project1;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InvalidLogin_AmazonTestCase3  extends AmazonLaunch_Quit

{
	@Test
	public void InvalidLogin_Page() throws InterruptedException 
	
	{
		InvalidLogin l1 = new InvalidLogin(driver);
		l1.ClickOn_Signin(driver);
		l1.SignIn_Click();
		l1.Email();
		l1.Continue_Btn();
		l1.password();
		l1.Submit();
		
	}
	
	
	

}
