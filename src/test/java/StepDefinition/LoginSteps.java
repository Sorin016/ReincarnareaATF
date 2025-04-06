package StepDefinition;

import Pages.LoginPage;
import actions.Actions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static Utils.DataKeys.PASSWORD;
import static Utils.DataKeys.USERNAME;
import static Utils.ExcelUtil.*;
import static Utils.HighlightElement.highlightElement;
import static Utils.ScenarioContext.getData;
import static Utils.ScenarioContext.saveData;
import static Utils.WaitUntil.waitUntil;
import static actions.Actions.*;

public class LoginSteps extends AbstractStepDef {
    public LoginPage loginPage = new LoginPage(driver);

    @Given("^User insert (.*) username$")
    public void userInsertUsername(String username) {
        navigate(loginPageUrl, driver);
        waitUntil(3);
        sendKey(loginPage.getUsernameField(), username);
        saveData(USERNAME, username);
        highlightElement(loginPage.getUsernameField());
        log.info("first step");
    }

    @When("^User take username from Excel$")
    public void userInsertsUsernameFromExcel() {
        Actions.navigate(loginPageUrl, driver);
        waitUntil(3);
        String username = testDataFromExcelFile()[0][0].toString();
        sendKey(loginPage.getUsernameField(), username);
        saveData(USERNAME, username);
        highlightElement(loginPage.getUsernameField());
        log.info("get all data from excel file");
    }

    @And("User insert valid (.*)$")
    public void userInsertPassword(String password) {
        sendKey(loginPage.getPasswordField(), password);
        saveData(PASSWORD, password);
    }

    @When("^User take password from Excel$")
    public void userInsertsPasswordFromExcel() {
        String password = testDataFromExcelFile()[0][1].toString();
        sendKey(loginPage.getPasswordField(), password);
        saveData(PASSWORD, password);
    }

    @When("^User click submit$")
    public void userClickSubmit() {
        click(loginPage.getSubmitButton(), 2);
    }

    @Then("^User is redirect to the home page$")
    public void userIsRedirectToTheHomePage() {
        if (getData(USERNAME).equals("Admin")) {
            waitUntil(3);
            isDisplayed(loginPage.getTimeAtWorkText());
        } else {
            waitUntil(5);
            highlightElement(loginPage.getInvalidCredentials());
            waitUntil(2);
            isDisplayed(loginPage.getInvalidCredentials());
        }
    }
}
