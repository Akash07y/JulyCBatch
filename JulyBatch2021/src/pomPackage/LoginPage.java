package pomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	@FindBy (xpath = "//input[@name='username']")
	private WebElement userName;
	
	@FindBy (xpath = "//input[@name='pwd']")
	private WebElement password;
	
	@FindBy (xpath = "//a[text()='Login']")
	private WebElement login;
	
		@FindBy (xpath = "//a[text()='Login']")
	private WebElement login123;
	
		@FindBy (xpath = "//a[text()='Login']")
	private WebElement login;3456
	
	public LoginPage(WebDriver driver)  // driver = driver123 = new ChromeDriver()
	{
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	public void sendUsename() {
		
		String user = "hjk";
		userName.sendKeys("admin");
	}
	
	public void sendPassword() {
		password.sendKeys("manager");
	}
	
	public void clickOnLogin() {
		login.click();
	}
	
	//OR
	
	public void logInActitime() {
		userName.sendKeys("admin");
		password.sendKeys("manager");
		login.click();
	}

}
