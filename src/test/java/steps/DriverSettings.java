package steps;

import java.io.File;
import java.util.concurrent.TimeUnit;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * Created by tal on 17/01/2017.
 */
public class DriverSettings {
    private String chromeWebDriverpath = "d:\\Tal - Work Related\\myWorkspace\\chromedriver.exe";
    private WebDriver driver ;
    private String driverType = "";



    public DriverSettings(DriverType driverTypeEnum) {
        driverType = driverTypeEnum.toString();
    }

    public void setDriverProperties () {
        if (this.driverType == DriverType.CHROME.toString()) {
            System.setProperty("webdriver.chrome.driver", chromeWebDriverpath);
        }
        else if (this.driverType == DriverType.IE.toString()){
            System.setProperty("webdriver.ie.driver", "c:\\D\\Online Courses\\Selenium and continoues integration\\Tools\\IEDriverServer.exe");
        }
    }

    public WebDriver runWebDriver (){

        this.setDriverProperties();

        if (this.driverType == DriverType.CHROME.toString()) {
            driver = new ChromeDriver();
        }
        else if (this.driverType == DriverType.IE.toString()) {
            driver = new InternetExplorerDriver();
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        return driver;
    }

}
