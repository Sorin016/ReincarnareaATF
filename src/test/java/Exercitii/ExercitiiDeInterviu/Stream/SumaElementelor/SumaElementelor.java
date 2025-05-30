package Exercitii.ExercitiiDeInterviu.Stream.SumaElementelor;

import java.util.Arrays;

public class SumaElementelor {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int list= Arrays.stream(a).boxed().reduce(0, (x, y) -> x+y);
        System.out.println(list);
    }
}
