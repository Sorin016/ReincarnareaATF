package Exercitii.ExercitiiDeInterviu.Stream.SumaElementelor;


import java.util.Arrays;
import java.util.stream.Stream;

public class SumaTuturorNumerelor {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6};
        long ll=Arrays.stream(a).boxed().reduce((c,b)->c+b).get();
        System.out.println(ll);
    }
}
