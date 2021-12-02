package testClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.pack.Base;
import pomPackage.HomePage;
import pomPackage.LoginPage;

public class ToVerifyHomePageHeader extends Base{

	private WebDriver driver;
	LoginPage loginPage ;
	HomePage homePage;
	SoftAssert softAssert ;
	
	@BeforeTest
	@Parameters("browser")
	public void launchBrowser(String browser)
	{
		
		if(browser.equals("Chrome")) 
		{
			driver =  openChromewBrowser();
		}
		if(browser.equals("Firefox"))
		{
			driver =  openFirefoxBrowser();
		}
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
	}
	
	@BeforeClass
	public void lauchApplication() {
	
		driver.get("http://desktop-b2220qc/login.jsp");
		
		softAssert = new SoftAssert();
		loginPage = new LoginPage(driver);
		homePage = new  HomePage(driver);
	}
	
	@BeforeMethod
	public void loginToActitime() {
		loginPage.sendUsename();
		loginPage.sendPassword();
		loginPage.clickOnLogin();
	}

	@Test (priority = 1)
	public void verifyReportButton() {
		
		
		String action = Util.excelData(2,3);
		
		if(action.equals("LoginFail"))
		{
			String url = driver.getCurrentUrl();   // actual result 
			softAssert.assertEquals(url, "LoginPAge");
		}
		if(action.equals("Login"))
		{
			String url = driver.getCurrentUrl();   // actual result 
			softAssert.assertEquals(url, "HomePAge");
		}
	}
	
	@Test (priority = 2)
	public void verifyTaskButton() {
		
		String url = driver.getCurrentUrl();   // actual result 
		Assert.assertEquals(url, "http://desktop-b2220qc/user/submit_tt.do");
		
		homePage.clickOnTaskButton();
		
		url = driver.getCurrentUrl();   // actual result 
		softAssert.assertEquals(url, "http://desktop-b2220qc/tasks/");
		
		String tital = driver.getTitle();
		Assert.assertEquals(tital, "actiTIME - Open Tasks");
		//http://desktop-b2220qc/reports/reports.do
		softAssert.assertAll();
		
		Utility.screeshot(driver);
	}
	
	@AfterMethod
	public void loOutFromActitime() {
		
		System.out.println("logout");
		homePage.clickOnLogoutButton();
	}
	
	@AfterClass
	public void cleanObjects() {
		softAssert = null;
		loginPage = null;
		homePage = null;
	}
	
	@AfterTest
	public void cosedBrowser()
	{
		driver.quit();
		driver = null;
		System.gc();  // garbeg collector
		
		
		
		
		
	}
	
	
}
