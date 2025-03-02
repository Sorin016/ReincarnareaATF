package StepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static Utils.DataKeys.PASSWORD;
import static Utils.DataKeys.USERNAME;
import static Utils.HighlightElement.highlightElement;
import static Utils.ScenarioContext.getData;
import static Utils.ScenarioContext.saveData;
import static Utils.WaitUntil.waitUntil;
import static actions.Actions.*;

public class LoginSteps extends AbstractStepDef {

    @When("^User inserts (.*)$")
    public void user_insert_username(String username){
        navigate(loginPageUrl);
        waitUntil(3);
        sendKey(loginPage.getUsernameField(), username);
        saveData(USERNAME, username);
        highlightElement(loginPage.getUsernameField());
    }

    @When("^User insert (.*)$")
    public void user_insert_password(String password) {
        sendKey(loginPage.getPasswordField(), password);
        saveData(PASSWORD, password);
    }

    @When("User click submit")
    public void user_click_submit() throws InterruptedException {
        click(loginPage.getSubmitButton(), 2);
    }

    @Then("User is redirect to the home page")
    public void user_is_redirect_to_the_home_page() throws InterruptedException {
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
