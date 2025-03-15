package Utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;

public class ExcelUtil {
    public static void main(String[] args) throws IOException {

        XSSFWorkbook wb = new XSSFWorkbook("Excel/e.xlsx");
        XSSFSheet sheet = wb.getSheet("Sheet1");
        System.out.println(sheet.getPhysicalNumberOfRows());
        String nume = sheet.getRow(0).getCell(0).getStringCellValue();
        String prenume = sheet.getRow(0).getCell(1).getStringCellValue();
        double numeValue = sheet.getRow(1).getCell(1).getNumericCellValue();
        String prenumeValue = sheet.getRow(1).getCell(0).getStringCellValue();
        System.out.println(nume);
        System.out.println(numeValue);
        System.out.println(prenume);
        System.out.println(prenumeValue);

    }
}
