package Exercitii.ExercitiiDeInterviu.Comparator;

import jdk.dynalink.linker.LinkerServices;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Comparables {
    public static void main(String[] args) {
        List<Student> list= Arrays.asList(new Student(23,"sorin"),new Student(45,"adri"));
        list.forEach(System.out::println);
    }
}
class Students implements Comparable<Student> {
    int age;
    String name;
    public Students(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(Student o) {
        if(this.age > o.age)
            return 1;
        return -1;
    }
}
