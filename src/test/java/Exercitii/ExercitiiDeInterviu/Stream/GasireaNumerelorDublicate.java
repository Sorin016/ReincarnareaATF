package Exercitii.ExercitiiDeInterviu.Stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class GasireaNumerelorDublicate {
    public static void main(String[] args) {
        var a= Arrays.asList(1,2,3,3,2,4);
        Set set=new HashSet();
        Set ss=a.stream().filter(e->!set.add(e)).collect(Collectors.toSet());
        ss.forEach(System.out::println);
    }
}
