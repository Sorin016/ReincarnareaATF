package Exercitii.ExercitiiDeInterviu.Stream.GroupBy;

import java.util.Arrays;
import java.util.stream.Collectors;

public class GrupeazaDupaLungime {
    public static void main(String[] args) {
        var s= Arrays.asList("sorin","adria","tamara","dan","ana");
        s.stream().collect(Collectors.groupingBy(String::length)).forEach((k,v)-> System.out.println(k+" "+v));
    }
}
