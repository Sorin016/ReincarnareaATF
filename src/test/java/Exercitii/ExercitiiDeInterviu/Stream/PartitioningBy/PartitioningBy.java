package Exercitii.ExercitiiDeInterviu.Stream.PartitioningBy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitioningBy {
    public static void main(String[] args) {
        var a= Arrays.asList(1,2,3,4,5,6,7);
        Map<Boolean, List<Integer>> ll=a.stream().collect(Collectors.partitioningBy(n->n%2==0));
        ll.forEach((k,v)-> System.out.println(k+" "+v));
    }
}
