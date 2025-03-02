package actions;

import StepDefinition.AbstractStepDef;
import io.cucumber.java.an.E;
import org.openqa.selenium.WebElement;

public class Actions extends AbstractStepDef {

    public static void isDisplayed(WebElement element) {
        element.isDisplayed();
    }

    public static void sendKey(WebElement element, String value) {
        element.sendKeys(value);
    }

    public static void click(WebElement element, Integer timeToWaitInSeconds) {
        try {
            Thread.sleep(timeToWaitInSeconds * 1000);
            element.click();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void navigate(String navigateTo) {
        driver.get(navigateTo);
    }
}
