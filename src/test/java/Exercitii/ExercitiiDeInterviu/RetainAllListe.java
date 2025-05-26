package Exercitii.ExercitiiDeInterviu;

import java.util.ArrayList;
import java.util.HashSet;

public class RetainAllListe {
    public static void main(String[] args) {
        var ss=new HashSet<>();
        ss.add(11);
        ss.add(12);
        ss.add(13);
        ss.add(14);
        var dd =new ArrayList<>();
        dd.add(11);
        dd.add(12);
        dd.add(13);
        dd.add(15);
        dd.add(16);
        ss.retainAll(dd);
        System.out.println(ss);
    }
}
