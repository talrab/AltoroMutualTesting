package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by tal on 22/01/2017.
 */
public class SurveyComplete {

    private WebDriver driver;
    private static WebElement element = null;

    public SurveyComplete(WebDriver driver){
        this.driver = driver;
    }

    public static WebElement textBox(WebDriver driver){
        element = driver.findElement(By.name("txtEmail"));
        return element;
    }

    public static WebElement submitButton(WebDriver driver){
        element = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[2]/td[2]/div/span/form/div/input[2]"));
        return element;
    }



}
