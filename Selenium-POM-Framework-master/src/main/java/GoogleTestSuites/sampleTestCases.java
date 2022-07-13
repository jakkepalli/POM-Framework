package GoogleTestSuites;

import GooglePages.Results;
import GooglePages.Search;
import SeleniumUtilities.TestManager;
import org.testng.ITestContext;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class sampleTestCases {
    //Set browser on which test cases are executed
    private String Browser = null;
    private TestManager manager = null;
    //Page instances
    private Search search = null;
    private Results results = null;
    //Initialize each page instances
    private void initializePages(TestManager manager) throws Exception{
        search = new Search(manager);
        results = new Results(manager);
    }

    @BeforeTest
    public void setUp(ITestContext context) throws Exception{
        Browser = context.getCurrentXmlTest().getAllParameters().get("Browser");
        manager = new TestManager(Browser);
        initializePages(manager);
    }
    @AfterTest
    public void tearDown(){
        manager.seleniumDriver.quit();
    }

    @Test
    public void SearchWithText(){
    	System.out.println("This is results class");
        manager.seleniumDriver.get(manager.testData.get("url"));
        search.searchText(manager.testData.get("searchKey"));
        results.tapOnImages();
    }

}
