package Exercitii.ExercitiiDeInterviu;

public class SplitString {
    public static void main(String[] args) {
        String a="a_b_c_d";
        String[] b= a.split("_");
        for(String ss:b)
            System.out.print(ss+" ");
    }
}
