package Exercitii.ExercitiiDeInterviu.String;

public class StringFromCharacterArray {
    public static void main(String[] args) {
        char[]s={'1','2','3'};
        String b=String.copyValueOf(s);
        String ss=new String(s);
        System.out.println(ss);
        Integer c=Integer.parseInt(b);
        System.out.println(b);
    }
}
