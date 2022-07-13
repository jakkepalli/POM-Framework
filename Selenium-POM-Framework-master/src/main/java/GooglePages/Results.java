package GooglePages;

import SeleniumUtilities.TestManager;
import PageUtilities.pageInitializer;
import org.openqa.selenium.By;

public class Results extends pageInitializer {

    public Results(TestManager manager) throws Exception{
        super(manager);
    }

    public void tapOnImages(){
    	System.out.println("This is results class");
        manager.seleniumDriver.findElement(By.xpath(pageObjects.get("imagesResults"))).click();
    }
}
