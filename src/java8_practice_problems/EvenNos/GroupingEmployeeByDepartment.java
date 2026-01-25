package java8_practice_problems.EvenNos;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingEmployeeByDepartment {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1, "Monika", "CSE"));
        list.add(new Employee(2, "Shreeda", "IT"));
        list.add(new Employee(3, "Ashutosh", "ECE"));
        list.add(new Employee(4, "Aman", "CSE"));
        list.add(new Employee(5, "Riya", "IT"));


        Map<String, List<Employee>> result = list.stream().collect(Collectors.groupingBy(Employee::getEmployeeDepartment));
        result.forEach((dept, empList) -> System.out.println(dept + " -> " + empList));
    }
}
