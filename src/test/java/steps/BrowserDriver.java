package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.UnreachableBrowserException;
import java.util.concurrent.TimeUnit;


public class BrowserDriver {
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
        } catch (UnreachableBrowserException e) {
        }
    }
	
	private static class BrowserCleanup implements Runnable {
        public void run() {
            close();
        }
    }

}

