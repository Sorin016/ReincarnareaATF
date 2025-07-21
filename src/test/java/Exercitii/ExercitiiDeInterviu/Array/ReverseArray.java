package Exercitii.ExercitiiDeInterviu.Array;

public class ReverseArray {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int b[]=new int[a.length];
        int s=0;
        for(int i=a.length-1;i>=0;i--) {
            b[s] = a[i];
            s++;
        }
        for(int i:b)
            System.out.print(i+" ");
    }
}
