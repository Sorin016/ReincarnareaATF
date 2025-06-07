package Exercitii.ExercitiiDeInterviu.Stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class Sqrt {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6};
        Arrays.stream(a).boxed().map(e -> Math.sqrt(e)).forEach(System.out::println);
    }
}
