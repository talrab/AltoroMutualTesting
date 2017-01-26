package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.DemoTestfireNet;
import pageObjects.LoginPage;
import pageObjects.TransferFunds;
import pageObjects.WelcomePage;

import static org.junit.Assert.assertEquals;

/**
 * Created by tal on 22/01/2017.
 */
public class TransferFundsDefs {
    private DriverSettings driverSettings = new DriverSettings(DriverType.CHROME);
    //private WebDriver driver = driverSettings.runWebDriver();
    private WebDriver driver = driverSettings.getDriver();

    @Given("^I am signed in1$")
    public void i_am_signed_in1() throws Throwable {
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

    @Given("^I go to the Transfer Funds link$")
    public void i_go_to_the_Transfer_Funds_link() throws Throwable {
        WelcomePage.transferFunds(driver).click();
    }

    @When("^I choose to transfer (\\d+)\\$ from the (\\d+) account to the (\\d+)$")
    public void i_choose_to_transfer_$_from_the_account_to_the(String arg1, String arg2, String arg3) throws Throwable {
        Select from = new Select(TransferFunds.fromAccount(driver));
        from.selectByValue(arg2);
        Select to = new Select(TransferFunds.toAccount(driver));
        to.selectByValue(arg3);
        TransferFunds.amountToTransfer(driver).sendKeys(arg1);
        TransferFunds.transferMoneyButton(driver).click();
    }

    @Then("^I get a message saying \\$(\\d+) was successfully transferred from Account (\\d+) into Account (\\d+) at the current date$")
    public void i_get_a_message_saying_$_was_successfully_transferred_from_Account_into_Account_at_the_current_date(String arg1, String arg2, String arg3) throws Throwable {
        String expectedMessage = "$" + arg1 + " was successfully transferred from Account " + arg2 + " into Account " + arg3 + "at 1/26/2017 8:03:23 AM.";
        String expectedResultNoDateNoHour = expectedMessage.substring(0,expectedMessage.indexOf("at"));

        String receivedMessage = TransferFunds.transferResult(driver).getText();
        String receivedMessageNoDateNoHour = receivedMessage.substring(0,receivedMessage.indexOf("at")).trim();

        assertEquals(expectedResultNoDateNoHour, receivedMessageNoDateNoHour);
        driver.quit();
    }


}
