package Exercitii;

import java.util.*;
import java.util.stream.Stream;

public class Test {
    public int a = 10;

    public static void main(String[] args) {
        Stream<String> streamGenerated =
            Stream.generate(() -> "element").limit(10);
        streamGenerated.forEach(System.out::println);
    }
}
