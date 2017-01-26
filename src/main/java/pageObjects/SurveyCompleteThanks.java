package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by tal on 22/01/2017.
 */
public class SurveyCompleteThanks {

    private WebDriver driver;
    private static WebElement element = null;

    public SurveyCompleteThanks(WebDriver driver){
        this.driver = driver;
    }

    public static WebElement reflectedEmail(WebDriver driver){
        element = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[2]/td[2]/div/span/p/b"));
        return element;
    }





}
