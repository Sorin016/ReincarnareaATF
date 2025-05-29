package Exercitii.ExercitiiDeInterviu.String;

import java.text.CollationKey;
import java.util.*;

public class GrupeziNrDeLitereDintroPropozitieSiAratiCeaMaiUtilizataLitera {
    public static void main(String[] args) {
        String n="sorin este cel mai bravo";
        n.replaceAll(" ","");
        Map<Character, Integer> map=new HashMap<>();
        for(char c:n.toCharArray()){
            if(Character.isLetter(c)){
                map.put(c,map.getOrDefault(c,0)+1);
            }
        }
        List<Map.Entry<Character,Integer>> lista=new ArrayList<>(map.entrySet());
        lista.sort(Map.Entry.comparingByValue());
        lista.forEach(System.out::println);
        System.out.println("*************");
        lista.stream().findFirst().ifPresent(System.out::println);
        System.out.println("*************");
        lista.stream().skip(lista.size()-2).findFirst().ifPresent(System.out::println);
    }
}
