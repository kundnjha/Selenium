package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverInitialize implements DriverInitializer{
	WebDriver driver;
	public WebDriver driverInit(String browserType, String headlessExecution) {
		if (browserType.toLowerCase().equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();

		}
		else if (browserType.toLowerCase().equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			 driver = new FirefoxDriver();


		} 
		else if (browserType.toLowerCase().equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();

		}
		else if (browserType.toLowerCase().equalsIgnoreCase("ie")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			
		}
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().pageLoadTimeout(Wait_utility.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(Wait_utility.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		return driver;
	}

}
