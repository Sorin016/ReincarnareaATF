package hooks;

import StepDefinition.AbstractStepDef;
import Utils.Singletone;
import io.cucumber.java.After;
import io.cucumber.java.Before;


public class Hooks extends AbstractStepDef {
    @Before("@UI")
    public void beforeUITest() {
      driver=Singletone.getDriver();
    }

    @After("@UI")
    public void afterUITest() {
     Singletone.closeDriver();
    }
}
