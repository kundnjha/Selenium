package utilities;

import org.openqa.selenium.WebDriver;

public interface DriverInitializer {
	
	WebDriver driverInit(String browserType, String headlessExecution );
	

}
