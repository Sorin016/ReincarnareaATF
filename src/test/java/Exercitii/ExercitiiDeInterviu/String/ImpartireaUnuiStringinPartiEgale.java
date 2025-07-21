package Exercitii.ExercitiiDeInterviu.String;

import java.util.ArrayList;
import java.util.List;

public class ImpartireaUnuiStringinPartiEgale {
    public static void main(String[] args) {
        String text = "abcdefghijkll";
        List<String> parts = divideString(text, 3);
        System.out.println(parts);
    }

    public static List<String> divideString(String str, int size) {
        List<String> parts = new ArrayList<>();

        if (str.length() % size != 0) {
            throw new IllegalArgumentException("String length must be divisible by size");
        }

        for (int i = 0; i < str.length(); i += size) {
            parts.add(str.substring(i, i + size));
        }
        return parts;
    }
}
