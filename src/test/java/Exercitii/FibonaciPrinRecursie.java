package Exercitii;

import java.util.Scanner;

public class FibonaciPrinRecursie {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.println(fiboReturneazaNr(n));
        for(int i=0;i<n;i++)
            System.out.print(fiboSirDeCaractere(i)+" ");
    }
    public static int fiboReturneazaNr(int n){
        if(n<0 || n==0) {
            return 0;
        }
        else if(n==1)
            return 1;
        return fiboReturneazaNr(n-1)+fiboReturneazaNr(n-2);
    }
    public static int fiboSirDeCaractere(int n){
        if(n<=0)
            return 0;
        else if(n==1)
            return 1;
        return fiboSirDeCaractere(n-1)+fiboSirDeCaractere(n-2);
    }
}

