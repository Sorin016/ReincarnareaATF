package Exercitii.ExercitiiDeInterviu.Stream;

import java.util.List;
import java.util.stream.Collectors;

public class ConcateneazăLitereleSiInverseazăRezultatul {
    public static void main(String[] args) {
        String reversed = new StringBuilder(List.of("a", "b", "c").stream()
                .collect(Collectors.joining())).reverse().toString();
        System.out.println(reversed);
    }
}
