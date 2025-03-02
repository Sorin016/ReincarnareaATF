package StepDefinition;

import Pages.LoginPage;
import Utils.PropretyLoader;
import lombok.Getter;
import org.openqa.selenium.WebDriver;

@Getter
public class AbstractStepDef {
    protected static WebDriver driver;
    public LoginPage loginPage = new LoginPage(driver);
    protected static String chromeDriver = PropretyLoader.loadProperty("chromeDriver");
    protected static String loginPageUrl = PropretyLoader.loadProperty("loginPageUrl");
}
