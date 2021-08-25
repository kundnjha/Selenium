package runner;

import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;
import io.cucumber.testng.AbstractTestNGCucumberTests;




@CucumberOptions(
		features = "src/test/resources/features/Target.feature",
		glue= "stepDefinition",
		dryRun = false
)
public class TestRunner2 extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider()
    public Object[][] scenarios() {
        return super.scenarios();
    } 

}
