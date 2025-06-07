package Exercitii.ExercitiiDeInterviu.Stream.PartitioningBy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartBySexulPersoanei {
    public static void main(String[] args) {
        var ss= Arrays.asList(new Person("masculin","sorin"),
                new Person("femenin","adriana"),
                new Person("masculin","dan"),
                new Person("masculin","oleg"));
        Map<Boolean, List<Person>> partitioning=ss.stream()
                .collect(Collectors.partitioningBy(e->e.sex.equals("masculin")));
        partitioning.forEach((k,v)-> System.out.println(k+" "+v));
    }
}
class Person{
    String sex;

    @Override
    public String toString() {
        return "Person{" +
                "sex='" + sex + '\'' +
                ", nume='" + nume + '\'' +
                '}';
    }

    String nume;
    public Person(String sex,String nume){
        this.sex=sex;
        this.nume=nume;
    }
}
