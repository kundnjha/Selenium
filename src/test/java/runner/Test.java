package runner;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {
	
	
	@org.testng.annotations.Test
	public void asdnak() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://safewayinc-mkt-stage4-m.adobe-campaign.com/rest/head/mirrorPage/@Utk-xoocNa4lSXnhUn_1jb9cRtMaIlnBbRIMgrQavpzF-MG9u2QYVVMyDNCvf-qeVBLgCduYW9yz5LcvNoDwohU00wY1gLEyMhJFp81LaMaB0hRr.html?deliveryName=DM25906");
		
		List<WebElement> links = driver.findElements(By.xpath("//a[@href]"));
		
		for(WebElement link : links) {
			System.out.println(link);
			System.out.println(links);
			
			System.out.println(link.getCssValue("href"));

			System.out.println(link.getText());
			
		}

	}

}
