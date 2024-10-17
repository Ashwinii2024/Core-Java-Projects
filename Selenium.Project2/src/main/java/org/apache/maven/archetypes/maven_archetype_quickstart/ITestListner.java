package org.apache.maven.archetypes.maven_archetype_quickstart;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ITestListner implements ITestListener

{
	 public static WebDriver driver;
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestStart(result);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		ITestListener.super.onTestSuccess(result);
		Reporter.log("My test case is pass");
		TakesScreenshot t1 = (TakesScreenshot) driver;
		File source = t1.getScreenshotAs(OutputType.FILE);
		File Destination  = new File("C:\\Users\\harsh\\eclipse-workspace\\Selenium.Project2\\PassTestCase\\ashwini" +  Math.random() + " .png");
		try {
			FileHandler.copy(source,Destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailure(result);
		Reporter.log("My TestCase is fail");
		TakesScreenshot t2 = (TakesScreenshot) driver;
	File Source=t2.getScreenshotAs(OutputType.FILE);
	//C:\Users\harsh\eclipse-workspace\Selenium_Basics\src\Screenshots\FailTestcase
	File Destination = new File("C:\\Users\\harsh\\eclipse-workspace\\Selenium.Project2\\FailTestCase\\ashwini" +   Math.random() + " .png");
	try {
		FileHandler.copy(Source, Destination);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
	}

	  
}
