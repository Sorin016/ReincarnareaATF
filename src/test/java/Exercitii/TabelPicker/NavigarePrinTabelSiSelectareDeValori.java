package Exercitii.TabelPicker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class NavigarePrinTabelSiSelectareDeValori {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.dezlearn.com/webtable-example/");
        List<WebElement> rows = driver.findElements(By.xpath("//table[@class='tg']//tr"));
        int c = 0;
        for (WebElement row : rows) {
            c++;
            if (c == 1) {
                continue;
            }
            String name = row.findElement(By.xpath(".//td[1]")).getText();
            if (name.equals("Monica Singh")) {
                row.findElement(By.xpath(".//td[4]/input")).click();
                List<WebElement> options = row.findElements(By.xpath("//tbody/tr[5]/td[5]/select[1]/option"));
                for (WebElement option : options) {
                    if (option.getText().contains("Sports")) {
                        option.click();
                        break;
                    }
                }
            }
            Thread.sleep(3000);
        }
        driver.close();
    }
}
