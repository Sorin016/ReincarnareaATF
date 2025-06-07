package Exercitii.ExercitiiDeInterviu.Stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class NumarulDeAparitieAUnuiCuvint {
    public static void main(String[] args) {
        var a=Arrays.asList("sorin","sorin","adri","matahale");
        System.out.println(a.stream().filter(e->e.equals("sorin")).count());
    }
}
