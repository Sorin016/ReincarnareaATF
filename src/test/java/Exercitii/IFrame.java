package Exercitii;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.dezlearn.com/iframe-example/");
        driver.switchTo().frame("iframe1");
        driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
        driver.switchTo().defaultContent();
        Thread.sleep(2000);
        WebElement window=driver.findElement(By.xpath("(//*[@id='iframe1'])[2]"));
        driver.switchTo().frame(window);
        driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
        Thread.sleep(2000);
        driver.close();
        driver.quit();
    }
}
