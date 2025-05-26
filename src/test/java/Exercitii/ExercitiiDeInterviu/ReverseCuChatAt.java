package Exercitii.ExercitiiDeInterviu;

public class ReverseCuChatAt {
    public static void main(String[] args) {
        String a = "ABCDEF";
        String b = "";
        for (int i = 0; i < a.length(); i++)
            b = a.charAt(i) + b;
        System.out.println(b);
    }
}
