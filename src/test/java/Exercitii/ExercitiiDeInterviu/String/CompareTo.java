package Exercitii.ExercitiiDeInterviu.String;

public class CompareTo {
    public static void main(String[] args) {
        //Lexicographical String Comparison
        String s1 = "abc 3";
        String s2 = "abc 2";
        int result=s1.compareTo(s2);
        if(result<0)
            System.out.println(s1 +" este mai mic ca "+s2);
        else if (result==0)
            System.out.println(s1 +" este mai mic ca "+s2);
        else System.out.println(s1 +" este mare mic ca "+s2);
    }
}
