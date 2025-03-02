package Restul;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.time.Duration;

public class Alerts {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");

        WebDriver webDriver = new ChromeDriver();
        File screenshot = ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.FILE);

        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        webDriver.manage().window().maximize();
        webDriver.get("https://the-internet.herokuapp.com/javascript_alerts");
        webDriver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
        Alert alerts =webDriver.switchTo().alert();
        System.out.println(alerts.getText());
        alerts.accept();
        if(webDriver.getPageSource().contains("You successfully clicked an alert")){
            System.out.println("success");}
        else {
            System.out.println("LOHHHHHHHHHHHHH");
        }

        webDriver.findElement(By.xpath("//li//button[text()='Click for JS Confirm']")).click();
        Alert alertsConfirm =webDriver.switchTo().alert();


        webDriver.quit();
    }
}
