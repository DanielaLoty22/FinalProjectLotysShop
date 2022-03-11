package Base;

import PropertiesUtility.PropertiesObject;
import org.junit.After;
import org.junit.Before;


import java.util.HashMap;

public class Hooks extends ShareData {

    public HashMap<String, String> inputData;

    @Before
    public void prepareEnvironment() {
        InitializeDriver();
        String className = this.getClass().getSimpleName();
        PropertiesObject testData = new PropertiesObject("testsResources/" + className + "Resources");
        inputData = testData.getAllKeyValues();
    }

    @After
    public void clearEnvironment() {
        tearDown();
    }

}

