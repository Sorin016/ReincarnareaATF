package Exercitii.ExercitiiDeInterviu;

import java.util.HashMap;
import java.util.Map;

public class ShowMap {
    public static void main(String[] args) {
        var ss=new HashMap<>();
        ss.put(1,"sorin");
        ss.put(2,"adriana");
        ss.put(3,"tamara");
        for(Map.Entry<Object, Object> s:ss.entrySet())
            System.out.println(s);
    }
}
