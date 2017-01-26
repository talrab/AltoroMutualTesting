package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
/**
 * Created by tal on 22/01/2017.
 */
public class DemoTestfireNet {

    private WebDriver driver;
    private static WebElement element = null;

    public DemoTestfireNet(WebDriver driver){
        this.driver = driver;
    }

    public static WebElement signIn(WebDriver driver){
        element = driver.findElement(By.id("_ctl0__ctl0_LoginLink"));
        return element;
    }



}
