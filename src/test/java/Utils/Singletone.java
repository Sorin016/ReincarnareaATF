package Utils;

import StepDefinition.AbstractStepDef;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static Utils.AbstractLocations.SET_PROPERTY_CHROME;

public class Singletone extends AbstractStepDef {
    private static WebDriver driver = null;
    public static WebDriver getDriver() {
        if (driver == null) {
            System.setProperty(String.valueOf(SET_PROPERTY_CHROME), chromeDriver );
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
