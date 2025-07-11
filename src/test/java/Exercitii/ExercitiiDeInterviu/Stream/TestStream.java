package Exercitii.ExercitiiDeInterviu.Stream;

import java.util.*;
import java.util.stream.*;

public class TestStream {
    public static void main(String[] args) {
        var a= Arrays.asList("sorin","dan","tamara","ana","adri");
        Map<Integer, List<String>> map=a.stream()
                .collect(Collectors.groupingBy(String::length,()->new TreeMap<>(Comparator.reverseOrder())
                        ,Collectors.toList()));
       map.forEach((k,v)->{
           System.out.println(k+" "+v);
       });
    }
}
