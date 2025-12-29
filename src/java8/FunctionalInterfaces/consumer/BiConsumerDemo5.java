package java8.FunctionalInterfaces.consumer;

import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class BiConsumerDemo5 {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
        BiFunction<String,Double,Employee> f = (name,salary) -> new Employee(name,salary);
        list.add(f.apply("Monika",1000.0));
        list.add(f.apply("Ashutosh",2000.0));
        list.add(f.apply("Vaani",10000.0));
        list.add(f.apply("Shreeda",9000.0));
        list.add(f.apply("Aman",14000.0));

        BiConsumer<Employee,Double> c = (emp,increment) -> emp.salary = emp.salary+increment;
        for(Employee e : list){
            c.accept(e,500.0);
        }
        for(Employee e : list)
        {
            System.out.println(e);
        }
    }
}
