package Exercitii.ExercitiiDeInterviu.Comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class CompareObjectValues {
    public static void main(String[] args) {
        var a= Arrays.asList(new Student(28,"Sorin"),new Student(26,"Adriana"));
        Comparator<Student> comparator=new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
               if(o1.age<o2.age)
                   return 1;
               else
                 return -1;
            }
        };

        Collections.sort(a,comparator);
        System.out.println("descrescatori: ");
        for(Student student:a)
            System.out.println(student);
        System.out.println("crescator :");
        Comparator<Student> comparator1=(o1,o2)->Integer.compare(o1.age,o2.age);
        a.forEach(System.out::println);
    }
}
class Student{
    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    int age;
    String name;
    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
