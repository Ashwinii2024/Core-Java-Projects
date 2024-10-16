package MavenProjects.Selenium.Project1;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProfileUpdatePage_AmazonTestcase4 extends AmazonLaunch_Quit


{

	@Test(retryAnalyzer=MavenProjects.Selenium.Project1.Retry_FailedTest_Case.class)
	public void Profile_update() throws InterruptedException, EncryptedDocumentException, IOException {
		ProfileUpdatePage l1 = new ProfileUpdatePage(driver);
		l1.ClickOn_Signin(driver);
		l1.SignIn_Click();
		l1.Email();
		l1.Continue_Btn();
		l1.password();
		l1.Submit();
		l1.ClickOn_Signin(driver);
	    l1.UrAccount();
	    l1.Your_Address();
	    l1.Edit();
	    l1.Country_Dropdwn();
	    l1.First_Name();
	    l1.Check_Box();
	    l1.Update_address();	   
	}

}
