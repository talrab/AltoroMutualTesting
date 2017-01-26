package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by tal on 22/01/2017.
 */
public class SurveyWelcome {

    private WebDriver driver;
    private static WebElement element = null;

    public SurveyWelcome(WebDriver driver){
        this.driver = driver;
    }

    public static WebElement Yes(WebDriver driver){
        element = driver.findElement(By.linkText("Yes"));
        return element;
    }

    public static WebElement No(WebDriver driver){
        element = driver.findElement(By.linkText("No"));
        return element;
    }



}
