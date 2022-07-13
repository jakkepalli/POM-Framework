package PageUtilities;

import SeleniumUtilities.TestManager;
import Utilities.uiObjects;

import java.util.HashMap;
import java.util.Map;

public class pageInitializer {

    protected Map<String, String> pageObjects = new HashMap<String, String>();
    protected TestManager manager = null;

    public pageInitializer(TestManager manager) throws Exception {
        this.pageObjects = new uiObjects(this.getClass().getSimpleName()).getUiObjects();
        this.manager = manager;
    }

}
