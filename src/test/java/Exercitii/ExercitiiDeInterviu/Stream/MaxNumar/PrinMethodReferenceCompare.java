package Exercitii.ExercitiiDeInterviu.Stream.MaxNumar;

import java.util.Arrays;

public class PrinMethodReferenceCompare {
    public static void main(String[] args) {
        var list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int max = list.stream().max(Integer::compare).get();
        int min = list.stream().min(Integer::compare).orElse(-1);
        System.out.println(max);
        System.out.println(min);
    }
}
