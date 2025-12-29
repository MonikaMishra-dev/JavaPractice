package java8.FunctionalInterfaces.function;

import java.util.ArrayList;
import java.util.function.Function;

public class Demo4 {
    public static void main(String[] args) {
        ArrayList<Employee> list = populate();
        Function<ArrayList<Employee>, Double> function = l -> {
            double total = 0.0;
            for (Employee emp : l) {
                total = total + emp.salary;
            }
            return total;
        };
        System.out.println(function.apply(list));
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
