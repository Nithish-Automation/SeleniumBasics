package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		
		driver.findElement(By.xpath("//label[text()='Date']")).click();
		
		driver.findElement(By.xpath("//td[text()='22']")).click();
		
		
		
	}

}
