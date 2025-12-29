package java8.FunctionalInterfaces.function;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class Demo5 {
    public static void main(String[] args) {
        ArrayList<Employee> list = populate();
        Predicate<Employee> predicate = emp -> emp.salary < 3500;
        Function<Employee,Employee> function = emp -> {
            emp.salary = emp.salary + 500;
            return emp;
        };
        for(Employee emp : list){
            if(predicate.test(emp)){
                System.out.println("Old salary for "+emp.name+" is "+emp.salary);
                function.apply(emp);
                System.out.println("New salary for "+emp.name+" is "+emp.salary);
            }
        }
    }
    public static ArrayList<Employee> populate() {
        ArrayList<Employee> list = new ArrayList<>();
        list.add(new Employee("Monika", 3000));
        list.add(new Employee("Ashutosh", 4000));
        list.add(new Employee("Aman", 10000));
        list.add(new Employee("Vaani", 10000));
        list.add(new Employee("Shreeda", 9000));
        return list;
    }

}
