package Exercitii.ExercitiiDeInterviu.String;

public class ValoareaCareSeRepetaDintrunString {
    public static void main(String[] args) {
        String a="abccc";
        int count=0;
        char[] b=a.toCharArray();
        for(int i=0;i<b.length;i++){
            for(int j=i+1;j<b.length;j++){
                if(b[i]==b[j]) {
                    count++;
                    System.out.print(b[i] + " "+count);
                }
            }
        }
    }
}
