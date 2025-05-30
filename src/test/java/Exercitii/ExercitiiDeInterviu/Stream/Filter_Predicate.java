package Exercitii.ExercitiiDeInterviu.Stream;

import java.util.Arrays;
import java.util.function.Predicate;

public class Filter_Predicate {
    public static void main(String[] args) {
        var a= Arrays.asList(1,2,3,4,5,6,7,8,9);
        Predicate predicate = new Predicate<Integer>(){
            @Override
            public boolean test(Integer o) {
                if(o%2==0)
                    return true;
                return false;
            }
        };
        var aa=a.stream().filter(predicate);
        System.out.println(aa.toList());
    }
}
