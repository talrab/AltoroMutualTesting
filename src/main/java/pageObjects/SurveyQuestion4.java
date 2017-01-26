package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by tal on 22/01/2017.
 */
public class SurveyQuestion4 {

    private WebDriver driver;
    private static WebElement element = null;

    public SurveyQuestion4(WebDriver driver){
        this.driver = driver;
    }

    public static WebElement firstAnswer(WebDriver driver){
        element = driver.findElement(By.linkText("Yes"));
        return element;
    }



}
