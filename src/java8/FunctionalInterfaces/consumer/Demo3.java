package java8.FunctionalInterfaces.consumer;

import java.util.ArrayList;
import java.util.function.*;

public class Demo3 {
    public static void main(String[] args) {
        ArrayList<Student>  list = new ArrayList<>();
        populate(list);
        Predicate<Student> predicate = student -> student.marks >= 60;
        Function<Student,String> function = student -> {
            if(student.marks>=90)
                return "A+";
            else if(student.marks>=80)
                return "A";
            else if(student.marks>=50)
                return "B+";
            else if(student.marks>=35)
                return "B";
            else
                return "F";
        };
        Consumer<Student> consumer = student -> {
            System.out.println("Name of the Student : "+student.name);
            System.out.println("Marks of the Student : "+student.marks);
            System.out.println("Grade of the Student : "+function.apply(student));
        };
        for(Student student : list){
            if(predicate.test(student))
            {
                consumer.accept(student);
            }
        }
    }
    public static void populate(ArrayList<Student> list){
        list.add(new Student("Monika",70));
        list.add(new Student("Vaani",60));
        list.add(new Student("Shreeda",90));
        list.add(new Student("Aman",80));
        list.add(new Student("Ashutosh",50));
    }
}