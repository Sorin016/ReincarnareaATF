package Exercitii;

public class ValoareaMaximaDintrunArray {
    public static void main(String[] args) {
        int a[]={1,2,3,7,51,6,3};
        int max=a[0];
        for(int i=0;i<a.length;i++) {
            if (max < a[i])
                max=a[i];
        }
        System.out.println(max);
    }
}
