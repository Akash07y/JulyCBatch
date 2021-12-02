package pomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy (xpath = "//a[@class='content tasks']")
	private WebElement task;
	
	@FindBy (xpath = "//a[@class='content reports']")
	private WebElement report;
	
	@FindBy (xpath = "//a[@class='content users']")
	private WebElement user;
	
	@FindBy (xpath = "//a[text()='Logout']")
	private WebElement logout;
	
	
	public HomePage(WebDriver driver)  // driver = driver123 = new ChromeDriver()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnTaskButton() {
		task.click();;
	}
	
	public void clickOnReportButton() {
		report.click();
	}
	
	public void clickOnUserButton() {
		user.click();
	}
	
	public void clickOnLogoutButton() {
		logout.click();
	}
	
}
