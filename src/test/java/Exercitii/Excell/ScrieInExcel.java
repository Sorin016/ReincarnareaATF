package Exercitii.Excell;

import StepDefinition.AbstractStepDef;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

public class ScrieInExcel {
@Test
    public void spun() throws InterruptedException {
    System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
         WebDriver driver=new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(8000);
     
        Thread.sleep(3000);
    }
    public static void main(String[] args) {
        File file = new File("Excel/WriteFisier.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Sheet1");
        Row row;
        Cell cell;

        for (int i = 0; i < 10; i++) {
            row = sheet.createRow(i);
            for (int j = 0; j < 10; j++) {
                cell = row.createCell(j);
                cell.setCellValue((i + 1) * (j + 1));
            }
        }
        try {
            FileOutputStream excel = new FileOutputStream(file);
            workbook.write(excel);
            excel.close();
            workbook.close();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }
}
