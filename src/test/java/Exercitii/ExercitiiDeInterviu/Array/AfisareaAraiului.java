package Exercitii.ExercitiiDeInterviu.Array;

import java.util.Arrays;

public class AfisareaAraiului {
    public static void main(String[] args) {
        int a[][]=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        //for clasic
        System.out.println("for clasic");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("for each");
        for(int c[]:a){
            for(int b:c){
                System.out.print(b+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("prin metoda de la Arrays");
        System.out.print(Arrays.deepToString(a));
        System.out.println();
        //pentru simplu array poti folosi asta ca afisare
        Integer as[]=new Integer[] {1,2,3,4};
        System.out.println(Arrays.deepToString(as));

    }
}
