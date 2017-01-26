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
    private String chromeWebDriverpath1 = "c:\\D\\Online Courses\\Selenium and continoues integration\\Tools\\chromedriver.exe";
    private String chromeWebDriverpath2 = "d:\\Tal - Work Related\\myWorkspace\\chromedriver.exe";
    private String activeChromeWebDriverPath = "";
    private WebDriver driver = null;
    private String driverType = "";



    public DriverSettings(DriverType driverTypeEnum) {
        driverType = driverTypeEnum.toString();
    }

    //need this method because I use two different machines where the chromdriver is placed in different locations.
    private String getActiveChromeWebDriverPath () {

        File f = new File (chromeWebDriverpath1);
        if (f.exists()) {
            activeChromeWebDriverPath = chromeWebDriverpath1;
        }
        else{
            activeChromeWebDriverPath = chromeWebDriverpath2;
        }
        return activeChromeWebDriverPath;
    }

    public void setDriverProperties () {
        String path = getActiveChromeWebDriverPath();
        if (this.driverType == DriverType.CHROME.toString()) {
            System.setProperty("webdriver.chrome.driver", path);
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

//    public void setDriverType(String driverType) {
//        this.driverType = driverType;
//    }


}
