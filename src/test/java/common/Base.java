package common;
import org.openqa.selenium.WebDriver;
import utilities.DriverInitialize;
import utilities.DriverInitializer;
import utilities.FileReadWrite;

public class Base {
private WebDriver driver;

	
	public DriverInitializer driver() {return new DriverInitialize();}
	public WebDriver getDriver() { return driver;	}
	public void setDriver(WebDriver driver) { this.driver = driver;	}
	public FileReadWrite getUtility(){ return new FileReadWrite();}

	
}
