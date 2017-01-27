package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.UnreachableBrowserException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class BrowserDriver {
	//private static final Logger LOGGER = Logger.getLogger(BrowserDriver.class.getName());
	private static WebDriver mDriver;
    private static String chromeWebDriverpath = "d:\\Tal - Work Related\\myWorkspace\\chromedriver.exe";
	
	public synchronized static WebDriver getCurrentDriver() {
		if (mDriver==null) {
			try {
                System.setProperty("webdriver.chrome.driver", chromeWebDriverpath);
                mDriver = new ChromeDriver();
                mDriver.manage().window().maximize();
                mDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        }
	        catch (UnreachableBrowserException e) {}
	        catch (WebDriverException e) {}
            finally{
	        	Runtime.getRuntime().addShutdownHook(new Thread(new BrowserCleanup()));
	        }
		}
        return mDriver;
    }
	
	public static void close() {
        try {
            getCurrentDriver().quit();
            mDriver = null;
            //LOGGER.info("closing the browser");
        } catch (UnreachableBrowserException e) {
           // LOGGER.info("cannot close browser: unreachable browser");
        }
    }
	
	private static class BrowserCleanup implements Runnable {
        public void run() {
            close();
        }
    }
	
//	public static void loadPage(String url){
//		getCurrentDriver();
//        LOGGER.info("Directing browser to:" + url);
//        LOGGER.info("try to loadPage [" + url + "]");
//        getCurrentDriver().get(url);
//	}
	
//	public static void reopenAndLoadPage(String url) {
//        mDriver = null;
//        getCurrentDriver();
//        loadPage(url);
//    }
	
//	public static WebElement waitForElement(WebElement elementToWaitFor){
//		return waitForElement(elementToWaitFor, null);
//	}
	
//	public static WebElement waitForElement(WebElement elementToWaitFor, Integer waitTimeInSeconds) {
//	    if (waitTimeInSeconds == null) {
//	    	waitTimeInSeconds = 10;
//	    }
//
//	    WebDriverWait wait = new WebDriverWait(getCurrentDriver(), waitTimeInSeconds);
//	    return wait.until(ExpectedConditions.visibilityOf(elementToWaitFor));
//	}
	
//    public static WebElement getParent(WebElement element) {
//        return element.findElement(By.xpath(".."));
//    }
//
//    public static List<WebElement> getDropDownOptions(WebElement webElement) {
//        Select select = new Select(webElement);
//        return select.getOptions();
//    }
    
//    public static WebElement getDropDownOption(WebElement webElement, String value) {
//    	WebElement option = null;
//        List<WebElement> options = getDropDownOptions(webElement);
//        for (WebElement element : options) {
//            if (element.getAttribute("value").equalsIgnoreCase(value)) {
//                option = element;
//                break;
//            }
//        }
//        return option;
//    }
}

