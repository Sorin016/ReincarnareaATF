package Exercitii;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameParentFrame {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.dezlearn.com/nested-iframes-example/");
//
        driver.switchTo().frame("parent_iframe");
//        driver.switchTo().frame("demo_frame1");
        WebElement window = driver.findElement(By.xpath("//*[@id='iframe1']"));
        driver.switchTo().frame(window);
        driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
        Thread.sleep(2000);
        driver.switchTo().parentFrame();
        driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
        Thread.sleep(2000);
        driver.close();
        driver.quit();
    }
}
