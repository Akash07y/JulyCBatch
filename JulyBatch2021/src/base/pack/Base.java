package base.pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {

	public WebDriver openChromewBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Automation Class\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		return driver;
		
	}
	
	

}
