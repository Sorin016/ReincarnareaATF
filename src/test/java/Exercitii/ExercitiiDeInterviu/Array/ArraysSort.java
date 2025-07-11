package Exercitii.ExercitiiDeInterviu.Array;

import org.apache.logging.log4j.util.PropertySource;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ArraysSort {
    public static void main(String[] args) {
        Integer a[]={1,22,3,3,12,3,53,5,2};
        Arrays.sort(a,Collections.reverseOrder());
        //ca sa faci reverse order a trebue sa fie de Non- primitiv
      //  Arrays.sort(a,Comparator.reverseOrder());
        int index = Arrays.binarySearch(a, 2);
        for(int i=0;i<a.length;i++){
           System.out.print(a[i]+" ");
       }
        System.out.println(index);
    }
}
