package java8.FunctionalInterfaces.function;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class Demo3 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        populate(list);
        Function<Student,String> function = student -> {
            if(student.marks>=90)
                return "A+";
            else if(student.marks>=80 && student.marks<90)
                return "A";
            else if(student.marks>=50 && student.marks<80)
                return "B+";
            else if(student.marks>=35 && student.marks<50)
                return "B";
            else
                return "F";
        };
        Predicate<Student> predicate = stu -> stu.marks>70;
        for(Student s : list){
            if(predicate.test(s)){
                System.out.println("Student Name : "+s.name);
                System.out.println("Student Marks : "+s.marks);
                System.out.println("Student Grade : "+function.apply(s));
            }
        }
    }
    public static void populate(ArrayList<Student> list){
        list.add(new Student("Monika",80));
        list.add(new Student("Ashutosh",56));
        list.add(new Student("Aman",45));
        list.add(new Student("Avinash",35));
        list.add(new Student("Daksh",5));
        list.add(new Student("Riya",20));
        list.add(new Student("Shreeda",97));
    }
}
