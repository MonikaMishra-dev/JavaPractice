package java8.FunctionalInterfaces.predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateJoiningDemo7 {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
        list.add(new Employee("Monika","Team Leader",5000000.0,"Pune"));
        list.add(new Employee("Ashutosh","Assistant Vice President",10000000.0,"Pune"));
        list.add(new Employee("Avinash","Manager",3000000.0,"Bangalore"));
        list.add(new Employee("Aman","Manager",5000000.0,"Delhi"));
        list.add(new Employee("Gourav","Consultant",4000000.0,"Bangalore"));
        list.add(new Employee("Riya","Manager",6000000.0,"Delhi"));
        list.add(new Employee("Durga","Team Leader",5000000.0,"Bangalore"));

        Predicate<Employee> predicate1 = emp -> emp.designation.equals("Manager");
//        display(predicate1,list);

        Predicate<Employee> predicate2 = emp -> emp.city.equals("Bangalore");
//        display(predicate2,list);

        Predicate<Employee> predicate3 = emp -> emp.salary<5000000;
//        display(predicate3,list);

//        display(predicate1.and(predicate2),list);
//        display(predicate1.or(predicate3),list);
        display(predicate1.negate(),list);


    }
    public static void display(Predicate<Employee> predicate,ArrayList<Employee> list){
        for(Employee emp : list){
            if(predicate.test(emp))
                System.out.println(emp);
        }
    }
}
