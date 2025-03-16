package Utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static StepDefinition.AbstractStepDef.excelFilePaht;
import static StepDefinition.AbstractStepDef.excelSheet;

public class ExcelUtil {
    static XSSFSheet sheet;
    WebDriver driver;

    //    public static void main(String[] args) throws IOException {
//        System.out.println(sheet.getPhysicalNumberOfRows());
//        String nume = sheet.getRow(0).getCell(0).getStringCellValue();
//        String prenume = sheet.getRow(0).getCell(1).getStringCellValue();
//        double numeValue = sheet.getRow(1).getCell(1).getNumericCellValue();
//        String prenumeValue = sheet.getRow(1).getCell(0).getStringCellValue();
//        System.out.println(nume);
//        System.out.println(numeValue);
//        System.out.println(prenume);
//        System.out.println(prenumeValue);
//    }
    @DataProvider(name = "testData1")
    public static Object[][] getDataFromExcelFIle() {
        Object[][] data = testDataFromExcelFile();
        return data;
    }

    @BeforeTest
    public void beforeUITest() {
        WebDriver driver = Singletone.getDriver();
        this.driver = driver;
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        connectioToExcelFile();
    }

    @Test(dataProvider = "getDataFromExcelFIle")
    public void startTesti1(String nume, String prenume) {
        driver.findElement(By.name("username")).sendKeys(nume);
    }

    public static Object[][] testDataFromExcelFile() {
        Object data[][] = new Object[getRowCount() - 1][getColoumCount()];
        for (int i = 1; i < getRowCount(); i++) {
            for (int j = 0; j < getColoumCount(); j++) {
                String cellData = getCellData(i, j);
                data[i - 1][j] = cellData;
            }
        }
        return data;
    }

    public static int getColoumCount() {
        return sheet.getRow(0).getPhysicalNumberOfCells();
    }

    public static int getRowCount() {
        return sheet.getPhysicalNumberOfRows();
    }

    public static String getCellData(int rowNumber, int colNumber) {
        return sheet.getRow(rowNumber).getCell(colNumber).getStringCellValue();
    }

    public void connectioToExcelFile() {
        try {
            XSSFWorkbook wb = new XSSFWorkbook(excelFilePaht);
            this.sheet = wb.getSheet(excelSheet);
        } catch (Exception e) {
            System.out.println(e.getCause());
        }
    }
}
