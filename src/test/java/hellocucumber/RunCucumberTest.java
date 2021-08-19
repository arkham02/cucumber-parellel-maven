package hellocucumber;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty","html:target/cucumber-reports/cucumber-reports.html","json:target/jsonReports/cucumber.json"}, dryRun = false)
public class RunCucumberTest {

}
