package Exercitii.ExercitiiDeInterviu.String;

public class ContentEquals {
    public static void main(String[] args) {
        String s1 = "hello";
        StringBuilder sb = new StringBuilder("hello");
        String a="sorin";
        String b=new String("sorin");

        System.out.println(a.contentEquals(b));
        System.out.println(s1.contentEquals(sb)); // true
        System.out.println(s1.equals(sb));        // false ❌
    }
}
