package Exercitii.ExercitiiDeInterviu.Stream;

import io.cucumber.java.sl.In;

import java.util.Arrays;
import java.util.function.Function;

public class Map_Function {
    public static void main(String[] args) {
        var a= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Function<Integer,Integer> f = new Function<Integer,Integer>() {
            public Integer apply(Integer integer) {
               return integer*2;
            }
        };
        a.stream().filter(e->e%2==0).map(f).forEach(System.out::println);
    }
}
