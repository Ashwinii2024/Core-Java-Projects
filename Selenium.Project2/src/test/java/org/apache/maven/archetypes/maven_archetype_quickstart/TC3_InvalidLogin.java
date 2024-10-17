package org.apache.maven.archetypes.maven_archetype_quickstart;

import org.testng.annotations.Test;


public class TC3_InvalidLogin extends AirlLine_Launch_Quit

{
    @Test
    public void Invalid_Login()
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
