package Exercitii.Excell;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;

public class CitereTotDinFieier {
    public static void main(String[] args) {
        File file = new File("Excel/Fisier.xlsx");
        XSSFWorkbook workbook;
        XSSFSheet sheet;
        try {
            FileInputStream excel = new FileInputStream(file);
            workbook = new XSSFWorkbook(excel);
            sheet = workbook.getSheet("Sheet1");
            int start = sheet.getFirstRowNum();
            int end = sheet.getLastRowNum();
            for (int i = start + 1; i <= end; i++) {
                System.out.print(sheet.getRow(i).getCell(0).getStringCellValue() + " \t");
                System.out.print(sheet.getRow(i).getCell(1).getStringCellValue() + " \t");
                System.out.print(sheet.getRow(i).getCell(2).getNumericCellValue() + " \t");
                System.out.println(sheet.getRow(i).getCell(3).getLocalDateTimeCellValue() + " \t");
            }
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }
}
