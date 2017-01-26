package pageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by tal on 22/01/2017.
 */
public class AdminWelcomePage extends WelcomePage {
    private WebDriver driver;
    private static WebElement element;

    public AdminWelcomePage(WebDriver driver){
        super(driver);
        this.driver = driver;
    }

    public static WebElement administrationSectionHeader(WebDriver driver) {
        element = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[2]/td[1]/span/b"));
        return element;
    }

    public static WebElement viewApplicationValuesLink(WebDriver driver) {
        element = driver.findElement(By.linkText("View Application Values"));
        return element;
    }

    public static WebElement editUsersLink(WebDriver driver) {
        element = driver.findElement(By.linkText("Edit Users"));
        return element;
    }





}
