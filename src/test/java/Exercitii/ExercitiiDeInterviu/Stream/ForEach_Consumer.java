package Exercitii.ExercitiiDeInterviu.Stream;

import java.util.Arrays;
import java.util.function.Consumer;

public class ForEach_Consumer {
    public static void main(String[] args) {
        var list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Consumer consumer = new Consumer() {
            public void accept(Object o) {
                System.out.println(o);
            }
        };
        list.forEach(consumer);
    }
}
