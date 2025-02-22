import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.*;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

public class Browser {
    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");

        WebDriver webDriver = new ChromeDriver();
        File screenshot = ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.FILE);

        webDriver.manage().window().maximize();
//        webDriver.get("https://www.google.com");
//        webDriver.findElement(By.name("q")).sendKeys("webdriver");
//        Thread.sleep(2000);
//        WebElement element=webDriver.findElement(By.cssSelector(".lnXdpd"));
//        File screenshot1=element.getScreenshotAs(OutputType.FILE);
//        FileUtils.copyFile(screenshot1,new File("./imag1.png"));
//
//
//        webDriver.navigate().to("https://www.youtube.com/");
//        FileUtils.copyFile(screenshot,new File("./imag.png"));
//        Thread.sleep(2000);
//        System.out.println(webDriver.getTitle());
//        System.out.println(webDriver.getCurrentUrl());
//        webDriver.navigate().forward();
//        webDriver.navigate().refresh();
//        webDriver.switchTo().newWindow(WindowType.TAB);
//        webDriver.navigate().to("https://trytestingthis.netlify.app/");
//        List<WebElement> ss=webDriver.findElements(By.name("Optionwithcheck[]"));
//        ss.forEach(System.out::println);
//        Thread.sleep(3000);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        webDriver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        // WebElement login = webDriver.findElement(By.xpath("//button[@type='submit']"));
        WebDriverWait webDriverWait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=' Login ']")));
        webDriver.findElement(By.xpath("//*[text()=' Login ']")).click();
        //  webDriver.findElement(RelativeLocator.with(By.tagName("input")).above(login)).sendKeys("12334");

        Wait<WebDriver> fluentWaint = new FluentWait<WebDriver>(webDriver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class);
        fluentWaint.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[text()='Required'])[1]")));


        webDriver.quit();

    }
}
