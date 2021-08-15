package java8;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AmazonOwn {
	
	
	public static void main(String[] args) {
		
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");

		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();

		driver.get("https://www.amazon.in/");

		List<WebElement> linksList = driver.findElements(By.xpath("//a"));
		System.out.println(linksList.size());

		List<String> sort = linksList.stream()
				.filter(e -> e.getText().startsWith("C") || e.getText().startsWith("P"))
				.map(s -> s.getText())
//				.filter(s->!s.isBlank())
				.sorted()
				.distinct()
				.collect(Collectors.toList());

		sort.forEach(ele -> System.out.println(ele));

		driver.quit();

	}

}
