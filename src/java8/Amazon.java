package java8;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Amazon {
	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		
		WebDriver driver =  new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.findElements(By.xpath("//a")).stream()
		.map(e-> e.getText())
		.filter(s-> !s.isBlank())
		.distinct()
		.sorted()
		.filter(s-> s.startsWith("C")||s.startsWith("P"))
		.forEach(s->System.out.println(s));
		
		
		driver.close();
	}
	

}
