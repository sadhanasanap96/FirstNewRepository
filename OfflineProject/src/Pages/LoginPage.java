package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class LoginPage {
	WebDriver driver=null;
	
	@Test (priority = 1)
	public void startBrowser() 
	{
		String url="file:///C:/Users/PC/Downloads/JBK/javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/index.html";
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver= new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	}
	@Test (priority = 2)
	public void verifyLogin() 
	{
		
	}
	
	

	
	
	
	

}
