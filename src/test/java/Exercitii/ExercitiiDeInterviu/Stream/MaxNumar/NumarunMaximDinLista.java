package Exercitii.ExercitiiDeInterviu.Stream.MaxNumar;

import java.util.Arrays;
import java.util.stream.Stream;

public class NumarunMaximDinLista {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        int stream = Arrays.stream(a).boxed().max((s, b) -> s.compareTo(b)).get();
        System.out.println(stream);
    }
}
