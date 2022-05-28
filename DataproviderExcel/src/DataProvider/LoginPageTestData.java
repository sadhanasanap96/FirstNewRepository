package DataProvider;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class LoginPageTestData {
	@Test(dataProvider = "loginDataProvider")
	public void f(String username, String password) {
		System.out.println(username);
		System.out.println(password);
		
		String URL = "file:///C:/Users/PC/Downloads/JBK/javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/index.html";
		System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(URL);
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.xpath("//button")).click();
		
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");

	}

	@DataProvider
	public Object[][] loginDataProvider() throws Exception {
		FileInputStream fis = new FileInputStream("LoginPageData.xls");
		Workbook workbook = Workbook.getWorkbook(fis);
		Sheet sheet = workbook.getSheet(0);
		int noOfrows = sheet.getRows();
		int noOfCol = sheet.getColumns();
		
		String loginData [][]=new String[noOfCol][noOfrows];
		
		for (int i = 0; i < noOfCol; i++) {

			for (int j = 0; j < noOfrows; j++) {
				Cell cell = sheet.getCell(i,j);// column row
				String val = cell.getContents();
				
				loginData [j][i]=val;

			}
		}

		return loginData;

	};
}
