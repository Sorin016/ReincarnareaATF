package Exercitii.ExercitiiDeInterviu.Stream;

import java.util.Arrays;
import java.util.Collection;

public class FlapMap {
    public static void main(String[] args) {
        var ss= Arrays.asList(Arrays.asList("banane","mere"),Arrays.asList("morcov","cartoafe"));
        ss.stream().flatMap(Collection::stream).toList().forEach(System.out::println);
    }
}
