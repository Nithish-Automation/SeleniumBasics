package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase1 {
	public WebDriver driver;
	
	@BeforeMethod
	public void openApp() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}
	
	@Test
	public void Login() {
		driver.findElement(By.xpath("//a[text()='English (UK)']")).click();
		driver.findElement(By.id("email")).sendKeys("dhjsdk");
		driver.findElement(By.id("pass")).sendKeys("dhfskjhk");
		driver.findElement(By.name("login")).click();
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
