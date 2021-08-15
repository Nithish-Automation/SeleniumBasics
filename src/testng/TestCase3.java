package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase3 {
	public WebDriver driver;
	@BeforeMethod
	public void OpenApp() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}
	
	@Test
	public void createpage() {
		driver.findElement(By.xpath("//a[text()='English (UK)']")).click();
		driver.findElement(By.xpath("//a[text()='Create a Page']")).click();
		driver.findElement(By.xpath("//div[text()='Get Started']")).click();
		String title = driver.getTitle();
		String url = driver.getCurrentUrl();
		Reporter.log(title, true);
		Reporter.log(url, true);
	}
	
	@AfterMethod
	public void close() {
		driver.close();
	}

}
