package StepDefinition;

import Pages.AutoItPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

import java.io.IOException;

import static Utils.WaitUntil.waitUntil;
import static actions.Actions.click;
import static actions.Actions.navigate;

public class AutoItSiteSteps extends AbstractStepDef {
    static Process pr;
    @Given("User click Загрузить файлы")
    public void clickOnButton() throws IOException {
        navigate(autoItUploadFileSite, driver);
        click(autoItPage.getFileUploadButton(), 5);
        Runtime rt = Runtime.getRuntime();
        pr = rt.exec("File/FileUploadScript.exe");
        waitUntil(4);
    }

    @Then("file is uploaded with success")
    public void fileIsUploaded() {
        click(autoItPage.getSaveFileButton(), 5);
        waitUntil(10);
        assertThat(autoItPage.getConfiramtionText().getText(),
                containsString("Отправьте ссылку доступа по э-почте:"));
        pr.destroy();
    }
}
