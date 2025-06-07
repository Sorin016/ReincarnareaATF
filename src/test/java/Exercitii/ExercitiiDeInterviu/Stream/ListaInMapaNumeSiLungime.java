package Exercitii.ExercitiiDeInterviu.Stream;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListaInMapaNumeSiLungime {
    public static void main(String[] args) {
        var ss= Arrays.asList("sorin","dan","adriana","tamara");
        Map<String,Integer> ll=ss.stream().collect(Collectors.toMap(e->e,String::length));
        ll.forEach((k,v)-> System.out.println(k+" "+v));
    }
}
