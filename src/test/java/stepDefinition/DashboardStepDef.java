package stepDefinition;
import common.TestContext;
import enums.TestData;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;
	
	
	
	public class DashboardStepDef {
		
		  TestContext testContext; 
		  HomePage homepage;
		  LoginPage loginpage;
		  public DashboardStepDef(TestContext context) {
		  testContext = context; 
		  homepage = testContext.getPageObjectManager().getHomePage();
		  loginpage = testContext.getPageObjectManager().getLoginPage();
		  
		  }
		 
		@Given("User has opened the site")
		public void user_has_opened_the_site() {
			homepage.clickOnAccountHeader("Log In");
			System.out.println("login");
			}
		
		@Then("user logs in to the site")
		public void user_logs_in_to_the_site() {
			String username = testContext.getConfigFile().readConfigFile(TestData.username.toString());
			String password = testContext.getConfigFile().readConfigFile(TestData.password.toString());
			System.out.println(username);
			System.out.println(password);
			loginpage.login(username, password);

		}
		
		@Given("Browser is opened")
		public void browser_is_opened() {
		    // Write code here that turns the phrase above into concrete actions
		}

		@When("User puts url and hit enters")
		public void user_puts_url_and_hit_enters() {
		    // Write code here that turns the phrase above into concrete actions
		}

		@Then("It opens")
		public void it_opens() {
		    // Write code here that turns the phrase above into concrete actions
		}
			
	}
