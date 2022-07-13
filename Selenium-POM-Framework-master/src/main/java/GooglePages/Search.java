package GooglePages;

import SeleniumUtilities.TestManager;
import PageUtilities.pageInitializer;
import org.openqa.selenium.By;


public class Search extends pageInitializer {

    public Search(TestManager manager) throws Exception {
        super(manager);
    }

    public void searchText(String searchText){
    	System.out.println("This is search class");
        manager.seleniumDriver.findElement(By.xpath(pageObjects.get("inputTextField"))).sendKeys(searchText);
        manager.seleniumDriver.findElement(By.xpath(pageObjects.get("searchBtn"))).click();
    }
}
