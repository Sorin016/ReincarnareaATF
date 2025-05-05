package Exercitii;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class TakeASpecificZoneScreenshot {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.goodreads.com/");
        WebElement box=driver.findElement(By.xpath("//div[@id='newAccountBox']"));
        File file=box.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file,new File("src/test/java/Exercitii/screenshot/file.png"));
        driver.quit();
    }
}
