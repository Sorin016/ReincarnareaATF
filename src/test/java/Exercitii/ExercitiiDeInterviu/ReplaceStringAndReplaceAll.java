package Exercitii.ExercitiiDeInterviu;

public class ReplaceStringAndReplaceAll {
    public static void main(String[] args) {
        String a="s0rin este ";
        String b=a.replace("0","o");
        System.out.println(b);

        String c="sorin$este#cel)mai@bun";
        String d=c.replaceAll("[^A-Za-z0-9\\s]"," ");
        System.out.println(d);
    }
}
