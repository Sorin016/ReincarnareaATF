package Exercitii.ExercitiiDeInterviu.Array;

import java.util.Arrays;

public class ArraysCompare {
    public static void main(String[] args) {
        Integer a[]={1,22,3,3,12,3,53,5,2};
        Integer b[]={1,22,3,3,12,3,53,5,2};
        System.out.println(Arrays.equals(a,b));
        int as[][]=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        int bs[][]=new int[][]{{1,2,3},{4,5,6},{7,8,8}};
        System.out.println(Arrays.deepEquals(as,bs));
    }
}
