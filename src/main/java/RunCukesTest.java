
/**
 * Created by tal on 22/01/2017.
 */
import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;
//import cucumber.junit.Cucumber;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

// was good for older version of cucumber (1.0.14)
//@Cucumber.Options(format = {"pretty", "html:target/cucumber-htmlreport","json-pretty:target/cucumber-report.json","junit:target/cucumber-results.xml"})

@CucumberOptions( plugin = {"pretty", "html:target/cucumber-html-report", "json:target/cucumber-json-report.json" })



public class RunCukesTest {
}
