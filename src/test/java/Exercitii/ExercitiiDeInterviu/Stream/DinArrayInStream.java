package Exercitii.ExercitiiDeInterviu.Stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class DinArrayInStream {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        Stream<Integer> full = Arrays.stream(a).boxed();
        Stream<Integer> part = Arrays.stream(a, 1, 4).boxed();
        part.forEach(System.out::println);
    }
}

