package Restul;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.List;

public class UiElements {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");

        WebDriver webDriver = new ChromeDriver();
        File screenshot = ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.FILE);
        webDriver.manage().window().maximize();
        webDriver.get("https://trytestingthis.netlify.app/");
        List<WebElement> element = webDriver.findElements(By.xpath("//select[@name='Optionwithcheck[]']"));
        for (WebElement element1 : element)
            System.out.println(element1.getText());

        webDriver.quit();
    }
}
