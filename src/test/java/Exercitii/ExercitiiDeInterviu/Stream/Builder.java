package Exercitii.ExercitiiDeInterviu.Stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class Builder {
    public static void main(String[] args) {
        var a= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        var b= Arrays.asList("sorin","adri");

        Stream.Builder ss=Stream.builder();
        for(Object o:a)
            ss.add(o);
        for(Object o:b)
            ss.add(o);
        ss.build().forEach(System.out::println);
    }
}
