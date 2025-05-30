package Exercitii.ExercitiiDeInterviu.Liamda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortareaUneiListeDupaLungimeacuvintelorInLista {
    public static void main(String[] args) {
        var list= Arrays.asList("sorin","dan","tamara","adriana");
        list.sort((s1, s2) -> s1.length() - s2.length());
        list.stream().map(e->e.length()).skip(list.size()-(list.size()-1)).forEach(System.out::println);
        System.out.println(list);
    }
}
