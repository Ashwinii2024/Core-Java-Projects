package MavenProjects.Selenium.Project1;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login_AmazonTestCase2 extends AmazonLaunch_Quit

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


