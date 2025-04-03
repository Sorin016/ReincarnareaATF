package StepDefinition;

import Pages.AdminPage;
import Pages.AutoItPage;
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
    public AutoItPage autoItPage = new AutoItPage(driver);
    protected static String chromeDriver = PropretyLoader.loadProperty("chromeDriver");
    protected static String loginPageUrl = PropretyLoader.loadProperty("loginPageUrl");
    public static String excelFilePaht = PropretyLoader.loadProperty("excelFilePaht");
    public static String excelSheet = PropretyLoader.loadProperty("excelSheet");
    public static String autoItUploadFileSite = PropretyLoader.loadProperty("autoItUploadFileSite");
    public static String restAssuredBaseURL = PropretyLoader.loadProperty("restAssuredBaseURL");
    public Logger log = LogManager.getLogger();
}
