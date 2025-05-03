package Exercitii;

public class DivizoriiUnuiNr {

        public static void main(String[] args) {
            int n = 14 ;
            System.out.print("Divizori ai lui " + n + ": ");
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }

