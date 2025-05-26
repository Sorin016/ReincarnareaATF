package Exercitii.GetElementLocatorsInPxOnPage;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class GetXandYLocatorsOfAnElement {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.goodreads.com/");
        WebElement box = driver.findElement(By.xpath("//div[@id='newAccountBox']"));
        Point p = box.getLocation();
        System.out.println(p.getX());
        System.out.println(p.getY());
        Rectangle rectangle = box.getRect();
        System.out.println(rectangle.getX());
        System.out.println(rectangle.getY());
        driver.quit();
    }
}
