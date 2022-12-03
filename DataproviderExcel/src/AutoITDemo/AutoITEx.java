package AutoITDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AutoITEx {

	@Test
	public void demoWindowsHandle() throws Exception {
		System.setProperty("webdriver.chrome.driver", "chromedriverAUTOIT.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://javabykiran.com/playground/file-upload");
		driver.manage().window().maximize();
		driver.findElement(By.id("file")).click();
		Thread.sleep(2000);
		
		Runtime.getRuntime().exec("D:/AUTOIT/fileUpload.exe");
		
	}
	
	
}
