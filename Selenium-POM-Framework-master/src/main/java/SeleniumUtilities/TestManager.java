package SeleniumUtilities;

import Utilities.TestData;
import Variables.WebDriverConfigVars;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.Map;

public class TestManager extends TestData{

    public Map<String, String> testData = null;
    public WebDriver seleniumDriver = null;
    public WebDriverWait seleniumExplicitWait = null;

    public TestManager(String browser) throws Exception{
        this.testData = TestData.getTestData();
        this.seleniumDriver = WebDriverFactory.getWebDriver(browser);
        this.seleniumExplicitWait = new WebDriverWait(seleniumDriver, WebDriverConfigVars.explicitWaitPeiod);
    }

    public TestManager(String browser, int explicitWait, int implicitWait) throws Exception{
        this.testData = TestData.getTestData();
        this.seleniumDriver = WebDriverFactory.getWebDriver(browser, implicitWait);
        this.seleniumExplicitWait = new WebDriverWait(seleniumDriver, explicitWait);
    }
}
