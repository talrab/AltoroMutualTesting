package pageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by tal on 22/01/2017.
 */
public class WelcomePage {
    private WebDriver driver;
    private static WebElement element;

    public WelcomePage (WebDriver driver){
        this.driver = driver;
    }

    public static  WebElement listAccounts (WebDriver driver){
        element = driver.findElement(By.id("listAccounts"));
        return element;
    }

    public static WebElement listAccountsGoButton(WebDriver driver) {
        element = driver.findElement(By.id("btnGetAccount"));
        return element;
    }

    public static void selectAccount (WebDriver driver, String account){
        Select select = new Select(driver.findElement(By.id("listAccounts")));
        select.selectByVisibleText(account);
    }

    public static WebElement transferFunds (WebDriver driver) {
        element = driver.findElement(By.id("_ctl0__ctl0_Content_MenuHyperLink3"));
        return element;
    }






}
