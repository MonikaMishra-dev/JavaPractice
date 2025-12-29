package java8.FunctionalInterfaces.predicate;

import java.util.function.Predicate;

public class PredicateIsEqualDemo8 {
    public static void main(String[] args) {
        Predicate<String> predicate = Predicate.isEqual("DurgaSoft");
//        System.out.println(predicate.test("DurgaSoft"));
//        System.out.println(predicate.test("Solutions"));

        Predicate<Employee> p = Predicate.isEqual(new Employee("Monika","CEO",1000000,"Pune"));
        Employee emp = new Employee("Riya","Manager",300000,"Hydrebad");
        Employee emp1 = new Employee("Monika","CEO",1000000,"Pune");

        System.out.println(p.test(emp));
        System.out.println(p.test(emp1));
    }
}
