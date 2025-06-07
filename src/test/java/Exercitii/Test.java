package Exercitii;

import java.util.*;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        var ss = Arrays.asList(1, 2, 3, 4, 4, 3);
        Set<Integer> seen = new HashSet();
        Set<Integer> duplicates = ss.stream()
                .filter(s -> !seen.add(s)).collect(Collectors.toSet());
        duplicates.forEach(System.out::println);
    }
}

