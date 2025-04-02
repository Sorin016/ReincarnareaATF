package StepDefinition;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


import java.io.IOException;

import static Utils.WaitUntil.waitUntil;
import static actions.Actions.click;
import static actions.Actions.navigate;


public class AutoItSiteSteps extends AbstractStepDef {

    @Given("User click Загрузить файлы")
    public void clickOnButton() throws IOException {
        navigate(autoItUploadFileSite);
        click(autoItPage.getFileUploadButton(),5);
        Runtime.getRuntime().exec("File/FileUploadScript.exe");
        waitUntil(4);
    }

    @Then("file is uploaded with success")
    public void fileIsUploaded() throws InterruptedException {
        click(autoItPage.getSaveFileButton(),5);
        waitUntil(10);
    }
}
