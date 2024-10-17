package org.apache.maven.archetypes.maven_archetype_quickstart;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryFailedTestCase implements IRetryAnalyzer

{

	int count =0;
	  int retry_count=2;
	  
	@Override
	public boolean retry(ITestResult result) {
		if(count<retry_count)
		{
			count++;
			return true;
		}
		
		return false;
	}

}
