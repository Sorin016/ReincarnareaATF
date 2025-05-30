package Exercitii.ExercitiiDeInterviu.Stream;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Join {
    public static void main(String[] args) {
        String[] ss={"sorin","dan","adriana","tamara"};
        Stream<String> ss1= Stream.of(ss).collect(Collectors.joining(", ")).lines();
        ss1.forEach(System.out::println);
    }
}
