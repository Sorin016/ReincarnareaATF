package Exercitii;

import java.util.Scanner;

public class varTipDeDate {
    public static void main(String[] args) {
        int a=10;
        var b=10;
        var c=a+b;
        Scanner scanner=new Scanner(System.in);
        var scan=new Scanner(System.in);
        int a1[]=new int[10];
        var b1=new int[10];
        int c1[]={1,2,3};
        int cc=add(1,2);
        var cc2=add(1,2);
        //var se foloseste doar ca variabila locala
        // nu se poate de folosit la parametii metodei
        // nu se poate de folosit ca variabila instanta
    }
    public static int add(int i,int j){
       return (i+j);
    }
}
