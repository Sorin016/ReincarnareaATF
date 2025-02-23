package StepDefinition;

import Utils.Singletone;
import io.cucumber.java.Before;
import io.cucumber.java.After;

public class Hooks {

    @Before
    public void setUp() {
        // Initialize WebDriver before each scenario
        Singletone.getDriver();
    }

    @After
    public void tearDown() {
        // Close the WebDriver after each scenario
        Singletone.closeDriver();
    }
}
