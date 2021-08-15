package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parallel {
	public WebDriver driver;
	@Parameters({"browsername"})
	@Test
	public void tc1(String browser) {
		if (browser.equals("chrome"))
			driver=new ChromeDriver();
		else {
			driver= new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='English (UK)']")).click();
		driver.findElement(By.xpath("//a[text()='Create a Page']")).click();
		driver.findElement(By.xpath("//div[text()='Get Started']")).click();
		String title = driver.getTitle();
		String url = driver.getCurrentUrl();
		Reporter.log(title, true);
		Reporter.log(url, true);
	}
	

}
