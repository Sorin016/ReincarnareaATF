package Exercitii;

public class SumaCifrelorUnuiNr {
    public static void main(String[] args) {
        int a=12345,suma=0;
        while (a>0){
            suma+=a%10;
            a/=10;
        }
        System.out.println(suma);
    }
}
