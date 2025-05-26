package Exercitii.ExercitiiDeInterviu;

public class Regex {
    public static void main(String[] args) {
        String s="022-23-45_221";
        String d=s.replace("-","").replace("_","");
        System.out.println(d);
        String s1="022-$2*3-4(5_2)2#1@";
        System.out.println(s1.replaceAll("[^a-zA-Z0-9]",""));
    }
}
