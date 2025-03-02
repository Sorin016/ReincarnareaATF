package Utils;

import StepDefinition.AbstractStepDef;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Singletone extends AbstractStepDef {
    private static WebDriver driver = null;
    private static final String SET_PROPERTY_CHROME = "webdriver.chrome.driver";

    public static WebDriver getDriver() {
        if (driver == null) {
            System.setProperty(SET_PROPERTY_CHROME, chromeDriver );
            driver = new ChromeDriver();
        }
        return driver;
    }

    public static void closeDriver() {
        if (driver != null) {
            driver.close();
            driver.quit();
            driver = null;
        }
    }
}
