package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.io.File;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;
import java.io.IOException;
import org.openqa.selenium.OutputType;

import org.openqa.selenium.firefox.FirefoxDriver;

// Import package pageObject.*

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.Google;
import static org.junit.Assert.assertTrue;



/**
 * Created by tal on 17/01/2017.
 */
public class POM_TC {
    private static WebDriver driver = null;

    public static void main(String[] args) {

        //driver = new FirefoxDriver();

        DriverSettings driverSettings = new DriverSettings();
        driverSettings.setDriverType(DriverType.CHROME.toString());
        driverSettings.setDriverProperties();
        driver = driverSettings.runWebDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.google.com");

        // Use page Object library now
        Google.searchBox(driver).sendKeys("ynet");
        Google.searchButton(driver).click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("resultStats")));

        Boolean isPresent = driver.findElements(By.linkText("ynet - חדשות, כלכלה, ספורט, בריאוות")).size() > 0 ;
        assertTrue(isPresent);


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
