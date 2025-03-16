package StepDefinition;

import Pages.AdminPage;
import Pages.HomePage;
import Pages.LoginPage;
import Utils.PropretyLoader;
import lombok.Getter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

@Getter
public class AbstractStepDef {
    protected static WebDriver driver;
    public LoginPage loginPage = new LoginPage(driver);
    public HomePage homePage = new HomePage(driver);
    public AdminPage adminPage = new AdminPage(driver);
    protected static String chromeDriver = PropretyLoader.loadProperty("chromeDriver");
    protected static String loginPageUrl = PropretyLoader.loadProperty("loginPageUrl");
    public static String excelFilePaht = PropretyLoader.loadProperty("excelFilePaht");
    public static String excelSheet = PropretyLoader.loadProperty("excelSheet");
    public Logger log = LogManager.getLogger();
}
