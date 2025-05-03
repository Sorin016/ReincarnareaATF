package Exercitii;

public class DeCiteOriSeContineOcifraInArray {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,1,2,2};
        int count=0,nr=2;
        for(int jj:a){
            if(jj==nr)
                count++;
        }
        System.out.println(count);
    }
}
