package StepDefinition.Restul;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class NavigarePrinTabel {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.dezlearn.com/webtable-example/");
        List<WebElement> rows=driver.findElements(By.xpath("//table[@class='tg']//tr"));
        int c=0;
        for(WebElement row:rows){
            c++;
            if(c==1){
                continue;
            }
            System.out.println(row.findElement(By.xpath("td[1]")).getText());
            System.out.println(row.findElement(By.xpath("td[2]")).getText());
            System.out.println();
        }
        driver.quit();
        driver.close();
    }
}
