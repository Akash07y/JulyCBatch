package testClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomPackage.HomePage;
import pomPackage.LoginPage;

public class Test1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Automation Class\\chromedriver.exe");		
		WebDriver driver123 = new ChromeDriver();
		driver123.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);		
		
		driver123.get("http://desktop-b2220qc/login.jsp");
		
		LoginPage loginPage = new LoginPage(driver123);
		loginPage.sendUsename();
		loginPage.sendPassword();
		loginPage.clickOnLogin();
		
		HomePage homePage = new  HomePage(driver123);
		homePage.clickOnReportButton();
		
		
	}
}
