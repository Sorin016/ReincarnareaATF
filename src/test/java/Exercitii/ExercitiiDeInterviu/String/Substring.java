package Exercitii.ExercitiiDeInterviu.String;

public class Substring {
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog.";
        String new_str = str.substring(10, 26);

        // Display the original and the extracted substring for comparison.
        System.out.println("old = " + str);
        System.out.println("new = " + new_str);
    }
}
