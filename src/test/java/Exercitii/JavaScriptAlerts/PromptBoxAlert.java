package Exercitii.JavaScriptAlerts;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptBoxAlert {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
        driver.get("https://www.dezlearn.com/javascript-alerts/");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement promptBoxAlert = driver.findElement(By.xpath("//button[@id='p_alert3']"));
        js.executeScript("window.scrollTo(0, document.body.scrollHeight / 2);");
        promptBoxAlert.click();
        Thread.sleep(2000);
        Alert simpleAlert = driver.switchTo().alert();
        System.out.println(simpleAlert.getText());
        simpleAlert.sendKeys("Sorin");
        Thread.sleep(2000);
        simpleAlert.accept();
        Thread.sleep(2000);
        driver.close();
        driver.quit();
    }
}
