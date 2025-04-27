package Exercitii.Excell;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;

public class ScrieInExcel {
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
