package Restul;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownElements {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");

        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://trytestingthis.netlify.app/");
        WebElement dropDown=webDriver.findElement(By.xpath("//select[@id='option']"));
        Select select=new Select(dropDown);
        select.selectByIndex(1);
        Thread.sleep(3000);
        select.selectByValue("option 2");
        Thread.sleep(3000);
        select.selectByVisibleText("Option 3");
        webDriver.quit();

    }
}
