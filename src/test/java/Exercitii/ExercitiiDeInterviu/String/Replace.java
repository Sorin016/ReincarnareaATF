package Exercitii.ExercitiiDeInterviu.String;

public class Replace {
    public static void main(String[] args) {
        // Declare and initialize a string variable.
        String str = "sorins";
        // Replace all the 'd' characters with 'f' characters.
        String new_str = str.replace('s', 'f');

        // Display the original and modified strings for comparison.
        System.out.println("Original string: " + str);
        System.out.println("New String: " + new_str);
    }
}
