package stepDefinition;

import org.openqa.selenium.WebDriver;

import common.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import utilities.DriverInitialize;

public class Hooks extends Base  {

	
	@Before
    public void beforeScenario(){
		/*
		 * System.out.println("This will run before the Scenario");
		 * System.out.println("thread id:"+ Thread.currentThread().getId());
		 */
		setDriver(driver().driverInit("Chrome", "blank"));
		String url = getUtility().readConfigFile("url");
		getDriver().get(url);

    }	
	
	@After
    public void afterScenario(){
		/*
		 * System.out.println("This will run after the Scenario");
		 * System.out.println("thread id:"+ Thread.currentThread().getId());
		 */
		getDriver().quit();

    }

}
