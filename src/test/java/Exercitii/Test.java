package Exercitii;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        var list = Arrays.asList(1, 2, 3, 4, 5);
        var lis = Arrays.asList("sorin", "dan", "dana", "svetlana", "sorin");
        String s = "spunes";
//        Map<Integer,String>li=list.stream().collect(Collectors.toMap(String::length, Function.identity()));
//        li.forEach((k,v)-> System.out.println(k+" "+v));
        Map<Character, Long> lll = s.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        lll.forEach((k,v)-> System.out.println(k+" "+v));

    }

}

