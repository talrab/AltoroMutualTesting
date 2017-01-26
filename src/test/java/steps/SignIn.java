package steps;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import java.io.File;
import org.apache.commons.io.FileUtils;
import java.io.IOException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.DemoTestfireNet;
import pageObjects.LoginPage;
import pageObjects.WelcomePage;
import static org.junit.Assert.assertEquals;


/**
 * Created by tal on 22/01/2017.
 */
public class SignIn {
    private static WebDriver driver = null;

    public static void main (String [] args){

        DriverSettings driverSettings = new DriverSettings();
        driverSettings.setDriverType(DriverType.CHROME.toString());
        driverSettings.setDriverProperties();
        driver = driverSettings.runWebDriver();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        driver.get("http://demo.testfire.net");
        DemoTestfireNet.signIn(driver).click();

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.titleIs("Altoro Mutual: Online Banking Login"));

        LoginPage.setUserName(driver,"jsmith");
        LoginPage.setPassword(driver,"Demo1234");
        LoginPage.loginButton(driver).click();

        //wait.until(ExpectedConditions.titleIs("Altoro Mutual: Online Banking Home"));
        By byXpath = By.xpath("/html/body/div[2]/table/tbody/tr[2]/td[2]/div/h1");
        wait.until(ExpectedConditions.presenceOfElementLocated(byXpath));



        //WelcomePage.listAccountsGoButton(driver).click();
        WelcomePage.selectAccount(driver, "1001160141 Savings");
        WelcomePage.listAccountsGoButton(driver).click();

        byXpath = By.xpath("/html/body/div[2]/table/tbody/tr[2]/td[2]/div/h1/span");
        wait.until(ExpectedConditions.presenceOfElementLocated(byXpath));

        assertEquals(driver.findElement(By.id("_ctl0__ctl0_Content_Main_accountid")).getText(),"1001160141");


        // Take screenshot and store as a file format
        File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            // now copy the  screenshot to desired location using copyFile //method
            FileUtils.copyFile(src, new File("C:/selenium/error.png"));
        }

        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }




        driver.quit();
    }
}
