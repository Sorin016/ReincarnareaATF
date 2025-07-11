package Exercitii.ExercitiiDeInterviu.Array;

public class SortatreaDescrescatorAMatricei {
    public static void main(String[] args) {
        int a[]={5,2,5,6,1,6,78,6,13,9};
        for(int i=0;i<a.length;i++){
            for(int j=1;j<a.length;j++){
                if(a[j]>a[j-1]){
                    int temp=a[j];
                    a[j]=a[j-1];
                    a[j-1]=temp;
                }
            }
        }
        for(int ss:a)
            System.out.print(ss+" ");
    }
}
