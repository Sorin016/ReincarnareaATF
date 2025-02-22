import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropMouseActions {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");

        WebDriver webDriver = new ChromeDriver();
        webDriver.navigate().to("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
        WebElement a=webDriver.findElement(By.xpath("//li[@name='A']"));
        WebElement d=webDriver.findElement(By.xpath("//li[@name='D']"));
       Actions actions=new Actions(webDriver);
        actions.clickAndHold(a);
        actions.moveToElement(d);
//        actions.click(a);
////        actions.moveToElement(d);
        actions.clickAndHold(d);
        actions.moveToElement(a);
        actions.click(a);
        actions.build().perform();

        Thread.sleep(3000);
        webDriver.navigate().to("https://selenium08.blogspot.com/2020/01/drag-drop.html");
        WebElement drag=webDriver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement drop=webDriver.findElement(By.xpath("//div[@id='droppable']"));

        actions.dragAndDrop(drag,drop).build().perform();
        Thread.sleep(3000);

        webDriver.quit();
    }
}
