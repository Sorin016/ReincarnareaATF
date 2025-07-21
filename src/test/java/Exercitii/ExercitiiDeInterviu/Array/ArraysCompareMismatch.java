package Exercitii.ExercitiiDeInterviu.Array;

import java.util.Arrays;

public class ArraysCompareMismatch {
    public static void main(String[] args) {
        int a[]={1,2,3,4};
        int b[]={1,2,3,5};
        System.out.println(Arrays.compare(a,b));
        System.out.println(Arrays.mismatch(a,b));
    }
}
