package Exercitii.RestulMaiCOmplicat;

import org.apache.commons.io.FileUtils;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class FileIOApacheCommonsIO {
    @Test
    public void run() throws IOException {
        File file=new File("FileForIO_ApacheCommonsIO/Salut.txt");
        String x= FileUtils.readFileToString(file,"UTF-8");
        System.out.println(x);
    }
    @Test
    public void run1() throws IOException {
        //adauga la ce este in fisier
        File file=new File("FileForIO_ApacheCommonsIO/Salut.txt");
        FileUtils.write(file,"este viata frumoasa","UTF-8",true);
    }
    @Test
    public void run2() throws IOException {
        //sterge tot si insereaza doar ce ii dai
        File file=new File("FileForIO_ApacheCommonsIO/Salut.txt");
        FileUtils.write(file,"este viata frumoasa 2","UTF-8",false);

    }
}
