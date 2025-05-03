package Exercitii.WaitTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ExplicitWait {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.dezlearn.com/test-sync-example/");
        driver.findElement(By.name("fname")).sendKeys("sorin");
        driver.findElement(By.name("lname")).sendKeys("cuce");
        driver.findElement(By.xpath("(//input[@name='lname'])[2]")).sendKeys("sorin@cuce.com");
        driver.findElement(By.xpath("(//button[@type='button' and @id='u_5_6'])")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Go to Next Page']"))).click();
        driver.close();
        driver.quit();
    }
}
