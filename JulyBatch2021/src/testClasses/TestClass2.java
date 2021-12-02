package testClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass2 {
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("berfore suite TestClass2");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("berfore test TestClass2");
	}
	
	@BeforeClass
	public void launchBrowser() {
		System.out.println("berfore class TestClass2");
	}
	
	@BeforeMethod
	public void loginToActitime() {
		System.out.println("berfore method TestClass2");
	}

	@Test 
	public void testA() {
		System.out.println("Test A TestClass2");
		
		
	}
	
	@Test 
	public void testB() {
		System.out.println("test B TestClass2");
		
		//Assert.fail();
	}
	
	@Test (timeOut = 3000)
	public void testC() {
		System.out.println("test C TestClass2");
	}
	
	@Test 
	public void testD() {
		System.out.println("test D TestClass2");
		
	}
	
	@AfterMethod
	public void loOutFromActitime() {
		System.out.println("after method TestClass2");
	}
	
	@AfterClass
	public void closedBrowser() {
		System.out.println("after class TestClass2");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("after test TestClass2");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("after suite TestClass2");
	}

}
