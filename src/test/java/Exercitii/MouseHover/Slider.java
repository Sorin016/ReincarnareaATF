package Exercitii.MouseHover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/resources/demos/slider/colorpicker.html");
        WebElement red=driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));
        WebElement green=driver.findElement(By.xpath("(//span[@class='ui-slider-handle ui-corner-all ui-state-default'])[2]"));
        WebElement blue=driver.findElement(By.xpath("(//span[@class='ui-slider-handle ui-corner-all ui-state-default'])[3]"));
        Actions action = new Actions(driver);
        action.clickAndHold(red).moveByOffset(-45, 0).click().perform();
        action.clickAndHold(green).moveByOffset(-25, 0).click().perform();
        action.clickAndHold(blue).moveByOffset(-35, 0).click().perform();
        Thread.sleep(2000);
        driver.close();
        driver.quit();
    }
}
