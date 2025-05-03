package Exercitii;

import java.util.Scanner;

public class Test {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        int sumaT=0,sumaDD=0,sumaDS=0,sumaOriz=0,sumaVer=0;
        int a[][]=new int[n][m];
        for(int i=0;i< a.length;i++){
            for(int j=0;j<a.length;j++){
                a[i][j]=scanner.nextInt();
            }
        }
        for(int i=0;i< a.length;i++){
            for(int j=0;j<a.length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
               if(a[i]==a[j])
               sumaDS+=a[i][j];
            }
        }
        for(int i=0;i<a.length;i++)
            sumaOriz+=a[0][i];
        for(int i=0;i<a.length;i++)
            sumaDD+=a[i][m-i-1];
        for(int i=0;i<a.length;i++)
            sumaVer+=a[i][0];

        System.out.println(sumaT);
        System.out.println(sumaOriz);
        System.out.println(sumaDS);
        System.out.println(sumaDD);
        System.out.println(sumaVer);

    }
}