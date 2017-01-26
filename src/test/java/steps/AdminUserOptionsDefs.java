package steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.AdminWelcomePage;
import pageObjects.DemoTestfireNet;
import pageObjects.LoginPage;
import pageObjects.WelcomePage;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

/**
 * Created by tal on 22/01/2017.
 */
public class AdminUserOptionsDefs {
    private DriverSettings driverSettings = new DriverSettings(DriverType.CHROME);
    //private WebDriver driver = driverSettings.runWebDriver();
    private WebDriver driver = driverSettings.getDriver();


    @Given("^I am signed in as an admin$")
    public void i_am_signed_in_as_an_admin() throws Throwable {
        driver.get("http://demo.testfire.net");
        DemoTestfireNet.signIn(driver).click(); //clicks on the login link

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.titleIs("Altoro Mutual: Online Banking Login")); // wait until the page loads

        LoginPage.setUserName(driver,"admin");
        LoginPage.setPassword(driver,"admin");
        LoginPage.loginButton(driver).click();

        //wait.until(ExpectedConditions.titleIs("Altoro Mutual: Online Banking Home"));
        By byXpath = By.xpath("/html/body/div[2]/table/tbody/tr[2]/td[2]/div/h1");
        wait.until(ExpectedConditions.presenceOfElementLocated(byXpath));

    }


    @When("^I look at my menu options$")
    public void i_look_at_my_menu_options() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("^the (ADMINISTRATION) menu title exists$")
    public void the_ADMINISTRATION_menu_title_exists(String arg1) throws Throwable {
        assertEquals(AdminWelcomePage.administrationSectionHeader(driver).getText(),arg1);
    }

    @Then("^(View Application Values) link exists$")
    public void view_Application_Values_link_exists(String arg1) throws Throwable {
        assertEquals(AdminWelcomePage.viewApplicationValuesLink(driver).getText(),arg1);
    }

    @Then("^(Edit Users) link exists$")
    public void edit_Users_link_exists(String arg1) throws Throwable {
        assertEquals(AdminWelcomePage.editUsersLink(driver).getText(),arg1);
        driver.quit();
    }

}
