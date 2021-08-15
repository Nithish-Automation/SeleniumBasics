package java81;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		List<WebElement> elements = driver.findElements(By.xpath("//a"));

		Consumer<WebElement> consumer = (e) -> {
			if (!e.getText().isBlank()) {
				System.out.println(e.getText());
				

			}

		};

//		elements.forEach(e->System.out.println(e.getText()));
		elements.forEach(consumer);

		driver.quit();

	}

}
