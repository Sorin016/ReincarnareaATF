package Exercitii;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        var ss = Arrays.asList(1, 2, 3, 4, 4, 3);
        Set<Integer> seen = new HashSet();
        Set<Integer> duplicates = ss.stream()
                .filter(s -> !seen.add(s)).collect(Collectors.toSet());
        duplicates.forEach(System.out::println);
    }
    public static int a=10;
    int d=10;
    public void afisare(){
        int c=10;
        int b=c+a;
    }
    //daca ai metoda statica dar variabila non statica apare greseala
    //dar invers merge
    //ca sa mearga trebue sa creezi variabila care aparine clasei si peurma sa apelezi
    public static void afis(Test d){
        int e=d.d+10;
    }

}
