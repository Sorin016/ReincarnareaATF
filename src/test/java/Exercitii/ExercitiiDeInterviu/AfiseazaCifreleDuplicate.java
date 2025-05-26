package Exercitii.ExercitiiDeInterviu;

public class AfiseazaCifreleDuplicate {
    public static void main(String[] args) {
        int a[]={1,2,3,4,4,5,5},s=0;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]) {
                    s++;
                    System.out.print(a[i]+" ");
                }
            }
        }

    }
}
