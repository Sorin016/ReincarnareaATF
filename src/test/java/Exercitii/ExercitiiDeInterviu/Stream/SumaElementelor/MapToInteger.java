package Exercitii.ExercitiiDeInterviu.Stream.SumaElementelor;

import java.util.Arrays;
import java.util.stream.Stream;

public class MapToInteger {
    public static void main(String[] args) {
        var a= Arrays.asList(1,2,3,4,5,6,7,8);
        int sum = a.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
    }
}
