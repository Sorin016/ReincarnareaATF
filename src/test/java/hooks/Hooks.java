package hooks;

import StepDefinition.AbstractStepDef;
import Utils.ExcelUtil;
import Utils.Singletone;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import lombok.extern.slf4j.Slf4j;

import static Utils.ExcelUtil.testDataFromExcelFile;
import static actions.Actions.takeScreenshot;

@Slf4j
public class Hooks extends AbstractStepDef {
    @Before("@UI")
    public void beforeUITest() {
        driver = Singletone.getDriver();
    }

    @After("@UI")
    public void afterUITest() {
        Singletone.closeDriver();
    }

    @AfterStep("@UI")
    public void takeScreenShot(Scenario scenario) {
        log.info("take a screenshot before steps");
        takeScreenshot(scenario);
    }

    @Before("@Excel")
    public void startExcel() {
        log.info("start connection to Excel file");
        new ExcelUtil().connectioToExcelFile();
        testDataFromExcelFile();
    }
}
