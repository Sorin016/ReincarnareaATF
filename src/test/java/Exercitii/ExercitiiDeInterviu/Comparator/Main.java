package Exercitii.ExercitiiDeInterviu.Comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        var a= Arrays.asList(33,21,66,70);
        Comparator<Integer> cmp = new Comparator<Integer>() {
            public int compare(Integer a, Integer b){
                if(a%10>b%10)
                    return 1;
                else
                    return 0;
            }
        };
        Collections.sort(a,cmp);
    }
}
