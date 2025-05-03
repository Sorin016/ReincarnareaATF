package Exercitii.RestulMaiCOmplicat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class SwitchWindowInBrowser {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/r.php?entry_point=login");
        driver.findElement(By.xpath("//a[text()='Privacy Policy']")).click();
        String currentWindow = driver.getWindowHandle();
        Set<String> windows = driver.getWindowHandles();
        for (String window : windows) {
            if(!window.equals(currentWindow)){
                driver.switchTo().window(window);
            }
        }
        driver.findElement(By.xpath("//span[text()='Privacy Center']")).isDisplayed();
        Thread.sleep(3000);
        driver.switchTo().window(currentWindow);
        Thread.sleep(3000);
        driver.close();
        driver.quit();
    }
}
