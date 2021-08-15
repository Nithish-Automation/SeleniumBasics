package links;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {
	public static void main(String[] args) {
		
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.skillrary.com/");
		 
		 List<WebElement> list = driver.findElements(By.tagName("a"));
		 System.out.println("No. of links are "+ list.size());
		 
		 List<String> urlList = new ArrayList<String>();
		 
		 for (WebElement e : list) {
			String url = e.getAttribute("href");
			urlList.add(url);
//			checkBrokenLinks(url);
		}
		 
		 long stTime = System.currentTimeMillis();
		 urlList.parallelStream().distinct().forEach(e-> checkBrokenLinks(e));
		 long endTime = System.currentTimeMillis();
		
		 System.out.println("total time taken: "+(endTime-stTime));
		 
		 driver.quit();
		 
	}
	
	public static void checkBrokenLinks(String linkUrl) {
		
		
		try {
			URL url = new URL(linkUrl);
			HttpURLConnection httpUrlConnection = (HttpURLConnection) url.openConnection();
			httpUrlConnection.setConnectTimeout(5000);
			httpUrlConnection.connect();
			
			
			if (httpUrlConnection.getResponseCode()>=400) {
				System.out.println(linkUrl+" ---> "+httpUrlConnection.getResponseMessage()+" is a broken link");
				
			} 
			
			else {
				System.out.println(linkUrl+" ---> "+httpUrlConnection.getResponseMessage());
			}
		} 
		
		
		catch (Exception e) {
		}
		
		
		
	}

}
