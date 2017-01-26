package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by tal on 22/01/2017.
 */
public class LoginPage {
    private WebDriver driver;
    private static WebElement element;

    public LoginPage (WebDriver driver){
        this.driver = driver;
    }

    public static void setUserName (WebDriver driver, String username){
        driver.findElement(By.id("uid")).sendKeys(username);
    }

    public static void setPassword (WebDriver driver, String password){
        driver.findElement(By.id("passw")).sendKeys(password);
    }

    public static WebElement loginButton (WebDriver driver){
        element = driver.findElement(By.name("btnSubmit"));
        return element;
    }

}
