package Exercitii.MouseHover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MousesHover {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.dezlearn.com");
        Actions action=new Actions(driver);
        WebElement Certifications=driver.findElement(By.xpath("//a[text()='Certifications']"));
        action.moveToElement(Certifications).perform();
        driver.findElement(By.xpath("//a[text()='Cucumber BDD Automation Certification']")).click();
        Thread.sleep(2000);
        driver.close();
        driver.quit();
    }
}
