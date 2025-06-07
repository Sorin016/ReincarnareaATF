package Exercitii.ExercitiiDeInterviu.Stream.GroupBy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GrupeazaDupaVirstaPersoanelor {
    public static void main(String[] args) {
        var a=Arrays.asList(new Persoane(28,"sorin"),
                            new Persoane(26,"adriana"),
                            new Persoane(26,"adri"),
                            new Persoane(63,"tamara"));
        Map<Integer, List<Persoane>> grup=a.stream().collect(Collectors.groupingBy(Persoane::getAge));
        grup.forEach((k,v)-> System.out.println(k+" "+v));
    }
}
class Persoane{
    int age;

    @Override
    public String toString() {
        return "Persoane{" +
                "age=" + age +
                ", nume='" + nume + '\'' +
                '}';
    }

    String nume;
    public Persoane(int age,String nume){
        this.age=age;
        this.nume=nume;
    }
    public int getAge(){
        return age;
    }
}
