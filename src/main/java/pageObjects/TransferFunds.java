package pageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by tal on 22/01/2017.
 */
public class TransferFunds {
    private WebDriver driver;
    private static WebElement element;

    public TransferFunds(WebDriver driver){
        this.driver = driver;
    }

    public static  WebElement listAccounts (WebDriver driver){
        element = driver.findElement(By.id("listAccounts"));
        return element;
    }

    public static  WebElement fromAccount (WebDriver driver){
        element = driver.findElement(By.id("debitAccount"));
        return element;
    }

    public static  WebElement toAccount (WebDriver driver){
        element = driver.findElement(By.id("creditAccount"));
        return element;
    }

    public static  WebElement amountToTransfer (WebDriver driver){
        element = driver.findElement(By.id("transferAmount"));
        return element;
    }

    public static  WebElement transferMoneyButton (WebDriver driver){
        element = driver.findElement(By.id("transfer"));
        return element;
    }

    public static  WebElement transferResult (WebDriver driver){
        element = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[2]/td[2]/div/form/table/tbody/tr[6]/td/span[2]/span"));
        return element;
    }




}
