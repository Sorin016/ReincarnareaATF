package StepDefinition;

import Pages.LoginPage;
import lombok.Getter;
import org.openqa.selenium.WebDriver;

@Getter
public class AbstractStepDef {
    protected static WebDriver driver;
    public LoginPage loginPage = new LoginPage(driver);
}
