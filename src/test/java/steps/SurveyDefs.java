package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.*;

import static org.junit.Assert.assertEquals;

/**
 * Created by tal on 22/01/2017.
 */
public class SurveyDefs {
    private DriverSettings driverSettings = new DriverSettings(DriverType.CHROME);
    //private WebDriver driver = driverSettings.runWebDriver();
    private WebDriver driver = driverSettings.getDriver();


    @Given("^I am in the home page$")
    public void i_am_in_the_home_page() throws Throwable {
        driver.get("http://demo.testfire.net");
        DemoTestfireNet.survey(driver).click();

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.titleIs("Altoro Mutual: Survey")); // wait until the page loads
    }

    @When("^I go threw the survey all to the end and enter my (email@email\\.com) and submit$")
    public void i_go_threw_the_survey_all_to_the_end_and_enter_my_email_email_com_and_submit(String arg1) throws Throwable {
        SurveyWelcome.Yes(driver).click();
        SurveyQuestion1.firstAnswer(driver).click();
        SurveyQuestion2.firstAnswer(driver).click();
        SurveyQuestion3.firstAnswer(driver).click();
        SurveyQuestion4.firstAnswer(driver).click();
        SurveyComplete.textBox(driver).sendKeys(arg1);
        SurveyComplete.submitButton(driver).click();
    }

    @Then("^the (email@email\\.com) is presented to me$")
    public void the_email_email_com_is_presented_to_me(String arg1) throws Throwable {
            assertEquals(SurveyCompleteThanks.reflectedEmail(driver).getText(),"email@email.com");
            driver.quit();

    }


}
