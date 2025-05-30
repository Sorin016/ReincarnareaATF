package Exercitii.ExercitiiDeInterviu.Stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class AllMachDacaToateElementeleSatisfacConditiilor {
    public static void main(String[] args) {
        int a[]={12,13};
        boolean stream= Arrays.stream(a).boxed().filter(e->e%1==0).findFirst().isPresent();
        System.out.println(stream);
    }
}
