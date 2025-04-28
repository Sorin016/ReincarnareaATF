package Exercitii.DatePicker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Class {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        String expectedMonth = "August 2025";
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.trivago.com/en-US");
        driver.findElement(By.xpath("(//span[@class='Ji89fk _61wiWy'])[1]")).click();
        String currentMunth = driver.findElement(By.xpath("//h3[@class='tODn3R xzjH7Y _9z0Y6L']")).getText();
        while (!currentMunth.contains(expectedMonth)) {
            driver.findElement(By.xpath("(//span[@class='Ji89fk' and @aria-hidden='true'])[7]")).click();
            currentMunth = driver.findElement(By.xpath("//h3[@class='tODn3R xzjH7Y _9z0Y6L']")).getText();
        }
        Thread.sleep(1000);
        List<WebElement> dates = driver.findElements(By.xpath("//button[@class='YhLeVN ujt4w6 dxMQD1']"));

        for (WebElement date : dates) {
            String zi = date.getText().trim();
            if (zi.equals("2")) {
                date.click();
                System.out.println("gasit");
                break;
            }
        }
        Thread.sleep(3000);
        driver.close();
        driver.quit();
    }
}
