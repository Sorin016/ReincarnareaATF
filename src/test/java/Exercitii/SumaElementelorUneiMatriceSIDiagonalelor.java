package Exercitii;

import java.util.Scanner;

public class SumaElementelorUneiMatriceSIDiagonalelor {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("dati numarul elementelor pe verticala i");
        int n=scanner.nextInt();
        System.out.println("dati numarul elementelor pe orizontala j");
        int m=scanner.nextInt();
        int a[][]=new int[n][m];
        int sumaTotala=0,sumaPeOrizontala=0,sumaPeVerticala=0,
        sumaPeDeagonalaDinStinga=0,sumaPeDeagonalaDinDreapta=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                a[i][j]=scanner.nextInt();

            }
        }
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                sumaTotala+=a[i][j];
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("suma totala "+sumaTotala);

        for(int i=0;i<a.length;i++){
            sumaPeOrizontala+=a[0][i];
        }
        for(int i=0;i<a.length;i++){
            sumaPeVerticala+=a[i][0];
        }
        System.out.println("suma pe verticala "+sumaPeVerticala);

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                if(a[i]==a[j])
                sumaPeDeagonalaDinStinga+=a[i][j];
            }
        }
        System.out.println("suma pe diagonala din stinga "+sumaPeDeagonalaDinStinga);

        for(int i=0;i<a.length;i++){
            sumaPeDeagonalaDinDreapta+=a[i][m-i-1];
        }
        System.out.println("suma pe diagonala din dreapta "+sumaPeDeagonalaDinDreapta);
    }
}
