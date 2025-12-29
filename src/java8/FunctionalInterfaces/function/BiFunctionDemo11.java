package java8.FunctionalInterfaces.function;

import java.util.function.BiFunction;

public class BiFunctionDemo11 {
    public static void main(String[] args) {
        Employee1 emp = new Employee1(101,"Monika",2500);
        Timesheet timesheet = new Timesheet(101,25);
        BiFunction<Employee1,Timesheet,Double> f = (e,t) -> e.dailyWages*t.days;
        System.out.println("The monthly salary of Monika is : "+f.apply(emp,timesheet));
    }
}
