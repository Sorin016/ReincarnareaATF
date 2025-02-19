import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.List;
public class Browser {
    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");

        WebDriver webDriver=new ChromeDriver();
        File screenshot=((TakesScreenshot)webDriver).getScreenshotAs(OutputType.FILE);

        webDriver.manage().window().maximize();
        webDriver.get("https://www.google.com");
        webDriver.findElement(By.name("q")).sendKeys("webdriver");
        Thread.sleep(2000);
        WebElement element=webDriver.findElement(By.cssSelector(".lnXdpd"));
        File screenshot1=element.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot1,new File("./imag1.png"));


        webDriver.navigate().to("https://www.youtube.com/");
        FileUtils.copyFile(screenshot,new File("./imag.png"));
        Thread.sleep(2000);
        System.out.println(webDriver.getTitle());
        System.out.println(webDriver.getCurrentUrl());
        webDriver.navigate().forward();
        webDriver.navigate().refresh();
        webDriver.switchTo().newWindow(WindowType.TAB);
        webDriver.navigate().to("https://trytestingthis.netlify.app/");
        List<WebElement> ss=webDriver.findElements(By.name("Optionwithcheck[]"));
        ss.forEach(System.out::println);
        Thread.sleep(3000);


        webDriver.quit();

    }
}
