package Exercitii.ExercitiiDeInterviu.Array;

import java.util.Arrays;

public class ArraysCoppy {
    public static void main(String[] args) {
        int a[][]=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        int b[][]=Arrays.copyOf(a,a.length);
        int c[][]=Arrays.copyOfRange(a,0,2);
        System.out.println(Arrays.deepEquals(a,b));
        System.out.println(Arrays.deepEquals(a,c));
    }
}
