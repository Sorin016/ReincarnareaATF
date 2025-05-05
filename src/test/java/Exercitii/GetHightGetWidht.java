package Exercitii;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;

public class GetHightGetWidht {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.goodreads.com/");
        WebElement box = driver.findElement(By.xpath("//div[@id='newAccountBox']"));
        Dimension dimension = box.getSize();
        System.out.println(dimension.getHeight());
        System.out.println(dimension.getWidth());
        Rectangle dimension1 = box.getRect();
        System.out.println(dimension1.getHeight());
        System.out.println(dimension1.getWidth());
        driver.quit();
    }
}
