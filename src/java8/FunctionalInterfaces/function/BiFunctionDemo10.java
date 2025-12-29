package java8.FunctionalInterfaces.function;

import java.util.ArrayList;
import java.util.function.BiFunction;

public class BiFunctionDemo10 {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
        BiFunction<String,Double,Employee> f = (name,salary)-> new Employee(name,salary);
        list.add(f.apply("Durga",1000.0));
        list.add(f.apply("Monika",1500.0));
        list.add(f.apply("Vaani",1200.0));
        list.add(f.apply("Shreeda",1600.0));
        list.add(f.apply("Ashutosh",1400.0));
        for (Employee e : list){
            System.out.println("Name : "+e.name+" Salary : "+e.salary);
        }
    }
}
