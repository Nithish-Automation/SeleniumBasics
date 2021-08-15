package popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoActitime {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		driver.findElement(By.xpath("//span[text()=\"New\"]")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='Enter task name']")).sendKeys("Nithish");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[text()='Cancel'])[7]")).click();
		
		Alert a = driver.switchTo().alert();
		a.accept();
		driver.close();
		
	}

}
