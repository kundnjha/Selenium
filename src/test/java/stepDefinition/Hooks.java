package stepDefinition;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import common.TestContext;
import enums.TestData;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import utilities.Wait_utility;


public class Hooks  {
	TestContext testcontext;
	WebDriver driver ;
	
	
	public Hooks(TestContext context) {
		testcontext = context;
		
	}	

	
	@Before
    public void beforeScenario(){
		
		  String url = testcontext.getConfigFile().readConfigFile(TestData.url.toString());
		  testcontext.getWebDriverManager().getDriver().get(url);
		 
		System.out.println("Before");
		 

    }	
	
	
	  @After public void afterScenario(){
		  testcontext.getWebDriverManager().closeDriver(); System.out.println("After");
	  
	  
	  }
	 

}
