package Exercitii;

public class TowDArray {
    public static void main(String[] args) {
        int a[][]=new int[10][10];
        for(int i=2;i<=11;i++){
            for(int j=1;j<=10;j++)
                a[i-2][j-1]=i*j;
        }
        for(int i[]:a){
            for(int j:i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
