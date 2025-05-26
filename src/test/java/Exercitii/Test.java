package Exercitii;

import java.util.*;

public class Test {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String a = "ana madam level luzer";
        a.replaceAll(" ","");
        Map<Character,Integer> map = new HashMap<>();
        for(char c : a.toCharArray()){
            if(Character.isLetter(c)){
                map.put(c,map.getOrDefault(c,0)+1);
            }
        }
        for(Map.Entry<Character,Integer> gg:map.entrySet())
            System.out.print(gg+" ");
    }
}