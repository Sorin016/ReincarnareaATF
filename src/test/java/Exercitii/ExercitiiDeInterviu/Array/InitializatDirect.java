package Exercitii.ExercitiiDeInterviu.Array;

public class InitializatDirect {
    public static void main(String[] args) {
        int a[][]=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
