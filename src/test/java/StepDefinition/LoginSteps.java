package StepDefinition;

import Utils.DataKeys;
import Utils.WaitUntil;
import actions.Actions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import static Utils.ExcelUtil.*;
import static Utils.HighlightElement.highlightElement;
import static Utils.ScenarioContext.getData;
import static Utils.ScenarioContext.saveData;
import static actions.Actions.*;

public class LoginSteps extends AbstractStepDef {
    protected WaitUntil waitUntil;
    protected DataKeys dataKeys;

    @Given("^User insert (.*) username$")
    public void userInsertUsername(String username) {
        navigate(loginPageUrl);
        waitUntil.waitUntil(3);
        sendKey(loginPage.getUsernameField(), username);
        saveData(dataKeys.USERNAME, username);
        highlightElement(loginPage.getUsernameField());
        log.info("first step");
    }

    @When("^User take username from Excel$")
    public void userInsertsUsernameFromExcel() {
        Actions.navigate(loginPageUrl);
        waitUntil.waitUntil(3);
        String username = testDataFromExcelFile()[0][0].toString();
        sendKey(loginPage.getUsernameField(), username);
        saveData(dataKeys.USERNAME, username);
        highlightElement(loginPage.getUsernameField());
        log.info("get all data from excel file");
    }

    @And("User insert valid (.*)$")
    public void userInsertPassword(String password) {
        sendKey(loginPage.getPasswordField(), password);
        saveData(dataKeys.PASSWORD, password);
    }

    @When("^User take password from Excel$")
    public void userInsertsPasswordFromExcel() {
        String password = testDataFromExcelFile()[0][1].toString();
        sendKey(loginPage.getPasswordField(), password);
        saveData(dataKeys.PASSWORD, password);
    }

    @When("^User click submit$")
    public void userClickSubmit() throws InterruptedException {
        click(loginPage.getSubmitButton(), 2);
    }

    @Then("^User is redirect to the home page$")
    public void userIsRedirectToTheHomePage() throws InterruptedException {
        if (getData(DataKeys.USERNAME).equals("Admin")) {
            waitUntil.waitUntil(3);
            isDisplayed(loginPage.getTimeAtWorkText());
        } else {
            waitUntil.waitUntil(5);
            highlightElement(loginPage.getInvalidCredentials());
            waitUntil.waitUntil(2);
            isDisplayed(loginPage.getInvalidCredentials());
        }
    }
}
