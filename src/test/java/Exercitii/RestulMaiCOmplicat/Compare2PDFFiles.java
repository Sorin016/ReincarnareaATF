package Exercitii.RestulMaiCOmplicat;

import de.redsix.pdfcompare.PdfComparator;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.io.IOException;

@Slf4j
public class Compare2PDFFiles {
    @Test
    public void compare2PDFFiles() throws IOException {
        String file1="PDFCompareFiles/actual.pdf";
        String file2="PDFCompareFiles/expected.pdf";
        String result="PDFCompareFiles/Result/result";
        String ignoreFile="PDFCompareFiles/ignore.conf";
        new PdfComparator(file1, file2).withIgnore(ignoreFile).compare().writeTo(result);
        System.out.println("sucess");
    }
}
