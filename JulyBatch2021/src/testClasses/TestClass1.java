package testClasses;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass1 {
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("berfore suite TestClass1");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("berfore test TestClass1");
	}
	
	@BeforeClass
	public void launchBrowser() {
		System.out.println("berfore class TestClass1");
	}
	
	@BeforeMethod
	public void loginToActitime() {
		System.out.println("berfore method  TestClass1 ");
	}

	
	@Test 
	public void testB() {
		System.out.println("test B TestClass1");
		
		//Assert.fail();
	}
	
	@Test (timeOut = 3000)
	public void testC() {
		System.out.println("test C TestClass1");
	}
	
	@Test 
	public void testD() {
		System.out.println("test D TestClass1 ");
		
	}
	
	@AfterMethod
	public void loOutFromActitime() {
		System.out.println("after method TestClass1");
	}
	
	@AfterClass
	public void closedBrowser() {
		System.out.println("after class TestClass1");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("after test TestClass1");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("after suite TestClass1");
	}

}
