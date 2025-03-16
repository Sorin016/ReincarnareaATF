package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import java.util.ArrayList;
import java.util.List;

import static Utils.WaitUntil.waitUntil;
import static actions.Actions.click;

public class HomeSteps extends AbstractStepDef {
    @When("^User navigate to (.*) page$")
    public void userClickOnPage(String page) {
        click(homePage.getAdminLink(), 2);
        waitUntil(4);
        log.info("first home page setp");
    }

    @When("User check save and check all the users inside the table")
    public void userCheckTheUsers() {
        List<String> tableList = new ArrayList<>();
//       List<WebElement> table=driver.findElements((By) adminPage.getTableWithAllUsers());
        log.info("second hi");
    }
}
