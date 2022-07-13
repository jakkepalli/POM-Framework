package SeleniumUtilities;

import Variables.WebDriverConfigVars;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class WebDriverFactory extends WebDriverConfigVars {
    /***Preconditions:
     * - Create Drivers directory contains IE, gecko and chrome executable drivers.
     ***How it works?
     * 1) This class is to Create WebDriver instance based on the passed argument
     * 2) It returns Internet explorer instance when the passed argument is IE or ie
     * 3) It returns FireFox instance when the passed argument is FireFox or firefox
     * 4) Otherwise, it returns Chrome instance (The default instance)
     * 5) It maximizes the window
     * - You can add any other driver by adding its executable file in Driver directory.
     */
    public static WebDriver getWebDriver(String selectedDriver){
        WebDriver driver = null;
        if(selectedDriver.toUpperCase().equals("IE")){
            System.setProperty(IE_DRIVER, IE_DRIVER_DIR);
            driver = new InternetExplorerDriver();
        }else if(selectedDriver.toLowerCase().equals("firefox")){
            System.setProperty(FIREFOX_DRIVER, FIREFOX_DRIVER_DIR);
            driver = new FirefoxDriver();
        }else {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--lang=en-GB");
            System.setProperty(CHROME_DRIVER, CHROME_DRIVER_DIR);
            driver = new ChromeDriver(options);
        }
        driver.manage().timeouts().implicitlyWait(implicitWaitPeriod, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        return driver;
    }

    public static WebDriver getWebDriver(String selectedDriver, int implicitWait){
        WebDriver driver = null;
        if(selectedDriver.toUpperCase().equals("IE")){
            System.setProperty(IE_DRIVER, IE_DRIVER_DIR);
            driver = new InternetExplorerDriver();
        }else if(selectedDriver.toLowerCase().equals("firefox")){
            FirefoxOptions options = new FirefoxOptions();
            options.addArguments("--lang=en-GB");
            System.setProperty(FIREFOX_DRIVER, FIREFOX_DRIVER_DIR);
            driver = new FirefoxDriver(options);
        }else {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--lang=en-GB");
            System.setProperty(CHROME_DRIVER, CHROME_DRIVER_DIR);
            driver = new ChromeDriver(options);
        }
        driver.manage().timeouts().implicitlyWait(implicitWait, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        return driver;
    }
}