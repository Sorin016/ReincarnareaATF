package Exercitii.ExercitiiDeInterviu.Stream;

import io.cucumber.java.sl.In;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class SumLaNumerelePareDinLista {
    public static void main(String[] args) {
       var a= Arrays.asList(1,2,3,4,5,6,7,8,9);
        System.out.println(a.stream().filter(n->n%2==0).map(x->x*x).reduce((d,b)->d+b).get());
    }
}
