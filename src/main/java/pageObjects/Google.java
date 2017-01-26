package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by tal on 17/01/2017.
 */
public class Google {

    private WebDriver driver;
    private String baseURL;
    private static WebElement element = null;

    public Google(WebDriver driver) {
        this.driver = driver;
        baseURL = "https://www.google.com/";
        driver.get(baseURL + "?gws_rd=cr,ssl&ei=qZlNVpOUMNCauQS0iYmoCA&fg=1");
        System.out.println(driver.getTitle());
        // if (!driver.getTitle().equals("Google")){
        //    throw new WrongPageException("Incorrect page for Google Home page");
    }

    public static WebElement searchBox(WebDriver driver) {
        element = driver.findElement(By.id("lst-ib"));
        return element;
    }

    public static WebElement searchButton(WebDriver driver) {
        element = driver.findElement(By.name("btnK"));
        return element;
    }
}
