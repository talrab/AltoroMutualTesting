package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.DemoTestfireNet;
import pageObjects.LoginPage;
import pageObjects.WelcomePage;

import static org.junit.Assert.assertEquals;
import static steps.BrowserDriver.getCurrentDriver;

/**
 * Created by tal on 22/01/2017.
 */
public class AaTestDefs {
    //private DriverSettings driverSettings = new DriverSettings(DriverType.CHROME);
    //private WebDriver driver = driverSettings.getDriver();


    @Given("^I am on the page \"([^\"]*)\"$")
    public void i_am_on_the_page(String arg1) throws Throwable {
        getCurrentDriver().get("http://demo.testfire.net");
        DemoTestfireNet.signIn(getCurrentDriver()).click();

    }

    @Then("^I verify that title of the web page contains \"([^\"]*)\"$")
    public void i_verify_that_title_of_the_web_page_contains(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        BrowserDriver.close();

    }


}
