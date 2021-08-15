package links;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks1 {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.skillrary.com/");
		List<WebElement> list = driver.findElements(By.tagName("a"));
		System.out.println("size "+list.size());
		
		
		List<String> urlList = new ArrayList<String>();
		
		for (WebElement e : list) {
			String url = e.getAttribute("href");
			urlList.add(url);
			
			driver.quit();
			
		}
		
	}

}
