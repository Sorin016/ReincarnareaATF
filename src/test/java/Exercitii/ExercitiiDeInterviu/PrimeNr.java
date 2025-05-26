package Exercitii.ExercitiiDeInterviu;

import java.util.Scanner;

public class PrimeNr {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        for (int is = 0; is <= n; is++) {
            System.out.println(isPrime(is)+" "+is);
        }
    }
    public static boolean isPrime(int n) {
            if (n < 2)
                return false;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0)
                    return false;
            }
            return true;
    }
}
