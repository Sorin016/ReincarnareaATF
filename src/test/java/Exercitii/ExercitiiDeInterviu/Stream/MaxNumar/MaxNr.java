package Exercitii.ExercitiiDeInterviu.Stream.MaxNumar;

import java.util.Arrays;
import java.util.stream.Stream;

public class MaxNr {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8};
        Stream<Integer> max= Arrays.stream(a).boxed().skip(a.length-1);
        max.forEach(System.out::println);
    }
}
