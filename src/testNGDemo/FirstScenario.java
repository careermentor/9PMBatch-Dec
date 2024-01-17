package testNGDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstScenario 
{

	@Test
	public void first_testcase()
	{
		System.out.println("this is first test case");
		
		Assert.assertEquals("Hello", "Hello world");  //hard assertion
		
	}
	
}
