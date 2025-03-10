package Utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;

public class ExcelUtil {
    public static void main(String[] args) throws IOException {

            XSSFWorkbook wb = new XSSFWorkbook("Excel/e.xlsx");
            XSSFSheet sheet = wb.getSheet("Sheet1");
            System.out.println(sheet.getPhysicalNumberOfRows());

    }
}
