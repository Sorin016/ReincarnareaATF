package Exercitii.ExercitiiDeInterviu.Array;

import java.util.Arrays;

public class ArraysFill {
    public static void main(String[] args) {
        int b[]=new int[4];
        Arrays.fill(b,0,4,9);
        for(int i=0;i<4;i++){
                System.out.print(b[i]+" ");
            }
            System.out.println();
    }
}
