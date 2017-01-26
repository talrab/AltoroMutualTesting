package steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
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
import java.util.concurrent.TimeUnit;
import static org.junit.Assert.assertEquals;

/**
 * Created by tal on 22/01/2017.
 */
public class AccountHistoryDefs {
    private DriverSettings driverSettings = new DriverSettings(DriverType.CHROME);
    private WebDriver driver = driverSettings.runWebDriver();


    @Given("^I am signed in$")
    public void i_am_signed_in() throws Throwable {
        driver.get("http://demo.testfire.net");
        DemoTestfireNet.signIn(driver).click(); //clicks on the login link

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.titleIs("Altoro Mutual: Online Banking Login")); // wait until the page loads

        LoginPage.setUserName(driver,"jsmith");
        LoginPage.setPassword(driver,"Demo1234");
        LoginPage.loginButton(driver).click();

        //wait.until(ExpectedConditions.titleIs("Altoro Mutual: Online Banking Home"));
        By byXpath = By.xpath("/html/body/div[2]/table/tbody/tr[2]/td[2]/div/h1");
        wait.until(ExpectedConditions.presenceOfElementLocated(byXpath));

    }

    @When("^I choose account (.*)$")
    public void i_choose_account(String arg1) throws Throwable {
        WelcomePage.selectAccount(driver, arg1);
        WelcomePage.listAccountsGoButton(driver).click();

        By byXpath = By.xpath("/html/body/div[2]/table/tbody/tr[2]/td[2]/div/h1/span");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(byXpath));


    }

    @Then("^the account history page header should display (\\d+)$")
    public void the_account_history_page_header_should_display(String arg1) throws Throwable {
        assertEquals(driver.findElement(By.id("_ctl0__ctl0_Content_Main_accountid")).getText(),arg1);
        driver.quit();


    }


}
