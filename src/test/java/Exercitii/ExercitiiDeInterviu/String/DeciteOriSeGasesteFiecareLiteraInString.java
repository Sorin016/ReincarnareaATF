package Exercitii.ExercitiiDeInterviu.String;

import java.util.HashMap;
import java.util.Map;

public class DeciteOriSeGasesteFiecareLiteraInString {
    public static void main(String[] args) {
        String a="salut numele meu 11 este Sorin si sunt bucuros sa fiu aici";
        a.replaceAll(" ","");
        Map<Character,Integer> map=new HashMap<Character,Integer>();
        for(char c:a.toCharArray()){
            if(Character.isLetter(c)){
                map.put(c,map.getOrDefault(c,0)+1);
            }
        }
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            System.out.print(entry+" ");
        }
    }
}
