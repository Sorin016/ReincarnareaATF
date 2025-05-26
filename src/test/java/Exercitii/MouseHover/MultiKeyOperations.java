package Exercitii.MouseHover;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class MultiKeyOperations {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/selectable/");
        driver.switchTo().frame(0);
        WebElement element1=driver.findElement(By.xpath("//li[text()='Item 1'] "));
        WebElement element6=driver.findElement(By.xpath("//li[text()='Item 6'] "));
        Actions action = new Actions(driver);
        action.keyDown(Keys.COMMAND).perform();
        action.click(element1).perform();
        Thread.sleep(2000);
        action.click(element6).perform();
        Thread.sleep(2000);
        driver.close();
        driver.quit();
    }
}
