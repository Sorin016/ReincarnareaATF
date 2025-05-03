package Exercitii;

public class FactorReal {
    public static void main(String[] args) {
        System.out.println(factorReal(4));
        System.out.println(factor(4));
    }
    //recursie
    public static int factorReal(int n){
        if(n<=1)
            return 1;
        return n*factorReal(n-1);
    }
    //iteratic
    public static int factor(int n){
        int i=1;
        for(int o=2;o<=n;o++)
            i*=o;
        return i;
    }
}
