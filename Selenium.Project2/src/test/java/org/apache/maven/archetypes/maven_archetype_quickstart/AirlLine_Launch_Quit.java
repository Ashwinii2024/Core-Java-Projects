package org.apache.maven.archetypes.maven_archetype_quickstart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
@Listeners(org.apache.maven.archetypes.maven_archetype_quickstart.ITestListner.class)
public class AirlLine_Launch_Quit

{
	/* WebDriver driver;
	   @BeforeMethod

    public void launchAirlLine()
    
    {
    	driver =new ChromeDriver();
    	driver.get("https://www.amazon.in");
    	driver.manage().window().maximize();
    	  ITestListner.driver = driver;
    }*/
  
      static WebDriver driver;

	   @Parameters("browser")
	   @BeforeMethod
 
	public void launchAirlLine(String nameOfBrowser)
	{
		if(nameOfBrowser.equals("chrome"))
		
		{
	   driver = new ChromeDriver();
		}
		
		if(nameOfBrowser.equals("edge"))
		{
			driver = new EdgeDriver();
		}
	   ITestListner.driver = driver;
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
	} 
	
    @AfterMethod
    public void Quit()
    {
       //driver.quit();
    }
}
