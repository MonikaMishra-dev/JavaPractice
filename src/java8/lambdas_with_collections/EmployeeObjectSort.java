package java8.lambdas_with_collections;

import java.util.ArrayList;


class Employee{
    String name;
    int id;
    Employee(String name,int id){
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Name = "+name+", id = "+id;
    }
}
public class EmployeeObjectSort {
    public static void main(String[] args){
        ArrayList<Employee> list = new ArrayList<>();
        list.add(new Employee("Monika",101));
        list.add(new Employee("Vaani",10));
        list.add(new Employee("Aman",0));
        list.add(new Employee("Durga",14));
        list.add(new Employee("Shreeda",90));
        list.sort((e1,e2)->e1.id>e2.id?1:e1.id<e2.id?-1:0);
        System.out.println(list);
    }
}
