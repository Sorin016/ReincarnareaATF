package Exercitii.ExercitiiDeInterviu.String;

public class JoinEx1 {
    public static void main(String[] args) {
        String ss="sorin are cea mai frumoasa sotie";
        String[] sa=ss.split(" ");
        for(String s:sa){
            String a = String.join("//", s);
            System.out.println(a+"//");
        }
    }
}
